package com.stockbit.feature.history.generated.callback;

import android.view.View;

/* loaded from: classes9.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0908a f97188a;

    /* renamed from: b, reason: collision with root package name */
    public final int f97189b;

    /* renamed from: com.stockbit.feature.history.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC0908a {
        void a(int r1, View r2);
    }

    public a(InterfaceC0908a r1, int r2) {
        this.f97188a = r1;
        this.f97189b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f97188a.a(this.f97189b, r3);
    }
}
