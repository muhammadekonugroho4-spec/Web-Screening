package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class a implements i {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f180294a;

    public a(i r2) {
        kotlin.jvm.internal.p.l(r2, "sequence");
        this.f180294a = new AtomicReference(r2);
    }

    @Override // kotlin.sequences.i
    public Iterator iterator() {
        i r02 = (i) this.f180294a.getAndSet(null);
        if (r02 == null) goto L7;
        return r02.iterator();
    L7:
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
