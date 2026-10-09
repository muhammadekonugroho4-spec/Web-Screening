package com.stockbit.referral.generated.callback;

import android.view.View;

/* loaded from: classes10.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1166a f128921a;

    /* renamed from: b, reason: collision with root package name */
    public final int f128922b;

    /* renamed from: com.stockbit.referral.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC1166a {
        void a(int r1, View r2);
    }

    public a(InterfaceC1166a r1, int r2) {
        this.f128921a = r1;
        this.f128922b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f128921a.a(this.f128922b, r3);
    }
}
