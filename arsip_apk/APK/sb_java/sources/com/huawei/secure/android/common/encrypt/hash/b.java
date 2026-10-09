package com.huawei.secure.android.common.encrypt.hash;

import android.text.TextUtils;
import com.huawei.secure.android.common.encrypt.utils.c;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes6.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f39566a = "SHA";

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f39567b = null;

    static {
        f39567b = new String[]{"SHA-256", "SHA-384", "SHA-512"};
    }

    public static boolean a(String r5) {
        String[] r02 = f39567b;
        int r1 = r02.length;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L9;
        if (r02[r3].equals(r5) == true) goto L6;
        r3 = r3 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    public static String b(String r1) {
        return c(r1, "SHA-256");
    }

    public static String c(String r2, String r3) {
        if (TextUtils.isEmpty(r2) == false) goto L5;
    L16:
        c.c(f39566a, "content or algorithm is null.");
        return "";
    L5:
        if (TextUtils.isEmpty(r3) == true) goto L16;
        if (a(r3) == true) goto L18;
        c.c(f39566a, "algorithm is not safe or legal");
        return "";
    L18:
        MessageDigest r32 = MessageDigest.getInstance(r3);     // Catch: NoSuchAlgorithmException -> L13 UnsupportedEncodingException -> L14
        r32.update(r2.getBytes("UTF-8"));     // Catch: NoSuchAlgorithmException -> L13 UnsupportedEncodingException -> L14
        return com.huawei.secure.android.common.encrypt.utils.b.a(r32.digest());
    L14:
        c.c(f39566a, "Error in generate SHA UnsupportedEncodingException");
    L15:
        return "";
    L13:
        c.c(f39566a, "Error in generate SHA NoSuchAlgorithmException");
        goto L15
    }
}
