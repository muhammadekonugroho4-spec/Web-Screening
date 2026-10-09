package com.google.android.gms.common.data;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;

/* loaded from: classes5.dex */
public final class FreezableUtils {
    public FreezableUtils() {
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> r4) {
        ArgumentList r02 = (ArrayList<T>) new ArrayList(r4.size());
        int r1 = r4.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r02.add(r4.get(r2).freeze());
        r2 = r2 + 1;
        goto L3
    L5:
        return r02;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> r2) {
        ArgumentList r02 = (ArrayList<T>) new ArrayList();
        Iterator<E> r22 = r2.iterator();
    L4:
        if (r22.hasNext() == false) goto L6;
        r02.add(r22.next().freeze());
        goto L4
    L6:
        return r02;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] r3) {
        ArgumentList r02 = (ArrayList<T>) new ArrayList(r3.length);
        int r1 = 0;
    L4:
        if (r1 >= r3.length) goto L6;
        r02.add(r3[r1].freeze());
        r1 = r1 + 1;
        goto L4
    L6:
        return r02;
    }
}
