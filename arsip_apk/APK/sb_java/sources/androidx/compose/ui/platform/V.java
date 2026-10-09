package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class V implements S {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f19222a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f19223b;

    public V() {
        this.f19222a = new Matrix();
        this.f19223b = new int[2];
    }

    @Override // androidx.compose.ui.platform.S
    public void a(View r6, float[] r7) {
        this.f19222a.reset();
        U.a(r6, this.f19222a);
        ViewParent r02 = r6.getParent();
    L4:
        if ((r02 instanceof View) == false) goto L6;
        r6 = r02;
        r02 = r6.getParent();
        goto L4
    L6:
        r6.getLocationOnScreen(this.f19223b);
        int[] r03 = this.f19223b;
        int r2 = r03[0];
        int r4 = r03[1];
        r6.getLocationInWindow(r03);
        int[] r62 = this.f19223b;
        int r04 = r62[0];
        int r63 = r62[1];
        this.f19222a.postTranslate(r04 - r2, r63 - r4);
        androidx.compose.ui.graphics.O.b(r7, this.f19222a);
    }
}
