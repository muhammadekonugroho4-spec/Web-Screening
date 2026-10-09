package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;

/* loaded from: classes.dex */
public final class O0 {

    /* renamed from: a, reason: collision with root package name */
    public static final O0 f19207a = null;

    static {
        f19207a = new O0();
    }

    public O0() {
    }

    public final ActionMode a(View r1, ActionMode.Callback r2, int r3) {
        return r1.startActionMode(r2, r3);
    }
}
