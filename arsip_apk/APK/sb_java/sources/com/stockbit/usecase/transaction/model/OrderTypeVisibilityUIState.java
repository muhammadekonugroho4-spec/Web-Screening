package com.stockbit.usecase.transaction.model;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0083\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004J\n\u0010\"\u001a\u00020#HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\f\"\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\f\"\u0004\b\u0013\u0010\u000eR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\f\"\u0004\b\u0014\u0010\u000e¨\u0006$"}, d2 = {"Lcom/stockbit/usecase/transaction/model/OrderTypeVisibilityUIState;", "Ljava/io/Serializable;", "isShowMarketOrder", "", "isShowTrailingStop", "isShowLimitIfTouched", "isShowTakeProfitStopLoss", "isShowSplitOrder", "isShowVolumeTrigger", "isShowFastTrade", "<init>", "(ZZZZZZZ)V", "()Z", "setShowMarketOrder", "(Z)V", "setShowTrailingStop", "setShowLimitIfTouched", "setShowTakeProfitStopLoss", "setShowSplitOrder", "setShowVolumeTrigger", "setShowFastTrade", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "equals", "other", "", "hashCode", "", "toString", "", "usecase-transaction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OrderTypeVisibilityUIState implements Serializable {
    private boolean isShowFastTrade;
    private boolean isShowLimitIfTouched;
    private boolean isShowMarketOrder;
    private boolean isShowSplitOrder;
    private boolean isShowTakeProfitStopLoss;
    private boolean isShowTrailingStop;
    private boolean isShowVolumeTrigger;

    public OrderTypeVisibilityUIState(boolean r1, boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7) {
        this.isShowMarketOrder = r1;
        this.isShowTrailingStop = r2;
        this.isShowLimitIfTouched = r3;
        this.isShowTakeProfitStopLoss = r4;
        this.isShowSplitOrder = r5;
        this.isShowVolumeTrigger = r6;
        this.isShowFastTrade = r7;
    }

    public final boolean a() {
        return this.isShowLimitIfTouched;
    }

    public final boolean b() {
        return this.isShowMarketOrder;
    }

    public final boolean c() {
        return this.isShowTakeProfitStopLoss;
    }

    public final boolean d() {
        return this.isShowTrailingStop;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OrderTypeVisibilityUIState) == true) goto L8;
        return false;
    L8:
        OrderTypeVisibilityUIState r52 = (OrderTypeVisibilityUIState) r5;
        if (this.isShowMarketOrder == r52.isShowMarketOrder) goto L12;
        return false;
    L12:
        if (this.isShowTrailingStop == r52.isShowTrailingStop) goto L15;
        return false;
    L15:
        if (this.isShowLimitIfTouched == r52.isShowLimitIfTouched) goto L18;
        return false;
    L18:
        if (this.isShowTakeProfitStopLoss == r52.isShowTakeProfitStopLoss) goto L21;
        return false;
    L21:
        if (this.isShowSplitOrder == r52.isShowSplitOrder) goto L24;
        return false;
    L24:
        if (this.isShowVolumeTrigger == r52.isShowVolumeTrigger) goto L27;
        return false;
    L27:
        if (this.isShowFastTrade == r52.isShowFastTrade) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.isShowMarketOrder) * 31) + Boolean.hashCode(this.isShowTrailingStop)) * 31) + Boolean.hashCode(this.isShowLimitIfTouched)) * 31) + Boolean.hashCode(this.isShowTakeProfitStopLoss)) * 31) + Boolean.hashCode(this.isShowSplitOrder)) * 31) + Boolean.hashCode(this.isShowVolumeTrigger)) * 31) + Boolean.hashCode(this.isShowFastTrade);
    }

    public String toString() {
        return "OrderTypeVisibilityUIState(isShowMarketOrder=" + this.isShowMarketOrder + ", isShowTrailingStop=" + this.isShowTrailingStop + ", isShowLimitIfTouched=" + this.isShowLimitIfTouched + ", isShowTakeProfitStopLoss=" + this.isShowTakeProfitStopLoss + ", isShowSplitOrder=" + this.isShowSplitOrder + ", isShowVolumeTrigger=" + this.isShowVolumeTrigger + ", isShowFastTrade=" + this.isShowFastTrade + ")";
    }

    public /* synthetic */ OrderTypeVisibilityUIState(boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, int r9, i r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = false;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = false;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = false;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = false;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = false;
    L21:
        if ((r9 & 64) == 0) goto L23;
        r8 = true;
    L23:
        boolean r92 = r8;
        boolean r82 = r7;
        boolean r72 = r6;
        boolean r62 = r5;
        boolean r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92);
    }
}
