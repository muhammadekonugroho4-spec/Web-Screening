package com.stockbit.domain.model.emitten;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f82237a;

    /* renamed from: b, reason: collision with root package name */
    public final List f82238b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f82239a;

        /* renamed from: b, reason: collision with root package name */
        public final String f82240b;

        /* renamed from: c, reason: collision with root package name */
        public final String f82241c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f82242e;

        /* renamed from: f, reason: collision with root package name */
        public final String f82243f;

        /* renamed from: g, reason: collision with root package name */
        public final String f82244g;

        /* renamed from: h, reason: collision with root package name */
        public final String f82245h;

        /* renamed from: i, reason: collision with root package name */
        public final String f82246i;

        public a(int r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10) {
            p.l(r3, Constants.KEY_ID);
            p.l(r4, "symbol");
            p.l(r5, AppMeasurementSdk.ConditionalUserProperty.NAME);
            p.l(r6, "percentage");
            p.l(r7, "change");
            p.l(r8, "lastIndex");
            p.l(r9, "marketCap");
            p.l(r10, "valueMa20");
            this.f82239a = r2;
            this.f82240b = r3;
            this.f82241c = r4;
            this.d = r5;
            this.f82242e = r6;
            this.f82243f = r7;
            this.f82244g = r8;
            this.f82245h = r9;
            this.f82246i = r10;
        }

        public final String a() {
            return this.f82243f;
        }

        public final String b() {
            return this.f82240b;
        }

        public final String c() {
            return this.f82244g;
        }

        public final String d() {
            return this.f82245h;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f82239a == r52.f82239a) goto L12;
            return false;
        L12:
            if (p.g(this.f82240b, r52.f82240b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f82241c, r52.f82241c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f82242e, r52.f82242e) == true) goto L24;
            return false;
        L24:
            if (p.g(this.f82243f, r52.f82243f) == true) goto L27;
            return false;
        L27:
            if (p.g(this.f82244g, r52.f82244g) == true) goto L30;
            return false;
        L30:
            if (p.g(this.f82245h, r52.f82245h) == true) goto L33;
            return false;
        L33:
            if (p.g(this.f82246i, r52.f82246i) == true) goto L35;
            return false;
        L35:
            return true;
        }

        public final String f() {
            return this.f82242e;
        }

        public final String g() {
            return this.f82241c;
        }

        public final String h() {
            return this.f82246i;
        }

        public int hashCode() {
            return (((((((((((((((Integer.hashCode(this.f82239a) * 31) + this.f82240b.hashCode()) * 31) + this.f82241c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82242e.hashCode()) * 31) + this.f82243f.hashCode()) * 31) + this.f82244g.hashCode()) * 31) + this.f82245h.hashCode()) * 31) + this.f82246i.hashCode();
        }

        public String toString() {
            return "IndexesItem(parentId=" + this.f82239a + ", id=" + this.f82240b + ", symbol=" + this.f82241c + ", name=" + this.d + ", percentage=" + this.f82242e + ", change=" + this.f82243f + ", lastIndex=" + this.f82244g + ", marketCap=" + this.f82245h + ", valueMa20=" + this.f82246i + ")";
        }
    }

    public d(List r2, List r3) {
        p.l(r2, "main");
        p.l(r3, "all");
        this.f82237a = r2;
        this.f82238b = r3;
    }

    public final List a() {
        return this.f82238b;
    }

    public final List b() {
        return this.f82237a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f82237a, r52.f82237a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82238b, r52.f82238b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f82237a.hashCode() * 31) + this.f82238b.hashCode();
    }

    public String toString() {
        return "EmittenIndexesEntity(main=" + this.f82237a + ", all=" + this.f82238b + ")";
    }
}
