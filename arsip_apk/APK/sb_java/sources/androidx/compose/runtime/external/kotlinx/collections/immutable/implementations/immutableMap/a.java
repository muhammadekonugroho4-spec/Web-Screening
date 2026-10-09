package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;
import kotlin.collections.AbstractC11766j;

/* loaded from: classes.dex */
public abstract class a extends AbstractC11766j {
    static {
    }

    public a() {
    }

    public final boolean a(Map.Entry r2) {
        if (r2 == null) goto L4;
        Map.Entry r02 = r2;
    L5:
        if (r02 != null) goto L9;
        return false;
    L9:
        return b(r2);
    L4:
        r02 = null;
        goto L5
    }

    public abstract boolean b(Map.Entry r1);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object r2) {
        if ((r2 instanceof Map.Entry) == true) goto L7;
        return false;
    L7:
        return a((Map.Entry) r2);
    }

    public final boolean d(Map.Entry r2) {
        if (r2 == null) goto L4;
        Map.Entry r02 = r2;
    L5:
        if (r02 != null) goto L9;
        return false;
    L9:
        return e(r2);
    L4:
        r02 = null;
        goto L5
    }

    public abstract boolean e(Map.Entry r1);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object r2) {
        if ((r2 instanceof Map.Entry) == true) goto L7;
        return false;
    L7:
        return d((Map.Entry) r2);
    }
}
