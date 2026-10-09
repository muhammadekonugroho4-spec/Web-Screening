package com.tinder.scarlet.internal.servicemethod;

import com.tinder.scarlet.k;
import io.reactivex.exceptions.CompositeException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f173747a;

    public e(List r2) {
        p.l(r2, "streamAdapterFactories");
        this.f173747a = r2;
    }

    public final k a(Type r5) {
        p.l(r5, "type");
        ArrayList r02 = new ArrayList();
        Iterator r1 = this.f173747a.iterator();
    L4:
        if (r1.hasNext() == false) goto L10;
        return ((k.a) r1.next()).a(r5);
    L8:
        th = move-exception;
        r02.add(th);
        goto L4
    L10:
        Object[] r03 = r02.toArray(new Throwable[0]);
        if (r03 == null) goto L13;
        Throwable[] r04 = (Throwable[]) r03;
        throw new IllegalStateException("Cannot resolve stream adapter for type " + r5 + '.', new CompositeException((Throwable[]) Arrays.copyOf(r04, r04.length)));
    L13:
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
