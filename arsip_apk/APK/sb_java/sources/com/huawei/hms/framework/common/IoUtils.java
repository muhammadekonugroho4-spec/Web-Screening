package com.huawei.hms.framework.common;

import android.database.Cursor;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/* loaded from: classes6.dex */
public class IoUtils {
    private static final int BUFF_SIZE = 4096;
    private static final int MAX_SIZE = 16777216;

    private IoUtils() {
    }

    public static void close(Cursor r02) {
        if (r02 == null) goto L5;
        r02.close();
        return;
    }

    public static void closeSecure(Reader r02) {
        closeSecure(r02);
    }

    public static long copy(InputStream r7, OutputStream r8) throws IOException {
        if (ContextHolder.getAppContext() == null) goto L5;
        String r02 = ContextHolder.getAppContext().getPackageName();
    L6:
        byte[] r1 = new byte[4096];
        long r2 = 0;
    L7:
        int r4 = r7.read(r1);
        if ((-1) == r4) goto L17;
        if (r2 <= 16777216) goto L16;
        if ("com.huawei.health".equals(r02) == true) goto L16;
        throw new IOException("input data too large for byte.");
    L16:
        r8.write(r1, 0, r4);
        r2 = r2 + r4;
        goto L7
    L17:
        return r2;
    L5:
        r02 = "";
        goto L6
    }

    public static byte[] toByteArray(InputStream r1) throws IOException {
        ByteArrayOutputStream r02 = new ByteArrayOutputStream();
        copy(r1, r02);
        return r02.toByteArray();
    }

    public static void closeSecure(Writer r02) {
        closeSecure(r02);
    }

    public static void closeSecure(InputStream r02) {
        closeSecure(r02);
    }

    public static void closeSecure(OutputStream r02) {
        closeSecure(r02);
    }

    public static void closeSecure(Closeable r2) {
        if (r2 != null) goto L11;
        Logger.w("IOUtil", "closeable is null");
        return;
    L11:
        r2.close();     // Catch: IOException -> L6
        return;
    L6:
        e = move-exception;
        Logger.w("IOUtil", "closeSecure IOException", e);
    }
}
