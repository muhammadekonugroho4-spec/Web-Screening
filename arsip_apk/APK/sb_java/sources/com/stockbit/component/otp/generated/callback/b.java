package com.stockbit.component.otp.generated.callback;

import android.view.View;

/* loaded from: classes7.dex */
public final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final a f73367a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73368b;

    public interface a {
        void a(int r1, View r2);
    }

    public b(a r1, int r2) {
        this.f73367a = r1;
        this.f73368b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f73367a.a(this.f73368b, r3);
    }
}
