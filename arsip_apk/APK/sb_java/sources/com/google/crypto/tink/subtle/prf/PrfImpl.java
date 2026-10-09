package com.google.crypto.tink.subtle.prf;

import com.google.crypto.tink.prf.Prf;
import com.google.errorprone.annotations.Immutable;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;

@Immutable
/* loaded from: classes6.dex */
public class PrfImpl implements Prf {
    private final StreamingPrf prfStreamer;

    private PrfImpl(StreamingPrf r1) {
        this.prfStreamer = r1;
    }

    private static byte[] readBytesFromStream(InputStream r3, int r4) throws GeneralSecurityException {
        byte[] r02 = new byte[r4];     // Catch: IOException -> L10
        int r1 = 0;
    L3:
        if (r1 >= r4) goto L9;
        int r2 = r3.read(r02, r1, r4 - r1);     // Catch: IOException -> L10
        if (r2 <= 0) goto L8;
        r1 = r1 + r2;     // Catch: IOException -> L10
        goto L3
    L8:
        throw new GeneralSecurityException("Provided StreamingPrf terminated before providing requested number of bytes.");     // Catch: IOException -> L10
    L9:
        return r02;
    L10:
        e = move-exception;
        throw new GeneralSecurityException(e);
    }

    public static PrfImpl wrap(StreamingPrf r1) {
        return new PrfImpl(r1);
    }

    @Override // com.google.crypto.tink.prf.Prf
    public byte[] compute(byte[] r2, int r3) throws GeneralSecurityException {
        if (r2 == null) goto L9;
        if (r3 <= 0) goto L7;
        return readBytesFromStream(this.prfStreamer.computePrf(r2), r3);
    L7:
        throw new GeneralSecurityException("Invalid outputLength specified.");
    L9:
        throw new GeneralSecurityException("Invalid input provided.");
    }
}
