package com.stockbit.common.utils;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* loaded from: classes7.dex */
public abstract class f0 {
    public static final File a(Uri r5, Context r6) {
        kotlin.jvm.internal.p.l(r5, "<this>");
        kotlin.jvm.internal.p.l(r6, "context");
        InputStream r52 = r6.getContentResolver().openInputStream(r5);     // Catch: Exception -> L12
        if (r52 != null) goto L6;
        return null;
    L6:
        File r1 = new File(r6.getCacheDir(), "temp_" + System.currentTimeMillis() + ".png");     // Catch: Exception -> L12
        FileOutputStream r62 = new FileOutputStream(r1);     // Catch: Exception -> L12
        byte[] r2 = new byte[4096];     // Catch: Exception -> L12
    L7:
        int r3 = r52.read(r2);     // Catch: Exception -> L12
        if (r3 == (-1)) goto L10;
        r62.write(r2, 0, r3);     // Catch: Exception -> L12
        goto L7
    L10:
        r52.close();     // Catch: Exception -> L12
        r62.close();     // Catch: Exception -> L12
        return r1;
    L12:
        return null;
    }
}
