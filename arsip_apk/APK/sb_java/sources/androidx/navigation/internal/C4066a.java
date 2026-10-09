package androidx.navigation.internal;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.navigation.internal.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4066a {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f26301a;

    public C4066a(int r2) {
        this.f26301a = new AtomicInteger(r2);
    }

    public final int a() {
        return this.f26301a.decrementAndGet();
    }

    public final int b() {
        return this.f26301a.get();
    }

    public final int c() {
        return this.f26301a.incrementAndGet();
    }
}
