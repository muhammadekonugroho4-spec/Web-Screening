package kotlin.sequences;

import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class k {
    public k() {
    }

    public abstract Object a(Object r1, kotlin.coroutines.e r2);

    public abstract Object b(Iterator r1, kotlin.coroutines.e r2);

    public final Object d(i r1, kotlin.coroutines.e r2) {
        Object r12 = b(r1.iterator(), r2);
        if (r12 != kotlin.coroutines.intrinsics.a.g()) goto L6;
        return r12;
    L6:
        return kotlin.w.f180450a;
    }
}
