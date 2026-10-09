package kotlin.collections;

import java.util.AbstractSet;
import java.util.Set;

/* renamed from: kotlin.collections.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11766j extends AbstractSet implements Set, kotlin.jvm.internal.markers.f {
    public AbstractC11766j() {
    }

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
