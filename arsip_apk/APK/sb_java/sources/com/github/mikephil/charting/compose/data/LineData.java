package com.github.mikephil.charting.compose.data;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/github/mikephil/charting/compose/data/LineData;", "", "dataSets", "", "Lcom/github/mikephil/charting/compose/data/LineDataSet;", "<init>", "(Ljava/util/List;)V", "getDataSets", "()Ljava/util/List;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "MPChartCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LineData {
    public static final int $stable = 8;
    private final List<LineDataSet> dataSets;

    static {
    }

    public LineData(List<LineDataSet> r2) {
        p.l(r2, "dataSets");
        this.dataSets = r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LineData copy$default(LineData r02, List r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r02.dataSets;
    L6:
        return r02.copy(r1);
    }

    public final List<LineDataSet> component1() {
        return this.dataSets;
    }

    public final LineData copy(List<LineDataSet> r2) {
        p.l(r2, "dataSets");
        return new LineData(r2);
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof LineData) == true) goto L9;
        return false;
    L9:
        if (p.g(this.dataSets, ((LineData) r4).dataSets) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final List<LineDataSet> getDataSets() {
        return this.dataSets;
    }

    public int hashCode() {
        return this.dataSets.hashCode();
    }

    public String toString() {
        return "LineData(dataSets=" + this.dataSets + ")";
    }
}
