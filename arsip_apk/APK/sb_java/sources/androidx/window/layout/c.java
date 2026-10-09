package androidx.window.layout;

/* loaded from: classes4.dex */
public interface c extends androidx.window.layout.a {

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0271a f28956b = null;

        /* renamed from: c, reason: collision with root package name */
        public static final a f28957c = null;
        public static final a d = null;

        /* renamed from: a, reason: collision with root package name */
        public final String f28958a;

        /* renamed from: androidx.window.layout.c$a$a, reason: collision with other inner class name */
        public static final class C0271a {
            public /* synthetic */ C0271a(kotlin.jvm.internal.i r1) {
                this();
            }

            public C0271a() {
            }
        }

        static {
            f28956b = new C0271a(null);
            f28957c = new a("VERTICAL");
            d = new a("HORIZONTAL");
        }

        public a(String r1) {
            this.f28958a = r1;
        }

        public String toString() {
            return this.f28958a;
        }
    }

    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final a f28959b = null;

        /* renamed from: c, reason: collision with root package name */
        public static final b f28960c = null;
        public static final b d = null;

        /* renamed from: a, reason: collision with root package name */
        public final String f28961a;

        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.i r1) {
                this();
            }

            public a() {
            }
        }

        static {
            f28959b = new a(null);
            f28960c = new b("FLAT");
            d = new b("HALF_OPENED");
        }

        public b(String r1) {
            this.f28961a = r1;
        }

        public String toString() {
            return this.f28961a;
        }
    }

    a a();

    boolean b();
}
