package com.stockbit.userauth.generated.callback;

import android.view.View;

/* loaded from: classes2.dex */
public final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final a f165085a;

    /* renamed from: b, reason: collision with root package name */
    public final int f165086b;

    public interface a {
        void a(int r1, View r2);
    }

    public b(a r1, int r2) {
        this.f165085a = r1;
        this.f165086b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f165085a.a(this.f165086b, r3);
    }
}
