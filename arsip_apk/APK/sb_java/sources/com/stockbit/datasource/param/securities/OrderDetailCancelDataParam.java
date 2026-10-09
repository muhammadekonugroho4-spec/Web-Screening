package com.stockbit.datasource.param.securities;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\b\"\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/stockbit/datasource/param/securities/OrderDetailCancelDataParam;", "", "orderId", "", "uiRef", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "getUiRef", "setUiRef", "(Ljava/lang/String;)V", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OrderDetailCancelDataParam {

    @SerializedName("order_id")
    private final String orderId;

    @SerializedName("ui_ref")
    private String uiRef;

    public OrderDetailCancelDataParam(String r2, String r3) {
        p.l(r2, "orderId");
        p.l(r3, "uiRef");
        this.orderId = r2;
        this.uiRef = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OrderDetailCancelDataParam) == true) goto L8;
        return false;
    L8:
        OrderDetailCancelDataParam r52 = (OrderDetailCancelDataParam) r5;
        if (p.g(this.orderId, r52.orderId) == true) goto L12;
        return false;
    L12:
        if (p.g(this.uiRef, r52.uiRef) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.orderId.hashCode() * 31) + this.uiRef.hashCode();
    }

    public String toString() {
        return "OrderDetailCancelDataParam(orderId=" + this.orderId + ", uiRef=" + this.uiRef + ")";
    }
}
