package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.s;

/* loaded from: classes4.dex */
public final class l extends j {
    public l(Drawable r1) {
        super(r1);
    }

    public static s c(Drawable r1) {
        if (r1 != null) goto L4;
        return null;
    L4:
        return new l(r1);
    }

    @Override // com.bumptech.glide.load.engine.s
    public Class a() {
        return this.f33127a.getClass();
    }

    @Override // com.bumptech.glide.load.engine.s
    public int getSize() {
        return Math.max(1, (this.f33127a.getIntrinsicWidth() * this.f33127a.getIntrinsicHeight()) * 4);
    }

    @Override // com.bumptech.glide.load.engine.s
    public void recycle() {
    }
}
