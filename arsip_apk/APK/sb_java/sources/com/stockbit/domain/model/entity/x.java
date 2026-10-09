package com.stockbit.domain.model.entity;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* loaded from: classes8.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public String f83955a;

    /* renamed from: b, reason: collision with root package name */
    public String f83956b;

    /* renamed from: c, reason: collision with root package name */
    public String f83957c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public String f83958e;

    /* renamed from: f, reason: collision with root package name */
    public String f83959f;

    /* renamed from: g, reason: collision with root package name */
    public int f83960g;

    /* renamed from: h, reason: collision with root package name */
    public String f83961h;

    /* renamed from: i, reason: collision with root package name */
    public int f83962i;

    /* renamed from: j, reason: collision with root package name */
    public String f83963j;

    /* renamed from: k, reason: collision with root package name */
    public int f83964k;

    /* renamed from: l, reason: collision with root package name */
    public String f83965l;

    /* renamed from: m, reason: collision with root package name */
    public int f83966m;

    /* renamed from: n, reason: collision with root package name */
    public String f83967n;

    /* renamed from: o, reason: collision with root package name */
    public String f83968o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f83969p;

    public x(String r6, String r7, String r8, int r9, String r10, String r11, int r12, String r13, int r14, String r15, int r16, String r17, int r18, String r19, String r20, boolean r21) {
        kotlin.jvm.internal.p.l(r6, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r7, "securityName");
        kotlin.jvm.internal.p.l(r8, "securityCode");
        kotlin.jvm.internal.p.l(r10, Constants.KEY_DATE);
        kotlin.jvm.internal.p.l(r11, "statusText");
        kotlin.jvm.internal.p.l(r13, "status1Text");
        kotlin.jvm.internal.p.l(r15, "status2Text");
        kotlin.jvm.internal.p.l(r17, "status3Text");
        kotlin.jvm.internal.p.l(r19, "notes");
        kotlin.jvm.internal.p.l(r20, "buttonText");
        this.f83955a = r6;
        this.f83956b = r7;
        this.f83957c = r8;
        this.d = r9;
        this.f83958e = r10;
        this.f83959f = r11;
        this.f83960g = r12;
        this.f83961h = r13;
        this.f83962i = r14;
        this.f83963j = r15;
        this.f83964k = r16;
        this.f83965l = r17;
        this.f83966m = r18;
        this.f83967n = r19;
        this.f83968o = r20;
        this.f83969p = r21;
    }

    public final boolean a() {
        return this.f83969p;
    }

    public final String b() {
        return this.f83968o;
    }

    public final String c() {
        return this.f83958e;
    }

    public final String d() {
        return this.f83955a;
    }

    public final String e() {
        return this.f83967n;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof x) == true) goto L8;
        return false;
    L8:
        x r52 = (x) r5;
        if (kotlin.jvm.internal.p.g(this.f83955a, r52.f83955a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f83956b, r52.f83956b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f83957c, r52.f83957c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f83958e, r52.f83958e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f83959f, r52.f83959f) == true) goto L27;
        return false;
    L27:
        if (this.f83960g == r52.f83960g) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f83961h, r52.f83961h) == true) goto L33;
        return false;
    L33:
        if (this.f83962i == r52.f83962i) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f83963j, r52.f83963j) == true) goto L39;
        return false;
    L39:
        if (this.f83964k == r52.f83964k) goto L42;
        return false;
    L42:
        if (kotlin.jvm.internal.p.g(this.f83965l, r52.f83965l) == true) goto L45;
        return false;
    L45:
        if (this.f83966m == r52.f83966m) goto L48;
        return false;
    L48:
        if (kotlin.jvm.internal.p.g(this.f83967n, r52.f83967n) == true) goto L51;
        return false;
    L51:
        if (kotlin.jvm.internal.p.g(this.f83968o, r52.f83968o) == true) goto L54;
        return false;
    L54:
        if (this.f83969p == r52.f83969p) goto L56;
        return false;
    L56:
        return true;
    }

    public final String f() {
        return this.f83957c;
    }

    public final int g() {
        return this.d;
    }

    public final String h() {
        return this.f83956b;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((this.f83955a.hashCode() * 31) + this.f83956b.hashCode()) * 31) + this.f83957c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + this.f83958e.hashCode()) * 31) + this.f83959f.hashCode()) * 31) + Integer.hashCode(this.f83960g)) * 31) + this.f83961h.hashCode()) * 31) + Integer.hashCode(this.f83962i)) * 31) + this.f83963j.hashCode()) * 31) + Integer.hashCode(this.f83964k)) * 31) + this.f83965l.hashCode()) * 31) + Integer.hashCode(this.f83966m)) * 31) + this.f83967n.hashCode()) * 31) + this.f83968o.hashCode()) * 31) + Boolean.hashCode(this.f83969p);
    }

    public final int i() {
        return this.f83962i;
    }

    public final String j() {
        return this.f83961h;
    }

    public final int k() {
        return this.f83964k;
    }

    public final String l() {
        return this.f83963j;
    }

    public final int m() {
        return this.f83966m;
    }

    public final String n() {
        return this.f83965l;
    }

    public final int o() {
        return this.f83960g;
    }

    public final String p() {
        return this.f83959f;
    }

    public String toString() {
        return "TransactionTransferStock(id=" + this.f83955a + ", securityName=" + this.f83956b + ", securityCode=" + this.f83957c + ", securityFee=" + this.d + ", date=" + this.f83958e + ", statusText=" + this.f83959f + ", statusState=" + this.f83960g + ", status1Text=" + this.f83961h + ", status1State=" + this.f83962i + ", status2Text=" + this.f83963j + ", status2State=" + this.f83964k + ", status3Text=" + this.f83965l + ", status3State=" + this.f83966m + ", notes=" + this.f83967n + ", buttonText=" + this.f83968o + ", buttonShow=" + this.f83969p + ')';
    }

    public /* synthetic */ x(String r18, String r19, String r20, int r21, String r22, String r23, int r24, String r25, int r26, String r27, int r28, String r29, int r30, String r31, String r32, boolean r33, int r34, kotlin.jvm.internal.i r35) {
        String r2 = "-";
        if ((r34 & 1) == 0) goto L5;
        String r1 = "-";
    L7:
        if ((r34 & 2) == 0) goto L9;
        String r3 = "-";
    L11:
        if ((r34 & 4) == 0) goto L13;
        String r4 = "-";
    L15:
        if ((r34 & 8) == 0) goto L17;
        int r5 = 0;
    L19:
        if ((r34 & 16) == 0) goto L21;
        String r7 = "-";
    L23:
        if ((r34 & 32) == 0) goto L25;
        String r8 = "-";
    L27:
        if ((r34 & 64) == 0) goto L29;
        int r9 = 0;
    L31:
        if ((r34 & 128) == 0) goto L33;
        String r10 = "-";
    L35:
        if ((r34 & 256) == 0) goto L37;
        int r11 = 0;
    L39:
        if ((r34 & 512) == 0) goto L41;
        String r12 = "-";
    L43:
        if ((r34 & 1024) == 0) goto L45;
        int r13 = 0;
    L47:
        if ((r34 & 2048) != 0) goto L51;
        r2 = r29;
    L51:
        if ((r34 & 4096) == 0) goto L53;
        int r14 = 0;
    L54:
        String r16 = "";
        if ((r34 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r15 = "";
    L59:
        if ((r34 & 16384) != 0) goto L63;
        r16 = r32;
    L63:
        if ((r34 & 32768) == 0) goto L66;
        boolean r342 = false;
    L67:
        this(r1, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r2, r14, r15, r16, r342);
        return;
    L66:
        r342 = r33;
        goto L67
    L57:
        r15 = r31;
        goto L59
    L53:
        r14 = r30;
        goto L54
    L45:
        r13 = r28;
        goto L47
    L41:
        r12 = r27;
        goto L43
    L37:
        r11 = r26;
        goto L39
    L33:
        r10 = r25;
        goto L35
    L29:
        r9 = r24;
        goto L31
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
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r1 = r18;
        goto L7
    }
}
