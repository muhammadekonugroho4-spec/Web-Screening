package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public final class d implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final d f177403a = null;

    static {
        f177403a = new d();
    }

    public d() {
    }

    public int a(Comparable r2, Comparable r3) {
        p.l(r2, "a");
        p.l(r3, "b");
        return r2.compareTo(r3);
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object r1, Object r2) {
        return a((Comparable) r1, (Comparable) r2);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return e.f177404a;
    }
}
