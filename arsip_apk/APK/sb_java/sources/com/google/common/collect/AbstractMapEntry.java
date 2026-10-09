package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
abstract class AbstractMapEntry<K, V> implements Map.Entry<K, V> {
    public AbstractMapEntry() {
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object r4) {
        if ((r4 instanceof Map.Entry) == false) goto L10;
        Map.Entry r42 = (Map.Entry) r4;
        if (Objects.equal(getKey(), r42.getKey()) == false) goto L10;
        if (Objects.equal(getValue(), r42.getValue()) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // java.util.Map.Entry
    @ParametricNullness
    public abstract K getKey();

    @Override // java.util.Map.Entry
    @ParametricNullness
    public abstract V getValue();

    @Override // java.util.Map.Entry
    public int hashCode() {
        K r02 = getKey();
        V r1 = getValue();
        int r2 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        if (r1 == null) goto L10;
        r2 = r1.hashCode();
    L10:
        return r03 ^ r2;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    @Override // java.util.Map.Entry
    @ParametricNullness
    public V setValue(@ParametricNullness V r1) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        String r02 = String.valueOf(getKey());
        String r1 = String.valueOf(getValue());
        StringBuilder r3 = new StringBuilder((r02.length() + 1) + r1.length());
        r3.append(r02);
        r3.append(ContainerUtils.KEY_VALUE_DELIMITER);
        r3.append(r1);
        return r3.toString();
    }
}
