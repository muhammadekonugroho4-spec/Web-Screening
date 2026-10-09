package com.stockbit.stream.generated.callback;

import android.view.View;

/* loaded from: classes11.dex */
public final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final a f141311a;

    /* renamed from: b, reason: collision with root package name */
    public final int f141312b;

    public interface a {
        void a(int r1, View r2);
    }

    public b(a r1, int r2) {
        this.f141311a = r1;
        this.f141312b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f141311a.a(this.f141312b, r3);
    }
}
