package com.stockbit.stockgroups.model;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlinx.serialization.l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/stockbit/stockgroups/model/StockGroupItemUIState;", "", "sectionItem", "Lcom/stockbit/component/stockgroups/model/StockGroupSectionItemUIState;", "volume", "", "freq", "<init>", "(Lcom/stockbit/component/stockgroups/model/StockGroupSectionItemUIState;Ljava/lang/String;Ljava/lang/String;)V", "getSectionItem", "()Lcom/stockbit/component/stockgroups/model/StockGroupSectionItemUIState;", "getVolume", "()Ljava/lang/String;", "getFreq", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "stock-groups_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@l
/* loaded from: classes11.dex */
public final class c {
    public static final int $stable = 0;
    private final String freq;
    private final com.stockbit.component.stockgroups.model.a sectionItem;
    private final String volume;

    static {
    }

    public c(com.stockbit.component.stockgroups.model.a r2, String r3, String r4) {
        p.l(r2, "sectionItem");
        p.l(r3, "volume");
        p.l(r4, "freq");
        this.sectionItem = r2;
        this.volume = r3;
        this.freq = r4;
    }

    public final String a() {
        return this.freq;
    }

    public final com.stockbit.component.stockgroups.model.a b() {
        return this.sectionItem;
    }

    public final String c() {
        return this.volume;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.sectionItem, r52.sectionItem) == true) goto L12;
        return false;
    L12:
        if (p.g(this.volume, r52.volume) == true) goto L15;
        return false;
    L15:
        if (p.g(this.freq, r52.freq) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.sectionItem.hashCode() * 31) + this.volume.hashCode()) * 31) + this.freq.hashCode();
    }

    public String toString() {
        return "StockGroupItemUIState(sectionItem=" + this.sectionItem + ", volume=" + this.volume + ", freq=" + this.freq + ')';
    }
}
