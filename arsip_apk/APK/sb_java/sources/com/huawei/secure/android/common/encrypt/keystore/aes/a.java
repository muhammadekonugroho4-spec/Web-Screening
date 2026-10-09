package com.huawei.secure.android.common.encrypt.keystore.aes;

import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import com.google.android.gms.stats.CodePackage;
import com.huawei.secure.android.common.encrypt.utils.b;
import com.huawei.secure.android.common.encrypt.utils.c;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f39568a = "AesGcmKS";

    /* renamed from: b, reason: collision with root package name */
    public static Map f39569b;

    static {
        f39569b = new HashMap();
    }

    public static synchronized SecretKey a(String r6) {
        monitor-enter(a.class);
        String r1 = f39568a;     // Catch: Throwable -> L9
        c.d(r1, "load key");     // Catch: Throwable -> L9
        SecretKey r2 = null;
        KeyStore r3 = KeyStore.getInstance("AndroidKeyStore");     // Catch: Throwable -> L9 Exception -> L11 NoSuchProviderException -> L13 InvalidAlgorithmParameterException -> L15 UnrecoverableKeyException -> L17 NoSuchAlgorithmException -> L19 CertificateException -> L21 IOException -> L23 KeyStoreException -> L25
        r3.load(null);     // Catch: Throwable -> L9 Exception -> L11 NoSuchProviderException -> L13 InvalidAlgorithmParameterException -> L15 UnrecoverableKeyException -> L17 NoSuchAlgorithmException -> L19 CertificateException -> L21 IOException -> L23 KeyStoreException -> L25
        Key r32 = r3.getKey(r6, null);     // Catch: Throwable -> L9 Exception -> L11 NoSuchProviderException -> L13 InvalidAlgorithmParameterException -> L15 UnrecoverableKeyException -> L17 NoSuchAlgorithmException -> L19 CertificateException -> L21 IOException -> L23 KeyStoreException -> L25
        if ((r32 instanceof SecretKey) == false) goto L27;
        r2 = (SecretKey) r32;     // Catch: Throwable -> L9 Exception -> L11 NoSuchProviderException -> L13 InvalidAlgorithmParameterException -> L15 UnrecoverableKeyException -> L17 NoSuchAlgorithmException -> L19 CertificateException -> L21 IOException -> L23 KeyStoreException -> L25
    L44:
    L47:
    L49:
    L51:
    L53:
    L55:
    L57:
    L37:
        f39569b.put(r6, r2);     // Catch: Throwable -> L9
        monitor-exit(a.class);
        return r2;
    L27:
        c.d(r1, "generate key");     // Catch: Throwable -> L9 Exception -> L11 NoSuchProviderException -> L13 InvalidAlgorithmParameterException -> L15 UnrecoverableKeyException -> L17 NoSuchAlgorithmException -> L19 CertificateException -> L21 IOException -> L23 KeyStoreException -> L25
        KeyGenerator r12 = KeyGenerator.getInstance("AES", "AndroidKeyStore");     // Catch: Throwable -> L9 Exception -> L11 NoSuchProviderException -> L13 InvalidAlgorithmParameterException -> L15 UnrecoverableKeyException -> L17 NoSuchAlgorithmException -> L19 CertificateException -> L21 IOException -> L23 KeyStoreException -> L25
        r12.init(new KeyGenParameterSpec.Builder(r6, 3).setBlockModes(new String[]{CodePackage.GCM}).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(256).build());     // Catch: Throwable -> L9 Exception -> L11 NoSuchProviderException -> L13 InvalidAlgorithmParameterException -> L15 UnrecoverableKeyException -> L17 NoSuchAlgorithmException -> L19 CertificateException -> L21 IOException -> L23 KeyStoreException -> L25
        r2 = r12.generateKey();     // Catch: Throwable -> L9 Exception -> L11 NoSuchProviderException -> L13 InvalidAlgorithmParameterException -> L15 UnrecoverableKeyException -> L17 NoSuchAlgorithmException -> L19 CertificateException -> L21 IOException -> L23 KeyStoreException -> L25
    L25:
        e = move-exception;
        c.c(f39568a, "KeyStoreException : " + e.getMessage());     // Catch: Throwable -> L9
    L23:
        e = move-exception;
        c.c(f39568a, "IOException : " + e.getMessage());     // Catch: Throwable -> L9
    L21:
        e = move-exception;
        c.c(f39568a, "CertificateException : " + e.getMessage());     // Catch: Throwable -> L9
    L15:
        e = move-exception;
        c.c(f39568a, "InvalidAlgorithmParameterException : " + e.getMessage());     // Catch: Throwable -> L9
    L11:
        e = move-exception;
        c.c(f39568a, "Exception: " + e.getMessage());     // Catch: Throwable -> L9
    L19:
        e = move-exception;
        c.c(f39568a, "NoSuchAlgorithmException : " + e.getMessage());     // Catch: Throwable -> L9
    L13:
        e = move-exception;
        c.c(f39568a, "NoSuchProviderException : " + e.getMessage());     // Catch: Throwable -> L9
    L17:
        e = move-exception;
        c.c(f39568a, "UnrecoverableKeyException : " + e.getMessage());     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    }

    public static boolean b() {
        return true;
    }

    public static SecretKey c(String r1) {
        if (TextUtils.isEmpty(r1) == false) goto L7;
        return null;
    L7:
        if (f39569b.get(r1) != null) goto L10;
        a(r1);
    L10:
        return (SecretKey) f39569b.get(r1);
    }

    public static String d(String r3, String r4) {
        if (TextUtils.isEmpty(r3) == false) goto L5;
    L12:
        c.c(f39568a, "alias or encrypt content is null");
        return "";
    L5:
        if (TextUtils.isEmpty(r4) == true) goto L12;
        return new String(e(r3, b.b(r4)), "UTF-8");
    L9:
        e = move-exception;
        c.c(f39568a, "decrypt: UnsupportedEncodingException : " + e.getMessage());
        return "";
    }

    public static byte[] e(String r3, byte[] r4) {
        byte[] r02 = new byte[0];
        if (TextUtils.isEmpty(r3) == true) goto L16;
        if (r4 == null) goto L16;
        if (b() == true) goto L11;
        c.c(f39568a, "sdk version is too low");
        return r02;
    L11:
        if (r4.length > 12) goto L15;
        c.c(f39568a, "Decrypt source data is invalid.");
        return r02;
    L15:
        return f(c(r3), r4);
    L16:
        c.c(f39568a, "alias or encrypt content is null");
        return r02;
    }

    public static byte[] f(SecretKey r6, byte[] r7) {
        byte[] r02 = new byte[0];
        if (r6 != null) goto L6;
        c.c(f39568a, "Decrypt secret key is null");
        return r02;
    L6:
        if (r7 != null) goto L10;
        c.c(f39568a, "content is null");
        return r02;
    L10:
        if (b() == true) goto L14;
        c.c(f39568a, "sdk version is too low");
        return r02;
    L14:
        if (r7.length > 12) goto L17;
        c.c(f39568a, "Decrypt source data is invalid.");
        return r02;
    L17:
        byte[] r1 = Arrays.copyOf(r7, 12);
        Cipher r3 = Cipher.getInstance("AES/GCM/NoPadding");     // Catch: Exception -> L20 BadPaddingException -> L22 IllegalBlockSizeException -> L24 InvalidAlgorithmParameterException -> L26 InvalidKeyException -> L28 NoSuchPaddingException -> L30 NoSuchAlgorithmException -> L32
        r3.init(2, r6, new GCMParameterSpec(128, r1));     // Catch: Exception -> L20 BadPaddingException -> L22 IllegalBlockSizeException -> L24 InvalidAlgorithmParameterException -> L26 InvalidKeyException -> L28 NoSuchPaddingException -> L30 NoSuchAlgorithmException -> L32
        return r3.doFinal(r7, 12, r7.length - 12);
    L26:
        e = move-exception;
        c.c(f39568a, "InvalidAlgorithmParameterException : " + e.getMessage());
    L41:
        return r02;
    L28:
        e = move-exception;
        c.c(f39568a, "InvalidKeyException : " + e.getMessage());
    L32:
        e = move-exception;
        c.c(f39568a, "NoSuchAlgorithmException : " + e.getMessage());
    L22:
        e = move-exception;
        c.c(f39568a, "BadPaddingException : " + e.getMessage());
    L24:
        e = move-exception;
        c.c(f39568a, "IllegalBlockSizeException : " + e.getMessage());
    L30:
        e = move-exception;
        c.c(f39568a, "NoSuchPaddingException : " + e.getMessage());
    L20:
        e = move-exception;
        c.c(f39568a, "Exception: " + e.getMessage());
        goto L41
    }

    public static String g(String r3, String r4) {
        if (TextUtils.isEmpty(r3) == false) goto L5;
    L12:
        c.c(f39568a, "alias or encrypt content is null");
        return "";
    L5:
        if (TextUtils.isEmpty(r4) == true) goto L12;
        return b.a(h(r3, r4.getBytes("UTF-8")));
    L9:
        e = move-exception;
        c.c(f39568a, "encrypt: UnsupportedEncodingException : " + e.getMessage());
        return "";
    }

    public static byte[] h(String r2, byte[] r3) {
        byte[] r02 = new byte[0];
        if (TextUtils.isEmpty(r2) == true) goto L12;
        if (r3 == null) goto L12;
        if (b() == true) goto L11;
        c.c(f39568a, "sdk version is too low");
        return r02;
    L11:
        return i(c(r2), r3);
    L12:
        c.c(f39568a, "alias or encrypt content is null");
        return r02;
    }

    public static byte[] i(SecretKey r4, byte[] r5) {
        byte[] r1 = new byte[0];
        if (r5 != null) goto L6;
        c.c(f39568a, "content is null");
        return r1;
    L6:
        if (r4 != null) goto L10;
        c.c(f39568a, "secret key is null");
        return r1;
    L10:
        if (b() == true) goto L41;
        c.c(f39568a, "sdk version is too low");
        return r1;
    L41:
        Cipher r2 = Cipher.getInstance("AES/GCM/NoPadding");     // Catch: Exception -> L20 InvalidKeyException -> L22 IllegalBlockSizeException -> L24 BadPaddingException -> L26 NoSuchPaddingException -> L28 NoSuchAlgorithmException -> L30
        r2.init(1, r4);     // Catch: Exception -> L20 InvalidKeyException -> L22 IllegalBlockSizeException -> L24 BadPaddingException -> L26 NoSuchPaddingException -> L28 NoSuchAlgorithmException -> L30
        byte[] r42 = r2.doFinal(r5);     // Catch: Exception -> L20 InvalidKeyException -> L22 IllegalBlockSizeException -> L24 BadPaddingException -> L26 NoSuchPaddingException -> L28 NoSuchAlgorithmException -> L30
        byte[] r52 = r2.getIV();     // Catch: Exception -> L20 InvalidKeyException -> L22 IllegalBlockSizeException -> L24 BadPaddingException -> L26 NoSuchPaddingException -> L28 NoSuchAlgorithmException -> L30
        if (r52 != null) goto L16;
    L32:
        c.c(f39568a, "IV is invalid.");     // Catch: Exception -> L20 InvalidKeyException -> L22 IllegalBlockSizeException -> L24 BadPaddingException -> L26 NoSuchPaddingException -> L28 NoSuchAlgorithmException -> L30
        return r1;
    L16:
        if (r52.length != 12) goto L32;
        byte[] r12 = Arrays.copyOf(r52, r52.length + r42.length);     // Catch: Exception -> L20 InvalidKeyException -> L22 IllegalBlockSizeException -> L24 BadPaddingException -> L26 NoSuchPaddingException -> L28 NoSuchAlgorithmException -> L30
        System.arraycopy(r42, 0, r12, r52.length, r42.length);     // Catch: Exception -> L20 InvalidKeyException -> L22 IllegalBlockSizeException -> L24 BadPaddingException -> L26 NoSuchPaddingException -> L28 NoSuchAlgorithmException -> L30
        return r12;
    L22:
        e = move-exception;
        c.c(f39568a, "InvalidKeyException : " + e.getMessage());
    L40:
        return r1;
    L30:
        e = move-exception;
        c.c(f39568a, "NoSuchAlgorithmException : " + e.getMessage());
    L26:
        e = move-exception;
        c.c(f39568a, "BadPaddingException : " + e.getMessage());
    L24:
        e = move-exception;
        c.c(f39568a, "IllegalBlockSizeException : " + e.getMessage());
    L28:
        e = move-exception;
        c.c(f39568a, "NoSuchPaddingException : " + e.getMessage());
    L20:
        e = move-exception;
        c.c(f39568a, "Exception: " + e.getMessage());
        goto L40
    }
}
