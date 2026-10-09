package com.stockbit.transferstock.generated.callback;

import android.view.View;

/* loaded from: classes11.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1363a f150649a;

    /* renamed from: b, reason: collision with root package name */
    public final int f150650b;

    /* renamed from: com.stockbit.transferstock.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC1363a {
        void a(int r1, View r2);
    }

    public a(InterfaceC1363a r1, int r2) {
        this.f150649a = r1;
        this.f150650b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f150649a.a(this.f150650b, r3);
    }
}
