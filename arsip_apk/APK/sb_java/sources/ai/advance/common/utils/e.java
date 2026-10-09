package ai.advance.common.utils;

/* loaded from: classes.dex */
public abstract class e {
    public static String a(int r3) {
        StringBuilder r02 = new StringBuilder();
        int r1 = 0;
    L3:
        if (r1 >= r3) goto L6;
        r02.append(" ");
        r1 = r1 + 1;
        goto L3
    L6:
        return r02.toString();
    }

    public static String b(String r8) {
        if (r8 != null) goto L5;
        return null;
    L5:
        StringBuilder r1 = new StringBuilder(r8);
        if (r8.equals("") == false) goto L8;
        return null;
    L8:
        int r02 = 0;
        int r2 = 0;
        int r3 = 0;
    L10:
        if (r02 >= r8.length()) goto L28;
        char r4 = r8.charAt(r02);
        if (r4 != '{') goto L14;
    L25:
        int r42 = r3 + 4;
        r1.insert((r02 + r2) + 1, "\n" + a(r42));
        int r32 = r3 + 5;
    L24:
        r2 = r2 + r32;
        r3 = r42;
    L26:
        r02 = r02 + 1;
        goto L10
    L14:
        if (r4 == '[') goto L25;
        if (r4 != ',') goto L20;
        r1.insert((r02 + r2) + 1, "\n" + a(r3));
        r2 = r2 + (r3 + 1);
        goto L26
    L20:
        if (r4 != '}') goto L22;
    L23:
        r42 = r3 - 4;
        r1.insert(r02 + r2, "\n" + a(r42));
        r32 = r3 + (-3);
        goto L24
    L22:
        if (r4 != ']') goto L26;
    L28:
        return r1.toString();
    }
}
