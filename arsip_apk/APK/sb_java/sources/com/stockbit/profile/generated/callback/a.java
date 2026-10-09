package com.stockbit.profile.generated.callback;

import android.view.View;

/* loaded from: classes10.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1157a f127612a;

    /* renamed from: b, reason: collision with root package name */
    public final int f127613b;

    /* renamed from: com.stockbit.profile.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC1157a {
        void a(int r1, View r2);
    }

    public a(InterfaceC1157a r1, int r2) {
        this.f127612a = r1;
        this.f127613b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f127612a.a(this.f127613b, r3);
    }
}
