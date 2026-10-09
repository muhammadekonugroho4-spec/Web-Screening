package com.google.crypto.tink.subtle;

import com.google.crypto.tink.hybrid.subtle.AeadOrDaead;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public interface EciesAeadHkdfDemHelper {
    AeadOrDaead getAeadOrDaead(byte[] r1) throws GeneralSecurityException;

    int getSymmetricKeySizeInBytes();
}
