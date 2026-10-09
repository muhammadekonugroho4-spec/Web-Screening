package com.clevertap.android.sdk.cryption;

import android.util.Base64;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract class e {
    public static final byte[] a(String r1) {
        p.l(r1, "<this>");
        byte[] r12 = Base64.decode(r1, 2);
        p.k(r12, "decode(...)");
        return r12;
    }

    public static final String b(byte[] r1) {
        p.l(r1, "<this>");
        String r12 = Base64.encodeToString(r1, 2);
        p.k(r12, "encodeToString(...)");
        return r12;
    }
}
