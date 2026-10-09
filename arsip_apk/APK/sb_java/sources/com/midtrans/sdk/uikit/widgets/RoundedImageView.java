package com.midtrans.sdk.uikit.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* loaded from: classes6.dex */
public class RoundedImageView extends ImageButton {
    public RoundedImageView(Context r1) {
        super(r1);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas r6) {
        Path r02 = new Path();
        r02.addRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), 18.0f, 18.0f, Path.Direction.CW);
        r6.clipPath(r02);
        super.onDraw(r6);
    }

    public RoundedImageView(Context r1, AttributeSet r2) {
        super(r1, r2);
    }

    public RoundedImageView(Context r1, AttributeSet r2, int r3) {
        super(r1, r2, r3);
    }
}
