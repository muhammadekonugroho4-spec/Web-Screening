package com.stockbit.component.yesnodialog.generated.callback;

import android.view.View;

/* loaded from: classes8.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0745a f78237a;

    /* renamed from: b, reason: collision with root package name */
    public final int f78238b;

    /* renamed from: com.stockbit.component.yesnodialog.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC0745a {
        void a(int r1, View r2);
    }

    public a(InterfaceC0745a r1, int r2) {
        this.f78237a = r1;
        this.f78238b = r2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View r3) {
        this.f78237a.a(this.f78238b, r3);
    }
}
