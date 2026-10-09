package com.stockbit.dto.movers;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import com.stockbit.calendar.CalendarEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/stockbit/dto/movers/MoversPaginationDTO;", "", CalendarEntryPoint.KEY_PAGE_DETAIL, "", Constants.KEY_LIMIT, "hasNext", "", "hasPrev", "<init>", "(IIZZ)V", "getPage", "()I", "getLimit", "getHasNext", "()Z", "getHasPrev", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "other", "hashCode", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MoversPaginationDTO {

    @SerializedName("has_next")
    private final boolean hasNext;

    @SerializedName("has_prev")
    private final boolean hasPrev;

    @SerializedName(Constants.KEY_LIMIT)
    private final int limit;

    @SerializedName(CalendarEntryPoint.KEY_PAGE_DETAIL)
    private final int page;

    public MoversPaginationDTO() {
        int r1 = 0;
        int r2 = 0;
        boolean r3 = false;
        boolean r4 = false;
        this(r1, r2, r3, r4, 15, null);
    }

    public final boolean a() {
        return this.hasNext;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MoversPaginationDTO) == true) goto L8;
        return false;
    L8:
        MoversPaginationDTO r52 = (MoversPaginationDTO) r5;
        if (this.page == r52.page) goto L12;
        return false;
    L12:
        if (this.limit == r52.limit) goto L15;
        return false;
    L15:
        if (this.hasNext == r52.hasNext) goto L18;
        return false;
    L18:
        if (this.hasPrev == r52.hasPrev) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.page) * 31) + Integer.hashCode(this.limit)) * 31) + Boolean.hashCode(this.hasNext)) * 31) + Boolean.hashCode(this.hasPrev);
    }

    public String toString() {
        return "MoversPaginationDTO(page=" + this.page + ", limit=" + this.limit + ", hasNext=" + this.hasNext + ", hasPrev=" + this.hasPrev + ")";
    }

    public MoversPaginationDTO(int r1, int r2, boolean r3, boolean r4) {
        this.page = r1;
        this.limit = r2;
        this.hasNext = r3;
        this.hasPrev = r4;
    }

    public /* synthetic */ MoversPaginationDTO(int r2, int r3, boolean r4, boolean r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = false;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = false;
    L14:
        this(r2, r3, r4, r5);
    }
}
