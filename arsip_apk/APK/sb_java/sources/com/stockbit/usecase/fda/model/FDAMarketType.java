package com.stockbit.usecase.fda.model;

import com.google.firebase.messaging.Constants;
import com.iab.digitalidentity.sdk.core.model.GoPayPlusCameraConfigKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stockbit/usecase/fda/model/FDAMarketType;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "value", "automationId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getValue", "getAutomationId", "FDA_MARKET_TYPE_REGULAR", "FDA_MARKET_TYPE_ALL_MARKET", "usecase-fda"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum FDAMarketType extends Enum<FDAMarketType> {
    public static final FDAMarketType FDA_MARKET_TYPE_ALL_MARKET = null;
    public static final FDAMarketType FDA_MARKET_TYPE_REGULAR = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FDAMarketType[] f157793a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f157794b = null;
    private final String automationId;
    private final String label;
    private final String value;

    static {
        FDA_MARKET_TYPE_REGULAR = new FDAMarketType("FDA_MARKET_TYPE_REGULAR", 0, "Regular", "MARKET_TYPE_REGULAR", "0");
        FDA_MARKET_TYPE_ALL_MARKET = new FDAMarketType("FDA_MARKET_TYPE_ALL_MARKET", 1, "All Market", "MARKET_TYPE_ALL_MARKET", GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A);
        FDAMarketType[] r02 = a();
        f157793a = r02;
        f157794b = kotlin.enums.b.a(r02);
    }

    FDAMarketType(String r1, int r2, String r3, String r4, String r5) {
        this.label = r3;
        this.value = r4;
        this.automationId = r5;
    }

    public static final /* synthetic */ FDAMarketType[] a() {
        return new FDAMarketType[]{FDA_MARKET_TYPE_REGULAR, FDA_MARKET_TYPE_ALL_MARKET};
    }

    public static kotlin.enums.a getEntries() {
        return f157794b;
    }

    public static FDAMarketType valueOf(String r1) {
        return (FDAMarketType) Enum.valueOf(FDAMarketType.class, r1);
    }

    public static FDAMarketType[] values() {
        return (FDAMarketType[]) f157793a.clone();
    }

    public final String getAutomationId() {
        return this.automationId;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getValue() {
        return this.value;
    }
}
