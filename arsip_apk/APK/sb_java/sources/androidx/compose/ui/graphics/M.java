package androidx.compose.ui.graphics;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class M implements O0 {

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f17123b;

    static {
    }

    public M(Bitmap r1) {
        this.f17123b = r1;
    }

    @Override // androidx.compose.ui.graphics.O0
    public void a() {
        this.f17123b.prepareToDraw();
    }

    @Override // androidx.compose.ui.graphics.O0
    public int b() {
        Bitmap.Config r02 = this.f17123b.getConfig();
        kotlin.jvm.internal.p.i(r02);
        return N.e(r02);
    }

    public final Bitmap c() {
        return this.f17123b;
    }

    @Override // androidx.compose.ui.graphics.O0
    public int getHeight() {
        return this.f17123b.getHeight();
    }

    @Override // androidx.compose.ui.graphics.O0
    public int getWidth() {
        return this.f17123b.getWidth();
    }
}
