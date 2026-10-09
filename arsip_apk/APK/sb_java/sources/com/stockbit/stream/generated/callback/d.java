package com.stockbit.stream.generated.callback;

import androidx.databinding.adapters.e;

/* loaded from: classes11.dex */
public final class d implements e.d {

    /* renamed from: a, reason: collision with root package name */
    public final a f141315a;

    /* renamed from: b, reason: collision with root package name */
    public final int f141316b;

    public interface a {
        void d(int r1, CharSequence r2, int r3, int r4, int r5);
    }

    public d(a r1, int r2) {
        this.f141315a = r1;
        this.f141316b = r2;
    }

    @Override // androidx.databinding.adapters.e.d
    public void onTextChanged(CharSequence r7, int r8, int r9, int r10) {
        this.f141315a.d(this.f141316b, r7, r8, r9, r10);
    }
}
