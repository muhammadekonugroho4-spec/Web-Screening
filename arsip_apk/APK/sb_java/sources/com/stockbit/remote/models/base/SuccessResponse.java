package com.stockbit.remote.models.base;

import com.gojek.ojosdk.exif.ExifInterface;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import com.stockbit.calendar.CalendarEntryPoint;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u001f B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003JD\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, d2 = {"Lcom/stockbit/remote/models/base/SuccessResponse;", ExifInterface.GpsTrackRef.TRUE_DIRECTION, "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "message", "", "orderLimitInfo", "metadata", "Lcom/stockbit/remote/models/base/SuccessResponse$Metadata;", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Lcom/stockbit/remote/models/base/SuccessResponse$Metadata;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "getOrderLimitInfo", "getMetadata", "()Lcom/stockbit/remote/models/base/SuccessResponse$Metadata;", "component1", "component2", "component3", "component4", com.clevertap.android.sdk.Constants.COPY_TYPE, "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Lcom/stockbit/remote/models/base/SuccessResponse$Metadata;)Lcom/stockbit/remote/models/base/SuccessResponse;", "equals", "", "other", "hashCode", "", "toString", "OrderLimitInfo", "Metadata", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SuccessResponse<T> {

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private final T data;

    @SerializedName("message")
    private final String message;

    @SerializedName("metadata")
    private final Metadata metadata;

    @SerializedName("order_limit_info")
    private final T orderLimitInfo;

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/stockbit/remote/models/base/SuccessResponse$Metadata;", "", CalendarEntryPoint.KEY_PAGE_DETAIL, "", com.clevertap.android.sdk.Constants.KEY_LIMIT, "total", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLimit", "getTotal", "component1", "component2", "component3", com.clevertap.android.sdk.Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/stockbit/remote/models/base/SuccessResponse$Metadata;", "equals", "", "other", "hashCode", "toString", "", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Metadata {

        @SerializedName(com.clevertap.android.sdk.Constants.KEY_LIMIT)
        private final Integer limit;

        @SerializedName(CalendarEntryPoint.KEY_PAGE_DETAIL)
        private final Integer page;

        @SerializedName("total")
        private final Integer total;

        public Metadata() {
            Integer r1 = null;
            Integer r2 = null;
            Integer r3 = null;
            this(r1, r2, r3, 7, null);
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Metadata) == true) goto L8;
            return false;
        L8:
            Metadata r52 = (Metadata) r5;
            if (p.g(this.page, r52.page) == true) goto L12;
            return false;
        L12:
            if (p.g(this.limit, r52.limit) == true) goto L15;
            return false;
        L15:
            if (p.g(this.total, r52.total) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            Integer r02 = this.page;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            Integer r2 = this.limit;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            Integer r23 = this.total;
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
            return "Metadata(page=" + this.page + ", limit=" + this.limit + ", total=" + this.total + ')';
        }

        public Metadata(Integer r1, Integer r2, Integer r3) {
            this.page = r1;
            this.limit = r2;
            this.total = r3;
        }

        public /* synthetic */ Metadata(Integer r2, Integer r3, Integer r4, int r5, i r6) {
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

    public SuccessResponse(T r1, String r2, T r3, Metadata r4) {
        this.data = r1;
        this.message = r2;
        this.orderLimitInfo = r3;
        this.metadata = r4;
    }

    public final Object a() {
        return this.data;
    }

    public final String b() {
        return this.message;
    }

    public final Object c() {
        return this.orderLimitInfo;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SuccessResponse) == true) goto L8;
        return false;
    L8:
        SuccessResponse r52 = (SuccessResponse) r5;
        if (p.g(this.data, r52.data) == true) goto L12;
        return false;
    L12:
        if (p.g(this.message, r52.message) == true) goto L15;
        return false;
    L15:
        if (p.g(this.orderLimitInfo, r52.orderLimitInfo) == true) goto L18;
        return false;
    L18:
        if (p.g(this.metadata, r52.metadata) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        T r02 = this.data;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.message;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        T r23 = this.orderLimitInfo;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Metadata r25 = this.metadata;
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
        return "SuccessResponse(data=" + this.data + ", message=" + this.message + ", orderLimitInfo=" + this.orderLimitInfo + ", metadata=" + this.metadata + ')';
    }

    public /* synthetic */ SuccessResponse(Object r2, String r3, Object r4, Metadata r5, int r6, i r7) {
        if ((r6 & 4) == 0) goto L6;
        r4 = null;
    L6:
        if ((r6 & 8) == 0) goto L8;
        r5 = null;
    L8:
        this(r2, r3, r4, r5);
    }
}
