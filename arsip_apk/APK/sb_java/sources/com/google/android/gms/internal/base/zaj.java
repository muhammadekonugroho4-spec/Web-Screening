package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
final class zaj extends Drawable.ConstantState {
    int zaa;
    int zab;

    public zaj(zaj r2) {
        if (r2 == null) goto L6;
        this.zaa = r2.zaa;
        this.zab = r2.zab;
        return;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.zaa;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new zak(this);
    }
}
