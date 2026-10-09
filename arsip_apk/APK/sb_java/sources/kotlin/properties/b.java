package kotlin.properties;

import kotlin.jvm.internal.p;
import kotlin.reflect.l;

/* loaded from: classes3.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public Object f177524a;

    public b() {
    }

    @Override // kotlin.properties.e, kotlin.properties.d
    public Object a(Object r3, l r4) {
        p.l(r4, "property");
        Object r32 = this.f177524a;
        if (r32 == null) goto L6;
        return r32;
    L6:
        throw new IllegalStateException("Property " + r4.getName() + " should be initialized before get.");
    }

    @Override // kotlin.properties.e
    public void b(Object r1, l r2, Object r3) {
        p.l(r2, "property");
        p.l(r3, "value");
        this.f177524a = r3;
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append("NotNullProperty(");
        if (this.f177524a == null) goto L5;
        String r1 = "value=" + this.f177524a;
    L6:
        r02.append(r1);
        r02.append(')');
        return r02.toString();
    L5:
        r1 = "value not initialized yet";
        goto L6
    }
}
