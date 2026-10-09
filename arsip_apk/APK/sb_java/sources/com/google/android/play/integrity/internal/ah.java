package com.google.android.play.integrity.internal;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes5.dex */
public final class ah {
    public static String a(byte[] r1) {
        MessageDigest r02 = MessageDigest.getInstance("SHA-256");     // Catch: NoSuchAlgorithmException -> L5
        r02.update(r1);
        return Base64.encodeToString(r02.digest(), 11);
    L5:
        return "";
    }
}
