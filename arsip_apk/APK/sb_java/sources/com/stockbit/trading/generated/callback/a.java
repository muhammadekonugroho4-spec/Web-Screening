package com.stockbit.trading.generated.callback;

import android.view.View;

/* loaded from: classes11.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1330a f146909a;

    /* renamed from: b, reason: collision with root package name */
    public final int f146910b;

    /* renamed from: com.stockbit.trading.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC1330a {
        void a(int r1, View r2);
    }

    public a(InterfaceC1330a r1, int r2) {
        this.f146909a = r1;
        this.f146910b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f146909a.a(this.f146910b, r3);
    }
}
