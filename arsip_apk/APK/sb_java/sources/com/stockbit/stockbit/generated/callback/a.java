package com.stockbit.stockbit.generated.callback;

import android.view.View;

/* loaded from: classes11.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1251a f138746a;

    /* renamed from: b, reason: collision with root package name */
    public final int f138747b;

    /* renamed from: com.stockbit.stockbit.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC1251a {
        void a(int r1, View r2);
    }

    public a(InterfaceC1251a r1, int r2) {
        this.f138746a = r1;
        this.f138747b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f138746a.a(this.f138747b, r3);
    }
}
