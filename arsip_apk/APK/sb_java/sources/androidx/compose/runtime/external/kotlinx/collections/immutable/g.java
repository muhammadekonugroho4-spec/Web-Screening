package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Collection;
import java.util.Set;

/* loaded from: classes.dex */
public interface g extends d, b {

    public interface a extends Set, Collection, kotlin.jvm.internal.markers.b, kotlin.jvm.internal.markers.f {
        g build();
    }

    @Override // java.util.Set, java.util.Collection
    g add(Object r1);

    @Override // java.util.Set, java.util.Collection
    g addAll(Collection r1);

    a c();

    @Override // java.util.Set, java.util.Collection
    g remove(Object r1);

    @Override // java.util.Set, java.util.Collection
    g removeAll(Collection r1);
}
