package com.huawei.hms.common.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;

/* loaded from: classes6.dex */
public final class FreezableUtils {
    public FreezableUtils() {
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> r02) {
        return freezeIterable(r02);
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

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] r02) {
        return freezeIterable(Arrays.asList(r02));
    }
}
