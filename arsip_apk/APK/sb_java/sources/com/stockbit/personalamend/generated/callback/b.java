package com.stockbit.personalamend.generated.callback;

import android.view.View;

/* loaded from: classes10.dex */
public final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final a f125272a;

    /* renamed from: b, reason: collision with root package name */
    public final int f125273b;

    public interface a {
        void a(int r1, View r2);
    }

    public b(a r1, int r2) {
        this.f125272a = r1;
        this.f125273b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f125272a.a(this.f125273b, r3);
    }
}
