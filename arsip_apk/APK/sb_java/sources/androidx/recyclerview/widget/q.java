package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class q extends RecyclerView.y {
    private static final boolean DEBUG = false;
    private static final float MILLISECONDS_PER_INCH = 25.0f;
    public static final int SNAP_TO_ANY = 0;
    public static final int SNAP_TO_END = 1;
    public static final int SNAP_TO_START = -1;
    private static final float TARGET_SEEK_EXTRA_SCROLL_RATIO = 1.2f;
    private static final int TARGET_SEEK_SCROLL_DISTANCE_PX = 10000;
    protected final DecelerateInterpolator mDecelerateInterpolator;
    private final DisplayMetrics mDisplayMetrics;
    private boolean mHasCalculatedMillisPerPixel;
    protected int mInterimTargetDx;
    protected int mInterimTargetDy;
    protected final LinearInterpolator mLinearInterpolator;
    private float mMillisPerPixel;

    @SuppressLint({"UnknownNullness"})
    protected PointF mTargetVector;

    public q(Context r2) {
        this.mLinearInterpolator = new LinearInterpolator();
        this.mDecelerateInterpolator = new DecelerateInterpolator();
        this.mHasCalculatedMillisPerPixel = false;
        this.mInterimTargetDx = 0;
        this.mInterimTargetDy = 0;
        this.mDisplayMetrics = r2.getResources().getDisplayMetrics();
    }

    public final int a(int r1, int r2) {
        int r22 = r1 - r2;
        if ((r1 * r22) > 0) goto L6;
        return 0;
    L6:
        return r22;
    }

    public final float b() {
        if (this.mHasCalculatedMillisPerPixel == true) goto L6;
        this.mMillisPerPixel = calculateSpeedPerPixel(this.mDisplayMetrics);
        this.mHasCalculatedMillisPerPixel = true;
    L6:
        return this.mMillisPerPixel;
    }

    public int calculateDtToFit(int r2, int r3, int r4, int r5, int r6) {
        if (r6 == (-1)) goto L20;
        if (r6 != 0) goto L6;
        int r42 = r4 - r2;
        if (r42 <= 0) goto L14;
        return r42;
    L14:
        int r52 = r5 - r3;
        if (r52 >= 0) goto L17;
        return r52;
    L17:
        return 0;
    L6:
        if (r6 != 1) goto L10;
        return r5 - r3;
    L10:
        throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
    L20:
        return r4 - r2;
    }

    @SuppressLint({"UnknownNullness"})
    public int calculateDxToMakeVisible(View r11, int r12) {
        RecyclerView.o r02 = getLayoutManager();
        if (r02 != null) goto L5;
        return 0;
    L5:
        if (r02.canScrollHorizontally() == false) goto L11;
        RecyclerView.LayoutParams r1 = (RecyclerView.LayoutParams) r11.getLayoutParams();
        return calculateDtToFit(r02.getDecoratedLeft(r11) - ((ViewGroup.MarginLayoutParams) r1).leftMargin, r02.getDecoratedRight(r11) + ((ViewGroup.MarginLayoutParams) r1).rightMargin, r02.getPaddingLeft(), r02.getWidth() - r02.getPaddingRight(), r12);
    L11:
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    public int calculateDyToMakeVisible(View r11, int r12) {
        RecyclerView.o r02 = getLayoutManager();
        if (r02 != null) goto L5;
        return 0;
    L5:
        if (r02.canScrollVertically() == false) goto L11;
        RecyclerView.LayoutParams r1 = (RecyclerView.LayoutParams) r11.getLayoutParams();
        return calculateDtToFit(r02.getDecoratedTop(r11) - ((ViewGroup.MarginLayoutParams) r1).topMargin, r02.getDecoratedBottom(r11) + ((ViewGroup.MarginLayoutParams) r1).bottomMargin, r02.getPaddingTop(), r02.getHeight() - r02.getPaddingBottom(), r12);
    L11:
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    public float calculateSpeedPerPixel(DisplayMetrics r2) {
        return MILLISECONDS_PER_INCH / r2.densityDpi;
    }

    public int calculateTimeForDeceleration(int r5) {
        return (int) Math.ceil(calculateTimeForScrolling(r5) / 0.3356d);
    }

    public int calculateTimeForScrolling(int r3) {
        return (int) Math.ceil(Math.abs(r3) * b());
    }

    public int getHorizontalSnapPreference() {
        PointF r02 = this.mTargetVector;
        if (r02 == null) goto L13;
        float r03 = r02.x;
        if (r03 != 0.0f) goto L8;
        return 0;
    L8:
        if (r03 <= 0.0f) goto L11;
        return 1;
    L11:
        return -1;
    L13:
        return 0;
    }

    public int getVerticalSnapPreference() {
        PointF r02 = this.mTargetVector;
        if (r02 == null) goto L13;
        float r03 = r02.y;
        if (r03 != 0.0f) goto L8;
        return 0;
    L8:
        if (r03 <= 0.0f) goto L11;
        return 1;
    L11:
        return -1;
    L13:
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    @SuppressLint({"UnknownNullness"})
    public void onSeekTargetStep(int r1, int r2, RecyclerView.z r3, RecyclerView.y.a r4) {
        if (getChildCount() != 0) goto L6;
        stop();
        return;
    L6:
        this.mInterimTargetDx = a(this.mInterimTargetDx, r1);
        int r12 = a(this.mInterimTargetDy, r2);
        this.mInterimTargetDy = r12;
        if (this.mInterimTargetDx != 0) goto L11;
        if (r12 != 0) goto L12;
        updateActionForInterimTarget(r4);
        return;
    L12:
        return;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    public void onStart() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    public void onStop() {
        this.mInterimTargetDy = 0;
        this.mInterimTargetDx = 0;
        this.mTargetVector = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    @SuppressLint({"UnknownNullness"})
    public void onTargetFound(View r3, RecyclerView.z r4, RecyclerView.y.a r5) {
        int r42 = calculateDxToMakeVisible(r3, getHorizontalSnapPreference());
        int r32 = calculateDyToMakeVisible(r3, getVerticalSnapPreference());
        int r02 = calculateTimeForDeceleration((int) Math.sqrt((r42 * r42) + (r32 * r32)));
        if (r02 <= 0) goto L6;
        r5.d(-r42, -r32, r02, this.mDecelerateInterpolator);
        return;
    }

    @SuppressLint({"UnknownNullness"})
    public void updateActionForInterimTarget(RecyclerView.y.a r5) {
        PointF r02 = computeScrollVectorForPosition(getTargetPosition());
        if (r02 != null) goto L5;
    L11:
        r5.b(getTargetPosition());
        stop();
        return;
    L5:
        if (r02.x == 0.0f) goto L7;
    L9:
        normalize(r02);
        this.mTargetVector = r02;
        this.mInterimTargetDx = (int) (r02.x * 10000.0f);
        this.mInterimTargetDy = (int) (r02.y * 10000.0f);
        r5.d((int) (this.mInterimTargetDx * TARGET_SEEK_EXTRA_SCROLL_RATIO), (int) (this.mInterimTargetDy * TARGET_SEEK_EXTRA_SCROLL_RATIO), (int) (calculateTimeForScrolling(10000) * TARGET_SEEK_EXTRA_SCROLL_RATIO), this.mLinearInterpolator);
        return;
    L7:
        if (r02.y != 0.0f) goto L9;
        goto L9
    }
}
