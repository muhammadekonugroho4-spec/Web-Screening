package androidx.glance;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public final class e implements p {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f25255a;

    static {
    }

    public e(Bitmap r1) {
        this.f25255a = r1;
    }

    public final Bitmap a() {
        return this.f25255a;
    }

    public String toString() {
        return "BitmapImageProvider(bitmap=Bitmap(" + this.f25255a.getWidth() + "px x " + this.f25255a.getHeight() + "px))";
    }
}
