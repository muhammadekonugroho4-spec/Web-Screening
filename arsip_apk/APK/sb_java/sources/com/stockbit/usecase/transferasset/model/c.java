package com.stockbit.usecase.transferasset.model;

import com.clevertap.android.sdk.Constants;
import com.midtrans.sdk.corekit.models.snap.TransactionResult;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final a f164048a;

    /* renamed from: b, reason: collision with root package name */
    public final List f164049b;

    /* renamed from: c, reason: collision with root package name */
    public final List f164050c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f164051a;

        /* renamed from: b, reason: collision with root package name */
        public final String f164052b;

        /* renamed from: c, reason: collision with root package name */
        public final String f164053c;
        public final double d;

        /* renamed from: e, reason: collision with root package name */
        public final String f164054e;

        /* renamed from: f, reason: collision with root package name */
        public final String f164055f;

        /* renamed from: g, reason: collision with root package name */
        public final String f164056g;

        /* renamed from: h, reason: collision with root package name */
        public final String f164057h;

        /* renamed from: i, reason: collision with root package name */
        public final String f164058i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f164059j;

        /* renamed from: k, reason: collision with root package name */
        public final String f164060k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f164061l;

        public a(String r2, String r3, String r4, double r5, String r7, String r8, String r9, String r10, String r11, boolean r12, String r13, boolean r14) {
            p.l(r2, "leverageLiability");
            p.l(r3, "netWithdrawable");
            p.l(r4, "actualWithdrawable");
            p.l(r7, TransactionResult.STATUS_PENDING);
            p.l(r8, "transaction");
            p.l(r9, "actualTransaction");
            p.l(r10, "withdrawable");
            p.l(r11, "cashSweepPending");
            p.l(r13, "cashSweepPendingRedemption");
            this.f164051a = r2;
            this.f164052b = r3;
            this.f164053c = r4;
            this.d = r5;
            this.f164054e = r7;
            this.f164055f = r8;
            this.f164056g = r9;
            this.f164057h = r10;
            this.f164058i = r11;
            this.f164059j = r12;
            this.f164060k = r13;
            this.f164061l = r14;
        }

        public final String a() {
            return this.f164056g;
        }

        public final String b() {
            return this.f164053c;
        }

        public final String c() {
            return this.f164058i;
        }

        public final String d() {
            return this.f164060k;
        }

        public final String e() {
            return this.f164051a;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof a) == true) goto L8;
            return false;
        L8:
            a r82 = (a) r8;
            if (p.g(this.f164051a, r82.f164051a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f164052b, r82.f164052b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f164053c, r82.f164053c) == true) goto L18;
            return false;
        L18:
            if (Double.compare(this.d, r82.d) == 0) goto L21;
            return false;
        L21:
            if (p.g(this.f164054e, r82.f164054e) == true) goto L24;
            return false;
        L24:
            if (p.g(this.f164055f, r82.f164055f) == true) goto L27;
            return false;
        L27:
            if (p.g(this.f164056g, r82.f164056g) == true) goto L30;
            return false;
        L30:
            if (p.g(this.f164057h, r82.f164057h) == true) goto L33;
            return false;
        L33:
            if (p.g(this.f164058i, r82.f164058i) == true) goto L36;
            return false;
        L36:
            if (this.f164059j == r82.f164059j) goto L39;
            return false;
        L39:
            if (p.g(this.f164060k, r82.f164060k) == true) goto L42;
            return false;
        L42:
            if (this.f164061l == r82.f164061l) goto L44;
            return false;
        L44:
            return true;
        }

        public final String f() {
            return this.f164052b;
        }

        public final String g() {
            return this.f164054e;
        }

        public final double h() {
            return this.d;
        }

        public int hashCode() {
            return (((((((((((((((((((((this.f164051a.hashCode() * 31) + this.f164052b.hashCode()) * 31) + this.f164053c.hashCode()) * 31) + Double.hashCode(this.d)) * 31) + this.f164054e.hashCode()) * 31) + this.f164055f.hashCode()) * 31) + this.f164056g.hashCode()) * 31) + this.f164057h.hashCode()) * 31) + this.f164058i.hashCode()) * 31) + Boolean.hashCode(this.f164059j)) * 31) + this.f164060k.hashCode()) * 31) + Boolean.hashCode(this.f164061l);
        }

        public final boolean i() {
            return this.f164059j;
        }

        public final boolean j() {
            return this.f164061l;
        }

        public String toString() {
            return "Balance(leverageLiability=" + this.f164051a + ", netWithdrawable=" + this.f164052b + ", actualWithdrawable=" + this.f164053c + ", rawNetWithdrawable=" + this.d + ", pending=" + this.f164054e + ", transaction=" + this.f164055f + ", actualTransaction=" + this.f164056g + ", withdrawable=" + this.f164057h + ", cashSweepPending=" + this.f164058i + ", isShowCashSweepPending=" + this.f164059j + ", cashSweepPendingRedemption=" + this.f164060k + ", isShowCashSweepPendingRedemption=" + this.f164061l + ")";
        }

        public /* synthetic */ a(String r16, String r17, String r18, double r19, String r21, String r22, String r23, String r24, String r25, boolean r26, String r27, boolean r28, int r29, i r30) {
            String r2 = "Rp0";
            if ((r29 & 1) == 0) goto L5;
            String r1 = "Rp0";
        L7:
            if ((r29 & 2) == 0) goto L9;
            String r3 = "Rp0";
        L11:
            if ((r29 & 4) == 0) goto L13;
            String r4 = "Rp0";
        L15:
            if ((r29 & 8) == 0) goto L17;
            double r5 = 0.0d;
        L19:
            if ((r29 & 16) == 0) goto L21;
            String r7 = "Rp0";
        L23:
            if ((r29 & 32) == 0) goto L25;
            String r8 = "Rp0";
        L27:
            if ((r29 & 64) == 0) goto L29;
            String r9 = "Rp0";
        L31:
            if ((r29 & 128) != 0) goto L34;
            r2 = r24;
        L34:
            String r11 = "0";
            if ((r29 & 256) == 0) goto L37;
            String r10 = "0";
        L39:
            if ((r29 & 512) == 0) goto L41;
            boolean r12 = false;
        L43:
            if ((r29 & 1024) != 0) goto L47;
            r11 = r27;
        L47:
            if ((r29 & 2048) == 0) goto L50;
            boolean r292 = false;
        L51:
            this(r1, r3, r4, r5, r7, r8, r9, r2, r10, r12, r11, r292);
            return;
        L50:
            r292 = r28;
            goto L51
        L41:
            r12 = r26;
            goto L43
        L37:
            r10 = r25;
            goto L39
        L29:
            r9 = r23;
            goto L31
        L25:
            r8 = r22;
            goto L27
        L21:
            r7 = r21;
            goto L23
        L17:
            r5 = r19;
            goto L19
        L13:
            r4 = r18;
            goto L15
        L9:
            r3 = r17;
            goto L11
        L5:
            r1 = r16;
            goto L7
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f164062a;

        /* renamed from: b, reason: collision with root package name */
        public final String f164063b;

        /* renamed from: c, reason: collision with root package name */
        public final String f164064c;

        public b(String r2, String r3, String r4) {
            p.l(r2, "balance");
            p.l(r3, "formattedDate");
            p.l(r4, Constants.KEY_TITLE);
            this.f164062a = r2;
            this.f164063b = r3;
            this.f164064c = r4;
        }

        public final String a() {
            return this.f164062a;
        }

        public final String b() {
            return this.f164063b;
        }

        public final String c() {
            return this.f164064c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f164062a, r52.f164062a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f164063b, r52.f164063b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f164064c, r52.f164064c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f164062a.hashCode() * 31) + this.f164063b.hashCode()) * 31) + this.f164064c.hashCode();
        }

        public String toString() {
            return "SettlementSchedule(balance=" + this.f164062a + ", formattedDate=" + this.f164063b + ", title=" + this.f164064c + ")";
        }
    }

    public c(a r2, List r3, List r4) {
        p.l(r2, "balance");
        p.l(r3, "legends");
        p.l(r4, "settlementSchedules");
        this.f164048a = r2;
        this.f164049b = r3;
        this.f164050c = r4;
    }

    public final a a() {
        return this.f164048a;
    }

    public final List b() {
        return this.f164050c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f164048a, r52.f164048a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f164049b, r52.f164049b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f164050c, r52.f164050c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f164048a.hashCode() * 31) + this.f164049b.hashCode()) * 31) + this.f164050c.hashCode();
    }

    public String toString() {
        return "TransferCashBalanceUiState(balance=" + this.f164048a + ", legends=" + this.f164049b + ", settlementSchedules=" + this.f164050c + ")";
    }
}
