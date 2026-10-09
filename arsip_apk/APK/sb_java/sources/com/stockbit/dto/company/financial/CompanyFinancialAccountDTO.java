package com.stockbit.dto.company.financial;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0019Jz\u0010$\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010%J\u0014\u0010&\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010(\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010)\u001a\u00020\bHÖ\u0081\u0004R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\n\u0010\u0019R\u001a\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001b\u0010\u0013R\u001a\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\r\u0010\u0019¨\u0006*"}, d2 = {"Lcom/stockbit/dto/company/financial/CompanyFinancialAccountDTO;", "", "accounts", "", Constants.KEY_ID, "", FirebaseAnalytics.Param.LEVEL, AppMeasurementSdk.ConditionalUserProperty.NAME, "", "values", "isTotalExist", "", "maxShowLevel", "isDefaultExpanded", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getAccounts", "()Ljava/util/List;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLevel", "getName", "()Ljava/lang/String;", "getValues", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMaxShowLevel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", Constants.COPY_TYPE, "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/stockbit/dto/company/financial/CompanyFinancialAccountDTO;", "equals", "other", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CompanyFinancialAccountDTO {

    @SerializedName("accounts")
    private final List<CompanyFinancialAccountDTO> accounts;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private final Integer f88625id;

    @SerializedName("is_default_expanded")
    private final Boolean isDefaultExpanded;

    @SerializedName("is_total_exist")
    private final Boolean isTotalExist;

    @SerializedName(FirebaseAnalytics.Param.LEVEL)
    private final Integer level;

    @SerializedName("max_show_level")
    private final Integer maxShowLevel;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @SerializedName("values")
    private final List<String> values;

    public CompanyFinancialAccountDTO() {
        List r1 = null;
        Integer r2 = null;
        Integer r3 = null;
        String r4 = null;
        List r5 = null;
        Boolean r6 = null;
        Integer r7 = null;
        Boolean r8 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, com.google.firebase.perf.util.Constants.MAX_HOST_LENGTH, null);
    }

    public final List a() {
        return this.accounts;
    }

    public final Integer b() {
        return this.f88625id;
    }

    public final Integer c() {
        return this.level;
    }

    public final Integer d() {
        return this.maxShowLevel;
    }

    public final String e() {
        return this.name;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CompanyFinancialAccountDTO) == true) goto L8;
        return false;
    L8:
        CompanyFinancialAccountDTO r52 = (CompanyFinancialAccountDTO) r5;
        if (p.g(this.accounts, r52.accounts) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f88625id, r52.f88625id) == true) goto L15;
        return false;
    L15:
        if (p.g(this.level, r52.level) == true) goto L18;
        return false;
    L18:
        if (p.g(this.name, r52.name) == true) goto L21;
        return false;
    L21:
        if (p.g(this.values, r52.values) == true) goto L24;
        return false;
    L24:
        if (p.g(this.isTotalExist, r52.isTotalExist) == true) goto L27;
        return false;
    L27:
        if (p.g(this.maxShowLevel, r52.maxShowLevel) == true) goto L30;
        return false;
    L30:
        if (p.g(this.isDefaultExpanded, r52.isDefaultExpanded) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final List f() {
        return this.values;
    }

    public final Boolean g() {
        return this.isDefaultExpanded;
    }

    public final Boolean h() {
        return this.isTotalExist;
    }

    public int hashCode() {
        List<CompanyFinancialAccountDTO> r02 = this.accounts;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.f88625id;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Integer r23 = this.level;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.name;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        List<String> r27 = this.values;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        Boolean r29 = this.isTotalExist;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        Integer r211 = this.maxShowLevel;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        Boolean r213 = this.isDefaultExpanded;
        if (r213 == null) goto L35;
        r1 = r213.hashCode();
    L35:
        return r010 + r1;
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
        return "CompanyFinancialAccountDTO(accounts=" + this.accounts + ", id=" + this.f88625id + ", level=" + this.level + ", name=" + this.name + ", values=" + this.values + ", isTotalExist=" + this.isTotalExist + ", maxShowLevel=" + this.maxShowLevel + ", isDefaultExpanded=" + this.isDefaultExpanded + ")";
    }

    public CompanyFinancialAccountDTO(List<CompanyFinancialAccountDTO> r1, Integer r2, Integer r3, String r4, List<String> r5, Boolean r6, Integer r7, Boolean r8) {
        this.accounts = r1;
        this.f88625id = r2;
        this.level = r3;
        this.name = r4;
        this.values = r5;
        this.isTotalExist = r6;
        this.maxShowLevel = r7;
        this.isDefaultExpanded = r8;
    }

    public /* synthetic */ CompanyFinancialAccountDTO(List r2, Integer r3, Integer r4, String r5, List r6, Boolean r7, Integer r8, Boolean r9, int r10, i r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = null;
    L24:
        if ((r10 & 128) == 0) goto L27;
        Boolean r102 = null;
    L26:
        Integer r92 = r8;
        Boolean r82 = r7;
        List r72 = r6;
        String r62 = r5;
        Integer r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92, r102);
        return;
    L27:
        r102 = r9;
        goto L26
    }
}
