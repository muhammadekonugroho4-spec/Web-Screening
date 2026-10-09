package com.stockbit.dto.search;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/stockbit/dto/search/RecentNegoStockSearchDto;", "", "originalSymbol", "", "negoSymbol", "logo", AppMeasurementSdk.ConditionalUserProperty.NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOriginalSymbol", "()Ljava/lang/String;", "getNegoSymbol", "getLogo", "getName", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RecentNegoStockSearchDto {

    @SerializedName("logo")
    private final String logo;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @SerializedName("nego_symbol")
    private final String negoSymbol;

    @SerializedName("original_symbol")
    private final String originalSymbol;

    public RecentNegoStockSearchDto(String r2, String r3, String r4, String r5) {
        p.l(r2, "originalSymbol");
        p.l(r3, "negoSymbol");
        p.l(r4, "logo");
        p.l(r5, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.originalSymbol = r2;
        this.negoSymbol = r3;
        this.logo = r4;
        this.name = r5;
    }

    public final String a() {
        return this.logo;
    }

    public final String b() {
        return this.name;
    }

    public final String c() {
        return this.negoSymbol;
    }

    public final String d() {
        return this.originalSymbol;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof RecentNegoStockSearchDto) == true) goto L8;
        return false;
    L8:
        RecentNegoStockSearchDto r52 = (RecentNegoStockSearchDto) r5;
        if (p.g(this.originalSymbol, r52.originalSymbol) == true) goto L12;
        return false;
    L12:
        if (p.g(this.negoSymbol, r52.negoSymbol) == true) goto L15;
        return false;
    L15:
        if (p.g(this.logo, r52.logo) == true) goto L18;
        return false;
    L18:
        if (p.g(this.name, r52.name) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.originalSymbol.hashCode() * 31) + this.negoSymbol.hashCode()) * 31) + this.logo.hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "RecentNegoStockSearchDto(originalSymbol=" + this.originalSymbol + ", negoSymbol=" + this.negoSymbol + ", logo=" + this.logo + ", name=" + this.name + ")";
    }
}
