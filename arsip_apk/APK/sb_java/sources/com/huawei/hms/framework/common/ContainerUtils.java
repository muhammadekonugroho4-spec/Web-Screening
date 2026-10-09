package com.huawei.hms.framework.common;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public class ContainerUtils {
    public static final String FIELD_DELIMITER = "&";
    public static final String KEY_VALUE_DELIMITER = "=";

    public ContainerUtils() {
    }

    public static <K, V> boolean equals(Map<K, V> r4, Map<K, V> r5) {
        if (r4 != r5) goto L5;
        return true;
    L5:
        boolean r1 = false;
        if (r4 == null) goto L18;
        if (r5 == null) goto L18;
        if (r4.size() != r5.size()) goto L18;
        Iterator<Map.Entry<K, V>> r42 = r4.entrySet().iterator();
    L12:
        if (r42.hasNext() == false) goto L17;
        Map.Entry<K, V> r2 = r42.next();
        if (r5.get(r2.getKey()) == r2.getValue()) goto L12;
        r1 = true;
    L17:
        return !r1;
    L18:
        return false;
    }

    public static <K, V> int hashCode(Map<K, V> r02) {
        return toString(r02).hashCode();
    }

    public static <K, V> String toString(Map<K, V> r4) {
        if (r4 != null) goto L5;
        return "";
    L5:
        StringBuilder r02 = new StringBuilder();
        Iterator<Map.Entry<K, V>> r42 = r4.entrySet().iterator();
        int r1 = 0;
    L7:
        if (r42.hasNext() == false) goto L13;
        Map.Entry<K, V> r2 = r42.next();
        int r3 = r1 + 1;
        if (r1 <= 0) goto L11;
        r02.append(FIELD_DELIMITER);
    L11:
        r02.append(r2.getKey().toString());
        r02.append(KEY_VALUE_DELIMITER);
        r02.append(r2.getValue().toString());
        r1 = r3;
        goto L7
    L13:
        return r02.toString();
    }

    public static <K> String toString(Set<K> r4) {
        if (r4 != null) goto L5;
        return "";
    L5:
        StringBuilder r02 = new StringBuilder();
        Iterator<K> r42 = r4.iterator();
        int r1 = 0;
    L7:
        if (r42.hasNext() == false) goto L13;
        K r2 = r42.next();
        int r3 = r1 + 1;
        if (r1 <= 0) goto L11;
        r02.append(FIELD_DELIMITER);
    L11:
        r02.append(r2.toString());
        r1 = r3;
        goto L7
    L13:
        return r02.toString();
    }

    public static <K> String toString(List<K> r4) {
        if (r4 != null) goto L5;
        return "";
    L5:
        StringBuilder r02 = new StringBuilder();
        Iterator<K> r42 = r4.iterator();
        int r1 = 0;
    L7:
        if (r42.hasNext() == false) goto L13;
        K r2 = r42.next();
        int r3 = r1 + 1;
        if (r1 <= 0) goto L11;
        r02.append(FIELD_DELIMITER);
    L11:
        r02.append(r2.toString());
        r1 = r3;
        goto L7
    L13:
        return r02.toString();
    }
}
