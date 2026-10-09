package com.stockbit.stream.generated.callback;

import android.widget.CompoundButton;

/* loaded from: classes11.dex */
public final class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1264a f141309a;

    /* renamed from: b, reason: collision with root package name */
    public final int f141310b;

    /* renamed from: com.stockbit.stream.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC1264a {
        void f(int r1, CompoundButton r2, boolean r3);
    }

    public a(InterfaceC1264a r1, int r2) {
        this.f141309a = r1;
        this.f141310b = r2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton r3, boolean r4) {
        this.f141309a.f(this.f141310b, r3, r4);
    }
}
