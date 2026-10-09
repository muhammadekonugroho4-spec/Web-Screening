package androidx.paging;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.collections.AbstractC11760d;

/* loaded from: classes4.dex */
public final class r extends AbstractC11760d {

    /* renamed from: b, reason: collision with root package name */
    public final int f27026b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27027c;
    public final List d;

    public r(int r2, int r3, List r4) {
        kotlin.jvm.internal.p.l(r4, FirebaseAnalytics.Param.ITEMS);
        this.f27026b = r2;
        this.f27027c = r3;
        this.d = r4;
    }

    @Override // kotlin.collections.AbstractC11760d, java.util.List
    public Object get(int r4) {
        if (r4 >= 0) goto L5;
    L7:
        int r1 = this.f27026b;
        if (r4 >= (this.d.size() + r1)) goto L12;
        if (r1 > r4) goto L12;
        return this.d.get(r4 - this.f27026b);
    L12:
        int r12 = this.f27026b + this.d.size();
        if (r4 >= size()) goto L17;
        if (r12 > r4) goto L17;
        return null;
    L17:
        throw new IndexOutOfBoundsException("Illegal attempt to access index " + r4 + " in ItemSnapshotList of size " + size());
    L5:
        if (r4 >= this.f27026b) goto L7;
        return null;
    }

    @Override // kotlin.collections.AbstractC11758b
    public int getSize() {
        return (this.f27026b + this.d.size()) + this.f27027c;
    }
}
