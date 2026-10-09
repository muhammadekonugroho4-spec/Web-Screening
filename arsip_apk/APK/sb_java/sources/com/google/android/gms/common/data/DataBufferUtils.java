package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;

/* loaded from: classes5.dex */
public final class DataBufferUtils {

    @KeepForSdk
    public static final String KEY_NEXT_PAGE_TOKEN = "next_page_token";

    @KeepForSdk
    public static final String KEY_PREV_PAGE_TOKEN = "prev_page_token";

    private DataBufferUtils() {
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeAndClose(DataBuffer<E> r3) {
        ArgumentList r02 = (ArrayList<T>) new ArrayList(r3.getCount());
        Iterator<E> r1 = r3.iterator();     // Catch: Throwable -> L8
    L4:
        if (r1.hasNext() == false) goto L10;
        r02.add(r1.next().freeze());     // Catch: Throwable -> L8
        goto L4
    L10:
        r3.close();
        return r02;
    L8:
        th = move-exception;
        r3.close();
        throw th;
    }

    public static boolean hasData(DataBuffer<?> r02) {
        if (r02 != null) goto L4;
        return false;
    L4:
        if (r02.getCount() <= 0) goto L9;
        return true;
    L9:
        return false;
    }

    public static boolean hasNextPage(DataBuffer<?> r1) {
        Bundle r12 = r1.getMetadata();
        if (r12 != null) goto L5;
        return false;
    L5:
        if (r12.getString(KEY_NEXT_PAGE_TOKEN) == null) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean hasPrevPage(DataBuffer<?> r1) {
        Bundle r12 = r1.getMetadata();
        if (r12 != null) goto L5;
        return false;
    L5:
        if (r12.getString(KEY_PREV_PAGE_TOKEN) == null) goto L10;
        return true;
    L10:
        return false;
    }
}
