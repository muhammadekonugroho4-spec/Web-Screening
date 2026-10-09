package com.stockbit.eipo.generated.callback;

import android.view.View;

/* loaded from: classes8.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0849a f89153a;

    /* renamed from: b, reason: collision with root package name */
    public final int f89154b;

    /* renamed from: com.stockbit.eipo.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC0849a {
        void a(int r1, View r2);
    }

    public a(InterfaceC0849a r1, int r2) {
        this.f89153a = r1;
        this.f89154b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f89153a.a(this.f89154b, r3);
    }
}
