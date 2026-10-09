package com.stockbit.usecase.company.model.keystats;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f156269a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f156270b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f156271c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f156272e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f156273f;

    /* renamed from: g, reason: collision with root package name */
    public final String f156274g;

    /* renamed from: h, reason: collision with root package name */
    public final List f156275h;

    /* renamed from: i, reason: collision with root package name */
    public final List f156276i;

    /* renamed from: com.stockbit.usecase.company.model.keystats.a$a, reason: collision with other inner class name */
    public static final class C1434a {

        /* renamed from: a, reason: collision with root package name */
        public final String f156277a;

        /* renamed from: b, reason: collision with root package name */
        public final String f156278b;

        /* renamed from: c, reason: collision with root package name */
        public final String f156279c;

        public C1434a(String r2, String r3, String r4) {
            p.l(r2, "dividend");
            p.l(r3, "payoutRatio");
            p.l(r4, "dividendYield");
            this.f156277a = r2;
            this.f156278b = r3;
            this.f156279c = r4;
        }

        public final String a() {
            return this.f156277a;
        }

        public final String b() {
            return this.f156279c;
        }

        public final String c() {
            return this.f156278b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1434a) == true) goto L8;
            return false;
        L8:
            C1434a r52 = (C1434a) r5;
            if (p.g(this.f156277a, r52.f156277a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f156278b, r52.f156278b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f156279c, r52.f156279c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f156277a.hashCode() * 31) + this.f156278b.hashCode()) * 31) + this.f156279c.hashCode();
        }

        public String toString() {
            return "Dividend(dividend=" + this.f156277a + ", payoutRatio=" + this.f156278b + ", dividendYield=" + this.f156279c + ")";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f156280a;

        /* renamed from: b, reason: collision with root package name */
        public final String f156281b;

        /* renamed from: c, reason: collision with root package name */
        public final String f156282c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f156283e;

        /* renamed from: f, reason: collision with root package name */
        public final String f156284f;

        /* renamed from: g, reason: collision with root package name */
        public final String f156285g;

        public b(String r2, String r3, String r4, String r5, String r6, String r7, String r8) {
            p.l(r2, "year");
            p.l(r3, "q1");
            p.l(r4, "q2");
            p.l(r5, "q3");
            p.l(r6, "q4");
            p.l(r7, "annualised");
            p.l(r8, "ttm");
            this.f156280a = r2;
            this.f156281b = r3;
            this.f156282c = r4;
            this.d = r5;
            this.f156283e = r6;
            this.f156284f = r7;
            this.f156285g = r8;
        }

        public final String a() {
            return this.f156284f;
        }

        public final String b() {
            return this.f156281b;
        }

        public final String c() {
            return this.f156282c;
        }

        public final String d() {
            return this.d;
        }

        public final String e() {
            return this.f156283e;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f156280a, r52.f156280a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f156281b, r52.f156281b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f156282c, r52.f156282c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f156283e, r52.f156283e) == true) goto L24;
            return false;
        L24:
            if (p.g(this.f156284f, r52.f156284f) == true) goto L27;
            return false;
        L27:
            if (p.g(this.f156285g, r52.f156285g) == true) goto L29;
            return false;
        L29:
            return true;
        }

        public final String f() {
            return this.f156285g;
        }

        public final String g() {
            return this.f156280a;
        }

        public int hashCode() {
            return (((((((((((this.f156280a.hashCode() * 31) + this.f156281b.hashCode()) * 31) + this.f156282c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f156283e.hashCode()) * 31) + this.f156284f.hashCode()) * 31) + this.f156285g.hashCode();
        }

        public String toString() {
            return "Item(year=" + this.f156280a + ", q1=" + this.f156281b + ", q2=" + this.f156282c + ", q3=" + this.d + ", q4=" + this.f156283e + ", annualised=" + this.f156284f + ", ttm=" + this.f156285g + ")";
        }
    }

    public a(boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, String r8, List r9, List r10) {
        p.l(r8, "mostRecentQuarter");
        p.l(r9, FirebaseAnalytics.Param.ITEMS);
        p.l(r10, "dividends");
        this.f156269a = r2;
        this.f156270b = r3;
        this.f156271c = r4;
        this.d = r5;
        this.f156272e = r6;
        this.f156273f = r7;
        this.f156274g = r8;
        this.f156275h = r9;
        this.f156276i = r10;
    }

    public final List a() {
        return this.f156276i;
    }

    public final List b() {
        return this.f156275h;
    }

    public final String c() {
        return this.f156274g;
    }

    public final boolean d() {
        return this.f156272e;
    }

    public final boolean e() {
        return this.f156269a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f156269a == r52.f156269a) goto L12;
        return false;
    L12:
        if (this.f156270b == r52.f156270b) goto L15;
        return false;
    L15:
        if (this.f156271c == r52.f156271c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f156272e == r52.f156272e) goto L24;
        return false;
    L24:
        if (this.f156273f == r52.f156273f) goto L27;
        return false;
    L27:
        if (p.g(this.f156274g, r52.f156274g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f156275h, r52.f156275h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f156276i, r52.f156276i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final boolean f() {
        return this.f156270b;
    }

    public final boolean g() {
        return this.f156271c;
    }

    public final boolean h() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.f156269a) * 31) + Boolean.hashCode(this.f156270b)) * 31) + Boolean.hashCode(this.f156271c)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f156272e)) * 31) + Boolean.hashCode(this.f156273f)) * 31) + this.f156274g.hashCode()) * 31) + this.f156275h.hashCode()) * 31) + this.f156276i.hashCode();
    }

    public final boolean i() {
        return this.f156273f;
    }

    public String toString() {
        return "KeyStatsPeriodUIState(isQ1NewUpdate=" + this.f156269a + ", isQ2NewUpdate=" + this.f156270b + ", isQ3NewUpdate=" + this.f156271c + ", isQ4NewUpdate=" + this.d + ", isAnnualisedNewUpdate=" + this.f156272e + ", isTtmNewUpdate=" + this.f156273f + ", mostRecentQuarter=" + this.f156274g + ", items=" + this.f156275h + ", dividends=" + this.f156276i + ")";
    }
}
