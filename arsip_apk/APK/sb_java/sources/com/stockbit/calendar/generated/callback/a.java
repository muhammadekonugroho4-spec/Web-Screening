package com.stockbit.calendar.generated.callback;

import android.view.View;

/* loaded from: classes7.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0544a f50239a;

    /* renamed from: b, reason: collision with root package name */
    public final int f50240b;

    /* renamed from: com.stockbit.calendar.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC0544a {
        void a(int r1, View r2);
    }

    public a(InterfaceC0544a r1, int r2) {
        this.f50239a = r1;
        this.f50240b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f50239a.a(this.f50240b, r3);
    }
}
