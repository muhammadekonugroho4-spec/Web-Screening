package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* loaded from: classes.dex */
public final class w implements v {

    /* renamed from: a, reason: collision with root package name */
    public final AutofillManager f16837a;

    static {
    }

    public w(AutofillManager r1) {
        this.f16837a = r1;
    }

    @Override // androidx.compose.ui.autofill.v
    public void a(View r2, int r3, AutofillValue r4) {
        this.f16837a.notifyValueChanged(r2, r3, r4);
    }

    @Override // androidx.compose.ui.autofill.v
    public void b(View r2, int r3, Rect r4) {
        this.f16837a.notifyViewEntered(r2, r3, r4);
    }

    @Override // androidx.compose.ui.autofill.v
    public void c(View r2, int r3) {
        this.f16837a.notifyViewExited(r2, r3);
    }

    @Override // androidx.compose.ui.autofill.v
    public void commit() {
        this.f16837a.commit();
    }

    @Override // androidx.compose.ui.autofill.v
    public void d(View r2, int r3, Rect r4) {
        this.f16837a.requestAutofill(r2, r3, r4);
    }

    @Override // androidx.compose.ui.autofill.v
    public void e(View r3, int r4, boolean r5) {
        if (Build.VERSION.SDK_INT < 27) goto L6;
        j.f16787a.a(r3, this.f16837a, r4, r5);
        return;
    }
}
