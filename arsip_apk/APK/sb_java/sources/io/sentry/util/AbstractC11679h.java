package io.sentry.util;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: io.sentry.util.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11679h {
    public static boolean a(File r5) {
        if (r5 != null) goto L5;
    L22:
        return true;
    L5:
        if (r5.exists() == false) goto L22;
        if (r5.isFile() == true) goto L10;
        File[] r1 = r5.listFiles();
        if (r1 != null) goto L14;
        return true;
    L14:
        int r02 = r1.length;
        int r3 = 0;
    L15:
        if (r3 >= r02) goto L21;
        if (a(r1[r3]) == false) goto L18;
        r3 = r3 + 1;
        goto L15
    L18:
        return false;
    L21:
        return r5.delete();
    L10:
        return r5.delete();
    }

    public static byte[] b(String r4, long r5) {
        File r02 = new File(r4);
        if (r02.exists() == false) goto L51;
        if (r02.isFile() == false) goto L49;
        if (r02.canRead() == false) goto L47;
        if (r02.length() > r5) goto L45;
        FileInputStream r52 = new FileInputStream(r4);
        BufferedInputStream r42 = new BufferedInputStream(r52);     // Catch: Throwable -> L25
        ByteArrayOutputStream r6 = new ByteArrayOutputStream();     // Catch: Throwable -> L27
        byte[] r03 = new byte[1024];     // Catch: Throwable -> L18
    L15:
        int r1 = r42.read(r03);     // Catch: Throwable -> L18
        if (r1 == (-1)) goto L20;
        r6.write(r03, 0, r1);     // Catch: Throwable -> L18
        goto L15
    L20:
        byte[] r04 = r6.toByteArray();     // Catch: Throwable -> L18
        r6.close();     // Catch: Throwable -> L27
        r42.close();     // Catch: Throwable -> L25
        r52.close();
        return r04;
    L18:
        th = move-exception;
        r6.close();     // Catch: Throwable -> L31
    L33:
        throw th;     // Catch: Throwable -> L27
    L31:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L27
    L27:
        th = move-exception;
        r42.close();     // Catch: Throwable -> L36
    L38:
        throw th;     // Catch: Throwable -> L25
    L36:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L25
    L25:
        th = move-exception;
        r52.close();     // Catch: Throwable -> L41
    L43:
        throw th;
    L41:
        th = move-exception;
        th.addSuppressed(th);
        goto L43
    L45:
        throw new IOException(String.format("Reading file failed, because size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.", new Object[]{r4, Long.valueOf(r02.length()), Long.valueOf(r5)}));
    L47:
        throw new IOException(String.format("Reading the item %s failed, because can't read the file.", new Object[]{r4}));
    L49:
        throw new IOException(String.format("Reading path %s failed, because it's not a file.", new Object[]{r4}));
    L51:
        throw new IOException(String.format("File '%s' doesn't exists", new Object[]{r02.getName()}));
    }

    public static String c(File r3) {
        if (r3 != null) goto L4;
        return null;
    L4:
        if (r3.exists() == true) goto L6;
        return null;
    L6:
        if (r3.isFile() == true) goto L8;
        return null;
    L8:
        if (r3.canRead() == false) goto L37;
        StringBuilder r02 = new StringBuilder();
        BufferedReader r1 = new BufferedReader(new FileReader(r3));
        String r32 = r1.readLine();     // Catch: Throwable -> L14
        if (r32 == null) goto L16;
        r02.append(r32);     // Catch: Throwable -> L14
    L16:
        String r33 = r1.readLine();     // Catch: Throwable -> L14
        if (r33 == null) goto L20;
        r02.append("\n");     // Catch: Throwable -> L14
        r02.append(r33);     // Catch: Throwable -> L14
        goto L16
    L20:
        r1.close();
        return r02.toString();
    L14:
        th = move-exception;
        r1.close();     // Catch: Throwable -> L24
    L26:
        throw th;
    L24:
        th = move-exception;
        th.addSuppressed(th);
        goto L26
    L37:
        return null;
    }
}
