package com.huawei.hms.utils;

import com.huawei.hms.support.log.HMSLog;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/* loaded from: classes6.dex */
public final class IOUtils {
    private IOUtils() {
    }

    public static void closeQuietly(Reader r02) {
        closeQuietly(r02);
    }

    public static long copy(InputStream r1, OutputStream r2) throws IOException {
        return copy(r1, r2, new byte[4096]);
    }

    public static byte[] toByteArray(InputStream r1) throws IOException {
        ByteArrayOutputStream r02 = new ByteArrayOutputStream();
        copy(r1, r02);
        return r02.toByteArray();
    }

    public static InputStream toInputStream(byte[] r1) throws IOException {
        return new ByteArrayInputStream(r1);
    }

    public static void closeQuietly(Writer r02) {
        closeQuietly(r02);
    }

    public static long copy(InputStream r4, OutputStream r5, byte[] r6) throws IOException {
        long r02 = 0;
    L3:
        int r2 = r4.read(r6);
        if ((-1) == r2) goto L6;
        r5.write(r6, 0, r2);
        r02 = r02 + r2;
        goto L3
    L6:
        return r02;
    }

    public static void closeQuietly(InputStream r02) {
        closeQuietly(r02);
    }

    public static void closeQuietly(OutputStream r02) {
        closeQuietly(r02);
    }

    public static void closeQuietly(Closeable r1) {
        if (r1 == null) goto L9;
        r1.close();     // Catch: IOException -> L5
        return;
    L5:
        HMSLog.e("IOUtils", "An exception occurred while closing the 'Closeable' object.");
        return;
    }
}
