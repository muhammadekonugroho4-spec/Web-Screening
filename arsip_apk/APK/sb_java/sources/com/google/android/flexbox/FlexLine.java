package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class FlexLine {
    boolean mAnyItemsHaveFlexGrow;
    boolean mAnyItemsHaveFlexShrink;
    int mBottom;
    int mCrossSize;
    int mDividerLengthInMainSize;
    int mFirstIndex;
    int mGoneItemCount;
    List<Integer> mIndicesAlignSelfStretch;
    int mItemCount;
    int mLastIndex;
    int mLeft;
    int mMainSize;
    int mMaxBaseline;
    int mRight;
    int mSumCrossSizeBefore;
    int mTop;
    float mTotalFlexGrow;
    float mTotalFlexShrink;

    public FlexLine() {
        this.mLeft = Integer.MAX_VALUE;
        this.mTop = Integer.MAX_VALUE;
        this.mRight = Integer.MIN_VALUE;
        this.mBottom = Integer.MIN_VALUE;
        this.mIndicesAlignSelfStretch = new ArrayList();
    }

    public int getCrossSize() {
        return this.mCrossSize;
    }

    public int getFirstIndex() {
        return this.mFirstIndex;
    }

    public int getItemCount() {
        return this.mItemCount;
    }

    public int getItemCountNotGone() {
        return this.mItemCount - this.mGoneItemCount;
    }

    public int getMainSize() {
        return this.mMainSize;
    }

    public float getTotalFlexGrow() {
        return this.mTotalFlexGrow;
    }

    public float getTotalFlexShrink() {
        return this.mTotalFlexShrink;
    }

    public void updatePositionFromView(View r5, int r6, int r7, int r8, int r9) {
        FlexItem r02 = (FlexItem) r5.getLayoutParams();
        this.mLeft = Math.min(this.mLeft, (r5.getLeft() - r02.getMarginLeft()) - r6);
        this.mTop = Math.min(this.mTop, (r5.getTop() - r02.getMarginTop()) - r7);
        this.mRight = Math.max(this.mRight, (r5.getRight() + r02.getMarginRight()) + r8);
        this.mBottom = Math.max(this.mBottom, (r5.getBottom() + r02.getMarginBottom()) + r9);
    }
}
