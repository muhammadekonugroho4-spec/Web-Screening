package com.stockbit.datasource.param.securities;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/stockbit/datasource/param/securities/PostOrderBulkCancelDataParam;", "", "accNo", "", "orderId", "", "salesName", "uiRef", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getAccNo", "()Ljava/lang/String;", "getOrderId", "()Ljava/util/List;", "getSalesName", "getUiRef", "setUiRef", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PostOrderBulkCancelDataParam {

    @SerializedName("acc_no")
    private final String accNo;

    @SerializedName("order_id")
    private final List<String> orderId;

    @SerializedName("sales_name")
    private final String salesName;

    @SerializedName("ui_ref")
    private String uiRef;

    public PostOrderBulkCancelDataParam(String r1, List<String> r2, String r3, String r4) {
        this.accNo = r1;
        this.orderId = r2;
        this.salesName = r3;
        this.uiRef = r4;
    }

    public final void a(String r1) {
        this.uiRef = r1;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof PostOrderBulkCancelDataParam) == true) goto L8;
        return false;
    L8:
        PostOrderBulkCancelDataParam r52 = (PostOrderBulkCancelDataParam) r5;
        if (p.g(this.accNo, r52.accNo) == true) goto L12;
        return false;
    L12:
        if (p.g(this.orderId, r52.orderId) == true) goto L15;
        return false;
    L15:
        if (p.g(this.salesName, r52.salesName) == true) goto L18;
        return false;
    L18:
        if (p.g(this.uiRef, r52.uiRef) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        String r02 = this.accNo;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        List<String> r2 = this.orderId;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.salesName;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.uiRef;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return r06 + r1;
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
        return "PostOrderBulkCancelDataParam(accNo=" + this.accNo + ", orderId=" + this.orderId + ", salesName=" + this.salesName + ", uiRef=" + this.uiRef + ")";
    }
}
