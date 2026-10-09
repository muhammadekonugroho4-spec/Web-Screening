package com.stockbit.discoverfriend.generated.callback;

import android.view.View;

/* loaded from: classes8.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0765a f80347a;

    /* renamed from: b, reason: collision with root package name */
    public final int f80348b;

    /* renamed from: com.stockbit.discoverfriend.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC0765a {
        void a(int r1, View r2);
    }

    public a(InterfaceC0765a r1, int r2) {
        this.f80347a = r1;
        this.f80348b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f80347a.a(this.f80348b, r3);
    }
}
