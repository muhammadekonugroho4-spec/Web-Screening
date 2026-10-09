package com.stockbit.domain.model.securities.balance;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C0785a f85046a;

    /* renamed from: b, reason: collision with root package name */
    public final List f85047b;

    /* renamed from: c, reason: collision with root package name */
    public final List f85048c;

    /* renamed from: com.stockbit.domain.model.securities.balance.a$a, reason: collision with other inner class name */
    public static final class C0785a {

        /* renamed from: a, reason: collision with root package name */
        public final double f85049a;

        /* renamed from: b, reason: collision with root package name */
        public final double f85050b;

        /* renamed from: c, reason: collision with root package name */
        public final double f85051c;
        public final double d;

        /* renamed from: e, reason: collision with root package name */
        public final double f85052e;

        /* renamed from: f, reason: collision with root package name */
        public final double f85053f;

        /* renamed from: g, reason: collision with root package name */
        public final double f85054g;

        public C0785a(double r1, double r3, double r5, double r7, double r9, double r11, double r13) {
            this.f85049a = r1;
            this.f85050b = r3;
            this.f85051c = r5;
            this.d = r7;
            this.f85052e = r9;
            this.f85053f = r11;
            this.f85054g = r13;
        }

        public final double a() {
            return this.f85053f;
        }

        public final double b() {
            return this.f85054g;
        }

        public final double c() {
            return this.f85049a;
        }

        public final double d() {
            return this.f85050b;
        }

        public final double e() {
            return this.f85051c;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof C0785a) == true) goto L8;
            return false;
        L8:
            C0785a r82 = (C0785a) r8;
            if (Double.compare(this.f85049a, r82.f85049a) == 0) goto L12;
            return false;
        L12:
            if (Double.compare(this.f85050b, r82.f85050b) == 0) goto L15;
            return false;
        L15:
            if (Double.compare(this.f85051c, r82.f85051c) == 0) goto L18;
            return false;
        L18:
            if (Double.compare(this.d, r82.d) == 0) goto L21;
            return false;
        L21:
            if (Double.compare(this.f85052e, r82.f85052e) == 0) goto L24;
            return false;
        L24:
            if (Double.compare(this.f85053f, r82.f85053f) == 0) goto L27;
            return false;
        L27:
            if (Double.compare(this.f85054g, r82.f85054g) == 0) goto L29;
            return false;
        L29:
            return true;
        }

        public final double f() {
            return this.d;
        }

        public final double g() {
            return this.f85052e;
        }

        public int hashCode() {
            return (((((((((((Double.hashCode(this.f85049a) * 31) + Double.hashCode(this.f85050b)) * 31) + Double.hashCode(this.f85051c)) * 31) + Double.hashCode(this.d)) * 31) + Double.hashCode(this.f85052e)) * 31) + Double.hashCode(this.f85053f)) * 31) + Double.hashCode(this.f85054g);
        }

        public String toString() {
            return "BalanceEntity(leverageLiability=" + this.f85049a + ", netWithdrawable=" + this.f85050b + ", pending=" + this.f85051c + ", transaction=" + this.d + ", withdrawable=" + this.f85052e + ", cashSweepPending=" + this.f85053f + ", cashSweepPendingRedemption=" + this.f85054g + ")";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final double f85055a;

        /* renamed from: b, reason: collision with root package name */
        public final String f85056b;

        /* renamed from: c, reason: collision with root package name */
        public final String f85057c;

        public b(double r2, String r4, String r5) {
            p.l(r4, "formattedDate");
            p.l(r5, Constants.KEY_TITLE);
            this.f85055a = r2;
            this.f85056b = r4;
            this.f85057c = r5;
        }

        public final double a() {
            return this.f85055a;
        }

        public final String b() {
            return this.f85056b;
        }

        public final String c() {
            return this.f85057c;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof b) == true) goto L8;
            return false;
        L8:
            b r82 = (b) r8;
            if (Double.compare(this.f85055a, r82.f85055a) == 0) goto L12;
            return false;
        L12:
            if (p.g(this.f85056b, r82.f85056b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f85057c, r82.f85057c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Double.hashCode(this.f85055a) * 31) + this.f85056b.hashCode()) * 31) + this.f85057c.hashCode();
        }

        public String toString() {
            return "SettlementScheduleEntity(balance=" + this.f85055a + ", formattedDate=" + this.f85056b + ", title=" + this.f85057c + ")";
        }
    }

    public a(C0785a r2, List r3, List r4) {
        p.l(r2, "balance");
        p.l(r3, "legends");
        p.l(r4, "settlementSchedules");
        this.f85046a = r2;
        this.f85047b = r3;
        this.f85048c = r4;
    }

    public final C0785a a() {
        return this.f85046a;
    }

    public final List b() {
        return this.f85047b;
    }

    public final List c() {
        return this.f85048c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f85046a, r52.f85046a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85047b, r52.f85047b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85048c, r52.f85048c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f85046a.hashCode() * 31) + this.f85047b.hashCode()) * 31) + this.f85048c.hashCode();
    }

    public String toString() {
        return "BalanceWithdrawableEntity(balance=" + this.f85046a + ", legends=" + this.f85047b + ", settlementSchedules=" + this.f85048c + ")";
    }
}
