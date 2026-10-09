package com.koushikdutta.async.util;

import java.io.File;

/* loaded from: classes6.dex */
public abstract class d {
    public static boolean a(File r3) {
        if (r3.exists() == false) goto L15;
        File[] r02 = r3.listFiles();
        if (r02 == null) goto L15;
        int r1 = 0;
    L8:
        if (r1 >= r02.length) goto L15;
        if (r02[r1].isDirectory() == false) goto L12;
        a(r02[r1]);
    L13:
        r1 = r1 + 1;
        goto L8
    L12:
        r02[r1].delete();
    L15:
        return r3.delete();
    }
}
