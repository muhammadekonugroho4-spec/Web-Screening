package com.stockbit.usecase.bonds.model;

import java.util.List;
import kotlin.collections.AbstractC11777v;

/* loaded from: classes11.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final b f154639a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final List f154640b = null;

    public static final class a extends l {

        /* renamed from: c, reason: collision with root package name */
        public static final a f154641c = null;

        static {
            f154641c = new a();
        }

        public a() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 2023141923;
        }

        public String toString() {
            return "BondIsStableEarn";
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.i r1) {
            this();
        }

        public final l a(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, "value");
            switch(r2.hashCode()) {
                case -1954843898: goto L110;
                case -1715163493: goto L106;
                case -1375854741: goto L101;
                case -1348995979: goto L96;
                case -1301510485: goto L91;
                case -1164785691: goto L86;
                case -1011167533: goto L81;
                case -818100187: goto L76;
                case -711819605: goto L71;
                case -671703315: goto L66;
                case -386105756: goto L61;
                case -326355000: goto L56;
                case 317649683: goto L51;
                case 740592944: goto L46;
                case 751393479: goto L41;
                case 1063480434: goto L36;
                case 1170000921: goto L31;
                case 1179455212: goto L26;
                case 1246911076: goto L21;
                case 1272679469: goto L16;
                case 1758307270: goto L11;
                case 1911477332: goto L6;
                default: goto L112;
            };
        L6:
            if (r2.equals("portfolio_not_exist") == false) goto L112;
            return k.f154650c;
        L11:
            if (r2.equals("product_not_found") == false) goto L112;
            return n.f154653c;
        L16:
            if (r2.equals("price_rate_not_found") == false) goto L112;
            return m.f154652c;
        L21:
            if (r2.equals("stable_earn_cannot_be_sold_outside_bibit") == false) goto L112;
            return r.f154657c;
        L26:
            if (r2.equals("redeem_amount_greater_than_redeemable_amount") == false) goto L112;
            return o.f154654c;
        L31:
            if (r2.equals("price_has_changed") == false) goto L112;
            return C1405l.f154651c;
        L36:
            if (r2.equals("fr_unavailable_due_to_sharia_rdn") == false) goto L112;
            return g.f154646c;
        L41:
            if (r2.equals("is_stable_earn") == false) goto L112;
            return a.f154641c;
        L46:
            if (r2.equals("sell_order_inprogress") == false) goto L112;
            return q.f154656c;
        L51:
            if (r2.equals("maintenance") == false) goto L112;
            return h.f154647c;
        L56:
            if (r2.equals("user_suspend") == false) goto L112;
            return w.f154662c;
        L61:
            if (r2.equals("fr_existing_order_inprogress") == false) goto L112;
            return d.f154643c;
        L66:
            if (r2.equals("fr_bonds_market_closed") == false) goto L112;
            return c.f154642c;
        L71:
            if (r2.equals("fr_in_record_date_period") == false) goto L112;
            return e.f154644c;
        L76:
            if (r2.equals("fr_unavailable_due_to_sharia_preference") == false) goto L112;
            return f.f154645c;
        L81:
            if (r2.equals("stockbit_get_account_not_found") == false) goto L112;
            return s.f154658c;
        L86:
            if (r2.equals("market_close_holidays") == false) goto L112;
            return new i(r3);
        L91:
            if (r2.equals("trading_account_suspended") == false) goto L112;
            return t.f154659c;
        L96:
            if (r2.equals("screen_error") == false) goto L112;
            return p.f154655c;
        L101:
            if (r2.equals("not_in_secondary_market_period") == false) goto L112;
            return j.f154649c;
        L106:
            if (r2.equals("uninitialized") == false) goto L112;
            return u.f154660c;
        L110:
            if (r2.equals("user_sharia_validation") == false) goto L112;
            return v.f154661c;
        L112:
            return u.f154660c;
        }

        public b() {
        }
    }

    public static final class c extends l {

        /* renamed from: c, reason: collision with root package name */
        public static final c f154642c = null;

        static {
            f154642c = new c();
        }

        public c() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -114199703;
        }

        public String toString() {
            return "FrBondsMarketClosed";
        }
    }

    public static final class d extends l {

        /* renamed from: c, reason: collision with root package name */
        public static final d f154643c = null;

        static {
            f154643c = new d();
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
            return -2036806938;
        }

        public String toString() {
            return "FrExistingOrderInprogress";
        }
    }

    public static final class e extends l {

        /* renamed from: c, reason: collision with root package name */
        public static final e f154644c = null;

        static {
            f154644c = new e();
        }

        public e() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof e) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 638111540;
        }

        public String toString() {
            return "FrInRecordDatePeriod";
        }
    }

    public static final class f extends l {

        /* renamed from: c, reason: collision with root package name */
        public static final f f154645c = null;

        static {
            f154645c = new f();
        }

        public f() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof f) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1036364025;
        }

        public String toString() {
            return "FrUnavailableDueToShariaPreference";
        }
    }

    public static final class g extends l {

        /* renamed from: c, reason: collision with root package name */
        public static final g f154646c = null;

        static {
            f154646c = new g();
        }

        public g() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof g) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1085405136;
        }

        public String toString() {
            return "FrUnavailableDueToShariaRdn";
        }
    }

    public static final class h extends l {

        /* renamed from: c, reason: collision with root package name */
        public static final h f154647c = null;

        static {
            f154647c = new h();
        }

        public h() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof h) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -189493264;
        }

        public String toString() {
            return "Maintenance";
        }
    }

    public static final class i extends l {

        /* renamed from: c, reason: collision with root package name */
        public final String f154648c;

        public i(String r2) {
            super(null);
            this.f154648c = r2;
        }

        public final String a() {
            return this.f154648c;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof i) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f154648c, ((i) r4).f154648c) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f154648c;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "MarketCloseHolidays(message=" + this.f154648c + ")";
        }

        public /* synthetic */ i(String r1, int r2, kotlin.jvm.internal.i r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = null;
        L5:
            this(r1);
        }
    }

    public static final class j extends l {

        /* renamed from: c, reason: collision with root package name */
        public static final j f154649c = null;

        static {
            f154649c = new j();
        }

        public j() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof j) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -90666564;
        }

        public String toString() {
            return "NotInSecondaryMarketPeriod";
        }
    }

    public static final class k extends l {

        /* renamed from: c, reason: collision with root package name */
        public static final k f154650c = null;

        static {
            f154650c = new k();
        }

        public k() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof k) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 814678121;
        }

        public String toString() {
            return "PortfolioNotExist";
        }
    }

    /* renamed from: com.stockbit.usecase.bonds.model.l$l, reason: collision with other inner class name */
    public static final class C1405l extends l {

        /* renamed from: c, reason: collision with root package name */
        public static final C1405l f154651c = null;

        static {
            f154651c = new C1405l();
        }

        public C1405l() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1405l) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1506782400;
        }

        public String toString() {
            return "PriceHasChanged";
        }
    }

    public static final class m extends l {

        /* renamed from: c, reason: collision with root package name */
        public static final m f154652c = null;

        static {
            f154652c = new m();
        }

        public m() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof m) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 769834101;
        }

        public String toString() {
            return "PriceRateNotFound";
        }
    }

    public static final class n extends l {

        /* renamed from: c, reason: collision with root package name */
        public static final n f154653c = null;

        static {
            f154653c = new n();
        }

        public n() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof n) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 2132246747;
        }

        public String toString() {
            return "ProductNotFound";
        }
    }

    public static final class o extends l {

        /* renamed from: c, reason: collision with root package name */
        public static final o f154654c = null;

        static {
            f154654c = new o();
        }

        public o() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof o) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 422102386;
        }

        public String toString() {
            return "RedeemAmountGreaterThanRedeemableAmount";
        }
    }

    public static final class p extends l {

        /* renamed from: c, reason: collision with root package name */
        public static final p f154655c = null;

        static {
            f154655c = new p();
        }

        public p() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof p) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -574283303;
        }

        public String toString() {
            return "ScreenError";
        }
    }

    public static final class q extends l {

        /* renamed from: c, reason: collision with root package name */
        public static final q f154656c = null;

        static {
            f154656c = new q();
        }

        public q() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof q) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 369917547;
        }

        public String toString() {
            return "SellOrderInprogress";
        }
    }

    public static final class r extends l {

        /* renamed from: c, reason: collision with root package name */
        public static final r f154657c = null;

        static {
            f154657c = new r();
        }

        public r() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof r) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 13132753;
        }

        public String toString() {
            return "StableEarnCannotBeSoldOutsideBibit";
        }
    }

    public static final class s extends l {

        /* renamed from: c, reason: collision with root package name */
        public static final s f154658c = null;

        static {
            f154658c = new s();
        }

        public s() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof s) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 644406176;
        }

        public String toString() {
            return "StockbitGetAccountNotFound";
        }
    }

    public static final class t extends l {

        /* renamed from: c, reason: collision with root package name */
        public static final t f154659c = null;

        static {
            f154659c = new t();
        }

        public t() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof t) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1007789772;
        }

        public String toString() {
            return "TradingAccountSuspended";
        }
    }

    public static final class u extends l {

        /* renamed from: c, reason: collision with root package name */
        public static final u f154660c = null;

        static {
            f154660c = new u();
        }

        public u() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof u) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 546736184;
        }

        public String toString() {
            return "Uninitialized";
        }
    }

    public static final class v extends l {

        /* renamed from: c, reason: collision with root package name */
        public static final v f154661c = null;

        static {
            f154661c = new v();
        }

        public v() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof v) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 527604133;
        }

        public String toString() {
            return "UserShariaValidation";
        }
    }

    public static final class w extends l {

        /* renamed from: c, reason: collision with root package name */
        public static final w f154662c = null;

        static {
            f154662c = new w();
        }

        public w() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof w) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1633951438;
        }

        public String toString() {
            return "UserSuspend";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        f154639a = new b(null);
        f154640b = AbstractC11777v.r(new l[]{u.f154660c, p.f154655c, c.f154642c, m.f154652c, h.f154647c, e.f154644c, n.f154653c, C1405l.f154651c, s.f154658c, t.f154659c, w.f154662c, d.f154643c, k.f154650c, o.f154654c, j.f154649c, q.f154656c, a.f154641c, r.f154657c, v.f154661c, g.f154646c, f.f154645c, new i(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0)});
    }

    public /* synthetic */ l(kotlin.jvm.internal.i r1) {
        this();
    }

    public l() {
    }
}
