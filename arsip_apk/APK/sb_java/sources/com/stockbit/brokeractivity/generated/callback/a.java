package com.stockbit.brokeractivity.generated.callback;

import android.view.View;

/* loaded from: classes4.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0538a f48259a;

    /* renamed from: b, reason: collision with root package name */
    public final int f48260b;

    /* renamed from: com.stockbit.brokeractivity.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC0538a {
        void a(int r1, View r2);
    }

    public a(InterfaceC0538a r1, int r2) {
        this.f48259a = r1;
        this.f48260b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f48259a.a(this.f48260b, r3);
    }
}
