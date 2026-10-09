package dagger.internal;

import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public abstract class a {
    public static int a(int r1) {
        if (r1 >= 3) goto L7;
        return r1 + 1;
    L7:
        if (r1 < 1073741824) goto L9;
        return Integer.MAX_VALUE;
    L9:
        return (int) ((r1 / 0.75f) + 1.0f);
    }

    public static LinkedHashMap b(int r1) {
        return new LinkedHashMap(a(r1));
    }
}
