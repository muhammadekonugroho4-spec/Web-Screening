package com.stockbit.model.entity.securities.orderlist;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0006HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/stockbit/model/entity/securities/orderlist/OrderListActionResponseData;", "", "canAmend", "", "canCancel", "amendTarget", "", "cancelTarget", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getCanAmend", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCanCancel", "getAmendTarget", "()Ljava/lang/String;", "getCancelTarget", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/stockbit/model/entity/securities/orderlist/OrderListActionResponseData;", "equals", "other", "hashCode", "", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OrderListActionResponseData {

    @SerializedName("amend_target")
    private final String amendTarget;

    @SerializedName("can_amend")
    private final Boolean canAmend;

    @SerializedName("can_cancel")
    private final Boolean canCancel;

    @SerializedName("cancel_target")
    private final String cancelTarget;

    public OrderListActionResponseData() {
        Boolean r1 = null;
        Boolean r2 = null;
        String r3 = null;
        String r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public final Boolean a() {
        return this.canAmend;
    }

    public final Boolean b() {
        return this.canCancel;
    }

    public final String c() {
        return this.cancelTarget;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OrderListActionResponseData) == true) goto L8;
        return false;
    L8:
        OrderListActionResponseData r52 = (OrderListActionResponseData) r5;
        if (p.g(this.canAmend, r52.canAmend) == true) goto L12;
        return false;
    L12:
        if (p.g(this.canCancel, r52.canCancel) == true) goto L15;
        return false;
    L15:
        if (p.g(this.amendTarget, r52.amendTarget) == true) goto L18;
        return false;
    L18:
        if (p.g(this.cancelTarget, r52.cancelTarget) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        Boolean r02 = this.canAmend;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Boolean r2 = this.canCancel;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.amendTarget;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.cancelTarget;
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
        return "OrderListActionResponseData(canAmend=" + this.canAmend + ", canCancel=" + this.canCancel + ", amendTarget=" + this.amendTarget + ", cancelTarget=" + this.cancelTarget + ')';
    }

    public OrderListActionResponseData(Boolean r1, Boolean r2, String r3, String r4) {
        this.canAmend = r1;
        this.canCancel = r2;
        this.amendTarget = r3;
        this.cancelTarget = r4;
    }

    public /* synthetic */ OrderListActionResponseData(Boolean r2, Boolean r3, String r4, String r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = null;
    L14:
        this(r2, r3, r4, r5);
    }
}
