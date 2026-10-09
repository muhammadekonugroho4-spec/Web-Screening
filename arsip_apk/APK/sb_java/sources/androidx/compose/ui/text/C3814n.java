package androidx.compose.ui.text;

/* renamed from: androidx.compose.ui.text.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3814n {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20152b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f20153c = 0;
    public static final int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f20154e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f20155a;

    /* renamed from: androidx.compose.ui.text.n$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final int a() {
            return C3814n.a();
        }

        public final int b() {
            return C3814n.b();
        }

        public final int c() {
            return C3814n.c();
        }

        public a() {
        }
    }

    static {
        f20152b = new a(null);
        f20153c = e(0);
        d = e(1);
        f20154e = e(2);
    }

    public /* synthetic */ C3814n(int r1) {
        this.f20155a = r1;
    }

    public static final /* synthetic */ int a() {
        return f20154e;
    }

    public static final /* synthetic */ int b() {
        return f20153c;
    }

    public static final /* synthetic */ int c() {
        return d;
    }

    public static final /* synthetic */ C3814n d(int r1) {
        return new C3814n(r1);
    }

    public static int e(int r02) {
        return r02;
    }

    public static boolean f(int r2, Object r3) {
        if ((r3 instanceof C3814n) == true) goto L6;
        return false;
    L6:
        if (r2 == ((C3814n) r3).j()) goto L8;
        return false;
    L8:
        return true;
    }

    public static final boolean g(int r02, int r1) {
        if (r02 != r1) goto L5;
        return true;
    L5:
        return false;
    }

    public static int h(int r02) {
        return Integer.hashCode(r02);
    }

    public static String i(int r2) {
        if (r2 != f20153c) goto L7;
        return "EmojiSupportMatch.Default";
    L7:
        if (r2 != d) goto L11;
        return "EmojiSupportMatch.None";
    L11:
        if (r2 != f20154e) goto L15;
        return "EmojiSupportMatch.All";
    L15:
        return "Invalid(value=" + r2 + ')';
    }

    public boolean equals(Object r2) {
        return f(this.f20155a, r2);
    }

    public int hashCode() {
        return h(this.f20155a);
    }

    public final /* synthetic */ int j() {
        return this.f20155a;
    }

    public String toString() {
        return i(this.f20155a);
    }
}
