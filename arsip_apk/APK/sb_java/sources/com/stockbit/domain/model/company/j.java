package com.stockbit.domain.model.company;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f81635a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81636b;

    /* renamed from: c, reason: collision with root package name */
    public final a f81637c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f81638a;

        /* renamed from: b, reason: collision with root package name */
        public final String f81639b;

        public a(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, "lightMode");
            kotlin.jvm.internal.p.l(r3, "darkMode");
            this.f81638a = r2;
            this.f81639b = r3;
        }

        public final String a() {
            return this.f81639b;
        }

        public final String b() {
            return this.f81638a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f81638a, r52.f81638a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f81639b, r52.f81639b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f81638a.hashCode() * 31) + this.f81639b.hashCode();
        }

        public String toString() {
            return "IconUrlEntity(lightMode=" + this.f81638a + ", darkMode=" + this.f81639b + ")";
        }
    }

    public j(String r2, String r3, a r4) {
        kotlin.jvm.internal.p.l(r2, "notationCode");
        kotlin.jvm.internal.p.l(r3, "notationDesc");
        kotlin.jvm.internal.p.l(r4, "iconUrl");
        this.f81635a = r2;
        this.f81636b = r3;
        this.f81637c = r4;
    }

    public final a a() {
        return this.f81637c;
    }

    public final String b() {
        return this.f81635a;
    }

    public final String c() {
        return this.f81636b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (kotlin.jvm.internal.p.g(this.f81635a, r52.f81635a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f81636b, r52.f81636b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f81637c, r52.f81637c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f81635a.hashCode() * 31) + this.f81636b.hashCode()) * 31) + this.f81637c.hashCode();
    }

    public String toString() {
        return "CompanyNotationEntity(notationCode=" + this.f81635a + ", notationDesc=" + this.f81636b + ", iconUrl=" + this.f81637c + ")";
    }
}
