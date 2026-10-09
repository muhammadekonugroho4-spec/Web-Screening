package com.github.mikephil.charting.components;

import android.graphics.Paint;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;

/* loaded from: classes4.dex */
public class Description extends ComponentBase {
    private MPPointF mPosition;
    private Paint.Align mTextAlign;
    private String text;

    public Description() {
        this.text = "Description Label";
        this.mTextAlign = Paint.Align.RIGHT;
        this.mTextSize = Utils.convertDpToPixel(8.0f);
    }

    public MPPointF getPosition() {
        return this.mPosition;
    }

    public String getText() {
        return this.text;
    }

    public Paint.Align getTextAlign() {
        return this.mTextAlign;
    }

    public void setPosition(float r2, float r3) {
        MPPointF r02 = this.mPosition;
        if (r02 != null) goto L6;
        this.mPosition = MPPointF.getInstance(r2, r3);
        return;
    L6:
        r02.f37851x = r2;
        r02.f37852y = r3;
    }

    public void setText(String r1) {
        this.text = r1;
    }

    public void setTextAlign(Paint.Align r1) {
        this.mTextAlign = r1;
    }
}
