package com.stockbit.dto.company.analyst;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jb\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010!J\u0014\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006'"}, d2 = {"Lcom/stockbit/dto/company/analyst/AnalystRatingDTO;", "", NotificationCompat.CATEGORY_RECOMMENDATION, "", "priceTarget", "Lcom/stockbit/dto/company/analyst/AnalystPriceTargetDTO;", "totalBuy", "", "totalSell", "totalHold", "totalAnalystRating", "lastUpdated", "<init>", "(Ljava/lang/String;Lcom/stockbit/dto/company/analyst/AnalystPriceTargetDTO;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getRecommendation", "()Ljava/lang/String;", "getPriceTarget", "()Lcom/stockbit/dto/company/analyst/AnalystPriceTargetDTO;", "getTotalBuy", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalSell", "getTotalHold", "getTotalAnalystRating", "getLastUpdated", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "(Ljava/lang/String;Lcom/stockbit/dto/company/analyst/AnalystPriceTargetDTO;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stockbit/dto/company/analyst/AnalystRatingDTO;", "equals", "", "other", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AnalystRatingDTO {

    @SerializedName("last_updated")
    private final String lastUpdated;

    @SerializedName("price_target")
    private final AnalystPriceTargetDTO priceTarget;

    @SerializedName(NotificationCompat.CATEGORY_RECOMMENDATION)
    private final String recommendation;

    @SerializedName("total_analyst")
    private final Integer totalAnalystRating;

    @SerializedName("total_buy")
    private final Integer totalBuy;

    @SerializedName("total_hold")
    private final Integer totalHold;

    @SerializedName("total_sell")
    private final Integer totalSell;

    public AnalystRatingDTO(String r1, AnalystPriceTargetDTO r2, Integer r3, Integer r4, Integer r5, Integer r6, String r7) {
        this.recommendation = r1;
        this.priceTarget = r2;
        this.totalBuy = r3;
        this.totalSell = r4;
        this.totalHold = r5;
        this.totalAnalystRating = r6;
        this.lastUpdated = r7;
    }

    public final String a() {
        return this.lastUpdated;
    }

    public final AnalystPriceTargetDTO b() {
        return this.priceTarget;
    }

    public final String c() {
        return this.recommendation;
    }

    public final Integer d() {
        return this.totalAnalystRating;
    }

    public final Integer e() {
        return this.totalBuy;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AnalystRatingDTO) == true) goto L8;
        return false;
    L8:
        AnalystRatingDTO r52 = (AnalystRatingDTO) r5;
        if (p.g(this.recommendation, r52.recommendation) == true) goto L12;
        return false;
    L12:
        if (p.g(this.priceTarget, r52.priceTarget) == true) goto L15;
        return false;
    L15:
        if (p.g(this.totalBuy, r52.totalBuy) == true) goto L18;
        return false;
    L18:
        if (p.g(this.totalSell, r52.totalSell) == true) goto L21;
        return false;
    L21:
        if (p.g(this.totalHold, r52.totalHold) == true) goto L24;
        return false;
    L24:
        if (p.g(this.totalAnalystRating, r52.totalAnalystRating) == true) goto L27;
        return false;
    L27:
        if (p.g(this.lastUpdated, r52.lastUpdated) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final Integer f() {
        return this.totalHold;
    }

    public final Integer g() {
        return this.totalSell;
    }

    public int hashCode() {
        String r02 = this.recommendation;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        AnalystPriceTargetDTO r2 = this.priceTarget;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Integer r23 = this.totalBuy;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Integer r25 = this.totalSell;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Integer r27 = this.totalHold;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        Integer r29 = this.totalAnalystRating;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.lastUpdated;
        if (r211 == null) goto L31;
        r1 = r211.hashCode();
    L31:
        return r09 + r1;
    L25:
        r210 = r29.hashCode();
        goto L26
    L21:
        r28 = r27.hashCode();
        goto L22
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
        return "AnalystRatingDTO(recommendation=" + this.recommendation + ", priceTarget=" + this.priceTarget + ", totalBuy=" + this.totalBuy + ", totalSell=" + this.totalSell + ", totalHold=" + this.totalHold + ", totalAnalystRating=" + this.totalAnalystRating + ", lastUpdated=" + this.lastUpdated + ")";
    }
}
