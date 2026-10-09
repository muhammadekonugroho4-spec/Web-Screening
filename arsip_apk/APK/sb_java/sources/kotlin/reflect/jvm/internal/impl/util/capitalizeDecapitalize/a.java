package kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize;

import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.p;
import kotlin.text.B;

/* loaded from: classes3.dex */
public abstract class a {
    public static final String a(String r2) {
        p.l(r2, "<this>");
        if (r2.length() != 0) goto L5;
        return r2;
    L5:
        char r02 = r2.charAt(0);
        if ('a' <= r02) goto L8;
        return r2;
    L8:
        if (r02 >= '{') goto L12;
        char r03 = Character.toUpperCase(r02);
        String r22 = r2.substring(1);
        p.k(r22, "this as java.lang.String).substring(startIndex)");
        return r03 + r22;
    L12:
        return r2;
    }

    public static final String b(String r2) {
        p.l(r2, "<this>");
        if (r2.length() != 0) goto L5;
        return r2;
    L5:
        char r02 = r2.charAt(0);
        if ('A' <= r02) goto L8;
        return r2;
    L8:
        if (r02 >= '[') goto L12;
        char r03 = Character.toLowerCase(r02);
        String r22 = r2.substring(1);
        p.k(r22, "this as java.lang.String).substring(startIndex)");
        return r03 + r22;
    L12:
        return r2;
    }

    public static final String c(String r6, boolean r7) {
        p.l(r6, "<this>");
        if (r6.length() != 0) goto L6;
        return r6;
    L6:
        if (d(r6, 0, r7) == true) goto L9;
        return r6;
    L9:
        if (r6.length() != 1) goto L11;
    L26:
        if (r7 == false) goto L30;
        return b(r6);
    L30:
        if (r6.length() <= 0) goto L36;
        char r72 = Character.toLowerCase(r6.charAt(0));
        String r62 = r6.substring(1);
        p.k(r62, "this as java.lang.String).substring(startIndex)");
        return r72 + r62;
    L36:
        return r6;
    L11:
        if (d(r6, 1, r7) == false) goto L26;
        Iterator r1 = B.o0(r6).iterator();
    L15:
        if (r1.hasNext() == false) goto L19;
        Object r4 = r1.next();
        if (d(r6, ((Number) r4).intValue(), r7) == true) goto L15;
    L20:
        Integer r42 = (Integer) r4;
        if (r42 == null) goto L25;
        int r12 = r42.intValue() - 1;
        StringBuilder r3 = new StringBuilder();
        String r02 = r6.substring(0, r12);
        p.k(r02, "this as java.lang.String…ing(startIndex, endIndex)");
        r3.append(e(r02, r7));
        String r63 = r6.substring(r12);
        p.k(r63, "this as java.lang.String).substring(startIndex)");
        r3.append(r63);
        return r3.toString();
    L25:
        return e(r6, r7);
    L19:
        r4 = null;
        goto L20
    }

    public static final boolean d(String r02, int r1, boolean r2) {
        char r03 = r02.charAt(r1);
        if (r2 == false) goto L12;
        if ('A' <= r03) goto L7;
    L10:
        return false;
    L7:
        if (r03 >= '[') goto L10;
        return true;
    L12:
        return Character.isUpperCase(r03);
    }

    public static final String e(String r02, boolean r1) {
        if (r1 == true) goto L4;
        String r03 = r02.toLowerCase(Locale.ROOT);
        p.k(r03, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return r03;
    L4:
        return f(r02);
    }

    public static final String f(String r5) {
        p.l(r5, "<this>");
        StringBuilder r02 = new StringBuilder(r5.length());
        int r1 = r5.length();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L10;
        char r3 = r5.charAt(r2);
        if ('A' > r3) goto L9;
        if (r3 >= '[') goto L9;
        r3 = Character.toLowerCase(r3);
    L9:
        r02.append(r3);
        r2 = r2 + 1;
        goto L3
    L10:
        String r52 = r02.toString();
        p.k(r52, "builder.toString()");
        return r52;
    }
}
