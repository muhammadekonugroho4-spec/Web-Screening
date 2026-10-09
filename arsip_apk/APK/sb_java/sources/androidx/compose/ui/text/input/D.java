package androidx.compose.ui.text.input;

import android.os.CancellationSignal;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.PreviewableHandwritingGesture;

/* loaded from: classes.dex */
public abstract /* synthetic */ class D {
    public static /* bridge */ /* synthetic */ boolean a(InputConnection r02, PreviewableHandwritingGesture r1, CancellationSignal r2) {
        return r02.previewHandwritingGesture(r1, r2);
    }
}
