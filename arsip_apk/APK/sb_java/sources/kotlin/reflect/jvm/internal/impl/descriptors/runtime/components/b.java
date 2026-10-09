package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.p;
import kotlin.reflect.jvm.internal.impl.descriptors.S;
import kotlin.reflect.jvm.internal.impl.descriptors.T;

/* loaded from: classes3.dex */
public final class b implements S {

    /* renamed from: b, reason: collision with root package name */
    public final Annotation f178319b;

    public b(Annotation r2) {
        p.l(r2, "annotation");
        this.f178319b = r2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.S
    public T b() {
        T r02 = T.f178016a;
        p.k(r02, "NO_SOURCE_FILE");
        return r02;
    }

    public final Annotation d() {
        return this.f178319b;
    }
}
