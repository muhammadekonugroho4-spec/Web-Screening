package com.stockbit.domain.model.company;

import java.util.List;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final a f81530a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final List f81531a;

        /* renamed from: b, reason: collision with root package name */
        public final List f81532b;

        public a(List r2, List r3) {
            kotlin.jvm.internal.p.l(r2, "accounts");
            kotlin.jvm.internal.p.l(r3, "periods");
            this.f81531a = r2;
            this.f81532b = r3;
        }

        public final List a() {
            return this.f81531a;
        }

        public final List b() {
            return this.f81532b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f81531a, r52.f81531a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f81532b, r52.f81532b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f81531a.hashCode() * 31) + this.f81532b.hashCode();
        }

        public String toString() {
            return "TableEntity(accounts=" + this.f81531a + ", periods=" + this.f81532b + ")";
        }
    }

    public h(a r2) {
        kotlin.jvm.internal.p.l(r2, "dataTables");
        this.f81530a = r2;
    }

    public final a a() {
        return this.f81530a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof h) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f81530a, ((h) r4).f81530a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f81530a.hashCode();
    }

    public String toString() {
        return "CompanyFinancialTableEntity(dataTables=" + this.f81530a + ")";
    }
}
