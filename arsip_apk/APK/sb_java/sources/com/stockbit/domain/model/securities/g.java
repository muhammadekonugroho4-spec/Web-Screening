package com.stockbit.domain.model.securities;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import java.util.List;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final List f85230a;

    /* renamed from: b, reason: collision with root package name */
    public final b f85231b;

    /* renamed from: c, reason: collision with root package name */
    public final c f85232c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f85233a;

        /* renamed from: b, reason: collision with root package name */
        public final List f85234b;

        /* renamed from: c, reason: collision with root package name */
        public final double f85235c;

        /* renamed from: com.stockbit.domain.model.securities.g$a$a, reason: collision with other inner class name */
        public static final class C0789a {

            /* renamed from: a, reason: collision with root package name */
            public final double f85236a;

            /* renamed from: b, reason: collision with root package name */
            public final String f85237b;

            /* renamed from: c, reason: collision with root package name */
            public final String f85238c;
            public final double d;

            /* renamed from: e, reason: collision with root package name */
            public final long f85239e;

            /* renamed from: f, reason: collision with root package name */
            public final double f85240f;

            /* renamed from: g, reason: collision with root package name */
            public final double f85241g;

            /* renamed from: h, reason: collision with root package name */
            public final double f85242h;

            /* renamed from: i, reason: collision with root package name */
            public final C0790a f85243i;

            /* renamed from: j, reason: collision with root package name */
            public final String f85244j;

            /* renamed from: k, reason: collision with root package name */
            public final String f85245k;

            /* renamed from: com.stockbit.domain.model.securities.g$a$a$a, reason: collision with other inner class name */
            public static final class C0790a {

                /* renamed from: a, reason: collision with root package name */
                public final double f85246a;

                /* renamed from: b, reason: collision with root package name */
                public final double f85247b;

                /* renamed from: c, reason: collision with root package name */
                public final String f85248c;

                public C0790a(double r2, double r4, String r6) {
                    kotlin.jvm.internal.p.l(r6, NotificationCompat.CATEGORY_STATUS);
                    this.f85246a = r2;
                    this.f85247b = r4;
                    this.f85248c = r6;
                }

                public final double a() {
                    return this.f85246a;
                }

                public final double b() {
                    return this.f85247b;
                }

                public boolean equals(Object r8) {
                    if (this != r8) goto L6;
                    return true;
                L6:
                    if ((r8 instanceof C0790a) == true) goto L8;
                    return false;
                L8:
                    C0790a r82 = (C0790a) r8;
                    if (Double.compare(this.f85246a, r82.f85246a) == 0) goto L12;
                    return false;
                L12:
                    if (Double.compare(this.f85247b, r82.f85247b) == 0) goto L15;
                    return false;
                L15:
                    if (kotlin.jvm.internal.p.g(this.f85248c, r82.f85248c) == true) goto L17;
                    return false;
                L17:
                    return true;
                }

                public int hashCode() {
                    return (((Double.hashCode(this.f85246a) * 31) + Double.hashCode(this.f85247b)) * 31) + this.f85248c.hashCode();
                }

                public String toString() {
                    return "Realized(amount=" + this.f85246a + ", percentage=" + this.f85247b + ", status=" + this.f85248c + ")";
                }
            }

            public C0789a(double r5, String r7, String r8, double r9, long r11, double r13, double r15, double r17, C0790a r19, String r20, String r21) {
                kotlin.jvm.internal.p.l(r7, Constants.KEY_DATE);
                kotlin.jvm.internal.p.l(r8, "displayAs");
                kotlin.jvm.internal.p.l(r19, "realized");
                kotlin.jvm.internal.p.l(r20, "stockCode");
                kotlin.jvm.internal.p.l(r21, "transactionType");
                this.f85236a = r5;
                this.f85237b = r7;
                this.f85238c = r8;
                this.d = r9;
                this.f85239e = r11;
                this.f85240f = r13;
                this.f85241g = r15;
                this.f85242h = r17;
                this.f85243i = r19;
                this.f85244j = r20;
                this.f85245k = r21;
            }

            public final String a() {
                return this.f85237b;
            }

            public final String b() {
                return this.f85238c;
            }

            public final long c() {
                return this.f85239e;
            }

            public final C0790a d() {
                return this.f85243i;
            }

            public final String e() {
                return this.f85244j;
            }

            public boolean equals(Object r8) {
                if (this != r8) goto L6;
                return true;
            L6:
                if ((r8 instanceof C0789a) == true) goto L8;
                return false;
            L8:
                C0789a r82 = (C0789a) r8;
                if (Double.compare(this.f85236a, r82.f85236a) == 0) goto L12;
                return false;
            L12:
                if (kotlin.jvm.internal.p.g(this.f85237b, r82.f85237b) == true) goto L15;
                return false;
            L15:
                if (kotlin.jvm.internal.p.g(this.f85238c, r82.f85238c) == true) goto L18;
                return false;
            L18:
                if (Double.compare(this.d, r82.d) == 0) goto L21;
                return false;
            L21:
                if (this.f85239e == r82.f85239e) goto L24;
                return false;
            L24:
                if (Double.compare(this.f85240f, r82.f85240f) == 0) goto L27;
                return false;
            L27:
                if (Double.compare(this.f85241g, r82.f85241g) == 0) goto L30;
                return false;
            L30:
                if (Double.compare(this.f85242h, r82.f85242h) == 0) goto L33;
                return false;
            L33:
                if (kotlin.jvm.internal.p.g(this.f85243i, r82.f85243i) == true) goto L36;
                return false;
            L36:
                if (kotlin.jvm.internal.p.g(this.f85244j, r82.f85244j) == true) goto L39;
                return false;
            L39:
                if (kotlin.jvm.internal.p.g(this.f85245k, r82.f85245k) == true) goto L41;
                return false;
            L41:
                return true;
            }

            public final String f() {
                return this.f85245k;
            }

            public int hashCode() {
                return (((((((((((((((((((Double.hashCode(this.f85236a) * 31) + this.f85237b.hashCode()) * 31) + this.f85238c.hashCode()) * 31) + Double.hashCode(this.d)) * 31) + Long.hashCode(this.f85239e)) * 31) + Double.hashCode(this.f85240f)) * 31) + Double.hashCode(this.f85241g)) * 31) + Double.hashCode(this.f85242h)) * 31) + this.f85243i.hashCode()) * 31) + this.f85244j.hashCode()) * 31) + this.f85245k.hashCode();
            }

            public String toString() {
                return "Detail(amount=" + this.f85236a + ", date=" + this.f85237b + ", displayAs=" + this.f85238c + ", fee=" + this.d + ", historyId=" + this.f85239e + ", lot=" + this.f85240f + ", netAmount=" + this.f85241g + ", price=" + this.f85242h + ", realized=" + this.f85243i + ", stockCode=" + this.f85244j + ", transactionType=" + this.f85245k + ")";
            }
        }

        public a(String r2, List r3, double r4) {
            kotlin.jvm.internal.p.l(r2, Constants.KEY_DATE);
            kotlin.jvm.internal.p.l(r3, "list");
            this.f85233a = r2;
            this.f85234b = r3;
            this.f85235c = r4;
        }

        public final String a() {
            return this.f85233a;
        }

        public final List b() {
            return this.f85234b;
        }

        public final double c() {
            return this.f85235c;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof a) == true) goto L8;
            return false;
        L8:
            a r82 = (a) r8;
            if (kotlin.jvm.internal.p.g(this.f85233a, r82.f85233a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f85234b, r82.f85234b) == true) goto L15;
            return false;
        L15:
            if (Double.compare(this.f85235c, r82.f85235c) == 0) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f85233a.hashCode() * 31) + this.f85234b.hashCode()) * 31) + Double.hashCode(this.f85235c);
        }

        public String toString() {
            return "History(date=" + this.f85233a + ", list=" + this.f85234b + ", totalRealizedAmount=" + this.f85235c + ")";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final a f85249a;

        /* renamed from: b, reason: collision with root package name */
        public final C0792b f85250b;

        /* renamed from: c, reason: collision with root package name */
        public final c f85251c;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final C0791a f85252a;

            /* renamed from: b, reason: collision with root package name */
            public final C0791a f85253b;

            /* renamed from: com.stockbit.domain.model.securities.g$b$a$a, reason: collision with other inner class name */
            public static final class C0791a {

                /* renamed from: a, reason: collision with root package name */
                public final String f85254a;

                /* renamed from: b, reason: collision with root package name */
                public final String f85255b;

                public C0791a(String r2, String r3) {
                    kotlin.jvm.internal.p.l(r2, "darkMode");
                    kotlin.jvm.internal.p.l(r3, "lightMode");
                    this.f85254a = r2;
                    this.f85255b = r3;
                }

                public boolean equals(Object r5) {
                    if (this != r5) goto L6;
                    return true;
                L6:
                    if ((r5 instanceof C0791a) == true) goto L8;
                    return false;
                L8:
                    C0791a r52 = (C0791a) r5;
                    if (kotlin.jvm.internal.p.g(this.f85254a, r52.f85254a) == true) goto L12;
                    return false;
                L12:
                    if (kotlin.jvm.internal.p.g(this.f85255b, r52.f85255b) == true) goto L14;
                    return false;
                L14:
                    return true;
                }

                public int hashCode() {
                    return (this.f85254a.hashCode() * 31) + this.f85255b.hashCode();
                }

                public String toString() {
                    return "Theme(darkMode=" + this.f85254a + ", lightMode=" + this.f85255b + ")";
                }
            }

            public a(C0791a r2, C0791a r3) {
                kotlin.jvm.internal.p.l(r2, "loss");
                kotlin.jvm.internal.p.l(r3, "profit");
                this.f85252a = r2;
                this.f85253b = r3;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof a) == true) goto L8;
                return false;
            L8:
                a r52 = (a) r5;
                if (kotlin.jvm.internal.p.g(this.f85252a, r52.f85252a) == true) goto L12;
                return false;
            L12:
                if (kotlin.jvm.internal.p.g(this.f85253b, r52.f85253b) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                return (this.f85252a.hashCode() * 31) + this.f85253b.hashCode();
            }

            public String toString() {
                return "ColorCode(loss=" + this.f85252a + ", profit=" + this.f85253b + ")";
            }
        }

        /* renamed from: com.stockbit.domain.model.securities.g$b$b, reason: collision with other inner class name */
        public static final class C0792b {

            /* renamed from: a, reason: collision with root package name */
            public final a f85256a;

            /* renamed from: b, reason: collision with root package name */
            public final long f85257b;

            /* renamed from: com.stockbit.domain.model.securities.g$b$b$a */
            public static final class a {

                /* renamed from: a, reason: collision with root package name */
                public final String f85258a;

                /* renamed from: b, reason: collision with root package name */
                public final String f85259b;

                public a(String r2, String r3) {
                    kotlin.jvm.internal.p.l(r2, "next");
                    kotlin.jvm.internal.p.l(r3, "prev");
                    this.f85258a = r2;
                    this.f85259b = r3;
                }

                public final String a() {
                    return this.f85258a;
                }

                public boolean equals(Object r5) {
                    if (this != r5) goto L6;
                    return true;
                L6:
                    if ((r5 instanceof a) == true) goto L8;
                    return false;
                L8:
                    a r52 = (a) r5;
                    if (kotlin.jvm.internal.p.g(this.f85258a, r52.f85258a) == true) goto L12;
                    return false;
                L12:
                    if (kotlin.jvm.internal.p.g(this.f85259b, r52.f85259b) == true) goto L14;
                    return false;
                L14:
                    return true;
                }

                public int hashCode() {
                    return (this.f85258a.hashCode() * 31) + this.f85259b.hashCode();
                }

                public String toString() {
                    return "Cursor(next=" + this.f85258a + ", prev=" + this.f85259b + ")";
                }
            }

            public C0792b(a r2, long r3) {
                kotlin.jvm.internal.p.l(r2, "cursor");
                this.f85256a = r2;
                this.f85257b = r3;
            }

            public final a a() {
                return this.f85256a;
            }

            public boolean equals(Object r8) {
                if (this != r8) goto L6;
                return true;
            L6:
                if ((r8 instanceof C0792b) == true) goto L8;
                return false;
            L8:
                C0792b r82 = (C0792b) r8;
                if (kotlin.jvm.internal.p.g(this.f85256a, r82.f85256a) == true) goto L12;
                return false;
            L12:
                if (this.f85257b == r82.f85257b) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                return (this.f85256a.hashCode() * 31) + Long.hashCode(this.f85257b);
            }

            public String toString() {
                return "Pagination(cursor=" + this.f85256a + ", maxPage=" + this.f85257b + ")";
            }
        }

        public static final class c {

            /* renamed from: a, reason: collision with root package name */
            public final List f85260a;

            /* renamed from: b, reason: collision with root package name */
            public final String f85261b;

            public static final class a {

                /* renamed from: a, reason: collision with root package name */
                public final String f85262a;

                /* renamed from: b, reason: collision with root package name */
                public final String f85263b;

                public a(String r2, String r3) {
                    kotlin.jvm.internal.p.l(r2, "body");
                    kotlin.jvm.internal.p.l(r3, Constants.KEY_TITLE);
                    this.f85262a = r2;
                    this.f85263b = r3;
                }

                public final String a() {
                    return this.f85262a;
                }

                public final String b() {
                    return this.f85263b;
                }

                public boolean equals(Object r5) {
                    if (this != r5) goto L6;
                    return true;
                L6:
                    if ((r5 instanceof a) == true) goto L8;
                    return false;
                L8:
                    a r52 = (a) r5;
                    if (kotlin.jvm.internal.p.g(this.f85262a, r52.f85262a) == true) goto L12;
                    return false;
                L12:
                    if (kotlin.jvm.internal.p.g(this.f85263b, r52.f85263b) == true) goto L14;
                    return false;
                L14:
                    return true;
                }

                public int hashCode() {
                    return (this.f85262a.hashCode() * 31) + this.f85263b.hashCode();
                }

                public String toString() {
                    return "Content(body=" + this.f85262a + ", title=" + this.f85263b + ")";
                }
            }

            public c(List r2, String r3) {
                kotlin.jvm.internal.p.l(r2, "contents");
                kotlin.jvm.internal.p.l(r3, "header");
                this.f85260a = r2;
                this.f85261b = r3;
            }

            public final List a() {
                return this.f85260a;
            }

            public final String b() {
                return this.f85261b;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof c) == true) goto L8;
                return false;
            L8:
                c r52 = (c) r5;
                if (kotlin.jvm.internal.p.g(this.f85260a, r52.f85260a) == true) goto L12;
                return false;
            L12:
                if (kotlin.jvm.internal.p.g(this.f85261b, r52.f85261b) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                return (this.f85260a.hashCode() * 31) + this.f85261b.hashCode();
            }

            public String toString() {
                return "Tooltips(contents=" + this.f85260a + ", header=" + this.f85261b + ")";
            }
        }

        public b(a r2, C0792b r3, c r4) {
            kotlin.jvm.internal.p.l(r2, "colorCode");
            kotlin.jvm.internal.p.l(r3, "pagination");
            kotlin.jvm.internal.p.l(r4, "tooltips");
            this.f85249a = r2;
            this.f85250b = r3;
            this.f85251c = r4;
        }

        public final C0792b a() {
            return this.f85250b;
        }

        public final c b() {
            return this.f85251c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f85249a, r52.f85249a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f85250b, r52.f85250b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f85251c, r52.f85251c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f85249a.hashCode() * 31) + this.f85250b.hashCode()) * 31) + this.f85251c.hashCode();
        }

        public String toString() {
            return "Metadata(colorCode=" + this.f85249a + ", pagination=" + this.f85250b + ", tooltips=" + this.f85251c + ")";
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final a f85264a;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final double f85265a;

            /* renamed from: b, reason: collision with root package name */
            public final double f85266b;

            public a(double r1, double r3) {
                this.f85265a = r1;
                this.f85266b = r3;
            }

            public final double a() {
                return this.f85265a;
            }

            public boolean equals(Object r8) {
                if (this != r8) goto L6;
                return true;
            L6:
                if ((r8 instanceof a) == true) goto L8;
                return false;
            L8:
                a r82 = (a) r8;
                if (Double.compare(this.f85265a, r82.f85265a) == 0) goto L12;
                return false;
            L12:
                if (Double.compare(this.f85266b, r82.f85266b) == 0) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                return (Double.hashCode(this.f85265a) * 31) + Double.hashCode(this.f85266b);
            }

            public String toString() {
                return "Realized(amount=" + this.f85265a + ", percentage=" + this.f85266b + ")";
            }
        }

        public c(a r2) {
            kotlin.jvm.internal.p.l(r2, "realized");
            this.f85264a = r2;
        }

        public final a a() {
            return this.f85264a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f85264a, ((c) r4).f85264a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f85264a.hashCode();
        }

        public String toString() {
            return "Summary(realized=" + this.f85264a + ")";
        }
    }

    public g(List r2, b r3, c r4) {
        kotlin.jvm.internal.p.l(r2, "history");
        kotlin.jvm.internal.p.l(r3, "metadata");
        kotlin.jvm.internal.p.l(r4, "summary");
        this.f85230a = r2;
        this.f85231b = r3;
        this.f85232c = r4;
    }

    public final List a() {
        return this.f85230a;
    }

    public final b b() {
        return this.f85231b;
    }

    public final c c() {
        return this.f85232c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (kotlin.jvm.internal.p.g(this.f85230a, r52.f85230a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f85231b, r52.f85231b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f85232c, r52.f85232c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f85230a.hashCode() * 31) + this.f85231b.hashCode()) * 31) + this.f85232c.hashCode();
    }

    public String toString() {
        return "HistoryRealizedEntity(history=" + this.f85230a + ", metadata=" + this.f85231b + ", summary=" + this.f85232c + ")";
    }
}
