package com.stockbit.feature.transaction.generated.callback;

import android.view.View;

/* loaded from: classes9.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0967a f108048a;

    /* renamed from: b, reason: collision with root package name */
    public final int f108049b;

    /* renamed from: com.stockbit.feature.transaction.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC0967a {
        void a(int r1, View r2);
    }

    public a(InterfaceC0967a r1, int r2) {
        this.f108048a = r1;
        this.f108049b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f108048a.a(this.f108049b, r3);
    }
}
