package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class a extends Drawable implements Drawable.Callback {
    private Drawable mDrawable;

    public a(Drawable r1) {
        setDrawable(r1);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas r2) {
        this.mDrawable.draw(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.mDrawable.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.mDrawable.getCurrent();
    }

    public Drawable getDrawable() {
        return this.mDrawable;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.mDrawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mDrawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.mDrawable.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.mDrawable.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.mDrawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect r2) {
        return this.mDrawable.getPadding(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.mDrawable.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.mDrawable.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable r1) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return androidx.core.graphics.drawable.a.h(this.mDrawable);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.mDrawable.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.mDrawable.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect r2) {
        this.mDrawable.setBounds(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int r2) {
        return this.mDrawable.setLevel(r2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable r1, Runnable r2, long r3) {
        scheduleSelf(r2, r3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
        this.mDrawable.setAlpha(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean r2) {
        androidx.core.graphics.drawable.a.j(this.mDrawable, r2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int r2) {
        this.mDrawable.setChangingConfigurations(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter r2) {
        this.mDrawable.setColorFilter(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean r2) {
        this.mDrawable.setDither(r2);
    }

    public void setDrawable(Drawable r3) {
        Drawable r02 = this.mDrawable;
        if (r02 == null) goto L5;
        r02.setCallback(null);
    L5:
        this.mDrawable = r3;
        if (r3 == null) goto L9;
        r3.setCallback(this);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean r2) {
        this.mDrawable.setFilterBitmap(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float r2, float r3) {
        androidx.core.graphics.drawable.a.k(this.mDrawable, r2, r3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int r2, int r3, int r4, int r5) {
        androidx.core.graphics.drawable.a.l(this.mDrawable, r2, r3, r4, r5);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] r2) {
        return this.mDrawable.setState(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int r2) {
        androidx.core.graphics.drawable.a.n(this.mDrawable, r2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList r2) {
        androidx.core.graphics.drawable.a.o(this.mDrawable, r2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode r2) {
        androidx.core.graphics.drawable.a.p(this.mDrawable, r2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r2, boolean r3) {
        if (super.setVisible(r2, r3) == false) goto L5;
        return true;
    L5:
        if (this.mDrawable.setVisible(r2, r3) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable r1, Runnable r2) {
        unscheduleSelf(r2);
    }
}
