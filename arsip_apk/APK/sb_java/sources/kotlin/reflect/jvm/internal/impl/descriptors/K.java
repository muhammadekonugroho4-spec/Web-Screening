package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;

/* loaded from: classes3.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC11791g f177996a;

    /* renamed from: b, reason: collision with root package name */
    public final List f177997b;

    /* renamed from: c, reason: collision with root package name */
    public final K f177998c;

    public K(InterfaceC11791g r2, List r3, K r4) {
        kotlin.jvm.internal.p.l(r2, "classifierDescriptor");
        kotlin.jvm.internal.p.l(r3, "arguments");
        this.f177996a = r2;
        this.f177997b = r3;
        this.f177998c = r4;
    }

    public final List a() {
        return this.f177997b;
    }

    public final InterfaceC11791g b() {
        return this.f177996a;
    }

    public final K c() {
        return this.f177998c;
    }
}
