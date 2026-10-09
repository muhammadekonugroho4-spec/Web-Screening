package com.stockbit.model.entity.securities;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/stockbit/model/entity/securities/CustomSortPortfolioItemData;", "", "symbol", "", "order", "", "<init>", "(Ljava/lang/String;I)V", "getSymbol", "()Ljava/lang/String;", "getOrder", "()I", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CustomSortPortfolioItemData {

    @SerializedName("order")
    private final int order;

    @SerializedName("symbol")
    private final String symbol;

    public CustomSortPortfolioItemData(String r2, int r3) {
        p.l(r2, "symbol");
        this.symbol = r2;
        this.order = r3;
    }

    public final int a() {
        return this.order;
    }

    public final String b() {
        return this.symbol;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CustomSortPortfolioItemData) == true) goto L8;
        return false;
    L8:
        CustomSortPortfolioItemData r52 = (CustomSortPortfolioItemData) r5;
        if (p.g(this.symbol, r52.symbol) == true) goto L12;
        return false;
    L12:
        if (this.order == r52.order) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.symbol.hashCode() * 31) + Integer.hashCode(this.order);
    }

    public String toString() {
        return "CustomSortPortfolioItemData(symbol=" + this.symbol + ", order=" + this.order + ')';
    }
}
