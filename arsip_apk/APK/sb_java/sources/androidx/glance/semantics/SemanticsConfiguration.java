package androidx.glance.semantics;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class SemanticsConfiguration implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Map f25364a;

    static {
    }

    public SemanticsConfiguration() {
        this.f25364a = new LinkedHashMap();
    }

    @Override // androidx.glance.semantics.e
    public void a(d r2, Object r3) {
        this.f25364a.put(r2, r3);
    }

    public final Object b(d r2, kotlin.jvm.functions.a r3) {
        Object r22 = this.f25364a.get(r2);
        if (r22 == null) goto L5;
        return r22;
    L5:
        return r3.invoke();
    }

    public final Object c(d r2) {
        return b(r2, SemanticsConfiguration$getOrNull$1.f25365g);
    }
}
