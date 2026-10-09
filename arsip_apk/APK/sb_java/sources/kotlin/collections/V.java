package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class V extends AbstractC11760d implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final List f177343b;

    /* renamed from: c, reason: collision with root package name */
    public int f177344c;
    public int d;

    public V(List r2) {
        kotlin.jvm.internal.p.l(r2, "list");
        this.f177343b = r2;
    }

    public final void d(int r3, int r4) {
        AbstractC11760d.f177382a.d(r3, r4, this.f177343b.size());
        this.f177344c = r3;
        this.d = r4 - r3;
    }

    @Override // kotlin.collections.AbstractC11760d, java.util.List
    public Object get(int r3) {
        AbstractC11760d.f177382a.b(r3, this.d);
        return this.f177343b.get(this.f177344c + r3);
    }

    @Override // kotlin.collections.AbstractC11758b
    public int getSize() {
        return this.d;
    }
}
