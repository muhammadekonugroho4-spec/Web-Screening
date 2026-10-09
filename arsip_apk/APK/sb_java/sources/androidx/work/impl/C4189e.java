package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;

/* renamed from: androidx.work.impl.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4189e implements androidx.work.C {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f29390a;

    public C4189e() {
        this.f29390a = androidx.core.os.h.a(Looper.getMainLooper());
    }

    @Override // androidx.work.C
    public void a(Runnable r2) {
        this.f29390a.removeCallbacks(r2);
    }

    @Override // androidx.work.C
    public void b(long r2, Runnable r4) {
        this.f29390a.postDelayed(r4, r2);
    }
}
