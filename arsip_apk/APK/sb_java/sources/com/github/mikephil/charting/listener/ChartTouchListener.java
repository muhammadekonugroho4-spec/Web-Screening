package com.github.mikephil.charting.listener;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.highlight.Highlight;

/* loaded from: classes4.dex */
public abstract class ChartTouchListener<T extends Chart<?>> extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    protected static final int DRAG = 1;
    protected static final int NONE = 0;
    protected static final int PINCH_ZOOM = 4;
    protected static final int POST_ZOOM = 5;
    protected static final int ROTATE = 6;
    protected static final int X_ZOOM = 2;
    protected static final int Y_ZOOM = 3;
    protected T mChart;
    protected GestureDetector mGestureDetector;
    protected ChartGesture mLastGesture;
    protected Highlight mLastHighlighted;
    protected int mTouchMode;

    public enum ChartGesture extends Enum<ChartGesture> {
        private static final /* synthetic */ ChartGesture[] $VALUES = null;
        public static final ChartGesture DOUBLE_TAP = null;
        public static final ChartGesture DRAG = null;
        public static final ChartGesture FLING = null;
        public static final ChartGesture LONG_PRESS = null;
        public static final ChartGesture NONE = null;
        public static final ChartGesture PINCH_ZOOM = null;
        public static final ChartGesture ROTATE = null;
        public static final ChartGesture SINGLE_TAP = null;
        public static final ChartGesture X_ZOOM = null;
        public static final ChartGesture Y_ZOOM = null;

        static {
            ChartGesture r02 = new ChartGesture("NONE", 0);
            NONE = r02;
            ChartGesture r1 = new ChartGesture("DRAG", 1);
            DRAG = r1;
            ChartGesture r2 = new ChartGesture("X_ZOOM", 2);
            X_ZOOM = r2;
            ChartGesture r3 = new ChartGesture("Y_ZOOM", 3);
            Y_ZOOM = r3;
            ChartGesture r4 = new ChartGesture("PINCH_ZOOM", 4);
            PINCH_ZOOM = r4;
            ChartGesture r5 = new ChartGesture("ROTATE", 5);
            ROTATE = r5;
            ChartGesture r6 = new ChartGesture("SINGLE_TAP", 6);
            SINGLE_TAP = r6;
            ChartGesture r7 = new ChartGesture("DOUBLE_TAP", 7);
            DOUBLE_TAP = r7;
            ChartGesture r8 = new ChartGesture("LONG_PRESS", 8);
            LONG_PRESS = r8;
            ChartGesture r9 = new ChartGesture("FLING", 9);
            FLING = r9;
            $VALUES = new ChartGesture[]{r02, r1, r2, r3, r4, r5, r6, r7, r8, r9};
        }

        ChartGesture(String r1, int r2) {
        }

        public static ChartGesture valueOf(String r1) {
            return (ChartGesture) Enum.valueOf(ChartGesture.class, r1);
        }

        public static ChartGesture[] values() {
            return (ChartGesture[]) $VALUES.clone();
        }
    }

    public ChartTouchListener(T r2) {
        this.mLastGesture = ChartGesture.NONE;
        this.mTouchMode = 0;
        this.mChart = r2;
        this.mGestureDetector = new GestureDetector(r2.getContext(), this);
    }

    public static float distance(float r02, float r1, float r2, float r3) {
        float r03 = r02 - r1;
        float r22 = r2 - r3;
        return (float) Math.sqrt((r03 * r03) + (r22 * r22));
    }

    public void endAction(MotionEvent r3) {
        OnChartGestureListener r02 = this.mChart.getOnChartGestureListener();
        if (r02 == null) goto L6;
        r02.onChartGestureEnd(r3, this.mLastGesture);
        return;
    }

    public ChartGesture getLastGesture() {
        return this.mLastGesture;
    }

    public int getTouchMode() {
        return this.mTouchMode;
    }

    public void performHighlight(Highlight r2, MotionEvent r3) {
        if (r2 != null) goto L5;
    L9:
        this.mChart.highlightValue(null, true);
        this.mLastHighlighted = null;
        return;
    L5:
        if (r2.equalTo(this.mLastHighlighted) == true) goto L9;
        this.mChart.highlightValue(r2, true);
        this.mLastHighlighted = r2;
    }

    public void setLastHighlighted(Highlight r1) {
        this.mLastHighlighted = r1;
    }

    public void startAction(MotionEvent r3) {
        OnChartGestureListener r02 = this.mChart.getOnChartGestureListener();
        if (r02 == null) goto L6;
        r02.onChartGestureStart(r3, this.mLastGesture);
        return;
    }
}
