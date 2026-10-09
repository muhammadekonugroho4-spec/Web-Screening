package androidx.compose.ui.autofill;

import android.view.autofill.AutofillValue;

/* loaded from: classes.dex */
public final class f implements t {

    /* renamed from: b, reason: collision with root package name */
    public final AutofillValue f16785b;

    static {
    }

    public f(AutofillValue r1) {
        this.f16785b = r1;
    }

    @Override // androidx.compose.ui.autofill.t
    public Boolean a() {
        if (this.f16785b.isToggle() == true) goto L5;
        return null;
    L5:
        return Boolean.valueOf(this.f16785b.getToggleValue());
    }

    @Override // androidx.compose.ui.autofill.t
    public CharSequence b() {
        if (this.f16785b.isText() == true) goto L5;
        return null;
    L5:
        return this.f16785b.getTextValue();
    }

    public final AutofillValue c() {
        return this.f16785b;
    }
}
