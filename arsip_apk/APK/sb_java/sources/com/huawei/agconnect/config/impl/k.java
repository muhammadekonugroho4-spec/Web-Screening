package com.huawei.agconnect.config.impl;

import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes6.dex */
public abstract class k {
    public static SecretKey a(byte[] r2, byte[] r3, byte[] r4, byte[] r5, int r6) {
        if (r2.length != 16) goto L11;
        if (r3.length != 16) goto L11;
        if (r4.length != 16) goto L11;
        String r22 = a.c(e(r2, r3, r4));
        return new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(r22.toCharArray(), r5, r6, 128)).getEncoded(), "AES");
    L11:
        throw new IllegalArgumentException("invalid data for generating the key.");
    }

    public static byte[] b(SecretKey r5, byte[] r6) {
        if (r5 == null) goto L7;
        if (r6 == null) goto L7;
        byte[] r02 = Arrays.copyOfRange(r6, 1, 17);
        Cipher r2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
        r2.init(2, r5, new IvParameterSpec(r02));
        return r2.doFinal(r6, r02.length + 1, (r6.length - r02.length) - 1);
    L7:
        throw new NullPointerException("key or cipherText must not be null.");
    }

    public static byte[] c(byte[] r3, int r4) {
        if (r3 == null) goto L12;
        int r02 = 0;
    L5:
        if (r02 >= r3.length) goto L10;
        if (r4 >= 0) goto L8;
        r3[r02] = (byte) (r3[r02] << (-r4));
    L9:
        r02 = r02 + 1;
        goto L5
    L8:
        r3[r02] = (byte) (r3[r02] >> r4);
        goto L9
    L10:
        return r3;
    L12:
        throw new NullPointerException("bytes must not be null.");
    }

    public static byte[] d(byte[] r4, byte[] r5) {
        if (r4 == null) goto L14;
        if (r5 == null) goto L14;
        if (r4.length != r5.length) goto L12;
        byte[] r02 = new byte[r4.length];
        int r1 = 0;
    L8:
        if (r1 >= r4.length) goto L10;
        r02[r1] = (byte) (r4[r1] ^ r5[r1]);
        r1 = r1 + 1;
        goto L8
    L10:
        return r02;
    L12:
        throw new IllegalArgumentException("left and right must be the same length.");
    L14:
        throw new NullPointerException("left or right must not be null.");
    }

    public static byte[] e(byte[] r1, byte[] r2, byte[] r3) {
        return d(c(d(c(r1, -4), r2), 6), r3);
    }
}
