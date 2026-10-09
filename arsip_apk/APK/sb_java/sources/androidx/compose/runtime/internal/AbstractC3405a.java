package androidx.compose.runtime.internal;

/* renamed from: androidx.compose.runtime.internal.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3405a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0112a f16292a = null;

    /* renamed from: androidx.compose.runtime.internal.a$a, reason: collision with other inner class name */
    public static final class C0112a {
        public /* synthetic */ C0112a(kotlin.jvm.internal.i r1) {
            this();
        }

        public C0112a() {
        }
    }

    static {
        f16292a = new C0112a(null);
    }

    public static final /* synthetic */ int a(AtomicInt r02, int r1, int r2) {
        return d(r02, r1, r2);
    }

    public static AtomicInt b() {
        return c(new AtomicInt(0));
    }

    public static AtomicInt c(AtomicInt r02) {
        return r02;
    }

    public static final int d(AtomicInt r02, int r1, int r2) {
        return ((r1 & 15) << 27) | (134217727 & r2);
    }
}
