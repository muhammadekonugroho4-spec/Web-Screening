package com.stockbit.datasource.param.securities;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B#\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0006HÖ\u0081\u0004R \u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/stockbit/datasource/param/securities/PostOrderAmendBulkDataParam;", "", "amendRequest", "", "Lcom/stockbit/datasource/param/securities/PostOrderAmendBulkDataParam$AmendRequest;", "uiRef", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getAmendRequest", "()Ljava/util/List;", "getUiRef", "()Ljava/lang/String;", "setUiRef", "(Ljava/lang/String;)V", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "AmendRequest", "Metadata", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PostOrderAmendBulkDataParam {

    @SerializedName("amend_request")
    private final List<AmendRequest> amendRequest;

    @SerializedName("ui_ref")
    private String uiRef;

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0005HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/stockbit/datasource/param/securities/PostOrderAmendBulkDataParam$AmendRequest;", "", "metadata", "Lcom/stockbit/datasource/param/securities/PostOrderAmendBulkDataParam$Metadata;", "orderId", "", FirebaseAnalytics.Param.PRICE, "", "shares", "<init>", "(Lcom/stockbit/datasource/param/securities/PostOrderAmendBulkDataParam$Metadata;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getMetadata", "()Lcom/stockbit/datasource/param/securities/PostOrderAmendBulkDataParam$Metadata;", "getOrderId", "()Ljava/lang/String;", "getPrice", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShares", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "(Lcom/stockbit/datasource/param/securities/PostOrderAmendBulkDataParam$Metadata;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stockbit/datasource/param/securities/PostOrderAmendBulkDataParam$AmendRequest;", "equals", "", "other", "hashCode", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AmendRequest {

        @SerializedName("metadata")
        private final Metadata metadata;

        @SerializedName("order_id")
        private final String orderId;

        @SerializedName(FirebaseAnalytics.Param.PRICE)
        private final Integer price;

        @SerializedName("shares")
        private final String shares;

        public AmendRequest(Metadata r1, String r2, Integer r3, String r4) {
            this.metadata = r1;
            this.orderId = r2;
            this.price = r3;
            this.shares = r4;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof AmendRequest) == true) goto L8;
            return false;
        L8:
            AmendRequest r52 = (AmendRequest) r5;
            if (p.g(this.metadata, r52.metadata) == true) goto L12;
            return false;
        L12:
            if (p.g(this.orderId, r52.orderId) == true) goto L15;
            return false;
        L15:
            if (p.g(this.price, r52.price) == true) goto L18;
            return false;
        L18:
            if (p.g(this.shares, r52.shares) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            Metadata r02 = this.metadata;
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
            Integer r23 = this.price;
            if (r23 != null) goto L13;
            int r24 = 0;
        L14:
            int r06 = (r05 + r24) * 31;
            String r25 = this.shares;
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
            return "AmendRequest(metadata=" + this.metadata + ", orderId=" + this.orderId + ", price=" + this.price + ", shares=" + this.shares + ")";
        }

        public /* synthetic */ AmendRequest(Metadata r1, String r2, Integer r3, String r4, int r5, i r6) {
            if ((r5 & 1) == 0) goto L5;
            r1 = null;
        L5:
            this(r1, r2, r3, r4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stockbit/datasource/param/securities/PostOrderAmendBulkDataParam$Metadata;", "", "typeUrl", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTypeUrl", "()Ljava/lang/String;", "getValue", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Metadata {

        @SerializedName("type_url")
        private final String typeUrl;

        @SerializedName("value")
        private final String value;

        public Metadata(String r1, String r2) {
            this.typeUrl = r1;
            this.value = r2;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Metadata) == true) goto L8;
            return false;
        L8:
            Metadata r52 = (Metadata) r5;
            if (p.g(this.typeUrl, r52.typeUrl) == true) goto L12;
            return false;
        L12:
            if (p.g(this.value, r52.value) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            String r02 = this.typeUrl;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.value;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "Metadata(typeUrl=" + this.typeUrl + ", value=" + this.value + ")";
        }
    }

    public PostOrderAmendBulkDataParam(List<AmendRequest> r1, String r2) {
        this.amendRequest = r1;
        this.uiRef = r2;
    }

    public final void a(String r1) {
        this.uiRef = r1;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof PostOrderAmendBulkDataParam) == true) goto L8;
        return false;
    L8:
        PostOrderAmendBulkDataParam r52 = (PostOrderAmendBulkDataParam) r5;
        if (p.g(this.amendRequest, r52.amendRequest) == true) goto L12;
        return false;
    L12:
        if (p.g(this.uiRef, r52.uiRef) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        List<AmendRequest> r02 = this.amendRequest;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.uiRef;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "PostOrderAmendBulkDataParam(amendRequest=" + this.amendRequest + ", uiRef=" + this.uiRef + ")";
    }
}
