package com.google.crypto.tink.prf;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.Map;

@Immutable
/* loaded from: classes6.dex */
public abstract class PrfSet {
    public PrfSet() {
    }

    public byte[] computePrimary(byte[] r3, int r4) throws GeneralSecurityException {
        return getPrfs().get(Integer.valueOf(getPrimaryId())).compute(r3, r4);
    }

    public abstract Map<Integer, Prf> getPrfs() throws GeneralSecurityException;

    public abstract int getPrimaryId();
}
