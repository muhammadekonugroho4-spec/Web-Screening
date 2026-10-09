package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC11804k;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationLevelValue;

/* loaded from: classes3.dex */
public final class e extends kotlin.reflect.jvm.internal.impl.resolve.deprecation.b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC11804k f178494a;

    public e(InterfaceC11804k r2) {
        kotlin.jvm.internal.p.l(r2, "target");
        this.f178494a = r2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.deprecation.a
    public DeprecationLevelValue b() {
        return DeprecationLevelValue.ERROR;
    }
}
