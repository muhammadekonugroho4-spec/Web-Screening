package com.stockbit.model.entity.tipping;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/stockbit/model/entity/tipping/TippingDetailAmountResponseData;", "", "claim", "", "fee", "total", "<init>", "(III)V", "getClaim", "()I", "getFee", "getTotal", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TippingDetailAmountResponseData {

    @SerializedName("claim")
    private final int claim;

    @SerializedName("fee")
    private final int fee;

    @SerializedName("total")
    private final int total;

    public TippingDetailAmountResponseData(int r1, int r2, int r3) {
        this.claim = r1;
        this.fee = r2;
        this.total = r3;
    }

    public final int a() {
        return this.claim;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TippingDetailAmountResponseData) == true) goto L8;
        return false;
    L8:
        TippingDetailAmountResponseData r52 = (TippingDetailAmountResponseData) r5;
        if (this.claim == r52.claim) goto L12;
        return false;
    L12:
        if (this.fee == r52.fee) goto L15;
        return false;
    L15:
        if (this.total == r52.total) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.claim) * 31) + Integer.hashCode(this.fee)) * 31) + Integer.hashCode(this.total);
    }

    public String toString() {
        return "TippingDetailAmountResponseData(claim=" + this.claim + ", fee=" + this.fee + ", total=" + this.total + ')';
    }

    public /* synthetic */ TippingDetailAmountResponseData(int r1, int r2, int r3, int r4, i r5) {
        if ((r4 & 2) == 0) goto L5;
        r2 = 0;
    L5:
        this(r1, r2, r3);
    }
}
