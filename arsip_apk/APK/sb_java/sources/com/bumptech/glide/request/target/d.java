package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes4.dex */
public class d extends e {
    public d(ImageView r1) {
        super(r1);
    }

    @Override // com.bumptech.glide.request.target.e
    public /* bridge */ /* synthetic */ void p(Object r1) {
        r((Drawable) r1);
    }

    public void r(Drawable r2) {
        ((ImageView) this.f33351a).setImageDrawable(r2);
    }
}
