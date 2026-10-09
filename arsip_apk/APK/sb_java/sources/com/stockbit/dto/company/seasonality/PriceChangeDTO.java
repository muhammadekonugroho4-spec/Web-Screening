package com.stockbit.dto.company.seasonality;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ,\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/stockbit/dto/company/seasonality/PriceChangeDTO;", "", "columns", "", "Lcom/stockbit/dto/company/seasonality/ColumnsDTO;", "row", "", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "getColumns", "()Ljava/util/List;", "getRow", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", Constants.COPY_TYPE, "(Ljava/util/List;Ljava/lang/Integer;)Lcom/stockbit/dto/company/seasonality/PriceChangeDTO;", "equals", "", "other", "hashCode", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PriceChangeDTO {

    @SerializedName("columns")
    private final List<ColumnsDTO> columns;

    @SerializedName("row")
    private final Integer row;

    public PriceChangeDTO(List<ColumnsDTO> r1, Integer r2) {
        this.columns = r1;
        this.row = r2;
    }

    public final List a() {
        return this.columns;
    }

    public final Integer b() {
        return this.row;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof PriceChangeDTO) == true) goto L8;
        return false;
    L8:
        PriceChangeDTO r52 = (PriceChangeDTO) r5;
        if (p.g(this.columns, r52.columns) == true) goto L12;
        return false;
    L12:
        if (p.g(this.row, r52.row) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        List<ColumnsDTO> r02 = this.columns;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.row;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "PriceChangeDTO(columns=" + this.columns + ", row=" + this.row + ")";
    }
}
