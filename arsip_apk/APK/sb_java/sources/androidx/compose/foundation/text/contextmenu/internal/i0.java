package androidx.compose.foundation.text.contextmenu.internal;

import android.view.ActionMode;
import android.view.View;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final i0 f9822a = null;

    static {
        f9822a = new i0();
    }

    public i0() {
    }

    public final void a(ActionMode r1) {
        r1.invalidateContentRect();
    }

    public final ActionMode b(View r1, ActionMode.Callback r2, int r3) {
        return r1.startActionMode(r2, r3);
    }
}
