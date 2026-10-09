package com.huawei.secure.android.common.encrypt.hash;

import com.huawei.secure.android.common.encrypt.utils.c;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f39565a = "PBKDF2";

    static {
    }

    public static byte[] a(char[] r1, byte[] r2, int r3, int r4, boolean r5) {
        PBEKeySpec r02 = new PBEKeySpec(r1, r2, r3, r4);     // Catch: InvalidKeySpecException -> L8 Throwable -> L10
        if (r5 == false) goto L5;
        SecretKeyFactory r12 = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");     // Catch: InvalidKeySpecException -> L8 Throwable -> L10
    L6:
        return r12.generateSecret(r02).getEncoded();
    L5:
        r12 = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");     // Catch: InvalidKeySpecException -> L8 Throwable -> L10
    L10:
        e = move-exception;
        c.c(f39565a, "pbkdf exception : " + e.getMessage());
        return new byte[0];
    }

    public static byte[] b(char[] r1, byte[] r2, int r3, int r4) {
        return a(r1, r2, r3, r4, false);
    }
}
