package com.google.crypto.tink.integration.android;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.google.android.gms.stats.CodePackage;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KmsClient;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* loaded from: classes6.dex */
public final class AndroidKeystoreKmsClient implements KmsClient {
    private static final int MAX_WAIT_TIME_MILLISECONDS_BEFORE_RETRY = 40;
    public static final String PREFIX = "android-keystore://";
    private static final String TAG = "AndroidKeystoreKmsClient";
    private static final Object keyCreationLock = null;
    private KeyStore keyStore;
    private final String keyUri;

    /* renamed from: com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        KeyStore keyStore;
        String keyUri;

        public Builder() {
            this.keyUri = null;
            this.keyStore = null;
            if (AndroidKeystoreKmsClient.access$000() == false) goto L12;
            KeyStore r1 = KeyStore.getInstance("AndroidKeyStore");     // Catch: Throwable -> L6 GeneralSecurityException -> L8
            this.keyStore = r1;     // Catch: Throwable -> L6 GeneralSecurityException -> L8
            r1.load(null);     // Catch: Throwable -> L6 GeneralSecurityException -> L8
            return;
        L6:
            e = move-exception;
            throw new IllegalStateException(e);
        L12:
            throw new IllegalStateException("need Android Keystore on Android M or newer");
        }

        public AndroidKeystoreKmsClient build() {
            return new AndroidKeystoreKmsClient(this, null);
        }

        @CanIgnoreReturnValue
        public Builder setKeyStore(KeyStore r2) {
            if (r2 == null) goto L6;
            this.keyStore = r2;
            return this;
        L6:
            throw new IllegalArgumentException("val cannot be null");
        }

        @CanIgnoreReturnValue
        public Builder setKeyUri(String r3) {
            if (r3 == null) goto L8;
            if (r3.toLowerCase(Locale.US).startsWith(AndroidKeystoreKmsClient.PREFIX) == false) goto L8;
            this.keyUri = r3;
            return this;
        L8:
            throw new IllegalArgumentException("val must start with android-keystore://");
        }
    }

    static {
        keyCreationLock = new Object();
    }

    public /* synthetic */ AndroidKeystoreKmsClient(Builder r1, AnonymousClass1 r2) {
        this(r1);
    }

    public static /* synthetic */ boolean access$000() {
        return isAtLeastM();
    }

    public static boolean generateKeyIfNotExist(String r2) throws GeneralSecurityException {
        AndroidKeystoreKmsClient r02 = new AndroidKeystoreKmsClient();
        Object r1 = keyCreationLock;
        monitor-enter(r1);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (r02.hasKey(r2) == true) goto L12;
        generateNewAesGcmKeyWithoutExistenceCheck(r2);     // Catch: Throwable -> L9
        monitor-exit(r1);     // Catch: Throwable -> L9
        return true;
    L12:
        monitor-exit(r1);     // Catch: Throwable -> L9
        return false;
    }

    public static void generateNewAeadKey(String r3) throws GeneralSecurityException {
        AndroidKeystoreKmsClient r02 = new AndroidKeystoreKmsClient();
        Object r1 = keyCreationLock;
        monitor-enter(r1);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (r02.hasKey(r3) == true) goto L12;
        generateNewAesGcmKeyWithoutExistenceCheck(r3);     // Catch: Throwable -> L9
        monitor-exit(r1);     // Catch: Throwable -> L9
        return;
    L12:
        throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", new Object[]{r3}));     // Catch: Throwable -> L9
    }

    public static void generateNewAesGcmKeyWithoutExistenceCheck(String r3) throws GeneralSecurityException {
        String r32 = Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, r3);
        KeyGenerator r02 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        r02.init(new KeyGenParameterSpec.Builder(r32, 3).setKeySize(256).setBlockModes(new String[]{CodePackage.GCM}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
        r02.generateKey();
    }

    public static Aead getOrGenerateNewAeadKey(String r3) throws GeneralSecurityException, IOException {
        AndroidKeystoreKmsClient r02 = new AndroidKeystoreKmsClient();
        Object r1 = keyCreationLock;
        monitor-enter(r1);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (r02.hasKey(r3) == true) goto L9;
        generateNewAesGcmKeyWithoutExistenceCheck(r3);     // Catch: Throwable -> L7
    L9:
        monitor-exit(r1);     // Catch: Throwable -> L7
        return r02.getAead(r3);
    }

    private static boolean isAtLeastM() {
        return true;
    }

    private static void sleepRandomAmount() {
        Thread.sleep((int) (Math.random() * 40.0d));     // Catch: InterruptedException -> L5
        return;
    }

    private static Aead validateAead(Aead r3) throws GeneralSecurityException {
        byte[] r02 = Random.randBytes(10);
        byte[] r1 = new byte[0];
        if (Arrays.equals(r02, r3.decrypt(r3.encrypt(r02, r1), r1)) == false) goto L6;
        return r3;
    L6:
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    public synchronized void deleteKey(String r2) throws GeneralSecurityException {
        monitor-enter(this);
        String r22 = Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, r2);     // Catch: Throwable -> L6
        this.keyStore.deleteEntry(r22);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // com.google.crypto.tink.KmsClient
    public synchronized boolean doesSupport(String r3) {
        monitor-enter(this);
        String r02 = this.keyUri;     // Catch: Throwable -> L9
        boolean r1 = true;
        if (r02 == null) goto L12;
        if (r02.equals(r3) == false) goto L12;
        monitor-exit(this);
        return true;
    L12:
        if (this.keyUri != null) goto L16;
        if (r3.toLowerCase(Locale.US).startsWith(PREFIX) == false) goto L16;
    L17:
        monitor-exit(this);
        return r1;
    L16:
        r1 = false;
    L9:
        th = move-exception;
        throw th;
    }

    @Override // com.google.crypto.tink.KmsClient
    public synchronized Aead getAead(String r4) throws GeneralSecurityException {
        monitor-enter(this);
        String r02 = this.keyUri;     // Catch: Throwable -> L10
        if (r02 != null) goto L6;
    L12:
        Aead r42 = validateAead(new AndroidKeystoreAesGcm(Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, r4), this.keyStore));     // Catch: Throwable -> L10
        monitor-exit(this);
        return r42;
    L6:
        if (r02.equals(r4) == true) goto L12;
        throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", new Object[]{this.keyUri, r4}));     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        throw th;
    }

    public synchronized boolean hasKey(String r3) throws GeneralSecurityException {
        monitor-enter(this);
        String r32 = Validators.validateKmsKeyUriAndRemovePrefix(PREFIX, r3);     // Catch: Throwable -> L7
        boolean r33 = this.keyStore.containsAlias(r32);     // Catch: Throwable -> L7 NullPointerException -> L9
        monitor-exit(this);
        return r33;
    L9:
        Log.w(TAG, "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");     // Catch: Throwable -> L7
        sleepRandomAmount();     // Catch: Throwable -> L7 IOException -> L14
        KeyStore r02 = KeyStore.getInstance("AndroidKeyStore");     // Catch: Throwable -> L7 IOException -> L14
        this.keyStore = r02;     // Catch: Throwable -> L7 IOException -> L14
        r02.load(null);     // Catch: Throwable -> L7 IOException -> L14
    L13:
        return this.keyStore.containsAlias(r32);
    L14:
        e = move-exception;
        throw new GeneralSecurityException(e);     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        throw th;
    }

    @Override // com.google.crypto.tink.KmsClient
    public KmsClient withCredentials(String r1) throws GeneralSecurityException {
        return new AndroidKeystoreKmsClient();
    }

    @Override // com.google.crypto.tink.KmsClient
    public KmsClient withDefaultCredentials() throws GeneralSecurityException {
        return new AndroidKeystoreKmsClient();
    }

    public AndroidKeystoreKmsClient() throws GeneralSecurityException {
        this(new Builder());
    }

    @Deprecated
    public AndroidKeystoreKmsClient(String r2) {
        this(new Builder().setKeyUri(r2));
    }

    private AndroidKeystoreKmsClient(Builder r2) {
        this.keyUri = r2.keyUri;
        this.keyStore = r2.keyStore;
    }
}
