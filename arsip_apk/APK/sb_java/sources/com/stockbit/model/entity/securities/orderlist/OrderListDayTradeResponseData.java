package com.stockbit.model.entity.securities.orderlist;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0002\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/stockbit/model/entity/securities/orderlist/OrderListDayTradeResponseData;", "", "isDayTrade", "", "forceSellEvent", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getForceSellEvent", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/stockbit/model/entity/securities/orderlist/OrderListDayTradeResponseData;", "equals", "other", "hashCode", "", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OrderListDayTradeResponseData {

    @SerializedName("force_sell_event")
    private final String forceSellEvent;

    @SerializedName("is_day_trade")
    private final Boolean isDayTrade;

    /* JADX WARN: Multi-variable type inference failed */
    public OrderListDayTradeResponseData() {
        Object[] r02 = 0 == true ? 1 : 0;
        this(null, r02, 3, 0 == true ? 1 : 0);
    }

    public final Boolean a() {
        return this.isDayTrade;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OrderListDayTradeResponseData) == true) goto L8;
        return false;
    L8:
        OrderListDayTradeResponseData r52 = (OrderListDayTradeResponseData) r5;
        if (p.g(this.isDayTrade, r52.isDayTrade) == true) goto L12;
        return false;
    L12:
        if (p.g(this.forceSellEvent, r52.forceSellEvent) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Boolean r02 = this.isDayTrade;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.forceSellEvent;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "OrderListDayTradeResponseData(isDayTrade=" + this.isDayTrade + ", forceSellEvent=" + this.forceSellEvent + ')';
    }

    public OrderListDayTradeResponseData(Boolean r1, String r2) {
        this.isDayTrade = r1;
        this.forceSellEvent = r2;
    }

    public /* synthetic */ OrderListDayTradeResponseData(Boolean r1, String r2, int r3, i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = Boolean.FALSE;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = null;
    L8:
        this(r1, r2);
    }
}
