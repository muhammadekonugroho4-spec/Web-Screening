package com.google.crypto.tink.subtle;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.prf.Prf;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

@Immutable
/* loaded from: classes6.dex */
public final class PrfHmacJce implements Prf {
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    static final int MIN_KEY_SIZE_IN_BYTES = 16;
    private final String algorithm;
    private final Key key;
    private final ThreadLocal<Mac> localMac;
    private final int maxOutputLength;

    static {
        FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    public PrfHmacJce(String r3, Key r4) throws GeneralSecurityException {
        ThreadLocal<Mac> r02 = new AnonymousClass1(this);
        this.localMac = r02;
        if (FIPS.isCompatible() == false) goto L42;
        this.algorithm = r3;
        this.key = r4;
        if (r4.getEncoded().length < 16) goto L40;
        r3.getClass();
        char r42 = 65535;
        switch(r3.hashCode()) {
            case -1823053428: goto L26;
            case 392315023: goto L22;
            case 392315118: goto L18;
            case 392316170: goto L14;
            case 392317873: goto L10;
            default: goto L29;
        };
    L29:
        switch(r42) {
            case 0: goto L36;
            case 1: goto L35;
            case 2: goto L34;
            case 3: goto L33;
            case 4: goto L32;
            default: goto L31;
        };
    L32:
        this.maxOutputLength = 64;
    L37:
        r02.get();
        return;
    L33:
        this.maxOutputLength = 48;
        goto L37
    L34:
        this.maxOutputLength = 32;
        goto L37
    L35:
        this.maxOutputLength = 28;
        goto L37
    L36:
        this.maxOutputLength = 20;
        goto L37
    L31:
        throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + r3);
    L10:
        if (r3.equals("HMACSHA512") == false) goto L29;
        r42 = 4;
        goto L29
    L14:
        if (r3.equals("HMACSHA384") == false) goto L29;
        r42 = 3;
        goto L29
    L18:
        if (r3.equals("HMACSHA256") == false) goto L29;
        r42 = 2;
        goto L29
    L22:
        if (r3.equals("HMACSHA224") == false) goto L29;
        r42 = 1;
        goto L29
    L26:
        if (r3.equals("HMACSHA1") == false) goto L29;
        r42 = 0;
        goto L29
    L40:
        throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
    L42:
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    public static /* synthetic */ String access$000(PrfHmacJce r02) {
        return r02.algorithm;
    }

    public static /* synthetic */ Key access$100(PrfHmacJce r02) {
        return r02.key;
    }

    @Override // com.google.crypto.tink.prf.Prf
    public byte[] compute(byte[] r2, int r3) throws GeneralSecurityException {
        if (r3 > this.maxOutputLength) goto L7;
        this.localMac.get().update(r2);
        return Arrays.copyOf(this.localMac.get().doFinal(), r3);
    L7:
        throw new InvalidAlgorithmParameterException("tag size too big");
    }

    public int getMaxOutputLength() {
        return this.maxOutputLength;
    }
}
