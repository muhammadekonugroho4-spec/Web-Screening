package kotlinx.serialization.json.internal;

/* renamed from: kotlinx.serialization.json.internal.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11975b {
    public static final byte a(char r1) {
        if (r1 < '~') goto L5;
        return 0;
    L5:
        return C11982i.f180871c[r1];
    }

    public static final char b(int r1) {
        if (r1 < 117) goto L5;
        return 0;
    L5:
        return C11982i.f180870b[r1];
    }

    public static final String c(byte r1) {
        if (r1 != 1) goto L7;
        return "quotation mark '\"'";
    L7:
        if (r1 != 2) goto L11;
        return "string escape sequence '\\'";
    L11:
        if (r1 != 4) goto L15;
        return "comma ','";
    L15:
        if (r1 != 5) goto L19;
        return "colon ':'";
    L19:
        if (r1 != 6) goto L23;
        return "start of the object '{'";
    L23:
        if (r1 != 7) goto L27;
        return "end of the object '}'";
    L27:
        if (r1 != 8) goto L31;
        return "start of the array '['";
    L31:
        if (r1 != 9) goto L35;
        return "end of the array ']'";
    L35:
        if (r1 != 10) goto L39;
        return "end of the input";
    L39:
        if (r1 != Byte.MAX_VALUE) goto L42;
        return "invalid token";
    L42:
        return "valid token";
    }
}
