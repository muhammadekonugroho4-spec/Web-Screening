package com.stockbit.dto.watchlist;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0005HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/stockbit/dto/watchlist/WatchlistSymbolListDTO;", "", "watchlistId", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "symbols", "", "total", "", "<init>", "(JLjava/lang/String;Ljava/util/List;I)V", "getWatchlistId", "()J", "getName", "()Ljava/lang/String;", "getSymbols", "()Ljava/util/List;", "getTotal", "()I", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WatchlistSymbolListDTO {

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @SerializedName("symbols")
    private final List<String> symbols;

    @SerializedName("total")
    private final int total;

    @SerializedName("watchlist_id")
    private final long watchlistId;

    public WatchlistSymbolListDTO() {
        long r1 = 0;
        String r3 = null;
        List r4 = null;
        int r5 = 0;
        this(r1, r3, r4, r5, 15, null);
    }

    public final String a() {
        return this.name;
    }

    public final List b() {
        return this.symbols;
    }

    public final int c() {
        return this.total;
    }

    public final long d() {
        return this.watchlistId;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof WatchlistSymbolListDTO) == true) goto L8;
        return false;
    L8:
        WatchlistSymbolListDTO r82 = (WatchlistSymbolListDTO) r8;
        if (this.watchlistId == r82.watchlistId) goto L12;
        return false;
    L12:
        if (p.g(this.name, r82.name) == true) goto L15;
        return false;
    L15:
        if (p.g(this.symbols, r82.symbols) == true) goto L18;
        return false;
    L18:
        if (this.total == r82.total) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = Long.hashCode(this.watchlistId) * 31;
        String r1 = this.name;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        List<String> r13 = this.symbols;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return ((r03 + r2) * 31) + Integer.hashCode(this.total);
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "WatchlistSymbolListDTO(watchlistId=" + this.watchlistId + ", name=" + this.name + ", symbols=" + this.symbols + ", total=" + this.total + ")";
    }

    public WatchlistSymbolListDTO(long r1, String r3, List<String> r4, int r5) {
        this.watchlistId = r1;
        this.name = r3;
        this.symbols = r4;
        this.total = r5;
    }

    public /* synthetic */ WatchlistSymbolListDTO(long r7, String r9, List r10, int r11, int r12, i r13) {
        if ((r12 & 1) == 0) goto L5;
        r7 = 0;
    L5:
        long r1 = r7;
        if ((r12 & 2) == 0) goto L8;
        String r3 = null;
    L10:
        if ((r12 & 4) == 0) goto L12;
        List r4 = null;
    L14:
        if ((r12 & 8) == 0) goto L16;
        r11 = 0;
    L16:
        this(r1, r3, r4, r11);
        return;
    L12:
        r4 = r10;
        goto L14
    L8:
        r3 = r9;
        goto L10
    }
}
