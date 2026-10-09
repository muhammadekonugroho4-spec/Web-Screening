package kotlin.collections;

import java.util.AbstractList;
import java.util.List;

/* renamed from: kotlin.collections.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11764h extends AbstractList implements List, kotlin.jvm.internal.markers.d {
    public AbstractC11764h() {
    }

    public abstract Object a(int r1);

    public abstract int getSize();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int r1) {
        return a(r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }
}
