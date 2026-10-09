package com.stockbit.company.generated.callback;

import android.view.View;

/* loaded from: classes7.dex */
public final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final a f64264a;

    /* renamed from: b, reason: collision with root package name */
    public final int f64265b;

    public interface a {
        void a(int r1, View r2);
    }

    public b(a r1, int r2) {
        this.f64264a = r1;
        this.f64265b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f64264a.a(this.f64265b, r3);
    }
}
