package com.stockbit.onboarding.generated.callback;

import android.view.View;

/* loaded from: classes10.dex */
public final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final a f123368a;

    /* renamed from: b, reason: collision with root package name */
    public final int f123369b;

    public interface a {
        void a(int r1, View r2);
    }

    public b(a r1, int r2) {
        this.f123368a = r1;
        this.f123369b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f123368a.a(this.f123369b, r3);
    }
}
