package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.Internal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class MapFieldLite<K, V> extends LinkedHashMap<K, V> {
    private static final MapFieldLite<?, ?> EMPTY_MAP_FIELD = null;
    private boolean isMutable;

    static {
        MapFieldLite<?, ?> r02 = new MapFieldLite();
        EMPTY_MAP_FIELD = r02;
        r02.makeImmutable();
    }

    private MapFieldLite() {
        this.isMutable = true;
    }

    public static <K, V> int calculateHashCodeForMap(Map<K, V> r3) {
        Iterator<Map.Entry<K, V>> r32 = r3.entrySet().iterator();
        int r02 = 0;
    L4:
        if (r32.hasNext() == false) goto L6;
        Map.Entry<K, V> r1 = r32.next();
        int r2 = calculateHashCodeForObject(r1.getKey());
        r02 = r02 + (calculateHashCodeForObject(r1.getValue()) ^ r2);
        goto L4
    L6:
        return r02;
    }

    private static int calculateHashCodeForObject(Object r1) {
        if ((r1 instanceof byte[]) == false) goto L7;
        return Internal.hashCode((byte[]) r1);
    L7:
        if ((r1 instanceof Internal.EnumLite) == true) goto L11;
        return r1.hashCode();
    L11:
        throw new UnsupportedOperationException();
    }

    private static void checkForNullKeysAndValues(Map<?, ?> r2) {
        Iterator<?> r02 = r2.keySet().iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        Object r1 = r02.next();
        Internal.checkNotNull(r1);
        Internal.checkNotNull(r2.get(r1));
        goto L4
    }

    private static Object copy(Object r1) {
        if ((r1 instanceof byte[]) == false) goto L6;
        byte[] r12 = (byte[]) r1;
        return Arrays.copyOf(r12, r12.length);
    L6:
        return r1;
    }

    public static <K, V> MapFieldLite<K, V> emptyMapField() {
        return (MapFieldLite<K, V>) EMPTY_MAP_FIELD;
    }

    private void ensureMutable() {
        if (isMutable() == false) goto L6;
        return;
    L6:
        throw new UnsupportedOperationException();
    }

    private static boolean equals(Object r1, Object r2) {
        if ((r1 instanceof byte[]) == false) goto L9;
        if ((r2 instanceof byte[]) == false) goto L9;
        return Arrays.equals((byte[]) r1, (byte[]) r2);
    L9:
        return r1.equals(r2);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        ensureMutable();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (isEmpty() == false) goto L7;
        return Collections.EMPTY_SET;
    L7:
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return calculateHashCodeForMap(this);
    }

    public boolean isMutable() {
        return this.isMutable;
    }

    public void makeImmutable() {
        this.isMutable = false;
    }

    public void mergeFrom(MapFieldLite<K, V> r2) {
        ensureMutable();
        if (r2.isEmpty() == true) goto L6;
        putAll(r2);
        return;
    }

    public MapFieldLite<K, V> mutableCopy() {
        if (isEmpty() == false) goto L7;
        return new MapFieldLite();
    L7:
        return new MapFieldLite(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K r1, V r2) {
        ensureMutable();
        Internal.checkNotNull(r1);
        Internal.checkNotNull(r2);
        return (V) super.put(r1, r2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> r1) {
        ensureMutable();
        checkForNullKeysAndValues(r1);
        super.putAll(r1);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object r1) {
        ensureMutable();
        return (V) super.remove(r1);
    }

    private MapFieldLite(Map<K, V> r1) {
        super(r1);
        this.isMutable = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> Map<K, V> copy(Map<K, V> r3) {
        LinkedHashMap r02 = new LinkedHashMap();
        Iterator<Map.Entry<K, V>> r32 = r3.entrySet().iterator();
    L4:
        if (r32.hasNext() == false) goto L6;
        Map.Entry<K, V> r1 = r32.next();
        r02.put(r1.getKey(), copy(r1.getValue()));
        goto L4
    L6:
        return r02;
    }

    public static <K, V> boolean equals(Map<K, V> r4, Map<K, V> r5) {
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
        if (equals(r1.getValue(), r5.get(r1.getKey())) == true) goto L10;
        return false;
    L13:
        return false;
    L17:
        return true;
    }

    public V put(Map.Entry<K, V> r2) {
        return put(r2.getKey(), r2.getValue());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object r2) {
        if ((r2 instanceof Map) == true) goto L5;
        return false;
    L5:
        if (equals(this, (Map) r2) == false) goto L10;
        return true;
    L10:
        return false;
    }
}
