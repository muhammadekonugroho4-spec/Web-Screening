package com.stockbit.usecase.paywall.model.type;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0086\u0081\u0002\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001f"}, d2 = {"Lcom/stockbit/usecase/paywall/model/type/PaywallFeatureType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "UNSPECIFIED", "CHARTBIT", "SCREENER", "ORDERBOOK", "VALUATION", "FINANCIALS", "FUNDACHART", "SEASONALITY", "CALENDAR", "EARNINGS", "PRICE_ALERT", "RUNNING_TRADE", "BANDAR_DETECTOR", "KEYSTATS", "ANALYSIS", "COMPARISON", "INSIDER", "COMPANY_PROFILE", "CORP_ACTION", "FOREIGN_DOMESTIC", "TOP_BROKER", "TOP_STOCK", "Companion", "usecase-paywall"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum PaywallFeatureType extends Enum<PaywallFeatureType> {
    public static final PaywallFeatureType ANALYSIS = null;
    public static final PaywallFeatureType BANDAR_DETECTOR = null;
    public static final PaywallFeatureType CALENDAR = null;
    public static final PaywallFeatureType CHARTBIT = null;
    public static final PaywallFeatureType COMPANY_PROFILE = null;
    public static final PaywallFeatureType COMPARISON = null;
    public static final PaywallFeatureType CORP_ACTION = null;
    public static final a Companion = null;
    public static final PaywallFeatureType EARNINGS = null;
    public static final PaywallFeatureType FINANCIALS = null;
    public static final PaywallFeatureType FOREIGN_DOMESTIC = null;
    public static final PaywallFeatureType FUNDACHART = null;
    public static final PaywallFeatureType INSIDER = null;
    public static final PaywallFeatureType KEYSTATS = null;
    public static final PaywallFeatureType ORDERBOOK = null;
    public static final PaywallFeatureType PRICE_ALERT = null;
    public static final PaywallFeatureType RUNNING_TRADE = null;
    public static final PaywallFeatureType SCREENER = null;
    public static final PaywallFeatureType SEASONALITY = null;
    public static final PaywallFeatureType TOP_BROKER = null;
    public static final PaywallFeatureType TOP_STOCK = null;
    public static final PaywallFeatureType UNSPECIFIED = null;
    public static final PaywallFeatureType VALUATION = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PaywallFeatureType[] f158969a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f158970b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final PaywallFeatureType a(String r4) {
            p.l(r4, "value");
            Iterator<E> r02 = PaywallFeatureType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (p.g(((PaywallFeatureType) r1).getValue(), r4) == false) goto L4;
        L9:
            PaywallFeatureType r12 = (PaywallFeatureType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return PaywallFeatureType.UNSPECIFIED;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        UNSPECIFIED = new PaywallFeatureType("UNSPECIFIED", 0, "PAYWALL_FEATURE_UNSPECIFIED");
        CHARTBIT = new PaywallFeatureType("CHARTBIT", 1, "PAYWALL_FEATURE_CHARTBIT");
        SCREENER = new PaywallFeatureType("SCREENER", 2, "PAYWALL_FEATURE_SCREENER");
        ORDERBOOK = new PaywallFeatureType("ORDERBOOK", 3, "PAYWALL_FEATURE_ORDERBOOK");
        VALUATION = new PaywallFeatureType("VALUATION", 4, "PAYWALL_FEATURE_VALUATION");
        FINANCIALS = new PaywallFeatureType("FINANCIALS", 5, "PAYWALL_FEATURE_FINANCIALS");
        FUNDACHART = new PaywallFeatureType("FUNDACHART", 6, "PAYWALL_FEATURE_FUNDACHART");
        SEASONALITY = new PaywallFeatureType("SEASONALITY", 7, "PAYWALL_FEATURE_SEASONALITY");
        CALENDAR = new PaywallFeatureType("CALENDAR", 8, "PAYWALL_FEATURE_CALENDAR");
        EARNINGS = new PaywallFeatureType("EARNINGS", 9, "PAYWALL_FEATURE_EARNINGS");
        PRICE_ALERT = new PaywallFeatureType("PRICE_ALERT", 10, "PAYWALL_FEATURE_PRICE_ALERT");
        RUNNING_TRADE = new PaywallFeatureType("RUNNING_TRADE", 11, "PAYWALL_FEATURE_RUNNING_TRADE");
        BANDAR_DETECTOR = new PaywallFeatureType("BANDAR_DETECTOR", 12, "PAYWALL_FEATURE_BANDAR_DETECTOR");
        KEYSTATS = new PaywallFeatureType("KEYSTATS", 13, "PAYWALL_FEATURE_KEYSTATS");
        ANALYSIS = new PaywallFeatureType("ANALYSIS", 14, "PAYWALL_FEATURE_ANALYSIS");
        COMPARISON = new PaywallFeatureType("COMPARISON", 15, "PAYWALL_FEATURE_COMPARISON");
        INSIDER = new PaywallFeatureType("INSIDER", 16, "PAYWALL_FEATURE_INSIDER");
        COMPANY_PROFILE = new PaywallFeatureType("COMPANY_PROFILE", 17, "PAYWALL_FEATURE_COMPANY_PROFILE");
        CORP_ACTION = new PaywallFeatureType("CORP_ACTION", 18, "PAYWALL_FEATURE_CORP_ACTION");
        FOREIGN_DOMESTIC = new PaywallFeatureType("FOREIGN_DOMESTIC", 19, "PAYWALL_FEATURE_FOREIGN_DOMESTIC");
        TOP_BROKER = new PaywallFeatureType("TOP_BROKER", 20, "PAYWALL_FEATURE_TOP_BROKER");
        TOP_STOCK = new PaywallFeatureType("TOP_STOCK", 21, "PAYWALL_FEATURE_TOP_STOCK");
        PaywallFeatureType[] r02 = a();
        f158969a = r02;
        f158970b = b.a(r02);
        Companion = new a(null);
    }

    PaywallFeatureType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ PaywallFeatureType[] a() {
        return new PaywallFeatureType[]{UNSPECIFIED, CHARTBIT, SCREENER, ORDERBOOK, VALUATION, FINANCIALS, FUNDACHART, SEASONALITY, CALENDAR, EARNINGS, PRICE_ALERT, RUNNING_TRADE, BANDAR_DETECTOR, KEYSTATS, ANALYSIS, COMPARISON, INSIDER, COMPANY_PROFILE, CORP_ACTION, FOREIGN_DOMESTIC, TOP_BROKER, TOP_STOCK};
    }

    public static kotlin.enums.a getEntries() {
        return f158970b;
    }

    public static PaywallFeatureType valueOf(String r1) {
        return (PaywallFeatureType) Enum.valueOf(PaywallFeatureType.class, r1);
    }

    public static PaywallFeatureType[] values() {
        return (PaywallFeatureType[]) f158969a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
