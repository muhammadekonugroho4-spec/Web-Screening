package com.stockbit.sharetrade.generated.callback;

import android.view.View;

/* loaded from: classes11.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1241a f137133a;

    /* renamed from: b, reason: collision with root package name */
    public final int f137134b;

    /* renamed from: com.stockbit.sharetrade.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC1241a {
        void a(int r1, View r2);
    }

    public a(InterfaceC1241a r1, int r2) {
        this.f137133a = r1;
        this.f137134b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f137133a.a(this.f137134b, r3);
    }
}
