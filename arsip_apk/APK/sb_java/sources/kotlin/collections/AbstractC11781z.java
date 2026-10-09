package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: kotlin.collections.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11781z extends AbstractC11780y {
    public static void C(List r2) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        if (r2.size() <= 1) goto L6;
        Collections.sort(r2);
        return;
    }

    public static void D(List r2, Comparator r3) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        kotlin.jvm.internal.p.l(r3, "comparator");
        if (r2.size() <= 1) goto L6;
        Collections.sort(r2, r3);
        return;
    }
}
