package kotlin.text;

/* loaded from: classes3.dex */
public abstract class x extends w {
    public static final Long A(String r20, int r21) {
        kotlin.jvm.internal.p.l(r20, "<this>");
        AbstractC11848a.a(r21);
        int r2 = r20.length();
        Long r3 = null;
        if (r2 != 0) goto L5;
        return null;
    L5:
        int r4 = 0;
        char r5 = r20.charAt(0);
        long r7 = -9223372036854775807L;
        if (kotlin.jvm.internal.p.n(r5, 48) >= 0) goto L17;
        boolean r6 = true;
        if (r2 != 1) goto L11;
        return null;
    L11:
        if (r5 != '+') goto L13;
        r6 = false;
        r4 = 1;
    L18:
        long r11 = 0;
        long r13 = -256204778801521550L;
    L19:
        if (r4 >= r2) goto L36;
        int r52 = AbstractC11848a.b(r20.charAt(r4), r21);
        if (r52 < 0) goto L22;
        if (r11 < r13) goto L26;
    L30:
        Long r15 = r3;
        int r16 = r4;
        long r112 = r11 * r21;
        long r32 = r52;
        if (r112 < (r7 + r32)) goto L34;
        r11 = r112 - r32;
        r4 = r16 + 1;
        r3 = r15;
        goto L19
    L34:
        return r15;
    L26:
        if (r13 != (-256204778801521550L)) goto L31;
        r13 = r7 / r21;
        if (r11 >= r13) goto L30;
        return r3;
    L31:
        return r3;
    L22:
        return r3;
    L36:
        if (r6 == false) goto L40;
        return Long.valueOf(r11);
    L40:
        return Long.valueOf(-r11);
    L13:
        if (r5 == '-') goto L15;
        return null;
    L15:
        r7 = Long.MIN_VALUE;
        r4 = 1;
        goto L18
    L17:
        r6 = false;
        goto L18
    }

    public static final Void w(String r3) {
        kotlin.jvm.internal.p.l(r3, "input");
        throw new NumberFormatException("Invalid number format: '" + r3 + '\'');
    }

    public static Integer x(String r1) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        return y(r1, 10);
    }

    public static Integer y(String r10, int r11) {
        kotlin.jvm.internal.p.l(r10, "<this>");
        AbstractC11848a.a(r11);
        int r02 = r10.length();
        if (r02 != 0) goto L5;
        return null;
    L5:
        int r2 = 0;
        char r3 = r10.charAt(0);
        int r5 = -2147483647;
        if (kotlin.jvm.internal.p.n(r3, 48) >= 0) goto L17;
        int r4 = 1;
        if (r02 != 1) goto L11;
        return null;
    L11:
        if (r3 != '+') goto L13;
        boolean r32 = false;
    L18:
        int r7 = -59652323;
    L19:
        if (r4 >= r02) goto L32;
        int r8 = AbstractC11848a.b(r10.charAt(r4), r11);
        if (r8 < 0) goto L22;
        if (r2 >= r7) goto L28;
        if (r7 != (-59652323)) goto L27;
        r7 = r5 / r11;
        if (r2 >= r7) goto L28;
    L27:
        return null;
    L28:
        int r22 = r2 * r11;
        if (r22 < (r5 + r8)) goto L30;
        r2 = r22 - r8;
        r4 = r4 + 1;
        goto L19
    L30:
        return null;
    L22:
        return null;
    L32:
        if (r32 == false) goto L36;
        return Integer.valueOf(r2);
    L36:
        return Integer.valueOf(-r2);
    L13:
        if (r3 == '-') goto L15;
        return null;
    L15:
        r5 = Integer.MIN_VALUE;
        r32 = true;
        goto L18
    L17:
        r32 = false;
        r4 = 0;
        goto L18
    }

    public static Long z(String r1) {
        kotlin.jvm.internal.p.l(r1, "<this>");
        return A(r1, 10);
    }
}
