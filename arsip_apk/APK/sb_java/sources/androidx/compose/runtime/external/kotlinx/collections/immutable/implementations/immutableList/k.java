package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

/* loaded from: classes.dex */
public final class k extends a {

    /* renamed from: c, reason: collision with root package name */
    public final Object f16199c;

    static {
    }

    public k(Object r2, int r3) {
        super(r3, 1);
        this.f16199c = r2;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        a();
        e(d() + 1);
        return this.f16199c;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        b();
        e(d() - 1);
        return this.f16199c;
    }
}
