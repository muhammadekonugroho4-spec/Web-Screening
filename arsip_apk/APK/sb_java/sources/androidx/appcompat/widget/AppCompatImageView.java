package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    private final C2087d mBackgroundTintHelper;
    private boolean mHasLevel;
    private final C2094k mImageHelper;

    public AppCompatImageView(Context r2) {
        this(r2, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2087d r02 = this.mBackgroundTintHelper;
        if (r02 == null) goto L5;
        r02.b();
    L5:
        C2094k r03 = this.mImageHelper;
        if (r03 == null) goto L9;
        r03.c();
        return;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2087d r02 = this.mBackgroundTintHelper;
        if (r02 != null) goto L5;
        return null;
    L5:
        return r02.c();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2087d r02 = this.mBackgroundTintHelper;
        if (r02 != null) goto L5;
        return null;
    L5:
        return r02.d();
    }

    public ColorStateList getSupportImageTintList() {
        C2094k r02 = this.mImageHelper;
        if (r02 != null) goto L5;
        return null;
    L5:
        return r02.d();
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C2094k r02 = this.mImageHelper;
        if (r02 != null) goto L5;
        return null;
    L5:
        return r02.e();
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        if (this.mImageHelper.f() == true) goto L5;
        return false;
    L5:
        if (super.hasOverlappingRendering() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r2) {
        super.setBackgroundDrawable(r2);
        C2087d r02 = this.mBackgroundTintHelper;
        if (r02 == null) goto L6;
        r02.f(r2);
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        C2087d r02 = this.mBackgroundTintHelper;
        if (r02 == null) goto L6;
        r02.g(r2);
        return;
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap r1) {
        super.setImageBitmap(r1);
        C2094k r12 = this.mImageHelper;
        if (r12 == null) goto L6;
        r12.c();
        return;
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable r3) {
        C2094k r02 = this.mImageHelper;
        if (r02 == null) goto L8;
        if (r3 == null) goto L8;
        if (this.mHasLevel == true) goto L8;
        r02.h(r3);
    L8:
        super.setImageDrawable(r3);
        C2094k r32 = this.mImageHelper;
        if (r32 == null) goto L14;
        r32.c();
        if (this.mHasLevel == true) goto L15;
        this.mImageHelper.b();
        return;
    L15:
        return;
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int r1) {
        super.setImageLevel(r1);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int r2) {
        C2094k r02 = this.mImageHelper;
        if (r02 == null) goto L6;
        r02.i(r2);
        return;
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri r1) {
        super.setImageURI(r1);
        C2094k r12 = this.mImageHelper;
        if (r12 == null) goto L6;
        r12.c();
        return;
    }

    public void setSupportBackgroundTintList(ColorStateList r2) {
        C2087d r02 = this.mBackgroundTintHelper;
        if (r02 == null) goto L6;
        r02.i(r2);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r2) {
        C2087d r02 = this.mBackgroundTintHelper;
        if (r02 == null) goto L6;
        r02.j(r2);
        return;
    }

    public void setSupportImageTintList(ColorStateList r2) {
        C2094k r02 = this.mImageHelper;
        if (r02 == null) goto L6;
        r02.j(r2);
        return;
    }

    public void setSupportImageTintMode(PorterDuff.Mode r2) {
        C2094k r02 = this.mImageHelper;
        if (r02 == null) goto L6;
        r02.k(r2);
        return;
    }

    public AppCompatImageView(Context r2, AttributeSet r3) {
        this(r2, r3, 0);
    }

    public AppCompatImageView(Context r1, AttributeSet r2, int r3) {
        super(J.b(r1), r2, r3);
        this.mHasLevel = false;
        I.a(this, getContext());
        C2087d r12 = new C2087d(this);
        this.mBackgroundTintHelper = r12;
        r12.e(r2, r3);
        C2094k r13 = new C2094k(this);
        this.mImageHelper = r13;
        r13.g(r2, r3);
    }
}
