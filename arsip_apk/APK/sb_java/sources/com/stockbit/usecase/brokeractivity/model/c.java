package com.stockbit.usecase.brokeractivity.model;

import com.stockbit.usecase.brokeractivity.model.type.BrokerActivityChartType;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f154779a;

        /* renamed from: b, reason: collision with root package name */
        public final String f154780b;

        /* renamed from: c, reason: collision with root package name */
        public final String f154781c;
        public final LocalDate d;

        /* renamed from: e, reason: collision with root package name */
        public final LocalDate f154782e;

        public a(String r2, String r3, String r4, LocalDate r5, LocalDate r6) {
            kotlin.jvm.internal.p.l(r2, "periodValue");
            kotlin.jvm.internal.p.l(r4, "lastUpdated");
            super(null);
            this.f154779a = r2;
            this.f154780b = r3;
            this.f154781c = r4;
            this.d = r5;
            this.f154782e = r6;
        }

        public final LocalDate a() {
            return this.d;
        }

        public final String b() {
            return this.f154781c;
        }

        public final String c() {
            return this.f154780b;
        }

        public final String d() {
            return this.f154779a;
        }

        public final LocalDate e() {
            return this.f154782e;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f154779a, r52.f154779a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f154780b, r52.f154780b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f154781c, r52.f154781c) == true) goto L18;
            return false;
        L18:
            if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (kotlin.jvm.internal.p.g(this.f154782e, r52.f154782e) == true) goto L23;
            return false;
        L23:
            return true;
        }

        public int hashCode() {
            int r02 = this.f154779a.hashCode() * 31;
            String r1 = this.f154780b;
            int r2 = 0;
            if (r1 != null) goto L5;
            int r12 = 0;
        L6:
            int r03 = (((r02 + r12) * 31) + this.f154781c.hashCode()) * 31;
            LocalDate r13 = this.d;
            if (r13 != null) goto L9;
            int r14 = 0;
        L10:
            int r04 = (r03 + r14) * 31;
            LocalDate r15 = this.f154782e;
            if (r15 == null) goto L15;
            r2 = r15.hashCode();
        L15:
            return r04 + r2;
        L9:
            r14 = r13.hashCode();
            goto L10
        L5:
            r12 = r1.hashCode();
            goto L6
        }

        public String toString() {
            return "Empty(periodValue=" + this.f154779a + ", period=" + this.f154780b + ", lastUpdated=" + this.f154781c + ", fromLocalDate=" + this.d + ", toLocalDate=" + this.f154782e + ")";
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f154783a = null;

        static {
            f154783a = new b();
        }

        public b() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -602494133;
        }

        public String toString() {
            return "Error";
        }
    }

    /* renamed from: com.stockbit.usecase.brokeractivity.model.c$c, reason: collision with other inner class name */
    public static final class C1410c extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f154784a;

        /* renamed from: b, reason: collision with root package name */
        public final String f154785b;

        /* renamed from: c, reason: collision with root package name */
        public final BrokerActivityChartType f154786c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final LocalDate f154787e;

        /* renamed from: f, reason: collision with root package name */
        public final LocalDate f154788f;

        /* renamed from: g, reason: collision with root package name */
        public final List f154789g;

        /* renamed from: h, reason: collision with root package name */
        public final List f154790h;

        /* renamed from: i, reason: collision with root package name */
        public final Map f154791i;

        /* renamed from: j, reason: collision with root package name */
        public final Map f154792j;

        /* renamed from: k, reason: collision with root package name */
        public final int f154793k;

        public C1410c(String r2, String r3, BrokerActivityChartType r4, String r5, LocalDate r6, LocalDate r7, List r8, List r9, Map r10, Map r11, int r12) {
            kotlin.jvm.internal.p.l(r2, "periodValue");
            kotlin.jvm.internal.p.l(r3, "period");
            kotlin.jvm.internal.p.l(r4, "type");
            kotlin.jvm.internal.p.l(r8, "timeLegends");
            kotlin.jvm.internal.p.l(r9, "markerTime");
            kotlin.jvm.internal.p.l(r10, "chartDataValue");
            kotlin.jvm.internal.p.l(r11, "chartDataVolume");
            super(null);
            this.f154784a = r2;
            this.f154785b = r3;
            this.f154786c = r4;
            this.d = r5;
            this.f154787e = r6;
            this.f154788f = r7;
            this.f154789g = r8;
            this.f154790h = r9;
            this.f154791i = r10;
            this.f154792j = r11;
            this.f154793k = r12;
        }

        public static /* synthetic */ C1410c b(C1410c r02, String r1, String r2, BrokerActivityChartType r3, String r4, LocalDate r5, LocalDate r6, List r7, List r8, Map r9, Map r10, int r11, int r12, Object r13) {
            if ((r12 & 1) == 0) goto L6;
            r1 = r02.f154784a;
        L6:
            if ((r12 & 2) == 0) goto L9;
            r2 = r02.f154785b;
        L9:
            if ((r12 & 4) == 0) goto L12;
            r3 = r02.f154786c;
        L12:
            if ((r12 & 8) == 0) goto L15;
            r4 = r02.d;
        L15:
            if ((r12 & 16) == 0) goto L18;
            r5 = r02.f154787e;
        L18:
            if ((r12 & 32) == 0) goto L21;
            r6 = r02.f154788f;
        L21:
            if ((r12 & 64) == 0) goto L24;
            r7 = r02.f154789g;
        L24:
            if ((r12 & 128) == 0) goto L27;
            r8 = r02.f154790h;
        L27:
            if ((r12 & 256) == 0) goto L30;
            r9 = r02.f154791i;
        L30:
            if ((r12 & 512) == 0) goto L33;
            r10 = r02.f154792j;
        L33:
            if ((r12 & 1024) == 0) goto L35;
            r11 = r02.f154793k;
        L35:
            Map r122 = r10;
            int r132 = r11;
            List r102 = r8;
            Map r112 = r9;
            LocalDate r82 = r6;
            List r92 = r7;
            String r62 = r4;
            LocalDate r72 = r5;
            BrokerActivityChartType r52 = r3;
            String r32 = r1;
            return r02.a(r32, r2, r52, r62, r72, r82, r92, r102, r112, r122, r132);
        }

        public final C1410c a(String r14, String r15, BrokerActivityChartType r16, String r17, LocalDate r18, LocalDate r19, List r20, List r21, Map r22, Map r23, int r24) {
            kotlin.jvm.internal.p.l(r14, "periodValue");
            kotlin.jvm.internal.p.l(r15, "period");
            kotlin.jvm.internal.p.l(r16, "type");
            kotlin.jvm.internal.p.l(r20, "timeLegends");
            kotlin.jvm.internal.p.l(r21, "markerTime");
            kotlin.jvm.internal.p.l(r22, "chartDataValue");
            kotlin.jvm.internal.p.l(r23, "chartDataVolume");
            return new C1410c(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);
        }

        public final int c() {
            return this.f154793k;
        }

        public final Map d() {
            return this.f154791i;
        }

        public final Map e() {
            return this.f154792j;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1410c) == true) goto L8;
            return false;
        L8:
            C1410c r52 = (C1410c) r5;
            if (kotlin.jvm.internal.p.g(this.f154784a, r52.f154784a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f154785b, r52.f154785b) == true) goto L15;
            return false;
        L15:
            if (this.f154786c == r52.f154786c) goto L18;
            return false;
        L18:
            if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (kotlin.jvm.internal.p.g(this.f154787e, r52.f154787e) == true) goto L24;
            return false;
        L24:
            if (kotlin.jvm.internal.p.g(this.f154788f, r52.f154788f) == true) goto L27;
            return false;
        L27:
            if (kotlin.jvm.internal.p.g(this.f154789g, r52.f154789g) == true) goto L30;
            return false;
        L30:
            if (kotlin.jvm.internal.p.g(this.f154790h, r52.f154790h) == true) goto L33;
            return false;
        L33:
            if (kotlin.jvm.internal.p.g(this.f154791i, r52.f154791i) == true) goto L36;
            return false;
        L36:
            if (kotlin.jvm.internal.p.g(this.f154792j, r52.f154792j) == true) goto L39;
            return false;
        L39:
            if (this.f154793k == r52.f154793k) goto L41;
            return false;
        L41:
            return true;
        }

        public final LocalDate f() {
            return this.f154787e;
        }

        public final String g() {
            return this.d;
        }

        public final List h() {
            return this.f154790h;
        }

        public int hashCode() {
            int r02 = ((((this.f154784a.hashCode() * 31) + this.f154785b.hashCode()) * 31) + this.f154786c.hashCode()) * 31;
            String r1 = this.d;
            int r2 = 0;
            if (r1 != null) goto L5;
            int r12 = 0;
        L6:
            int r03 = (r02 + r12) * 31;
            LocalDate r13 = this.f154787e;
            if (r13 != null) goto L9;
            int r14 = 0;
        L10:
            int r04 = (r03 + r14) * 31;
            LocalDate r15 = this.f154788f;
            if (r15 == null) goto L15;
            r2 = r15.hashCode();
        L15:
            return ((((((((((r04 + r2) * 31) + this.f154789g.hashCode()) * 31) + this.f154790h.hashCode()) * 31) + this.f154791i.hashCode()) * 31) + this.f154792j.hashCode()) * 31) + Integer.hashCode(this.f154793k);
        L9:
            r14 = r13.hashCode();
            goto L10
        L5:
            r12 = r1.hashCode();
            goto L6
        }

        public final String i() {
            return this.f154785b;
        }

        public final String j() {
            return this.f154784a;
        }

        public final List k() {
            return this.f154789g;
        }

        public final LocalDate l() {
            return this.f154788f;
        }

        public final BrokerActivityChartType m() {
            return this.f154786c;
        }

        public String toString() {
            return "Loaded(periodValue=" + this.f154784a + ", period=" + this.f154785b + ", type=" + this.f154786c + ", lastUpdated=" + this.d + ", fromLocalDate=" + this.f154787e + ", toLocalDate=" + this.f154788f + ", timeLegends=" + this.f154789g + ", markerTime=" + this.f154790h + ", chartDataValue=" + this.f154791i + ", chartDataVolume=" + this.f154792j + ", animateDuration=" + this.f154793k + ")";
        }
    }

    public static final class d extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final d f154794a = null;

        static {
            f154794a = new d();
        }

        public d() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof d) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1655605825;
        }

        public String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ c(kotlin.jvm.internal.i r1) {
        this();
    }

    public c() {
    }
}
