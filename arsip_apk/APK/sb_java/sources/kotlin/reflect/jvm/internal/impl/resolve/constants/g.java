package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.types.B;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f179615a;

    public g(Object r1) {
        this.f179615a = r1;
    }

    public abstract B a(kotlin.reflect.jvm.internal.impl.descriptors.B r1);

    public Object b() {
        return this.f179615a;
    }

    public boolean equals(Object r4) {
        if (this == r4) goto L14;
        Object r02 = b();
        Object r2 = null;
        if ((r4 instanceof g) == false) goto L6;
        g r42 = (g) r4;
    L7:
        if (r42 == null) goto L10;
        r2 = r42.b();
    L10:
        if (kotlin.jvm.internal.p.g(r02, r2) == true) goto L16;
        return false;
    L16:
        return true;
    L6:
        r42 = null;
        goto L7
    L14:
        return true;
    }

    public int hashCode() {
        Object r02 = b();
        if (r02 != null) goto L5;
        return 0;
    L5:
        return r02.hashCode();
    }

    public String toString() {
        return String.valueOf(b());
    }
}
