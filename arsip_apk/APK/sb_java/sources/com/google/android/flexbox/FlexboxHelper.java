package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.core.view.AbstractC3903w;
import androidx.core.widget.c;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
class FlexboxHelper {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int INITIAL_CAPACITY = 10;
    private static final long MEASURE_SPEC_WIDTH_MASK = 4294967295L;
    private boolean[] mChildrenFrozen;
    private final FlexContainer mFlexContainer;
    int[] mIndexToFlexLine;
    long[] mMeasureSpecCache;
    private long[] mMeasuredSizeCache;

    /* renamed from: com.google.android.flexbox.FlexboxHelper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class FlexLinesResult {
        int mChildState;
        List<FlexLine> mFlexLines;

        public FlexLinesResult() {
        }

        public void reset() {
            this.mFlexLines = null;
            this.mChildState = 0;
        }
    }

    public static class Order implements Comparable<Order> {
        int index;
        int order;

        private Order() {
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Order r1) {
            return compareTo2(r1);
        }

        public String toString() {
            return "Order{order=" + this.order + ", index=" + this.index + '}';
        }

        public /* synthetic */ Order(AnonymousClass1 r1) {
            this();
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(Order r3) {
            int r02 = this.order;
            int r1 = r3.order;
            if (r02 == r1) goto L7;
            return r02 - r1;
        L7:
            return this.index - r3.index;
        }
    }

    static {
    }

    public FlexboxHelper(FlexContainer r1) {
        this.mFlexContainer = r1;
    }

    private void addFlexLine(List<FlexLine> r1, FlexLine r2, int r3, int r4) {
        r2.mSumCrossSizeBefore = r4;
        this.mFlexContainer.onNewFlexLineAdded(r2);
        r2.mLastIndex = r3;
        r1.add(r2);
    }

    private void checkSizeConstraints(View r7, int r8) {
        FlexItem r02 = (FlexItem) r7.getLayoutParams();
        int r1 = r7.getMeasuredWidth();
        int r2 = r7.getMeasuredHeight();
        boolean r4 = true;
        if (r1 >= r02.getMinWidth()) goto L7;
        r1 = r02.getMinWidth();
    L5:
        boolean r3 = true;
    L11:
        if (r2 >= r02.getMinHeight()) goto L14;
        r2 = r02.getMinHeight();
    L17:
        if (r4 == false) goto L20;
        int r12 = View.MeasureSpec.makeMeasureSpec(r1, Ints.MAX_POWER_OF_TWO);
        int r03 = View.MeasureSpec.makeMeasureSpec(r2, Ints.MAX_POWER_OF_TWO);
        r7.measure(r12, r03);
        updateMeasureCache(r8, r12, r03, r7);
        this.mFlexContainer.updateViewCache(r8, r7);
        return;
    L20:
        return;
    L14:
        if (r2 <= r02.getMaxHeight()) goto L16;
        r2 = r02.getMaxHeight();
        goto L17
    L16:
        r4 = r3;
        goto L17
    L7:
        if (r1 <= r02.getMaxWidth()) goto L9;
        r1 = r02.getMaxWidth();
        goto L5
    L9:
        r3 = false;
        goto L11
    }

    private List<FlexLine> constructFlexLinesForAlignContentCenter(List<FlexLine> r4, int r5, int r6) {
        int r52 = (r5 - r6) / 2;
        ArrayList r62 = new ArrayList();
        FlexLine r02 = new FlexLine();
        r02.mCrossSize = r52;
        int r53 = r4.size();
        int r1 = 0;
    L3:
        if (r1 >= r53) goto L10;
        if (r1 != 0) goto L6;
        r62.add(r02);
    L6:
        r62.add(r4.get(r1));
        if (r1 != (r4.size() - 1)) goto L9;
        r62.add(r02);
    L9:
        r1 = r1 + 1;
        goto L3
    L10:
        return r62;
    }

    private List<Order> createOrders(int r6) {
        ArrayList r02 = new ArrayList(r6);
        int r1 = 0;
    L3:
        if (r1 >= r6) goto L5;
        FlexItem r2 = (FlexItem) this.mFlexContainer.getFlexItemAt(r1).getLayoutParams();
        Order r3 = new Order(null);
        r3.order = r2.getOrder();
        r3.index = r1;
        r02.add(r3);
        r1 = r1 + 1;
        goto L3
    L5:
        return r02;
    }

    private void ensureChildrenFrozen(int r3) {
        boolean[] r02 = this.mChildrenFrozen;
        if (r02 != null) goto L7;
        this.mChildrenFrozen = new boolean[Math.max(r3, 10)];
        return;
    L7:
        if (r02.length >= r3) goto L10;
        this.mChildrenFrozen = new boolean[Math.max(r02.length * 2, r3)];
        return;
    L10:
        Arrays.fill(r02, false);
    }

    private void evaluateMinimumSizeForCompoundButton(CompoundButton r6) {
        FlexItem r02 = (FlexItem) r6.getLayoutParams();
        int r1 = r02.getMinWidth();
        int r2 = r02.getMinHeight();
        Drawable r62 = c.a(r6);
        int r3 = 0;
        if (r62 != null) goto L5;
        int r4 = 0;
    L6:
        if (r62 == null) goto L10;
        r3 = r62.getMinimumHeight();
    L10:
        if (r1 != (-1)) goto L12;
        r1 = r4;
    L12:
        r02.setMinWidth(r1);
        if (r2 != (-1)) goto L15;
        r2 = r3;
    L15:
        r02.setMinHeight(r2);
        return;
    L5:
        r4 = r62.getMinimumWidth();
        goto L6
    }

    private void expandFlexItems(int r23, int r24, FlexLine r25, int r26, int r27, boolean r28) {
        float r1 = r25.mTotalFlexGrow;
        float r2 = 0.0f;
        if (r1 <= 0.0f) goto L88;
        int r5 = r25.mMainSize;
        if (r26 < r5) goto L91;
        float r6 = (r26 - r5) / r1;
        r25.mMainSize = r27 + r25.mDividerLengthInMainSize;
        if (r28 == true) goto L10;
        r25.mCrossSize = Integer.MIN_VALUE;
    L10:
        int r12 = 0;
        boolean r7 = false;
        int r8 = 0;
        float r9 = 0.0f;
    L12:
        if (r12 >= r25.mItemCount) goto L80;
        int r10 = r25.mFirstIndex + r12;
        View r11 = this.mFlexContainer.getReorderedFlexItemAt(r10);
        if (r11 != null) goto L16;
    L17:
        float r19 = r2;
        float r15 = r6;
        r7 = r7;
    L78:
        r12 = r12 + 1;
        r6 = r15;
        r2 = r19;
        goto L12
    L16:
        if (r11.getVisibility() == 8) goto L17;
        FlexItem r122 = (FlexItem) r11.getLayoutParams();
        int r13 = this.mFlexContainer.getFlexDirection();
        r19 = r2;
        if (r13 == 0) goto L21;
        if (r13 == 1) goto L21;
        int r132 = r11.getMeasuredHeight();
        long[] r22 = this.mMeasuredSizeCache;
        if (r22 == null) goto L25;
        r132 = extractHigherInt(r22[r10]);
    L25:
        int r29 = r11.getMeasuredWidth();
        long[] r14 = this.mMeasuredSizeCache;
        r15 = r6;
        boolean r16 = r7;
        if (r14 == null) goto L29;
        r29 = extractLowerInt(r14[r10]);
    L29:
        if (this.mChildrenFrozen[r10] == false) goto L31;
    L47:
        r7 = r16;
    L48:
        int r210 = Math.max(r8, ((r29 + r122.getMarginLeft()) + r122.getMarginRight()) + this.mFlexContainer.getDecorationLengthCrossAxis(r11));
        r25.mMainSize += (r132 + r122.getMarginTop()) + r122.getMarginBottom();
    L76:
        r25.mCrossSize = Math.max(r25.mCrossSize, r210);
        r8 = r210;
        goto L78
    L31:
        if (r122.getFlexGrow() <= r19) goto L47;
        float r211 = r132 + (r122.getFlexGrow() * r15);
        if (r12 != (r25.mItemCount - 1)) goto L35;
        r211 = r211 + r9;
        r9 = r19;
    L35:
        int r62 = Math.round(r211);
        if (r62 <= r122.getMaxHeight()) goto L38;
        r62 = r122.getMaxHeight();
        this.mChildrenFrozen[r10] = true;
        r25.mTotalFlexGrow -= r122.getFlexGrow();
        r7 = true;
    L46:
        int r212 = getChildWidthMeasureSpecInternal(r23, r122, r25.mSumCrossSizeBefore);
        int r63 = View.MeasureSpec.makeMeasureSpec(r62, Ints.MAX_POWER_OF_TWO);
        r11.measure(r212, r63);
        int r133 = r11.getMeasuredWidth();
        int r162 = r11.getMeasuredHeight();
        updateMeasureCache(r10, r212, r63, r11);
        this.mFlexContainer.updateViewCache(r10, r11);
        r29 = r133;
        r132 = r162;
        goto L48
    L38:
        r9 = r9 + (r211 - r62);
        double r134 = r9;
        if (r134 <= 1.0d) goto L44;
        r62 = r62 + 1;
        double r135 = r134 - 1.0d;
    L41:
        r9 = (float) r135;
    L42:
        r7 = r16;
        goto L46
    L44:
        if (r134 >= (-1.0d)) goto L42;
        r62 = r62 - 1;
        r135 = r134 + 1.0d;
    L21:
        r15 = r6;
        boolean r163 = r7;
        int r213 = r11.getMeasuredWidth();
        long[] r64 = this.mMeasuredSizeCache;
        if (r64 == null) goto L52;
        r213 = extractLowerInt(r64[r10]);
    L52:
        int r65 = r11.getMeasuredHeight();
        long[] r72 = this.mMeasuredSizeCache;
        if (r72 == null) goto L56;
        r65 = extractHigherInt(r72[r10]);
    L56:
        if (this.mChildrenFrozen[r10] == false) goto L58;
    L74:
        r7 = r163;
    L75:
        int r66 = Math.max(r8, ((r65 + r122.getMarginTop()) + r122.getMarginBottom()) + this.mFlexContainer.getDecorationLengthCrossAxis(r11));
        r25.mMainSize += (r213 + r122.getMarginLeft()) + r122.getMarginRight();
        r210 = r66;
        goto L76
    L58:
        if (r122.getFlexGrow() <= r19) goto L74;
        float r214 = r213 + (r122.getFlexGrow() * r15);
        if (r12 != (r25.mItemCount - 1)) goto L62;
        r214 = r214 + r9;
        r9 = r19;
    L62:
        int r67 = Math.round(r214);
        if (r67 <= r122.getMaxWidth()) goto L65;
        r67 = r122.getMaxWidth();
        this.mChildrenFrozen[r10] = true;
        r25.mTotalFlexGrow -= r122.getFlexGrow();
        r7 = true;
    L73:
        int r215 = getChildHeightMeasureSpecInternal(r24, r122, r25.mSumCrossSizeBefore);
        int r68 = View.MeasureSpec.makeMeasureSpec(r67, Ints.MAX_POWER_OF_TWO);
        r11.measure(r68, r215);
        int r142 = r11.getMeasuredWidth();
        int r164 = r11.getMeasuredHeight();
        updateMeasureCache(r10, r68, r215, r11);
        this.mFlexContainer.updateViewCache(r10, r11);
        r213 = r142;
        r65 = r164;
        goto L75
    L65:
        r9 = r9 + (r214 - r67);
        double r136 = r9;
        if (r136 <= 1.0d) goto L71;
        r67 = r67 + 1;
        double r137 = r136 - 1.0d;
    L68:
        r9 = (float) r137;
    L69:
        r7 = r163;
        goto L73
    L71:
        if (r136 >= (-1.0d)) goto L69;
        r67 = r67 - 1;
        r137 = r136 + 1.0d;
        goto L68
    L80:
        if (r7 == true) goto L82;
        return;
    L82:
        if (r5 == r25.mMainSize) goto L90;
        expandFlexItems(r23, r24, r25, r26, r27, true);
        return;
    L90:
        return;
    L91:
        return;
    }

    private int getChildHeightMeasureSpecInternal(int r4, FlexItem r5, int r6) {
        FlexContainer r02 = this.mFlexContainer;
        int r42 = r02.getChildHeightMeasureSpec(r4, (((r02.getPaddingTop() + this.mFlexContainer.getPaddingBottom()) + r5.getMarginTop()) + r5.getMarginBottom()) + r6, r5.getHeight());
        int r62 = View.MeasureSpec.getSize(r42);
        if (r62 <= r5.getMaxHeight()) goto L7;
        return View.MeasureSpec.makeMeasureSpec(r5.getMaxHeight(), View.MeasureSpec.getMode(r42));
    L7:
        if (r62 < r5.getMinHeight()) goto L9;
        return r42;
    L9:
        return View.MeasureSpec.makeMeasureSpec(r5.getMinHeight(), View.MeasureSpec.getMode(r42));
    }

    private int getChildWidthMeasureSpecInternal(int r4, FlexItem r5, int r6) {
        FlexContainer r02 = this.mFlexContainer;
        int r42 = r02.getChildWidthMeasureSpec(r4, (((r02.getPaddingLeft() + this.mFlexContainer.getPaddingRight()) + r5.getMarginLeft()) + r5.getMarginRight()) + r6, r5.getWidth());
        int r62 = View.MeasureSpec.getSize(r42);
        if (r62 <= r5.getMaxWidth()) goto L7;
        return View.MeasureSpec.makeMeasureSpec(r5.getMaxWidth(), View.MeasureSpec.getMode(r42));
    L7:
        if (r62 < r5.getMinWidth()) goto L9;
        return r42;
    L9:
        return View.MeasureSpec.makeMeasureSpec(r5.getMinWidth(), View.MeasureSpec.getMode(r42));
    }

    private int getFlexItemMarginEndCross(FlexItem r1, boolean r2) {
        if (r2 == false) goto L6;
        return r1.getMarginBottom();
    L6:
        return r1.getMarginRight();
    }

    private int getFlexItemMarginEndMain(FlexItem r1, boolean r2) {
        if (r2 == false) goto L6;
        return r1.getMarginRight();
    L6:
        return r1.getMarginBottom();
    }

    private int getFlexItemMarginStartCross(FlexItem r1, boolean r2) {
        if (r2 == false) goto L6;
        return r1.getMarginTop();
    L6:
        return r1.getMarginLeft();
    }

    private int getFlexItemMarginStartMain(FlexItem r1, boolean r2) {
        if (r2 == false) goto L6;
        return r1.getMarginLeft();
    L6:
        return r1.getMarginTop();
    }

    private int getFlexItemSizeCross(FlexItem r1, boolean r2) {
        if (r2 == false) goto L6;
        return r1.getHeight();
    L6:
        return r1.getWidth();
    }

    private int getFlexItemSizeMain(FlexItem r1, boolean r2) {
        if (r2 == false) goto L6;
        return r1.getWidth();
    L6:
        return r1.getHeight();
    }

    private int getPaddingEndCross(boolean r1) {
        if (r1 == false) goto L6;
        return this.mFlexContainer.getPaddingBottom();
    L6:
        return this.mFlexContainer.getPaddingEnd();
    }

    private int getPaddingEndMain(boolean r1) {
        if (r1 == false) goto L6;
        return this.mFlexContainer.getPaddingEnd();
    L6:
        return this.mFlexContainer.getPaddingBottom();
    }

    private int getPaddingStartCross(boolean r1) {
        if (r1 == false) goto L6;
        return this.mFlexContainer.getPaddingTop();
    L6:
        return this.mFlexContainer.getPaddingStart();
    }

    private int getPaddingStartMain(boolean r1) {
        if (r1 == false) goto L6;
        return this.mFlexContainer.getPaddingStart();
    L6:
        return this.mFlexContainer.getPaddingTop();
    }

    private int getViewMeasuredSizeCross(View r1, boolean r2) {
        if (r2 == false) goto L6;
        return r1.getMeasuredHeight();
    L6:
        return r1.getMeasuredWidth();
    }

    private int getViewMeasuredSizeMain(View r1, boolean r2) {
        if (r2 == false) goto L6;
        return r1.getMeasuredWidth();
    L6:
        return r1.getMeasuredHeight();
    }

    private boolean isLastFlexItem(int r2, int r3, FlexLine r4) {
        if (r2 == (r3 - 1)) goto L5;
        return false;
    L5:
        if (r4.getItemCountNotGone() == 0) goto L9;
        return true;
    L9:
        return false;
    }

    private boolean isWrapRequired(View r3, int r4, int r5, int r6, int r7, FlexItem r8, int r9, int r10, int r11) {
        if (this.mFlexContainer.getFlexWrap() != 0) goto L6;
        return false;
    L6:
        if (r8.isWrapBefore() == false) goto L8;
        return true;
    L8:
        if (r4 != 0) goto L10;
        return false;
    L10:
        int r42 = this.mFlexContainer.getMaxLine();
        if (r42 != (-1)) goto L13;
    L15:
        int r32 = this.mFlexContainer.getDecorationLengthMainAxis(r3, r9, r10);
        if (r32 <= 0) goto L19;
        r7 = r7 + r32;
    L19:
        if (r5 >= (r6 + r7)) goto L21;
        return true;
    L21:
        return false;
    L13:
        if (r42 > (r11 + 1)) goto L15;
        return false;
    }

    private void shrinkFlexItems(int r24, int r25, FlexLine r26, int r27, int r28, boolean r29) {
        int r1 = r26.mMainSize;
        float r2 = r26.mTotalFlexShrink;
        float r5 = 0.0f;
        if (r2 <= 0.0f) goto L83;
        if (r27 > r1) goto L86;
        float r6 = (r1 - r27) / r2;
        r26.mMainSize = r28 + r26.mDividerLengthInMainSize;
        if (r29 == true) goto L9;
        r26.mCrossSize = Integer.MIN_VALUE;
    L9:
        int r22 = 0;
        boolean r7 = false;
        int r8 = 0;
        float r9 = 0.0f;
    L11:
        if (r22 >= r26.mItemCount) goto L75;
        int r10 = r26.mFirstIndex + r22;
        View r11 = this.mFlexContainer.getReorderedFlexItemAt(r10);
        if (r11 != null) goto L15;
    L16:
        float r20 = r5;
        float r15 = r6;
    L73:
        r22 = r22 + 1;
        r6 = r15;
        r5 = r20;
        goto L11
    L15:
        if (r11.getVisibility() == 8) goto L16;
        FlexItem r12 = (FlexItem) r11.getLayoutParams();
        int r13 = this.mFlexContainer.getFlexDirection();
        r20 = r5;
        if (r13 == 0) goto L46;
        if (r13 == 1) goto L46;
        int r132 = r11.getMeasuredHeight();
        long[] r52 = this.mMeasuredSizeCache;
        if (r52 == null) goto L24;
        r132 = extractHigherInt(r52[r10]);
    L24:
        int r53 = r11.getMeasuredWidth();
        long[] r14 = this.mMeasuredSizeCache;
        if (r14 == null) goto L28;
        r53 = extractLowerInt(r14[r10]);
    L28:
        if (this.mChildrenFrozen[r10] == true) goto L45;
        if (r12.getFlexShrink() <= r20) goto L45;
        float r4 = r132 - (r12.getFlexShrink() * r6);
        if (r22 != (r26.mItemCount - 1)) goto L34;
        r4 = r4 + r9;
        r9 = r20;
    L34:
        int r54 = Math.round(r4);
        if (r54 >= r12.getMinHeight()) goto L37;
        r54 = r12.getMinHeight();
        this.mChildrenFrozen[r10] = true;
        r26.mTotalFlexShrink -= r12.getFlexShrink();
        r7 = true;
    L43:
        int r42 = getChildWidthMeasureSpecInternal(r24, r12, r26.mSumCrossSizeBefore);
        int r55 = View.MeasureSpec.makeMeasureSpec(r54, Ints.MAX_POWER_OF_TWO);
        r11.measure(r42, r55);
        int r133 = r11.getMeasuredWidth();
        int r152 = r11.getMeasuredHeight();
        updateMeasureCache(r10, r42, r55, r11);
        this.mFlexContainer.updateViewCache(r10, r11);
        r53 = r133;
        r132 = r152;
        goto L45
    L37:
        r9 = r9 + (r4 - r54);
        double r134 = r9;
        if (r134 <= 1.0d) goto L41;
        r54 = r54 + 1;
        r9 = r9 - 1.0f;
        goto L43
    L41:
        if (r134 >= (-1.0d)) goto L43;
        r54 = r54 - 1;
        r9 = r9 + 1.0f;
    L45:
        int r43 = Math.max(r8, ((r53 + r12.getMarginLeft()) + r12.getMarginRight()) + this.mFlexContainer.getDecorationLengthCrossAxis(r11));
        r26.mMainSize += (r132 + r12.getMarginTop()) + r12.getMarginBottom();
        r15 = r6;
    L72:
        r26.mCrossSize = Math.max(r26.mCrossSize, r43);
        r8 = r43;
    L46:
        int r44 = r11.getMeasuredWidth();
        long[] r56 = this.mMeasuredSizeCache;
        if (r56 == null) goto L49;
        r44 = extractLowerInt(r56[r10]);
    L49:
        int r57 = r11.getMeasuredHeight();
        long[] r135 = this.mMeasuredSizeCache;
        r15 = r6;
        if (r135 == null) goto L53;
        r57 = extractHigherInt(r135[r10]);
    L53:
        if (this.mChildrenFrozen[r10] == true) goto L71;
        if (r12.getFlexShrink() <= r20) goto L71;
        float r45 = r44 - (r15 * r12.getFlexShrink());
        if (r22 != (r26.mItemCount - 1)) goto L59;
        r45 = r45 + r9;
        r9 = r20;
    L59:
        int r58 = Math.round(r45);
        if (r58 >= r12.getMinWidth()) goto L62;
        int r59 = r12.getMinWidth();
        this.mChildrenFrozen[r10] = true;
        r26.mTotalFlexShrink -= r12.getFlexShrink();
        r7 = true;
    L69:
        int r46 = getChildHeightMeasureSpecInternal(r25, r12, r26.mSumCrossSizeBefore);
        int r510 = View.MeasureSpec.makeMeasureSpec(r59, Ints.MAX_POWER_OF_TWO);
        r11.measure(r510, r46);
        int r136 = r11.getMeasuredWidth();
        int r16 = r11.getMeasuredHeight();
        updateMeasureCache(r10, r510, r46, r11);
        this.mFlexContainer.updateViewCache(r10, r11);
        r44 = r136;
        r57 = r16;
        goto L71
    L62:
        r9 = r9 + (r45 - r58);
        double r47 = r9;
        if (r47 <= 1.0d) goto L66;
        r59 = r58 + 1;
        r9 = r9 - 1.0f;
        goto L69
    L66:
        if (r47 >= (-1.0d)) goto L68;
        r59 = r58 - 1;
        r9 = r9 + 1.0f;
        goto L69
    L68:
        r59 = r58;
    L71:
        int r511 = Math.max(r8, ((r57 + r12.getMarginTop()) + r12.getMarginBottom()) + this.mFlexContainer.getDecorationLengthCrossAxis(r11));
        r26.mMainSize += (r44 + r12.getMarginLeft()) + r12.getMarginRight();
        r43 = r511;
        goto L72
    L75:
        if (r7 == true) goto L77;
        return;
    L77:
        if (r1 == r26.mMainSize) goto L85;
        shrinkFlexItems(r24, r25, r26, r27, r28, true);
        return;
    L85:
        return;
    L86:
        return;
    }

    private int[] sortOrdersIntoReorderedIndices(int r4, List<Order> r5, SparseIntArray r6) {
        Collections.sort(r5);
        r6.clear();
        int[] r42 = new int[r4];
        Iterator<Order> r52 = r5.iterator();
        int r02 = 0;
    L4:
        if (r52.hasNext() == false) goto L6;
        Order r1 = r52.next();
        int r2 = r1.index;
        r42[r02] = r2;
        r6.append(r2, r1.order);
        r02 = r02 + 1;
        goto L4
    L6:
        return r42;
    }

    private void stretchViewHorizontally(View r4, int r5, int r6) {
        FlexItem r02 = (FlexItem) r4.getLayoutParams();
        int r52 = Math.min(Math.max(((r5 - r02.getMarginLeft()) - r02.getMarginRight()) - this.mFlexContainer.getDecorationLengthCrossAxis(r4), r02.getMinWidth()), r02.getMaxWidth());
        long[] r03 = this.mMeasuredSizeCache;
        if (r03 == null) goto L5;
        int r04 = extractHigherInt(r03[r6]);
    L6:
        int r05 = View.MeasureSpec.makeMeasureSpec(r04, Ints.MAX_POWER_OF_TWO);
        int r53 = View.MeasureSpec.makeMeasureSpec(r52, Ints.MAX_POWER_OF_TWO);
        r4.measure(r53, r05);
        updateMeasureCache(r6, r53, r05, r4);
        this.mFlexContainer.updateViewCache(r6, r4);
        return;
    L5:
        r04 = r4.getMeasuredHeight();
        goto L6
    }

    private void stretchViewVertically(View r4, int r5, int r6) {
        FlexItem r02 = (FlexItem) r4.getLayoutParams();
        int r52 = Math.min(Math.max(((r5 - r02.getMarginTop()) - r02.getMarginBottom()) - this.mFlexContainer.getDecorationLengthCrossAxis(r4), r02.getMinHeight()), r02.getMaxHeight());
        long[] r03 = this.mMeasuredSizeCache;
        if (r03 == null) goto L5;
        int r04 = extractLowerInt(r03[r6]);
    L6:
        int r05 = View.MeasureSpec.makeMeasureSpec(r04, Ints.MAX_POWER_OF_TWO);
        int r53 = View.MeasureSpec.makeMeasureSpec(r52, Ints.MAX_POWER_OF_TWO);
        r4.measure(r05, r53);
        updateMeasureCache(r6, r05, r53, r4);
        this.mFlexContainer.updateViewCache(r6, r4);
        return;
    L5:
        r04 = r4.getMeasuredWidth();
        goto L6
    }

    private void updateMeasureCache(int r2, int r3, int r4, View r5) {
        long[] r02 = this.mMeasureSpecCache;
        if (r02 == null) goto L5;
        r02[r2] = makeCombinedLong(r3, r4);
    L5:
        long[] r32 = this.mMeasuredSizeCache;
        if (r32 == null) goto L9;
        r32[r2] = makeCombinedLong(r5.getMeasuredWidth(), r5.getMeasuredHeight());
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void calculateFlexLines(FlexLinesResult r33, int r34, int r35, int r36, int r37, int r38, List<FlexLine> r39) {
        int r11 = r34;
        boolean r14 = this.mFlexContainer.isMainAxisDirectionHorizontal();
        int r2 = View.MeasureSpec.getMode(r11);
        int r3 = View.MeasureSpec.getSize(r11);
        if (r39 != null) goto L5;
        List<FlexLine> r15 = new ArrayList();
    L6:
        r33.mFlexLines = r15;
        if (r38 != (-1)) goto L9;
        boolean r6 = true;
    L10:
        int r7 = getPaddingStartMain(r14);
        int r8 = getPaddingEndMain(r14);
        int r16 = getPaddingStartCross(r14);
        int r17 = getPaddingEndCross(r14);
        FlexLine r9 = new FlexLine();
        int r1 = r37;
        r9.mFirstIndex = r1;
        int r72 = r7 + r8;
        r9.mMainSize = r72;
        int r82 = this.mFlexContainer.getFlexItemCount();
        boolean r19 = r6;
        FlexLine r62 = r9;
        int r22 = Integer.MIN_VALUE;
        int r92 = 0;
        int r20 = 0;
        int r21 = 0;
    L11:
        if (r1 >= r82) goto L94;
        View r5 = this.mFlexContainer.getReorderedFlexItemAt(r1);
        if (r5 == null) goto L15;
        int r25 = r72;
        if (r5.getVisibility() != 8) goto L25;
        r62.mGoneItemCount++;
        r62.mItemCount++;
        if (isLastFlexItem(r1, r82, r62) == false) goto L23;
        addFlexLine(r15, r62, r1, r92);
    L23:
        int r73 = r1;
        int r27 = r2;
        int r12 = r82;
        int r112 = r92;
        int r52 = r25;
        FlexLine r93 = r62;
    L93:
        r82 = r12;
        r1 = r73 + 1;
        r72 = r52;
        r62 = r93;
        r92 = r112;
        r2 = r27;
        r11 = r34;
        goto L11
    L25:
        if ((r5 instanceof CompoundButton) == false) goto L27;
        evaluateMinimumSizeForCompoundButton((CompoundButton) r5);
    L27:
        FlexItem r4 = (FlexItem) r5.getLayoutParams();
        int r26 = r82;
        if (r4.getAlignSelf() != 4) goto L30;
        r62.mIndicesAlignSelfStretch.add(Integer.valueOf(r1));
    L30:
        int r74 = getFlexItemSizeMain(r4, r14);
        if (r4.getFlexBasisPercent() != (-1.0f)) goto L33;
    L35:
        if (r14 == false) goto L37;
        r27 = r2;
        int r23 = this.mFlexContainer.getChildWidthMeasureSpec(r11, (r25 + getFlexItemMarginStartMain(r4, true)) + getFlexItemMarginEndMain(r4, true), r74);
        int r24 = r3;
        int r28 = r92;
        int r75 = this.mFlexContainer.getChildHeightMeasureSpec(r35, (((r16 + r17) + getFlexItemMarginStartCross(r4, true)) + getFlexItemMarginEndCross(r4, true)) + r92, getFlexItemSizeCross(r4, true));
        r5.measure(r23, r75);
        updateMeasureCache(r1, r23, r75, r5);
        int r94 = 0;
    L38:
        this.mFlexContainer.updateViewCache(r1, r5);
        checkSizeConstraints(r5, r1);
        r20 = View.combineMeasuredStates(r20, r5.getMeasuredState());
        int r232 = r94;
        r73 = r1;
        int r31 = r23;
        FlexLine r372 = r62;
        int r83 = r21;
        r112 = r28;
        r3 = r24;
        if (isWrapRequired(r5, r27, r3, r62.mMainSize, (getViewMeasuredSizeMain(r5, r14) + getFlexItemMarginStartMain(r4, r14)) + getFlexItemMarginEndMain(r4, r14), r4, r73, r83, r15.size()) == true) goto L41;
        r93 = r372;
        r52 = r25;
        r93.mItemCount++;
        int r29 = r83 + 1;
        int r42 = r22;
    L57:
        boolean r84 = r93.mAnyItemsHaveFlexGrow;
        if (r4.getFlexGrow() == 0.0f) goto L60;
        int r212 = 1;
    L61:
        r93.mAnyItemsHaveFlexGrow = (r84 ? 1 : 0) | r212;
        boolean r85 = r93.mAnyItemsHaveFlexShrink;
        if (r4.getFlexShrink() == 0.0f) goto L64;
        int r213 = 1;
    L65:
        r93.mAnyItemsHaveFlexShrink = (r85 ? 1 : 0) | r213;
        int[] r86 = this.mIndexToFlexLine;
        if (r86 == null) goto L68;
        r86[r73] = r15.size();
    L68:
        r93.mMainSize += (getViewMeasuredSizeMain(r5, r14) + getFlexItemMarginStartMain(r4, r14)) + getFlexItemMarginEndMain(r4, r14);
        r93.mTotalFlexGrow += r4.getFlexGrow();
        r93.mTotalFlexShrink += r4.getFlexShrink();
        this.mFlexContainer.onNewFlexItemAdded(r5, r73, r29, r93);
        int r43 = Math.max(r42, ((getViewMeasuredSizeCross(r5, r14) + getFlexItemMarginStartCross(r4, r14)) + getFlexItemMarginEndCross(r4, r14)) + this.mFlexContainer.getDecorationLengthCrossAxis(r5));
        r93.mCrossSize = Math.max(r93.mCrossSize, r43);
        if (r14 == true) goto L71;
    L73:
        r12 = r26;
        if (isLastFlexItem(r73, r12, r93) == false) goto L79;
        addFlexLine(r15, r93, r73, r112);
        r112 = r112 + r93.mCrossSize;
    L79:
        if (r38 == (-1)) goto L89;
        if (r15.size() <= 0) goto L89;
        if (r15.get(r15.size() - 1).mLastIndex < r38) goto L89;
        if (r73 < r38) goto L89;
        if (r19 == true) goto L89;
        r112 = -r93.getCrossSize();
        r19 = true;
    L89:
        if (r112 <= r36) goto L92;
        if (r19 == false) goto L92;
        FlexLinesResult r10 = r33;
        int r76 = r20;
    L95:
        r10.mChildState = r76;
        return;
    L92:
        r21 = r29;
        r22 = r43;
        goto L93
    L71:
        if (this.mFlexContainer.getFlexWrap() == 2) goto L74;
        r93.mMaxBaseline = Math.max(r93.mMaxBaseline, r5.getBaseline() + r4.getMarginTop());
        goto L73
    L74:
        r93.mMaxBaseline = Math.max(r93.mMaxBaseline, (r5.getMeasuredHeight() - r5.getBaseline()) + r4.getMarginBottom());
        goto L73
    L64:
        r213 = r232;
        goto L65
    L60:
        r212 = r232;
        goto L61
    L41:
        if (r372.getItemCountNotGone() <= 0) goto L47;
        if (r73 <= 0) goto L45;
        int r53 = r73 - 1;
    L46:
        addFlexLine(r15, r372, r53, r112);
        int r95 = r112 + r372.mCrossSize;
    L48:
        if (r14 == false) goto L53;
        if (r4.getHeight() != (-1)) goto L55;
        FlexContainer r210 = this.mFlexContainer;
        r5.measure(r31, r210.getChildHeightMeasureSpec(r35, (((r210.getPaddingTop() + this.mFlexContainer.getPaddingBottom()) + r4.getMarginTop()) + r4.getMarginBottom()) + r95, r4.getHeight()));
        checkSizeConstraints(r5, r73);
    L55:
        FlexLine r211 = new FlexLine();
        r211.mItemCount = 1;
        r52 = r25;
        r211.mMainSize = r52;
        r211.mFirstIndex = r73;
        r112 = r95;
        r42 = Integer.MIN_VALUE;
        r93 = r211;
        r29 = r232;
        goto L57
    L53:
        if (r4.getWidth() != (-1)) goto L55;
        FlexContainer r214 = this.mFlexContainer;
        r5.measure(r214.getChildWidthMeasureSpec(r35, (((r214.getPaddingLeft() + this.mFlexContainer.getPaddingRight()) + r4.getMarginLeft()) + r4.getMarginRight()) + r95, r4.getWidth()), r31);
        checkSizeConstraints(r5, r73);
        goto L55
    L45:
        r53 = r232;
        goto L46
    L47:
        r95 = r112;
        goto L48
    L37:
        r24 = r3;
        r27 = r2;
        r28 = r92;
        r94 = 0;
        int r215 = this.mFlexContainer.getChildWidthMeasureSpec(r35, (((r16 + r17) + getFlexItemMarginStartCross(r4, false)) + getFlexItemMarginEndCross(r4, false)) + r28, getFlexItemSizeCross(r4, false));
        int r32 = this.mFlexContainer.getChildHeightMeasureSpec(r11, (r25 + getFlexItemMarginStartMain(r4, false)) + getFlexItemMarginEndMain(r4, false), r74);
        r5.measure(r215, r32);
        updateMeasureCache(r1, r215, r32, r5);
        r23 = r32;
        goto L38
    L33:
        if (r2 != 1073741824) goto L35;
        r74 = Math.round(r3 * r4.getFlexBasisPercent());
        goto L35
    L15:
        if (isLastFlexItem(r1, r82, r62) == false) goto L17;
        addFlexLine(r15, r62, r1, r92);
    L17:
        r25 = r72;
        goto L23
    L94:
        r76 = r20;
        r10 = r33;
        goto L95
    L9:
        r6 = false;
        goto L10
    L5:
        r15 = r39;
        goto L6
    }

    public void calculateHorizontalFlexLines(FlexLinesResult r9, int r10, int r11) {
        calculateFlexLines(r9, r10, r11, Integer.MAX_VALUE, 0, -1, null);
    }

    public void calculateHorizontalFlexLinesToIndex(FlexLinesResult r9, int r10, int r11, int r12, int r13, List<FlexLine> r14) {
        calculateFlexLines(r9, r10, r11, r12, 0, r13, r14);
    }

    public void calculateVerticalFlexLines(FlexLinesResult r9, int r10, int r11) {
        calculateFlexLines(r9, r11, r10, Integer.MAX_VALUE, 0, -1, null);
    }

    public void calculateVerticalFlexLinesToIndex(FlexLinesResult r9, int r10, int r11, int r12, int r13, List<FlexLine> r14) {
        calculateFlexLines(r9, r11, r10, r12, 0, r13, r14);
    }

    public void clearFlexLines(List<FlexLine> r4, int r5) {
        int r02 = this.mIndexToFlexLine[r5];
        if (r02 != (-1)) goto L6;
        r02 = 0;
    L6:
        if (r4.size() <= r02) goto L8;
        r4.subList(r02, r4.size()).clear();
    L8:
        int[] r42 = this.mIndexToFlexLine;
        int r03 = r42.length - 1;
        if (r5 <= r03) goto L11;
        Arrays.fill(r42, -1);
    L12:
        long[] r43 = this.mMeasureSpecCache;
        int r04 = r43.length - 1;
        if (r5 <= r04) goto L16;
        Arrays.fill(r43, 0);
        return;
    L16:
        Arrays.fill(r43, r5, r04, 0);
        return;
    L11:
        Arrays.fill(r42, r5, r03, -1);
        goto L12
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] createReorderedIndices(View r5, int r6, ViewGroup.LayoutParams r7, SparseIntArray r8) {
        int r02 = this.mFlexContainer.getFlexItemCount();
        List<Order> r1 = createOrders(r02);
        Order r2 = new Order(null);
        if (r5 != null) goto L5;
    L7:
        r2.order = 1;
    L9:
        if (r6 == (-1)) goto L18;
        if (r6 == r02) goto L18;
        if (r6 >= this.mFlexContainer.getFlexItemCount()) goto L17;
        r2.index = r6;
    L15:
        if (r6 >= r02) goto L19;
        r1.get(r6).index++;
        r6 = r6 + 1;
    L19:
        r1.add(r2);
        return sortOrdersIntoReorderedIndices(r02 + 1, r1, r8);
    L17:
        r2.index = r02;
    L18:
        r2.index = r02;
        goto L19
    L5:
        if ((r7 instanceof FlexItem) == false) goto L7;
        r2.order = ((FlexItem) r7).getOrder();
        goto L9
    }

    public void determineCrossSize(int r13, int r14, int r15) {
        int r02 = this.mFlexContainer.getFlexDirection();
        if (r02 == 0) goto L11;
        if (r02 == 1) goto L11;
        if (r02 == 2) goto L10;
        if (r02 == 3) goto L10;
        throw new IllegalArgumentException("Invalid flex direction: " + r02);
    L10:
        int r142 = View.MeasureSpec.getMode(r13);
        int r132 = View.MeasureSpec.getSize(r13);
    L12:
        List<FlexLine> r03 = this.mFlexContainer.getFlexLinesInternal();
        if (r142 != 1073741824) goto L85;
        int r143 = this.mFlexContainer.getSumOfCrossSize() + r15;
        int r5 = 0;
        if (r03.size() != 1) goto L19;
        r03.get(0).mCrossSize = r132 - r15;
        return;
    L19:
        if (r03.size() < 2) goto L86;
        int r152 = this.mFlexContainer.getAlignContent();
        if (r152 == 1) goto L75;
        if (r152 != 2) goto L24;
        this.mFlexContainer.setFlexLines(constructFlexLinesForAlignContentCenter(r03, r132, r143));
        return;
    L24:
        if (r152 != 3) goto L26;
        if (r143 >= r132) goto L89;
        float r133 = (r132 - r143) / (r03.size() - 1);
        ArrayList r144 = new ArrayList();
        int r153 = r03.size();
        float r1 = 0.0f;
    L56:
        if (r5 >= r153) goto L71;
        r144.add(r03.get(r5));
        if (r5 == (r03.size() - 1)) goto L70;
        FlexLine r8 = new FlexLine();
        if (r5 != (r03.size() - 2)) goto L62;
        r8.mCrossSize = Math.round(r1 + r133);
        r1 = 0.0f;
    L63:
        int r9 = r8.mCrossSize;
        r1 = r1 + (r133 - r9);
        if (r1 <= 1.0f) goto L67;
        r8.mCrossSize = r9 + 1;
        r1 = r1 - 1.0f;
    L69:
        r144.add(r8);
        goto L70
    L67:
        if (r1 >= (-1.0f)) goto L69;
        r8.mCrossSize = r9 - 1;
        r1 = r1 + 1.0f;
        goto L69
    L62:
        r8.mCrossSize = Math.round(r133);
    L70:
        r5 = r5 + 1;
        goto L56
    L71:
        this.mFlexContainer.setFlexLines(r144);
        return;
    L89:
        return;
    L26:
        if (r152 != 4) goto L28;
        if (r143 < r132) goto L47;
        this.mFlexContainer.setFlexLines(constructFlexLinesForAlignContentCenter(r03, r132, r143));
        return;
    L47:
        int r134 = (r132 - r143) / (r03.size() * 2);
        ArrayList r145 = new ArrayList();
        FlexLine r154 = new FlexLine();
        r154.mCrossSize = r134;
        Iterator<FlexLine> r135 = r03.iterator();
    L49:
        if (r135.hasNext() == false) goto L51;
        FlexLine r04 = r135.next();
        r145.add(r154);
        r145.add(r04);
        r145.add(r154);
        goto L49
    L51:
        this.mFlexContainer.setFlexLines(r145);
        return;
    L28:
        if (r152 != 5) goto L87;
        if (r143 >= r132) goto L88;
        float r136 = (r132 - r143) / r03.size();
        int r146 = r03.size();
        float r155 = 0.0f;
    L33:
        if (r5 >= r146) goto L90;
        FlexLine r12 = r03.get(r5);
        float r2 = r12.mCrossSize + r136;
        if (r5 != (r03.size() - 1)) goto L37;
        r2 = r2 + r155;
        r155 = 0.0f;
    L37:
        int r82 = Math.round(r2);
        r155 = r155 + (r2 - r82);
        if (r155 <= 1.0f) goto L41;
        r82 = r82 + 1;
        r155 = r155 - 1.0f;
    L43:
        r12.mCrossSize = r82;
        r5 = r5 + 1;
        goto L33
    L41:
        if (r155 >= (-1.0f)) goto L43;
        r82 = r82 - 1;
        r155 = r155 + 1.0f;
        goto L43
    L90:
        return;
    L88:
        return;
    L87:
        return;
    L75:
        int r137 = r132 - r143;
        FlexLine r147 = new FlexLine();
        r147.mCrossSize = r137;
        r03.add(0, r147);
        return;
    L86:
        return;
    L85:
        return;
    L11:
        int r138 = View.MeasureSpec.getMode(r14);
        int r148 = View.MeasureSpec.getSize(r14);
        r142 = r138;
        r132 = r148;
        goto L12
    }

    public void determineMainSize(int r2, int r3) {
        determineMainSize(r2, r3, 0);
    }

    public void ensureIndexToFlexLine(int r3) {
        int[] r02 = this.mIndexToFlexLine;
        if (r02 != null) goto L7;
        this.mIndexToFlexLine = new int[Math.max(r3, 10)];
        return;
    L7:
        if (r02.length >= r3) goto L10;
        int r32 = Math.max(r02.length * 2, r3);
        this.mIndexToFlexLine = Arrays.copyOf(this.mIndexToFlexLine, r32);
        return;
    }

    public void ensureMeasureSpecCache(int r3) {
        long[] r02 = this.mMeasureSpecCache;
        if (r02 != null) goto L7;
        this.mMeasureSpecCache = new long[Math.max(r3, 10)];
        return;
    L7:
        if (r02.length >= r3) goto L10;
        int r32 = Math.max(r02.length * 2, r3);
        this.mMeasureSpecCache = Arrays.copyOf(this.mMeasureSpecCache, r32);
        return;
    }

    public void ensureMeasuredSizeCache(int r3) {
        long[] r02 = this.mMeasuredSizeCache;
        if (r02 != null) goto L7;
        this.mMeasuredSizeCache = new long[Math.max(r3, 10)];
        return;
    L7:
        if (r02.length >= r3) goto L10;
        int r32 = Math.max(r02.length * 2, r3);
        this.mMeasuredSizeCache = Arrays.copyOf(this.mMeasuredSizeCache, r32);
        return;
    }

    public int extractHigherInt(long r2) {
        return (int) (r2 >> 32);
    }

    public int extractLowerInt(long r1) {
        return (int) r1;
    }

    public boolean isOrderChangedFromLastMeasurement(SparseIntArray r7) {
        int r02 = this.mFlexContainer.getFlexItemCount();
        if (r7.size() == r02) goto L5;
        return true;
    L5:
        int r3 = 0;
    L6:
        if (r3 >= r02) goto L14;
        View r4 = this.mFlexContainer.getFlexItemAt(r3);
        if (r4 == null) goto L13;
        if (((FlexItem) r4.getLayoutParams()).getOrder() == r7.get(r3)) goto L13;
        return true;
    L13:
        r3 = r3 + 1;
        goto L6
    L14:
        return false;
    }

    public void layoutSingleChildHorizontal(View r6, FlexLine r7, int r8, int r9, int r10, int r11) {
        FlexItem r02 = (FlexItem) r6.getLayoutParams();
        int r1 = this.mFlexContainer.getAlignItems();
        if (r02.getAlignSelf() == (-1)) goto L5;
        r1 = r02.getAlignSelf();
    L5:
        int r2 = r7.mCrossSize;
        if (r1 == 0) goto L34;
        if (r1 == 1) goto L28;
        if (r1 != 2) goto L11;
        int r22 = (((r2 - r6.getMeasuredHeight()) + r02.getMarginTop()) - r02.getMarginBottom()) / 2;
        if (this.mFlexContainer.getFlexWrap() == 2) goto L25;
        int r92 = r9 + r22;
        r6.layout(r8, r92, r10, r6.getMeasuredHeight() + r92);
        return;
    L25:
        int r93 = r9 - r22;
        r6.layout(r8, r93, r10, r6.getMeasuredHeight() + r93);
        return;
    L11:
        if (r1 == 3) goto L16;
        if (r1 == 4) goto L34;
        return;
    L16:
        if (this.mFlexContainer.getFlexWrap() == 2) goto L19;
        int r72 = Math.max(r7.mMaxBaseline - r6.getBaseline(), r02.getMarginTop());
        r6.layout(r8, r9 + r72, r10, r11 + r72);
        return;
    L19:
        int r73 = Math.max((r7.mMaxBaseline - r6.getMeasuredHeight()) + r6.getBaseline(), r02.getMarginBottom());
        r6.layout(r8, r9 - r73, r10, r11 - r73);
        return;
    L28:
        if (this.mFlexContainer.getFlexWrap() == 2) goto L31;
        int r94 = r9 + r2;
        r6.layout(r8, (r94 - r6.getMeasuredHeight()) - r02.getMarginBottom(), r10, r94 - r02.getMarginBottom());
        return;
    L31:
        r6.layout(r8, ((r9 - r2) + r6.getMeasuredHeight()) + r02.getMarginTop(), r10, ((r11 - r2) + r6.getMeasuredHeight()) + r02.getMarginTop());
        return;
    L34:
        if (this.mFlexContainer.getFlexWrap() == 2) goto L37;
        r6.layout(r8, r9 + r02.getMarginTop(), r10, r11 + r02.getMarginTop());
        return;
    L37:
        r6.layout(r8, r9 - r02.getMarginBottom(), r10, r11 - r02.getMarginBottom());
    }

    public void layoutSingleChildVertical(View r5, FlexLine r6, boolean r7, int r8, int r9, int r10, int r11) {
        FlexItem r02 = (FlexItem) r5.getLayoutParams();
        int r1 = this.mFlexContainer.getAlignItems();
        if (r02.getAlignSelf() == (-1)) goto L5;
        r1 = r02.getAlignSelf();
    L5:
        int r62 = r6.mCrossSize;
        if (r1 != 0) goto L8;
    L27:
        if (r7 == true) goto L30;
        r5.layout(r8 + r02.getMarginLeft(), r9, r10 + r02.getMarginLeft(), r11);
        return;
    L30:
        r5.layout(r8 - r02.getMarginRight(), r9, r10 - r02.getMarginRight(), r11);
        return;
    L8:
        if (r1 != 1) goto L10;
        if (r7 == true) goto L25;
        r5.layout(((r8 + r62) - r5.getMeasuredWidth()) - r02.getMarginRight(), r9, ((r10 + r62) - r5.getMeasuredWidth()) - r02.getMarginRight(), r11);
        return;
    L25:
        r5.layout(((r8 - r62) + r5.getMeasuredWidth()) + r02.getMarginLeft(), r9, ((r10 - r62) + r5.getMeasuredWidth()) + r02.getMarginLeft(), r11);
        return;
    L10:
        if (r1 != 2) goto L12;
        ViewGroup.MarginLayoutParams r03 = (ViewGroup.MarginLayoutParams) r5.getLayoutParams();
        int r63 = (((r62 - r5.getMeasuredWidth()) + AbstractC3903w.b(r03)) - AbstractC3903w.a(r03)) / 2;
        if (r7 == true) goto L20;
        r5.layout(r8 + r63, r9, r10 + r63, r11);
        return;
    L20:
        r5.layout(r8 - r63, r9, r10 - r63, r11);
        return;
    L12:
        if (r1 == 3) goto L27;
        if (r1 == 4) goto L27;
    }

    public long makeCombinedLong(int r5, int r6) {
        return (r5 & MEASURE_SPEC_WIDTH_MASK) | (r6 << 32);
    }

    public void stretchViews() {
        stretchViews(0);
    }

    public void calculateHorizontalFlexLines(FlexLinesResult r9, int r10, int r11, int r12, int r13, List<FlexLine> r14) {
        calculateFlexLines(r9, r10, r11, r12, r13, -1, r14);
    }

    public void calculateVerticalFlexLines(FlexLinesResult r9, int r10, int r11, int r12, int r13, List<FlexLine> r14) {
        calculateFlexLines(r9, r11, r10, r12, r13, -1, r14);
    }

    public void determineMainSize(int r10, int r11, int r12) {
        ensureChildrenFrozen(this.mFlexContainer.getFlexItemCount());
        if (r12 >= this.mFlexContainer.getFlexItemCount()) goto L44;
        int r02 = this.mFlexContainer.getFlexDirection();
        int r1 = this.mFlexContainer.getFlexDirection();
        if (r1 != 0) goto L8;
    L22:
        int r03 = View.MeasureSpec.getMode(r10);
        int r13 = View.MeasureSpec.getSize(r10);
        int r3 = this.mFlexContainer.getLargestMainSize();
        if (r03 == 1073741824) goto L26;
        r13 = Math.min(r3, r13);
    L26:
        int r04 = this.mFlexContainer.getPaddingLeft();
        int r2 = this.mFlexContainer.getPaddingRight();
    L21:
        int r05 = r04 + r2;
        int r6 = r13;
        int[] r06 = this.mIndexToFlexLine;
        if (r06 == null) goto L30;
        int r122 = r06[r12];
    L31:
        List<FlexLine> r07 = this.mFlexContainer.getFlexLinesInternal();
        int r14 = r07.size();
    L32:
        if (r122 >= r14) goto L50;
        FlexLine r5 = r07.get(r122);
        int r22 = r5.mMainSize;
        if (r22 < r6) goto L36;
    L38:
        int r32 = r10;
        int r4 = r11;
        if (r22 <= r6) goto L43;
        if (r5.mAnyItemsHaveFlexShrink == false) goto L43;
        shrinkFlexItems(r32, r4, r5, r6, r05, false);
    L43:
        r122 = r122 + 1;
        r10 = r32;
        r11 = r4;
        goto L32
    L36:
        if (r5.mAnyItemsHaveFlexGrow == false) goto L38;
        r32 = r10;
        r4 = r11;
        expandFlexItems(r32, r4, r5, r6, r05, false);
        goto L43
    L50:
        return;
    L30:
        r122 = 0;
        goto L31
    L8:
        if (r1 == 1) goto L22;
        if (r1 != 2) goto L12;
    L16:
        int r08 = View.MeasureSpec.getMode(r11);
        r13 = View.MeasureSpec.getSize(r11);
        if (r08 == 1073741824) goto L20;
        r13 = this.mFlexContainer.getLargestMainSize();
    L20:
        r04 = this.mFlexContainer.getPaddingTop();
        r2 = this.mFlexContainer.getPaddingBottom();
        goto L21
    L12:
        if (r1 == 3) goto L16;
        throw new IllegalArgumentException("Invalid flex direction: " + r02);
    }

    public void stretchViews(int r17) {
        if (r17 >= this.mFlexContainer.getFlexItemCount()) goto L58;
        int r2 = this.mFlexContainer.getFlexDirection();
        if (this.mFlexContainer.getAlignItems() != 4) goto L41;
        int[] r3 = this.mIndexToFlexLine;
        if (r3 == null) goto L10;
        int r1 = r3[r17];
    L11:
        List<FlexLine> r32 = this.mFlexContainer.getFlexLinesInternal();
        int r10 = r32.size();
    L12:
        if (r1 >= r10) goto L77;
        FlexLine r11 = r32.get(r1);
        int r12 = r11.mItemCount;
        int r13 = 0;
    L14:
        if (r13 >= r12) goto L40;
        int r14 = r11.mFirstIndex + r13;
        if (r13 >= this.mFlexContainer.getFlexItemCount()) goto L39;
        View r15 = this.mFlexContainer.getReorderedFlexItemAt(r14);
        if (r15 == null) goto L39;
        if (r15.getVisibility() == 8) goto L39;
        FlexItem r5 = (FlexItem) r15.getLayoutParams();
        if (r5.getAlignSelf() != (-1)) goto L26;
    L28:
        if (r2 == 0) goto L38;
        if (r2 == 1) goto L38;
        if (r2 != 2) goto L33;
    L37:
        stretchViewHorizontally(r15, r11.mCrossSize, r14);
        goto L39
    L33:
        if (r2 == 3) goto L37;
        throw new IllegalArgumentException("Invalid flex direction: " + r2);
    L38:
        stretchViewVertically(r15, r11.mCrossSize, r14);
        goto L39
    L26:
        if (r5.getAlignSelf() == 4) goto L28;
    L39:
        r13 = r13 + 1;
        goto L14
    L40:
        r1 = r1 + 1;
        goto L12
    L77:
        return;
    L10:
        r1 = 0;
        goto L11
    L41:
        Iterator<FlexLine> r16 = this.mFlexContainer.getFlexLinesInternal().iterator();
    L43:
        if (r16.hasNext() == false) goto L78;
        FlexLine r33 = r16.next();
        Iterator<Integer> r52 = r33.mIndicesAlignSelfStretch.iterator();
    L46:
        if (r52.hasNext() == false) goto L43;
        Integer r6 = r52.next();
        View r7 = this.mFlexContainer.getReorderedFlexItemAt(r6.intValue());
        if (r2 == 0) goto L57;
        if (r2 == 1) goto L57;
        if (r2 == 2) goto L56;
        if (r2 == 3) goto L56;
        throw new IllegalArgumentException("Invalid flex direction: " + r2);
    L56:
        stretchViewHorizontally(r7, r33.mCrossSize, r6.intValue());
    L57:
        stretchViewVertically(r7, r33.mCrossSize, r6.intValue());
        goto L46
    L78:
        return;
    }

    public int[] createReorderedIndices(SparseIntArray r3) {
        int r02 = this.mFlexContainer.getFlexItemCount();
        return sortOrdersIntoReorderedIndices(r02, createOrders(r02), r3);
    }
}
