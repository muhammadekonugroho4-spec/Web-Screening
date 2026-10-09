package com.stockbit.dto.alert;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/stockbit/dto/alert/AlertSummaryResponseDTO;", "", "unseenCount", "Lcom/stockbit/dto/alert/AlertSummaryResponseDTO$UnseenCount;", "activeAlert", "", "<init>", "(Lcom/stockbit/dto/alert/AlertSummaryResponseDTO$UnseenCount;Ljava/lang/Integer;)V", "getUnseenCount", "()Lcom/stockbit/dto/alert/AlertSummaryResponseDTO$UnseenCount;", "getActiveAlert", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", Constants.COPY_TYPE, "(Lcom/stockbit/dto/alert/AlertSummaryResponseDTO$UnseenCount;Ljava/lang/Integer;)Lcom/stockbit/dto/alert/AlertSummaryResponseDTO;", "equals", "", "other", "hashCode", "toString", "", "UnseenCount", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AlertSummaryResponseDTO {

    @SerializedName("active_alert")
    private final Integer activeAlert;

    @SerializedName("unseen_count")
    private final UnseenCount unseenCount;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stockbit/dto/alert/AlertSummaryResponseDTO$UnseenCount;", "", "triggered", "", "<init>", "(Ljava/lang/Integer;)V", "getTriggered", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", Constants.COPY_TYPE, "(Ljava/lang/Integer;)Lcom/stockbit/dto/alert/AlertSummaryResponseDTO$UnseenCount;", "equals", "", "other", "hashCode", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UnseenCount {

        @SerializedName("triggered")
        private final Integer triggered;

        /* JADX WARN: Multi-variable type inference failed */
        public UnseenCount() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final Integer a() {
            return this.triggered;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof UnseenCount) == true) goto L9;
            return false;
        L9:
            if (p.g(this.triggered, ((UnseenCount) r4).triggered) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            Integer r02 = this.triggered;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "UnseenCount(triggered=" + this.triggered + ")";
        }

        public UnseenCount(Integer r1) {
            this.triggered = r1;
        }

        public /* synthetic */ UnseenCount(Integer r1, int r2, i r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = null;
        L5:
            this(r1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlertSummaryResponseDTO() {
        Object[] r02 = 0 == true ? 1 : 0;
        this(null, r02, 3, 0 == true ? 1 : 0);
    }

    public final Integer a() {
        return this.activeAlert;
    }

    public final UnseenCount b() {
        return this.unseenCount;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AlertSummaryResponseDTO) == true) goto L8;
        return false;
    L8:
        AlertSummaryResponseDTO r52 = (AlertSummaryResponseDTO) r5;
        if (p.g(this.unseenCount, r52.unseenCount) == true) goto L12;
        return false;
    L12:
        if (p.g(this.activeAlert, r52.activeAlert) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        UnseenCount r02 = this.unseenCount;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.activeAlert;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "AlertSummaryResponseDTO(unseenCount=" + this.unseenCount + ", activeAlert=" + this.activeAlert + ")";
    }

    public AlertSummaryResponseDTO(UnseenCount r1, Integer r2) {
        this.unseenCount = r1;
        this.activeAlert = r2;
    }

    public /* synthetic */ AlertSummaryResponseDTO(UnseenCount r2, Integer r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        this(r2, r3);
    }
}
