package androidx.navigation.compose.internal;

import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f26178a;

    static {
    }

    public c(Object r2) {
        this.f26178a = new WeakReference(r2);
    }

    public final void a() {
        this.f26178a.clear();
    }

    public final Object b() {
        return this.f26178a.get();
    }
}
