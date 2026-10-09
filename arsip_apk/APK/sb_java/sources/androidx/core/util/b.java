package androidx.core.util;

/* loaded from: classes.dex */
public abstract class b {
    public static void a(Object r2, StringBuilder r3) {
        if (r2 != null) goto L5;
        r3.append("null");
        return;
    L5:
        String r02 = r2.getClass().getSimpleName();
        if (r02.length() > 0) goto L10;
        r02 = r2.getClass().getName();
        int r1 = r02.lastIndexOf(46);
        if (r1 <= 0) goto L10;
        r02 = r02.substring(r1 + 1);
    L10:
        r3.append(r02);
        r3.append('{');
        r3.append(Integer.toHexString(System.identityHashCode(r2)));
    }
}
