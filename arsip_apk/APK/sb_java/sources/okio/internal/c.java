package okio.internal;

/* loaded from: classes3.dex */
public abstract class c {
    public static final /* synthetic */ int a(char r02) {
        return b(r02);
    }

    public static final int b(char r3) {
        if ('0' > r3) goto L9;
        if (r3 >= ':') goto L9;
        return r3 - '0';
    L9:
        if ('a' > r3) goto L15;
        if (r3 >= 'g') goto L15;
        return r3 - 'W';
    L15:
        if ('A' > r3) goto L21;
        if (r3 >= 'G') goto L21;
        return r3 - '7';
    L21:
        throw new IllegalArgumentException("Unexpected hex digit: " + r3);
    }
}
