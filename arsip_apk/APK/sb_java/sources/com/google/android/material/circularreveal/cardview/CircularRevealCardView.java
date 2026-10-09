package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.circularreveal.CircularRevealHelper;
import com.google.android.material.circularreveal.CircularRevealWidget;

/* loaded from: classes5.dex */
public class CircularRevealCardView extends MaterialCardView implements CircularRevealWidget {
    private final CircularRevealHelper helper;

    public CircularRevealCardView(Context r2) {
        this(r2, null);
    }

    @Override // com.google.android.material.circularreveal.CircularRevealHelper.Delegate
    public void actualDraw(Canvas r1) {
        super.draw(r1);
    }

    @Override // com.google.android.material.circularreveal.CircularRevealHelper.Delegate
    public boolean actualIsOpaque() {
        return super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void buildCircularRevealCache() {
        this.helper.buildCircularRevealCache();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void destroyCircularRevealCache() {
        this.helper.destroyCircularRevealCache();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.CircularRevealWidget
    public void draw(Canvas r2) {
        CircularRevealHelper r02 = this.helper;
        if (r02 == null) goto L6;
        r02.draw(r2);
        return;
    L6:
        super.draw(r2);
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public Drawable getCircularRevealOverlayDrawable() {
        return this.helper.getCircularRevealOverlayDrawable();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public int getCircularRevealScrimColor() {
        return this.helper.getCircularRevealScrimColor();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public CircularRevealWidget.RevealInfo getRevealInfo() {
        return this.helper.getRevealInfo();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.CircularRevealWidget
    public boolean isOpaque() {
        CircularRevealHelper r02 = this.helper;
        if (r02 == null) goto L7;
        return r02.isOpaque();
    L7:
        return super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void setCircularRevealOverlayDrawable(Drawable r2) {
        this.helper.setCircularRevealOverlayDrawable(r2);
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void setCircularRevealScrimColor(int r2) {
        this.helper.setCircularRevealScrimColor(r2);
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void setRevealInfo(CircularRevealWidget.RevealInfo r2) {
        this.helper.setRevealInfo(r2);
    }

    public CircularRevealCardView(Context r1, AttributeSet r2) {
        super(r1, r2);
        this.helper = new CircularRevealHelper(this);
    }
}
