package androidx.glance.action;

import androidx.glance.action.d;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class g extends d {

    /* renamed from: a, reason: collision with root package name */
    public final Map f24653a;

    static {
    }

    public g(Map r1) {
        this.f24653a = r1;
    }

    @Override // androidx.glance.action.d
    public Map a() {
        return Collections.unmodifiableMap(this.f24653a);
    }

    public Object b(d.a r2) {
        return this.f24653a.get(r2);
    }

    public final Object c(d.a r2) {
        return this.f24653a.remove(r2);
    }

    public final Object d(d.a r3, Object r4) {
        Object r02 = b(r3);
        if (r4 != null) goto L6;
        c(r3);
        return r02;
    L6:
        this.f24653a.put(r3, r4);
        return r02;
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof g) == true) goto L5;
        return false;
    L5:
        if (p.g(this.f24653a, ((g) r2).f24653a) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public int hashCode() {
        return this.f24653a.hashCode();
    }

    public String toString() {
        return this.f24653a.toString();
    }
}
