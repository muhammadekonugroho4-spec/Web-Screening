package com.stockbit.dto.securities.common;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/securities/common/DebtRatioRulesDTO;", "", "caution", "", "forceSell", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "getCaution", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getForceSell", "component1", "component2", Constants.COPY_TYPE, "(Ljava/lang/Double;Ljava/lang/Double;)Lcom/stockbit/dto/securities/common/DebtRatioRulesDTO;", "equals", "", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DebtRatioRulesDTO {

    @SerializedName("caution")
    private final Double caution;

    @SerializedName("force_sell")
    private final Double forceSell;

    /* JADX WARN: Multi-variable type inference failed */
    public DebtRatioRulesDTO() {
        Object[] r02 = 0 == true ? 1 : 0;
        this(null, r02, 3, 0 == true ? 1 : 0);
    }

    public final Double a() {
        return this.caution;
    }

    public final Double b() {
        return this.forceSell;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DebtRatioRulesDTO) == true) goto L8;
        return false;
    L8:
        DebtRatioRulesDTO r52 = (DebtRatioRulesDTO) r5;
        if (p.g(this.caution, r52.caution) == true) goto L12;
        return false;
    L12:
        if (p.g(this.forceSell, r52.forceSell) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Double r02 = this.caution;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Double r2 = this.forceSell;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "DebtRatioRulesDTO(caution=" + this.caution + ", forceSell=" + this.forceSell + ")";
    }

    public DebtRatioRulesDTO(Double r1, Double r2) {
        this.caution = r1;
        this.forceSell = r2;
    }

    public /* synthetic */ DebtRatioRulesDTO(Double r2, Double r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        this(r2, r3);
    }
}
