package com.stockbit.dto.company.profile;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J«\u0001\u0010\"\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010&\u001a\u00020'HÖ\u0081\u0004J\n\u0010(\u001a\u00020)HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006*"}, d2 = {"Lcom/stockbit/dto/company/profile/CompanyProfileExecutiveDTO;", "", "presidentDirectors", "", "Lcom/stockbit/dto/company/profile/CompanyProfilePersonDTO;", "vicePresidents", "directors", "presidentCommissioners", "vicePresidentCommissioners", "independentPresidentCommissioners", "independentVicePresidentCommissioners", "commissioners", "independentCommissioners", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getPresidentDirectors", "()Ljava/util/List;", "getVicePresidents", "getDirectors", "getPresidentCommissioners", "getVicePresidentCommissioners", "getIndependentPresidentCommissioners", "getIndependentVicePresidentCommissioners", "getCommissioners", "getIndependentCommissioners", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CompanyProfileExecutiveDTO {

    @SerializedName("commissioner")
    private final List<CompanyProfilePersonDTO> commissioners;

    @SerializedName("director")
    private final List<CompanyProfilePersonDTO> directors;

    @SerializedName("independent_commissioner")
    private final List<CompanyProfilePersonDTO> independentCommissioners;

    @SerializedName("independent_president_commissioner")
    private final List<CompanyProfilePersonDTO> independentPresidentCommissioners;

    @SerializedName("independent_vice_president_commissioner")
    private final List<CompanyProfilePersonDTO> independentVicePresidentCommissioners;

    @SerializedName("president_commissioner")
    private final List<CompanyProfilePersonDTO> presidentCommissioners;

    @SerializedName("president_director")
    private final List<CompanyProfilePersonDTO> presidentDirectors;

    @SerializedName("vice_president_commissioner")
    private final List<CompanyProfilePersonDTO> vicePresidentCommissioners;

    @SerializedName("vice_president")
    private final List<CompanyProfilePersonDTO> vicePresidents;

    public CompanyProfileExecutiveDTO(List<CompanyProfilePersonDTO> r1, List<CompanyProfilePersonDTO> r2, List<CompanyProfilePersonDTO> r3, List<CompanyProfilePersonDTO> r4, List<CompanyProfilePersonDTO> r5, List<CompanyProfilePersonDTO> r6, List<CompanyProfilePersonDTO> r7, List<CompanyProfilePersonDTO> r8, List<CompanyProfilePersonDTO> r9) {
        this.presidentDirectors = r1;
        this.vicePresidents = r2;
        this.directors = r3;
        this.presidentCommissioners = r4;
        this.vicePresidentCommissioners = r5;
        this.independentPresidentCommissioners = r6;
        this.independentVicePresidentCommissioners = r7;
        this.commissioners = r8;
        this.independentCommissioners = r9;
    }

    public final List a() {
        return this.commissioners;
    }

    public final List b() {
        return this.directors;
    }

    public final List c() {
        return this.independentCommissioners;
    }

    public final List d() {
        return this.independentPresidentCommissioners;
    }

    public final List e() {
        return this.independentVicePresidentCommissioners;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CompanyProfileExecutiveDTO) == true) goto L8;
        return false;
    L8:
        CompanyProfileExecutiveDTO r52 = (CompanyProfileExecutiveDTO) r5;
        if (p.g(this.presidentDirectors, r52.presidentDirectors) == true) goto L12;
        return false;
    L12:
        if (p.g(this.vicePresidents, r52.vicePresidents) == true) goto L15;
        return false;
    L15:
        if (p.g(this.directors, r52.directors) == true) goto L18;
        return false;
    L18:
        if (p.g(this.presidentCommissioners, r52.presidentCommissioners) == true) goto L21;
        return false;
    L21:
        if (p.g(this.vicePresidentCommissioners, r52.vicePresidentCommissioners) == true) goto L24;
        return false;
    L24:
        if (p.g(this.independentPresidentCommissioners, r52.independentPresidentCommissioners) == true) goto L27;
        return false;
    L27:
        if (p.g(this.independentVicePresidentCommissioners, r52.independentVicePresidentCommissioners) == true) goto L30;
        return false;
    L30:
        if (p.g(this.commissioners, r52.commissioners) == true) goto L33;
        return false;
    L33:
        if (p.g(this.independentCommissioners, r52.independentCommissioners) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final List f() {
        return this.presidentCommissioners;
    }

    public final List g() {
        return this.presidentDirectors;
    }

    public final List h() {
        return this.vicePresidentCommissioners;
    }

    public int hashCode() {
        List<CompanyProfilePersonDTO> r02 = this.presidentDirectors;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        List<CompanyProfilePersonDTO> r2 = this.vicePresidents;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        List<CompanyProfilePersonDTO> r23 = this.directors;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        List<CompanyProfilePersonDTO> r25 = this.presidentCommissioners;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        List<CompanyProfilePersonDTO> r27 = this.vicePresidentCommissioners;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        List<CompanyProfilePersonDTO> r29 = this.independentPresidentCommissioners;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        List<CompanyProfilePersonDTO> r211 = this.independentVicePresidentCommissioners;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        List<CompanyProfilePersonDTO> r213 = this.commissioners;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        List<CompanyProfilePersonDTO> r215 = this.independentCommissioners;
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

    public final List i() {
        return this.vicePresidents;
    }

    public String toString() {
        return "CompanyProfileExecutiveDTO(presidentDirectors=" + this.presidentDirectors + ", vicePresidents=" + this.vicePresidents + ", directors=" + this.directors + ", presidentCommissioners=" + this.presidentCommissioners + ", vicePresidentCommissioners=" + this.vicePresidentCommissioners + ", independentPresidentCommissioners=" + this.independentPresidentCommissioners + ", independentVicePresidentCommissioners=" + this.independentVicePresidentCommissioners + ", commissioners=" + this.commissioners + ", independentCommissioners=" + this.independentCommissioners + ")";
    }
}
