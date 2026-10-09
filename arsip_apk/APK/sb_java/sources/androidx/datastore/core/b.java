package androidx.datastore.core;

/* loaded from: classes4.dex */
public final class b extends j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f23675a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23676b;

    public b(Object r2, int r3) {
        super(null);
        this.f23675a = r2;
        this.f23676b = r3;
    }

    public final void a() {
        Object r02 = this.f23675a;
        boolean r1 = false;
        if (r02 == null) goto L5;
        int r03 = r02.hashCode();
    L7:
        if (r03 != this.f23676b) goto L9;
        r1 = true;
    L9:
        if (r1 == false) goto L12;
        return;
    L12:
        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
    L5:
        r03 = 0;
        goto L7
    }

    public final Object b() {
        return this.f23675a;
    }
}
