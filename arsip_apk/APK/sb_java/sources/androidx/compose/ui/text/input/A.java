package androidx.compose.ui.text.input;

import android.os.Handler;
import android.view.inputmethod.InputConnection;

/* loaded from: classes.dex */
public abstract class A extends AbstractC3803z {
    public A(InputConnection r1, kotlin.jvm.functions.l r2) {
        super(r1, r2);
    }

    @Override // androidx.compose.ui.text.input.AbstractC3803z
    public final void b(InputConnection r1) {
        r1.closeConnection();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int r2, int r3) {
        InputConnection r02 = c();
        if (r02 != null) goto L5;
        return false;
    L5:
        return r02.deleteSurroundingTextInCodePoints(r2, r3);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        InputConnection r02 = c();
        if (r02 != null) goto L5;
        return null;
    L5:
        return r02.getHandler();
    }
}
