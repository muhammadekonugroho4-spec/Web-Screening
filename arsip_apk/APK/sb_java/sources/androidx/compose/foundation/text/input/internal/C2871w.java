package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: androidx.compose.foundation.text.input.internal.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2871w extends AbstractC2868v {
    public C2871w(View r1) {
        super(r1);
    }

    @Override // androidx.compose.foundation.text.input.internal.InterfaceC2862t
    public void sendKeyEvent(KeyEvent r3) {
        g().dispatchKeyEventFromInputMethod(f(), r3);
    }
}
