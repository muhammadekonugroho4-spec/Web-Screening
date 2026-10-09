package com.google.crypto.tink.subtle;

import java.security.SecureRandom;

/* loaded from: classes6.dex */
public final class Random {
    private static final ThreadLocal<SecureRandom> localRandom = null;

    static {
        localRandom = new AnonymousClass1();
    }

    private Random() {
    }

    public static /* synthetic */ SecureRandom access$000() {
        return newDefaultSecureRandom();
    }

    private static SecureRandom newDefaultSecureRandom() {
        SecureRandom r02 = new SecureRandom();
        r02.nextLong();
        return r02;
    }

    public static byte[] randBytes(int r1) {
        byte[] r12 = new byte[r1];
        localRandom.get().nextBytes(r12);
        return r12;
    }

    public static final int randInt(int r1) {
        return localRandom.get().nextInt(r1);
    }

    public static final int randInt() {
        return localRandom.get().nextInt();
    }
}
