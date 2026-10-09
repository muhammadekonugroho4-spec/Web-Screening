package com.huawei.secure.android.common.encrypt.utils;

import android.util.Log;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.prng.SP800SecureRandomBuilder;

/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f39570a = false;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f39571b = true;

    static {
    }

    public static SecureRandom a() {
        c.b("EncryptUtil", "generateSecureRandomNew ");
        SecureRandom r2 = null;
        r2 = SecureRandom.getInstanceStrong();     // Catch: Throwable -> L5 NoSuchAlgorithmException -> L9
        AESEngine r3 = new AESEngine();     // Catch: Throwable -> L5 NoSuchAlgorithmException -> L9
        byte[] r4 = new byte[32];     // Catch: Throwable -> L5 NoSuchAlgorithmException -> L9
        r2.nextBytes(r4);     // Catch: Throwable -> L5 NoSuchAlgorithmException -> L9
        return new SP800SecureRandomBuilder(r2, true).setEntropyBitsRequired(384).buildCTR(r3, 256, r4, false);
    L9:
        c.c("EncryptUtil", "NoSuchAlgorithmException");
    L10:
        return r2;
    L5:
        th = move-exception;
        if (f39571b == false) goto L10;
        c.c("EncryptUtil", "exception : " + th.getMessage() + " , you should implementation bcprov-jdk15on library");
        f39571b = false;
        goto L10
    }

    public static byte[] b(int r1) {
        SecureRandom r02 = a();
        if (r02 == null) goto L5;
        byte[] r12 = new byte[r1];
        r02.nextBytes(r12);
        return r12;
    L5:
        return new byte[0];
    }

    public static byte[] c(int r1) {
        if (f39570a == true) goto L10;
        byte[] r12 = new byte[r1];
        SecureRandom.getInstanceStrong().nextBytes(r12);     // Catch: NoSuchAlgorithmException -> L7
        return r12;
    L7:
        Log.e("EncryptUtil", "getSecureRandomBytes: NoSuchAlgorithmException");
        return new byte[0];
    L10:
        return b(r1);
    }

    public static String d(int r02) {
        return b.a(c(r02));
    }
}
