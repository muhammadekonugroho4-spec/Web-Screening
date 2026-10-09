package com.stockbit.usecase.company.model.ownershipallocation;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class g {

    public static final class a extends g {

        /* renamed from: a, reason: collision with root package name */
        public final h f156417a;

        /* renamed from: b, reason: collision with root package name */
        public final List f156418b;

        public a(h r2, List r3) {
            p.l(r2, "mainEmitten");
            p.l(r3, "investors");
            super(null);
            this.f156417a = r2;
            this.f156418b = r3;
        }

        public final List a() {
            return this.f156418b;
        }

        public final h b() {
            return this.f156417a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f156417a, r52.f156417a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f156418b, r52.f156418b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f156417a.hashCode() * 31) + this.f156418b.hashCode();
        }

        public String toString() {
            return "EmittenMode(mainEmitten=" + this.f156417a + ", investors=" + this.f156418b + ")";
        }
    }

    public static final class b extends g {

        /* renamed from: a, reason: collision with root package name */
        public final i f156419a;

        /* renamed from: b, reason: collision with root package name */
        public final List f156420b;

        public b(i r2, List r3) {
            p.l(r2, "mainInvestor");
            p.l(r3, "emittens");
            super(null);
            this.f156419a = r2;
            this.f156420b = r3;
        }

        public final List a() {
            return this.f156420b;
        }

        public final i b() {
            return this.f156419a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f156419a, r52.f156419a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f156420b, r52.f156420b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f156419a.hashCode() * 31) + this.f156420b.hashCode();
        }

        public String toString() {
            return "InvestorMode(mainInvestor=" + this.f156419a + ", emittens=" + this.f156420b + ")";
        }
    }

    public /* synthetic */ g(kotlin.jvm.internal.i r1) {
        this();
    }

    public g() {
    }
}
