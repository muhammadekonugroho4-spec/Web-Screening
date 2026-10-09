package com.stockbit.dto.securities.common;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0018B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/stockbit/dto/securities/common/FullCallAuctionCycleDTO;", "", "banner", "Lcom/stockbit/dto/securities/common/FullCallAuctionCycleDTO$BannerMessageDTO;", "sessionPhase", "", "sessionType", "<init>", "(Lcom/stockbit/dto/securities/common/FullCallAuctionCycleDTO$BannerMessageDTO;Ljava/lang/String;Ljava/lang/String;)V", "getBanner", "()Lcom/stockbit/dto/securities/common/FullCallAuctionCycleDTO$BannerMessageDTO;", "getSessionPhase", "()Ljava/lang/String;", "getSessionType", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "BannerMessageDTO", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FullCallAuctionCycleDTO {

    @SerializedName("banner")
    private final BannerMessageDTO banner;

    @SerializedName("session_phase")
    private final String sessionPhase;

    @SerializedName("session_type")
    private final String sessionType;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stockbit/dto/securities/common/FullCallAuctionCycleDTO$BannerMessageDTO;", "", "formattedMsg", "", "<init>", "(Ljava/lang/String;)V", "getFormattedMsg", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BannerMessageDTO {

        @SerializedName("formatted_msg")
        private final String formattedMsg;

        /* JADX WARN: Multi-variable type inference failed */
        public BannerMessageDTO() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final String a() {
            return this.formattedMsg;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof BannerMessageDTO) == true) goto L9;
            return false;
        L9:
            if (p.g(this.formattedMsg, ((BannerMessageDTO) r4).formattedMsg) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.formattedMsg;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "BannerMessageDTO(formattedMsg=" + this.formattedMsg + ")";
        }

        public BannerMessageDTO(String r1) {
            this.formattedMsg = r1;
        }

        public /* synthetic */ BannerMessageDTO(String r1, int r2, i r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = null;
        L5:
            this(r1);
        }
    }

    public FullCallAuctionCycleDTO() {
        BannerMessageDTO r1 = null;
        String r2 = null;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public final BannerMessageDTO a() {
        return this.banner;
    }

    public final String b() {
        return this.sessionPhase;
    }

    public final String c() {
        return this.sessionType;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof FullCallAuctionCycleDTO) == true) goto L8;
        return false;
    L8:
        FullCallAuctionCycleDTO r52 = (FullCallAuctionCycleDTO) r5;
        if (p.g(this.banner, r52.banner) == true) goto L12;
        return false;
    L12:
        if (p.g(this.sessionPhase, r52.sessionPhase) == true) goto L15;
        return false;
    L15:
        if (p.g(this.sessionType, r52.sessionType) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        BannerMessageDTO r02 = this.banner;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.sessionPhase;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.sessionType;
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
        return "FullCallAuctionCycleDTO(banner=" + this.banner + ", sessionPhase=" + this.sessionPhase + ", sessionType=" + this.sessionType + ")";
    }

    public FullCallAuctionCycleDTO(BannerMessageDTO r1, String r2, String r3) {
        this.banner = r1;
        this.sessionPhase = r2;
        this.sessionType = r3;
    }

    public /* synthetic */ FullCallAuctionCycleDTO(BannerMessageDTO r2, String r3, String r4, int r5, i r6) {
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
