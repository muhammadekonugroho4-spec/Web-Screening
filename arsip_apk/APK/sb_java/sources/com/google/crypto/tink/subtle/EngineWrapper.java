package com.google.crypto.tink.subtle;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* loaded from: classes6.dex */
public interface EngineWrapper<T> {

    public static class TCipher implements EngineWrapper<Cipher> {
        public TCipher() {
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public /* bridge */ /* synthetic */ Cipher getInstance(String r1, Provider r2) throws GeneralSecurityException {
            return getInstance2(r1, r2);
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        /* renamed from: getInstance, reason: avoid collision after fix types in other method */
        public Cipher getInstance2(String r1, Provider r2) throws GeneralSecurityException {
            if (r2 != null) goto L6;
            return Cipher.getInstance(r1);
        L6:
            return Cipher.getInstance(r1, r2);
        }
    }

    public static class TKeyAgreement implements EngineWrapper<KeyAgreement> {
        public TKeyAgreement() {
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public /* bridge */ /* synthetic */ KeyAgreement getInstance(String r1, Provider r2) throws GeneralSecurityException {
            return getInstance2(r1, r2);
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        /* renamed from: getInstance, reason: avoid collision after fix types in other method */
        public KeyAgreement getInstance2(String r1, Provider r2) throws GeneralSecurityException {
            if (r2 != null) goto L6;
            return KeyAgreement.getInstance(r1);
        L6:
            return KeyAgreement.getInstance(r1, r2);
        }
    }

    public static class TKeyFactory implements EngineWrapper<KeyFactory> {
        public TKeyFactory() {
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public /* bridge */ /* synthetic */ KeyFactory getInstance(String r1, Provider r2) throws GeneralSecurityException {
            return getInstance2(r1, r2);
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        /* renamed from: getInstance, reason: avoid collision after fix types in other method */
        public KeyFactory getInstance2(String r1, Provider r2) throws GeneralSecurityException {
            if (r2 != null) goto L6;
            return KeyFactory.getInstance(r1);
        L6:
            return KeyFactory.getInstance(r1, r2);
        }
    }

    public static class TKeyPairGenerator implements EngineWrapper<KeyPairGenerator> {
        public TKeyPairGenerator() {
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public /* bridge */ /* synthetic */ KeyPairGenerator getInstance(String r1, Provider r2) throws GeneralSecurityException {
            return getInstance2(r1, r2);
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        /* renamed from: getInstance, reason: avoid collision after fix types in other method */
        public KeyPairGenerator getInstance2(String r1, Provider r2) throws GeneralSecurityException {
            if (r2 != null) goto L6;
            return KeyPairGenerator.getInstance(r1);
        L6:
            return KeyPairGenerator.getInstance(r1, r2);
        }
    }

    public static class TMac implements EngineWrapper<Mac> {
        public TMac() {
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public /* bridge */ /* synthetic */ Mac getInstance(String r1, Provider r2) throws GeneralSecurityException {
            return getInstance2(r1, r2);
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        /* renamed from: getInstance, reason: avoid collision after fix types in other method */
        public Mac getInstance2(String r1, Provider r2) throws GeneralSecurityException {
            if (r2 != null) goto L6;
            return Mac.getInstance(r1);
        L6:
            return Mac.getInstance(r1, r2);
        }
    }

    public static class TMessageDigest implements EngineWrapper<MessageDigest> {
        public TMessageDigest() {
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public /* bridge */ /* synthetic */ MessageDigest getInstance(String r1, Provider r2) throws GeneralSecurityException {
            return getInstance2(r1, r2);
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        /* renamed from: getInstance, reason: avoid collision after fix types in other method */
        public MessageDigest getInstance2(String r1, Provider r2) throws GeneralSecurityException {
            if (r2 != null) goto L6;
            return MessageDigest.getInstance(r1);
        L6:
            return MessageDigest.getInstance(r1, r2);
        }
    }

    public static class TSignature implements EngineWrapper<Signature> {
        public TSignature() {
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public /* bridge */ /* synthetic */ Signature getInstance(String r1, Provider r2) throws GeneralSecurityException {
            return getInstance2(r1, r2);
        }

        @Override // com.google.crypto.tink.subtle.EngineWrapper
        /* renamed from: getInstance, reason: avoid collision after fix types in other method */
        public Signature getInstance2(String r1, Provider r2) throws GeneralSecurityException {
            if (r2 != null) goto L6;
            return Signature.getInstance(r1);
        L6:
            return Signature.getInstance(r1, r2);
        }
    }

    T getInstance(String r1, Provider r2) throws GeneralSecurityException;
}
