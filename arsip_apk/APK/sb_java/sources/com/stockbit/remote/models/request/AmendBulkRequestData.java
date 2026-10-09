package com.stockbit.remote.models.request;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/stockbit/remote/models/request/AmendBulkRequestData;", "", "uiRef", "", "amendRequest", "", "Lcom/stockbit/remote/models/request/AmendBulkRequestData$Item;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getUiRef", "()Ljava/lang/String;", "getAmendRequest", "()Ljava/util/List;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Item", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AmendBulkRequestData {

    @SerializedName("amend_request")
    private final List<Item> amendRequest;

    @SerializedName("ui_ref")
    private final String uiRef;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/stockbit/remote/models/request/AmendBulkRequestData$Item;", "", FirebaseAnalytics.Param.PRICE, "", "shares", "orderId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPrice", "()Ljava/lang/String;", "getShares", "getOrderId", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Item {

        @SerializedName("order_id")
        private final String orderId;

        @SerializedName(FirebaseAnalytics.Param.PRICE)
        private final String price;

        @SerializedName("shares")
        private final String shares;

        public Item(String r2, String r3, String r4) {
            p.l(r2, FirebaseAnalytics.Param.PRICE);
            p.l(r3, "shares");
            p.l(r4, "orderId");
            this.price = r2;
            this.shares = r3;
            this.orderId = r4;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Item) == true) goto L8;
            return false;
        L8:
            Item r52 = (Item) r5;
            if (p.g(this.price, r52.price) == true) goto L12;
            return false;
        L12:
            if (p.g(this.shares, r52.shares) == true) goto L15;
            return false;
        L15:
            if (p.g(this.orderId, r52.orderId) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.price.hashCode() * 31) + this.shares.hashCode()) * 31) + this.orderId.hashCode();
        }

        public String toString() {
            return "Item(price=" + this.price + ", shares=" + this.shares + ", orderId=" + this.orderId + ')';
        }
    }

    public AmendBulkRequestData(String r2, List<Item> r3) {
        p.l(r2, "uiRef");
        p.l(r3, "amendRequest");
        this.uiRef = r2;
        this.amendRequest = r3;
    }

    public static /* synthetic */ AmendBulkRequestData b(AmendBulkRequestData r02, String r1, List r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.uiRef;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.amendRequest;
    L9:
        return r02.a(r1, r2);
    }

    public final AmendBulkRequestData a(String r2, List r3) {
        p.l(r2, "uiRef");
        p.l(r3, "amendRequest");
        return new AmendBulkRequestData(r2, r3);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AmendBulkRequestData) == true) goto L8;
        return false;
    L8:
        AmendBulkRequestData r52 = (AmendBulkRequestData) r5;
        if (p.g(this.uiRef, r52.uiRef) == true) goto L12;
        return false;
    L12:
        if (p.g(this.amendRequest, r52.amendRequest) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.uiRef.hashCode() * 31) + this.amendRequest.hashCode();
    }

    public String toString() {
        return "AmendBulkRequestData(uiRef=" + this.uiRef + ", amendRequest=" + this.amendRequest + ')';
    }
}
