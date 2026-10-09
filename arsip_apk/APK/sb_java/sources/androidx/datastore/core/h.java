package androidx.datastore.core;

import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class h extends j {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f23679a;

    public h(Throwable r2) {
        p.l(r2, "readException");
        super(null);
        this.f23679a = r2;
    }

    public final Throwable a() {
        return this.f23679a;
    }
}
