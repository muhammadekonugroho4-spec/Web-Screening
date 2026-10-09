package com.stockbit.usecase.bonds.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f154523a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f154524a;

        /* renamed from: b, reason: collision with root package name */
        public final String f154525b;

        /* renamed from: c, reason: collision with root package name */
        public final String f154526c;
        public final String d;

        public a(String r2, String r3, String r4, String r5) {
            p.l(r2, "productId");
            p.l(r3, "dueDateInfo");
            p.l(r4, "yield");
            p.l(r5, FirebaseAnalytics.Param.PRICE);
            this.f154524a = r2;
            this.f154525b = r3;
            this.f154526c = r4;
            this.d = r5;
        }

        public final String a() {
            return this.f154525b;
        }

        public final String b() {
            return this.d;
        }

        public final String c() {
            return this.f154524a;
        }

        public final String d() {
            return this.f154526c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f154524a, r52.f154524a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f154525b, r52.f154525b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f154526c, r52.f154526c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            return (((((this.f154524a.hashCode() * 31) + this.f154525b.hashCode()) * 31) + this.f154526c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "Item(productId=" + this.f154524a + ", dueDateInfo=" + this.f154525b + ", yield=" + this.f154526c + ", price=" + this.d + ")";
        }
    }

    public b(List r2) {
        p.l(r2, FirebaseAnalytics.Param.ITEMS);
        this.f154523a = r2;
    }

    public final List a() {
        return this.f154523a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f154523a, ((b) r4).f154523a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f154523a.hashCode();
    }

    public String toString() {
        return "BondCatalogUIState(items=" + this.f154523a + ")";
    }
}
