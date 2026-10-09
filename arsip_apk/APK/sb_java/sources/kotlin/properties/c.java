package kotlin.properties;

import kotlin.jvm.internal.p;
import kotlin.reflect.l;

/* loaded from: classes3.dex */
public abstract class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public Object f177525a;

    public c(Object r1) {
        this.f177525a = r1;
    }

    @Override // kotlin.properties.e, kotlin.properties.d
    public Object a(Object r1, l r2) {
        p.l(r2, "property");
        return this.f177525a;
    }

    @Override // kotlin.properties.e
    public void b(Object r2, l r3, Object r4) {
        p.l(r3, "property");
        Object r22 = this.f177525a;
        if (d(r3, r22, r4) == true) goto L5;
        return;
    L5:
        this.f177525a = r4;
        c(r3, r22, r4);
    }

    public void c(l r1, Object r2, Object r3) {
        p.l(r1, "property");
    }

    public boolean d(l r1, Object r2, Object r3) {
        p.l(r1, "property");
        return true;
    }

    public String toString() {
        return "ObservableProperty(value=" + this.f177525a + ')';
    }
}
