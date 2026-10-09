package com.huawei.secure.android.common.encrypt.aes;

import com.huawei.secure.android.common.encrypt.utils.c;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f39564a = "AesCbc";

    static {
    }

    public static byte[] a(byte[] r3, byte[] r4) {
        byte[] r02 = new byte[r3.length + r4.length];
        System.arraycopy(r3, 0, r02, 0, r3.length);
        System.arraycopy(r4, 0, r02, r3.length, r4.length);
        return r02;
    }

    public static byte[] b(byte[] r3, byte[] r4, byte[] r5) {
        if (r3 != null) goto L5;
    L36:
        c.c(f39564a, "cbc decrypt param is not right");
        return new byte[0];
    L5:
        if (r3.length == 0) goto L36;
        if (r4 == null) goto L36;
        if (r4.length < 16) goto L36;
        if (r5 == null) goto L36;
        if (r5.length < 16) goto L36;
        SecretKeySpec r1 = new SecretKeySpec(r4, "AES");
        Cipher r42 = Cipher.getInstance("AES/CBC/PKCS5Padding");     // Catch: BadPaddingException -> L16 IllegalBlockSizeException -> L18 InvalidAlgorithmParameterException -> L20 InvalidKeyException -> L22 NoSuchPaddingException -> L24 NoSuchAlgorithmException -> L26
        r42.init(2, r1, new IvParameterSpec(r5));     // Catch: BadPaddingException -> L16 IllegalBlockSizeException -> L18 InvalidAlgorithmParameterException -> L20 InvalidKeyException -> L22 NoSuchPaddingException -> L24 NoSuchAlgorithmException -> L26
        return r42.doFinal(r3);
    L20:
        e = move-exception;
        c.c(f39564a, "InvalidAlgorithmParameterException: " + e.getMessage());
    L35:
        return new byte[0];
    L22:
        e = move-exception;
        c.c(f39564a, "InvalidKeyException: " + e.getMessage());
    L26:
        e = move-exception;
        c.c(f39564a, "NoSuchAlgorithmException: " + e.getMessage());
    L16:
        e = move-exception;
        c.c(f39564a, "BadPaddingException: " + e.getMessage());
    L18:
        e = move-exception;
        c.c(f39564a, "IllegalBlockSizeException: " + e.getMessage());
    L24:
        e = move-exception;
        c.c(f39564a, "NoSuchPaddingException: " + e.getMessage());
        goto L35
    }

    public static byte[] c(byte[] r1, byte[] r2) {
        byte[] r02 = com.huawei.secure.android.common.encrypt.utils.a.c(16);
        return a(r02, d(r1, r2, r02));
    }

    public static byte[] d(byte[] r3, byte[] r4, byte[] r5) {
        if (r3 != null) goto L5;
    L36:
        c.c(f39564a, "cbc encrypt param is not right");
        return new byte[0];
    L5:
        if (r3.length == 0) goto L36;
        if (r4 == null) goto L36;
        if (r4.length < 16) goto L36;
        if (r5 == null) goto L36;
        if (r5.length < 16) goto L36;
        SecretKeySpec r1 = new SecretKeySpec(r4, "AES");
        Cipher r42 = Cipher.getInstance("AES/CBC/PKCS5Padding");     // Catch: BadPaddingException -> L16 IllegalBlockSizeException -> L18 InvalidAlgorithmParameterException -> L20 InvalidKeyException -> L22 NoSuchPaddingException -> L24 NoSuchAlgorithmException -> L26
        r42.init(1, r1, new IvParameterSpec(r5));     // Catch: BadPaddingException -> L16 IllegalBlockSizeException -> L18 InvalidAlgorithmParameterException -> L20 InvalidKeyException -> L22 NoSuchPaddingException -> L24 NoSuchAlgorithmException -> L26
        return r42.doFinal(r3);
    L20:
        e = move-exception;
        c.c(f39564a, "InvalidAlgorithmParameterException: " + e.getMessage());
    L35:
        return new byte[0];
    L22:
        e = move-exception;
        c.c(f39564a, "InvalidKeyException: " + e.getMessage());
    L26:
        e = move-exception;
        c.c(f39564a, "NoSuchAlgorithmException: " + e.getMessage());
    L16:
        e = move-exception;
        c.c(f39564a, "BadPaddingException: " + e.getMessage());
    L18:
        e = move-exception;
        c.c(f39564a, "IllegalBlockSizeException: " + e.getMessage());
    L24:
        e = move-exception;
        c.c(f39564a, "NoSuchPaddingException: " + e.getMessage());
        goto L35
    }
}
