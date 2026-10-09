package com.clevertap.android.sdk.inbox;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.common.primitives.Ints;

/* loaded from: classes4.dex */
public class CTCarouselViewPager extends ViewPager {
    public CTCarouselViewPager(Context r1) {
        super(r1);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int r6, int r7) {
        int r1 = 0;
        int r2 = 0;
    L4:
        if (r1 >= getChildCount()) goto L9;
        View r3 = getChildAt(r1);
        r3.measure(r6, View.MeasureSpec.makeMeasureSpec(0, 0));
        int r32 = r3.getMeasuredHeight();
        if (r32 <= r2) goto L8;
        r2 = r32;
    L8:
        r1 = r1 + 1;
        goto L4
    L9:
        if (r2 == 0) goto L11;
        r7 = View.MeasureSpec.makeMeasureSpec(r2, Ints.MAX_POWER_OF_TWO);
    L11:
        super.onMeasure(r6, r7);
    }

    public CTCarouselViewPager(Context r1, AttributeSet r2) {
        super(r1, r2);
    }
}
