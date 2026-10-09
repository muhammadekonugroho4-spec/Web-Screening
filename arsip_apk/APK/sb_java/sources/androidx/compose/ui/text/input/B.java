package androidx.compose.ui.text.input;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public class B extends A {
    public B(InputConnection r1, kotlin.jvm.functions.l r2) {
        super(r1, r2);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo r2, int r3, Bundle r4) {
        InputConnection r02 = c();
        if (r02 != null) goto L5;
        return false;
    L5:
        return r02.commitContent(r2, r3, r4);
    }
}
