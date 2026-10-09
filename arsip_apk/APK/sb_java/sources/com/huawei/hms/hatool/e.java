package com.huawei.hms.hatool;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes6.dex */
public class e {
    static {
        Charset.forName("UTF-8");
    }

    public static String a(String r1, String r2) {
        return a(r1, r2.getBytes("UTF-8"));
    L4:
        z.c("hmsSdk", "Unsupported encoding exception,utf-8");
        return "";
    }

    public static String a(String r3, byte[] r4) {
        if (r4 != null) goto L5;
    L13:
        z.f("hmsSdk", "encrypt: content is empty or null");
        return "";
    L5:
        if (r4.length == 0) goto L13;
        return com.huawei.secure.android.common.encrypt.utils.b.a(a(r4, a(com.huawei.secure.android.common.encrypt.utils.b.b(r3))));
    L11:
        String r32 = "encrypt(): getInstance - No such algorithm,transformation";
    L10:
        z.f("hmsSdk", r32);
        return "";
    L9:
        r32 = "encrypt(): Invalid key specification";
        goto L10
    }

    private static PublicKey a(byte[] r1) {
        X509EncodedKeySpec r02 = new X509EncodedKeySpec(r1);
        return KeyFactory.getInstance("RSA").generatePublic(r02);
    }

    private static byte[] a(byte[] r3, PublicKey r4) {
        if (r4 == null) goto L7;
        Cipher r1 = Cipher.getInstance("RSA/ECB/OAEPWITHSHA-1ANDMGF1PADDING");     // Catch: IllegalBlockSizeException -> L8 BadPaddingException -> L10 NoSuchPaddingException -> L11 InvalidKeyException -> L12 NoSuchAlgorithmException -> L13 UnsupportedEncodingException -> L14
        r1.init(1, r4);     // Catch: IllegalBlockSizeException -> L8 BadPaddingException -> L10 NoSuchPaddingException -> L11 InvalidKeyException -> L12 NoSuchAlgorithmException -> L13 UnsupportedEncodingException -> L14
        return r1.doFinal(r3);
    L7:
        throw new UnsupportedEncodingException("The loaded public key is null");     // Catch: IllegalBlockSizeException -> L8 BadPaddingException -> L10 NoSuchPaddingException -> L11 InvalidKeyException -> L12 NoSuchAlgorithmException -> L13 UnsupportedEncodingException -> L14
    L14:
        String r32 = "rsaEncrypt(): getBytes - Unsupported coding format!";
    L9:
        z.f("hmsSdk", r32);
        return new byte[0];
    L12:
        r32 = "rsaEncrypt(): init - Invalid key!";
    L13:
        r32 = "rsaEncrypt(): getInstance - No such algorithm,transformation";
    L10:
        r32 = "rsaEncrypt():False filling parameters!";
    L8:
        r32 = "rsaEncrypt(): doFinal - The provided block is not filled with";
    L11:
        r32 = "rsaEncrypt():  No such filling parameters ";
        goto L9
    }
}
