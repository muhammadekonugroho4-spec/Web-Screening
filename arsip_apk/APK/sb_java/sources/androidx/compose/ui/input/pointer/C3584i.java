package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;

/* renamed from: androidx.compose.ui.input.pointer.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3584i {

    /* renamed from: a, reason: collision with root package name */
    public static final C3584i f18134a = null;

    static {
        f18134a = new C3584i();
    }

    public C3584i() {
    }

    public final long a(MotionEvent r5, int r6) {
        float r02 = AbstractC3582g.a(r5, r6);
        float r52 = AbstractC3583h.a(r5, r6);
        return androidx.compose.ui.geometry.e.e((Float.floatToRawIntBits(r52) & 4294967295L) | (Float.floatToRawIntBits(r02) << 32));
    }
}
