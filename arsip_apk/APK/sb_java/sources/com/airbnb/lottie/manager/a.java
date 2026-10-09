package com.airbnb.lottie.manager;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.airbnb.lottie.model.h;
import com.airbnb.lottie.utils.d;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final h f31224a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f31225b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f31226c;
    public final AssetManager d;

    /* renamed from: e, reason: collision with root package name */
    public String f31227e;

    public a(Drawable.Callback r1, com.airbnb.lottie.a r2) {
        this.f31224a = new h();
        this.f31225b = new HashMap();
        this.f31226c = new HashMap();
        this.f31227e = ".ttf";
        if ((r1 instanceof View) == true) goto L6;
        d.c("LottieDrawable must be inside of a view for images to work.");
        this.d = null;
        return;
    L6:
        this.d = ((View) r1).getContext().getAssets();
    }

    public final Typeface a(String r3) {
        Typeface r02 = (Typeface) this.f31226c.get(r3);
        if (r02 == null) goto L5;
        return r02;
    L5:
        Typeface r03 = Typeface.createFromAsset(this.d, "fonts/" + r3 + this.f31227e);
        this.f31226c.put(r3, r03);
        return r03;
    }

    public Typeface b(String r3, String r4) {
        this.f31224a.b(r3, r4);
        Typeface r02 = (Typeface) this.f31225b.get(this.f31224a);
        if (r02 == null) goto L5;
        return r02;
    L5:
        Typeface r32 = d(a(r3), r4);
        this.f31225b.put(this.f31224a, r32);
        return r32;
    }

    public void c(com.airbnb.lottie.a r1) {
    }

    public final Typeface d(Typeface r3, String r4) {
        boolean r02 = r4.contains("Italic");
        boolean r42 = r4.contains("Bold");
        if (r02 == false) goto L6;
        if (r42 == false) goto L6;
        int r43 = 3;
    L12:
        if (r3.getStyle() != r43) goto L15;
        return r3;
    L15:
        return Typeface.create(r3, r43);
    L6:
        if (r02 == false) goto L8;
        r43 = 2;
        goto L12
    L8:
        if (r42 == false) goto L10;
        r43 = 1;
        goto L12
    L10:
        r43 = 0;
        goto L12
    }
}
