package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zam;

/* loaded from: classes5.dex */
public abstract class zag {
    final zad zaa;
    protected int zab;

    public zag(Uri r2, int r3) {
        this.zab = 0;
        this.zaa = new zad(r2);
        this.zab = r3;
    }

    public abstract void zaa(Drawable r1, boolean r2, boolean r3, boolean r4);

    public final void zab(Context r1, zam r2, boolean r3) {
        int r22 = this.zab;
        if (r22 == 0) goto L5;
        Drawable r12 = r1.getResources().getDrawable(r22);
    L6:
        zaa(r12, r3, false, false);
        return;
    L5:
        r12 = null;
        goto L6
    }

    public final void zac(Context r1, Bitmap r2, boolean r3) {
        Asserts.checkNotNull(r2);
        zaa(new BitmapDrawable(r1.getResources(), r2), false, false, true);
    }
}
