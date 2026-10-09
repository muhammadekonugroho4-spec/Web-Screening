package kotlin.collections;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes3.dex */
public abstract class S extends Q {
    public static Map A(kotlin.sequences.i r1) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        return q(B(r1, new LinkedHashMap()));
    }

    public static final Map B(kotlin.sequences.i r1, Map r2) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.DESTINATION);
        u(r2, r1);
        return r2;
    }

    public static Map C(Pair[] r2) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        int r02 = r2.length;
        if (r02 == 0) goto L11;
        if (r02 == 1) goto L9;
        return D(r2, new LinkedHashMap(Q.e(r2.length)));
    L9:
        return Q.f(r2[0]);
    L11:
        return j();
    }

    public static final Map D(Pair[] r1, Map r2) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.DESTINATION);
        v(r2, r1);
        return r2;
    }

    public static Map E(Map r1) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        return new LinkedHashMap(r1);
    }

    public static Map j() {
        EmptyMap r02 = EmptyMap.f177334a;
        kotlin.jvm.internal.p.j(r02, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return r02;
    }

    public static Object k(Map r1, Object r2, kotlin.jvm.functions.a r3) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        kotlin.jvm.internal.p.l(r3, "defaultValue");
        Object r02 = r1.get(r2);
        if (r02 != null) goto L6;
        Object r32 = r3.invoke();
        r1.put(r2, r32);
        return r32;
    L6:
        return r02;
    }

    public static Object l(Map r1, Object r2) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        return P.a(r1, r2);
    }

    public static HashMap m(Pair... r2) {
        kotlin.jvm.internal.p.l(r2, "pairs");
        HashMap r02 = new HashMap(Q.e(r2.length));
        v(r02, r2);
        return r02;
    }

    public static Map n(Pair... r2) {
        kotlin.jvm.internal.p.l(r2, "pairs");
        if (r2.length <= 0) goto L7;
        return D(r2, new LinkedHashMap(Q.e(r2.length)));
    L7:
        return j();
    }

    public static Map o(Map r1, Object r2) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        Map r12 = E(r1);
        r12.remove(r2);
        return q(r12);
    }

    public static Map p(Pair... r2) {
        kotlin.jvm.internal.p.l(r2, "pairs");
        LinkedHashMap r02 = new LinkedHashMap(Q.e(r2.length));
        v(r02, r2);
        return r02;
    }

    public static final Map q(Map r2) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        int r02 = r2.size();
        if (r02 == 0) goto L10;
        if (r02 == 1) goto L8;
        return r2;
    L8:
        return Q.g(r2);
    L10:
        return j();
    }

    public static Map r(Map r1, Map r2) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        kotlin.jvm.internal.p.l(r2, "map");
        LinkedHashMap r02 = new LinkedHashMap(r1);
        r02.putAll(r2);
        return r02;
    }

    public static Map s(Map r1, Pair r2) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        kotlin.jvm.internal.p.l(r2, "pair");
        if (r1.isEmpty() == true) goto L5;
        LinkedHashMap r02 = new LinkedHashMap(r1);
        r02.put(r2.e(), r2.f());
        return r02;
    L5:
        return Q.f(r2);
    }

    public static final void t(Map r2, Iterable r3) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        kotlin.jvm.internal.p.l(r3, "pairs");
        Iterator r32 = r3.iterator();
    L4:
        if (r32.hasNext() == false) goto L6;
        Pair r02 = (Pair) r32.next();
        r2.put(r02.a(), r02.b());
        goto L4
    }

    public static final void u(Map r2, kotlin.sequences.i r3) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        kotlin.jvm.internal.p.l(r3, "pairs");
        Iterator r32 = r3.iterator();
    L4:
        if (r32.hasNext() == false) goto L6;
        Pair r02 = (Pair) r32.next();
        r2.put(r02.a(), r02.b());
        goto L4
    }

    public static final void v(Map r4, Pair[] r5) {
        kotlin.jvm.internal.p.l(r4, "<this>");
        kotlin.jvm.internal.p.l(r5, "pairs");
        int r02 = r5.length;
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        Pair r2 = r5[r1];
        r4.put(r2.a(), r2.b());
        r1 = r1 + 1;
        goto L3
    }

    public static Map w(Iterable r3) {
        kotlin.jvm.internal.p.l(r3, "<this>");
        if ((r3 instanceof Collection) == false) goto L20;
        Collection r02 = (Collection) r3;
        int r1 = r02.size();
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L11;
        return x(r3, new LinkedHashMap(Q.e(r02.size())));
    L11:
        if ((r3 instanceof List) == false) goto L14;
        Object r32 = ((List) r3).get(0);
    L16:
        return Q.f((Pair) r32);
    L14:
        r32 = r02.iterator().next();
        goto L16
    L18:
        return j();
    L20:
        return q(x(r3, new LinkedHashMap()));
    }

    public static Map x(Iterable r1, Map r2) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.DESTINATION);
        t(r2, r1);
        return r2;
    }

    public static Map y(Map r2) {
        kotlin.jvm.internal.p.l(r2, "<this>");
        int r02 = r2.size();
        if (r02 == 0) goto L11;
        if (r02 == 1) goto L9;
        return E(r2);
    L9:
        return Q.g(r2);
    L11:
        return j();
    }

    public static Map z(Map r1, Map r2) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.DESTINATION);
        r2.putAll(r1);
        return r2;
    }
}
