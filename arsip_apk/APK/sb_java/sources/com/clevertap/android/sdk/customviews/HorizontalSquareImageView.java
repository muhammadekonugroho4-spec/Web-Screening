package com.clevertap.android.sdk.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes4.dex */
public class HorizontalSquareImageView extends ImageView {
    public HorizontalSquareImageView(Context r1) {
        super(r1);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int r1, int r2) {
        super.onMeasure(r1, r2);
        int r12 = getMeasuredHeight();
        setMeasuredDimension(r12, r12);
    }

    public HorizontalSquareImageView(Context r1, AttributeSet r2) {
        super(r1, r2);
    }

    public HorizontalSquareImageView(Context r1, AttributeSet r2, int r3) {
        super(r1, r2, r3);
    }
}
