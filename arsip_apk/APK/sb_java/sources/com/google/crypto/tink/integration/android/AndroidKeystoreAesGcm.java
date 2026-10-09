package com.google.crypto.tink.integration.android;

import android.util.Log;
import com.google.crypto.tink.Aead;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes6.dex */
public final class AndroidKeystoreAesGcm implements Aead {
    private static final int IV_SIZE_IN_BYTES = 12;
    private static final int MAX_WAIT_TIME_MILLISECONDS_BEFORE_RETRY = 100;
    private static final String TAG = "AndroidKeystoreAesGcm";
    private static final int TAG_SIZE_IN_BYTES = 16;
    private final SecretKey key;

    static {
    }

    public AndroidKeystoreAesGcm(String r4) throws GeneralSecurityException, IOException {
        KeyStore r02 = KeyStore.getInstance("AndroidKeyStore");
        r02.load(null);
        SecretKey r03 = (SecretKey) r02.getKey(r4, null);
        this.key = r03;
        if (r03 == null) goto L6;
        return;
    L6:
        throw new InvalidKeyException("Keystore cannot load the key with ID: " + r4);
    }

    private byte[] decryptInternal(byte[] r6, byte[] r7) throws GeneralSecurityException {
        GCMParameterSpec r02 = new GCMParameterSpec(128, r6, 0, 12);
        Cipher r1 = Cipher.getInstance("AES/GCM/NoPadding");
        r1.init(2, this.key, r02);
        r1.updateAAD(r7);
        return r1.doFinal(r6, 12, r6.length - 12);
    }

    private byte[] encryptInternal(byte[] r8, byte[] r9) throws GeneralSecurityException {
        if (r8.length > 2147483619) goto L7;
        byte[] r5 = new byte[r8.length + 28];
        Cipher r1 = Cipher.getInstance("AES/GCM/NoPadding");
        r1.init(1, this.key);
        r1.updateAAD(r9);
        r1.doFinal(r8, 0, r8.length, r5, 12);
        System.arraycopy(r1.getIV(), 0, r5, 0, 12);
        return r5;
    L7:
        throw new GeneralSecurityException("plaintext too long");
    }

    private static void sleepRandomAmount() {
        Thread.sleep((int) (Math.random() * 100.0d));     // Catch: InterruptedException -> L5
        return;
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(byte[] r4, byte[] r5) throws GeneralSecurityException {
        if (r4.length < 28) goto L14;
        return decryptInternal(r4, r5);
    L8:
        e = e;
    L9:
        Log.w(TAG, "encountered a potentially transient KeyStore error, will wait and retry", e);
        sleepRandomAmount();
        return decryptInternal(r4, r5);
    L11:
        e = move-exception;
        throw e;
    L6:
        e = e;
        goto L9
    L14:
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(byte[] r4, byte[] r5) throws GeneralSecurityException {
        return encryptInternal(r4, r5);
    L4:
        e = move-exception;
        Log.w(TAG, "encountered a potentially transient KeyStore error, will wait and retry", e);
        sleepRandomAmount();
        return encryptInternal(r4, r5);
    }

    public AndroidKeystoreAesGcm(String r3, KeyStore r4) throws GeneralSecurityException {
        SecretKey r42 = (SecretKey) r4.getKey(r3, null);
        this.key = r42;
        if (r42 == null) goto L6;
        return;
    L6:
        throw new InvalidKeyException("Keystore cannot load the key with ID: " + r3);
    }
}
