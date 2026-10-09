package com.stockbit.notif.generated.callback;

import android.view.View;

/* loaded from: classes10.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1070a f122801a;

    /* renamed from: b, reason: collision with root package name */
    public final int f122802b;

    /* renamed from: com.stockbit.notif.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC1070a {
        void a(int r1, View r2);
    }

    public a(InterfaceC1070a r1, int r2) {
        this.f122801a = r1;
        this.f122802b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f122801a.a(this.f122802b, r3);
    }
}
