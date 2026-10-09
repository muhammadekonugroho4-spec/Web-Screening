package androidx.core.content;

import android.content.Context;
import android.os.Process;

/* loaded from: classes.dex */
public abstract class f {
    public static int a(Context r2, String r3, int r4, int r5, String r6) {
        if (r2.checkPermission(r3, r4, r5) != (-1)) goto L5;
        return -1;
    L5:
        String r32 = androidx.core.app.f.c(r3);
        if (r32 != null) goto L8;
        return 0;
    L8:
        if (r6 != null) goto L16;
        String[] r62 = r2.getPackageManager().getPackagesForUid(r5);
        if (r62 != null) goto L12;
    L15:
        return -1;
    L12:
        if (r62.length <= 0) goto L15;
        r6 = r62[0];
    L16:
        int r02 = Process.myUid();
        String r1 = r2.getPackageName();
        if (r02 == r5) goto L19;
    L21:
        int r22 = androidx.core.app.f.b(r2, r32, r6);
    L22:
        if (r22 != 0) goto L24;
        return 0;
    L24:
        return -2;
    L19:
        if (androidx.core.util.c.a(r1, r6) == false) goto L21;
        r22 = androidx.core.app.f.a(r2, r5, r32, r6);
        goto L22
    }

    public static int b(Context r3, String r4) {
        return a(r3, r4, Process.myPid(), Process.myUid(), r3.getPackageName());
    }
}
