package com.stockbit.stockgroups.model;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlinx.serialization.l;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003Jw\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rHÆ\u0001J\u0014\u0010)\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010+\u001a\u00020,HÖ\u0081\u0004J\n\u0010-\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001c¨\u0006."}, d2 = {"Lcom/stockbit/stockgroups/model/StockItemByGroupUIState;", "", "stockGroupCode", "", "stockCode", "iconUrl", "stockFullName", "priceDetail", "Lcom/stockbit/stockgroups/model/StockItemPriceDetail;", "value", "volume", "freq", "isShowNotation", "", "isShowCorporateAction", "isShowUma", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/stockgroups/model/StockItemPriceDetail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "getStockGroupCode", "()Ljava/lang/String;", "getStockCode", "getIconUrl", "getStockFullName", "getPriceDetail", "()Lcom/stockbit/stockgroups/model/StockItemPriceDetail;", "getValue", "getVolume", "getFreq", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "stock-groups_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@l
/* loaded from: classes11.dex */
public final class f {
    public static final int $stable = 0;
    private final String freq;
    private final String iconUrl;
    private final boolean isShowCorporateAction;
    private final boolean isShowNotation;
    private final boolean isShowUma;
    private final g priceDetail;
    private final String stockCode;
    private final String stockFullName;
    private final String stockGroupCode;
    private final String value;
    private final String volume;

    static {
    }

    public f(String r2, String r3, String r4, String r5, g r6, String r7, String r8, String r9, boolean r10, boolean r11, boolean r12) {
        p.l(r2, "stockGroupCode");
        p.l(r3, "stockCode");
        p.l(r4, "iconUrl");
        p.l(r5, "stockFullName");
        p.l(r6, "priceDetail");
        p.l(r7, "value");
        p.l(r8, "volume");
        p.l(r9, "freq");
        this.stockGroupCode = r2;
        this.stockCode = r3;
        this.iconUrl = r4;
        this.stockFullName = r5;
        this.priceDetail = r6;
        this.value = r7;
        this.volume = r8;
        this.freq = r9;
        this.isShowNotation = r10;
        this.isShowCorporateAction = r11;
        this.isShowUma = r12;
    }

    public final String a() {
        return this.freq;
    }

    public final String b() {
        return this.iconUrl;
    }

    public final g c() {
        return this.priceDetail;
    }

    public final String d() {
        return this.stockCode;
    }

    public final String e() {
        return this.stockFullName;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.stockGroupCode, r52.stockGroupCode) == true) goto L12;
        return false;
    L12:
        if (p.g(this.stockCode, r52.stockCode) == true) goto L15;
        return false;
    L15:
        if (p.g(this.iconUrl, r52.iconUrl) == true) goto L18;
        return false;
    L18:
        if (p.g(this.stockFullName, r52.stockFullName) == true) goto L21;
        return false;
    L21:
        if (p.g(this.priceDetail, r52.priceDetail) == true) goto L24;
        return false;
    L24:
        if (p.g(this.value, r52.value) == true) goto L27;
        return false;
    L27:
        if (p.g(this.volume, r52.volume) == true) goto L30;
        return false;
    L30:
        if (p.g(this.freq, r52.freq) == true) goto L33;
        return false;
    L33:
        if (this.isShowNotation == r52.isShowNotation) goto L36;
        return false;
    L36:
        if (this.isShowCorporateAction == r52.isShowCorporateAction) goto L39;
        return false;
    L39:
        if (this.isShowUma == r52.isShowUma) goto L41;
        return false;
    L41:
        return true;
    }

    public final String f() {
        return this.value;
    }

    public final String g() {
        return this.volume;
    }

    public final boolean h() {
        return this.isShowCorporateAction;
    }

    public int hashCode() {
        return (((((((((((((((((((this.stockGroupCode.hashCode() * 31) + this.stockCode.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.stockFullName.hashCode()) * 31) + this.priceDetail.hashCode()) * 31) + this.value.hashCode()) * 31) + this.volume.hashCode()) * 31) + this.freq.hashCode()) * 31) + Boolean.hashCode(this.isShowNotation)) * 31) + Boolean.hashCode(this.isShowCorporateAction)) * 31) + Boolean.hashCode(this.isShowUma);
    }

    public final boolean i() {
        return this.isShowNotation;
    }

    public final boolean j() {
        return this.isShowUma;
    }

    public String toString() {
        return "StockItemByGroupUIState(stockGroupCode=" + this.stockGroupCode + ", stockCode=" + this.stockCode + ", iconUrl=" + this.iconUrl + ", stockFullName=" + this.stockFullName + ", priceDetail=" + this.priceDetail + ", value=" + this.value + ", volume=" + this.volume + ", freq=" + this.freq + ", isShowNotation=" + this.isShowNotation + ", isShowCorporateAction=" + this.isShowCorporateAction + ", isShowUma=" + this.isShowUma + ')';
    }
}
