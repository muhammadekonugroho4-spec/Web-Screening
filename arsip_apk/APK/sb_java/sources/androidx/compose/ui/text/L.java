package androidx.compose.ui.text;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: c, reason: collision with root package name */
    public static final a f19657c = null;
    public static final L d = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19658a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19659b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final L a() {
            return L.a();
        }

        public a() {
        }
    }

    static {
        f19657c = new a(null);
        d = new L();
    }

    public /* synthetic */ L(int r1, boolean r2, kotlin.jvm.internal.i r3) {
        this(r1, r2);
    }

    public static final /* synthetic */ L a() {
        return d;
    }

    public final int b() {
        return this.f19659b;
    }

    public final boolean c() {
        return this.f19658a;
    }

    public final L d(L r1) {
        if (r1 != null) goto L4;
        return this;
    L4:
        return r1;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof L) == true) goto L8;
        return false;
    L8:
        L r52 = (L) r5;
        if (this.f19658a == r52.f19658a) goto L12;
        return false;
    L12:
        if (C3814n.g(this.f19659b, r52.f19659b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f19658a) * 31) + C3814n.h(this.f19659b);
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f19658a + ", emojiSupportMatch=" + C3814n.i(this.f19659b) + ')';
    }

    public L(boolean r1) {
        this.f19658a = r1;
        this.f19659b = C3814n.f20152b.b();
    }

    public L(int r1, boolean r2) {
        this.f19658a = r2;
        this.f19659b = r1;
    }

    public L() {
        this(C3814n.f20152b.b(), false, null);
    }
}
