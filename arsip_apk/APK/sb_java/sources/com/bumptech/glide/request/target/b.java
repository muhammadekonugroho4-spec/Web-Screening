package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* loaded from: classes4.dex */
public class b extends e {
    public b(ImageView r1) {
        super(r1);
    }

    @Override // com.bumptech.glide.request.target.e
    public /* bridge */ /* synthetic */ void p(Object r1) {
        r((Bitmap) r1);
    }

    public void r(Bitmap r2) {
        ((ImageView) this.f33351a).setImageBitmap(r2);
    }
}
