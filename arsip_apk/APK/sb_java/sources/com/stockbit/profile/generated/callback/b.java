package com.stockbit.profile.generated.callback;

import androidx.databinding.adapters.e;

/* loaded from: classes10.dex */
public final class b implements e.d {

    /* renamed from: a, reason: collision with root package name */
    public final a f127614a;

    /* renamed from: b, reason: collision with root package name */
    public final int f127615b;

    public interface a {
        void d(int r1, CharSequence r2, int r3, int r4, int r5);
    }

    public b(a r1, int r2) {
        this.f127614a = r1;
        this.f127615b = r2;
    }

    @Override // androidx.databinding.adapters.e.d
    public void onTextChanged(CharSequence r7, int r8, int r9, int r10) {
        this.f127614a.d(this.f127615b, r7, r8, r9, r10);
    }
}
