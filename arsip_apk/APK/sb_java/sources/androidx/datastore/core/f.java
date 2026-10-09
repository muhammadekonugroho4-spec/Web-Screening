package androidx.datastore.core;

import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class f extends j {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f23678a;

    public f(Throwable r2) {
        p.l(r2, "finalException");
        super(null);
        this.f23678a = r2;
    }

    public final Throwable a() {
        return this.f23678a;
    }
}
