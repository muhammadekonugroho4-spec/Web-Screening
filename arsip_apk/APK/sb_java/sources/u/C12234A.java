package u;

import kotlin.jvm.internal.Lambda;

/* renamed from: u.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12234A extends Lambda implements kotlin.jvm.functions.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f184293a;

    public C12234A(Throwable r1) {
        this.f184293a = r1;
        super(0);
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        return kotlin.jvm.internal.p.u("CSOkHttpSocketClient::Socket failed with ", this.f184293a.getMessage());
    }
}
