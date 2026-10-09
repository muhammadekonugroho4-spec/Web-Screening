package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public abstract class a implements Comparable {
    public a() {
    }

    public int a(a r3) {
        p.l(r3, "other");
        int r02 = b().compareTo(r3.b());
        if (r02 == 0) goto L5;
    L10:
        return r02;
    L5:
        if (c() == true) goto L10;
        if (r3.c() == false) goto L10;
        return 1;
    }

    public abstract DeprecationLevelValue b();

    public abstract boolean c();

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return a((a) r1);
    }
}
