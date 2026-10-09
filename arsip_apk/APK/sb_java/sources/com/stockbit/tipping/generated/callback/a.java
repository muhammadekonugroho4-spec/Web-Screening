package com.stockbit.tipping.generated.callback;

import android.view.View;

/* loaded from: classes11.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1324a f145876a;

    /* renamed from: b, reason: collision with root package name */
    public final int f145877b;

    /* renamed from: com.stockbit.tipping.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC1324a {
        void a(int r1, View r2);
    }

    public a(InterfaceC1324a r1, int r2) {
        this.f145876a = r1;
        this.f145877b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f145876a.a(this.f145877b, r3);
    }
}
