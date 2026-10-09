package com.stockbit.usecase.securities.model.account;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.iab.digitalidentity.sdk.core.model.GoPayPlusCameraConfigKt;
import com.stockbit.domain.model.securities.account.AccountStatusType;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1618a f160344a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final c f160345b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final c f160346c = null;
    public static final c d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final c f160347e = null;

    /* renamed from: com.stockbit.usecase.securities.model.account.a$a, reason: collision with other inner class name */
    public static final class C1618a {
        public /* synthetic */ C1618a(i r1) {
            this();
        }

        public C1618a() {
        }
    }

    public static final class b extends a {

        /* renamed from: f, reason: collision with root package name */
        public final String f160348f;

        /* renamed from: g, reason: collision with root package name */
        public final String f160349g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f160350h;

        /* renamed from: i, reason: collision with root package name */
        public final AccountStatusType f160351i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f160352j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f160353k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f160354l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f160355m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f160356n;

        /* renamed from: o, reason: collision with root package name */
        public final double f160357o;

        public b(String r2, String r3, boolean r4, AccountStatusType r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10, double r11) {
            p.l(r2, Constants.KEY_ID);
            p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
            p.l(r5, "accountStatus");
            super(null);
            this.f160348f = r2;
            this.f160349g = r3;
            this.f160350h = r4;
            this.f160351i = r5;
            this.f160352j = r6;
            this.f160353k = r7;
            this.f160354l = r8;
            this.f160355m = r9;
            this.f160356n = r10;
            this.f160357o = r11;
        }

        @Override // com.stockbit.usecase.securities.model.account.a
        public AccountStatusType a() {
            return this.f160351i;
        }

        @Override // com.stockbit.usecase.securities.model.account.a
        public String b() {
            return this.f160348f;
        }

        @Override // com.stockbit.usecase.securities.model.account.a
        public boolean c() {
            return this.f160354l;
        }

        @Override // com.stockbit.usecase.securities.model.account.a
        public boolean d() {
            return this.f160356n;
        }

        @Override // com.stockbit.usecase.securities.model.account.a
        public boolean e() {
            return this.f160353k;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof b) == true) goto L8;
            return false;
        L8:
            b r82 = (b) r8;
            if (p.g(this.f160348f, r82.f160348f) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f160349g, r82.f160349g) == true) goto L15;
            return false;
        L15:
            if (this.f160350h == r82.f160350h) goto L18;
            return false;
        L18:
            if (this.f160351i == r82.f160351i) goto L21;
            return false;
        L21:
            if (this.f160352j == r82.f160352j) goto L24;
            return false;
        L24:
            if (this.f160353k == r82.f160353k) goto L27;
            return false;
        L27:
            if (this.f160354l == r82.f160354l) goto L30;
            return false;
        L30:
            if (this.f160355m == r82.f160355m) goto L33;
            return false;
        L33:
            if (this.f160356n == r82.f160356n) goto L36;
            return false;
        L36:
            if (Double.compare(this.f160357o, r82.f160357o) == 0) goto L38;
            return false;
        L38:
            return true;
        }

        @Override // com.stockbit.usecase.securities.model.account.a
        public boolean f() {
            return this.f160355m;
        }

        @Override // com.stockbit.usecase.securities.model.account.a
        public String g() {
            return this.f160349g;
        }

        public int hashCode() {
            return (((((((((((((((((this.f160348f.hashCode() * 31) + this.f160349g.hashCode()) * 31) + Boolean.hashCode(this.f160350h)) * 31) + this.f160351i.hashCode()) * 31) + Boolean.hashCode(this.f160352j)) * 31) + Boolean.hashCode(this.f160353k)) * 31) + Boolean.hashCode(this.f160354l)) * 31) + Boolean.hashCode(this.f160355m)) * 31) + Boolean.hashCode(this.f160356n)) * 31) + Double.hashCode(this.f160357o);
        }

        @Override // com.stockbit.usecase.securities.model.account.a
        public boolean i() {
            return this.f160350h;
        }

        @Override // com.stockbit.usecase.securities.model.account.a
        public boolean j() {
            return this.f160352j;
        }

        public final double k() {
            return this.f160357o;
        }

        public String toString() {
            return "Margin(id=" + this.f160348f + ", name=" + this.f160349g + ", isActive=" + this.f160350h + ", accountStatus=" + this.f160351i + ", isLinkedToAdvisor=" + this.f160352j + ", ifaAllowStockTransferIn=" + this.f160353k + ", ifaAllowCashTransferIn=" + this.f160354l + ", ifaAllowStockTransferOut=" + this.f160355m + ", ifaAllowCashTransferOut=" + this.f160356n + ", buyingPower=" + this.f160357o + ")";
        }
    }

    public static final class c extends a {

        /* renamed from: f, reason: collision with root package name */
        public final String f160358f;

        /* renamed from: g, reason: collision with root package name */
        public final String f160359g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f160360h;

        /* renamed from: i, reason: collision with root package name */
        public final AccountStatusType f160361i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f160362j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f160363k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f160364l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f160365m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f160366n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f160367o;

        /* renamed from: p, reason: collision with root package name */
        public final double f160368p;

        public c(String r2, String r3, boolean r4, AccountStatusType r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10, boolean r11, double r12) {
            p.l(r2, Constants.KEY_ID);
            p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
            p.l(r5, "accountStatus");
            super(null);
            this.f160358f = r2;
            this.f160359g = r3;
            this.f160360h = r4;
            this.f160361i = r5;
            this.f160362j = r6;
            this.f160363k = r7;
            this.f160364l = r8;
            this.f160365m = r9;
            this.f160366n = r10;
            this.f160367o = r11;
            this.f160368p = r12;
        }

        public static /* synthetic */ c l(c r02, String r1, String r2, boolean r3, AccountStatusType r4, boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, boolean r10, double r11, int r13, Object r14) {
            if ((r13 & 1) == 0) goto L6;
            r1 = r02.f160358f;
        L6:
            if ((r13 & 2) == 0) goto L9;
            r2 = r02.f160359g;
        L9:
            if ((r13 & 4) == 0) goto L12;
            r3 = r02.f160360h;
        L12:
            if ((r13 & 8) == 0) goto L15;
            r4 = r02.f160361i;
        L15:
            if ((r13 & 16) == 0) goto L18;
            r5 = r02.f160362j;
        L18:
            if ((r13 & 32) == 0) goto L21;
            r6 = r02.f160363k;
        L21:
            if ((r13 & 64) == 0) goto L24;
            r7 = r02.f160364l;
        L24:
            if ((r13 & 128) == 0) goto L27;
            r8 = r02.f160365m;
        L27:
            if ((r13 & 256) == 0) goto L30;
            r9 = r02.f160366n;
        L30:
            if ((r13 & 512) == 0) goto L33;
            r10 = r02.f160367o;
        L33:
            if ((r13 & 1024) == 0) goto L35;
            r11 = r02.f160368p;
        L35:
            double r132 = r11;
            boolean r112 = r9;
            boolean r12 = r10;
            boolean r92 = r7;
            boolean r102 = r8;
            boolean r72 = r5;
            boolean r82 = r6;
            boolean r52 = r3;
            AccountStatusType r62 = r4;
            return r02.k(r1, r2, r52, r62, r72, r82, r92, r102, r112, r12, r132);
        }

        @Override // com.stockbit.usecase.securities.model.account.a
        public AccountStatusType a() {
            return this.f160361i;
        }

        @Override // com.stockbit.usecase.securities.model.account.a
        public String b() {
            return this.f160358f;
        }

        @Override // com.stockbit.usecase.securities.model.account.a
        public boolean c() {
            return this.f160364l;
        }

        @Override // com.stockbit.usecase.securities.model.account.a
        public boolean d() {
            return this.f160366n;
        }

        @Override // com.stockbit.usecase.securities.model.account.a
        public boolean e() {
            return this.f160363k;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof c) == true) goto L8;
            return false;
        L8:
            c r82 = (c) r8;
            if (p.g(this.f160358f, r82.f160358f) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f160359g, r82.f160359g) == true) goto L15;
            return false;
        L15:
            if (this.f160360h == r82.f160360h) goto L18;
            return false;
        L18:
            if (this.f160361i == r82.f160361i) goto L21;
            return false;
        L21:
            if (this.f160362j == r82.f160362j) goto L24;
            return false;
        L24:
            if (this.f160363k == r82.f160363k) goto L27;
            return false;
        L27:
            if (this.f160364l == r82.f160364l) goto L30;
            return false;
        L30:
            if (this.f160365m == r82.f160365m) goto L33;
            return false;
        L33:
            if (this.f160366n == r82.f160366n) goto L36;
            return false;
        L36:
            if (this.f160367o == r82.f160367o) goto L39;
            return false;
        L39:
            if (Double.compare(this.f160368p, r82.f160368p) == 0) goto L41;
            return false;
        L41:
            return true;
        }

        @Override // com.stockbit.usecase.securities.model.account.a
        public boolean f() {
            return this.f160365m;
        }

        @Override // com.stockbit.usecase.securities.model.account.a
        public String g() {
            return this.f160359g;
        }

        public int hashCode() {
            return (((((((((((((((((((this.f160358f.hashCode() * 31) + this.f160359g.hashCode()) * 31) + Boolean.hashCode(this.f160360h)) * 31) + this.f160361i.hashCode()) * 31) + Boolean.hashCode(this.f160362j)) * 31) + Boolean.hashCode(this.f160363k)) * 31) + Boolean.hashCode(this.f160364l)) * 31) + Boolean.hashCode(this.f160365m)) * 31) + Boolean.hashCode(this.f160366n)) * 31) + Boolean.hashCode(this.f160367o)) * 31) + Double.hashCode(this.f160368p);
        }

        @Override // com.stockbit.usecase.securities.model.account.a
        public boolean i() {
            return this.f160360h;
        }

        @Override // com.stockbit.usecase.securities.model.account.a
        public boolean j() {
            return this.f160362j;
        }

        public final c k(String r15, String r16, boolean r17, AccountStatusType r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24, double r25) {
            p.l(r15, Constants.KEY_ID);
            p.l(r16, AppMeasurementSdk.ConditionalUserProperty.NAME);
            p.l(r18, "accountStatus");
            return new c(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25);
        }

        public final double m() {
            return this.f160368p;
        }

        public final boolean n() {
            return this.f160367o;
        }

        public String toString() {
            return "Regular(id=" + this.f160358f + ", name=" + this.f160359g + ", isActive=" + this.f160360h + ", accountStatus=" + this.f160361i + ", isLinkedToAdvisor=" + this.f160362j + ", ifaAllowStockTransferIn=" + this.f160363k + ", ifaAllowCashTransferIn=" + this.f160364l + ", ifaAllowStockTransferOut=" + this.f160365m + ", ifaAllowCashTransferOut=" + this.f160366n + ", isMainAccount=" + this.f160367o + ", tradingBalance=" + this.f160368p + ")";
        }

        public /* synthetic */ c(String r12, String r13, boolean r14, AccountStatusType r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, double r22, int r24, i r25) {
            if ((r24 & 1) == 0) goto L6;
            r12 = "";
        L6:
            if ((r24 & 2) == 0) goto L8;
            r13 = "";
        L8:
            boolean r2 = false;
            if ((r24 & 4) == 0) goto L11;
            boolean r1 = false;
        L13:
            if ((r24 & 8) == 0) goto L15;
            AccountStatusType r3 = AccountStatusType.ACCOUNT_STATUS_UNSPECIFIED;
        L17:
            if ((r24 & 16) == 0) goto L19;
            boolean r4 = false;
        L20:
            boolean r6 = true;
            if ((r24 & 32) == 0) goto L23;
            boolean r5 = true;
        L25:
            if ((r24 & 64) == 0) goto L27;
            boolean r7 = true;
        L29:
            if ((r24 & 128) == 0) goto L31;
            boolean r8 = true;
        L33:
            if ((r24 & 256) != 0) goto L37;
            r6 = r20;
        L37:
            if ((r24 & 512) != 0) goto L41;
            r2 = r21;
        L41:
            if ((r24 & 1024) == 0) goto L44;
            double r23 = 0.0d;
        L45:
            this(r12, r13, r1, r3, r4, r5, r7, r8, r6, r2, r23);
            return;
        L44:
            r23 = r22;
            goto L45
        L31:
            r8 = r19;
            goto L33
        L27:
            r7 = r18;
            goto L29
        L23:
            r5 = r17;
            goto L25
        L19:
            r4 = r16;
            goto L20
        L15:
            r3 = r15;
            goto L17
        L11:
            r1 = r14;
            goto L13
        }
    }

    static {
        f160344a = new C1618a(null);
        String r3 = GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A;
        String r4 = "Regular Portfolio 1";
        boolean r5 = false;
        AccountStatusType r6 = null;
        boolean r7 = false;
        boolean r8 = false;
        boolean r9 = false;
        boolean r10 = false;
        boolean r11 = false;
        boolean r12 = true;
        double r13 = 0.0d;
        f160345b = new c(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, 1532, null);
        String r42 = null;
        String r52 = "Regular Portfolio 2";
        boolean r62 = false;
        AccountStatusType r72 = null;
        boolean r122 = false;
        boolean r132 = false;
        double r14 = 0.0d;
        f160346c = new c(r42, r52, r62, r72, r8, r9, r10, r11, r122, r132, r14, 2045, null);
        String r53 = "6";
        String r63 = "IFA Portfolio";
        boolean r73 = false;
        AccountStatusType r82 = null;
        boolean r92 = true;
        boolean r142 = false;
        double r15 = 0.0d;
        c r43 = new c(r53, r63, r73, r82, r92, r10, r11, r122, r132, r142, r15, 2028, null);
        d = r43;
        f160347e = c.l(r43, null, null, false, null, true, false, false, false, false, true, 0.0d, 1519, null);
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public abstract AccountStatusType a();

    public abstract String b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract String g();

    public final boolean h() {
        if (a() != AccountStatusType.ACCOUNT_STATUS_APPROVED) goto L6;
        return true;
    L6:
        return false;
    }

    public abstract boolean i();

    public abstract boolean j();

    public a() {
    }
}
