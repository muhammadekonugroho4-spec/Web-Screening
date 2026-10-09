package com.stockbit.usecase.company.model.type;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/usecase/company/model/type/TradeBookViewByType;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "TRADE_BOOK_VIEW_BY_VALUE", "TRADE_BOOK_VIEW_BY_VOLUME", "usecase-company"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum TradeBookViewByType extends Enum<TradeBookViewByType> {
    public static final TradeBookViewByType TRADE_BOOK_VIEW_BY_VALUE = null;
    public static final TradeBookViewByType TRADE_BOOK_VIEW_BY_VOLUME = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TradeBookViewByType[] f156675a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f156676b = null;
    private final String label;

    static {
        TRADE_BOOK_VIEW_BY_VALUE = new TradeBookViewByType("TRADE_BOOK_VIEW_BY_VALUE", 0, "Value");
        TRADE_BOOK_VIEW_BY_VOLUME = new TradeBookViewByType("TRADE_BOOK_VIEW_BY_VOLUME", 1, "Volume");
        TradeBookViewByType[] r02 = a();
        f156675a = r02;
        f156676b = b.a(r02);
    }

    TradeBookViewByType(String r1, int r2, String r3) {
        this.label = r3;
    }

    public static final /* synthetic */ TradeBookViewByType[] a() {
        return new TradeBookViewByType[]{TRADE_BOOK_VIEW_BY_VALUE, TRADE_BOOK_VIEW_BY_VOLUME};
    }

    public static a getEntries() {
        return f156676b;
    }

    public static TradeBookViewByType valueOf(String r1) {
        return (TradeBookViewByType) Enum.valueOf(TradeBookViewByType.class, r1);
    }

    public static TradeBookViewByType[] values() {
        return (TradeBookViewByType[]) f156675a.clone();
    }

    public final String getLabel() {
        return this.label;
    }
}
