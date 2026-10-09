package com.stockbit.dto.company.profile;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0006HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/company/profile/CompanyProfileShareHolderOnePercentDTO;", "", "shareholders", "", "Lcom/stockbit/dto/company/profile/CompanyProfileShareHolderDTO;", "shareholderLastUpdated", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getShareholders", "()Ljava/util/List;", "getShareholderLastUpdated", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CompanyProfileShareHolderOnePercentDTO {

    @SerializedName("last_updated")
    private final String shareholderLastUpdated;

    @SerializedName("shareholder")
    private final List<CompanyProfileShareHolderDTO> shareholders;

    public CompanyProfileShareHolderOnePercentDTO(List<CompanyProfileShareHolderDTO> r1, String r2) {
        this.shareholders = r1;
        this.shareholderLastUpdated = r2;
    }

    public final String a() {
        return this.shareholderLastUpdated;
    }

    public final List b() {
        return this.shareholders;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CompanyProfileShareHolderOnePercentDTO) == true) goto L8;
        return false;
    L8:
        CompanyProfileShareHolderOnePercentDTO r52 = (CompanyProfileShareHolderOnePercentDTO) r5;
        if (p.g(this.shareholders, r52.shareholders) == true) goto L12;
        return false;
    L12:
        if (p.g(this.shareholderLastUpdated, r52.shareholderLastUpdated) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        List<CompanyProfileShareHolderDTO> r02 = this.shareholders;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.shareholderLastUpdated;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "CompanyProfileShareHolderOnePercentDTO(shareholders=" + this.shareholders + ", shareholderLastUpdated=" + this.shareholderLastUpdated + ")";
    }
}
