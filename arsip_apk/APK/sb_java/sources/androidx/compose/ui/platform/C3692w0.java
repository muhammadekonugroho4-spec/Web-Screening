package androidx.compose.ui.platform;

import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.AbstractC3582g;
import androidx.compose.ui.input.pointer.AbstractC3583h;

/* renamed from: androidx.compose.ui.platform.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3692w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3692w0 f19378a = null;

    static {
        f19378a = new C3692w0();
    }

    public C3692w0() {
    }

    public final boolean a(MotionEvent r4, int r5) {
        if ((Float.floatToRawIntBits(AbstractC3582g.a(r4, r5)) & Integer.MAX_VALUE) < 2139095040) goto L5;
        return false;
    L5:
        if ((Float.floatToRawIntBits(AbstractC3583h.a(r4, r5)) & Integer.MAX_VALUE) >= 2139095040) goto L10;
        return true;
    L10:
        return false;
    }
}
