package androidx.compose.ui.text;

/* loaded from: classes.dex */
public interface u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f20342a = null;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f20343a = null;

        /* renamed from: b, reason: collision with root package name */
        public static final u1 f20344b = null;

        /* renamed from: c, reason: collision with root package name */
        public static final u1 f20345c = null;
        public static final u1 d = null;

        static {
            f20343a = new a();
            f20344b = new r1();
            f20345c = new s1();
            d = new t1();
        }

        public a() {
        }

        public static /* synthetic */ boolean a(androidx.compose.ui.geometry.g r02, androidx.compose.ui.geometry.g r1) {
            return e(r02, r1);
        }

        public static /* synthetic */ boolean b(androidx.compose.ui.geometry.g r02, androidx.compose.ui.geometry.g r1) {
            return f(r02, r1);
        }

        public static /* synthetic */ boolean c(androidx.compose.ui.geometry.g r02, androidx.compose.ui.geometry.g r1) {
            return d(r02, r1);
        }

        public static final boolean d(androidx.compose.ui.geometry.g r02, androidx.compose.ui.geometry.g r1) {
            return r02.v(r1);
        }

        public static final boolean e(androidx.compose.ui.geometry.g r2, androidx.compose.ui.geometry.g r3) {
            if (r3.u() == false) goto L5;
            return false;
        L5:
            if (r2.k() >= r3.k()) goto L7;
            return false;
        L7:
            if (r2.l() <= r3.l()) goto L9;
            return false;
        L9:
            if (r2.n() >= r3.n()) goto L11;
            return false;
        L11:
            if (r2.e() > r3.e()) goto L19;
            return true;
        L19:
            return false;
        }

        public static final boolean f(androidx.compose.ui.geometry.g r2, androidx.compose.ui.geometry.g r3) {
            return r3.b(r2.i());
        }

        public final u1 g() {
            return f20344b;
        }

        public final u1 h() {
            return d;
        }
    }

    static {
        f20342a = a.f20343a;
    }

    boolean a(androidx.compose.ui.geometry.g r1, androidx.compose.ui.geometry.g r2);
}
