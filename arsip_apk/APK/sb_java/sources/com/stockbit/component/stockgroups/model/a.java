package com.stockbit.component.stockgroups.model;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.l;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003Jc\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0014\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010'\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010(\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006)"}, d2 = {"Lcom/stockbit/component/stockgroups/model/StockGroupSectionItemUIState;", "", "code", "", "imageUrl", "groupName", "totalGainerStocks", "", "totalLoserStocks", "value", "catalogId", "volume", "freq", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getImageUrl", "getGroupName", "getTotalGainerStocks", "()I", "getTotalLoserStocks", "getValue", "getCatalogId", "getVolume", "getFreq", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "stock-groups_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@l
/* loaded from: classes8.dex */
public final class a {
    public static final int $stable = 0;
    private final String catalogId;
    private final String code;
    private final String freq;
    private final String groupName;
    private final String imageUrl;
    private final int totalGainerStocks;
    private final int totalLoserStocks;
    private final String value;
    private final String volume;

    static {
    }

    public a(String r2, String r3, String r4, int r5, int r6, String r7, String r8, String r9, String r10) {
        p.l(r2, "code");
        p.l(r3, "imageUrl");
        p.l(r4, "groupName");
        p.l(r7, "value");
        p.l(r8, "catalogId");
        p.l(r9, "volume");
        p.l(r10, "freq");
        this.code = r2;
        this.imageUrl = r3;
        this.groupName = r4;
        this.totalGainerStocks = r5;
        this.totalLoserStocks = r6;
        this.value = r7;
        this.catalogId = r8;
        this.volume = r9;
        this.freq = r10;
    }

    public final String a() {
        return this.catalogId;
    }

    public final String b() {
        return this.code;
    }

    public final String c() {
        return this.freq;
    }

    public final String d() {
        return this.groupName;
    }

    public final String e() {
        return this.imageUrl;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.code, r52.code) == true) goto L12;
        return false;
    L12:
        if (p.g(this.imageUrl, r52.imageUrl) == true) goto L15;
        return false;
    L15:
        if (p.g(this.groupName, r52.groupName) == true) goto L18;
        return false;
    L18:
        if (this.totalGainerStocks == r52.totalGainerStocks) goto L21;
        return false;
    L21:
        if (this.totalLoserStocks == r52.totalLoserStocks) goto L24;
        return false;
    L24:
        if (p.g(this.value, r52.value) == true) goto L27;
        return false;
    L27:
        if (p.g(this.catalogId, r52.catalogId) == true) goto L30;
        return false;
    L30:
        if (p.g(this.volume, r52.volume) == true) goto L33;
        return false;
    L33:
        if (p.g(this.freq, r52.freq) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final int f() {
        return this.totalGainerStocks;
    }

    public final int g() {
        return this.totalLoserStocks;
    }

    public final String h() {
        return this.value;
    }

    public int hashCode() {
        return (((((((((((((((this.code.hashCode() * 31) + this.imageUrl.hashCode()) * 31) + this.groupName.hashCode()) * 31) + Integer.hashCode(this.totalGainerStocks)) * 31) + Integer.hashCode(this.totalLoserStocks)) * 31) + this.value.hashCode()) * 31) + this.catalogId.hashCode()) * 31) + this.volume.hashCode()) * 31) + this.freq.hashCode();
    }

    public final String i() {
        return this.volume;
    }

    public String toString() {
        return "StockGroupSectionItemUIState(code=" + this.code + ", imageUrl=" + this.imageUrl + ", groupName=" + this.groupName + ", totalGainerStocks=" + this.totalGainerStocks + ", totalLoserStocks=" + this.totalLoserStocks + ", value=" + this.value + ", catalogId=" + this.catalogId + ", volume=" + this.volume + ", freq=" + this.freq + ')';
    }

    public /* synthetic */ a(String r2, String r3, String r4, int r5, int r6, String r7, String r8, String r9, String r10, int r11, i r12) {
        if ((r11 & 128) == 0) goto L6;
        r9 = "";
    L6:
        if ((r11 & 256) == 0) goto L9;
        String r112 = "";
    L10:
        this(r2, r3, r4, r5, r6, r7, r8, r9, r112);
        return;
    L9:
        r112 = r10;
        goto L10
    }
}
