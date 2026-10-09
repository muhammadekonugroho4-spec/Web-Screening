package com.stockbit.common.generated.callback;

import android.view.View;

/* loaded from: classes7.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0627a f60607a;

    /* renamed from: b, reason: collision with root package name */
    public final int f60608b;

    /* renamed from: com.stockbit.common.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC0627a {
        void a(int r1, View r2);
    }

    public a(InterfaceC0627a r1, int r2) {
        this.f60607a = r1;
        this.f60608b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f60607a.a(this.f60608b, r3);
    }
}
