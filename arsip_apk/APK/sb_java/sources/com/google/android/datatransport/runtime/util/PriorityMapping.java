package com.google.android.datatransport.runtime.util;

import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class PriorityMapping {
    private static HashMap<Priority, Integer> PRIORITY_INT_MAP;
    private static SparseArray<Priority> PRIORITY_MAP;

    static {
        PRIORITY_MAP = new SparseArray();
        HashMap<Priority, Integer> r02 = new HashMap();
        PRIORITY_INT_MAP = r02;
        r02.put(Priority.DEFAULT, 0);
        PRIORITY_INT_MAP.put(Priority.VERY_LOW, 1);
        PRIORITY_INT_MAP.put(Priority.HIGHEST, 2);
        Iterator<Priority> r03 = PRIORITY_INT_MAP.keySet().iterator();
    L4:
        if (r03.hasNext() == false) goto L6;
        Priority r1 = r03.next();
        PRIORITY_MAP.append(PRIORITY_INT_MAP.get(r1).intValue(), r1);
        goto L4
    }

    public PriorityMapping() {
    }

    public static int toInt(Priority r3) {
        Integer r02 = PRIORITY_INT_MAP.get(r3);
        if (r02 == null) goto L7;
        return r02.intValue();
    L7:
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + r3);
    }

    public static Priority valueOf(int r3) {
        Priority r02 = PRIORITY_MAP.get(r3);
        if (r02 == null) goto L6;
        return r02;
    L6:
        throw new IllegalArgumentException("Unknown Priority for value " + r3);
    }
}
