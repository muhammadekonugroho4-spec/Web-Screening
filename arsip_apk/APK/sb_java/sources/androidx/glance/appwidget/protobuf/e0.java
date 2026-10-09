package androidx.glance.appwidget.protobuf;

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
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f25054a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f25055b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f25056c = false;
    public static final boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public static final e f25057e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f25058f = false;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f25059g = false;

    /* renamed from: h, reason: collision with root package name */
    public static final long f25060h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final long f25061i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static final long f25062j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final long f25063k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final long f25064l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final long f25065m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static final long f25066n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final long f25067o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static final long f25068p = 0;

    /* renamed from: q, reason: collision with root package name */
    public static final long f25069q = 0;

    /* renamed from: r, reason: collision with root package name */
    public static final long f25070r = 0;

    /* renamed from: s, reason: collision with root package name */
    public static final long f25071s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static final long f25072t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static final long f25073u = 0;

    /* renamed from: v, reason: collision with root package name */
    public static final int f25074v = 0;

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f25075w = false;

    public class a implements PrivilegedExceptionAction {
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

        @Override // androidx.glance.appwidget.protobuf.e0.e
        public boolean c(Object r2, long r3) {
            if (e0.f25075w == false) goto L7;
            return e0.e(r2, r3);
        L7:
            return e0.f(r2, r3);
        }

        @Override // androidx.glance.appwidget.protobuf.e0.e
        public double d(Object r1, long r2) {
            return Double.longBitsToDouble(g(r1, r2));
        }

        @Override // androidx.glance.appwidget.protobuf.e0.e
        public float e(Object r1, long r2) {
            return Float.intBitsToFloat(f(r1, r2));
        }

        @Override // androidx.glance.appwidget.protobuf.e0.e
        public void j(Object r2, long r3, boolean r5) {
            if (e0.f25075w == false) goto L6;
            e0.g(r2, r3, r5);
            return;
        L6:
            e0.h(r2, r3, r5);
        }

        @Override // androidx.glance.appwidget.protobuf.e0.e
        public void k(Object r2, long r3, byte r5) {
            if (e0.f25075w == false) goto L6;
            e0.c(r2, r3, r5);
            return;
        L6:
            e0.d(r2, r3, r5);
        }

        @Override // androidx.glance.appwidget.protobuf.e0.e
        public void l(Object r7, long r8, double r10) {
            o(r7, r8, Double.doubleToLongBits(r10));
        }

        @Override // androidx.glance.appwidget.protobuf.e0.e
        public void m(Object r1, long r2, float r4) {
            n(r1, r2, Float.floatToIntBits(r4));
        }

        @Override // androidx.glance.appwidget.protobuf.e0.e
        public boolean r() {
            return false;
        }
    }

    public static final class c extends e {
        public c(Unsafe r1) {
            super(r1);
        }

        @Override // androidx.glance.appwidget.protobuf.e0.e
        public boolean c(Object r2, long r3) {
            if (e0.f25075w == false) goto L7;
            return e0.e(r2, r3);
        L7:
            return e0.f(r2, r3);
        }

        @Override // androidx.glance.appwidget.protobuf.e0.e
        public double d(Object r1, long r2) {
            return Double.longBitsToDouble(g(r1, r2));
        }

        @Override // androidx.glance.appwidget.protobuf.e0.e
        public float e(Object r1, long r2) {
            return Float.intBitsToFloat(f(r1, r2));
        }

        @Override // androidx.glance.appwidget.protobuf.e0.e
        public void j(Object r2, long r3, boolean r5) {
            if (e0.f25075w == false) goto L6;
            e0.g(r2, r3, r5);
            return;
        L6:
            e0.h(r2, r3, r5);
        }

        @Override // androidx.glance.appwidget.protobuf.e0.e
        public void k(Object r2, long r3, byte r5) {
            if (e0.f25075w == false) goto L6;
            e0.c(r2, r3, r5);
            return;
        L6:
            e0.d(r2, r3, r5);
        }

        @Override // androidx.glance.appwidget.protobuf.e0.e
        public void l(Object r7, long r8, double r10) {
            o(r7, r8, Double.doubleToLongBits(r10));
        }

        @Override // androidx.glance.appwidget.protobuf.e0.e
        public void m(Object r1, long r2, float r4) {
            n(r1, r2, Float.floatToIntBits(r4));
        }

        @Override // androidx.glance.appwidget.protobuf.e0.e
        public boolean r() {
            return false;
        }
    }

    public static final class d extends e {
        public d(Unsafe r1) {
            super(r1);
        }

        @Override // androidx.glance.appwidget.protobuf.e0.e
        public boolean c(Object r2, long r3) {
            return this.f25076a.getBoolean(r2, r3);
        }

        @Override // androidx.glance.appwidget.protobuf.e0.e
        public double d(Object r2, long r3) {
            return this.f25076a.getDouble(r2, r3);
        }

        @Override // androidx.glance.appwidget.protobuf.e0.e
        public float e(Object r2, long r3) {
            return this.f25076a.getFloat(r2, r3);
        }

        @Override // androidx.glance.appwidget.protobuf.e0.e
        public void j(Object r2, long r3, boolean r5) {
            this.f25076a.putBoolean(r2, r3, r5);
        }

        @Override // androidx.glance.appwidget.protobuf.e0.e
        public void k(Object r2, long r3, byte r5) {
            this.f25076a.putByte(r2, r3, r5);
        }

        @Override // androidx.glance.appwidget.protobuf.e0.e
        public void l(Object r7, long r8, double r10) {
            this.f25076a.putDouble(r7, r8, r10);
        }

        @Override // androidx.glance.appwidget.protobuf.e0.e
        public void m(Object r2, long r3, float r5) {
            this.f25076a.putFloat(r2, r3, r5);
        }

        @Override // androidx.glance.appwidget.protobuf.e0.e
        public boolean q() {
            if (super.q() == true) goto L11;
            return false;
        L11:
            Class<?> r1 = this.f25076a.getClass();     // Catch: Throwable -> L8
            Class r4 = Long.TYPE;     // Catch: Throwable -> L8
            r1.getMethod("getByte", new Class[]{Object.class, r4});     // Catch: Throwable -> L8
            r1.getMethod("putByte", new Class[]{Object.class, r4, Byte.TYPE});     // Catch: Throwable -> L8
            r1.getMethod("getBoolean", new Class[]{Object.class, r4});     // Catch: Throwable -> L8
            r1.getMethod("putBoolean", new Class[]{Object.class, r4, Boolean.TYPE});     // Catch: Throwable -> L8
            r1.getMethod("getFloat", new Class[]{Object.class, r4});     // Catch: Throwable -> L8
            r1.getMethod("putFloat", new Class[]{Object.class, r4, Float.TYPE});     // Catch: Throwable -> L8
            r1.getMethod("getDouble", new Class[]{Object.class, r4});     // Catch: Throwable -> L8
            r1.getMethod("putDouble", new Class[]{Object.class, r4, Double.TYPE});     // Catch: Throwable -> L8
            return true;
        L8:
            th = move-exception;
            e0.a(th);
            return false;
        }

        @Override // androidx.glance.appwidget.protobuf.e0.e
        public boolean r() {
            if (super.r() == true) goto L11;
            return false;
        L11:
            Class<?> r2 = this.f25076a.getClass();     // Catch: Throwable -> L8
            Class r5 = Long.TYPE;     // Catch: Throwable -> L8
            r2.getMethod("getByte", new Class[]{r5});     // Catch: Throwable -> L8
            r2.getMethod("putByte", new Class[]{r5, Byte.TYPE});     // Catch: Throwable -> L8
            r2.getMethod("getInt", new Class[]{r5});     // Catch: Throwable -> L8
            r2.getMethod("putInt", new Class[]{r5, Integer.TYPE});     // Catch: Throwable -> L8
            r2.getMethod("getLong", new Class[]{r5});     // Catch: Throwable -> L8
            r2.getMethod("putLong", new Class[]{r5, r5});     // Catch: Throwable -> L8
            r2.getMethod("copyMemory", new Class[]{r5, r5, r5});     // Catch: Throwable -> L8
            r2.getMethod("copyMemory", new Class[]{Object.class, r5, Object.class, r5, r5});     // Catch: Throwable -> L8
            return true;
        L8:
            th = move-exception;
            e0.a(th);
            return false;
        }
    }

    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public Unsafe f25076a;

        public e(Unsafe r1) {
            this.f25076a = r1;
        }

        public final int a(Class r2) {
            return this.f25076a.arrayBaseOffset(r2);
        }

        public final int b(Class r2) {
            return this.f25076a.arrayIndexScale(r2);
        }

        public abstract boolean c(Object r1, long r2);

        public abstract double d(Object r1, long r2);

        public abstract float e(Object r1, long r2);

        public final int f(Object r2, long r3) {
            return this.f25076a.getInt(r2, r3);
        }

        public final long g(Object r2, long r3) {
            return this.f25076a.getLong(r2, r3);
        }

        public final Object h(Object r2, long r3) {
            return this.f25076a.getObject(r2, r3);
        }

        public final long i(Field r3) {
            return this.f25076a.objectFieldOffset(r3);
        }

        public abstract void j(Object r1, long r2, boolean r4);

        public abstract void k(Object r1, long r2, byte r4);

        public abstract void l(Object r1, long r2, double r4);

        public abstract void m(Object r1, long r2, float r4);

        public final void n(Object r2, long r3, int r5) {
            this.f25076a.putInt(r2, r3, r5);
        }

        public final void o(Object r7, long r8, long r10) {
            this.f25076a.putLong(r7, r8, r10);
        }

        public final void p(Object r2, long r3, Object r5) {
            this.f25076a.putObject(r2, r3, r5);
        }

        public boolean q() {
            Unsafe r2 = this.f25076a;
            if (r2 != null) goto L11;
            return false;
        L11:
            Class<?> r22 = r2.getClass();     // Catch: Throwable -> L8
            r22.getMethod("objectFieldOffset", new Class[]{Field.class});     // Catch: Throwable -> L8
            r22.getMethod("arrayBaseOffset", new Class[]{Class.class});     // Catch: Throwable -> L8
            r22.getMethod("arrayIndexScale", new Class[]{Class.class});     // Catch: Throwable -> L8
            Class r4 = Long.TYPE;     // Catch: Throwable -> L8
            r22.getMethod("getInt", new Class[]{Object.class, r4});     // Catch: Throwable -> L8
            r22.getMethod("putInt", new Class[]{Object.class, r4, Integer.TYPE});     // Catch: Throwable -> L8
            r22.getMethod("getLong", new Class[]{Object.class, r4});     // Catch: Throwable -> L8
            r22.getMethod("putLong", new Class[]{Object.class, r4, r4});     // Catch: Throwable -> L8
            r22.getMethod("getObject", new Class[]{Object.class, r4});     // Catch: Throwable -> L8
            r22.getMethod("putObject", new Class[]{Object.class, r4, Object.class});     // Catch: Throwable -> L8
            return true;
        L8:
            th = move-exception;
            e0.a(th);
            return false;
        }

        public boolean r() {
            Unsafe r02 = this.f25076a;
            if (r02 != null) goto L13;
            return false;
        L13:
            Class<?> r03 = r02.getClass();     // Catch: Throwable -> L10
            r03.getMethod("objectFieldOffset", new Class[]{Field.class});     // Catch: Throwable -> L10
            r03.getMethod("getLong", new Class[]{Object.class, Long.TYPE});     // Catch: Throwable -> L10
            if (e0.b() != null) goto L8;
            return false;
        L8:
            return true;
        L10:
            th = move-exception;
            e0.a(th);
            return false;
        }
    }

    static {
        f25054a = A();
        f25055b = AbstractC3981d.b();
        f25056c = m(Long.TYPE);
        d = m(Integer.TYPE);
        f25057e = y();
        f25058f = Q();
        f25059g = P();
        long r02 = j(byte[].class);
        f25060h = r02;
        f25061i = j(boolean[].class);
        f25062j = k(boolean[].class);
        f25063k = j(int[].class);
        f25064l = k(int[].class);
        f25065m = j(long[].class);
        f25066n = k(long[].class);
        f25067o = j(float[].class);
        f25068p = k(float[].class);
        f25069q = j(double[].class);
        f25070r = k(double[].class);
        f25071s = j(Object[].class);
        f25072t = k(Object[].class);
        f25073u = o(l());
        f25074v = (int) (r02 & 7);
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) goto L5;
        boolean r03 = true;
    L6:
        f25075w = r03;
        return;
    L5:
        r03 = false;
        goto L6
    }

    public static Unsafe A() {
        return (Unsafe) AccessController.doPrivileged(new a());
    L4:
        return null;
    }

    public static boolean B() {
        return f25059g;
    }

    public static boolean C() {
        return f25058f;
    }

    public static void D(Throwable r4) {
        Logger.getLogger(e0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + r4);
    }

    public static void E(Object r1, long r2, boolean r4) {
        f25057e.j(r1, r2, r4);
    }

    public static void F(Object r02, long r1, boolean r3) {
        I(r02, r1, r3 ? 1 : 0);
    }

    public static void G(Object r02, long r1, boolean r3) {
        J(r02, r1, r3 ? 1 : 0);
    }

    public static void H(byte[] r3, long r4, byte r6) {
        f25057e.k(r3, f25060h + r4, r6);
    }

    public static void I(Object r4, long r5, byte r7) {
        long r02 = (-4) & r5;
        int r2 = w(r4, r02);
        int r52 = ((~((int) r5)) & 3) << 3;
        int r22 = r2 & (~(Constants.MAX_HOST_LENGTH << r52));
        M(r4, r02, ((255 & r7) << r52) | r22);
    }

    public static void J(Object r4, long r5, byte r7) {
        long r02 = (-4) & r5;
        int r52 = (((int) r5) & 3) << 3;
        int r2 = w(r4, r02) & (~(Constants.MAX_HOST_LENGTH << r52));
        M(r4, r02, ((255 & r7) << r52) | r2);
    }

    public static void K(Object r6, long r7, double r9) {
        f25057e.l(r6, r7, r9);
    }

    public static void L(Object r1, long r2, float r4) {
        f25057e.m(r1, r2, r4);
    }

    public static void M(Object r1, long r2, int r4) {
        f25057e.n(r1, r2, r4);
    }

    public static void N(Object r6, long r7, long r9) {
        f25057e.o(r6, r7, r9);
    }

    public static void O(Object r1, long r2, Object r4) {
        f25057e.p(r1, r2, r4);
    }

    public static boolean P() {
        e r02 = f25057e;
        if (r02 != null) goto L7;
        return false;
    L7:
        return r02.q();
    }

    public static boolean Q() {
        e r02 = f25057e;
        if (r02 != null) goto L7;
        return false;
    L7:
        return r02.r();
    }

    public static /* synthetic */ void a(Throwable r02) {
        D(r02);
    }

    public static /* synthetic */ Field b() {
        return l();
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
        return f25054a.allocateInstance(r1);
    L4:
        e = move-exception;
        throw new IllegalStateException(e);
    }

    public static int j(Class r1) {
        if (f25059g == true) goto L5;
        return -1;
    L5:
        return f25057e.a(r1);
    }

    public static int k(Class r1) {
        if (f25059g == true) goto L5;
        return -1;
    L5:
        return f25057e.b(r1);
    }

    public static Field l() {
        if (AbstractC3981d.c() == false) goto L7;
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
        if (AbstractC3981d.c() == true) goto L9;
        return false;
    L9:
        Class r1 = f25055b;     // Catch: Throwable -> L8
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
        e r02 = f25057e;
        if (r02 != null) goto L7;
        return -1;
    L7:
        return r02.i(r2);
    L8:
        return -1;
    }

    public static boolean p(Object r1, long r2) {
        return f25057e.c(r1, r2);
    }

    public static boolean q(Object r02, long r1) {
        if (s(r02, r1) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static boolean r(Object r02, long r1) {
        if (t(r02, r1) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static byte s(Object r2, long r3) {
        return (byte) ((w(r2, (-4) & r3) >>> ((int) (((~r3) & 3) << 3))) & Constants.MAX_HOST_LENGTH);
    }

    public static byte t(Object r2, long r3) {
        return (byte) ((w(r2, (-4) & r3) >>> ((int) ((r3 & 3) << 3))) & Constants.MAX_HOST_LENGTH);
    }

    public static double u(Object r1, long r2) {
        return f25057e.d(r1, r2);
    }

    public static float v(Object r1, long r2) {
        return f25057e.e(r1, r2);
    }

    public static int w(Object r1, long r2) {
        return f25057e.f(r1, r2);
    }

    public static long x(Object r1, long r2) {
        return f25057e.g(r1, r2);
    }

    public static e y() {
        Unsafe r02 = f25054a;
        if (r02 != null) goto L6;
        return null;
    L6:
        if (AbstractC3981d.c() == false) goto L16;
        if (f25056c == false) goto L12;
        return new c(r02);
    L12:
        if (d == true) goto L14;
        return null;
    L14:
        return new b(r02);
    L16:
        return new d(r02);
    }

    public static Object z(Object r1, long r2) {
        return f25057e.h(r1, r2);
    }
}
