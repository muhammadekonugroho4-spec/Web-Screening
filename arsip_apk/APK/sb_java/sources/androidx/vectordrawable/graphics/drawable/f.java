package androidx.vectordrawable.graphics.drawable;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* loaded from: classes4.dex */
public abstract class f extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public Drawable f28498a;

    public f() {
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme r2) {
        Drawable r02 = this.f28498a;
        if (r02 == null) goto L6;
        androidx.core.graphics.drawable.a.a(r02, r2);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        Drawable r02 = this.f28498a;
        if (r02 == null) goto L6;
        r02.clearColorFilter();
        return;
    L6:
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        Drawable r02 = this.f28498a;
        if (r02 == null) goto L7;
        return r02.getCurrent();
    L7:
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        Drawable r02 = this.f28498a;
        if (r02 == null) goto L7;
        return r02.getMinimumHeight();
    L7:
        return super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        Drawable r02 = this.f28498a;
        if (r02 == null) goto L7;
        return r02.getMinimumWidth();
    L7:
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect r2) {
        Drawable r02 = this.f28498a;
        if (r02 == null) goto L7;
        return r02.getPadding(r2);
    L7:
        return super.getPadding(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        Drawable r02 = this.f28498a;
        if (r02 == null) goto L7;
        return r02.getState();
    L7:
        return super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Drawable r02 = this.f28498a;
        if (r02 == null) goto L7;
        return r02.getTransparentRegion();
    L7:
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        Drawable r02 = this.f28498a;
        if (r02 == null) goto L6;
        androidx.core.graphics.drawable.a.i(r02);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int r2) {
        Drawable r02 = this.f28498a;
        if (r02 == null) goto L7;
        return r02.setLevel(r2);
    L7:
        return super.onLevelChange(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int r2) {
        Drawable r02 = this.f28498a;
        if (r02 == null) goto L6;
        r02.setChangingConfigurations(r2);
        return;
    L6:
        super.setChangingConfigurations(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int r2, PorterDuff.Mode r3) {
        Drawable r02 = this.f28498a;
        if (r02 == null) goto L6;
        r02.setColorFilter(r2, r3);
        return;
    L6:
        super.setColorFilter(r2, r3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean r2) {
        Drawable r02 = this.f28498a;
        if (r02 == null) goto L6;
        r02.setFilterBitmap(r2);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float r2, float r3) {
        Drawable r02 = this.f28498a;
        if (r02 == null) goto L6;
        androidx.core.graphics.drawable.a.k(r02, r2, r3);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int r2, int r3, int r4, int r5) {
        Drawable r02 = this.f28498a;
        if (r02 == null) goto L6;
        androidx.core.graphics.drawable.a.l(r02, r2, r3, r4, r5);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] r2) {
        Drawable r02 = this.f28498a;
        if (r02 == null) goto L7;
        return r02.setState(r2);
    L7:
        return super.setState(r2);
    }
}
