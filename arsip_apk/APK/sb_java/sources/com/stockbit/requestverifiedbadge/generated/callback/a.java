package com.stockbit.requestverifiedbadge.generated.callback;

import android.view.View;

/* loaded from: classes8.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1182a f130713a;

    /* renamed from: b, reason: collision with root package name */
    public final int f130714b;

    /* renamed from: com.stockbit.requestverifiedbadge.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC1182a {
        void a(int r1, View r2);
    }

    public a(InterfaceC1182a r1, int r2) {
        this.f130713a = r1;
        this.f130714b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f130713a.a(this.f130714b, r3);
    }
}
