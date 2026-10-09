package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
class AppCompatPopupWindow extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f3286b = false;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3287a;

    static {
        f3286b = false;
    }

    public AppCompatPopupWindow(Context r2, AttributeSet r3, int r4) {
        super(r2, r3, r4);
        a(r2, r3, r4, 0);
    }

    public final void a(Context r2, AttributeSet r3, int r4, int r5) {
        M r22 = M.v(r2, r3, androidx.appcompat.j.i2, r4, r5);
        if (r22.s(androidx.appcompat.j.k2) == false) goto L5;
        b(r22.a(androidx.appcompat.j.k2, false));
    L5:
        setBackgroundDrawable(r22.g(androidx.appcompat.j.j2));
        r22.x();
    }

    public final void b(boolean r2) {
        if (f3286b == false) goto L6;
        this.f3287a = r2;
        return;
    L6:
        androidx.core.widget.j.a(this, r2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View r2, int r3, int r4) {
        if (f3286b == true) goto L5;
    L7:
        super.showAsDropDown(r2, r3, r4);
        return;
    L5:
        if (this.f3287a == false) goto L7;
        r4 = r4 - r2.getHeight();
        goto L7
    }

    @Override // android.widget.PopupWindow
    public void update(View r7, int r8, int r9, int r10, int r11) {
        if (f3286b == true) goto L5;
    L7:
        super.update(r7, r8, r9, r10, r11);
        return;
    L5:
        if (this.f3287a == false) goto L7;
        r9 = r9 - r7.getHeight();
        goto L7
    }

    public AppCompatPopupWindow(Context r1, AttributeSet r2, int r3, int r4) {
        super(r1, r2, r3, r4);
        a(r1, r2, r3, r4);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View r2, int r3, int r4, int r5) {
        if (f3286b == true) goto L5;
    L7:
        super.showAsDropDown(r2, r3, r4, r5);
        return;
    L5:
        if (this.f3287a == false) goto L7;
        r4 = r4 - r2.getHeight();
        goto L7
    }
}
