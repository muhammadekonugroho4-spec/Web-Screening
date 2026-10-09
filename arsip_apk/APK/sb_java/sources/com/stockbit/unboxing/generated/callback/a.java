package com.stockbit.unboxing.generated.callback;

import android.view.View;

/* loaded from: classes11.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1385a f154113a;

    /* renamed from: b, reason: collision with root package name */
    public final int f154114b;

    /* renamed from: com.stockbit.unboxing.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC1385a {
        void a(int r1, View r2);
    }

    public a(InterfaceC1385a r1, int r2) {
        this.f154113a = r1;
        this.f154114b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f154113a.a(this.f154114b, r3);
    }
}
