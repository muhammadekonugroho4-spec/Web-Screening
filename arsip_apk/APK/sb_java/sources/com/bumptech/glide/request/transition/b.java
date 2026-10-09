package com.bumptech.glide.request.transition;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.bumptech.glide.request.transition.d;

/* loaded from: classes4.dex */
public class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final int f33365a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33366b;

    public b(int r1, boolean r2) {
        this.f33365a = r1;
        this.f33366b = r2;
    }

    @Override // com.bumptech.glide.request.transition.d
    public /* bridge */ /* synthetic */ boolean a(Object r1, d.a r2) {
        return b((Drawable) r1, r2);
    }

    public boolean b(Drawable r3, d.a r4) {
        Drawable r02 = r4.c();
        if (r02 != null) goto L5;
        r02 = new ColorDrawable(0);
    L5:
        TransitionDrawable r1 = new TransitionDrawable(new Drawable[]{r02, r3});
        r1.setCrossFadeEnabled(this.f33366b);
        r1.startTransition(this.f33365a);
        r4.f(r1);
        return true;
    }
}
