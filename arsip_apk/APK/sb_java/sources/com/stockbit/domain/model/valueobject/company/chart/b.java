package com.stockbit.domain.model.valueobject.company.chart;

import com.stockbit.domain.model.valueobject.socket.WebSocketResponseType;
import java.util.List;
import kotlin.collections.AbstractC11777v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f86761a;

    /* renamed from: b, reason: collision with root package name */
    public final C0801b f86762b;

    /* renamed from: c, reason: collision with root package name */
    public final WebSocketResponseType.e f86763c;
    public final WebSocketResponseType.g d;

    /* renamed from: e, reason: collision with root package name */
    public final double f86764e;

    /* renamed from: f, reason: collision with root package name */
    public final double f86765f;

    /* renamed from: g, reason: collision with root package name */
    public final double f86766g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final List f86767a;

        /* renamed from: b, reason: collision with root package name */
        public final List f86768b;

        public a(List r2, List r3) {
            p.l(r2, "currentChartPrices");
            p.l(r3, "updatedCandleChartEntries");
            this.f86767a = r2;
            this.f86768b = r3;
        }

        public static /* synthetic */ a b(a r02, List r1, List r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r02.f86767a;
        L6:
            if ((r3 & 2) == 0) goto L9;
            r2 = r02.f86768b;
        L9:
            return r02.a(r1, r2);
        }

        public final a a(List r2, List r3) {
            p.l(r2, "currentChartPrices");
            p.l(r3, "updatedCandleChartEntries");
            return new a(r2, r3);
        }

        public final List c() {
            return this.f86767a;
        }

        public final List d() {
            return this.f86768b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f86767a, r52.f86767a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f86768b, r52.f86768b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f86767a.hashCode() * 31) + this.f86768b.hashCode();
        }

        public String toString() {
            return "CandleChartData(currentChartPrices=" + this.f86767a + ", updatedCandleChartEntries=" + this.f86768b + ')';
        }

        public /* synthetic */ a(List r1, List r2, int r3, i r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = AbstractC11777v.o();
        L6:
            if ((r3 & 2) == 0) goto L8;
            r2 = AbstractC11777v.o();
        L8:
            this(r1, r2);
        }
    }

    /* renamed from: com.stockbit.domain.model.valueobject.company.chart.b$b, reason: collision with other inner class name */
    public static final class C0801b {

        /* renamed from: a, reason: collision with root package name */
        public final List f86769a;

        /* renamed from: b, reason: collision with root package name */
        public final List f86770b;

        public C0801b(List r2, List r3) {
            p.l(r2, "currentChartPrices");
            p.l(r3, "updatedLineChartEntries");
            this.f86769a = r2;
            this.f86770b = r3;
        }

        public static /* synthetic */ C0801b b(C0801b r02, List r1, List r2, int r3, Object r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = r02.f86769a;
        L6:
            if ((r3 & 2) == 0) goto L9;
            r2 = r02.f86770b;
        L9:
            return r02.a(r1, r2);
        }

        public final C0801b a(List r2, List r3) {
            p.l(r2, "currentChartPrices");
            p.l(r3, "updatedLineChartEntries");
            return new C0801b(r2, r3);
        }

        public final List c() {
            return this.f86769a;
        }

        public final List d() {
            return this.f86770b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0801b) == true) goto L8;
            return false;
        L8:
            C0801b r52 = (C0801b) r5;
            if (p.g(this.f86769a, r52.f86769a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f86770b, r52.f86770b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f86769a.hashCode() * 31) + this.f86770b.hashCode();
        }

        public String toString() {
            return "LineChartData(currentChartPrices=" + this.f86769a + ", updatedLineChartEntries=" + this.f86770b + ')';
        }

        public /* synthetic */ C0801b(List r1, List r2, int r3, i r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = AbstractC11777v.o();
        L6:
            if ((r3 & 2) == 0) goto L8;
            r2 = AbstractC11777v.o();
        L8:
            this(r1, r2);
        }
    }

    public b(a r2, C0801b r3, WebSocketResponseType.e r4, WebSocketResponseType.g r5, double r6, double r8, double r10) {
        p.l(r2, "candleData");
        p.l(r3, "lineData");
        this.f86761a = r2;
        this.f86762b = r3;
        this.f86763c = r4;
        this.d = r5;
        this.f86764e = r6;
        this.f86765f = r8;
        this.f86766g = r10;
    }

    public static /* synthetic */ b b(b r02, a r1, C0801b r2, WebSocketResponseType.e r3, WebSocketResponseType.g r4, double r5, double r7, double r9, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r02.f86761a;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r02.f86762b;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r3 = r02.f86763c;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r5 = r02.f86764e;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = r02.f86765f;
    L21:
        if ((r11 & 64) == 0) goto L23;
        r9 = r02.f86766g;
    L23:
        double r112 = r9;
        double r92 = r7;
        double r72 = r5;
        WebSocketResponseType.e r52 = r3;
        WebSocketResponseType.g r6 = r4;
        return r02.a(r1, r2, r52, r6, r72, r92, r112);
    }

    public final b a(a r13, C0801b r14, WebSocketResponseType.e r15, WebSocketResponseType.g r16, double r17, double r19, double r21) {
        p.l(r13, "candleData");
        p.l(r14, "lineData");
        return new b(r13, r14, r15, r16, r17, r19, r21);
    }

    public final a c() {
        return this.f86761a;
    }

    public final double d() {
        return this.f86765f;
    }

    public final double e() {
        return this.f86766g;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (p.g(this.f86761a, r82.f86761a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86762b, r82.f86762b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86763c, r82.f86763c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (Double.compare(this.f86764e, r82.f86764e) == 0) goto L24;
        return false;
    L24:
        if (Double.compare(this.f86765f, r82.f86765f) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.f86766g, r82.f86766g) == 0) goto L29;
        return false;
    L29:
        return true;
    }

    public final C0801b f() {
        return this.f86762b;
    }

    public final double g() {
        return this.f86764e;
    }

    public final WebSocketResponseType.g h() {
        return this.d;
    }

    public int hashCode() {
        int r02 = ((this.f86761a.hashCode() * 31) + this.f86762b.hashCode()) * 31;
        WebSocketResponseType.e r1 = this.f86763c;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        WebSocketResponseType.g r13 = this.d;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return ((((((r03 + r2) * 31) + Double.hashCode(this.f86764e)) * 31) + Double.hashCode(this.f86765f)) * 31) + Double.hashCode(this.f86766g);
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final WebSocketResponseType.e i() {
        return this.f86763c;
    }

    public String toString() {
        return "CompanyDataChart(candleData=" + this.f86761a + ", lineData=" + this.f86762b + ", updatedPrices=" + this.f86763c + ", updatedIntraday=" + this.d + ", previousPrice=" + this.f86764e + ", changePriceChart=" + this.f86765f + ", intervalInMinutes=" + this.f86766g + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(a r3, C0801b r4, WebSocketResponseType.e r5, WebSocketResponseType.g r6, double r7, double r9, double r11, int r13, i r14) {
        int r02 = 3;
        List r1 = null;
        Object[] r12 = 0;
        Object[] r15 = 0;
        Object[] r16 = 0;
        Object[] r17 = 0;
        Object[] r18 = 0;
        if ((r13 & 1) == 0) goto L6;
        r3 = new a(r1, r18 == true ? 1 : 0, r02, r17 == true ? 1 : 0);
    L6:
        if ((r13 & 2) == 0) goto L9;
        r4 = new C0801b(r16 == true ? 1 : 0, r15 == true ? 1 : 0, r02, r12 == true ? 1 : 0);
    L9:
        if ((r13 & 4) == 0) goto L12;
        r5 = null;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r6 = null;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r7 = 0.0d;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r9 = 0.0d;
    L21:
        if ((r13 & 64) == 0) goto L24;
        double r132 = 0.0d;
    L23:
        double r112 = r9;
        double r92 = r7;
        this(r3, r4, r5, r6, r92, r112, r132);
        return;
    L24:
        r132 = r11;
        goto L23
    }
}
