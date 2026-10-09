package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f177498a = null;

    static {
        f177498a = new Object[0];
    }

    public static final Object[] a(Collection r4) {
        p.l(r4, "collection");
        int r02 = r4.size();
        if (r02 == 0) goto L5;
        Iterator r42 = r4.iterator();
        if (r42.hasNext() == false) goto L9;
        Object[] r03 = new Object[r02];
        int r1 = 0;
    L11:
        int r2 = r1 + 1;
        r03[r1] = r42.next();
        if (r2 < r03.length) goto L26;
        if (r42.hasNext() == false) goto L15;
        int r12 = ((r2 * 3) + 1) >>> 1;
        if (r12 > r2) goto L23;
        r12 = 2147483645;
        if (r2 < 2147483645) goto L23;
        throw new OutOfMemoryError();
    L23:
        r03 = Arrays.copyOf(r03, r12);
        p.k(r03, "copyOf(...)");
    L24:
        r1 = r2;
        goto L11
    L15:
        return r03;
    L26:
        if (r42.hasNext() == true) goto L24;
        Object[] r43 = Arrays.copyOf(r03, r2);
        p.k(r43, "copyOf(...)");
        return r43;
    L9:
        return f177498a;
    L5:
        return f177498a;
    }

    public static final Object[] b(Collection r5, Object[] r6) {
        p.l(r5, "collection");
        r6.getClass();
        int r02 = r5.size();
        int r2 = 0;
        if (r02 == 0) goto L5;
        Iterator r52 = r5.iterator();
        if (r52.hasNext() == true) goto L15;
        if (r6.length <= 0) goto L13;
        r6[0] = null;
    L13:
        return r6;
    L15:
        if (r02 > r6.length) goto L17;
        Object[] r03 = r6;
    L18:
        int r3 = r2 + 1;
        r03[r2] = r52.next();
        if (r3 < r03.length) goto L33;
        if (r52.hasNext() == false) goto L22;
        int r22 = ((r3 * 3) + 1) >>> 1;
        if (r22 > r3) goto L30;
        r22 = 2147483645;
        if (r3 < 2147483645) goto L30;
        throw new OutOfMemoryError();
    L30:
        r03 = Arrays.copyOf(r03, r22);
        p.k(r03, "copyOf(...)");
    L31:
        r2 = r3;
        goto L18
    L22:
        return r03;
    L33:
        if (r52.hasNext() == true) goto L31;
        if (r03 != r6) goto L37;
        r6[r3] = null;
        return r6;
    L37:
        Object[] r53 = Arrays.copyOf(r03, r3);
        p.k(r53, "copyOf(...)");
        return r53;
    L17:
        Object r04 = Array.newInstance(r6.getClass().getComponentType(), r02);
        p.j(r04, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        r03 = (Object[]) r04;
        goto L18
    L5:
        if (r6.length <= 0) goto L13;
        r6[0] = null;
        return r6;
    }
}
