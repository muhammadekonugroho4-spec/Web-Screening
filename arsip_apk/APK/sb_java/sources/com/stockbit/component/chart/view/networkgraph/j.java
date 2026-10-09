package com.stockbit.component.chart.view.networkgraph;

import java.util.List;

/* loaded from: classes7.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int f69978a = 0;

    public static final class a extends j {

        /* renamed from: b, reason: collision with root package name */
        public final g f69979b;

        /* renamed from: c, reason: collision with root package name */
        public final List f69980c;

        static {
        }

        public a(g r2, List r3) {
            kotlin.jvm.internal.p.l(r2, "mainEmitten");
            kotlin.jvm.internal.p.l(r3, "investors");
            super(null);
            this.f69979b = r2;
            this.f69980c = r3;
        }

        public final List a() {
            return this.f69980c;
        }

        public final g b() {
            return this.f69979b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f69979b, r52.f69979b) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f69980c, r52.f69980c) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f69979b.hashCode() * 31) + this.f69980c.hashCode();
        }

        public String toString() {
            return "EmittenMode(mainEmitten=" + this.f69979b + ", investors=" + this.f69980c + ')';
        }
    }

    public static final class b extends j {

        /* renamed from: b, reason: collision with root package name */
        public final h f69981b;

        /* renamed from: c, reason: collision with root package name */
        public final List f69982c;

        static {
        }

        public b(h r2, List r3) {
            kotlin.jvm.internal.p.l(r2, "mainInvestor");
            kotlin.jvm.internal.p.l(r3, "emittens");
            super(null);
            this.f69981b = r2;
            this.f69982c = r3;
        }

        public final List a() {
            return this.f69982c;
        }

        public final h b() {
            return this.f69981b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f69981b, r52.f69981b) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f69982c, r52.f69982c) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f69981b.hashCode() * 31) + this.f69982c.hashCode();
        }

        public String toString() {
            return "InvestorMode(mainInvestor=" + this.f69981b + ", emittens=" + this.f69982c + ')';
        }
    }

    static {
    }

    public /* synthetic */ j(kotlin.jvm.internal.i r1) {
        this();
    }

    public j() {
    }
}
