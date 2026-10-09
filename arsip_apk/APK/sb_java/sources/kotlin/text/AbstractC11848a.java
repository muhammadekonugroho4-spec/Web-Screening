package kotlin.text;

import java.util.Locale;

/* renamed from: kotlin.text.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11848a {
    public static int a(int r4) {
        if (2 > r4) goto L8;
        if (r4 >= 37) goto L8;
        return r4;
    L8:
        throw new IllegalArgumentException("radix " + r4 + " was not in valid range " + new kotlin.ranges.j(2, 36));
    }

    public static final int b(char r02, int r1) {
        return Character.digit(r02, r1);
    }

    public static boolean c(char r1) {
        if (Character.isWhitespace(r1) == false) goto L5;
        return true;
    L5:
        if (Character.isSpaceChar(r1) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public static String d(char r3, Locale r4) {
        kotlin.jvm.internal.p.l(r4, "locale");
        String r42 = e(r3, r4);
        if (r42.length() > 1) goto L5;
        String r02 = String.valueOf(r3);
        kotlin.jvm.internal.p.j(r02, "null cannot be cast to non-null type java.lang.String");
        String r03 = r02.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.p.k(r03, "toUpperCase(...)");
        if (kotlin.jvm.internal.p.g(r42, r03) == true) goto L13;
    L11:
        return r42;
    L13:
        return String.valueOf(Character.toTitleCase(r3));
    L5:
        if (r3 == 329) goto L11;
        char r32 = r42.charAt(0);
        kotlin.jvm.internal.p.j(r42, "null cannot be cast to non-null type java.lang.String");
        String r43 = r42.substring(1);
        kotlin.jvm.internal.p.k(r43, "substring(...)");
        kotlin.jvm.internal.p.j(r43, "null cannot be cast to non-null type java.lang.String");
        String r44 = r43.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.p.k(r44, "toLowerCase(...)");
        return r32 + r44;
    }

    public static final String e(char r1, Locale r2) {
        kotlin.jvm.internal.p.l(r2, "locale");
        String r12 = String.valueOf(r1);
        kotlin.jvm.internal.p.j(r12, "null cannot be cast to non-null type java.lang.String");
        String r13 = r12.toUpperCase(r2);
        kotlin.jvm.internal.p.k(r13, "toUpperCase(...)");
        return r13;
    }
}
