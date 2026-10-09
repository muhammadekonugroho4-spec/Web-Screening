package com.koushikdutta.ion;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes6.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f41727a = null;

    public static class a implements b {
        public a() {
        }

        @Override // com.koushikdutta.ion.b
        public Drawable a(Resources r2, Bitmap r3) {
            return new BitmapDrawable(r2, r3);
        }
    }

    static {
        f41727a = new a();
    }

    Drawable a(Resources r1, Bitmap r2);
}
