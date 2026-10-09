package com.stockbit.amendbank.generated.callback;

import android.view.View;

/* loaded from: classes6.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0517a f46150a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46151b;

    /* renamed from: com.stockbit.amendbank.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC0517a {
        void a(int r1, View r2);
    }

    public a(InterfaceC0517a r1, int r2) {
        this.f46150a = r1;
        this.f46151b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f46150a.a(this.f46151b, r3);
    }
}
