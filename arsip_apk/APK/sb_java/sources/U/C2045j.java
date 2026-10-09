package U;

import android.content.Context;

/* renamed from: U.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2045j implements dagger.internal.c {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.c f1264a;

    public C2045j(C2041f r1, dagger.internal.c r2) {
        this.f1264a = r2;
    }

    @Override // javax.inject.a
    public final Object get() {
        Context r02 = (Context) this.f1264a.get();
        kotlin.jvm.internal.p.l(r02, "context");
        return (G0.f) dagger.internal.g.e(new G0.f(r02));
    }
}
