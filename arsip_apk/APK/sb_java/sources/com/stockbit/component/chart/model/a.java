package com.stockbit.component.chart.model;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f69788a;

    /* renamed from: b, reason: collision with root package name */
    public double f69789b;

    /* renamed from: c, reason: collision with root package name */
    public double f69790c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final C0701a f69791e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f69792f;

    /* renamed from: com.stockbit.component.chart.model.a$a, reason: collision with other inner class name */
    public static final class C0701a {

        /* renamed from: a, reason: collision with root package name */
        public final String f69793a;

        /* renamed from: b, reason: collision with root package name */
        public final String f69794b;

        /* renamed from: c, reason: collision with root package name */
        public final String f69795c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f69796e;

        static {
        }

        public C0701a(String r2, String r3, String r4, String r5, String r6) {
            p.l(r2, "open");
            p.l(r3, Constants.PRIORITY_HIGH);
            p.l(r4, "low");
            p.l(r5, Constants.KEY_HIDE_CLOSE);
            p.l(r6, "volume");
            this.f69793a = r2;
            this.f69794b = r3;
            this.f69795c = r4;
            this.d = r5;
            this.f69796e = r6;
        }

        public final String a() {
            return this.d;
        }

        public final String b() {
            return this.f69794b;
        }

        public final String c() {
            return this.f69795c;
        }

        public final String d() {
            return this.f69793a;
        }

        public final String e() {
            return this.f69796e;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0701a) == true) goto L8;
            return false;
        L8:
            C0701a r52 = (C0701a) r5;
            if (p.g(this.f69793a, r52.f69793a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f69794b, r52.f69794b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f69795c, r52.f69795c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f69796e, r52.f69796e) == true) goto L23;
            return false;
        L23:
            return true;
        }

        public int hashCode() {
            return (((((((this.f69793a.hashCode() * 31) + this.f69794b.hashCode()) * 31) + this.f69795c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f69796e.hashCode();
        }

        public String toString() {
            return "OHLCVolumeDataChart(open=" + this.f69793a + ", high=" + this.f69794b + ", low=" + this.f69795c + ", close=" + this.d + ", volume=" + this.f69796e + ')';
        }

        public /* synthetic */ C0701a(String r2, String r3, String r4, String r5, String r6, int r7, i r8) {
            if ((r7 & 1) == 0) goto L6;
            r2 = "";
        L6:
            if ((r7 & 2) == 0) goto L9;
            r3 = "";
        L9:
            if ((r7 & 4) == 0) goto L12;
            r4 = "";
        L12:
            if ((r7 & 8) == 0) goto L15;
            r5 = "";
        L15:
            if ((r7 & 16) == 0) goto L18;
            String r72 = "";
        L17:
            String r62 = r5;
            String r52 = r4;
            String r42 = r3;
            this(r2, r42, r52, r62, r72);
            return;
        L18:
            r72 = r6;
            goto L17
        }
    }

    static {
    }

    public a(String r2, double r3, double r5, double r7, C0701a r9, boolean r10) {
        p.l(r9, "ohlcVol");
        this.f69788a = r2;
        this.f69789b = r3;
        this.f69790c = r5;
        this.d = r7;
        this.f69791e = r9;
        this.f69792f = r10;
    }

    public static /* synthetic */ a b(a r02, String r1, double r2, double r4, double r6, C0701a r8, boolean r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r02.f69788a;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r02.f69789b;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = r02.f69790c;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r6 = r02.d;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r8 = r02.f69791e;
    L18:
        if ((r10 & 32) == 0) goto L20;
        r9 = r02.f69792f;
    L20:
        double r82 = r6;
        double r62 = r4;
        double r42 = r2;
        String r3 = r1;
        return r02.a(r3, r42, r62, r82, r8, r9);
    }

    public final a a(String r12, double r13, double r15, double r17, C0701a r19, boolean r20) {
        p.l(r19, "ohlcVol");
        return new a(r12, r13, r15, r17, r19, r20);
    }

    public final double c() {
        return this.f69790c;
    }

    public final String d() {
        return this.f69788a;
    }

    public final C0701a e() {
        return this.f69791e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f69788a, r82.f69788a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f69789b, r82.f69789b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f69790c, r82.f69790c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (p.g(this.f69791e, r82.f69791e) == true) goto L24;
        return false;
    L24:
        if (this.f69792f == r82.f69792f) goto L26;
        return false;
    L26:
        return true;
    }

    public final double f() {
        return this.f69789b;
    }

    public final double g() {
        return this.d;
    }

    public final boolean h() {
        return this.f69792f;
    }

    public int hashCode() {
        String r02 = this.f69788a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (((((((((r03 * 31) + Double.hashCode(this.f69789b)) * 31) + Double.hashCode(this.f69790c)) * 31) + Double.hashCode(this.d)) * 31) + this.f69791e.hashCode()) * 31) + Boolean.hashCode(this.f69792f);
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "AdditionalDataChart(formattedDate=" + this.f69788a + ", percentage=" + this.f69789b + ", change=" + this.f69790c + ", previousPrice=" + this.d + ", ohlcVol=" + this.f69791e + ", shouldDraw=" + this.f69792f + ')';
    }

    public /* synthetic */ a(String r16, double r17, double r19, double r21, C0701a r23, boolean r24, int r25, i r26) {
        if ((r25 & 1) == 0) goto L5;
        String r02 = null;
    L6:
        double r2 = 0.0d;
        if ((r25 & 2) == 0) goto L9;
        double r4 = 0.0d;
    L11:
        if ((r25 & 4) == 0) goto L13;
        double r6 = 0.0d;
    L15:
        if ((r25 & 8) != 0) goto L19;
        r2 = r21;
    L19:
        if ((r25 & 16) == 0) goto L21;
        C0701a r1 = new C0701a(null, null, null, null, null, 31, null);
    L23:
        if ((r25 & 32) == 0) goto L26;
        boolean r252 = true;
    L27:
        this(r02, r4, r6, r2, r1, r252);
        return;
    L26:
        r252 = r24;
        goto L27
    L21:
        r1 = r23;
        goto L23
    L13:
        r6 = r19;
        goto L15
    L9:
        r4 = r17;
        goto L11
    L5:
        r02 = r16;
        goto L6
    }
}
