package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.KeyEvent;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;

/* loaded from: classes.dex */
public interface I2 extends InterfaceC2774b1 {
    void a(int r1);

    androidx.compose.foundation.text.input.g b();

    void d(boolean r1);

    int f(HandwritingGesture r1);

    boolean i(androidx.compose.foundation.content.c r1);

    boolean previewHandwritingGesture(PreviewableHandwritingGesture r1, CancellationSignal r2);

    void requestCursorUpdates(int r1);

    void sendKeyEvent(KeyEvent r1);
}
