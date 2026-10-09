package com.stockbit.dto.movers;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014Jn\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\"J\u0014\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010&\u001a\u00020\bHÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0018\u0010\u0014¨\u0006("}, d2 = {"Lcom/stockbit/dto/movers/MoverKongloCatalogDetailDTO;", "", "code", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "iconUrl", "catalogId", "upCount", "", "downCount", "unchangedCount", "stockCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCode", "()Ljava/lang/String;", "getName", "getIconUrl", "getCatalogId", "getUpCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDownCount", "getUnchangedCount", "getStockCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/stockbit/dto/movers/MoverKongloCatalogDetailDTO;", "equals", "", "other", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MoverKongloCatalogDetailDTO {

    @SerializedName("catalog_id")
    private final String catalogId;

    @SerializedName("code")
    private final String code;

    @SerializedName("down_count")
    private final Integer downCount;

    @SerializedName("icon_url")
    private final String iconUrl;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @SerializedName("stock_count")
    private final Integer stockCount;

    @SerializedName("unchanged_count")
    private final Integer unchangedCount;

    @SerializedName("up_count")
    private final Integer upCount;

    public MoverKongloCatalogDetailDTO() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        Integer r5 = null;
        Integer r6 = null;
        Integer r7 = null;
        Integer r8 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, com.google.firebase.perf.util.Constants.MAX_HOST_LENGTH, null);
    }

    public final String a() {
        return this.catalogId;
    }

    public final String b() {
        return this.code;
    }

    public final Integer c() {
        return this.downCount;
    }

    public final String d() {
        return this.iconUrl;
    }

    public final String e() {
        return this.name;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MoverKongloCatalogDetailDTO) == true) goto L8;
        return false;
    L8:
        MoverKongloCatalogDetailDTO r52 = (MoverKongloCatalogDetailDTO) r5;
        if (p.g(this.code, r52.code) == true) goto L12;
        return false;
    L12:
        if (p.g(this.name, r52.name) == true) goto L15;
        return false;
    L15:
        if (p.g(this.iconUrl, r52.iconUrl) == true) goto L18;
        return false;
    L18:
        if (p.g(this.catalogId, r52.catalogId) == true) goto L21;
        return false;
    L21:
        if (p.g(this.upCount, r52.upCount) == true) goto L24;
        return false;
    L24:
        if (p.g(this.downCount, r52.downCount) == true) goto L27;
        return false;
    L27:
        if (p.g(this.unchangedCount, r52.unchangedCount) == true) goto L30;
        return false;
    L30:
        if (p.g(this.stockCount, r52.stockCount) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final Integer f() {
        return this.upCount;
    }

    public int hashCode() {
        String r02 = this.code;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.name;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.iconUrl;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.catalogId;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Integer r27 = this.upCount;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        Integer r29 = this.downCount;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        Integer r211 = this.unchangedCount;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        Integer r213 = this.stockCount;
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
        return "MoverKongloCatalogDetailDTO(code=" + this.code + ", name=" + this.name + ", iconUrl=" + this.iconUrl + ", catalogId=" + this.catalogId + ", upCount=" + this.upCount + ", downCount=" + this.downCount + ", unchangedCount=" + this.unchangedCount + ", stockCount=" + this.stockCount + ")";
    }

    public MoverKongloCatalogDetailDTO(String r1, String r2, String r3, String r4, Integer r5, Integer r6, Integer r7, Integer r8) {
        this.code = r1;
        this.name = r2;
        this.iconUrl = r3;
        this.catalogId = r4;
        this.upCount = r5;
        this.downCount = r6;
        this.unchangedCount = r7;
        this.stockCount = r8;
    }

    public /* synthetic */ MoverKongloCatalogDetailDTO(String r2, String r3, String r4, String r5, Integer r6, Integer r7, Integer r8, Integer r9, int r10, i r11) {
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
        Integer r102 = null;
    L26:
        Integer r92 = r8;
        Integer r82 = r7;
        Integer r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92, r102);
        return;
    L27:
        r102 = r9;
        goto L26
    }
}
