package com.google.gson.reflect;

import com.google.gson.internal.C$Gson$Types;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes6.dex */
public class TypeToken<T> {
    private final int hashCode;
    private final Class<? super T> rawType;
    private final Type type;

    public TypeToken() {
        Type r02 = getTypeTokenTypeArgument();
        this.type = r02;
        this.rawType = (Class<? super T>) C$Gson$Types.getRawType(r02);
        this.hashCode = r02.hashCode();
    }

    private static AssertionError buildUnexpectedTypeError(Type r4, Class<?>... r5) {
        StringBuilder r02 = new StringBuilder("Unexpected type. Expected one of: ");
        int r1 = r5.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r02.append(r5[r2].getName());
        r02.append(", ");
        r2 = r2 + 1;
        goto L3
    L5:
        r02.append("but got: ");
        r02.append(r4.getClass().getName());
        r02.append(", for type token: ");
        r02.append(r4.toString());
        r02.append('.');
        return new AssertionError(r02.toString());
    }

    public static TypeToken<?> get(Type r1) {
        return new TypeToken(r1);
    }

    public static TypeToken<?> getArray(Type r1) {
        return new TypeToken(C$Gson$Types.arrayOf(r1));
    }

    public static TypeToken<?> getParameterized(Type r11, Type... r12) {
        Objects.requireNonNull(r11);
        Objects.requireNonNull(r12);
        if ((r11 instanceof Class) == false) goto L21;
        Class r02 = (Class) r11;
        TypeVariable<Class<T>>[] r1 = r02.getTypeParameters();
        int r2 = r1.length;
        int r3 = r12.length;
        if (r3 != r2) goto L19;
        int r32 = 0;
    L7:
        if (r32 >= r2) goto L17;
        Type r4 = r12[r32];
        Class<?> r5 = C$Gson$Types.getRawType(r4);
        TypeVariable<Class<T>> r6 = r1[r32];
        Type[] r7 = r6.getBounds();
        int r8 = r7.length;
        int r9 = 0;
    L9:
        if (r9 >= r8) goto L15;
        if (C$Gson$Types.getRawType(r7[r9]).isAssignableFrom(r5) == false) goto L14;
        r9 = r9 + 1;
        goto L9
    L14:
        throw new IllegalArgumentException("Type argument " + r4 + " does not satisfy bounds for type variable " + r6 + " declared by " + r11);
    L15:
        r32 = r32 + 1;
        goto L7
    L17:
        return new TypeToken(C$Gson$Types.newParameterizedTypeWithOwner(null, r11, r12));
    L19:
        throw new IllegalArgumentException(r02.getName() + " requires " + r2 + " type arguments, but got " + r3);
    L21:
        throw new IllegalArgumentException("rawType must be of type Class, but was " + r11);
    }

    private Type getTypeTokenTypeArgument() {
        Type r02 = getClass().getGenericSuperclass();
        if ((r02 instanceof ParameterizedType) == false) goto L8;
        ParameterizedType r03 = (ParameterizedType) r02;
        if (r03.getRawType() != TypeToken.class) goto L12;
        return C$Gson$Types.canonicalize(r03.getActualTypeArguments()[0]);
    L12:
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    L8:
        if (r02 != TypeToken.class) goto L12;
        throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
    }

    private static boolean matches(Type r1, Type r2, Map<String, Type> r3) {
        if (r2.equals(r1) == false) goto L5;
        return true;
    L5:
        if ((r1 instanceof TypeVariable) == true) goto L7;
        return false;
    L7:
        if (r2.equals(r3.get(((TypeVariable) r1).getName())) == true) goto L14;
        return false;
    L14:
        return true;
    }

    private static boolean typeEquals(ParameterizedType r4, ParameterizedType r5, Map<String, Type> r6) {
        if (r4.getRawType().equals(r5.getRawType()) == false) goto L13;
        Type[] r42 = r4.getActualTypeArguments();
        Type[] r52 = r5.getActualTypeArguments();
        int r02 = 0;
    L6:
        if (r02 >= r42.length) goto L11;
        if (matches(r42[r02], r52[r02], r6) == false) goto L9;
        r02 = r02 + 1;
        goto L6
    L9:
        return false;
    L11:
        return true;
    L13:
        return false;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof TypeToken) == true) goto L5;
        return false;
    L5:
        if (C$Gson$Types.equals(this.type, ((TypeToken) r2).type) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final Class<? super T> getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    @Deprecated
    public boolean isAssignableFrom(Class<?> r1) {
        return isAssignableFrom(r1);
    }

    public final String toString() {
        return C$Gson$Types.typeToString(this.type);
    }

    public static <T> TypeToken<T> get(Class<T> r1) {
        return new TypeToken(r1);
    }

    @Deprecated
    public boolean isAssignableFrom(Type r5) {
        if (r5 != null) goto L6;
        return false;
    L6:
        if (this.type.equals(r5) == false) goto L8;
        return true;
    L8:
        Type r1 = this.type;
        if ((r1 instanceof Class) == false) goto L13;
        return this.rawType.isAssignableFrom(C$Gson$Types.getRawType(r5));
    L13:
        if ((r1 instanceof ParameterizedType) == false) goto L17;
        return isAssignableFrom(r5, (ParameterizedType) r1, new HashMap());
    L17:
        if ((r1 instanceof GenericArrayType) == false) goto L25;
        if (this.rawType.isAssignableFrom(C$Gson$Types.getRawType(r5)) == true) goto L21;
    L23:
        return false;
    L21:
        if (isAssignableFrom(r5, (GenericArrayType) this.type) == false) goto L23;
        return true;
    L25:
        throw buildUnexpectedTypeError(r1, new Class[]{Class.class, ParameterizedType.class, GenericArrayType.class});
    }

    private TypeToken(Type r2) {
        Objects.requireNonNull(r2);
        Type r22 = C$Gson$Types.canonicalize(r2);
        this.type = r22;
        this.rawType = (Class<? super T>) C$Gson$Types.getRawType(r22);
        this.hashCode = r22.hashCode();
    }

    @Deprecated
    public boolean isAssignableFrom(TypeToken<?> r1) {
        return isAssignableFrom(r1.getType());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r1v9 */
    private static boolean isAssignableFrom(Type r1, GenericArrayType r2) {
        Type r22 = r2.getGenericComponentType();
        if ((r22 instanceof ParameterizedType) == true) goto L5;
        return true;
    L5:
        if ((r1 instanceof GenericArrayType) == false) goto L8;
        r1 = ((GenericArrayType) r1).getGenericComponentType();
    L14:
        return isAssignableFrom(r1, (ParameterizedType) r22, new HashMap());
    L8:
        if ((r1 instanceof Class) == false) goto L14;
        r1 = (Class) r1;
    L11:
        if (r1.isArray() == false) goto L14;
        r1 = r1.getComponentType();
        goto L11
    }

    private static boolean isAssignableFrom(Type r9, ParameterizedType r10, Map<String, Type> r11) {
        int r02 = 0;
        if (r9 != null) goto L6;
        return false;
    L6:
        if (r10.equals(r9) == false) goto L8;
        return true;
    L8:
        Class<?> r1 = C$Gson$Types.getRawType(r9);
        if ((r9 instanceof ParameterizedType) == false) goto L11;
        ParameterizedType r92 = (ParameterizedType) r9;
    L12:
        if (r92 == null) goto L24;
        Type[] r3 = r92.getActualTypeArguments();
        TypeVariable<Class<?>>[] r4 = r1.getTypeParameters();
        int r5 = 0;
    L15:
        if (r5 >= r3.length) goto L22;
        Type r6 = r3[r5];
        TypeVariable<Class<?>> r7 = r4[r5];
    L18:
        if ((r6 instanceof TypeVariable) == false) goto L20;
        r6 = r11.get(((TypeVariable) r6).getName());
        goto L18
    L20:
        r11.put(r7.getName(), r6);
        r5 = r5 + 1;
        goto L15
    L22:
        if (typeEquals(r92, r10, r11) == false) goto L24;
        return true;
    L24:
        Type[] r93 = r1.getGenericInterfaces();
        int r32 = r93.length;
    L25:
        if (r02 >= r32) goto L31;
        if (isAssignableFrom(r93[r02], r10, new HashMap(r11)) == true) goto L28;
        r02 = r02 + 1;
        goto L25
    L28:
        return true;
    L31:
        return isAssignableFrom(r1.getGenericSuperclass(), r10, new HashMap(r11));
    L11:
        r92 = null;
        goto L12
    }
}
