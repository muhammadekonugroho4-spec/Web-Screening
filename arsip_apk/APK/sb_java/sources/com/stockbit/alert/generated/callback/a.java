package com.stockbit.alert.generated.callback;

import android.view.View;

/* loaded from: classes6.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0505a f44689a;

    /* renamed from: b, reason: collision with root package name */
    public final int f44690b;

    /* renamed from: com.stockbit.alert.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC0505a {
        void a(int r1, View r2);
    }

    public a(InterfaceC0505a r1, int r2) {
        this.f44689a = r1;
        this.f44690b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f44689a.a(this.f44690b, r3);
    }
}
