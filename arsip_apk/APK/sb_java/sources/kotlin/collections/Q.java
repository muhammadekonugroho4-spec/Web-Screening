package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes3.dex */
public abstract class Q extends P {
    public static Map b(Map r1) {
        kotlin.jvm.internal.p.l(r1, "builder");
        return ((MapBuilder) r1).p();
    }

    public static Map c() {
        return new MapBuilder();
    }

    public static Map d(int r1) {
        return new MapBuilder(r1);
    }

    public static int e(int r1) {
        if (r1 >= 0) goto L5;
        return r1;
    L5:
        if (r1 >= 3) goto L9;
        return r1 + 1;
    L9:
        if (r1 < 1073741824) goto L11;
        return Integer.MAX_VALUE;
    L11:
        return (int) ((r1 / 0.75f) + 1.0f);
    }

    public static Map f(Pair r1) {
        kotlin.jvm.internal.p.l(r1, "pair");
        Map r12 = Collections.singletonMap(r1.e(), r1.f());
        kotlin.jvm.internal.p.k(r12, "singletonMap(...)");
        return r12;
    }

    public static final Map g(Map r1) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        Map.Entry r12 = (Map.Entry) r1.entrySet().iterator().next();
        Map r13 = Collections.singletonMap(r12.getKey(), r12.getValue());
        kotlin.jvm.internal.p.k(r13, "with(...)");
        return r13;
    }

    public static SortedMap h(Map r1) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        return new TreeMap(r1);
    }

    public static SortedMap i(Map r1, Comparator r2) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        kotlin.jvm.internal.p.l(r2, "comparator");
        TreeMap r02 = new TreeMap(r2);
        r02.putAll(r1);
        return r02;
    }
}
