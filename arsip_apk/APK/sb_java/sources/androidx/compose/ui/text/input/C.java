package androidx.compose.ui.text.input;

import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* loaded from: classes.dex */
public abstract /* synthetic */ class C {
    public static /* bridge */ /* synthetic */ void a(InputConnection r02, HandwritingGesture r1, Executor r2, IntConsumer r3) {
        r02.performHandwritingGesture(r1, r2, r3);
    }
}
