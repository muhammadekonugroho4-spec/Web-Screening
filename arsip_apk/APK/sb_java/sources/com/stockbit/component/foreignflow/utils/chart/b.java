package com.stockbit.component.foreignflow.utils.chart;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes7.dex */
public abstract class b {
    public static final boolean a(List r3) {
        kotlin.jvm.internal.p.l(r3, "<this>");
        ListIterator r32 = r3.listIterator(r3.size());
    L4:
        if (r32.hasPrevious() == false) goto L8;
        Object r02 = r32.previous();
        if (Math.abs(((com.stockbit.component.foreignflow.model.a) r02).a()) > Float.MAX_VALUE) goto L4;
    L9:
        com.stockbit.component.foreignflow.model.a r03 = (com.stockbit.component.foreignflow.model.a) r02;
        if (r03 == null) goto L12;
        float r04 = r03.a();
    L14:
        if (r04 < 0.0f) goto L17;
        return true;
    L17:
        return false;
    L12:
        r04 = 0.0f;
        goto L14
    L8:
        r02 = null;
        goto L9
    }
}
