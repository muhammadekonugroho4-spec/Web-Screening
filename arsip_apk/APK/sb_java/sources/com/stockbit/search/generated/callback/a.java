package com.stockbit.search.generated.callback;

import android.view.View;

/* loaded from: classes11.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1203a f133774a;

    /* renamed from: b, reason: collision with root package name */
    public final int f133775b;

    /* renamed from: com.stockbit.search.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC1203a {
        void a(int r1, View r2);
    }

    public a(InterfaceC1203a r1, int r2) {
        this.f133774a = r1;
        this.f133775b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f133774a.a(this.f133775b, r3);
    }
}
