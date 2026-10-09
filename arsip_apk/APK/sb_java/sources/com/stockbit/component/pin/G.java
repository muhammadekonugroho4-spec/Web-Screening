package com.stockbit.component.pin;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* loaded from: classes7.dex */
public final class G {

    /* renamed from: q, reason: collision with root package name */
    public static final int f74028q = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f74029a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f74030b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f74031c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final int f74032e;

    /* renamed from: f, reason: collision with root package name */
    public final int f74033f;

    /* renamed from: g, reason: collision with root package name */
    public final int f74034g;

    /* renamed from: h, reason: collision with root package name */
    public final String f74035h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f74036i;

    /* renamed from: j, reason: collision with root package name */
    public final String f74037j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f74038k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f74039l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f74040m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f74041n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f74042o;

    /* renamed from: p, reason: collision with root package name */
    public final int f74043p;

    static {
    }

    public G(boolean r2, boolean r3, boolean r4, boolean r5, int r6, int r7, int r8, String r9, Integer r10, String r11, boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, int r17) {
        kotlin.jvm.internal.p.l(r9, "value");
        kotlin.jvm.internal.p.l(r11, "errorText");
        this.f74029a = r2;
        this.f74030b = r3;
        this.f74031c = r4;
        this.d = r5;
        this.f74032e = r6;
        this.f74033f = r7;
        this.f74034g = r8;
        this.f74035h = r9;
        this.f74036i = r10;
        this.f74037j = r11;
        this.f74038k = r12;
        this.f74039l = r13;
        this.f74040m = r14;
        this.f74041n = r15;
        this.f74042o = r16;
        this.f74043p = r17;
    }

    public static /* synthetic */ G b(G r17, boolean r18, boolean r19, boolean r20, boolean r21, int r22, int r23, int r24, String r25, Integer r26, String r27, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32, int r33, int r34, Object r35) {
        if ((r34 & 1) == 0) goto L5;
        boolean r2 = r17.f74029a;
    L7:
        if ((r34 & 2) == 0) goto L9;
        boolean r3 = r17.f74030b;
    L11:
        if ((r34 & 4) == 0) goto L13;
        boolean r4 = r17.f74031c;
    L15:
        if ((r34 & 8) == 0) goto L17;
        boolean r5 = r17.d;
    L19:
        if ((r34 & 16) == 0) goto L21;
        int r6 = r17.f74032e;
    L23:
        if ((r34 & 32) == 0) goto L25;
        int r7 = r17.f74033f;
    L27:
        if ((r34 & 64) == 0) goto L29;
        int r8 = r17.f74034g;
    L31:
        if ((r34 & 128) == 0) goto L33;
        String r9 = r17.f74035h;
    L35:
        if ((r34 & 256) == 0) goto L37;
        Integer r10 = r17.f74036i;
    L39:
        if ((r34 & 512) == 0) goto L41;
        String r11 = r17.f74037j;
    L43:
        if ((r34 & 1024) == 0) goto L45;
        boolean r12 = r17.f74038k;
    L47:
        if ((r34 & 2048) == 0) goto L49;
        boolean r13 = r17.f74039l;
    L51:
        if ((r34 & 4096) == 0) goto L53;
        boolean r14 = r17.f74040m;
    L55:
        if ((r34 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        boolean r15 = r17.f74041n;
    L58:
        boolean r182 = r2;
        if ((r34 & 16384) == 0) goto L61;
        boolean r210 = r17.f74042o;
    L63:
        if ((r34 & 32768) == 0) goto L66;
        int r342 = r17.f74043p;
    L68:
        return r17.a(r182, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r210, r342);
    L66:
        r342 = r33;
        goto L68
    L61:
        r210 = r32;
        goto L63
    L57:
        r15 = r31;
        goto L58
    L53:
        r14 = r30;
        goto L55
    L49:
        r13 = r29;
        goto L51
    L45:
        r12 = r28;
        goto L47
    L41:
        r11 = r27;
        goto L43
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
    }

    public final G a(boolean r19, boolean r20, boolean r21, boolean r22, int r23, int r24, int r25, String r26, Integer r27, String r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33, int r34) {
        kotlin.jvm.internal.p.l(r26, "value");
        kotlin.jvm.internal.p.l(r28, "errorText");
        return new G(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34);
    }

    public final int c() {
        return this.f74043p;
    }

    public final boolean d() {
        return this.f74031c;
    }

    public final String e() {
        return this.f74037j;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof G) == true) goto L8;
        return false;
    L8:
        G r52 = (G) r5;
        if (this.f74029a == r52.f74029a) goto L12;
        return false;
    L12:
        if (this.f74030b == r52.f74030b) goto L15;
        return false;
    L15:
        if (this.f74031c == r52.f74031c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f74032e == r52.f74032e) goto L24;
        return false;
    L24:
        if (this.f74033f == r52.f74033f) goto L27;
        return false;
    L27:
        if (this.f74034g == r52.f74034g) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f74035h, r52.f74035h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f74036i, r52.f74036i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f74037j, r52.f74037j) == true) goto L39;
        return false;
    L39:
        if (this.f74038k == r52.f74038k) goto L42;
        return false;
    L42:
        if (this.f74039l == r52.f74039l) goto L45;
        return false;
    L45:
        if (this.f74040m == r52.f74040m) goto L48;
        return false;
    L48:
        if (this.f74041n == r52.f74041n) goto L51;
        return false;
    L51:
        if (this.f74042o == r52.f74042o) goto L54;
        return false;
    L54:
        if (this.f74043p == r52.f74043p) goto L56;
        return false;
    L56:
        return true;
    }

    public final Integer f() {
        return this.f74036i;
    }

    public final int g() {
        return this.f74032e;
    }

    public final boolean h() {
        return this.f74042o;
    }

    public int hashCode() {
        int r02 = ((((((((((((((Boolean.hashCode(this.f74029a) * 31) + Boolean.hashCode(this.f74030b)) * 31) + Boolean.hashCode(this.f74031c)) * 31) + Boolean.hashCode(this.d)) * 31) + Integer.hashCode(this.f74032e)) * 31) + Integer.hashCode(this.f74033f)) * 31) + Integer.hashCode(this.f74034g)) * 31) + this.f74035h.hashCode()) * 31;
        Integer r1 = this.f74036i;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((((((((((((((r02 + r12) * 31) + this.f74037j.hashCode()) * 31) + Boolean.hashCode(this.f74038k)) * 31) + Boolean.hashCode(this.f74039l)) * 31) + Boolean.hashCode(this.f74040m)) * 31) + Boolean.hashCode(this.f74041n)) * 31) + Boolean.hashCode(this.f74042o)) * 31) + Integer.hashCode(this.f74043p);
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final boolean i() {
        return this.f74041n;
    }

    public final boolean j() {
        return this.f74030b;
    }

    public final boolean k() {
        return this.f74039l;
    }

    public final boolean l() {
        return this.f74040m;
    }

    public final int m() {
        return this.f74034g;
    }

    public final int n() {
        return this.f74033f;
    }

    public final String o() {
        return this.f74035h;
    }

    public final boolean p() {
        return this.f74029a;
    }

    public final boolean q() {
        return this.f74038k;
    }

    public String toString() {
        return "PinUiState(isDarkTheme=" + this.f74029a + ", showForgotPin=" + this.f74030b + ", enableSupport=" + this.f74031c + ", shouldClearPin=" + this.d + ", image=" + this.f74032e + ", title=" + this.f74033f + ", submitButton=" + this.f74034g + ", value=" + this.f74035h + ", helperText=" + this.f74036i + ", errorText=" + this.f74037j + ", isError=" + this.f74038k + ", showOutline=" + this.f74039l + ", showReveal=" + this.f74040m + ", inlineLoading=" + this.f74041n + ", inlineError=" + this.f74042o + ", cursorPosition=" + this.f74043p + ')';
    }

    public /* synthetic */ G(boolean r18, boolean r19, boolean r20, boolean r21, int r22, int r23, int r24, String r25, Integer r26, String r27, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32, int r33, int r34, kotlin.jvm.internal.i r35) {
        if ((r34 & 1) == 0) goto L5;
        boolean r1 = false;
    L7:
        if ((r34 & 2) == 0) goto L9;
        boolean r3 = false;
    L11:
        if ((r34 & 4) == 0) goto L13;
        boolean r4 = false;
    L14:
        boolean r6 = true;
        if ((r34 & 8) == 0) goto L17;
        boolean r5 = true;
    L19:
        if ((r34 & 16) == 0) goto L21;
        int r7 = J.f74053f;
    L23:
        if ((r34 & 32) == 0) goto L25;
        int r8 = K.f74070n;
    L27:
        if ((r34 & 64) == 0) goto L29;
        int r9 = K.f74069m;
    L30:
        String r11 = "";
        if ((r34 & 128) == 0) goto L33;
        String r10 = "";
    L35:
        if ((r34 & 256) == 0) goto L37;
        Integer r12 = null;
    L39:
        if ((r34 & 512) != 0) goto L43;
        r11 = r27;
    L43:
        if ((r34 & 1024) == 0) goto L45;
        boolean r13 = false;
    L47:
        if ((r34 & 2048) == 0) goto L49;
        boolean r14 = false;
    L51:
        if ((r34 & 4096) == 0) goto L53;
        boolean r15 = false;
    L55:
        if ((r34 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) goto L59;
        r6 = r31;
    L59:
        if ((r34 & 16384) == 0) goto L61;
        boolean r2 = false;
    L63:
        if ((r34 & 32768) == 0) goto L66;
        int r342 = 0;
    L67:
        this(r1, r3, r4, r5, r7, r8, r9, r10, r12, r11, r13, r14, r15, r6, r2, r342);
        return;
    L66:
        r342 = r33;
        goto L67
    L61:
        r2 = r32;
        goto L63
    L53:
        r15 = r30;
        goto L55
    L49:
        r14 = r29;
        goto L51
    L45:
        r13 = r28;
        goto L47
    L37:
        r12 = r26;
        goto L39
    L33:
        r10 = r25;
        goto L35
    L29:
        r9 = r24;
        goto L30
    L25:
        r8 = r23;
        goto L27
    L21:
        r7 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L14
    L9:
        r3 = r19;
        goto L11
    L5:
        r1 = r18;
        goto L7
    }
}
