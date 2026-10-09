package com.appmattus.certificatetransparency.internal.utils;

import java.security.MessageDigest;
import java.security.PublicKey;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract class g {
    public static final byte[] a(PublicKey r1) {
        p.l(r1, "<this>");
        byte[] r12 = MessageDigest.getInstance("SHA-256").digest(r1.getEncoded());
        p.k(r12, "digest(...)");
        return r12;
    }
}
