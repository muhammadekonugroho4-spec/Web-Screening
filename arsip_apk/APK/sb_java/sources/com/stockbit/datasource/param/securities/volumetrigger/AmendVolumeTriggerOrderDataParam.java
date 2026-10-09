package com.stockbit.datasource.param.securities.volumetrigger;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/stockbit/datasource/param/securities/volumetrigger/AmendVolumeTriggerOrderDataParam;", "", "newOrderExpiryType", "", "newOrderPrice", "newOrderType", "newShares", "newTriggerVolume", "newEvaluationPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNewOrderExpiryType", "()Ljava/lang/String;", "getNewOrderPrice", "getNewOrderType", "getNewShares", "getNewTriggerVolume", "getNewEvaluationPrice", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AmendVolumeTriggerOrderDataParam {

    @SerializedName("new_evaluation_price")
    private final String newEvaluationPrice;

    @SerializedName("new_order_expiry_type")
    private final String newOrderExpiryType;

    @SerializedName("new_order_price")
    private final String newOrderPrice;

    @SerializedName("new_order_type")
    private final String newOrderType;

    @SerializedName("new_shares")
    private final String newShares;

    @SerializedName("new_trigger_volume")
    private final String newTriggerVolume;

    public AmendVolumeTriggerOrderDataParam(String r1, String r2, String r3, String r4, String r5, String r6) {
        this.newOrderExpiryType = r1;
        this.newOrderPrice = r2;
        this.newOrderType = r3;
        this.newShares = r4;
        this.newTriggerVolume = r5;
        this.newEvaluationPrice = r6;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AmendVolumeTriggerOrderDataParam) == true) goto L8;
        return false;
    L8:
        AmendVolumeTriggerOrderDataParam r52 = (AmendVolumeTriggerOrderDataParam) r5;
        if (p.g(this.newOrderExpiryType, r52.newOrderExpiryType) == true) goto L12;
        return false;
    L12:
        if (p.g(this.newOrderPrice, r52.newOrderPrice) == true) goto L15;
        return false;
    L15:
        if (p.g(this.newOrderType, r52.newOrderType) == true) goto L18;
        return false;
    L18:
        if (p.g(this.newShares, r52.newShares) == true) goto L21;
        return false;
    L21:
        if (p.g(this.newTriggerVolume, r52.newTriggerVolume) == true) goto L24;
        return false;
    L24:
        if (p.g(this.newEvaluationPrice, r52.newEvaluationPrice) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        String r02 = this.newOrderExpiryType;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.newOrderPrice;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.newOrderType;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.newShares;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.newTriggerVolume;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.newEvaluationPrice;
        if (r29 == null) goto L27;
        r1 = r29.hashCode();
    L27:
        return r08 + r1;
    L21:
        r28 = r27.hashCode();
        goto L22
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "AmendVolumeTriggerOrderDataParam(newOrderExpiryType=" + this.newOrderExpiryType + ", newOrderPrice=" + this.newOrderPrice + ", newOrderType=" + this.newOrderType + ", newShares=" + this.newShares + ", newTriggerVolume=" + this.newTriggerVolume + ", newEvaluationPrice=" + this.newEvaluationPrice + ")";
    }
}
