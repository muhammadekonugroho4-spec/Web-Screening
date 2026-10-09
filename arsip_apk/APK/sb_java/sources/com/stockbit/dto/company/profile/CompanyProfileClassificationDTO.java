package com.stockbit.dto.company.profile;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import com.stockbit.search.SearchEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/stockbit/dto/company/profile/CompanyProfileClassificationDTO;", "", SearchEntryPoint.KEY_SECTOR, "Lcom/stockbit/dto/company/profile/CompanyProfileClassificationNodeDTO;", "subSector", "industry", "subIndustry", "<init>", "(Lcom/stockbit/dto/company/profile/CompanyProfileClassificationNodeDTO;Lcom/stockbit/dto/company/profile/CompanyProfileClassificationNodeDTO;Lcom/stockbit/dto/company/profile/CompanyProfileClassificationNodeDTO;Lcom/stockbit/dto/company/profile/CompanyProfileClassificationNodeDTO;)V", "getSector", "()Lcom/stockbit/dto/company/profile/CompanyProfileClassificationNodeDTO;", "getSubSector", "getIndustry", "getSubIndustry", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CompanyProfileClassificationDTO {

    @SerializedName("industry")
    private final CompanyProfileClassificationNodeDTO industry;

    @SerializedName(SearchEntryPoint.KEY_SECTOR)
    private final CompanyProfileClassificationNodeDTO sector;

    @SerializedName("sub_industry")
    private final CompanyProfileClassificationNodeDTO subIndustry;

    @SerializedName("sub_sector")
    private final CompanyProfileClassificationNodeDTO subSector;

    public CompanyProfileClassificationDTO(CompanyProfileClassificationNodeDTO r1, CompanyProfileClassificationNodeDTO r2, CompanyProfileClassificationNodeDTO r3, CompanyProfileClassificationNodeDTO r4) {
        this.sector = r1;
        this.subSector = r2;
        this.industry = r3;
        this.subIndustry = r4;
    }

    public final CompanyProfileClassificationNodeDTO a() {
        return this.industry;
    }

    public final CompanyProfileClassificationNodeDTO b() {
        return this.sector;
    }

    public final CompanyProfileClassificationNodeDTO c() {
        return this.subIndustry;
    }

    public final CompanyProfileClassificationNodeDTO d() {
        return this.subSector;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CompanyProfileClassificationDTO) == true) goto L8;
        return false;
    L8:
        CompanyProfileClassificationDTO r52 = (CompanyProfileClassificationDTO) r5;
        if (p.g(this.sector, r52.sector) == true) goto L12;
        return false;
    L12:
        if (p.g(this.subSector, r52.subSector) == true) goto L15;
        return false;
    L15:
        if (p.g(this.industry, r52.industry) == true) goto L18;
        return false;
    L18:
        if (p.g(this.subIndustry, r52.subIndustry) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        CompanyProfileClassificationNodeDTO r02 = this.sector;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        CompanyProfileClassificationNodeDTO r2 = this.subSector;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        CompanyProfileClassificationNodeDTO r23 = this.industry;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        CompanyProfileClassificationNodeDTO r25 = this.subIndustry;
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
        return "CompanyProfileClassificationDTO(sector=" + this.sector + ", subSector=" + this.subSector + ", industry=" + this.industry + ", subIndustry=" + this.subIndustry + ")";
    }
}
