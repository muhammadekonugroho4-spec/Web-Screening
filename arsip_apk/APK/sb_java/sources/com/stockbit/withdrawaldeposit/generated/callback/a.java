package com.stockbit.withdrawaldeposit.generated.callback;

import android.view.View;

/* loaded from: classes2.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1785a f172370a;

    /* renamed from: b, reason: collision with root package name */
    public final int f172371b;

    /* renamed from: com.stockbit.withdrawaldeposit.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC1785a {
        void a(int r1, View r2);
    }

    public a(InterfaceC1785a r1, int r2) {
        this.f172370a = r1;
        this.f172371b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f172370a.a(this.f172371b, r3);
    }
}
