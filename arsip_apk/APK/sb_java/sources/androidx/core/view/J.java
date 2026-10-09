package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes4.dex */
public class J {

    /* renamed from: a, reason: collision with root package name */
    public int f23124a;

    /* renamed from: b, reason: collision with root package name */
    public int f23125b;

    public J(ViewGroup r1) {
    }

    public int a() {
        return this.f23124a | this.f23125b;
    }

    public void b(View r2, View r3, int r4) {
        c(r2, r3, r4, 0);
    }

    public void c(View r1, View r2, int r3, int r4) {
        if (r4 != 1) goto L6;
        this.f23125b = r3;
        return;
    L6:
        this.f23124a = r3;
    }

    public void d(View r2) {
        e(r2, 0);
    }

    public void e(View r2, int r3) {
        if (r3 != 1) goto L6;
        this.f23125b = 0;
        return;
    L6:
        this.f23124a = 0;
    }
}
