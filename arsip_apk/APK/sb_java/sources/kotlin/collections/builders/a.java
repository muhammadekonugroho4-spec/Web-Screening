package kotlin.collections.builders;

import java.util.Map;
import kotlin.collections.AbstractC11766j;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public abstract class a extends AbstractC11766j {
    public a() {
    }

    public final boolean a(Map.Entry r2) {
        p.l(r2, "element");
        return b(r2);
    }

    public abstract boolean b(Map.Entry r1);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object r2) {
        if ((r2 instanceof Map.Entry) == true) goto L7;
        return false;
    L7:
        return a((Map.Entry) r2);
    }

    public abstract /* bridge */ boolean d(Map.Entry r1);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object r2) {
        if ((r2 instanceof Map.Entry) == true) goto L7;
        return false;
    L7:
        return d((Map.Entry) r2);
    }
}
