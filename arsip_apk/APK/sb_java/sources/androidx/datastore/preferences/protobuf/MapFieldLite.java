package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class MapFieldLite<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public static final MapFieldLite f23760a = null;
    private boolean isMutable;

    static {
        MapFieldLite r02 = new MapFieldLite();
        f23760a = r02;
        r02.o();
    }

    private MapFieldLite() {
        this.isMutable = true;
    }

    public static int a(Map r3) {
        Iterator<Map.Entry<K, V>> r32 = r3.entrySet().iterator();
        int r02 = 0;
    L4:
        if (r32.hasNext() == false) goto L6;
        Map.Entry<K, V> r1 = r32.next();
        int r2 = b(r1.getKey());
        r02 = r02 + (b(r1.getValue()) ^ r2);
        goto L4
    L6:
        return r02;
    }

    public static int b(Object r1) {
        if ((r1 instanceof byte[]) == false) goto L7;
        return AbstractC3930u.d((byte[]) r1);
    L7:
        return r1.hashCode();
    }

    public static void e(Map r2) {
        Iterator<K> r02 = r2.keySet().iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        K r1 = r02.next();
        AbstractC3930u.a(r1);
        AbstractC3930u.a(r2.get(r1));
        goto L4
    }

    public static MapFieldLite g() {
        return f23760a;
    }

    public static boolean i(Object r1, Object r2) {
        if ((r1 instanceof byte[]) == false) goto L9;
        if ((r2 instanceof byte[]) == false) goto L9;
        return Arrays.equals((byte[]) r1, (byte[]) r2);
    L9:
        return r1.equals(r2);
    }

    public static boolean j(Map r4, Map r5) {
        if (r4 != r5) goto L6;
        return true;
    L6:
        if (r4.size() == r5.size()) goto L8;
        return false;
    L8:
        Iterator<Map.Entry<K, V>> r42 = r4.entrySet().iterator();
    L10:
        if (r42.hasNext() == false) goto L17;
        Map.Entry<K, V> r1 = r42.next();
        if (r5.containsKey(r1.getKey()) == false) goto L13;
        if (i(r1.getValue(), r5.get(r1.getKey())) == true) goto L10;
        return false;
    L13:
        return false;
    L17:
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        h();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (isEmpty() == false) goto L7;
        return Collections.EMPTY_SET;
    L7:
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object r2) {
        if ((r2 instanceof Map) == true) goto L5;
        return false;
    L5:
        if (j(this, (Map) r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final void h() {
        if (m() == false) goto L6;
        return;
    L6:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return a(this);
    }

    public boolean m() {
        return this.isMutable;
    }

    public void o() {
        this.isMutable = false;
    }

    public void p(MapFieldLite r2) {
        h();
        if (r2.isEmpty() == true) goto L6;
        putAll(r2);
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object r1, Object r2) {
        h();
        AbstractC3930u.a(r1);
        AbstractC3930u.a(r2);
        return super.put(r1, r2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map r1) {
        h();
        e(r1);
        super.putAll(r1);
    }

    public MapFieldLite q() {
        if (isEmpty() == false) goto L7;
        return new MapFieldLite();
    L7:
        return new MapFieldLite(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object r1) {
        h();
        return super.remove(r1);
    }

    public MapFieldLite(Map r1) {
        super(r1);
        this.isMutable = true;
    }
}
