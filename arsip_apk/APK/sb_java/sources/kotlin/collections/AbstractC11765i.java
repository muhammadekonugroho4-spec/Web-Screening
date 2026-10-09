package kotlin.collections;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: kotlin.collections.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11765i extends AbstractMap implements Map, kotlin.jvm.internal.markers.e {
    public AbstractC11765i() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<Object, Object>> entrySet() {
        return getEntries();
    }

    public abstract Set getEntries();

    public abstract /* bridge */ Set getKeys();

    public abstract /* bridge */ int getSize();

    public /* bridge */ Collection<Object> getValues() {
        return super.values();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return getKeys();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<Object> values() {
        return getValues();
    }
}
