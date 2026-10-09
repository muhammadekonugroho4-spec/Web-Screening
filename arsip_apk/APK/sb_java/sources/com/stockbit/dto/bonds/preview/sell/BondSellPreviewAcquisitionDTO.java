package com.stockbit.dto.bonds.preview.sell;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J2\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/stockbit/dto/bonds/preview/sell/BondSellPreviewAcquisitionDTO;", "", Constants.KEY_DATE, "", "orderId", FirebaseAnalytics.Param.PRICE, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "getOrderId", "setOrderId", "getPrice", "()Ljava/lang/Double;", "setPrice", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/stockbit/dto/bonds/preview/sell/BondSellPreviewAcquisitionDTO;", "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BondSellPreviewAcquisitionDTO {

    @SerializedName(Constants.KEY_DATE)
    private String date;

    @SerializedName("order_id")
    private String orderId;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private Double price;

    public BondSellPreviewAcquisitionDTO() {
        String r1 = null;
        String r2 = null;
        Double r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BondSellPreviewAcquisitionDTO) == true) goto L8;
        return false;
    L8:
        BondSellPreviewAcquisitionDTO r52 = (BondSellPreviewAcquisitionDTO) r5;
        if (p.g(this.date, r52.date) == true) goto L12;
        return false;
    L12:
        if (p.g(this.orderId, r52.orderId) == true) goto L15;
        return false;
    L15:
        if (p.g(this.price, r52.price) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.date;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.orderId;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Double r23 = this.price;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "BondSellPreviewAcquisitionDTO(date=" + this.date + ", orderId=" + this.orderId + ", price=" + this.price + ")";
    }

    public BondSellPreviewAcquisitionDTO(String r1, String r2, Double r3) {
        this.date = r1;
        this.orderId = r2;
        this.price = r3;
    }

    public /* synthetic */ BondSellPreviewAcquisitionDTO(String r2, String r3, Double r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = null;
    L11:
        this(r2, r3, r4);
    }
}
