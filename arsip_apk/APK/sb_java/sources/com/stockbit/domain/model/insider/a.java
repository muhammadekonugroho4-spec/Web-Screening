package com.stockbit.domain.model.insider;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f84114a;

    /* renamed from: b, reason: collision with root package name */
    public final List f84115b;

    /* renamed from: com.stockbit.domain.model.insider.a$a, reason: collision with other inner class name */
    public static final class C0778a {

        /* renamed from: a, reason: collision with root package name */
        public final String f84116a;

        /* renamed from: b, reason: collision with root package name */
        public final List f84117b;

        /* renamed from: c, reason: collision with root package name */
        public final C0779a f84118c;
        public final c d;

        /* renamed from: e, reason: collision with root package name */
        public final String f84119e;

        /* renamed from: f, reason: collision with root package name */
        public final c f84120f;

        /* renamed from: g, reason: collision with root package name */
        public final b f84121g;

        /* renamed from: h, reason: collision with root package name */
        public final String f84122h;

        /* renamed from: i, reason: collision with root package name */
        public final String f84123i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f84124j;

        /* renamed from: k, reason: collision with root package name */
        public final String f84125k;

        /* renamed from: l, reason: collision with root package name */
        public final String f84126l;

        /* renamed from: m, reason: collision with root package name */
        public final String f84127m;

        /* renamed from: n, reason: collision with root package name */
        public final c f84128n;

        /* renamed from: o, reason: collision with root package name */
        public final String f84129o;

        /* renamed from: p, reason: collision with root package name */
        public final String f84130p;

        /* renamed from: com.stockbit.domain.model.insider.a$a$a, reason: collision with other inner class name */
        public static final class C0779a {

            /* renamed from: a, reason: collision with root package name */
            public final String f84131a;

            /* renamed from: b, reason: collision with root package name */
            public final String f84132b;

            public C0779a(String r2, String r3) {
                p.l(r2, "code");
                p.l(r3, "group");
                this.f84131a = r2;
                this.f84132b = r3;
            }

            public final String a() {
                return this.f84131a;
            }

            public final String b() {
                return this.f84132b;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof C0779a) == true) goto L8;
                return false;
            L8:
                C0779a r52 = (C0779a) r5;
                if (p.g(this.f84131a, r52.f84131a) == true) goto L12;
                return false;
            L12:
                if (p.g(this.f84132b, r52.f84132b) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                return (this.f84131a.hashCode() * 31) + this.f84132b.hashCode();
            }

            public String toString() {
                return "BrokerDetail(code=" + this.f84131a + ", group=" + this.f84132b + ")";
            }
        }

        /* renamed from: com.stockbit.domain.model.insider.a$a$b */
        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            public final String f84133a;

            /* renamed from: b, reason: collision with root package name */
            public final String f84134b;

            public b(String r2, String r3) {
                p.l(r2, Constants.ScionAnalytics.PARAM_LABEL);
                p.l(r3, "type");
                this.f84133a = r2;
                this.f84134b = r3;
            }

            public final String a() {
                return this.f84134b;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof b) == true) goto L8;
                return false;
            L8:
                b r52 = (b) r5;
                if (p.g(this.f84133a, r52.f84133a) == true) goto L12;
                return false;
            L12:
                if (p.g(this.f84134b, r52.f84134b) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                return (this.f84133a.hashCode() * 31) + this.f84134b.hashCode();
            }

            public String toString() {
                return "DataSource(label=" + this.f84133a + ", type=" + this.f84134b + ")";
            }
        }

        /* renamed from: com.stockbit.domain.model.insider.a$a$c */
        public static final class c {

            /* renamed from: a, reason: collision with root package name */
            public final String f84135a;

            /* renamed from: b, reason: collision with root package name */
            public final String f84136b;

            /* renamed from: c, reason: collision with root package name */
            public final String f84137c;

            public c(String r2, String r3, String r4) {
                p.l(r2, "formattedValue");
                p.l(r3, "percentage");
                p.l(r4, "value");
                this.f84135a = r2;
                this.f84136b = r3;
                this.f84137c = r4;
            }

            public final String a() {
                return this.f84135a;
            }

            public final String b() {
                return this.f84136b;
            }

            public final String c() {
                return this.f84137c;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof c) == true) goto L8;
                return false;
            L8:
                c r52 = (c) r5;
                if (p.g(this.f84135a, r52.f84135a) == true) goto L12;
                return false;
            L12:
                if (p.g(this.f84136b, r52.f84136b) == true) goto L15;
                return false;
            L15:
                if (p.g(this.f84137c, r52.f84137c) == true) goto L17;
                return false;
            L17:
                return true;
            }

            public int hashCode() {
                return (((this.f84135a.hashCode() * 31) + this.f84136b.hashCode()) * 31) + this.f84137c.hashCode();
            }

            public String toString() {
                return "PercentageAndValue(formattedValue=" + this.f84135a + ", percentage=" + this.f84136b + ", value=" + this.f84137c + ")";
            }
        }

        public C0778a(String r17, List r18, C0779a r19, c r20, String r21, c r22, b r23, String r24, String r25, boolean r26, String r27, String r28, String r29, c r30, String r31, String r32) {
            p.l(r17, "actionType");
            p.l(r18, "badges");
            p.l(r19, "brokerDetail");
            p.l(r20, "changes");
            p.l(r21, "cmhId");
            p.l(r22, "current");
            p.l(r23, "dataSource");
            p.l(r24, com.clevertap.android.sdk.Constants.KEY_DATE);
            p.l(r25, com.clevertap.android.sdk.Constants.KEY_ID);
            p.l(r27, "marker");
            p.l(r28, AppMeasurementSdk.ConditionalUserProperty.NAME);
            p.l(r29, "nationality");
            p.l(r30, "previous");
            p.l(r31, "priceFormatted");
            p.l(r32, "symbol");
            this.f84116a = r17;
            this.f84117b = r18;
            this.f84118c = r19;
            this.d = r20;
            this.f84119e = r21;
            this.f84120f = r22;
            this.f84121g = r23;
            this.f84122h = r24;
            this.f84123i = r25;
            this.f84124j = r26;
            this.f84125k = r27;
            this.f84126l = r28;
            this.f84127m = r29;
            this.f84128n = r30;
            this.f84129o = r31;
            this.f84130p = r32;
        }

        public final String a() {
            return this.f84116a;
        }

        public final List b() {
            return this.f84117b;
        }

        public final C0779a c() {
            return this.f84118c;
        }

        public final c d() {
            return this.d;
        }

        public final c e() {
            return this.f84120f;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0778a) == true) goto L8;
            return false;
        L8:
            C0778a r52 = (C0778a) r5;
            if (p.g(this.f84116a, r52.f84116a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f84117b, r52.f84117b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f84118c, r52.f84118c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f84119e, r52.f84119e) == true) goto L24;
            return false;
        L24:
            if (p.g(this.f84120f, r52.f84120f) == true) goto L27;
            return false;
        L27:
            if (p.g(this.f84121g, r52.f84121g) == true) goto L30;
            return false;
        L30:
            if (p.g(this.f84122h, r52.f84122h) == true) goto L33;
            return false;
        L33:
            if (p.g(this.f84123i, r52.f84123i) == true) goto L36;
            return false;
        L36:
            if (this.f84124j == r52.f84124j) goto L39;
            return false;
        L39:
            if (p.g(this.f84125k, r52.f84125k) == true) goto L42;
            return false;
        L42:
            if (p.g(this.f84126l, r52.f84126l) == true) goto L45;
            return false;
        L45:
            if (p.g(this.f84127m, r52.f84127m) == true) goto L48;
            return false;
        L48:
            if (p.g(this.f84128n, r52.f84128n) == true) goto L51;
            return false;
        L51:
            if (p.g(this.f84129o, r52.f84129o) == true) goto L54;
            return false;
        L54:
            if (p.g(this.f84130p, r52.f84130p) == true) goto L56;
            return false;
        L56:
            return true;
        }

        public final b f() {
            return this.f84121g;
        }

        public final String g() {
            return this.f84122h;
        }

        public final String h() {
            return this.f84123i;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((this.f84116a.hashCode() * 31) + this.f84117b.hashCode()) * 31) + this.f84118c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f84119e.hashCode()) * 31) + this.f84120f.hashCode()) * 31) + this.f84121g.hashCode()) * 31) + this.f84122h.hashCode()) * 31) + this.f84123i.hashCode()) * 31) + Boolean.hashCode(this.f84124j)) * 31) + this.f84125k.hashCode()) * 31) + this.f84126l.hashCode()) * 31) + this.f84127m.hashCode()) * 31) + this.f84128n.hashCode()) * 31) + this.f84129o.hashCode()) * 31) + this.f84130p.hashCode();
        }

        public final String i() {
            return this.f84126l;
        }

        public final String j() {
            return this.f84127m;
        }

        public final c k() {
            return this.f84128n;
        }

        public final String l() {
            return this.f84129o;
        }

        public final String m() {
            return this.f84130p;
        }

        public String toString() {
            return "Movement(actionType=" + this.f84116a + ", badges=" + this.f84117b + ", brokerDetail=" + this.f84118c + ", changes=" + this.d + ", cmhId=" + this.f84119e + ", current=" + this.f84120f + ", dataSource=" + this.f84121g + ", date=" + this.f84122h + ", id=" + this.f84123i + ", isPosted=" + this.f84124j + ", marker=" + this.f84125k + ", name=" + this.f84126l + ", nationality=" + this.f84127m + ", previous=" + this.f84128n + ", priceFormatted=" + this.f84129o + ", symbol=" + this.f84130p + ")";
        }
    }

    public a(boolean r2, List r3) {
        p.l(r3, "movement");
        this.f84114a = r2;
        this.f84115b = r3;
    }

    public final List a() {
        return this.f84115b;
    }

    public final boolean b() {
        return this.f84114a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f84114a == r52.f84114a) goto L12;
        return false;
    L12:
        if (p.g(this.f84115b, r52.f84115b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f84114a) * 31) + this.f84115b.hashCode();
    }

    public String toString() {
        return "InsiderActivityEntity(isMore=" + this.f84114a + ", movement=" + this.f84115b + ")";
    }
}
