package androidx.compose.ui.window;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20832a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20833b;

    /* renamed from: c, reason: collision with root package name */
    public final SecureFlagPolicy f20834c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f20835e;

    /* renamed from: f, reason: collision with root package name */
    public final String f20836f;

    static {
    }

    public g(boolean r1, boolean r2, SecureFlagPolicy r3, boolean r4, boolean r5, String r6) {
        this.f20832a = r1;
        this.f20833b = r2;
        this.f20834c = r3;
        this.d = r4;
        this.f20835e = r5;
        this.f20836f = r6;
    }

    public final boolean a() {
        return this.f20835e;
    }

    public final boolean b() {
        return this.f20832a;
    }

    public final boolean c() {
        return this.f20833b;
    }

    public final SecureFlagPolicy d() {
        return this.f20834c;
    }

    public final boolean e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (this.f20832a == r52.f20832a) goto L12;
        return false;
    L12:
        if (this.f20833b == r52.f20833b) goto L15;
        return false;
    L15:
        if (this.f20834c == r52.f20834c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f20835e == r52.f20835e) goto L23;
        return false;
    L23:
        return true;
    }

    public final String f() {
        return this.f20836f;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f20832a) * 31) + Boolean.hashCode(this.f20833b)) * 31) + this.f20834c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f20835e);
    }

    public /* synthetic */ g(boolean r2, boolean r3, SecureFlagPolicy r4, boolean r5, boolean r6, String r7, int r8, kotlin.jvm.internal.i r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = true;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = true;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = SecureFlagPolicy.Inherit;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = true;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = true;
    L18:
        if ((r8 & 32) == 0) goto L20;
        r7 = "";
    L20:
        String r82 = r7;
        boolean r72 = r6;
        boolean r62 = r5;
        SecureFlagPolicy r52 = r4;
        this(r2, r3, r52, r62, r72, r82);
    }

    public /* synthetic */ g(boolean r2, boolean r3, boolean r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = true;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = true;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = true;
    L11:
        this(r2, r3, r4);
    }

    public g(boolean r10, boolean r11, boolean r12) {
        boolean r5 = true;
        String r6 = null;
        this(r10, r11, SecureFlagPolicy.Inherit, r12, r5, r6, 32, null);
    }
}
