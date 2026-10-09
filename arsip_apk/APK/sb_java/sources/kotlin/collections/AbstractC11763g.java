package kotlin.collections;

import java.util.AbstractCollection;
import java.util.Collection;

/* renamed from: kotlin.collections.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11763g extends AbstractCollection implements Collection, kotlin.jvm.internal.markers.b {
    public AbstractC11763g() {
    }

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }
}
