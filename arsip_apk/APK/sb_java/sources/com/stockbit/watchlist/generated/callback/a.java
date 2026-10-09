package com.stockbit.watchlist.generated.callback;

import android.view.View;

/* loaded from: classes2.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1759a f168616a;

    /* renamed from: b, reason: collision with root package name */
    public final int f168617b;

    /* renamed from: com.stockbit.watchlist.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC1759a {
        void a(int r1, View r2);
    }

    public a(InterfaceC1759a r1, int r2) {
        this.f168616a = r1;
        this.f168617b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f168616a.a(this.f168617b, r3);
    }
}
