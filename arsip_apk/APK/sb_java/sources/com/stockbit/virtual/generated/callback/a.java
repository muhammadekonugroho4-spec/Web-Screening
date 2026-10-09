package com.stockbit.virtual.generated.callback;

import android.view.View;

/* loaded from: classes2.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1749a f166482a;

    /* renamed from: b, reason: collision with root package name */
    public final int f166483b;

    /* renamed from: com.stockbit.virtual.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC1749a {
        void a(int r1, View r2);
    }

    public a(InterfaceC1749a r1, int r2) {
        this.f166482a = r1;
        this.f166483b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f166482a.a(this.f166483b, r3);
    }
}
