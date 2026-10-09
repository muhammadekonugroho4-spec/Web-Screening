package androidx.collection;

import java.util.Map;

/* loaded from: classes.dex */
public final class C implements Map.Entry, kotlin.jvm.internal.markers.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6352a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6353b;

    public C(Object r1, Object r2) {
        this.f6352a = r1;
        this.f6353b = r2;
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f6352a;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f6353b;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
