package com.stockbit.tradingcommunity.generated.callback;

import android.view.View;

/* loaded from: classes11.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1353a f149349a;

    /* renamed from: b, reason: collision with root package name */
    public final int f149350b;

    /* renamed from: com.stockbit.tradingcommunity.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC1353a {
        void a(int r1, View r2);
    }

    public a(InterfaceC1353a r1, int r2) {
        this.f149349a = r1;
        this.f149350b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f149349a.a(this.f149350b, r3);
    }
}
