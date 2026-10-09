package com.stockbit.company.ui.detail.chartcontroller;

/* loaded from: classes7.dex */
public interface a {

    /* renamed from: com.stockbit.company.ui.detail.chartcontroller.a$a, reason: collision with other inner class name */
    public static final class C0665a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.domain.model.valueobject.company.chart.b f65552a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f65553b;

        static {
        }

        public C0665a(com.stockbit.domain.model.valueobject.company.chart.b r2, boolean r3) {
            kotlin.jvm.internal.p.l(r2, "chartData");
            this.f65552a = r2;
            this.f65553b = r3;
        }

        @Override // com.stockbit.company.ui.detail.chartcontroller.a
        public com.stockbit.domain.model.valueobject.company.chart.b a() {
            return this.f65552a;
        }

        public boolean b() {
            return this.f65553b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0665a) == true) goto L8;
            return false;
        L8:
            C0665a r52 = (C0665a) r5;
            if (kotlin.jvm.internal.p.g(this.f65552a, r52.f65552a) == true) goto L12;
            return false;
        L12:
            if (this.f65553b == r52.f65553b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f65552a.hashCode() * 31) + Boolean.hashCode(this.f65553b);
        }

        public String toString() {
            return "UpdateCandleChart(chartData=" + this.f65552a + ", withAnimation=" + this.f65553b + ')';
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.domain.model.valueobject.company.chart.b f65554a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f65555b;

        static {
        }

        public b(com.stockbit.domain.model.valueobject.company.chart.b r2, boolean r3) {
            kotlin.jvm.internal.p.l(r2, "chartData");
            this.f65554a = r2;
            this.f65555b = r3;
        }

        @Override // com.stockbit.company.ui.detail.chartcontroller.a
        public com.stockbit.domain.model.valueobject.company.chart.b a() {
            return this.f65554a;
        }

        public boolean b() {
            return this.f65555b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f65554a, r52.f65554a) == true) goto L12;
            return false;
        L12:
            if (this.f65555b == r52.f65555b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f65554a.hashCode() * 31) + Boolean.hashCode(this.f65555b);
        }

        public String toString() {
            return "UpdateLineChart(chartData=" + this.f65554a + ", withAnimation=" + this.f65555b + ')';
        }
    }

    com.stockbit.domain.model.valueobject.company.chart.b a();
}
