package com.stockbit.core.generated.callback;

import android.view.View;

/* loaded from: classes8.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0749a f78630a;

    /* renamed from: b, reason: collision with root package name */
    public final int f78631b;

    /* renamed from: com.stockbit.core.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC0749a {
        void a(int r1, View r2);
    }

    public a(InterfaceC0749a r1, int r2) {
        this.f78630a = r1;
        this.f78631b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f78630a.a(this.f78631b, r3);
    }
}
