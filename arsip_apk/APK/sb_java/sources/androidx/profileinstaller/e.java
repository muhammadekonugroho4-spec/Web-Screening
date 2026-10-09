package androidx.profileinstaller;

import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* loaded from: classes4.dex */
public abstract class e {
    public static int a(int r02) {
        return ((r02 + 7) & (-8)) / 8;
    }

    public static byte[] b(byte[] r3) {
        Deflater r02 = new Deflater(1);
        ByteArrayOutputStream r1 = new ByteArrayOutputStream();
        DeflaterOutputStream r2 = new DeflaterOutputStream(r1, r02);     // Catch: Throwable -> L8
        r2.write(r3);     // Catch: Throwable -> L10
        r2.close();     // Catch: Throwable -> L8
        r02.end();
        return r1.toByteArray();
    L10:
        th = move-exception;
        r2.close();     // Catch: Throwable -> L13
    L15:
        throw th;     // Catch: Throwable -> L8
    L13:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        r02.end();
        throw th;
    }

    public static RuntimeException c(String r1) {
        return new IllegalStateException(r1);
    }

    public static byte[] d(InputStream r3, int r4) {
        byte[] r02 = new byte[r4];
        int r1 = 0;
    L3:
        if (r1 >= r4) goto L9;
        int r2 = r3.read(r02, r1, r4 - r1);
        if (r2 < 0) goto L8;
        r1 = r1 + r2;
        goto L3
    L8:
        throw c("Not enough bytes to read: " + r4);
    L9:
        return r02;
    }

    public static byte[] e(InputStream r8, int r9, int r10) {
        Inflater r02 = new Inflater();
        byte[] r1 = new byte[r10];     // Catch: Throwable -> L15
        byte[] r2 = new byte[2048];     // Catch: Throwable -> L15
        int r4 = 0;
        int r5 = 0;
    L5:
        if (r02.finished() == true) goto L22;
        if (r02.needsDictionary() == true) goto L22;
        if (r4 >= r9) goto L22;
        int r6 = r8.read(r2);     // Catch: Throwable -> L15
        if (r6 < 0) goto L21;
        r02.setInput(r2, 0, r6);     // Catch: Throwable -> L15
        r5 = r5 + r02.inflate(r1, r5, r10 - r5);
        r4 = r4 + r6;
        goto L5
    L17:
        e = move-exception;
        throw c(e.getMessage());     // Catch: Throwable -> L15
    L21:
        throw c("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + r9 + " bytes");     // Catch: Throwable -> L15
    L22:
        if (r4 != r9) goto L30;
        if (r02.finished() == false) goto L28;
        r02.end();
        return r1;
    L28:
        throw c("Inflater did not finish");     // Catch: Throwable -> L15
    L30:
        throw c("Didn't read enough bytes during decompression. expected=" + r9 + " actual=" + r4);     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        r02.end();
        throw th;
    }

    public static String f(InputStream r1, int r2) {
        return new String(d(r1, r2), StandardCharsets.UTF_8);
    }

    public static long g(InputStream r6, int r7) {
        byte[] r62 = d(r6, r7);
        long r02 = 0;
        int r2 = 0;
    L3:
        if (r2 >= r7) goto L5;
        r02 = r02 + ((r62[r2] & UnsignedBytes.MAX_VALUE) << (r2 * 8));
        r2 = r2 + 1;
        goto L3
    L5:
        return r02;
    }

    public static int h(InputStream r2) {
        return (int) g(r2, 2);
    }

    public static long i(InputStream r2) {
        return g(r2, 4);
    }

    public static int j(InputStream r2) {
        return (int) g(r2, 1);
    }

    public static int k(String r1) {
        return r1.getBytes(StandardCharsets.UTF_8).length;
    }

    public static void l(InputStream r2, OutputStream r3, FileLock r4) {
        if (r4 == null) goto L11;
        if (r4.isValid() == false) goto L11;
        byte[] r42 = new byte[512];
    L6:
        int r02 = r2.read(r42);
        if (r02 <= 0) goto L9;
        r3.write(r42, 0, r02);
        goto L6
    L9:
        return;
    L11:
        throw new IOException("Unable to acquire a lock on the underlying file channel.");
    }

    public static void m(OutputStream r2, byte[] r3) {
        q(r2, r3.length);
        byte[] r32 = b(r3);
        q(r2, r32.length);
        r2.write(r32);
    }

    public static void n(OutputStream r1, String r2) {
        r1.write(r2.getBytes(StandardCharsets.UTF_8));
    }

    public static void o(OutputStream r6, long r7, int r9) {
        byte[] r02 = new byte[r9];
        int r1 = 0;
    L3:
        if (r1 >= r9) goto L5;
        r02[r1] = (byte) ((r7 >> (r1 * 8)) & 255);
        r1 = r1 + 1;
        goto L3
    L5:
        r6.write(r02);
    }

    public static void p(OutputStream r2, int r3) {
        o(r2, r3, 2);
    }

    public static void q(OutputStream r1, long r2) {
        o(r1, r2, 4);
    }

    public static void r(OutputStream r2, int r3) {
        o(r2, r3, 1);
    }
}
