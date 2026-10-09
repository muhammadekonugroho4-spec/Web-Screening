package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public abstract class j {
    public static final byte[] a(String[] r10) {
        p.l(r10, "strings");
        int r02 = r10.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r02) goto L5;
        r3 = r3 + r10[r2].length();
        r2 = r2 + 1;
        goto L3
    L5:
        byte[] r03 = new byte[r3];
        int r22 = r10.length;
        int r32 = 0;
        int r4 = 0;
    L6:
        if (r32 >= r22) goto L11;
        String r5 = r10[r32];
        int r6 = r5.length();
        int r7 = 0;
    L8:
        if (r7 >= r6) goto L10;
        r03[r4] = (byte) r5.charAt(r7);
        r7 = r7 + 1;
        r4 = r4 + 1;
        goto L8
    L10:
        r32 = r32 + 1;
        goto L6
    L11:
        return r03;
    }
}
