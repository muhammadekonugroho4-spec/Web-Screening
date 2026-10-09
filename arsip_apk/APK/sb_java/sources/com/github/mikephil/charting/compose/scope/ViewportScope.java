package com.github.mikephil.charting.compose.scope;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\tR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR\u001a\u0010\u001d\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u001a\u0010 \u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016¨\u0006#"}, d2 = {"Lcom/github/mikephil/charting/compose/scope/ViewportScope;", "", "<init>", "()V", "visibleXRange", "", "getVisibleXRange", "()Ljava/lang/Float;", "setVisibleXRange", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "visibleXRangeMinimum", "getVisibleXRangeMinimum", "setVisibleXRangeMinimum", "visibleXRangeMaximum", "getVisibleXRangeMaximum", "setVisibleXRangeMaximum", "yAxisAutoScale", "", "getYAxisAutoScale", "()Z", "setYAxisAutoScale", "(Z)V", "yAxisMinimum", "getYAxisMinimum", "setYAxisMinimum", "yAxisMaximum", "getYAxisMaximum", "setYAxisMaximum", "autoScrollToEnd", "getAutoScrollToEnd", "setAutoScrollToEnd", "autoScrollAnimated", "getAutoScrollAnimated", "setAutoScrollAnimated", "MPChartCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ViewportScope {
    public static final int $stable = 8;
    private boolean autoScrollAnimated;
    private boolean autoScrollToEnd;
    private Float visibleXRange;
    private Float visibleXRangeMaximum;
    private Float visibleXRangeMinimum;
    private boolean yAxisAutoScale;
    private Float yAxisMaximum;
    private Float yAxisMinimum;

    static {
    }

    public ViewportScope() {
        this.yAxisAutoScale = true;
        this.autoScrollAnimated = true;
    }

    public final boolean getAutoScrollAnimated() {
        return this.autoScrollAnimated;
    }

    public final boolean getAutoScrollToEnd() {
        return this.autoScrollToEnd;
    }

    public final Float getVisibleXRange() {
        return this.visibleXRange;
    }

    public final Float getVisibleXRangeMaximum() {
        return this.visibleXRangeMaximum;
    }

    public final Float getVisibleXRangeMinimum() {
        return this.visibleXRangeMinimum;
    }

    public final boolean getYAxisAutoScale() {
        return this.yAxisAutoScale;
    }

    public final Float getYAxisMaximum() {
        return this.yAxisMaximum;
    }

    public final Float getYAxisMinimum() {
        return this.yAxisMinimum;
    }

    public final void setAutoScrollAnimated(boolean r1) {
        this.autoScrollAnimated = r1;
    }

    public final void setAutoScrollToEnd(boolean r1) {
        this.autoScrollToEnd = r1;
    }

    public final void setVisibleXRange(Float r1) {
        this.visibleXRange = r1;
    }

    public final void setVisibleXRangeMaximum(Float r1) {
        this.visibleXRangeMaximum = r1;
    }

    public final void setVisibleXRangeMinimum(Float r1) {
        this.visibleXRangeMinimum = r1;
    }

    public final void setYAxisAutoScale(boolean r1) {
        this.yAxisAutoScale = r1;
    }

    public final void setYAxisMaximum(Float r1) {
        this.yAxisMaximum = r1;
    }

    public final void setYAxisMinimum(Float r1) {
        this.yAxisMinimum = r1;
    }
}
