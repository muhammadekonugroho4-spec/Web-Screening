package com.huawei.hms.hatool;

import android.util.Pair;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f39289a = null;

    static {
        f39289a = Charset.forName("UTF-8");
    }

    public static Pair<byte[], String> a(String r3) {
        if (r3 == null) goto L10;
        if (r3.length() < 32) goto L10;
        String r02 = r3.substring(0, 32);
        String r32 = r3.substring(32);
        return new Pair(com.huawei.secure.android.common.encrypt.utils.b.b(r02), r32);
    L10:
        return new Pair(new byte[0], r3);
    }

    public static String b(String r1, String r2) {
        return com.huawei.secure.android.common.encrypt.utils.b.a(com.huawei.secure.android.common.encrypt.aes.a.c(r1.getBytes(f39289a), com.huawei.secure.android.common.encrypt.utils.b.b(r2)));
    }

    public static String a(String r1, String r2) {
        Pair<byte[], String> r12 = a(r1);
        return new String(com.huawei.secure.android.common.encrypt.aes.a.b(com.huawei.secure.android.common.encrypt.utils.b.b((String) r12.second), com.huawei.secure.android.common.encrypt.utils.b.b(r2), (byte[]) r12.first), f39289a);
    }

    public static String a(byte[] r4, String r5) {
        if (r4 != null) goto L5;
    L15:
        String r42 = "cbc encrypt(byte) param is not right";
    L11:
        z.b("AesCipher", r42);
        return "";
    L5:
        if (r4.length == 0) goto L15;
        if (r5 == null) goto L15;
        byte[] r52 = com.huawei.secure.android.common.encrypt.utils.b.b(r5);
        if (r52.length >= 16) goto L14;
        r42 = "key length is not right";
        goto L11
    L14:
        return com.huawei.secure.android.common.encrypt.utils.b.a(com.huawei.secure.android.common.encrypt.aes.a.c(r4, r52));
    }
}
