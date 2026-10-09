package com.stockbit.chat.generated.callback;

import android.view.View;

/* loaded from: classes7.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0565a f55362a;

    /* renamed from: b, reason: collision with root package name */
    public final int f55363b;

    /* renamed from: com.stockbit.chat.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC0565a {
        void a(int r1, View r2);
    }

    public a(InterfaceC0565a r1, int r2) {
        this.f55362a = r1;
        this.f55363b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f55362a.a(this.f55363b, r3);
    }
}
