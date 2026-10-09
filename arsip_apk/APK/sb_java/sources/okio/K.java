package okio;

/* loaded from: classes3.dex */
public abstract class K {
    public static final long a(String r9, int r10, int r11) {
        kotlin.jvm.internal.p.l(r9, "<this>");
        if (r10 < 0) goto L41;
        if (r11 < r10) goto L39;
        if (r11 > r9.length()) goto L37;
        long r02 = 0;
    L8:
        if (r10 >= r11) goto L35;
        char r2 = r9.charAt(r10);
        if (r2 < 128) goto L11;
        if (r2 < 2048) goto L15;
        if (r2 < 55296) goto L34;
        if (r2 > 57343) goto L34;
        int r6 = r10 + 1;
        if (r6 >= r11) goto L25;
        char r7 = r9.charAt(r6);
    L27:
        if (r2 > 56319) goto L33;
        if (r7 < 56320) goto L33;
        if (r7 > 57343) goto L33;
        r02 = r02 + 4;
        r10 = r10 + 2;
    L33:
        r02 = r02 + 1;
        r10 = r6;
        goto L8
    L25:
        r7 = 0;
    L34:
        int r22 = 3;
    L16:
        r02 = r02 + r22;
    L12:
        r10 = r10 + 1;
        goto L8
    L15:
        r22 = 2;
        goto L16
    L11:
        r02 = r02 + 1;
        goto L12
    L35:
        return r02;
    L37:
        throw new IllegalArgumentException(("endIndex > string.length: " + r11 + " > " + r9.length()).toString());
    L39:
        throw new IllegalArgumentException(("endIndex < beginIndex: " + r11 + " < " + r10).toString());
    L41:
        throw new IllegalArgumentException(("beginIndex < 0: " + r10).toString());
    }

    public static /* synthetic */ long b(String r02, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.length();
    L9:
        return a(r02, r1, r2);
    }
}
