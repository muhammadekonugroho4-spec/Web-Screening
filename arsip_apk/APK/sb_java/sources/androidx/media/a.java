package androidx.media;

import android.os.Bundle;

/* loaded from: classes4.dex */
public abstract class a {
    public static boolean a(Bundle r6, Bundle r7) {
        if (r6 != r7) goto L6;
        return true;
    L6:
        if (r6 == null) goto L8;
        if (r7 != null) goto L21;
        if (r6.getInt("android.media.browse.extra.PAGE", -1) == (-1)) goto L17;
    L19:
        return false;
    L17:
        if (r6.getInt("android.media.browse.extra.PAGE_SIZE", -1) != (-1)) goto L19;
        return true;
    L21:
        if (r6.getInt("android.media.browse.extra.PAGE", -1) == r7.getInt("android.media.browse.extra.PAGE", -1)) goto L23;
    L25:
        return false;
    L23:
        if (r6.getInt("android.media.browse.extra.PAGE_SIZE", -1) != r7.getInt("android.media.browse.extra.PAGE_SIZE", -1)) goto L25;
        return true;
    L8:
        if (r7.getInt("android.media.browse.extra.PAGE", -1) == (-1)) goto L10;
    L12:
        return false;
    L10:
        if (r7.getInt("android.media.browse.extra.PAGE_SIZE", -1) != (-1)) goto L12;
        return true;
    }
}
