package com.stockbit.dto.margintrading;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0006HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0002\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0004\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/stockbit/dto/margintrading/MarginTradingCollateralSubmissionAssesmentDTO;", "", "isAmountSufficient", "", "isAssetSufficient", "reason", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getReason", "()Ljava/lang/String;", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/stockbit/dto/margintrading/MarginTradingCollateralSubmissionAssesmentDTO;", "equals", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MarginTradingCollateralSubmissionAssesmentDTO {

    @SerializedName("is_amount_sufficient")
    private final Boolean isAmountSufficient;

    @SerializedName("is_asset_sufficient")
    private final Boolean isAssetSufficient;

    @SerializedName("reason")
    private final String reason;

    public MarginTradingCollateralSubmissionAssesmentDTO() {
        Boolean r1 = null;
        Boolean r2 = null;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public final String a() {
        return this.reason;
    }

    public final Boolean b() {
        return this.isAmountSufficient;
    }

    public final Boolean c() {
        return this.isAssetSufficient;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MarginTradingCollateralSubmissionAssesmentDTO) == true) goto L8;
        return false;
    L8:
        MarginTradingCollateralSubmissionAssesmentDTO r52 = (MarginTradingCollateralSubmissionAssesmentDTO) r5;
        if (p.g(this.isAmountSufficient, r52.isAmountSufficient) == true) goto L12;
        return false;
    L12:
        if (p.g(this.isAssetSufficient, r52.isAssetSufficient) == true) goto L15;
        return false;
    L15:
        if (p.g(this.reason, r52.reason) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        Boolean r02 = this.isAmountSufficient;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Boolean r2 = this.isAssetSufficient;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.reason;
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
        return "MarginTradingCollateralSubmissionAssesmentDTO(isAmountSufficient=" + this.isAmountSufficient + ", isAssetSufficient=" + this.isAssetSufficient + ", reason=" + this.reason + ")";
    }

    public MarginTradingCollateralSubmissionAssesmentDTO(Boolean r1, Boolean r2, String r3) {
        this.isAmountSufficient = r1;
        this.isAssetSufficient = r2;
        this.reason = r3;
    }

    public /* synthetic */ MarginTradingCollateralSubmissionAssesmentDTO(Boolean r2, Boolean r3, String r4, int r5, i r6) {
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
