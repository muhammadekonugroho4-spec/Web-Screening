package com.stockbit.dto.securities;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/stockbit/dto/securities/RealizedMoveStockCashDTO;", "", FirebaseAnalytics.Param.DESTINATION, "Lcom/stockbit/dto/securities/RealizedMoveStockCashDTO$RealizedMoveStockCashDetailDTO;", "source", "<init>", "(Lcom/stockbit/dto/securities/RealizedMoveStockCashDTO$RealizedMoveStockCashDetailDTO;Lcom/stockbit/dto/securities/RealizedMoveStockCashDTO$RealizedMoveStockCashDetailDTO;)V", "getDestination", "()Lcom/stockbit/dto/securities/RealizedMoveStockCashDTO$RealizedMoveStockCashDetailDTO;", "getSource", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "RealizedMoveStockCashDetailDTO", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RealizedMoveStockCashDTO {

    @SerializedName(FirebaseAnalytics.Param.DESTINATION)
    private final RealizedMoveStockCashDetailDTO destination;

    @SerializedName("source")
    private final RealizedMoveStockCashDetailDTO source;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stockbit/dto/securities/RealizedMoveStockCashDTO$RealizedMoveStockCashDetailDTO;", "", "accNo", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccNo", "()Ljava/lang/String;", "getName", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RealizedMoveStockCashDetailDTO {

        @SerializedName("acc_no")
        private final String accNo;

        @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
        private final String name;

        /* JADX WARN: Multi-variable type inference failed */
        public RealizedMoveStockCashDetailDTO() {
            Object[] r02 = 0 == true ? 1 : 0;
            this(null, r02, 3, 0 == true ? 1 : 0);
        }

        public final String a() {
            return this.accNo;
        }

        public final String b() {
            return this.name;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof RealizedMoveStockCashDetailDTO) == true) goto L8;
            return false;
        L8:
            RealizedMoveStockCashDetailDTO r52 = (RealizedMoveStockCashDetailDTO) r5;
            if (p.g(this.accNo, r52.accNo) == true) goto L12;
            return false;
        L12:
            if (p.g(this.name, r52.name) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            String r02 = this.accNo;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.name;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "RealizedMoveStockCashDetailDTO(accNo=" + this.accNo + ", name=" + this.name + ")";
        }

        public RealizedMoveStockCashDetailDTO(String r1, String r2) {
            this.accNo = r1;
            this.name = r2;
        }

        public /* synthetic */ RealizedMoveStockCashDetailDTO(String r2, String r3, int r4, i r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r4 & 2) == 0) goto L8;
            r3 = null;
        L8:
            this(r2, r3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RealizedMoveStockCashDTO() {
        Object[] r02 = 0 == true ? 1 : 0;
        this(null, r02, 3, 0 == true ? 1 : 0);
    }

    public final RealizedMoveStockCashDetailDTO a() {
        return this.destination;
    }

    public final RealizedMoveStockCashDetailDTO b() {
        return this.source;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof RealizedMoveStockCashDTO) == true) goto L8;
        return false;
    L8:
        RealizedMoveStockCashDTO r52 = (RealizedMoveStockCashDTO) r5;
        if (p.g(this.destination, r52.destination) == true) goto L12;
        return false;
    L12:
        if (p.g(this.source, r52.source) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        RealizedMoveStockCashDetailDTO r02 = this.destination;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        RealizedMoveStockCashDetailDTO r2 = this.source;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "RealizedMoveStockCashDTO(destination=" + this.destination + ", source=" + this.source + ")";
    }

    public RealizedMoveStockCashDTO(RealizedMoveStockCashDetailDTO r1, RealizedMoveStockCashDetailDTO r2) {
        this.destination = r1;
        this.source = r2;
    }

    public /* synthetic */ RealizedMoveStockCashDTO(RealizedMoveStockCashDetailDTO r2, RealizedMoveStockCashDetailDTO r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        this(r2, r3);
    }
}
