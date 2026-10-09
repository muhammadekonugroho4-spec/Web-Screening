package com.stockbit.dto.topstock;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001fBC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0007HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\b\u0010\u000fR\u001a\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\t\u0010\u000f¨\u0006 "}, d2 = {"Lcom/stockbit/dto/topstock/TopStockDisplayOptionDTO;", "", "enabledValueType", "Lcom/stockbit/dto/topstock/TopStockDisplayOptionDTO$TopStockDisplayOptionValueDTO;", "foreignValueColumn", "", "bannerMessage", "", "isMidDay", "isBreakTime", "<init>", "(Lcom/stockbit/dto/topstock/TopStockDisplayOptionDTO$TopStockDisplayOptionValueDTO;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getEnabledValueType", "()Lcom/stockbit/dto/topstock/TopStockDisplayOptionDTO$TopStockDisplayOptionValueDTO;", "getForeignValueColumn", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBannerMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "(Lcom/stockbit/dto/topstock/TopStockDisplayOptionDTO$TopStockDisplayOptionValueDTO;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/stockbit/dto/topstock/TopStockDisplayOptionDTO;", "equals", "other", "hashCode", "", "toString", "TopStockDisplayOptionValueDTO", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TopStockDisplayOptionDTO {

    @SerializedName("banner_message")
    private final String bannerMessage;

    @SerializedName("enabled_value_type")
    private final TopStockDisplayOptionValueDTO enabledValueType;

    @SerializedName("foreign_value_column")
    private final Boolean foreignValueColumn;

    @SerializedName("is_break_time")
    private final Boolean isBreakTime;

    @SerializedName("is_mid_day")
    private final Boolean isMidDay;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/stockbit/dto/topstock/TopStockDisplayOptionDTO$TopStockDisplayOptionValueDTO;", "", "gross", "", "net", "total", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getGross", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNet", "getTotal", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/stockbit/dto/topstock/TopStockDisplayOptionDTO$TopStockDisplayOptionValueDTO;", "equals", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TopStockDisplayOptionValueDTO {

        @SerializedName("gross")
        private final Boolean gross;

        @SerializedName("net")
        private final Boolean net;

        @SerializedName("total")
        private final Boolean total;

        public TopStockDisplayOptionValueDTO() {
            Boolean r1 = null;
            Boolean r2 = null;
            Boolean r3 = null;
            this(r1, r2, r3, 7, null);
        }

        public final Boolean a() {
            return this.gross;
        }

        public final Boolean b() {
            return this.net;
        }

        public final Boolean c() {
            return this.total;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof TopStockDisplayOptionValueDTO) == true) goto L8;
            return false;
        L8:
            TopStockDisplayOptionValueDTO r52 = (TopStockDisplayOptionValueDTO) r5;
            if (p.g(this.gross, r52.gross) == true) goto L12;
            return false;
        L12:
            if (p.g(this.net, r52.net) == true) goto L15;
            return false;
        L15:
            if (p.g(this.total, r52.total) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            Boolean r02 = this.gross;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            Boolean r2 = this.net;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            Boolean r23 = this.total;
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
            return "TopStockDisplayOptionValueDTO(gross=" + this.gross + ", net=" + this.net + ", total=" + this.total + ")";
        }

        public TopStockDisplayOptionValueDTO(Boolean r1, Boolean r2, Boolean r3) {
            this.gross = r1;
            this.net = r2;
            this.total = r3;
        }

        public /* synthetic */ TopStockDisplayOptionValueDTO(Boolean r2, Boolean r3, Boolean r4, int r5, i r6) {
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

    public TopStockDisplayOptionDTO() {
        TopStockDisplayOptionValueDTO r1 = null;
        Boolean r2 = null;
        String r3 = null;
        Boolean r4 = null;
        Boolean r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public final String a() {
        return this.bannerMessage;
    }

    public final TopStockDisplayOptionValueDTO b() {
        return this.enabledValueType;
    }

    public final Boolean c() {
        return this.foreignValueColumn;
    }

    public final Boolean d() {
        return this.isBreakTime;
    }

    public final Boolean e() {
        return this.isMidDay;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TopStockDisplayOptionDTO) == true) goto L8;
        return false;
    L8:
        TopStockDisplayOptionDTO r52 = (TopStockDisplayOptionDTO) r5;
        if (p.g(this.enabledValueType, r52.enabledValueType) == true) goto L12;
        return false;
    L12:
        if (p.g(this.foreignValueColumn, r52.foreignValueColumn) == true) goto L15;
        return false;
    L15:
        if (p.g(this.bannerMessage, r52.bannerMessage) == true) goto L18;
        return false;
    L18:
        if (p.g(this.isMidDay, r52.isMidDay) == true) goto L21;
        return false;
    L21:
        if (p.g(this.isBreakTime, r52.isBreakTime) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        TopStockDisplayOptionValueDTO r02 = this.enabledValueType;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Boolean r2 = this.foreignValueColumn;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.bannerMessage;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Boolean r25 = this.isMidDay;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Boolean r27 = this.isBreakTime;
        if (r27 == null) goto L23;
        r1 = r27.hashCode();
    L23:
        return r07 + r1;
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
        return "TopStockDisplayOptionDTO(enabledValueType=" + this.enabledValueType + ", foreignValueColumn=" + this.foreignValueColumn + ", bannerMessage=" + this.bannerMessage + ", isMidDay=" + this.isMidDay + ", isBreakTime=" + this.isBreakTime + ")";
    }

    public TopStockDisplayOptionDTO(TopStockDisplayOptionValueDTO r1, Boolean r2, String r3, Boolean r4, Boolean r5) {
        this.enabledValueType = r1;
        this.foreignValueColumn = r2;
        this.bannerMessage = r3;
        this.isMidDay = r4;
        this.isBreakTime = r5;
    }

    public /* synthetic */ TopStockDisplayOptionDTO(TopStockDisplayOptionValueDTO r2, Boolean r3, String r4, Boolean r5, Boolean r6, int r7, i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r7 & 16) == 0) goto L18;
        Boolean r72 = null;
    L17:
        Boolean r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72);
        return;
    L18:
        r72 = r6;
        goto L17
    }
}
