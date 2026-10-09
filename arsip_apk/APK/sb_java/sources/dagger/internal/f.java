package dagger.internal;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Map f173986a;

    public f(int r1) {
        this.f173986a = a.b(r1);
    }

    public static f b(int r1) {
        return new f(r1);
    }

    public Map a() {
        if (this.f173986a.isEmpty() == false) goto L7;
        return Collections.EMPTY_MAP;
    L7:
        return Collections.unmodifiableMap(this.f173986a);
    }

    public f c(Object r2, Object r3) {
        this.f173986a.put(r2, r3);
        return this;
    }
}
