package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Properties;

/* renamed from: com.google.gson.internal.$Gson$Types, reason: invalid class name */
/* loaded from: classes6.dex */
public final class C$Gson$Types {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final Type[] EMPTY_TYPE_ARRAY = null;

    /* renamed from: com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl */
    public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        public GenericArrayTypeImpl(Type r1) {
            Objects.requireNonNull(r1);
            this.componentType = C$Gson$Types.canonicalize(r1);
        }

        public boolean equals(Object r2) {
            if ((r2 instanceof GenericArrayType) == true) goto L5;
            return false;
        L5:
            if (C$Gson$Types.equals(this, (GenericArrayType) r2) == false) goto L10;
            return true;
        L10:
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.componentType;
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public String toString() {
            return C$Gson$Types.typeToString(this.componentType) + "[]";
        }
    }

    /* renamed from: com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl */
    public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type ownerType;
        private final Type rawType;
        private final Type[] typeArguments;

        public ParameterizedTypeImpl(Type r5, Type r6, Type... r7) {
            Objects.requireNonNull(r6);
            int r1 = 0;
            if ((r6 instanceof Class) == false) goto L16;
            Class r02 = (Class) r6;
            boolean r3 = true;
            if (Modifier.isStatic(r02.getModifiers()) == false) goto L7;
        L10:
            boolean r03 = true;
        L11:
            if (r5 != null) goto L15;
            if (r03 == true) goto L15;
            r3 = false;
        L15:
            C$Gson$Preconditions.checkArgument(r3);
            goto L16
        L7:
            if (r02.getEnclosingClass() == null) goto L10;
            r03 = false;
        L16:
            if (r5 != null) goto L18;
            Type r52 = null;
        L19:
            this.ownerType = r52;
            this.rawType = C$Gson$Types.canonicalize(r6);
            Type[] r53 = (Type[]) r7.clone();
            this.typeArguments = r53;
            int r54 = r53.length;
        L20:
            if (r1 >= r54) goto L22;
            Objects.requireNonNull(this.typeArguments[r1]);
            C$Gson$Types.checkNotPrimitive(this.typeArguments[r1]);
            Type[] r62 = this.typeArguments;
            r62[r1] = C$Gson$Types.canonicalize(r62[r1]);
            r1 = r1 + 1;
            goto L20
        L22:
            return;
        L18:
            r52 = C$Gson$Types.canonicalize(r5);
            goto L19
        }

        private static int hashCodeOrZero(Object r02) {
            if (r02 != null) goto L4;
            return 0;
        L4:
            return r02.hashCode();
        }

        public boolean equals(Object r2) {
            if ((r2 instanceof ParameterizedType) == true) goto L5;
            return false;
        L5:
            if (C$Gson$Types.equals(this, (ParameterizedType) r2) == false) goto L10;
            return true;
        L10:
            return false;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.typeArguments.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.ownerType;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.rawType;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode()) ^ hashCodeOrZero(this.ownerType);
        }

        public String toString() {
            int r02 = this.typeArguments.length;
            if (r02 == 0) goto L5;
            StringBuilder r1 = new StringBuilder((r02 + 1) * 30);
            r1.append(C$Gson$Types.typeToString(this.rawType));
            r1.append("<");
            r1.append(C$Gson$Types.typeToString(this.typeArguments[0]));
            int r2 = 1;
        L7:
            if (r2 >= r02) goto L9;
            r1.append(", ");
            r1.append(C$Gson$Types.typeToString(this.typeArguments[r2]));
            r2 = r2 + 1;
            goto L7
        L9:
            r1.append(">");
            return r1.toString();
        L5:
            return C$Gson$Types.typeToString(this.rawType);
        }
    }

    /* renamed from: com.google.gson.internal.$Gson$Types$WildcardTypeImpl */
    public static final class WildcardTypeImpl implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type lowerBound;
        private final Type upperBound;

        public WildcardTypeImpl(Type[] r4, Type[] r5) {
            boolean r2 = true;
            if (r5.length > 1) goto L5;
            boolean r02 = true;
        L6:
            C$Gson$Preconditions.checkArgument(r02);
            if (r4.length != 1) goto L9;
            boolean r03 = true;
        L10:
            C$Gson$Preconditions.checkArgument(r03);
            if (r5.length != 1) goto L18;
            Objects.requireNonNull(r5[0]);
            C$Gson$Types.checkNotPrimitive(r5[0]);
            if (r4[0] == Object.class) goto L16;
            r2 = false;
        L16:
            C$Gson$Preconditions.checkArgument(r2);
            this.lowerBound = C$Gson$Types.canonicalize(r5[0]);
            this.upperBound = Object.class;
            return;
        L18:
            Objects.requireNonNull(r4[0]);
            C$Gson$Types.checkNotPrimitive(r4[0]);
            this.lowerBound = null;
            this.upperBound = C$Gson$Types.canonicalize(r4[0]);
            return;
        L9:
            r03 = false;
            goto L10
        L5:
            r02 = false;
            goto L6
        }

        public boolean equals(Object r2) {
            if ((r2 instanceof WildcardType) == true) goto L5;
            return false;
        L5:
            if (C$Gson$Types.equals(this, (WildcardType) r2) == false) goto L10;
            return true;
        L10:
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type r02 = this.lowerBound;
            if (r02 == null) goto L7;
            return new Type[]{r02};
        L7:
            return C$Gson$Types.EMPTY_TYPE_ARRAY;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.upperBound};
        }

        public int hashCode() {
            Type r02 = this.lowerBound;
            if (r02 == null) goto L5;
            int r03 = r02.hashCode() + 31;
        L7:
            return r03 ^ (this.upperBound.hashCode() + 31);
        L5:
            r03 = 1;
            goto L7
        }

        public String toString() {
            if (this.lowerBound == null) goto L7;
            return "? super " + C$Gson$Types.typeToString(this.lowerBound);
        L7:
            if (this.upperBound != Object.class) goto L11;
            return "?";
        L11:
            return "? extends " + C$Gson$Types.typeToString(this.upperBound);
        }
    }

    static {
        EMPTY_TYPE_ARRAY = new Type[0];
    }

    private C$Gson$Types() {
        throw new UnsupportedOperationException();
    }

    public static GenericArrayType arrayOf(Type r1) {
        return new GenericArrayTypeImpl(r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl] */
    public static Type canonicalize(Type r3) {
        if ((r3 instanceof Class) == false) goto L10;
        Class r32 = (Class) r3;
        if (r32.isArray() == false) goto L8;
        r32 = new GenericArrayTypeImpl(canonicalize(r32.getComponentType()));
    L8:
        return r32;
    L10:
        if ((r3 instanceof ParameterizedType) == false) goto L14;
        ParameterizedType r33 = (ParameterizedType) r3;
        return new ParameterizedTypeImpl(r33.getOwnerType(), r33.getRawType(), r33.getActualTypeArguments());
    L14:
        if ((r3 instanceof GenericArrayType) == false) goto L18;
        return new GenericArrayTypeImpl(((GenericArrayType) r3).getGenericComponentType());
    L18:
        if ((r3 instanceof WildcardType) == false) goto L21;
        WildcardType r34 = (WildcardType) r3;
        return new WildcardTypeImpl(r34.getUpperBounds(), r34.getLowerBounds());
    L21:
        return r3;
    }

    public static void checkNotPrimitive(Type r1) {
        if ((r1 instanceof Class) == true) goto L5;
    L8:
        boolean r12 = true;
    L9:
        C$Gson$Preconditions.checkArgument(r12);
        return;
    L5:
        if (((Class) r1).isPrimitive() == false) goto L8;
        r12 = false;
        goto L9
    }

    private static Class<?> declaringClassOf(TypeVariable<?> r1) {
        GenericDeclaration r12 = r1.getGenericDeclaration();
        if ((r12 instanceof Class) == true) goto L5;
        return null;
    L5:
        return (Class) r12;
    }

    private static boolean equal(Object r02, Object r1) {
        return Objects.equals(r02, r1);
    }

    public static boolean equals(Type r4, Type r5) {
        if (r4 != r5) goto L6;
        return true;
    L6:
        if ((r4 instanceof Class) == false) goto L10;
        return r4.equals(r5);
    L10:
        if ((r4 instanceof ParameterizedType) == false) goto L23;
        if ((r5 instanceof ParameterizedType) == true) goto L14;
        return false;
    L14:
        ParameterizedType r42 = (ParameterizedType) r4;
        ParameterizedType r52 = (ParameterizedType) r5;
        if (equal(r42.getOwnerType(), r52.getOwnerType()) == true) goto L17;
    L21:
        return false;
    L17:
        if (r42.getRawType().equals(r52.getRawType()) == false) goto L21;
        if (Arrays.equals(r42.getActualTypeArguments(), r52.getActualTypeArguments()) == false) goto L21;
        return true;
    L23:
        if ((r4 instanceof GenericArrayType) == false) goto L30;
        if ((r5 instanceof GenericArrayType) == true) goto L28;
        return false;
    L28:
        return equals(((GenericArrayType) r4).getGenericComponentType(), ((GenericArrayType) r5).getGenericComponentType());
    L30:
        if ((r4 instanceof WildcardType) == false) goto L41;
        if ((r5 instanceof WildcardType) == true) goto L34;
        return false;
    L34:
        WildcardType r43 = (WildcardType) r4;
        WildcardType r53 = (WildcardType) r5;
        if (Arrays.equals(r43.getUpperBounds(), r53.getUpperBounds()) == true) goto L37;
    L39:
        return false;
    L37:
        if (Arrays.equals(r43.getLowerBounds(), r53.getLowerBounds()) == false) goto L39;
        return true;
    L41:
        if ((r4 instanceof TypeVariable) == true) goto L43;
    L50:
        return false;
    L43:
        if ((r5 instanceof TypeVariable) == true) goto L45;
        return false;
    L45:
        TypeVariable r44 = (TypeVariable) r4;
        TypeVariable r54 = (TypeVariable) r5;
        if (r44.getGenericDeclaration() != r54.getGenericDeclaration()) goto L50;
        if (r44.getName().equals(r54.getName()) == false) goto L50;
        return true;
    }

    public static Type getArrayComponentType(Type r1) {
        if ((r1 instanceof GenericArrayType) == false) goto L7;
        return ((GenericArrayType) r1).getGenericComponentType();
    L7:
        return ((Class) r1).getComponentType();
    }

    public static Type getCollectionElementType(Type r1, Class<?> r2) {
        Type r12 = getSupertype(r1, r2, Collection.class);
        if ((r12 instanceof ParameterizedType) == true) goto L5;
        return Object.class;
    L5:
        return ((ParameterizedType) r12).getActualTypeArguments()[0];
    }

    private static Type getGenericSupertype(Type r3, Class<?> r4, Class<?> r5) {
        if (r5 != r4) goto L5;
        return r3;
    L5:
        if (r5.isInterface() == false) goto L18;
        Class<?>[] r32 = r4.getInterfaces();
        int r02 = r32.length;
        int r1 = 0;
    L7:
        if (r1 >= r02) goto L18;
        Class<?> r2 = r32[r1];
        if (r2 == r5) goto L11;
        if (r5.isAssignableFrom(r2) == true) goto L15;
        r1 = r1 + 1;
        goto L7
    L15:
        return getGenericSupertype(r4.getGenericInterfaces()[r1], r32[r1], r5);
    L11:
        return r4.getGenericInterfaces()[r1];
    L18:
        if (r4.isInterface() == false) goto L20;
    L30:
        return r5;
    L20:
        if (r4 == Object.class) goto L30;
        Class<? super Object> r33 = r4.getSuperclass();
        if (r33 == r5) goto L24;
        if (r5.isAssignableFrom(r33) == true) goto L28;
        r4 = r33;
        goto L20
    L28:
        return getGenericSupertype(r4.getGenericSuperclass(), r33, r5);
    L24:
        return r4.getGenericSuperclass();
    }

    public static Type[] getMapKeyAndValueTypes(Type r4, Class<?> r5) {
        if (r4 == Properties.class) goto L5;
        Type r42 = getSupertype(r4, r5, Map.class);
        if ((r42 instanceof ParameterizedType) == false) goto L11;
        return ((ParameterizedType) r42).getActualTypeArguments();
    L11:
        return new Type[]{Object.class, Object.class};
    L5:
        return new Type[]{String.class, String.class};
    }

    public static Class<?> getRawType(Type r4) {
        if ((r4 instanceof Class) == false) goto L7;
        return (Class) r4;
    L7:
        if ((r4 instanceof ParameterizedType) == false) goto L11;
        Type r42 = ((ParameterizedType) r4).getRawType();
        C$Gson$Preconditions.checkArgument(r42 instanceof Class);
        return (Class) r42;
    L11:
        if ((r4 instanceof GenericArrayType) == false) goto L15;
        return Array.newInstance(getRawType(((GenericArrayType) r4).getGenericComponentType()), 0).getClass();
    L15:
        if ((r4 instanceof TypeVariable) == false) goto L19;
        return Object.class;
    L19:
        if ((r4 instanceof WildcardType) == true) goto L21;
        if (r4 != null) goto L24;
        String r02 = "null";
    L26:
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + r4 + "> is of type " + r02);
    L24:
        r02 = r4.getClass().getName();
        goto L26
    L21:
        return getRawType(((WildcardType) r4).getUpperBounds()[0]);
    }

    private static Type getSupertype(Type r1, Class<?> r2, Class<?> r3) {
        if ((r1 instanceof WildcardType) == false) goto L5;
        r1 = ((WildcardType) r1).getUpperBounds()[0];
    L5:
        C$Gson$Preconditions.checkArgument(r3.isAssignableFrom(r2));
        return resolve(r1, r2, getGenericSupertype(r1, r2, r3));
    }

    private static int indexOf(Object[] r3, Object r4) {
        int r02 = r3.length;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L9;
        if (r4.equals(r3[r1]) == true) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        return r1;
    L9:
        throw new NoSuchElementException();
    }

    public static ParameterizedType newParameterizedTypeWithOwner(Type r1, Type r2, Type... r3) {
        return new ParameterizedTypeImpl(r1, r2, r3);
    }

    public static Type resolve(Type r1, Class<?> r2, Type r3) {
        return resolve(r1, r2, r3, new HashMap());
    }

    private static Type resolveTypeVariable(Type r1, Class<?> r2, TypeVariable<?> r3) {
        Class<?> r02 = declaringClassOf(r3);
        if (r02 == null) goto L9;
        Type r12 = getGenericSupertype(r1, r2, r02);
        if ((r12 instanceof ParameterizedType) == false) goto L9;
        int r22 = indexOf(r02.getTypeParameters(), r3);
        return ((ParameterizedType) r12).getActualTypeArguments()[r22];
    L9:
        return r3;
    }

    public static WildcardType subtypeOf(Type r2) {
        if ((r2 instanceof WildcardType) == false) goto L5;
        Type[] r22 = ((WildcardType) r2).getUpperBounds();
    L7:
        return new WildcardTypeImpl(r22, EMPTY_TYPE_ARRAY);
    L5:
        r22 = new Type[]{r2};
        goto L7
    }

    public static WildcardType supertypeOf(Type r4) {
        if ((r4 instanceof WildcardType) == false) goto L5;
        Type[] r42 = ((WildcardType) r4).getLowerBounds();
    L7:
        return new WildcardTypeImpl(new Type[]{Object.class}, r42);
    L5:
        r42 = new Type[]{r4};
        goto L7
    }

    public static String typeToString(Type r1) {
        if ((r1 instanceof Class) == false) goto L7;
        return ((Class) r1).getName();
    L7:
        return r1.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>] */
    private static Type resolve(Type r9, Class<?> r10, TypeVariable r11, Map<TypeVariable<?>, Type> r12) {
        TypeVariable r02 = null;
    L4:
        if ((r11 instanceof TypeVariable) == false) goto L17;
        TypeVariable r1 = r11;
        Type r2 = (Type) r12.get(r1);
        Class r3 = Void.TYPE;
        if (r2 != null) goto L7;
        r12.put(r1, r3);
        if (r02 != null) goto L13;
        r02 = r1;
    L13:
        r11 = resolveTypeVariable(r9, r10, r1);
        if (r11 != r1) goto L4;
    L55:
        if (r02 == null) goto L57;
        r12.put(r02, r11);
    L57:
        return r11;
    L7:
        if (r2 != r3) goto L9;
        return r11;
    L9:
        return r2;
    L17:
        if ((r11 instanceof Class) == false) goto L26;
        Class r13 = r11;
        if (r13.isArray() == false) goto L26;
        Class<?> r112 = r13.getComponentType();
        Type r92 = resolve(r9, r10, r112, r12);
        if (equal(r112, r92) == false) goto L23;
        r11 = r13;
        goto L55
    L23:
        Type r93 = arrayOf(r92);
    L24:
        r11 = r93;
    L26:
        if ((r11 instanceof GenericArrayType) == false) goto L31;
        r11 = (GenericArrayType) r11;
        Type r14 = r11.getGenericComponentType();
        Type r94 = resolve(r9, r10, r14, r12);
        if (equal(r14, r94) == true) goto L55;
        r93 = arrayOf(r94);
        goto L24
    L31:
        int r22 = 0;
        if ((r11 instanceof ParameterizedType) == false) goto L44;
        r11 = (ParameterizedType) r11;
        Type r15 = r11.getOwnerType();
        Type r4 = resolve(r9, r10, r15, r12);
        boolean r16 = !equal(r4, r15);
        Type[] r5 = r11.getActualTypeArguments();
        int r6 = r5.length;
    L34:
        if (r22 >= r6) goto L41;
        Type r7 = resolve(r9, r10, r5[r22], r12);
        if (equal(r7, r5[r22]) == true) goto L40;
        if (r16 == true) goto L39;
        r5 = (Type[]) r5.clone();
        r16 = true;
    L39:
        r5[r22] = r7;
    L40:
        r22 = r22 + 1;
        goto L34
    L41:
        if (r16 == false) goto L55;
        r93 = newParameterizedTypeWithOwner(r4, r11.getRawType(), r5);
        goto L24
    L44:
        if ((r11 instanceof WildcardType) == false) goto L55;
        r11 = (WildcardType) r11;
        Type[] r17 = r11.getLowerBounds();
        Type[] r42 = r11.getUpperBounds();
        if (r17.length != 1) goto L51;
        Type r95 = resolve(r9, r10, r17[0], r12);
        if (r95 == r17[0]) goto L55;
        r11 = supertypeOf(r95);
        goto L55
    L51:
        if (r42.length != 1) goto L55;
        Type r96 = resolve(r9, r10, r42[0], r12);
        if (r96 == r42[0]) goto L55;
        r11 = subtypeOf(r96);
        goto L55
    }
}
