package com.github.barteksc.pdfviewer.util;

import android.content.Context;
import android.util.TypedValue;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* loaded from: classes4.dex */
public abstract class d {
    public static int a(Context r1, int r2) {
        return (int) TypedValue.applyDimension(1, r2, r1.getResources().getDisplayMetrics());
    }

    public static byte[] b(InputStream r4) {
        ByteArrayOutputStream r02 = new ByteArrayOutputStream();
        byte[] r1 = new byte[4096];
    L3:
        int r2 = r4.read(r1);
        if ((-1) == r2) goto L7;
        r02.write(r1, 0, r2);
        goto L3
    L7:
        return r02.toByteArray();
    }
}
