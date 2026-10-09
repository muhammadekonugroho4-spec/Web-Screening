package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import okhttp3.ResponseBody;
import okio.C12043e;

/* loaded from: classes3.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public static final Type[] f183421a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f183422b = true;

    public static final class a implements GenericArrayType {

        /* renamed from: a, reason: collision with root package name */
        public final Type f183423a;

        public a(Type r1) {
            this.f183423a = r1;
        }

        public boolean equals(Object r2) {
            if ((r2 instanceof GenericArrayType) == true) goto L5;
            return false;
        L5:
            if (A.d(this, (GenericArrayType) r2) == false) goto L10;
            return true;
        L10:
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f183423a;
        }

        public int hashCode() {
            return this.f183423a.hashCode();
        }

        public String toString() {
            return A.u(this.f183423a) + "[]";
        }
    }

    public static final class b implements ParameterizedType {

        /* renamed from: a, reason: collision with root package name */
        public final Type f183424a;

        /* renamed from: b, reason: collision with root package name */
        public final Type f183425b;

        /* renamed from: c, reason: collision with root package name */
        public final Type[] f183426c;

        public b(Type r5, Type r6, Type... r7) {
            int r1 = 0;
            if ((r6 instanceof Class) == false) goto L16;
            boolean r02 = true;
            if (r5 != null) goto L7;
            boolean r2 = true;
        L9:
            if (((Class) r6).getEnclosingClass() == null) goto L12;
            r02 = false;
        L12:
            if (r2 == r02) goto L16;
            throw new IllegalArgumentException();
        L7:
            r2 = false;
        L16:
            int r03 = r7.length;
        L17:
            if (r1 >= r03) goto L19;
            Type r22 = r7[r1];
            Objects.requireNonNull(r22, "typeArgument == null");
            A.b(r22);
            r1 = r1 + 1;
            goto L17
        L19:
            this.f183424a = r5;
            this.f183425b = r6;
            this.f183426c = (Type[]) r7.clone();
        }

        public boolean equals(Object r2) {
            if ((r2 instanceof ParameterizedType) == true) goto L5;
            return false;
        L5:
            if (A.d(this, (ParameterizedType) r2) == false) goto L10;
            return true;
        L10:
            return false;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f183426c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f183424a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f183425b;
        }

        public int hashCode() {
            int r02 = Arrays.hashCode(this.f183426c) ^ this.f183425b.hashCode();
            Type r1 = this.f183424a;
            if (r1 == null) goto L5;
            int r12 = r1.hashCode();
        L7:
            return r02 ^ r12;
        L5:
            r12 = 0;
            goto L7
        }

        public String toString() {
            Type[] r02 = this.f183426c;
            if (r02.length == 0) goto L5;
            int r2 = 1;
            StringBuilder r1 = new StringBuilder((r02.length + 1) * 30);
            r1.append(A.u(this.f183425b));
            r1.append("<");
            r1.append(A.u(this.f183426c[0]));
        L8:
            if (r2 >= this.f183426c.length) goto L10;
            r1.append(", ");
            r1.append(A.u(this.f183426c[r2]));
            r2 = r2 + 1;
            goto L8
        L10:
            r1.append(">");
            return r1.toString();
        L5:
            return A.u(this.f183425b);
        }
    }

    public static final class c implements WildcardType {

        /* renamed from: a, reason: collision with root package name */
        public final Type f183427a;

        /* renamed from: b, reason: collision with root package name */
        public final Type f183428b;

        public c(Type[] r4, Type[] r5) {
            if (r5.length > 1) goto L19;
            if (r4.length != 1) goto L17;
            if (r5.length != 1) goto L14;
            r5[0].getClass();
            A.b(r5[0]);
            if (r4[0] != Object.class) goto L13;
            this.f183428b = r5[0];
            this.f183427a = Object.class;
            return;
        L13:
            throw new IllegalArgumentException();
        L14:
            r4[0].getClass();
            A.b(r4[0]);
            this.f183428b = null;
            this.f183427a = r4[0];
            return;
        L17:
            throw new IllegalArgumentException();
        L19:
            throw new IllegalArgumentException();
        }

        public boolean equals(Object r2) {
            if ((r2 instanceof WildcardType) == true) goto L5;
            return false;
        L5:
            if (A.d(this, (WildcardType) r2) == false) goto L10;
            return true;
        L10:
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type r02 = this.f183428b;
            if (r02 == null) goto L7;
            return new Type[]{r02};
        L7:
            return A.f183421a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f183427a};
        }

        public int hashCode() {
            Type r02 = this.f183428b;
            if (r02 == null) goto L5;
            int r03 = r02.hashCode() + 31;
        L7:
            return r03 ^ (this.f183427a.hashCode() + 31);
        L5:
            r03 = 1;
            goto L7
        }

        public String toString() {
            if (this.f183428b == null) goto L7;
            return "? super " + A.u(this.f183428b);
        L7:
            if (this.f183427a != Object.class) goto L11;
            return "?";
        L11:
            return "? extends " + A.u(this.f183427a);
        }
    }

    static {
        f183421a = new Type[0];
    }

    public static ResponseBody a(ResponseBody r4) {
        C12043e r02 = new C12043e();
        r4.x().s0(r02);
        return ResponseBody.t(r4.n(), r4.l(), r02);
    }

    public static void b(Type r1) {
        if ((r1 instanceof Class) == true) goto L5;
        return;
    L5:
        if (((Class) r1).isPrimitive() == true) goto L8;
        return;
    L8:
        throw new IllegalArgumentException();
    }

    public static Class c(TypeVariable r1) {
        GenericDeclaration r12 = r1.getGenericDeclaration();
        if ((r12 instanceof Class) == true) goto L5;
        return null;
    L5:
        return (Class) r12;
    }

    public static boolean d(Type r5, Type r6) {
        if (r5 != r6) goto L6;
        return true;
    L6:
        if ((r5 instanceof Class) == false) goto L10;
        return r5.equals(r6);
    L10:
        if ((r5 instanceof ParameterizedType) == false) goto L29;
        if ((r6 instanceof ParameterizedType) == true) goto L14;
        return false;
    L14:
        ParameterizedType r52 = (ParameterizedType) r5;
        ParameterizedType r62 = (ParameterizedType) r6;
        Type r1 = r52.getOwnerType();
        Type r3 = r62.getOwnerType();
        if (r1 == r3) goto L21;
        if (r1 != null) goto L18;
    L20:
        boolean r12 = false;
    L22:
        boolean r32 = r52.getRawType().equals(r62.getRawType());
        boolean r53 = Arrays.equals(r52.getActualTypeArguments(), r62.getActualTypeArguments());
        if (r12 == false) goto L27;
        if (r32 == false) goto L27;
        if (r53 == false) goto L27;
        return true;
    L27:
        return false;
    L18:
        if (r1.equals(r3) == false) goto L20;
    L21:
        r12 = true;
        goto L22
    L29:
        if ((r5 instanceof GenericArrayType) == false) goto L36;
        if ((r6 instanceof GenericArrayType) == true) goto L34;
        return false;
    L34:
        return d(((GenericArrayType) r5).getGenericComponentType(), ((GenericArrayType) r6).getGenericComponentType());
    L36:
        if ((r5 instanceof WildcardType) == false) goto L47;
        if ((r6 instanceof WildcardType) == true) goto L40;
        return false;
    L40:
        WildcardType r54 = (WildcardType) r5;
        WildcardType r63 = (WildcardType) r6;
        if (Arrays.equals(r54.getUpperBounds(), r63.getUpperBounds()) == true) goto L43;
    L45:
        return false;
    L43:
        if (Arrays.equals(r54.getLowerBounds(), r63.getLowerBounds()) == false) goto L45;
        return true;
    L47:
        if ((r5 instanceof TypeVariable) == true) goto L49;
    L56:
        return false;
    L49:
        if ((r6 instanceof TypeVariable) == true) goto L51;
        return false;
    L51:
        TypeVariable r55 = (TypeVariable) r5;
        TypeVariable r64 = (TypeVariable) r6;
        if (r55.getGenericDeclaration() != r64.getGenericDeclaration()) goto L56;
        if (r55.getName().equals(r64.getName()) == false) goto L56;
        return true;
    }

    public static Type e(Type r3, Class r4, Class r5) {
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
        return e(r4.getGenericInterfaces()[r1], r32[r1], r5);
    L11:
        return r4.getGenericInterfaces()[r1];
    L18:
        if (r4.isInterface() == false) goto L20;
    L30:
        return r5;
    L20:
        if (r4 == Object.class) goto L30;
        Class<?> r33 = r4.getSuperclass();
        if (r33 == r5) goto L24;
        if (r5.isAssignableFrom(r33) == true) goto L28;
        r4 = r33;
        goto L20
    L28:
        return e(r4.getGenericSuperclass(), r33, r5);
    L24:
        return r4.getGenericSuperclass();
    }

    public static Type f(int r02, ParameterizedType r1) {
        Type r03 = r1.getActualTypeArguments()[r02];
        if ((r03 instanceof WildcardType) == true) goto L5;
        return r03;
    L5:
        return ((WildcardType) r03).getLowerBounds()[0];
    }

    public static Type g(int r4, ParameterizedType r5) {
        Type[] r02 = r5.getActualTypeArguments();
        if (r4 < 0) goto L11;
        if (r4 >= r02.length) goto L11;
        Type r42 = r02[r4];
        if ((r42 instanceof WildcardType) == true) goto L9;
        return r42;
    L9:
        return ((WildcardType) r42).getUpperBounds()[0];
    L11:
        throw new IllegalArgumentException("Index " + r4 + " not in range [0," + r02.length + ") for " + r5);
    }

    public static Class h(Type r3) {
        Objects.requireNonNull(r3, "type == null");
        if ((r3 instanceof Class) == false) goto L7;
        return (Class) r3;
    L7:
        if ((r3 instanceof ParameterizedType) == false) goto L15;
        Type r32 = ((ParameterizedType) r3).getRawType();
        if ((r32 instanceof Class) == false) goto L13;
        return (Class) r32;
    L13:
        throw new IllegalArgumentException();
    L15:
        if ((r3 instanceof GenericArrayType) == false) goto L19;
        return Array.newInstance(h(((GenericArrayType) r3).getGenericComponentType()), 0).getClass();
    L19:
        if ((r3 instanceof TypeVariable) == false) goto L23;
        return Object.class;
    L23:
        if ((r3 instanceof WildcardType) == false) goto L27;
        return h(((WildcardType) r3).getUpperBounds()[0]);
    L27:
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + r3 + "> is of type " + r3.getClass().getName());
    }

    public static Type i(Type r1, Class r2, Class r3) {
        if (r3.isAssignableFrom(r2) == false) goto L7;
        return r(r1, r2, e(r1, r2, r3));
    L7:
        throw new IllegalArgumentException();
    }

    public static boolean j(Type r5) {
        if ((r5 instanceof Class) == false) goto L6;
        return false;
    L6:
        if ((r5 instanceof ParameterizedType) == false) goto L15;
        Type[] r52 = ((ParameterizedType) r5).getActualTypeArguments();
        int r02 = r52.length;
        int r3 = 0;
    L8:
        if (r3 >= r02) goto L13;
        if (j(r52[r3]) == true) goto L11;
        r3 = r3 + 1;
        goto L8
    L11:
        return true;
    L13:
        return false;
    L15:
        if ((r5 instanceof GenericArrayType) == false) goto L19;
        return j(((GenericArrayType) r5).getGenericComponentType());
    L19:
        if ((r5 instanceof TypeVariable) == false) goto L22;
        return true;
    L22:
        if ((r5 instanceof WildcardType) == false) goto L24;
        return true;
    L24:
        if (r5 != null) goto L26;
        String r03 = "null";
    L28:
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + r5 + "> is of type " + r03);
    L26:
        r03 = r5.getClass().getName();
        goto L28
    }

    public static int k(Object[] r2, Object r3) {
        int r02 = 0;
    L4:
        if (r02 >= r2.length) goto L10;
        if (r3.equals(r2[r02]) == true) goto L7;
        r02 = r02 + 1;
        goto L4
    L7:
        return r02;
    L10:
        throw new NoSuchElementException();
    }

    public static boolean l(Annotation[] r4, Class r5) {
        int r02 = r4.length;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L9;
        if (r5.isInstance(r4[r2]) == true) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    public static boolean m(Type r2) {
        if (f183422b == true) goto L5;
        return false;
    L5:
        if (r2 != kotlin.w.class) goto L8;
        return true;
    L8:
        return false;
    }

    public static RuntimeException n(Method r1, String r2, Object... r3) {
        return o(r1, null, r2, r3);
    }

    public static RuntimeException o(Method r1, Throwable r2, String r3, Object... r4) {
        return new IllegalArgumentException(String.format(r3, r4) + "\n    for method " + r1.getDeclaringClass().getSimpleName() + "." + r1.getName(), r2);
    }

    public static RuntimeException p(Method r1, int r2, String r3, Object... r4) {
        return n(r1, r3 + " (" + r.f183535b.a(r1, r2) + ")", r4);
    }

    public static RuntimeException q(Method r1, Throwable r2, int r3, String r4, Object... r5) {
        return o(r1, r2, r4 + " (" + r.f183535b.a(r1, r3) + ")", r5);
    }

    public static Type r(Type r8, Class r9, Type r10) {
        int r02 = 0;
        Type r102 = r10;
    L4:
        if ((r102 instanceof TypeVariable) == false) goto L10;
        TypeVariable r103 = (TypeVariable) r102;
        Type r2 = s(r8, r9, r103);
        if (r2 == r103) goto L7;
        r102 = r2;
        goto L4
    L7:
        return r2;
    L10:
        if ((r102 instanceof Class) == false) goto L19;
        Class r22 = (Class) r102;
        if (r22.isArray() == false) goto L19;
        Class<?> r104 = r22.getComponentType();
        Type r82 = r(r8, r9, r104);
        if (r104 != r82) goto L17;
        return r22;
    L17:
        return new a(r82);
    L19:
        if ((r102 instanceof GenericArrayType) == false) goto L26;
        GenericArrayType r105 = (GenericArrayType) r102;
        Type r03 = r105.getGenericComponentType();
        Type r83 = r(r8, r9, r03);
        if (r03 != r83) goto L24;
        return r105;
    L24:
        return new a(r83);
    L26:
        if ((r102 instanceof ParameterizedType) == false) goto L43;
        ParameterizedType r106 = (ParameterizedType) r102;
        Type r23 = r106.getOwnerType();
        Type r3 = r(r8, r9, r23);
        if (r3 == r23) goto L30;
        boolean r24 = true;
    L31:
        Type[] r4 = r106.getActualTypeArguments();
        int r5 = r4.length;
    L32:
        if (r02 >= r5) goto L39;
        Type r6 = r(r8, r9, r4[r02]);
        if (r6 == r4[r02]) goto L38;
        if (r24 == true) goto L37;
        r4 = (Type[]) r4.clone();
        r24 = true;
    L37:
        r4[r02] = r6;
    L38:
        r02 = r02 + 1;
        goto L32
    L39:
        if (r24 == true) goto L41;
        return r106;
    L41:
        return new b(r3, r106.getRawType(), r4);
    L30:
        r24 = false;
        goto L31
    L43:
        boolean r25 = r102 instanceof WildcardType;
        Type r107 = r102;
        if (r25 == false) goto L57;
        WildcardType r108 = (WildcardType) r102;
        Type[] r26 = r108.getLowerBounds();
        Type[] r32 = r108.getUpperBounds();
        if (r26.length != 1) goto L51;
        Type r84 = r(r8, r9, r26[0]);
        r107 = r108;
        if (r84 == r26[0]) goto L57;
        return new c(new Type[]{Object.class}, new Type[]{r84});
    L51:
        r107 = r108;
        if (r32.length != 1) goto L57;
        Type r85 = r(r8, r9, r32[0]);
        r107 = r108;
        if (r85 == r32[0]) goto L57;
        return new c(new Type[]{r85}, f183421a);
    L57:
        return r107;
    }

    public static Type s(Type r1, Class r2, TypeVariable r3) {
        Class r02 = c(r3);
        if (r02 == null) goto L9;
        Type r12 = e(r1, r2, r02);
        if ((r12 instanceof ParameterizedType) == false) goto L9;
        int r22 = k(r02.getTypeParameters(), r3);
        return ((ParameterizedType) r12).getActualTypeArguments()[r22];
    L9:
        return r3;
    }

    public static void t(Throwable r1) {
        if ((r1 instanceof VirtualMachineError) == true) goto L14;
        if ((r1 instanceof ThreadDeath) == true) goto L12;
        if ((r1 instanceof LinkageError) == true) goto L10;
        return;
    L10:
        throw ((LinkageError) r1);
    L12:
        throw ((ThreadDeath) r1);
    L14:
        throw ((VirtualMachineError) r1);
    }

    public static String u(Type r1) {
        if ((r1 instanceof Class) == false) goto L7;
        return ((Class) r1).getName();
    L7:
        return r1.toString();
    }
}
