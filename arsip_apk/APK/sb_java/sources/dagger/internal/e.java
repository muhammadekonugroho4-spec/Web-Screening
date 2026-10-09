package dagger.internal;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class e implements Map {

    /* renamed from: a, reason: collision with root package name */
    public final Map f173985a;

    public e(Map r1) {
        this.f173985a = r1;
    }

    public static Map a(Map r1) {
        return new e(r1);
    }

    public Object b(Class r1, Object r2) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public boolean containsKey(Object r2) {
        if ((r2 instanceof Class) == false) goto L7;
        return this.f173985a.containsKey(((Class) r2).getName());
    L7:
        throw new IllegalArgumentException("Key must be a class");
    }

    @Override // java.util.Map
    public boolean containsValue(Object r2) {
        return this.f173985a.containsValue(r2);
    }

    @Override // java.util.Map
    public Set entrySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public Object get(Object r2) {
        if ((r2 instanceof Class) == false) goto L7;
        return this.f173985a.get(((Class) r2).getName());
    L7:
        throw new IllegalArgumentException("Key must be a class");
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f173985a.isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object r1, Object r2) {
        return b((Class) r1, r2);
    }

    @Override // java.util.Map
    public void putAll(Map r2) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public Object remove(Object r2) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public int size() {
        return this.f173985a.size();
    }

    @Override // java.util.Map
    public Collection values() {
        return this.f173985a.values();
    }
}
