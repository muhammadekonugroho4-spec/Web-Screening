package com.github.mikephil.charting.compose.scope;

import androidx.compose.ui.unit.i;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/github/mikephil/charting/compose/scope/GestureScope;", "", "<init>", "()V", "", "tapToHighlight", "Z", "getTapToHighlight", "()Z", "setTapToHighlight", "(Z)V", "dragToPan", "getDragToPan", "setDragToPan", "dragToScrub", "getDragToScrub", "setDragToScrub", "longPressToDrag", "getLongPressToDrag", "setLongPressToDrag", "flingDeceleration", "getFlingDeceleration", "setFlingDeceleration", "Landroidx/compose/ui/unit/i;", "scrubThreshold", "F", "getScrubThreshold-D9Ej5fM", "()F", "setScrubThreshold-0680j_4", "(F)V", "MPChartCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GestureScope {
    public static final int $stable = 8;
    private boolean dragToPan;
    private boolean dragToScrub;
    private boolean flingDeceleration;
    private boolean longPressToDrag;
    private float scrubThreshold;
    private boolean tapToHighlight;

    static {
    }

    public GestureScope() {
        this.tapToHighlight = true;
        this.dragToPan = true;
        this.dragToScrub = true;
        this.flingDeceleration = true;
        this.scrubThreshold = i.h(48);
    }

    public final boolean getDragToPan() {
        return this.dragToPan;
    }

    public final boolean getDragToScrub() {
        return this.dragToScrub;
    }

    public final boolean getFlingDeceleration() {
        return this.flingDeceleration;
    }

    public final boolean getLongPressToDrag() {
        return this.longPressToDrag;
    }

    /* renamed from: getScrubThreshold-D9Ej5fM, reason: not valid java name */
    public final float m197getScrubThresholdD9Ej5fM() {
        return this.scrubThreshold;
    }

    public final boolean getTapToHighlight() {
        return this.tapToHighlight;
    }

    public final void setDragToPan(boolean r1) {
        this.dragToPan = r1;
    }

    public final void setDragToScrub(boolean r1) {
        this.dragToScrub = r1;
    }

    public final void setFlingDeceleration(boolean r1) {
        this.flingDeceleration = r1;
    }

    public final void setLongPressToDrag(boolean r1) {
        this.longPressToDrag = r1;
    }

    /* renamed from: setScrubThreshold-0680j_4, reason: not valid java name */
    public final void m198setScrubThreshold0680j_4(float r1) {
        this.scrubThreshold = r1;
    }

    public final void setTapToHighlight(boolean r1) {
        this.tapToHighlight = r1;
    }
}
