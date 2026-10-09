package com.stockbit.domain.model.bonds;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f80860a;

    /* renamed from: com.stockbit.domain.model.bonds.a$a, reason: collision with other inner class name */
    public static final class C0771a {

        /* renamed from: a, reason: collision with root package name */
        public final String f80861a;

        /* renamed from: b, reason: collision with root package name */
        public final String f80862b;

        /* renamed from: c, reason: collision with root package name */
        public final String f80863c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f80864e;

        /* renamed from: f, reason: collision with root package name */
        public final Date f80865f;

        /* renamed from: g, reason: collision with root package name */
        public final BondBadgeType f80866g;

        public C0771a(String r2, String r3, String r4, String r5, String r6, Date r7, BondBadgeType r8) {
            p.l(r2, Constants.KEY_ID);
            p.l(r3, "symbol");
            p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
            p.l(r5, "yield");
            p.l(r6, "bidPrice");
            p.l(r7, "dueDate");
            p.l(r8, "badge");
            this.f80861a = r2;
            this.f80862b = r3;
            this.f80863c = r4;
            this.d = r5;
            this.f80864e = r6;
            this.f80865f = r7;
            this.f80866g = r8;
        }

        public final BondBadgeType a() {
            return this.f80866g;
        }

        public final String b() {
            return this.f80864e;
        }

        public final Date c() {
            return this.f80865f;
        }

        public final String d() {
            return this.f80863c;
        }

        public final String e() {
            return this.f80862b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0771a) == true) goto L8;
            return false;
        L8:
            C0771a r52 = (C0771a) r5;
            if (p.g(this.f80861a, r52.f80861a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f80862b, r52.f80862b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f80863c, r52.f80863c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f80864e, r52.f80864e) == true) goto L24;
            return false;
        L24:
            if (p.g(this.f80865f, r52.f80865f) == true) goto L27;
            return false;
        L27:
            if (this.f80866g == r52.f80866g) goto L29;
            return false;
        L29:
            return true;
        }

        public final String f() {
            return this.d;
        }

        public int hashCode() {
            return (((((((((((this.f80861a.hashCode() * 31) + this.f80862b.hashCode()) * 31) + this.f80863c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f80864e.hashCode()) * 31) + this.f80865f.hashCode()) * 31) + this.f80866g.hashCode();
        }

        public String toString() {
            return "Company(id=" + this.f80861a + ", symbol=" + this.f80862b + ", name=" + this.f80863c + ", yield=" + this.d + ", bidPrice=" + this.f80864e + ", dueDate=" + this.f80865f + ", badge=" + this.f80866g + ")";
        }
    }

    public a(List r2) {
        p.l(r2, "companies");
        this.f80860a = r2;
    }

    public final List a() {
        return this.f80860a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof a) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f80860a, ((a) r4).f80860a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f80860a.hashCode();
    }

    public String toString() {
        return "BondDiscoverEntity(companies=" + this.f80860a + ")";
    }
}
