package com.huawei.hms.hatool;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.zip.Deflater;

/* loaded from: classes6.dex */
public final class u0 {
    public static String a(File r6) {
        FileInputStream r2 = null;
        FileInputStream r3 = new FileInputStream(r6);     // Catch: Throwable -> L19 IOException -> L29 FileNotFoundException -> L30
    L33:
        q0 r62 = new q0(1024);     // Catch: Throwable -> L8 IOException -> L17 FileNotFoundException -> L18
        byte[] r22 = new byte[1024];     // Catch: Throwable -> L8 IOException -> L17 FileNotFoundException -> L18
    L5:
        int r4 = r3.read(r22);     // Catch: Throwable -> L8 IOException -> L17 FileNotFoundException -> L18
        if (r4 == (-1)) goto L11;
        r62.a(r22, r4);     // Catch: Throwable -> L8 IOException -> L17 FileNotFoundException -> L18
        goto L5
    L11:
        if (r62.b() != 0) goto L14;
        a(r3);
        return "";
    L14:
        String r23 = new String(r62.a(), "UTF-8");     // Catch: Throwable -> L8 IOException -> L17 FileNotFoundException -> L18
        a(r3);
        return r23;
    L18:
        r2 = r3;
    L17:
        r2 = r3;
    L8:
        th = th;
        r2 = r3;
    L27:
        a(r2);
        throw th;
    L19:
        th = th;
    L24:
        z.f("hmsSdk", "getInfoFromFile(): No files need to be read");     // Catch: Throwable -> L19
        a(r2);
        return "";
    L21:
        z.f("hmsSdk", "getInfoFromFile(): stream.read or new string exception");     // Catch: Throwable -> L19
        a(r2);
        return "";
    }

    public static String a(InputStream r4) {
        ByteArrayOutputStream r02 = new ByteArrayOutputStream();
        byte[] r1 = new byte[1024];     // Catch: Throwable -> L7
    L4:
        int r2 = r4.read(r1);     // Catch: Throwable -> L7
        if (r2 == (-1)) goto L9;
        r02.write(r1, 0, r2);     // Catch: Throwable -> L7
        goto L4
    L9:
        String r42 = r02.toString("UTF-8");     // Catch: Throwable -> L7
        a(r02);
        return r42;
    L7:
        th = move-exception;
        a(r02);
        throw th;
    }

    public static void a(Closeable r1) {
        if (r1 == null) goto L9;
        r1.close();     // Catch: IOException -> L5
        return;
    L5:
        z.f("hmsSdk", "closeQuietly(): Exception when closing the closeable!");
        return;
    }

    public static void a(File r3, String r4) {
        FileOutputStream r1 = null;
        FileOutputStream r2 = new FileOutputStream(r3);     // Catch: Throwable -> L10 IOException -> L20 FileNotFoundException -> L21
    L25:
        r2.write(r4.getBytes("UTF-8"));     // Catch: Throwable -> L6 IOException -> L8 FileNotFoundException -> L9
        r2.flush();     // Catch: Throwable -> L6 IOException -> L8 FileNotFoundException -> L9
    L16:
        a(r2);
        return;
    L9:
        r1 = r2;
    L8:
        r1 = r2;
    L6:
        th = th;
        r1 = r2;
    L18:
        a(r1);
        throw th;
    L10:
        th = th;
    L14:
        String r32 = "saveInfoToFile(): No files need to be read";
    L13:
        z.f("hmsSdk", r32);     // Catch: Throwable -> L10
        r2 = r1;
    L12:
        r32 = "saveInfoToFile(): io exc from write info to file!";
        goto L13
    }

    private static void a(OutputStream r1) {
        if (r1 == null) goto L9;
        r1.close();     // Catch: IOException -> L5
        return;
    L5:
        z.f("hmsSdk", "closeStream(): Exception: close OutputStream error!");
        return;
    }

    public static void a(HttpURLConnection r2) {
        r2.getInputStream().close();     // Catch: Exception -> L5
    L6:
        r2.disconnect();
        z.a("hmsSdk", " connHttp disconnect");
        return;
    L5:
        z.f("hmsSdk", "closeQuietly(): Exception when connHttp.getInputStream()!,There may be no network, or no INTERNET permission");
        goto L6
    }

    public static byte[] a(byte[] r4) {
        ByteArrayOutputStream r02 = new ByteArrayOutputStream();
        Deflater r1 = new Deflater();
        r1.setInput(r4);
        r1.finish();
        byte[] r42 = new byte[1024];
    L4:
        if (r1.finished() == true) goto L6;
        r02.write(r42, 0, r1.deflate(r42));
        goto L4
    L6:
        byte[] r43 = r02.toByteArray();
        r1.end();
        a(r02);
        return r43;
    }
}
