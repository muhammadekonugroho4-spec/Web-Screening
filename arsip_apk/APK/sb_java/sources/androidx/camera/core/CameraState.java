package androidx.camera.core;

/* loaded from: classes.dex */
public abstract class CameraState {

    public enum Type extends Enum<Type> {
        public static final Type CLOSED = null;
        public static final Type CLOSING = null;
        public static final Type OPEN = null;
        public static final Type OPENING = null;
        public static final Type PENDING_OPEN = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Type[] f4755a = null;

        static {
            PENDING_OPEN = new Type("PENDING_OPEN", 0);
            OPENING = new Type("OPENING", 1);
            OPEN = new Type("OPEN", 2);
            CLOSING = new Type("CLOSING", 3);
            CLOSED = new Type("CLOSED", 4);
            f4755a = a();
        }

        Type(String r1, int r2) {
        }

        public static /* synthetic */ Type[] a() {
            return new Type[]{PENDING_OPEN, OPENING, OPEN, CLOSING, CLOSED};
        }

        public static Type valueOf(String r1) {
            return (Type) Enum.valueOf(Type.class, r1);
        }

        public static Type[] values() {
            return (Type[]) f4755a.clone();
        }
    }

    public static abstract class a {
        public a() {
        }

        public static a a(int r1) {
            return b(r1, null);
        }

        public static a b(int r1, Throwable r2) {
            return new C2218g(r1, r2);
        }

        public abstract Throwable c();

        public abstract int d();
    }

    public CameraState() {
    }

    public static CameraState a(Type r1) {
        return b(r1, null);
    }

    public static CameraState b(Type r1, a r2) {
        return new C2216f(r1, r2);
    }

    public abstract a c();

    public abstract Type d();
}
