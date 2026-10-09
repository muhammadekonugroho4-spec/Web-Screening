package kotlin.text;

/* renamed from: kotlin.text.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11849b extends AbstractC11848a {
    public static int f(char r3) {
        int r02 = AbstractC11848a.b(r3, 10);
        if (r02 < 0) goto L6;
        return r02;
    L6:
        throw new IllegalArgumentException("Char " + r3 + " is not a decimal digit");
    }

    public static boolean g(char r2, char r3, boolean r4) {
        if (r2 != r3) goto L6;
        return true;
    L6:
        if (r4 == true) goto L8;
        return false;
    L8:
        char r22 = Character.toUpperCase(r2);
        char r32 = Character.toUpperCase(r3);
        if (r22 != r32) goto L11;
    L14:
        return true;
    L11:
        if (Character.toLowerCase(r22) == Character.toLowerCase(r32)) goto L14;
        return false;
    }

    public static boolean h(char r2) {
        if (55296 <= r2) goto L5;
    L8:
        return false;
    L5:
        if (r2 >= 57344) goto L8;
        return true;
    }

    public static String i(char r02) {
        return G.a(r02);
    }
}
