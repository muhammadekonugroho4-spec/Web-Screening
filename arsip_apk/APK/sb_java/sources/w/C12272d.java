package w;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;

/* renamed from: w.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12272d extends Lambda implements kotlin.jvm.functions.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Exception f184424a;

    public C12272d(Exception r1) {
        this.f184424a = r1;
        super(0);
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        return p.u("CSBaseEventFlushWorkManager: ", this.f184424a.getMessage());
    }
}
