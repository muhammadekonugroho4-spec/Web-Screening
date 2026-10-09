package androidx.compose.ui.autofill;

import android.view.autofill.AutofillValue;
import androidx.compose.ui.autofill.t;

/* loaded from: classes.dex */
public abstract class u {
    public static final t a(t.a r02, boolean r1) {
        return new f(AutofillValue.forToggle(r1));
    }

    public static final t b(t.a r02, CharSequence r1) {
        return new f(AutofillValue.forText(r1));
    }
}
