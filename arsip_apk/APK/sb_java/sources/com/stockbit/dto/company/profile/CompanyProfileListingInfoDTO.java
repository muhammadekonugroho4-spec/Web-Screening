package com.stockbit.dto.company.profile;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001,Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003Ju\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010)\u001a\u00020*HÖ\u0081\u0004J\n\u0010+\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013¨\u0006-"}, d2 = {"Lcom/stockbit/dto/company/profile/CompanyProfileListingInfoDTO;", "", "exerciseEndDate", "", "exercisePrice", "Ljava/math/BigDecimal;", "exerciseStartDate", "expireDate", "foreignPercentage", "Lcom/stockbit/dto/company/profile/CompanyProfileListingInfoDTO$PercentageDTO;", "listingDate", "localPercentage", "numberOfSecurities", "totalShares", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/dto/company/profile/CompanyProfileListingInfoDTO$PercentageDTO;Ljava/lang/String;Lcom/stockbit/dto/company/profile/CompanyProfileListingInfoDTO$PercentageDTO;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getExerciseEndDate", "()Ljava/lang/String;", "getExercisePrice", "()Ljava/math/BigDecimal;", "getExerciseStartDate", "getExpireDate", "getForeignPercentage", "()Lcom/stockbit/dto/company/profile/CompanyProfileListingInfoDTO$PercentageDTO;", "getListingDate", "getLocalPercentage", "getNumberOfSecurities", "getTotalShares", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "PercentageDTO", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CompanyProfileListingInfoDTO {

    @SerializedName("exercise_end_date")
    private final String exerciseEndDate;

    @SerializedName("exercise_price")
    private final BigDecimal exercisePrice;

    @SerializedName("exercise_start_date")
    private final String exerciseStartDate;

    @SerializedName("expire_date")
    private final String expireDate;

    @SerializedName("foreign_percentage")
    private final PercentageDTO foreignPercentage;

    @SerializedName("listing_date")
    private final String listingDate;

    @SerializedName("local_percentage")
    private final PercentageDTO localPercentage;

    @SerializedName("number_of_securities")
    private final BigDecimal numberOfSecurities;

    @SerializedName("total_shares")
    private final BigDecimal totalShares;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/stockbit/dto/company/profile/CompanyProfileListingInfoDTO$PercentageDTO;", "", "formatted", "", "raw", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;)V", "getFormatted", "()Ljava/lang/String;", "getRaw", "()Ljava/math/BigDecimal;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PercentageDTO {

        @SerializedName("formatted")
        private final String formatted;

        @SerializedName("raw")
        private final BigDecimal raw;

        public PercentageDTO(String r1, BigDecimal r2) {
            this.formatted = r1;
            this.raw = r2;
        }

        public final String a() {
            return this.formatted;
        }

        public final BigDecimal b() {
            return this.raw;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof PercentageDTO) == true) goto L8;
            return false;
        L8:
            PercentageDTO r52 = (PercentageDTO) r5;
            if (p.g(this.formatted, r52.formatted) == true) goto L12;
            return false;
        L12:
            if (p.g(this.raw, r52.raw) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            String r02 = this.formatted;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            BigDecimal r2 = this.raw;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "PercentageDTO(formatted=" + this.formatted + ", raw=" + this.raw + ")";
        }
    }

    public CompanyProfileListingInfoDTO(String r1, BigDecimal r2, String r3, String r4, PercentageDTO r5, String r6, PercentageDTO r7, BigDecimal r8, BigDecimal r9) {
        this.exerciseEndDate = r1;
        this.exercisePrice = r2;
        this.exerciseStartDate = r3;
        this.expireDate = r4;
        this.foreignPercentage = r5;
        this.listingDate = r6;
        this.localPercentage = r7;
        this.numberOfSecurities = r8;
        this.totalShares = r9;
    }

    public final String a() {
        return this.exerciseEndDate;
    }

    public final BigDecimal b() {
        return this.exercisePrice;
    }

    public final PercentageDTO c() {
        return this.foreignPercentage;
    }

    public final String d() {
        return this.listingDate;
    }

    public final PercentageDTO e() {
        return this.localPercentage;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CompanyProfileListingInfoDTO) == true) goto L8;
        return false;
    L8:
        CompanyProfileListingInfoDTO r52 = (CompanyProfileListingInfoDTO) r5;
        if (p.g(this.exerciseEndDate, r52.exerciseEndDate) == true) goto L12;
        return false;
    L12:
        if (p.g(this.exercisePrice, r52.exercisePrice) == true) goto L15;
        return false;
    L15:
        if (p.g(this.exerciseStartDate, r52.exerciseStartDate) == true) goto L18;
        return false;
    L18:
        if (p.g(this.expireDate, r52.expireDate) == true) goto L21;
        return false;
    L21:
        if (p.g(this.foreignPercentage, r52.foreignPercentage) == true) goto L24;
        return false;
    L24:
        if (p.g(this.listingDate, r52.listingDate) == true) goto L27;
        return false;
    L27:
        if (p.g(this.localPercentage, r52.localPercentage) == true) goto L30;
        return false;
    L30:
        if (p.g(this.numberOfSecurities, r52.numberOfSecurities) == true) goto L33;
        return false;
    L33:
        if (p.g(this.totalShares, r52.totalShares) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final BigDecimal f() {
        return this.numberOfSecurities;
    }

    public final BigDecimal g() {
        return this.totalShares;
    }

    public int hashCode() {
        String r02 = this.exerciseEndDate;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        BigDecimal r2 = this.exercisePrice;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.exerciseStartDate;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.expireDate;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        PercentageDTO r27 = this.foreignPercentage;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.listingDate;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        PercentageDTO r211 = this.localPercentage;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        BigDecimal r213 = this.numberOfSecurities;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        BigDecimal r215 = this.totalShares;
        if (r215 == null) goto L39;
        r1 = r215.hashCode();
    L39:
        return r011 + r1;
    L33:
        r214 = r213.hashCode();
        goto L34
    L29:
        r212 = r211.hashCode();
        goto L30
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
        return "CompanyProfileListingInfoDTO(exerciseEndDate=" + this.exerciseEndDate + ", exercisePrice=" + this.exercisePrice + ", exerciseStartDate=" + this.exerciseStartDate + ", expireDate=" + this.expireDate + ", foreignPercentage=" + this.foreignPercentage + ", listingDate=" + this.listingDate + ", localPercentage=" + this.localPercentage + ", numberOfSecurities=" + this.numberOfSecurities + ", totalShares=" + this.totalShares + ")";
    }
}
