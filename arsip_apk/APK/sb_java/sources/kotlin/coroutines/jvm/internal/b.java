package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.i;

/* loaded from: classes3.dex */
public final class b implements kotlin.coroutines.e {

    /* renamed from: a, reason: collision with root package name */
    public static final b f177417a = null;

    static {
        f177417a = new b();
    }

    public b() {
    }

    @Override // kotlin.coroutines.e
    public i getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // kotlin.coroutines.e
    public void resumeWith(Object r2) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
