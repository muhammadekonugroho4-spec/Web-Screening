package com.stockbit.feature.transaction.ui.portfolioorderhistory.model;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stockbit/feature/transaction/ui/portfolioorderhistory/model/PortfolioOrderHistoryChipType;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "PORTFOLIO", "ORDER", "HISTORY", "transaction_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum PortfolioOrderHistoryChipType extends Enum<PortfolioOrderHistoryChipType> {
    public static final PortfolioOrderHistoryChipType HISTORY = null;
    public static final PortfolioOrderHistoryChipType ORDER = null;
    public static final PortfolioOrderHistoryChipType PORTFOLIO = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PortfolioOrderHistoryChipType[] f115197a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f115198b = null;
    private final String label;

    static {
        PORTFOLIO = new PortfolioOrderHistoryChipType("PORTFOLIO", 0, "Portfolio");
        ORDER = new PortfolioOrderHistoryChipType("ORDER", 1, "Order");
        HISTORY = new PortfolioOrderHistoryChipType("HISTORY", 2, "History");
        PortfolioOrderHistoryChipType[] r02 = a();
        f115197a = r02;
        f115198b = b.a(r02);
    }

    PortfolioOrderHistoryChipType(String r1, int r2, String r3) {
        this.label = r3;
    }

    public static final /* synthetic */ PortfolioOrderHistoryChipType[] a() {
        return new PortfolioOrderHistoryChipType[]{PORTFOLIO, ORDER, HISTORY};
    }

    public static kotlin.enums.a getEntries() {
        return f115198b;
    }

    public static PortfolioOrderHistoryChipType valueOf(String r1) {
        return (PortfolioOrderHistoryChipType) Enum.valueOf(PortfolioOrderHistoryChipType.class, r1);
    }

    public static PortfolioOrderHistoryChipType[] values() {
        return (PortfolioOrderHistoryChipType[]) f115197a.clone();
    }

    public final String getLabel() {
        return this.label;
    }
}
