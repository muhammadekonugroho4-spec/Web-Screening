package androidx.compose.ui.draganddrop;

import android.view.DragEvent;

/* loaded from: classes.dex */
public abstract class h {
    public static final long a(c r6) {
        float r02 = r6.a().getX();
        float r62 = r6.a().getY();
        return androidx.compose.ui.geometry.e.e((Float.floatToRawIntBits(r02) << 32) | (Float.floatToRawIntBits(r62) & 4294967295L));
    }

    public static final DragEvent b(c r02) {
        return r02.a();
    }
}
