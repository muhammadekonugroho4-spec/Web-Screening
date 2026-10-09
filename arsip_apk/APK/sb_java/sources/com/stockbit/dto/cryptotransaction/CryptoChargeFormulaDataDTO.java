package com.stockbit.dto.cryptotransaction;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/stockbit/dto/cryptotransaction/CryptoChargeFormulaDataDTO;", "", "version", "", "schedules", "", "Lcom/stockbit/dto/cryptotransaction/CryptoChargeScheduleDTO;", "assetGroups", "", "Lcom/stockbit/dto/cryptotransaction/CryptoAssetGroupDTO;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "getVersion", "()Ljava/lang/String;", "getSchedules", "()Ljava/util/List;", "getAssetGroups", "()Ljava/util/Map;", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CryptoChargeFormulaDataDTO {

    @SerializedName("asset_groups")
    private final Map<String, CryptoAssetGroupDTO> assetGroups;

    @SerializedName("schedules")
    private final List<CryptoChargeScheduleDTO> schedules;

    @SerializedName("version")
    private final String version;

    public CryptoChargeFormulaDataDTO() {
        String r1 = null;
        List r2 = null;
        Map r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public final Map a() {
        return this.assetGroups;
    }

    public final List b() {
        return this.schedules;
    }

    public final String c() {
        return this.version;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CryptoChargeFormulaDataDTO) == true) goto L8;
        return false;
    L8:
        CryptoChargeFormulaDataDTO r52 = (CryptoChargeFormulaDataDTO) r5;
        if (p.g(this.version, r52.version) == true) goto L12;
        return false;
    L12:
        if (p.g(this.schedules, r52.schedules) == true) goto L15;
        return false;
    L15:
        if (p.g(this.assetGroups, r52.assetGroups) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.version;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        List<CryptoChargeScheduleDTO> r2 = this.schedules;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Map<String, CryptoAssetGroupDTO> r23 = this.assetGroups;
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
        return "CryptoChargeFormulaDataDTO(version=" + this.version + ", schedules=" + this.schedules + ", assetGroups=" + this.assetGroups + ")";
    }

    public CryptoChargeFormulaDataDTO(String r1, List<CryptoChargeScheduleDTO> r2, Map<String, CryptoAssetGroupDTO> r3) {
        this.version = r1;
        this.schedules = r2;
        this.assetGroups = r3;
    }

    public /* synthetic */ CryptoChargeFormulaDataDTO(String r2, List r3, Map r4, int r5, i r6) {
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
