package com.stockbit.runningtrade.generated.callback;

import android.view.View;

/* loaded from: classes10.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1189a f131120a;

    /* renamed from: b, reason: collision with root package name */
    public final int f131121b;

    /* renamed from: com.stockbit.runningtrade.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC1189a {
        void a(int r1, View r2);
    }

    public a(InterfaceC1189a r1, int r2) {
        this.f131120a = r1;
        this.f131121b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f131120a.a(this.f131121b, r3);
    }
}
