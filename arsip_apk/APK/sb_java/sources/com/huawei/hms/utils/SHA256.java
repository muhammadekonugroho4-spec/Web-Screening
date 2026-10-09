package com.huawei.hms.utils;

import com.huawei.hms.support.log.HMSLog;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

/* loaded from: classes6.dex */
public abstract class SHA256 {
    public SHA256() {
    }

    public static byte[] digest(byte[] r2) {
        return MessageDigest.getInstance("SHA-256").digest(r2);
    L4:
        e = move-exception;
        HMSLog.e("SHA256", "NoSuchAlgorithmException" + e.getMessage());
        return new byte[0];
    }

    public static byte[] digest(File r6) {
        InputStream r1 = null;
        BufferedInputStream r12 = null;
        MessageDigest r2 = MessageDigest.getInstance("SHA-256");     // Catch: Throwable -> L24 Throwable -> L21
        BufferedInputStream r3 = new BufferedInputStream(new FileInputStream(r6));     // Catch: Throwable -> L24 Throwable -> L21
        byte[] r62 = new byte[4096];     // Catch: Throwable -> L9 Throwable -> L16
        int r13 = 0;
    L6:
        int r4 = r3.read(r62);     // Catch: Throwable -> L9 Throwable -> L16
        if (r4 == (-1)) goto L11;
        r2.update(r62, 0, r4);     // Catch: Throwable -> L9 Throwable -> L16
        r13 = r13 + r4;     // Catch: Throwable -> L9 Throwable -> L16
        goto L6
    L11:
        if (r13 <= 0) goto L15;
        byte[] r63 = r2.digest();     // Catch: Throwable -> L9 Throwable -> L16
        IOUtils.closeQuietly(r3);
        return r63;
    L15:
        IOUtils.closeQuietly(r3);
        r1 = r13;
    L19:
        return new byte[0];
    L16:
        r12 = r3;
    L9:
        th = th;
        r1 = r3;
    L22:
        IOUtils.closeQuietly(r1);
        throw th;
    L21:
        th = th;
    L17:
        HMSLog.e("SHA256", "An exception occurred while computing file 'SHA-256'.");     // Catch: Throwable -> L21
        IOUtils.closeQuietly(r12);
        r1 = r12;
        goto L19
    }
}
