package com.stockbit.domain.model.destination;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stockbit/domain/model/destination/StockbitSecuritiesRegistrationDestFragment;", "", "<init>", "(Ljava/lang/String;I)V", "STOCKBIT_LANDING", "STOCKBIT_PIN", "STOCKBIT_REJECTED", "STOCKBIT_DIRECT_REJECTED", "STOCKBIT_PENDING", "STOCKBIT_REGISTRATION", "VIRTUAL", "REFERRAL", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum StockbitSecuritiesRegistrationDestFragment extends Enum<StockbitSecuritiesRegistrationDestFragment> {
    public static final StockbitSecuritiesRegistrationDestFragment REFERRAL = null;
    public static final StockbitSecuritiesRegistrationDestFragment STOCKBIT_DIRECT_REJECTED = null;
    public static final StockbitSecuritiesRegistrationDestFragment STOCKBIT_LANDING = null;
    public static final StockbitSecuritiesRegistrationDestFragment STOCKBIT_PENDING = null;
    public static final StockbitSecuritiesRegistrationDestFragment STOCKBIT_PIN = null;
    public static final StockbitSecuritiesRegistrationDestFragment STOCKBIT_REGISTRATION = null;
    public static final StockbitSecuritiesRegistrationDestFragment STOCKBIT_REJECTED = null;
    public static final StockbitSecuritiesRegistrationDestFragment VIRTUAL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StockbitSecuritiesRegistrationDestFragment[] f82083a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f82084b = null;

    static {
        STOCKBIT_LANDING = new StockbitSecuritiesRegistrationDestFragment("STOCKBIT_LANDING", 0);
        STOCKBIT_PIN = new StockbitSecuritiesRegistrationDestFragment("STOCKBIT_PIN", 1);
        STOCKBIT_REJECTED = new StockbitSecuritiesRegistrationDestFragment("STOCKBIT_REJECTED", 2);
        STOCKBIT_DIRECT_REJECTED = new StockbitSecuritiesRegistrationDestFragment("STOCKBIT_DIRECT_REJECTED", 3);
        STOCKBIT_PENDING = new StockbitSecuritiesRegistrationDestFragment("STOCKBIT_PENDING", 4);
        STOCKBIT_REGISTRATION = new StockbitSecuritiesRegistrationDestFragment("STOCKBIT_REGISTRATION", 5);
        VIRTUAL = new StockbitSecuritiesRegistrationDestFragment("VIRTUAL", 6);
        REFERRAL = new StockbitSecuritiesRegistrationDestFragment("REFERRAL", 7);
        StockbitSecuritiesRegistrationDestFragment[] r02 = a();
        f82083a = r02;
        f82084b = b.a(r02);
    }

    StockbitSecuritiesRegistrationDestFragment(String r1, int r2) {
    }

    public static final /* synthetic */ StockbitSecuritiesRegistrationDestFragment[] a() {
        return new StockbitSecuritiesRegistrationDestFragment[]{STOCKBIT_LANDING, STOCKBIT_PIN, STOCKBIT_REJECTED, STOCKBIT_DIRECT_REJECTED, STOCKBIT_PENDING, STOCKBIT_REGISTRATION, VIRTUAL, REFERRAL};
    }

    public static a getEntries() {
        return f82084b;
    }

    public static StockbitSecuritiesRegistrationDestFragment valueOf(String r1) {
        return (StockbitSecuritiesRegistrationDestFragment) Enum.valueOf(StockbitSecuritiesRegistrationDestFragment.class, r1);
    }

    public static StockbitSecuritiesRegistrationDestFragment[] values() {
        return (StockbitSecuritiesRegistrationDestFragment[]) f82083a.clone();
    }
}
