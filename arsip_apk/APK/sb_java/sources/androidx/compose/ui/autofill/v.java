package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillValue;

/* loaded from: classes.dex */
public interface v {
    void a(View r1, int r2, AutofillValue r3);

    void b(View r1, int r2, Rect r3);

    void c(View r1, int r2);

    void commit();

    void d(View r1, int r2, Rect r3);

    void e(View r1, int r2, boolean r3);
}
