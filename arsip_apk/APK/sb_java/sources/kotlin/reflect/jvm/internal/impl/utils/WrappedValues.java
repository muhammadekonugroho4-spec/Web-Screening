package kotlin.reflect.jvm.internal.impl.utils;

/* loaded from: classes3.dex */
public abstract class WrappedValues {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f180246a = null;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f180247b;

    public static class WrappedProcessCanceledException extends RuntimeException {
        public WrappedProcessCanceledException(Throwable r2) {
            super("Rethrow stored exception", r2);
        }
    }

    public static class a {
        public a() {
        }

        public String toString() {
            return "NULL_VALUE";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f180248a;

        public /* synthetic */ b(Throwable r1, a r2) {
            this(r1);
        }

        public static /* synthetic */ void a(int r7) {
            if (r7 == 1) goto L5;
            String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        L7:
            if (r7 == 1) goto L9;
            int r3 = 3;
        L10:
            Object[] r32 = new Object[r3];
            if (r7 == 1) goto L13;
            r32[0] = "throwable";
        L14:
            if (r7 == 1) goto L16;
            r32[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
        L17:
            if (r7 == 1) goto L19;
            r32[2] = "<init>";
        L19:
            String r12 = String.format(r1, r32);
            if (r7 == 1) goto L23;
            throw new IllegalArgumentException(r12);
        L23:
            throw new IllegalStateException(r12);
        L16:
            r32[1] = "getThrowable";
            goto L17
        L13:
            r32[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            goto L14
        L9:
            r3 = 2;
            goto L10
        L5:
            r1 = "@NotNull method %s.%s must not return null";
            goto L7
        }

        public Throwable b() {
            Throwable r02 = this.f180248a;
            if (r02 != null) goto L5;
            a(1);
        L5:
            return r02;
        }

        public String toString() {
            return this.f180248a.toString();
        }

        public b(Throwable r2) {
            if (r2 != null) goto L4;
            a(0);
        L4:
            this.f180248a = r2;
        }
    }

    static {
        f180246a = new a();
        f180247b = false;
    }

    public static /* synthetic */ void a(int r8) {
        if (r8 == 1) goto L6;
        if (r8 == 2) goto L6;
        String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
    L8:
        if (r8 == 1) goto L11;
        if (r8 == 2) goto L11;
        int r4 = 3;
    L12:
        Object[] r42 = new Object[r4];
        if (r8 == 1) goto L18;
        if (r8 == 2) goto L18;
        if (r8 == 3) goto L17;
        r42[0] = "value";
    L19:
        if (r8 == 1) goto L22;
        if (r8 == 2) goto L22;
        r42[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
    L23:
        if (r8 == 1) goto L31;
        if (r8 == 2) goto L31;
        if (r8 != 3) goto L27;
        r42[2] = "escapeThrowable";
        goto L31
    L27:
        if (r8 == 4) goto L29;
        r42[2] = "unescapeNull";
        goto L31
    L29:
        r42[2] = "unescapeExceptionOrNull";
    L31:
        String r22 = String.format(r2, r42);
        if (r8 == 1) goto L36;
        if (r8 == 2) goto L36;
        throw new IllegalArgumentException(r22);
    L36:
        throw new IllegalStateException(r22);
    L22:
        r42[1] = "escapeNull";
        goto L23
    L17:
        r42[0] = "throwable";
    L18:
        r42[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
    L11:
        r4 = 2;
    L6:
        r2 = "@NotNull method %s.%s must not return null";
        goto L8
    }

    public static Object b(Object r1) {
        if (r1 != null) goto L6;
        r1 = f180246a;
        if (r1 != null) goto L6;
        a(1);
    L6:
        return r1;
    }

    public static Object c(Throwable r2) {
        if (r2 != null) goto L5;
        a(3);
    L5:
        return new b(r2, null);
    }

    public static Object d(Object r1) {
        if (r1 != null) goto L5;
        a(4);
    L5:
        return e(f(r1));
    }

    public static Object e(Object r1) {
        if (r1 != null) goto L5;
        a(0);
    L5:
        if (r1 != f180246a) goto L8;
        return null;
    L8:
        return r1;
    }

    public static Object f(Object r1) {
        if ((r1 instanceof b) == false) goto L12;
        Throwable r12 = ((b) r1).b();
        if (f180247b == false) goto L11;
        if (d.a(r12) == false) goto L11;
        throw new WrappedProcessCanceledException(r12);
    L11:
        throw d.b(r12);
    L12:
        return r1;
    }
}
