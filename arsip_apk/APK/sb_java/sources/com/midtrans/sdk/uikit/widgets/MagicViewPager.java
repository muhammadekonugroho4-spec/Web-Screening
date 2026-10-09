package com.midtrans.sdk.uikit.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.common.primitives.Ints;

/* loaded from: classes6.dex */
public class MagicViewPager extends ViewPager {

    /* renamed from: B0, reason: collision with root package name */
    public View f43422B0;

    public MagicViewPager(Context r1) {
        super(r1);
    }

    public void S(View r1) {
        this.f43422B0 = r1;
        requestLayout();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int r3, int r4) {
        View r02 = this.f43422B0;
        if (r02 != null) goto L6;
        super.onMeasure(r3, r4);
        return;
    L6:
        int r42 = 0;
        r02.measure(r3, View.MeasureSpec.makeMeasureSpec(0, 0));
        int r03 = this.f43422B0.getMeasuredHeight();
        if (r03 <= 0) goto L9;
        r42 = r03;
    L9:
        super.onMeasure(r3, View.MeasureSpec.makeMeasureSpec(r42, Ints.MAX_POWER_OF_TWO));
    }

    public MagicViewPager(Context r1, AttributeSet r2) {
        super(r1, r2);
    }
}
