package com.google.crypto.tink.subtle;

import com.google.firebase.perf.util.Constants;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes6.dex */
public final class Hkdf {
    private Hkdf() {
    }

    public static byte[] computeEciesHkdfSymmetricKey(byte[] r02, byte[] r1, String r2, byte[] r3, byte[] r4, int r5) throws GeneralSecurityException {
        return computeHkdf(r2, Bytes.concat(new byte[][]{r02, r1}), r3, r4, r5);
    }

    public static byte[] computeHkdf(String r4, byte[] r5, byte[] r6, byte[] r7, int r8) throws GeneralSecurityException {
        Mac r02 = EngineFactory.MAC.getInstance(r4);
        if (r8 > (r02.getMacLength() * Constants.MAX_HOST_LENGTH)) goto L17;
        if (r6 != null) goto L6;
    L9:
        r02.init(new SecretKeySpec(new byte[r02.getMacLength()], r4));
    L10:
        byte[] r62 = new byte[r8];
        r02.init(new SecretKeySpec(r02.doFinal(r5), r4));
        byte[] r52 = new byte[0];
        int r1 = 1;
        int r2 = 0;
    L11:
        r02.update(r52);
        r02.update(r7);
        r02.update((byte) r1);
        r52 = r02.doFinal();
        if ((r52.length + r2) >= r8) goto L14;
        System.arraycopy(r52, 0, r62, r2, r52.length);
        r2 = r2 + r52.length;
        r1 = r1 + 1;
        goto L11
    L14:
        System.arraycopy(r52, 0, r62, r2, r8 - r2);
        return r62;
    L6:
        if (r6.length == 0) goto L9;
        r02.init(new SecretKeySpec(r6, r4));
        goto L10
    L17:
        throw new GeneralSecurityException("size too large");
    }
}
