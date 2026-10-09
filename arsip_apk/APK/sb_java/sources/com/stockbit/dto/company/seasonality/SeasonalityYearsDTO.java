package com.stockbit.dto.company.seasonality;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import com.stockbit.company.CompanyEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ&\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/stockbit/dto/company/seasonality/SeasonalityYearsDTO;", "", CompanyEntryPoint.EXTRA_DESC, "", "value", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/Integer;", "setValue", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/stockbit/dto/company/seasonality/SeasonalityYearsDTO;", "equals", "", "other", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SeasonalityYearsDTO {

    @SerializedName(CompanyEntryPoint.EXTRA_DESC)
    private String desc;

    @SerializedName("value")
    private Integer value;

    public SeasonalityYearsDTO(String r1, Integer r2) {
        this.desc = r1;
        this.value = r2;
    }

    public final String a() {
        return this.desc;
    }

    public final Integer b() {
        return this.value;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SeasonalityYearsDTO) == true) goto L8;
        return false;
    L8:
        SeasonalityYearsDTO r52 = (SeasonalityYearsDTO) r5;
        if (p.g(this.desc, r52.desc) == true) goto L12;
        return false;
    L12:
        if (p.g(this.value, r52.value) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.desc;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.value;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "SeasonalityYearsDTO(desc=" + this.desc + ", value=" + this.value + ")";
    }
}
