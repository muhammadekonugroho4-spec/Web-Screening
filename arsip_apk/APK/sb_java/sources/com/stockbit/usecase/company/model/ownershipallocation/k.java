package com.stockbit.usecase.company.model.ownershipallocation;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class k {

    public static final class a extends k {

        /* renamed from: a, reason: collision with root package name */
        public final String f156431a;

        /* renamed from: b, reason: collision with root package name */
        public final String f156432b;

        /* renamed from: c, reason: collision with root package name */
        public final String f156433c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f156434e;

        /* renamed from: f, reason: collision with root package name */
        public final String f156435f;

        /* renamed from: g, reason: collision with root package name */
        public final List f156436g;

        public a(String r2, String r3, String r4, String r5, String r6, String r7, List r8) {
            p.l(r2, "companyId");
            p.l(r3, "symbol");
            p.l(r4, "companyName");
            p.l(r5, "iconUrl");
            p.l(r6, "reportDate");
            p.l(r7, "subtitle");
            p.l(r8, "holdings");
            super(null);
            this.f156431a = r2;
            this.f156432b = r3;
            this.f156433c = r4;
            this.d = r5;
            this.f156434e = r6;
            this.f156435f = r7;
            this.f156436g = r8;
        }

        @Override // com.stockbit.usecase.company.model.ownershipallocation.k
        public List a() {
            return this.f156436g;
        }

        public final String b() {
            return this.f156433c;
        }

        public String c() {
            return this.f156433c;
        }

        public final String d() {
            return this.d;
        }

        public String e() {
            return this.f156434e;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f156431a, r52.f156431a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f156432b, r52.f156432b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f156433c, r52.f156433c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f156434e, r52.f156434e) == true) goto L24;
            return false;
        L24:
            if (p.g(this.f156435f, r52.f156435f) == true) goto L27;
            return false;
        L27:
            if (p.g(this.f156436g, r52.f156436g) == true) goto L29;
            return false;
        L29:
            return true;
        }

        public String f() {
            return this.f156435f;
        }

        public final String g() {
            return this.f156432b;
        }

        public int hashCode() {
            return (((((((((((this.f156431a.hashCode() * 31) + this.f156432b.hashCode()) * 31) + this.f156433c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f156434e.hashCode()) * 31) + this.f156435f.hashCode()) * 31) + this.f156436g.hashCode();
        }

        public String toString() {
            return "CompanyMode(companyId=" + this.f156431a + ", symbol=" + this.f156432b + ", companyName=" + this.f156433c + ", iconUrl=" + this.d + ", reportDate=" + this.f156434e + ", subtitle=" + this.f156435f + ", holdings=" + this.f156436g + ")";
        }
    }

    public static final class b extends k {

        /* renamed from: a, reason: collision with root package name */
        public final long f156437a;

        /* renamed from: b, reason: collision with root package name */
        public final String f156438b;

        /* renamed from: c, reason: collision with root package name */
        public final String f156439c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f156440e;

        /* renamed from: f, reason: collision with root package name */
        public final String f156441f;

        /* renamed from: g, reason: collision with root package name */
        public final List f156442g;

        public b(long r2, String r4, String r5, String r6, String r7, String r8, List r9) {
            p.l(r4, "investorName");
            p.l(r5, "investorClassification");
            p.l(r6, "investorLocation");
            p.l(r7, "reportDate");
            p.l(r8, "subtitle");
            p.l(r9, "holdings");
            super(null);
            this.f156437a = r2;
            this.f156438b = r4;
            this.f156439c = r5;
            this.d = r6;
            this.f156440e = r7;
            this.f156441f = r8;
            this.f156442g = r9;
        }

        @Override // com.stockbit.usecase.company.model.ownershipallocation.k
        public List a() {
            return this.f156442g;
        }

        public String b() {
            return this.f156438b;
        }

        public String c() {
            return this.f156440e;
        }

        public String d() {
            return this.f156441f;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof b) == true) goto L8;
            return false;
        L8:
            b r82 = (b) r8;
            if (this.f156437a == r82.f156437a) goto L12;
            return false;
        L12:
            if (p.g(this.f156438b, r82.f156438b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f156439c, r82.f156439c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r82.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f156440e, r82.f156440e) == true) goto L24;
            return false;
        L24:
            if (p.g(this.f156441f, r82.f156441f) == true) goto L27;
            return false;
        L27:
            if (p.g(this.f156442g, r82.f156442g) == true) goto L29;
            return false;
        L29:
            return true;
        }

        public int hashCode() {
            return (((((((((((Long.hashCode(this.f156437a) * 31) + this.f156438b.hashCode()) * 31) + this.f156439c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f156440e.hashCode()) * 31) + this.f156441f.hashCode()) * 31) + this.f156442g.hashCode();
        }

        public String toString() {
            return "InvestorMode(investorId=" + this.f156437a + ", investorName=" + this.f156438b + ", investorClassification=" + this.f156439c + ", investorLocation=" + this.d + ", reportDate=" + this.f156440e + ", subtitle=" + this.f156441f + ", holdings=" + this.f156442g + ")";
        }
    }

    public /* synthetic */ k(kotlin.jvm.internal.i r1) {
        this();
    }

    public abstract List a();

    public k() {
    }
}
