package com.github.mikephil.charting.compose.scope;

import com.github.mikephil.charting.compose.data.AxisPosition;
import kotlin.Metadata;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\"\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010\u001aR\"\u0010(\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010.\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R$\u00101\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00107\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R$\u0010:\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00102\u001a\u0004\b;\u00104\"\u0004\b<\u00106R\"\u0010=\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\u0016\u001a\u0004\b>\u0010\u0018\"\u0004\b?\u0010\u001a¨\u0006@"}, d2 = {"Lcom/github/mikephil/charting/compose/scope/XAxisScope;", "", "<init>", "()V", "Lcom/github/mikephil/charting/compose/data/AxisPosition;", "position", "Lcom/github/mikephil/charting/compose/data/AxisPosition;", "getPosition", "()Lcom/github/mikephil/charting/compose/data/AxisPosition;", "setPosition", "(Lcom/github/mikephil/charting/compose/data/AxisPosition;)V", "Lkotlin/Function1;", "", "", "formatter", "Lkotlin/jvm/functions/l;", "getFormatter", "()Lkotlin/jvm/functions/l;", "setFormatter", "(Lkotlin/jvm/functions/l;)V", "", "gridEnabled", "Z", "getGridEnabled", "()Z", "setGridEnabled", "(Z)V", "drawLabels", "getDrawLabels", "setDrawLabels", "", "labelCount", "I", "getLabelCount", "()I", "setLabelCount", "(I)V", "axisLineEnabled", "getAxisLineEnabled", "setAxisLineEnabled", "spaceMin", "F", "getSpaceMin", "()F", "setSpaceMin", "(F)V", "spaceMax", "getSpaceMax", "setSpaceMax", "axisMinimum", "Ljava/lang/Float;", "getAxisMinimum", "()Ljava/lang/Float;", "setAxisMinimum", "(Ljava/lang/Float;)V", "axisMaximum", "getAxisMaximum", "setAxisMaximum", "granularity", "getGranularity", "setGranularity", "forceLabels", "getForceLabels", "setForceLabels", "MPChartCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class XAxisScope {
    public static final int $stable = 8;
    private boolean axisLineEnabled;
    private Float axisMaximum;
    private Float axisMinimum;
    private boolean drawLabels;
    private boolean forceLabels;
    private l formatter;
    private Float granularity;
    private boolean gridEnabled;
    private int labelCount;
    private AxisPosition position;
    private float spaceMax;
    private float spaceMin;

    static {
    }

    public XAxisScope() {
        this.position = AxisPosition.Bottom;
        this.gridEnabled = true;
        this.drawLabels = true;
        this.labelCount = 6;
        this.axisLineEnabled = true;
    }

    public final boolean getAxisLineEnabled() {
        return this.axisLineEnabled;
    }

    public final Float getAxisMaximum() {
        return this.axisMaximum;
    }

    public final Float getAxisMinimum() {
        return this.axisMinimum;
    }

    public final boolean getDrawLabels() {
        return this.drawLabels;
    }

    public final boolean getForceLabels() {
        return this.forceLabels;
    }

    public final l getFormatter() {
        return this.formatter;
    }

    public final Float getGranularity() {
        return this.granularity;
    }

    public final boolean getGridEnabled() {
        return this.gridEnabled;
    }

    public final int getLabelCount() {
        return this.labelCount;
    }

    public final AxisPosition getPosition() {
        return this.position;
    }

    public final float getSpaceMax() {
        return this.spaceMax;
    }

    public final float getSpaceMin() {
        return this.spaceMin;
    }

    public final void setAxisLineEnabled(boolean r1) {
        this.axisLineEnabled = r1;
    }

    public final void setAxisMaximum(Float r1) {
        this.axisMaximum = r1;
    }

    public final void setAxisMinimum(Float r1) {
        this.axisMinimum = r1;
    }

    public final void setDrawLabels(boolean r1) {
        this.drawLabels = r1;
    }

    public final void setForceLabels(boolean r1) {
        this.forceLabels = r1;
    }

    public final void setFormatter(l r1) {
        this.formatter = r1;
    }

    public final void setGranularity(Float r1) {
        this.granularity = r1;
    }

    public final void setGridEnabled(boolean r1) {
        this.gridEnabled = r1;
    }

    public final void setLabelCount(int r1) {
        this.labelCount = r1;
    }

    public final void setPosition(AxisPosition r2) {
        p.l(r2, "<set-?>");
        this.position = r2;
    }

    public final void setSpaceMax(float r1) {
        this.spaceMax = r1;
    }

    public final void setSpaceMin(float r1) {
        this.spaceMin = r1;
    }
}
