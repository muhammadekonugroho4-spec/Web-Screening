package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;

/* loaded from: classes.dex */
public class b implements Map.Entry, kotlin.jvm.internal.markers.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16205a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16206b;

    static {
    }

    public b(Object r1, Object r2) {
        this.f16205a = r1;
        this.f16206b = r2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object r4) {
        if ((r4 instanceof Map.Entry) == false) goto L5;
        Map.Entry r42 = (Map.Entry) r4;
    L7:
        if (r42 != null) goto L9;
    L14:
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(r42.getKey(), getKey()) == false) goto L14;
        if (kotlin.jvm.internal.p.g(r42.getValue(), getValue()) == false) goto L14;
        return true;
    L5:
        r42 = null;
        goto L7
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f16205a;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f16206b;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Object r02 = getKey();
        int r1 = 0;
        if (r02 == null) goto L5;
        int r03 = r02.hashCode();
    L6:
        Object r2 = getValue();
        if (r2 == null) goto L10;
        r1 = r2.hashCode();
    L10:
        return r03 ^ r1;
    L5:
        r03 = 0;
        goto L6
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append(getKey());
        r02.append('=');
        r02.append(getValue());
        return r02.toString();
    }
}
