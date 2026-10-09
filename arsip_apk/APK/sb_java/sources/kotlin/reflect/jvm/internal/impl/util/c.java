package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class c implements Iterable, kotlin.jvm.internal.markers.a {
    public /* synthetic */ c(kotlin.jvm.internal.i r1) {
        this();
    }

    public abstract void a(int r1, Object r2);

    public abstract Object get(int r1);

    public abstract int getSize();

    @Override // java.lang.Iterable
    public abstract Iterator iterator();

    public c() {
    }
}
