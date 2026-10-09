package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.P0;
import androidx.compose.ui.graphics.colorspace.AbstractC3502c;

/* loaded from: classes.dex */
public abstract class N {
    public static final O0 a(int r02, int r1, int r2, boolean r3, AbstractC3502c r4) {
        d(r2);
        return new M(C3498c0.a(r02, r1, r2, r3, r4));
    }

    public static final Bitmap b(O0 r1) {
        if ((r1 instanceof M) == false) goto L7;
        return ((M) r1).c();
    L7:
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final O0 c(Bitmap r1) {
        return new M(r1);
    }

    public static final Bitmap.Config d(int r2) {
        P0.a r02 = P0.f17131b;
        if (P0.i(r2, r02.b()) == false) goto L7;
        return Bitmap.Config.ARGB_8888;
    L7:
        if (P0.i(r2, r02.a()) == false) goto L11;
        return Bitmap.Config.ALPHA_8;
    L11:
        if (P0.i(r2, r02.e()) == false) goto L15;
        return Bitmap.Config.RGB_565;
    L15:
        if (P0.i(r2, r02.c()) == false) goto L19;
        return Bitmap.Config.RGBA_F16;
    L19:
        if (P0.i(r2, r02.d()) == false) goto L23;
        return Bitmap.Config.HARDWARE;
    L23:
        return Bitmap.Config.ARGB_8888;
    }

    public static final int e(Bitmap.Config r1) {
        if (r1 != Bitmap.Config.ALPHA_8) goto L7;
        return P0.f17131b.a();
    L7:
        if (r1 != Bitmap.Config.RGB_565) goto L11;
        return P0.f17131b.e();
    L11:
        if (r1 != Bitmap.Config.ARGB_4444) goto L15;
        return P0.f17131b.b();
    L15:
        if (r1 != Bitmap.Config.RGBA_F16) goto L19;
        return P0.f17131b.c();
    L19:
        if (r1 != Bitmap.Config.HARDWARE) goto L23;
        return P0.f17131b.d();
    L23:
        return P0.f17131b.b();
    }
}
