package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.perf.util.Constants;

/* loaded from: classes5.dex */
public final class zak extends Drawable implements Drawable.Callback {
    private int zaa;
    private long zab;
    private int zac;
    private int zad;
    private int zae;
    private int zaf;
    private boolean zag;
    private boolean zah;
    private zaj zai;
    private Drawable zaj;
    private Drawable zak;
    private boolean zal;
    private boolean zam;
    private boolean zan;
    private int zao;

    public zak(Drawable r3, Drawable r4) {
        this(null);
        if (r3 != null) goto L5;
        r3 = zai.zaa();
    L5:
        this.zaj = r3;
        r3.setCallback(this);
        zaj r02 = this.zai;
        int r1 = r02.zab;
        r02.zab = r3.getChangingConfigurations() | r1;
        if (r4 != null) goto L8;
        r4 = zai.zaa();
    L8:
        this.zak = r4;
        r4.setCallback(this);
        zaj r32 = this.zai;
        int r03 = r32.zab;
        r32.zab = r4.getChangingConfigurations() | r03;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r8) {
        int r02 = this.zaa;
        int r2 = 0;
        if (r02 == 1) goto L15;
        if (r02 == 2) goto L7;
    L5:
        boolean r4 = true;
    L16:
        int r03 = this.zaf;
        boolean r1 = this.zag;
        Drawable r5 = this.zaj;
        Drawable r6 = this.zak;
        if (r4 == false) goto L27;
        if (r1 == false) goto L21;
        if (r03 == 0) goto L22;
    L23:
        int r12 = this.zad;
        if (r03 != r12) goto L36;
        r6.setAlpha(r12);
        r6.draw(r8);
        return;
    L36:
        return;
    L22:
        r5.draw(r8);
        r03 = r2;
        goto L23
    L21:
        r2 = r03;
        goto L22
    L27:
        if (r1 == false) goto L29;
        r5.setAlpha(this.zad - r03);
        r2 = 1;
    L29:
        r5.draw(r8);
        if (r2 == 0) goto L32;
        r5.setAlpha(this.zad);
    L32:
        if (r03 <= 0) goto L34;
        r6.setAlpha(r03);
        r6.draw(r8);
        r6.setAlpha(this.zad);
    L34:
        invalidateSelf();
        return;
    L7:
        if (this.zab < 0) goto L5;
        float r04 = (SystemClock.uptimeMillis() - this.zab) / this.zae;
        if (r04 < 1.0f) goto L11;
        r4 = true;
    L12:
        if (r4 == false) goto L14;
        this.zaa = 0;
    L14:
        this.zaf = (int) ((this.zac * Math.min(r04, 1.0f)) + 0.0f);
        goto L16
    L11:
        r4 = false;
        goto L12
    L15:
        this.zab = SystemClock.uptimeMillis();
        this.zaa = 2;
        r4 = false;
        goto L16
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int r02 = super.getChangingConfigurations();
        zaj r1 = this.zai;
        return (r02 | r1.zaa) | r1.zab;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (zac() == false) goto L6;
        zaj r02 = this.zai;
        r02.zaa = getChangingConfigurations();
        return this.zai;
    L6:
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.zaj.getIntrinsicHeight(), this.zak.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.zaj.getIntrinsicWidth(), this.zak.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.zan == true) goto L6;
        this.zao = Drawable.resolveOpacity(this.zaj.getOpacity(), this.zak.getOpacity());
        this.zan = true;
    L6:
        return this.zao;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable r1) {
        Drawable.Callback r12 = getCallback();
        if (r12 == null) goto L6;
        r12.invalidateDrawable(this);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    @CanIgnoreReturnValue
    public final Drawable mutate() {
        if (this.zah == false) goto L5;
    L12:
        return this;
    L5:
        if (super.mutate() != this) goto L12;
        if (zac() == false) goto L11;
        this.zaj.mutate();
        this.zak.mutate();
        this.zah = true;
        return this;
    L11:
        throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect r2) {
        this.zaj.setBounds(r2);
        this.zak.setBounds(r2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable r1, Runnable r2, long r3) {
        Drawable.Callback r12 = getCallback();
        if (r12 == null) goto L6;
        r12.scheduleDrawable(this, r2, r3);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r3) {
        if (this.zaf != this.zad) goto L5;
        this.zaf = r3;
    L5:
        this.zad = r3;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r2) {
        this.zaj.setColorFilter(r2);
        this.zak.setColorFilter(r2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable r1, Runnable r2) {
        Drawable.Callback r12 = getCallback();
        if (r12 == null) goto L6;
        r12.unscheduleDrawable(this, r2);
        return;
    }

    public final Drawable zaa() {
        return this.zak;
    }

    public final void zab(int r1) {
        this.zac = this.zad;
        this.zaf = 0;
        this.zae = 250;
        this.zaa = 1;
        invalidateSelf();
    }

    public final boolean zac() {
        if (this.zal == true) goto L11;
        boolean r1 = false;
        if (this.zaj.getConstantState() != null) goto L7;
    L9:
        this.zam = r1;
        this.zal = true;
        goto L11
    L7:
        if (this.zak.getConstantState() == null) goto L9;
        r1 = true;
    L11:
        return this.zam;
    }

    public zak(zaj r3) {
        this.zaa = 0;
        this.zad = Constants.MAX_HOST_LENGTH;
        this.zaf = 0;
        this.zag = true;
        this.zai = new zaj(r3);
    }
}
