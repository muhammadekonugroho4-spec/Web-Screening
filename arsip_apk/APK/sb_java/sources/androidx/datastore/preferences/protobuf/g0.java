package androidx.datastore.preferences.protobuf;

import com.google.firebase.perf.util.Constants;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f23838a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Unsafe f23839b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final Class f23840c = null;
    public static final boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f23841e = false;

    /* renamed from: f, reason: collision with root package name */
    public static final e f23842f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f23843g = false;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f23844h = false;

    /* renamed from: i, reason: collision with root package name */
    public static final long f23845i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static final long f23846j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final long f23847k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final long f23848l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final long f23849m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final long f23850n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final long f23851o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static final long f23852p = 0;

    /* renamed from: q, reason: collision with root package name */
    public static final long f23853q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static final long f23854r = 0;

    /* renamed from: s, reason: collision with root package name */
    public static final long f23855s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static final long f23856t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static final long f23857u = 0;

    /* renamed from: v, reason: collision with root package name */
    public static final long f23858v = 0;

    /* renamed from: w, reason: collision with root package name */
    public static final int f23859w = 0;

    /* renamed from: x, reason: collision with root package name */
    public static final boolean f23860x = false;

    public static class a implements PrivilegedExceptionAction {
        public a() {
        }

        public Unsafe a() {
            Field[] r1 = Unsafe.class.getDeclaredFields();
            int r2 = r1.length;
            int r3 = 0;
        L4:
            if (r3 >= r2) goto L10;
            Field r5 = r1[r3];
            r5.setAccessible(true);
            Object r4 = r5.get(null);
            if (Unsafe.class.isInstance(r4) == true) goto L8;
            r3 = r3 + 1;
            goto L4
        L8:
            return (Unsafe) Unsafe.class.cast(r4);
        L10:
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public /* bridge */ /* synthetic */ Object run() {
            return a();
        }
    }

    public static final class b extends e {
        public b(Unsafe r1) {
            super(r1);
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public boolean c(Object r2, long r3) {
            if (g0.f23860x == false) goto L7;
            return g0.e(r2, r3);
        L7:
            return g0.f(r2, r3);
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public byte d(Object r2, long r3) {
            if (g0.f23860x == false) goto L7;
            return g0.a(r2, r3);
        L7:
            return g0.b(r2, r3);
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public double e(Object r1, long r2) {
            return Double.longBitsToDouble(h(r1, r2));
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public float f(Object r1, long r2) {
            return Float.intBitsToFloat(g(r1, r2));
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public void k(Object r2, long r3, boolean r5) {
            if (g0.f23860x == false) goto L6;
            g0.g(r2, r3, r5);
            return;
        L6:
            g0.h(r2, r3, r5);
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public void l(Object r2, long r3, byte r5) {
            if (g0.f23860x == false) goto L6;
            g0.c(r2, r3, r5);
            return;
        L6:
            g0.d(r2, r3, r5);
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public void m(Object r7, long r8, double r10) {
            p(r7, r8, Double.doubleToLongBits(r10));
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public void n(Object r1, long r2, float r4) {
            o(r1, r2, Float.floatToIntBits(r4));
        }
    }

    public static final class c extends e {
        public c(Unsafe r1) {
            super(r1);
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public boolean c(Object r2, long r3) {
            if (g0.f23860x == false) goto L7;
            return g0.e(r2, r3);
        L7:
            return g0.f(r2, r3);
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public byte d(Object r2, long r3) {
            if (g0.f23860x == false) goto L7;
            return g0.a(r2, r3);
        L7:
            return g0.b(r2, r3);
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public double e(Object r1, long r2) {
            return Double.longBitsToDouble(h(r1, r2));
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public float f(Object r1, long r2) {
            return Float.intBitsToFloat(g(r1, r2));
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public void k(Object r2, long r3, boolean r5) {
            if (g0.f23860x == false) goto L6;
            g0.g(r2, r3, r5);
            return;
        L6:
            g0.h(r2, r3, r5);
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public void l(Object r2, long r3, byte r5) {
            if (g0.f23860x == false) goto L6;
            g0.c(r2, r3, r5);
            return;
        L6:
            g0.d(r2, r3, r5);
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public void m(Object r7, long r8, double r10) {
            p(r7, r8, Double.doubleToLongBits(r10));
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public void n(Object r1, long r2, float r4) {
            o(r1, r2, Float.floatToIntBits(r4));
        }
    }

    public static final class d extends e {
        public d(Unsafe r1) {
            super(r1);
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public boolean c(Object r2, long r3) {
            return this.f23861a.getBoolean(r2, r3);
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public byte d(Object r2, long r3) {
            return this.f23861a.getByte(r2, r3);
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public double e(Object r2, long r3) {
            return this.f23861a.getDouble(r2, r3);
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public float f(Object r2, long r3) {
            return this.f23861a.getFloat(r2, r3);
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public void k(Object r2, long r3, boolean r5) {
            this.f23861a.putBoolean(r2, r3, r5);
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public void l(Object r2, long r3, byte r5) {
            this.f23861a.putByte(r2, r3, r5);
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public void m(Object r7, long r8, double r10) {
            this.f23861a.putDouble(r7, r8, r10);
        }

        @Override // androidx.datastore.preferences.protobuf.g0.e
        public void n(Object r2, long r3, float r5) {
            this.f23861a.putFloat(r2, r3, r5);
        }
    }

    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public Unsafe f23861a;

        public e(Unsafe r1) {
            this.f23861a = r1;
        }

        public final int a(Class r2) {
            return this.f23861a.arrayBaseOffset(r2);
        }

        public final int b(Class r2) {
            return this.f23861a.arrayIndexScale(r2);
        }

        public abstract boolean c(Object r1, long r2);

        public abstract byte d(Object r1, long r2);

        public abstract double e(Object r1, long r2);

        public abstract float f(Object r1, long r2);

        public final int g(Object r2, long r3) {
            return this.f23861a.getInt(r2, r3);
        }

        public final long h(Object r2, long r3) {
            return this.f23861a.getLong(r2, r3);
        }

        public final Object i(Object r2, long r3) {
            return this.f23861a.getObject(r2, r3);
        }

        public final long j(Field r3) {
            return this.f23861a.objectFieldOffset(r3);
        }

        public abstract void k(Object r1, long r2, boolean r4);

        public abstract void l(Object r1, long r2, byte r4);

        public abstract void m(Object r1, long r2, double r4);

        public abstract void n(Object r1, long r2, float r4);

        public final void o(Object r2, long r3, int r5) {
            this.f23861a.putInt(r2, r3, r5);
        }

        public final void p(Object r7, long r8, long r10) {
            this.f23861a.putLong(r7, r8, r10);
        }

        public final void q(Object r2, long r3, Object r5) {
            this.f23861a.putObject(r2, r3, r5);
        }
    }

    static {
        f23838a = Logger.getLogger(g0.class.getName());
        f23839b = B();
        f23840c = AbstractC3914d.b();
        d = m(Long.TYPE);
        f23841e = m(Integer.TYPE);
        f23842f = z();
        f23843g = Q();
        f23844h = P();
        long r02 = j(byte[].class);
        f23845i = r02;
        f23846j = j(boolean[].class);
        f23847k = k(boolean[].class);
        f23848l = j(int[].class);
        f23849m = k(int[].class);
        f23850n = j(long[].class);
        f23851o = k(long[].class);
        f23852p = j(float[].class);
        f23853q = k(float[].class);
        f23854r = j(double[].class);
        f23855s = k(double[].class);
        f23856t = j(Object[].class);
        f23857u = k(Object[].class);
        f23858v = o(l());
        f23859w = (int) (r02 & 7);
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) goto L5;
        boolean r03 = true;
    L6:
        f23860x = r03;
        return;
    L5:
        r03 = false;
        goto L6
    }

    public static Object A(Object r1, long r2) {
        return f23842f.i(r1, r2);
    }

    public static Unsafe B() {
        return (Unsafe) AccessController.doPrivileged(new a());
    L4:
        return null;
    }

    public static boolean C() {
        return f23844h;
    }

    public static boolean D() {
        return f23843g;
    }

    public static void E(Object r1, long r2, boolean r4) {
        f23842f.k(r1, r2, r4);
    }

    public static void F(Object r02, long r1, boolean r3) {
        I(r02, r1, r3 ? 1 : 0);
    }

    public static void G(Object r02, long r1, boolean r3) {
        J(r02, r1, r3 ? 1 : 0);
    }

    public static void H(byte[] r3, long r4, byte r6) {
        f23842f.l(r3, f23845i + r4, r6);
    }

    public static void I(Object r4, long r5, byte r7) {
        long r02 = (-4) & r5;
        int r2 = x(r4, r02);
        int r52 = ((~((int) r5)) & 3) << 3;
        int r22 = r2 & (~(Constants.MAX_HOST_LENGTH << r52));
        M(r4, r02, ((255 & r7) << r52) | r22);
    }

    public static void J(Object r4, long r5, byte r7) {
        long r02 = (-4) & r5;
        int r52 = (((int) r5) & 3) << 3;
        int r2 = x(r4, r02) & (~(Constants.MAX_HOST_LENGTH << r52));
        M(r4, r02, ((255 & r7) << r52) | r2);
    }

    public static void K(Object r6, long r7, double r9) {
        f23842f.m(r6, r7, r9);
    }

    public static void L(Object r1, long r2, float r4) {
        f23842f.n(r1, r2, r4);
    }

    public static void M(Object r1, long r2, int r4) {
        f23842f.o(r1, r2, r4);
    }

    public static void N(Object r6, long r7, long r9) {
        f23842f.p(r6, r7, r9);
    }

    public static void O(Object r1, long r2, Object r4) {
        f23842f.q(r1, r2, r4);
    }

    public static boolean P() {
        Unsafe r2 = f23839b;
        if (r2 != null) goto L13;
        return false;
    L13:
        Class<?> r22 = r2.getClass();     // Catch: Throwable -> L10
        r22.getMethod("objectFieldOffset", new Class[]{Field.class});     // Catch: Throwable -> L10
        r22.getMethod("arrayBaseOffset", new Class[]{Class.class});     // Catch: Throwable -> L10
        r22.getMethod("arrayIndexScale", new Class[]{Class.class});     // Catch: Throwable -> L10
        Class r4 = Long.TYPE;     // Catch: Throwable -> L10
        r22.getMethod("getInt", new Class[]{Object.class, r4});     // Catch: Throwable -> L10
        r22.getMethod("putInt", new Class[]{Object.class, r4, Integer.TYPE});     // Catch: Throwable -> L10
        r22.getMethod("getLong", new Class[]{Object.class, r4});     // Catch: Throwable -> L10
        r22.getMethod("putLong", new Class[]{Object.class, r4, r4});     // Catch: Throwable -> L10
        r22.getMethod("getObject", new Class[]{Object.class, r4});     // Catch: Throwable -> L10
        r22.getMethod("putObject", new Class[]{Object.class, r4, Object.class});     // Catch: Throwable -> L10
        if (AbstractC3914d.c() == false) goto L8;
        return true;
    L8:
        r22.getMethod("getByte", new Class[]{Object.class, r4});     // Catch: Throwable -> L10
        r22.getMethod("putByte", new Class[]{Object.class, r4, Byte.TYPE});     // Catch: Throwable -> L10
        r22.getMethod("getBoolean", new Class[]{Object.class, r4});     // Catch: Throwable -> L10
        r22.getMethod("putBoolean", new Class[]{Object.class, r4, Boolean.TYPE});     // Catch: Throwable -> L10
        r22.getMethod("getFloat", new Class[]{Object.class, r4});     // Catch: Throwable -> L10
        r22.getMethod("putFloat", new Class[]{Object.class, r4, Float.TYPE});     // Catch: Throwable -> L10
        r22.getMethod("getDouble", new Class[]{Object.class, r4});     // Catch: Throwable -> L10
        r22.getMethod("putDouble", new Class[]{Object.class, r4, Double.TYPE});     // Catch: Throwable -> L10
        return true;
    L10:
        th = move-exception;
        f23838a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
        return false;
    }

    public static boolean Q() {
        Unsafe r3 = f23839b;
        if (r3 != null) goto L16;
        return false;
    L16:
        Class<?> r32 = r3.getClass();     // Catch: Throwable -> L13
        r32.getMethod("objectFieldOffset", new Class[]{Field.class});     // Catch: Throwable -> L13
        Class r5 = Long.TYPE;     // Catch: Throwable -> L13
        r32.getMethod("getLong", new Class[]{Object.class, r5});     // Catch: Throwable -> L13
        if (l() != null) goto L9;
        return false;
    L9:
        if (AbstractC3914d.c() == false) goto L11;
        return true;
    L11:
        r32.getMethod("getByte", new Class[]{r5});     // Catch: Throwable -> L13
        r32.getMethod("putByte", new Class[]{r5, Byte.TYPE});     // Catch: Throwable -> L13
        r32.getMethod("getInt", new Class[]{r5});     // Catch: Throwable -> L13
        r32.getMethod("putInt", new Class[]{r5, Integer.TYPE});     // Catch: Throwable -> L13
        r32.getMethod("getLong", new Class[]{r5});     // Catch: Throwable -> L13
        r32.getMethod("putLong", new Class[]{r5, r5});     // Catch: Throwable -> L13
        r32.getMethod("copyMemory", new Class[]{r5, r5, r5});     // Catch: Throwable -> L13
        r32.getMethod("copyMemory", new Class[]{Object.class, r5, Object.class, r5, r5});     // Catch: Throwable -> L13
        return true;
    L13:
        th = move-exception;
        f23838a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
        return false;
    }

    public static /* synthetic */ byte a(Object r02, long r1) {
        return t(r02, r1);
    }

    public static /* synthetic */ byte b(Object r02, long r1) {
        return u(r02, r1);
    }

    public static /* synthetic */ void c(Object r02, long r1, byte r3) {
        I(r02, r1, r3);
    }

    public static /* synthetic */ void d(Object r02, long r1, byte r3) {
        J(r02, r1, r3);
    }

    public static /* synthetic */ boolean e(Object r02, long r1) {
        return q(r02, r1);
    }

    public static /* synthetic */ boolean f(Object r02, long r1) {
        return r(r02, r1);
    }

    public static /* synthetic */ void g(Object r02, long r1, boolean r3) {
        F(r02, r1, r3);
    }

    public static /* synthetic */ void h(Object r02, long r1, boolean r3) {
        G(r02, r1, r3);
    }

    public static Object i(Class r1) {
        return f23839b.allocateInstance(r1);
    L4:
        e = move-exception;
        throw new IllegalStateException(e);
    }

    public static int j(Class r1) {
        if (f23844h == true) goto L5;
        return -1;
    L5:
        return f23842f.a(r1);
    }

    public static int k(Class r1) {
        if (f23844h == true) goto L5;
        return -1;
    L5:
        return f23842f.b(r1);
    }

    public static Field l() {
        if (AbstractC3914d.c() == false) goto L7;
        Field r02 = n(Buffer.class, "effectiveDirectAddress");
        if (r02 == null) goto L7;
        return r02;
    L7:
        Field r03 = n(Buffer.class, "address");
        if (r03 != null) goto L10;
        return null;
    L10:
        if (r03.getType() != Long.TYPE) goto L14;
        return r03;
    L14:
        return null;
    }

    public static boolean m(Class r7) {
        if (AbstractC3914d.c() == true) goto L9;
        return false;
    L9:
        Class r1 = f23840c;     // Catch: Throwable -> L8
        Class r4 = Boolean.TYPE;     // Catch: Throwable -> L8
        r1.getMethod("peekLong", new Class[]{r7, r4});     // Catch: Throwable -> L8
        r1.getMethod("pokeLong", new Class[]{r7, Long.TYPE, r4});     // Catch: Throwable -> L8
        Class r5 = Integer.TYPE;     // Catch: Throwable -> L8
        r1.getMethod("pokeInt", new Class[]{r7, r5, r4});     // Catch: Throwable -> L8
        r1.getMethod("peekInt", new Class[]{r7, r4});     // Catch: Throwable -> L8
        r1.getMethod("pokeByte", new Class[]{r7, Byte.TYPE});     // Catch: Throwable -> L8
        r1.getMethod("peekByte", new Class[]{r7});     // Catch: Throwable -> L8
        r1.getMethod("pokeByteArray", new Class[]{r7, byte[].class, r5, r5});     // Catch: Throwable -> L8
        r1.getMethod("peekByteArray", new Class[]{r7, byte[].class, r5, r5});     // Catch: Throwable -> L8
        return true;
    L8:
        return false;
    }

    public static Field n(Class r02, String r1) {
        return r02.getDeclaredField(r1);
    L4:
        return null;
    }

    public static long o(Field r2) {
        if (r2 == null) goto L8;
        e r02 = f23842f;
        if (r02 != null) goto L7;
        return -1;
    L7:
        return r02.j(r2);
    L8:
        return -1;
    }

    public static boolean p(Object r1, long r2) {
        return f23842f.c(r1, r2);
    }

    public static boolean q(Object r02, long r1) {
        if (t(r02, r1) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static boolean r(Object r02, long r1) {
        if (u(r02, r1) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static byte s(byte[] r3, long r4) {
        return f23842f.d(r3, f23845i + r4);
    }

    public static byte t(Object r2, long r3) {
        return (byte) ((x(r2, (-4) & r3) >>> ((int) (((~r3) & 3) << 3))) & Constants.MAX_HOST_LENGTH);
    }

    public static byte u(Object r2, long r3) {
        return (byte) ((x(r2, (-4) & r3) >>> ((int) ((r3 & 3) << 3))) & Constants.MAX_HOST_LENGTH);
    }

    public static double v(Object r1, long r2) {
        return f23842f.e(r1, r2);
    }

    public static float w(Object r1, long r2) {
        return f23842f.f(r1, r2);
    }

    public static int x(Object r1, long r2) {
        return f23842f.g(r1, r2);
    }

    public static long y(Object r1, long r2) {
        return f23842f.h(r1, r2);
    }

    public static e z() {
        Unsafe r02 = f23839b;
        if (r02 != null) goto L6;
        return null;
    L6:
        if (AbstractC3914d.c() == false) goto L16;
        if (d == false) goto L12;
        return new c(r02);
    L12:
        if (f23841e == true) goto L14;
        return null;
    L14:
        return new b(r02);
    L16:
        return new d(r02);
    }
}
