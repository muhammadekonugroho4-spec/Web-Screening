package com.huawei.hms.common.data;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;

/* loaded from: classes6.dex */
public final class DataBufferUtils {
    public static final int ARGS_BUNDLE = 4;
    public static final int ARGS_COLUMN = 1;
    public static final int ARGS_CURSOR = 2;
    public static final int ARGS_STATUS = 3;
    public static final int ARGS_VERSION = 1000;
    public static final String NEXT_PAGE = "next_page";
    public static final String PREV_PAGE = "prev_page";

    private DataBufferUtils() {
    }

    private static boolean a(Bundle r1, String r2) {
        if (r1 != null) goto L6;
        return false;
    L6:
        if (r1.getString(r2) == null) goto L9;
        return true;
    L9:
        return false;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeAndClose(DataBuffer<E> r3) {
        ArgumentList r02 = (ArrayList<T>) new ArrayList(r3.getCount());
        Iterator<E> r1 = r3.iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        r02.add(r1.next().freeze());
        goto L4
    L6:
        r3.release();
        return r02;
    }

    public static boolean hasData(DataBuffer<?> r1) {
        if (r1 != null) goto L6;
        return false;
    L6:
        if (r1.getCount() <= 0) goto L9;
        return true;
    L9:
        return false;
    }

    public static boolean hasNextPage(DataBuffer<?> r1) {
        return a(r1.getMetadata(), NEXT_PAGE);
    }

    public static boolean hasPrevPage(DataBuffer<?> r1) {
        return a(r1.getMetadata(), PREV_PAGE);
    }
}
