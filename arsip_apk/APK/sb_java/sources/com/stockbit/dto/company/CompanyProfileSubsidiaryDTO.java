package com.stockbit.dto.company;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0006HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/stockbit/dto/company/CompanyProfileSubsidiaryDTO;", "", "subsidiaries", "", "Lcom/stockbit/dto/company/CompanySubsidiaryDTO;", FirebaseAnalytics.Param.CURRENCY, "", "lastUpdatedPeriod", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getSubsidiaries", "()Ljava/util/List;", "getCurrency", "()Ljava/lang/String;", "getLastUpdatedPeriod", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CompanyProfileSubsidiaryDTO {

    @SerializedName(FirebaseAnalytics.Param.CURRENCY)
    private final String currency;

    @SerializedName("last_updated_period")
    private final String lastUpdatedPeriod;

    @SerializedName("subsidiaries")
    private final List<CompanySubsidiaryDTO> subsidiaries;

    public CompanyProfileSubsidiaryDTO(List<CompanySubsidiaryDTO> r1, String r2, String r3) {
        this.subsidiaries = r1;
        this.currency = r2;
        this.lastUpdatedPeriod = r3;
    }

    public final String a() {
        return this.currency;
    }

    public final String b() {
        return this.lastUpdatedPeriod;
    }

    public final List c() {
        return this.subsidiaries;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CompanyProfileSubsidiaryDTO) == true) goto L8;
        return false;
    L8:
        CompanyProfileSubsidiaryDTO r52 = (CompanyProfileSubsidiaryDTO) r5;
        if (p.g(this.subsidiaries, r52.subsidiaries) == true) goto L12;
        return false;
    L12:
        if (p.g(this.currency, r52.currency) == true) goto L15;
        return false;
    L15:
        if (p.g(this.lastUpdatedPeriod, r52.lastUpdatedPeriod) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        List<CompanySubsidiaryDTO> r02 = this.subsidiaries;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.currency;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.lastUpdatedPeriod;
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
        return "CompanyProfileSubsidiaryDTO(subsidiaries=" + this.subsidiaries + ", currency=" + this.currency + ", lastUpdatedPeriod=" + this.lastUpdatedPeriod + ")";
    }
}
