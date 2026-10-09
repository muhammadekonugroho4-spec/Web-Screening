package com.google.crypto.tink;

import java.security.GeneralSecurityException;

@Deprecated
/* loaded from: classes6.dex */
public interface Catalogue<P> {
    KeyManager<P> getKeyManager(String r1, String r2, int r3) throws GeneralSecurityException;

    PrimitiveWrapper<?, P> getPrimitiveWrapper() throws GeneralSecurityException;
}
