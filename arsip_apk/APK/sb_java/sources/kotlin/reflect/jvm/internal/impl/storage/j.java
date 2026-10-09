package kotlin.reflect.jvm.internal.impl.storage;

/* loaded from: classes3.dex */
public interface j {

    /* renamed from: a, reason: collision with root package name */
    public static final a f179954a = null;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f179955a = null;

        static {
            f179955a = new a();
        }

        public a() {
        }

        public final d a(Runnable r2, kotlin.jvm.functions.l r3) {
            if (r2 == null) goto L7;
            if (r3 == null) goto L7;
            return new c(r2, r3);
        L7:
            return new d(null, 1, null);
        }
    }

    static {
        f179954a = a.f179955a;
    }

    void lock();

    void unlock();
}
