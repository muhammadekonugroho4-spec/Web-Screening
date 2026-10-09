package com.stockbit.livestream.generated.callback;

import android.view.View;

/* loaded from: classes10.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1061a f121712a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121713b;

    /* renamed from: com.stockbit.livestream.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC1061a {
        void a(int r1, View r2);
    }

    public a(InterfaceC1061a r1, int r2) {
        this.f121712a = r1;
        this.f121713b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f121712a.a(this.f121713b, r3);
    }
}
