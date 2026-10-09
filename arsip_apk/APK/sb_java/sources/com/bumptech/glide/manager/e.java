package com.bumptech.glide.manager;

import android.content.Context;
import com.bumptech.glide.manager.c;

/* loaded from: classes4.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33201a;

    /* renamed from: b, reason: collision with root package name */
    public final c.a f33202b;

    public e(Context r1, c.a r2) {
        this.f33201a = r1.getApplicationContext();
        this.f33202b = r2;
    }

    public final void c() {
        u.a(this.f33201a).d(this.f33202b);
    }

    public final void f() {
        u.a(this.f33201a).e(this.f33202b);
    }

    @Override // com.bumptech.glide.manager.n
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.n
    public void onStart() {
        c();
    }

    @Override // com.bumptech.glide.manager.n
    public void onStop() {
        f();
    }
}
