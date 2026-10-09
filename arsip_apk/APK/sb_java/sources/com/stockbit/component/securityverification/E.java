package com.stockbit.component.securityverification;

/* loaded from: classes8.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f76808a;

    /* renamed from: b, reason: collision with root package name */
    public final int f76809b;

    /* renamed from: c, reason: collision with root package name */
    public final int f76810c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f76811e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f76812f;

    /* renamed from: g, reason: collision with root package name */
    public final int f76813g;

    /* renamed from: h, reason: collision with root package name */
    public final String f76814h;

    /* renamed from: i, reason: collision with root package name */
    public final String f76815i;

    static {
    }

    public E(boolean r2, int r3, int r4, boolean r5, boolean r6, boolean r7, int r8, String r9, String r10) {
        kotlin.jvm.internal.p.l(r10, "rayId");
        this.f76808a = r2;
        this.f76809b = r3;
        this.f76810c = r4;
        this.d = r5;
        this.f76811e = r6;
        this.f76812f = r7;
        this.f76813g = r8;
        this.f76814h = r9;
        this.f76815i = r10;
    }

    public static /* synthetic */ E b(E r02, boolean r1, int r2, int r3, boolean r4, boolean r5, boolean r6, int r7, String r8, String r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r02.f76808a;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r02.f76809b;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r3 = r02.f76810c;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r5 = r02.f76811e;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r6 = r02.f76812f;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r7 = r02.f76813g;
    L24:
        if ((r10 & 128) == 0) goto L27;
        r8 = r02.f76814h;
    L27:
        if ((r10 & 256) == 0) goto L29;
        r9 = r02.f76815i;
    L29:
        String r102 = r8;
        String r112 = r9;
        boolean r82 = r6;
        int r92 = r7;
        boolean r62 = r4;
        boolean r72 = r5;
        int r52 = r3;
        boolean r32 = r1;
        return r02.a(r32, r2, r52, r62, r72, r82, r92, r102, r112);
    }

    public final E a(boolean r12, int r13, int r14, boolean r15, boolean r16, boolean r17, int r18, String r19, String r20) {
        kotlin.jvm.internal.p.l(r20, "rayId");
        return new E(r12, r13, r14, r15, r16, r17, r18, r19, r20);
    }

    public final String c() {
        return this.f76814h;
    }

    public final int d() {
        return this.f76809b;
    }

    public final boolean e() {
        if (this.f76814h == null) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof E) == true) goto L8;
        return false;
    L8:
        E r52 = (E) r5;
        if (this.f76808a == r52.f76808a) goto L12;
        return false;
    L12:
        if (this.f76809b == r52.f76809b) goto L15;
        return false;
    L15:
        if (this.f76810c == r52.f76810c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f76811e == r52.f76811e) goto L24;
        return false;
    L24:
        if (this.f76812f == r52.f76812f) goto L27;
        return false;
    L27:
        if (this.f76813g == r52.f76813g) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f76814h, r52.f76814h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f76815i, r52.f76815i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.f76815i;
    }

    public final int g() {
        return this.f76813g;
    }

    public final boolean h() {
        if (j() == true) goto L5;
        return false;
    L5:
        if (this.f76809b >= this.f76810c) goto L10;
        return true;
    L10:
        return false;
    }

    public int hashCode() {
        int r02 = ((((((((((((Boolean.hashCode(this.f76808a) * 31) + Integer.hashCode(this.f76809b)) * 31) + Integer.hashCode(this.f76810c)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f76811e)) * 31) + Boolean.hashCode(this.f76812f)) * 31) + Integer.hashCode(this.f76813g)) * 31;
        String r1 = this.f76814h;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + this.f76815i.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final boolean i() {
        if (this.f76809b < this.f76810c) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean j() {
        if (this.f76809b <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean k() {
        return this.f76808a;
    }

    public final boolean l() {
        return this.f76811e;
    }

    public final boolean m() {
        return this.f76812f;
    }

    public final boolean n() {
        return this.d;
    }

    public String toString() {
        return "SecurityVerificationUiState(isLoading=" + this.f76808a + ", failCount=" + this.f76809b + ", maxAttempt=" + this.f76810c + ", isVerificationInFlight=" + this.d + ", isOutdatedWebView=" + this.f76811e + ", isPageLoadError=" + this.f76812f + ", retryCount=" + this.f76813g + ", clearanceUrl=" + this.f76814h + ", rayId=" + this.f76815i + ')';
    }

    public /* synthetic */ E(boolean r2, int r3, int r4, boolean r5, boolean r6, boolean r7, int r8, String r9, String r10, int r11, kotlin.jvm.internal.i r12) {
        if ((r11 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r4 = 3;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = false;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r6 = false;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = false;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = 0;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = null;
    L27:
        if ((r11 & 256) == 0) goto L29;
        r10 = "";
    L29:
        String r112 = r10;
        String r102 = r9;
        int r92 = r8;
        boolean r82 = r7;
        boolean r72 = r6;
        boolean r62 = r5;
        int r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92, r102, r112);
    }
}
