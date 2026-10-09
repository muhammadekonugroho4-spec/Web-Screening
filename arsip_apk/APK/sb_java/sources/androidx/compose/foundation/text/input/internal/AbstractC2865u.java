package androidx.compose.foundation.text.input.internal;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* renamed from: androidx.compose.foundation.text.input.internal.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2865u implements InterfaceC2862t {

    /* renamed from: a, reason: collision with root package name */
    public final View f10501a;

    /* renamed from: b, reason: collision with root package name */
    public InputMethodManager f10502b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.core.view.S f10503c;

    public AbstractC2865u(View r2) {
        this.f10501a = r2;
        this.f10503c = new androidx.core.view.S(r2);
    }

    @Override // androidx.compose.foundation.text.input.internal.InterfaceC2862t
    public void a(int r7, int r8, int r9, int r10) {
        g().updateSelection(this.f10501a, r7, r8, r9, r10);
    }

    @Override // androidx.compose.foundation.text.input.internal.InterfaceC2862t
    public void b() {
        g().restartInput(this.f10501a);
    }

    @Override // androidx.compose.foundation.text.input.internal.InterfaceC2862t
    public void c(CursorAnchorInfo r3) {
        g().updateCursorAnchorInfo(this.f10501a, r3);
    }

    @Override // androidx.compose.foundation.text.input.internal.InterfaceC2862t
    public void d() {
    }

    public final InputMethodManager e() {
        Object r02 = this.f10501a.getContext().getSystemService("input_method");
        kotlin.jvm.internal.p.j(r02, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) r02;
    }

    public final View f() {
        return this.f10501a;
    }

    public final InputMethodManager g() {
        InputMethodManager r02 = this.f10502b;
        if (r02 != null) goto L6;
        InputMethodManager r03 = e();
        this.f10502b = r03;
        return r03;
    L6:
        return r02;
    }
}
