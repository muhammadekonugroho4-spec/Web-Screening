package com.stockbit.feature.portfolio.generated.callback;

import android.view.View;

/* loaded from: classes9.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0936a f104550a;

    /* renamed from: b, reason: collision with root package name */
    public final int f104551b;

    /* renamed from: com.stockbit.feature.portfolio.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC0936a {
        void a(int r1, View r2);
    }

    public a(InterfaceC0936a r1, int r2) {
        this.f104550a = r1;
        this.f104551b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f104550a.a(this.f104551b, r3);
    }
}
