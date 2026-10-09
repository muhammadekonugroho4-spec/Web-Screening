package kotlin.collections.builders;

import com.clevertap.android.sdk.Constants;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public abstract class b {
    public static final /* synthetic */ boolean a(Object[] r02, int r1, int r2, List r3) {
        return h(r02, r1, r2, r3);
    }

    public static final /* synthetic */ int b(Object[] r02, int r1, int r2) {
        return i(r02, r1, r2);
    }

    public static final /* synthetic */ String c(Object[] r02, int r1, int r2, Collection r3) {
        return j(r02, r1, r2, r3);
    }

    public static final Object[] d(int r1) {
        if (r1 < 0) goto L6;
        return new Object[r1];
    L6:
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    public static final Object[] e(Object[] r1, int r2) {
        p.l(r1, "<this>");
        Object[] r12 = Arrays.copyOf(r1, r2);
        p.k(r12, "copyOf(...)");
        return r12;
    }

    public static final void f(Object[] r1, int r2) {
        p.l(r1, "<this>");
        r1[r2] = null;
    }

    public static final void g(Object[] r1, int r2, int r3) {
        p.l(r1, "<this>");
    L3:
        if (r2 >= r3) goto L5;
        f(r1, r2);
        r2 = r2 + 1;
        goto L3
    }

    public static final boolean h(Object[] r4, int r5, int r6, List r7) {
        if (r6 == r7.size()) goto L5;
        return false;
    L5:
        int r02 = 0;
    L6:
        if (r02 >= r6) goto L11;
        if (p.g(r4[r5 + r02], r7.get(r02)) == false) goto L9;
        r02 = r02 + 1;
        goto L6
    L9:
        return false;
    L11:
        return true;
    }

    public static final int i(Object[] r4, int r5, int r6) {
        int r02 = 1;
        int r2 = 0;
    L3:
        if (r2 >= r6) goto L9;
        Object r3 = r4[r5 + r2];
        int r03 = r02 * 31;
        if (r3 == null) goto L7;
        int r32 = r3.hashCode();
    L8:
        r02 = r03 + r32;
        r2 = r2 + 1;
        goto L3
    L7:
        r32 = 0;
        goto L8
    L9:
        return r02;
    }

    public static final String j(Object[] r3, int r4, int r5, Collection r6) {
        StringBuilder r02 = new StringBuilder((r5 * 3) + 2);
        r02.append(Constants.AES_PREFIX);
        int r1 = 0;
    L3:
        if (r1 >= r5) goto L11;
        if (r1 <= 0) goto L6;
        r02.append(", ");
    L6:
        Object r2 = r3[r4 + r1];
        if (r2 != r6) goto L9;
        r02.append("(this Collection)");
    L10:
        r1 = r1 + 1;
        goto L3
    L9:
        r02.append(r2);
        goto L10
    L11:
        r02.append(Constants.AES_SUFFIX);
        String r32 = r02.toString();
        p.k(r32, "toString(...)");
        return r32;
    }
}
