package com.airbnb.lottie.parser.moshi;

/* loaded from: classes4.dex */
public abstract class a {
    public static String a(int r4, int[] r5, String[] r6, int[] r7) {
        StringBuilder r02 = new StringBuilder();
        r02.append('$');
        int r1 = 0;
    L3:
        if (r1 >= r4) goto L21;
        int r2 = r5[r1];
        if (r2 != 1) goto L7;
    L18:
        r02.append('[');
        r02.append(r7[r1]);
        r02.append(']');
    L19:
        r1 = r1 + 1;
        goto L3
    L7:
        if (r2 == 2) goto L18;
        if (r2 != 3) goto L11;
    L15:
        r02.append('.');
        String r22 = r6[r1];
        if (r22 == null) goto L19;
        r02.append(r22);
        goto L19
    L11:
        if (r2 == 4) goto L15;
        if (r2 == 5) goto L15;
    L21:
        return r02.toString();
    }
}
