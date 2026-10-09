package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class u implements t {

    /* renamed from: a, reason: collision with root package name */
    public final List f178239a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f178240b;

    /* renamed from: c, reason: collision with root package name */
    public final List f178241c;
    public final Set d;

    public u(List r2, Set r3, List r4, Set r5) {
        kotlin.jvm.internal.p.l(r2, "allDependencies");
        kotlin.jvm.internal.p.l(r3, "modulesWhoseInternalsAreVisible");
        kotlin.jvm.internal.p.l(r4, "directExpectedByDependencies");
        kotlin.jvm.internal.p.l(r5, "allExpectedByDependencies");
        this.f178239a = r2;
        this.f178240b = r3;
        this.f178241c = r4;
        this.d = r5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t
    public List a() {
        return this.f178241c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t
    public Set b() {
        return this.f178240b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.t
    public List c() {
        return this.f178239a;
    }
}
