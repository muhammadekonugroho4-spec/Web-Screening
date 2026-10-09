package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.o;
import com.bumptech.glide.load.engine.s;

/* loaded from: classes4.dex */
public abstract class j implements s, o {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f33127a;

    public j(Drawable r1) {
        this.f33127a = (Drawable) com.bumptech.glide.util.k.d(r1);
    }

    public final Drawable b() {
        Drawable.ConstantState r02 = this.f33127a.getConstantState();
        if (r02 != null) goto L7;
        return this.f33127a;
    L7:
        return r02.newDrawable();
    }

    @Override // com.bumptech.glide.load.engine.s
    public /* bridge */ /* synthetic */ Object get() {
        return b();
    }

    @Override // com.bumptech.glide.load.engine.o
    public void initialize() {
        Drawable r02 = this.f33127a;
        if ((r02 instanceof BitmapDrawable) == false) goto L7;
        ((BitmapDrawable) r02).getBitmap().prepareToDraw();
        return;
    L7:
        if ((r02 instanceof com.bumptech.glide.load.resource.gif.c) == false) goto L10;
        ((com.bumptech.glide.load.resource.gif.c) r02).e().prepareToDraw();
        return;
    }
}
