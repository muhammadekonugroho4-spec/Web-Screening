package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes5.dex */
public class NavigationRailFrameLayout extends FrameLayout {
    int paddingTop;
    boolean scrollingEnabled;

    public NavigationRailFrameLayout(Context r1) {
        super(r1);
        this.paddingTop = 0;
        this.scrollingEnabled = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        super.onLayout(r5, r6, r7, r8, r9);
        int r62 = getChildCount();
        int r72 = this.paddingTop;
        int r82 = 0;
    L3:
        if (r82 >= r62) goto L5;
        View r92 = getChildAt(r82);
        FrameLayout.LayoutParams r02 = (FrameLayout.LayoutParams) r92.getLayoutParams();
        int r73 = Math.max(r72, r92.getTop()) + r02.topMargin;
        r92.layout(r92.getLeft(), r73, r92.getRight(), r92.getMeasuredHeight() + r73);
        r72 = r73 + (r92.getMeasuredHeight() + r02.bottomMargin);
        r82 = r82 + 1;
        goto L3
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int r6, int r7) {
        super.onMeasure(r6, r7);
        int r02 = getChildCount();
        int r1 = 0;
        View r2 = getChildAt(0);
        int r3 = View.MeasureSpec.getSize(r7);
        if (r02 <= 1) goto L7;
        View r03 = getChildAt(0);
        measureChild(r03, r6, r7);
        FrameLayout.LayoutParams r12 = (FrameLayout.LayoutParams) r03.getLayoutParams();
        int r04 = r03.getMeasuredHeight() + r12.bottomMargin;
        r1 = r12.topMargin + r04;
        int r05 = (r3 - r1) - this.paddingTop;
        r2 = getChildAt(1);
        if (this.scrollingEnabled == true) goto L7;
        r7 = View.MeasureSpec.makeMeasureSpec(r05, Integer.MIN_VALUE);
    L7:
        FrameLayout.LayoutParams r06 = (FrameLayout.LayoutParams) r2.getLayoutParams();
        measureChild(r2, r6, r7);
        int r62 = (r2.getMeasuredHeight() + r06.bottomMargin) + r06.topMargin;
        int r63 = Math.max(r3, (this.paddingTop + r1) + r62);
        setMeasuredDimension(getMeasuredWidth(), r63);
    }

    public void setPaddingTop(int r1) {
        this.paddingTop = r1;
    }

    public void setScrollingEnabled(boolean r1) {
        this.scrollingEnabled = r1;
    }
}
