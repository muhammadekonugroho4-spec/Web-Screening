package com.stockbit.feature.order.generated.callback;

import android.view.View;

/* loaded from: classes9.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0925a f101115a;

    /* renamed from: b, reason: collision with root package name */
    public final int f101116b;

    /* renamed from: com.stockbit.feature.order.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC0925a {
        void a(int r1, View r2);
    }

    public a(InterfaceC0925a r1, int r2) {
        this.f101115a = r1;
        this.f101116b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f101115a.a(this.f101116b, r3);
    }
}
