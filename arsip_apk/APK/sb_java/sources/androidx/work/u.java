package androidx.work;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes4.dex */
public interface u {

    /* renamed from: a, reason: collision with root package name */
    public static final b.c f29642a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final b.C0281b f29643b = null;

    public static /* synthetic */ class a {
    }

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public final Throwable f29644a;

            public a(Throwable r1) {
                this.f29644a = r1;
            }

            public String toString() {
                return "FAILURE (" + this.f29644a.getMessage() + ")";
            }
        }

        /* renamed from: androidx.work.u$b$b, reason: collision with other inner class name */
        public static final class C0281b extends b {
            public /* synthetic */ C0281b(a r1) {
                this();
            }

            public String toString() {
                return "IN_PROGRESS";
            }

            public C0281b() {
            }
        }

        public static final class c extends b {
            public /* synthetic */ c(a r1) {
                this();
            }

            public String toString() {
                return "SUCCESS";
            }

            public c() {
            }
        }

        public b() {
        }
    }

    static {
        a r1 = null;
        f29642a = new b.c(r1);
        f29643b = new b.C0281b(r1);
    }

    ListenableFuture getResult();
}
