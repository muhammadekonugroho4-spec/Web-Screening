package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f16786a = null;

    static {
        f16786a = new h();
    }

    public h() {
    }

    public final void A(ViewStructure r1, CharSequence r2) {
        r1.setText(r2);
    }

    public final void B(ViewStructure r1, int r2) {
        r1.setVisibility(r2);
    }

    public final CharSequence C(AutofillValue r1) {
        return r1.getTextValue();
    }

    public final int a(ViewStructure r1, int r2) {
        return r1.addChildCount(r2);
    }

    public final AutofillValue b(String r1) {
        return AutofillValue.forText(r1);
    }

    public final AutofillValue c(boolean r1) {
        return AutofillValue.forToggle(r1);
    }

    public final boolean d(AutofillValue r1) {
        return r1.isDate();
    }

    public final boolean e(AutofillValue r1) {
        return r1.isList();
    }

    public final boolean f(AutofillValue r1) {
        return r1.isText();
    }

    public final boolean g(AutofillValue r1) {
        return r1.isToggle();
    }

    public final ViewStructure h(ViewStructure r1, int r2) {
        return r1.newChild(r2);
    }

    public final void i(ViewStructure r1, String[] r2) {
        r1.setAutofillHints(r2);
    }

    public final void j(ViewStructure r1, AutofillId r2, int r3) {
        r1.setAutofillId(r2, r3);
    }

    public final void k(ViewStructure r1, int r2) {
        r1.setAutofillType(r2);
    }

    public final void l(ViewStructure r1, AutofillValue r2) {
        r1.setAutofillValue(r2);
    }

    public final void m(ViewStructure r1, boolean r2) {
        r1.setCheckable(r2);
    }

    public final void n(ViewStructure r1, boolean r2) {
        r1.setChecked(r2);
    }

    public final void o(ViewStructure r1, String r2) {
        r1.setClassName(r2);
    }

    public final void p(ViewStructure r1, boolean r2) {
        r1.setClickable(r2);
    }

    public final void q(ViewStructure r1, CharSequence r2) {
        r1.setContentDescription(r2);
    }

    public final void r(ViewStructure r1, boolean r2) {
        r1.setDataIsSensitive(r2);
    }

    public final void s(ViewStructure r1, int r2, int r3, int r4, int r5, int r6, int r7) {
        r1.setDimens(r2, r3, r4, r5, r6, r7);
    }

    public final void t(ViewStructure r1, boolean r2) {
        r1.setEnabled(r2);
    }

    public final void u(ViewStructure r1, boolean r2) {
        r1.setFocusable(r2);
    }

    public final void v(ViewStructure r1, boolean r2) {
        r1.setFocused(r2);
    }

    public final void w(ViewStructure r1, int r2, String r3, String r4, String r5) {
        r1.setId(r2, r3, r4, r5);
    }

    public final void x(ViewStructure r1, int r2) {
        r1.setInputType(r2);
    }

    public final void y(ViewStructure r1, boolean r2) {
        r1.setLongClickable(r2);
    }

    public final void z(ViewStructure r1, boolean r2) {
        r1.setSelected(r2);
    }
}
