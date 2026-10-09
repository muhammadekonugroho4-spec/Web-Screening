package com.stockbit.screener.generated.callback;

import android.widget.RadioGroup;

/* loaded from: classes11.dex */
public final class a implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1193a f132096a;

    /* renamed from: b, reason: collision with root package name */
    public final int f132097b;

    /* renamed from: com.stockbit.screener.generated.callback.a$a, reason: collision with other inner class name */
    public interface InterfaceC1193a {
        void h(int r1, RadioGroup r2, int r3);
    }

    public a(InterfaceC1193a r1, int r2) {
        this.f132096a = r1;
        this.f132097b = r2;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup r3, int r4) {
        this.f132096a.h(this.f132097b, r3, r4);
    }
}
