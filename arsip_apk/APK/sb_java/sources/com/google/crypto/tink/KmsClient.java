package com.google.crypto.tink;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public interface KmsClient {
    boolean doesSupport(String r1);

    Aead getAead(String r1) throws GeneralSecurityException;

    KmsClient withCredentials(String r1) throws GeneralSecurityException;

    KmsClient withDefaultCredentials() throws GeneralSecurityException;
}
