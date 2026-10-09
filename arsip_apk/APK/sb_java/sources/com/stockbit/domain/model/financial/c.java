package com.stockbit.domain.model.financial;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f84016a;

    /* renamed from: b, reason: collision with root package name */
    public final double f84017b;

    /* renamed from: c, reason: collision with root package name */
    public final double f84018c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final double f84019e;

    /* renamed from: f, reason: collision with root package name */
    public final double f84020f;

    /* renamed from: g, reason: collision with root package name */
    public final double f84021g;

    /* renamed from: h, reason: collision with root package name */
    public final double f84022h;

    /* renamed from: i, reason: collision with root package name */
    public final double f84023i;

    /* renamed from: j, reason: collision with root package name */
    public final double f84024j;

    /* renamed from: k, reason: collision with root package name */
    public final String f84025k;

    /* renamed from: l, reason: collision with root package name */
    public final double f84026l;

    /* renamed from: m, reason: collision with root package name */
    public final double f84027m;

    /* renamed from: n, reason: collision with root package name */
    public final double f84028n;

    /* renamed from: o, reason: collision with root package name */
    public final double f84029o;

    /* renamed from: p, reason: collision with root package name */
    public final double f84030p;

    /* renamed from: q, reason: collision with root package name */
    public final String f84031q;

    /* renamed from: r, reason: collision with root package name */
    public final long f84032r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f84033s;

    /* renamed from: t, reason: collision with root package name */
    public final long f84034t;

    /* renamed from: u, reason: collision with root package name */
    public final long f84035u;

    /* renamed from: v, reason: collision with root package name */
    public final long f84036v;

    /* renamed from: w, reason: collision with root package name */
    public final long f84037w;

    /* renamed from: x, reason: collision with root package name */
    public final String f84038x;

    public c(String r5, double r6, double r8, double r10, double r12, double r14, double r16, double r18, double r20, double r22, String r24, double r25, double r27, double r29, double r31, double r33, String r35, long r36, boolean r38, long r39, long r41, long r43, long r45, String r47) {
        p.l(r5, "stockCode");
        p.l(r24, Constants.KEY_DATE);
        p.l(r35, "orderVerb");
        p.l(r47, "boardType");
        this.f84016a = r5;
        this.f84017b = r6;
        this.f84018c = r8;
        this.d = r10;
        this.f84019e = r12;
        this.f84020f = r14;
        this.f84021g = r16;
        this.f84022h = r18;
        this.f84023i = r20;
        this.f84024j = r22;
        this.f84025k = r24;
        this.f84026l = r25;
        this.f84027m = r27;
        this.f84028n = r29;
        this.f84029o = r31;
        this.f84030p = r33;
        this.f84031q = r35;
        this.f84032r = r36;
        this.f84033s = r38;
        this.f84034t = r39;
        this.f84035u = r41;
        this.f84036v = r43;
        this.f84037w = r45;
        this.f84038x = r47;
    }

    public final double a() {
        return this.f84024j;
    }

    public final String b() {
        return this.f84038x;
    }

    public final double c() {
        return this.f84030p;
    }

    public final double d() {
        return this.f84029o;
    }

    public final double e() {
        return this.f84021g;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (p.g(this.f84016a, r82.f84016a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f84017b, r82.f84017b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f84018c, r82.f84018c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (Double.compare(this.f84019e, r82.f84019e) == 0) goto L24;
        return false;
    L24:
        if (Double.compare(this.f84020f, r82.f84020f) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.f84021g, r82.f84021g) == 0) goto L30;
        return false;
    L30:
        if (Double.compare(this.f84022h, r82.f84022h) == 0) goto L33;
        return false;
    L33:
        if (Double.compare(this.f84023i, r82.f84023i) == 0) goto L36;
        return false;
    L36:
        if (Double.compare(this.f84024j, r82.f84024j) == 0) goto L39;
        return false;
    L39:
        if (p.g(this.f84025k, r82.f84025k) == true) goto L42;
        return false;
    L42:
        if (Double.compare(this.f84026l, r82.f84026l) == 0) goto L45;
        return false;
    L45:
        if (Double.compare(this.f84027m, r82.f84027m) == 0) goto L48;
        return false;
    L48:
        if (Double.compare(this.f84028n, r82.f84028n) == 0) goto L51;
        return false;
    L51:
        if (Double.compare(this.f84029o, r82.f84029o) == 0) goto L54;
        return false;
    L54:
        if (Double.compare(this.f84030p, r82.f84030p) == 0) goto L57;
        return false;
    L57:
        if (p.g(this.f84031q, r82.f84031q) == true) goto L60;
        return false;
    L60:
        if (this.f84032r == r82.f84032r) goto L63;
        return false;
    L63:
        if (this.f84033s == r82.f84033s) goto L66;
        return false;
    L66:
        if (this.f84034t == r82.f84034t) goto L69;
        return false;
    L69:
        if (this.f84035u == r82.f84035u) goto L72;
        return false;
    L72:
        if (this.f84036v == r82.f84036v) goto L75;
        return false;
    L75:
        if (this.f84037w == r82.f84037w) goto L78;
        return false;
    L78:
        if (p.g(this.f84038x, r82.f84038x) == true) goto L80;
        return false;
    L80:
        return true;
    }

    public final double f() {
        return this.f84022h;
    }

    public final double g() {
        return this.f84023i;
    }

    public final double h() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((this.f84016a.hashCode() * 31) + Double.hashCode(this.f84017b)) * 31) + Double.hashCode(this.f84018c)) * 31) + Double.hashCode(this.d)) * 31) + Double.hashCode(this.f84019e)) * 31) + Double.hashCode(this.f84020f)) * 31) + Double.hashCode(this.f84021g)) * 31) + Double.hashCode(this.f84022h)) * 31) + Double.hashCode(this.f84023i)) * 31) + Double.hashCode(this.f84024j)) * 31) + this.f84025k.hashCode()) * 31) + Double.hashCode(this.f84026l)) * 31) + Double.hashCode(this.f84027m)) * 31) + Double.hashCode(this.f84028n)) * 31) + Double.hashCode(this.f84029o)) * 31) + Double.hashCode(this.f84030p)) * 31) + this.f84031q.hashCode()) * 31) + Long.hashCode(this.f84032r)) * 31) + Boolean.hashCode(this.f84033s)) * 31) + Long.hashCode(this.f84034t)) * 31) + Long.hashCode(this.f84035u)) * 31) + Long.hashCode(this.f84036v)) * 31) + Long.hashCode(this.f84037w)) * 31) + this.f84038x.hashCode();
    }

    public final double i() {
        return this.f84017b;
    }

    public final double j() {
        return this.f84019e;
    }

    public final double k() {
        return this.f84020f;
    }

    public final double l() {
        return this.f84027m;
    }

    public final String m() {
        return this.f84016a;
    }

    public final double n() {
        return this.f84028n;
    }

    public final double o() {
        return this.f84018c;
    }

    public String toString() {
        return "LivePriceEntity(stockCode=" + this.f84016a + ", lastPrice=" + this.f84017b + ", volume=" + this.f84018c + ", high=" + this.d + ", low=" + this.f84019e + ", open=" + this.f84020f + ", frequency=" + this.f84021g + ", frgBuy=" + this.f84022h + ", frgSell=" + this.f84023i + ", average=" + this.f84024j + ", date=" + this.f84025k + ", close=" + this.f84026l + ", previous=" + this.f84027m + ", value=" + this.f84028n + ", changeValue=" + this.f84029o + ", changePercentage=" + this.f84030p + ", orderVerb=" + this.f84031q + ", quantity=" + this.f84032r + ", isIndex=" + this.f84033s + ", sequenceNumber=" + this.f84034t + ", orderBookId=" + this.f84035u + ", orderNumber=" + this.f84036v + ", matchNumber=" + this.f84037w + ", boardType=" + this.f84038x + ")";
    }

    public /* synthetic */ c(String r45, double r46, double r48, double r50, double r52, double r54, double r56, double r58, double r60, double r62, String r64, double r65, double r67, double r69, double r71, double r73, String r75, long r76, boolean r78, long r79, long r81, long r83, long r85, String r87, int r88, i r89) {
        if ((r88 & 1) == 0) goto L5;
        String r1 = "";
    L7:
        if ((r88 & 2) == 0) goto L9;
        double r6 = 0.0d;
    L11:
        if ((r88 & 4) == 0) goto L13;
        double r8 = 0.0d;
    L15:
        if ((r88 & 8) == 0) goto L17;
        double r10 = 0.0d;
    L19:
        if ((r88 & 16) == 0) goto L21;
        double r12 = 0.0d;
    L23:
        if ((r88 & 32) == 0) goto L25;
        double r14 = 0.0d;
    L27:
        if ((r88 & 64) == 0) goto L29;
        double r16 = 0.0d;
    L31:
        if ((r88 & 128) == 0) goto L33;
        double r18 = 0.0d;
    L35:
        if ((r88 & 256) == 0) goto L37;
        double r20 = 0.0d;
    L39:
        if ((r88 & 512) == 0) goto L41;
        double r22 = 0.0d;
    L43:
        if ((r88 & 1024) == 0) goto L45;
        String r3 = "";
    L47:
        if ((r88 & 2048) == 0) goto L49;
        double r4 = 0.0d;
    L50:
        String r452 = r1;
        if ((r88 & 4096) == 0) goto L53;
        double r26 = 0.0d;
    L55:
        if ((r88 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        double r28 = 0.0d;
    L59:
        if ((r88 & 16384) == 0) goto L61;
        double r30 = 0.0d;
    L63:
        if ((32768 & r88) == 0) goto L65;
        double r24 = 0.0d;
    L67:
        if ((65536 & r88) == 0) goto L69;
        String r13 = "";
    L70:
        long r33 = 0;
        if ((r88 & 131072) == 0) goto L73;
        long r35 = 0;
    L75:
        if ((r88 & 262144) == 0) goto L77;
        boolean r32 = false;
    L79:
        if ((r88 & 524288) == 0) goto L81;
        long r37 = 0;
    L83:
        if ((r88 & 1048576) == 0) goto L85;
        long r39 = 0;
    L87:
        if ((r88 & 2097152) == 0) goto L89;
        long r41 = 0;
    L91:
        if ((r88 & 4194304) != 0) goto L95;
        r33 = r85;
    L95:
        if ((r88 & 8388608) == 0) goto L98;
        String r882 = "";
    L99:
        this(r452, r6, r8, r10, r12, r14, r16, r18, r20, r22, r3, r4, r26, r28, r30, r24, r13, r35, r32, r37, r39, r41, r33, r882);
        return;
    L98:
        r882 = r87;
        goto L99
    L89:
        r41 = r83;
        goto L91
    L85:
        r39 = r81;
        goto L87
    L81:
        r37 = r79;
        goto L83
    L77:
        r32 = r78;
        goto L79
    L73:
        r35 = r76;
        goto L75
    L69:
        r13 = r75;
        goto L70
    L65:
        r24 = r73;
        goto L67
    L61:
        r30 = r71;
        goto L63
    L57:
        r28 = r69;
        goto L59
    L53:
        r26 = r67;
        goto L55
    L49:
        r4 = r65;
        goto L50
    L45:
        r3 = r64;
        goto L47
    L41:
        r22 = r62;
        goto L43
    L37:
        r20 = r60;
        goto L39
    L33:
        r18 = r58;
        goto L35
    L29:
        r16 = r56;
        goto L31
    L25:
        r14 = r54;
        goto L27
    L21:
        r12 = r52;
        goto L23
    L17:
        r10 = r50;
        goto L19
    L13:
        r8 = r48;
        goto L15
    L9:
        r6 = r46;
        goto L11
    L5:
        r1 = r45;
        goto L7
    }
}
