package androidx.compose.ui.autofill;

import android.view.View;
import android.view.autofill.AutofillManager;

/* loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static /* bridge */ /* synthetic */ void a(AutofillManager r02, View r1, int r2, boolean r3) {
        r02.notifyViewVisibilityChanged(r1, r2, r3);
    }
}
