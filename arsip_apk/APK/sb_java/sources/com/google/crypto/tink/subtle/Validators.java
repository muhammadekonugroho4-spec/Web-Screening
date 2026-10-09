package com.google.crypto.tink.subtle;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.subtle.Enums;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class Validators {
    private static final Pattern GCP_KMS_CRYPTO_KEY_PATTERN = null;
    private static final Pattern GCP_KMS_CRYPTO_KEY_VERSION_PATTERN = null;
    private static final int MIN_RSA_MODULUS_SIZE = 2048;
    private static final String TYPE_URL_PREFIX = "type.googleapis.com/";
    private static final String URI_UNRESERVED_CHARS = "([0-9a-zA-Z\\-\\.\\_~])+";

    /* renamed from: com.google.crypto.tink.subtle.Validators$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = null;

        static {
            int[] r02 = new int[Enums.HashType.values().length];
            $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = r02;
            r02[Enums.HashType.SHA256.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
        L10:
            $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[Enums.HashType.SHA384.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L12:
            $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[Enums.HashType.SHA512.ordinal()] = 3;     // Catch: NoSuchFieldError -> L9
            return;
        }
    }

    static {
        GCP_KMS_CRYPTO_KEY_PATTERN = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", new Object[]{URI_UNRESERVED_CHARS, URI_UNRESERVED_CHARS, URI_UNRESERVED_CHARS, URI_UNRESERVED_CHARS}), 2);
        GCP_KMS_CRYPTO_KEY_VERSION_PATTERN = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", new Object[]{URI_UNRESERVED_CHARS, URI_UNRESERVED_CHARS, URI_UNRESERVED_CHARS, URI_UNRESERVED_CHARS, URI_UNRESERVED_CHARS}), 2);
    }

    private Validators() {
    }

    public static void validateAesKeySize(int r2) throws InvalidAlgorithmParameterException {
        if (r2 != 16) goto L5;
        return;
    L5:
        if (r2 != 32) goto L8;
        return;
    L8:
        throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(r2 * 8)}));
    }

    public static void validateCryptoKeyUri(String r1) throws GeneralSecurityException {
        if (GCP_KMS_CRYPTO_KEY_PATTERN.matcher(r1).matches() == false) goto L5;
        return;
    L5:
        if (GCP_KMS_CRYPTO_KEY_VERSION_PATTERN.matcher(r1).matches() == false) goto L9;
        throw new GeneralSecurityException("Invalid Google Cloud KMS Key URI. The URI must point to a CryptoKey, not a CryptoKeyVersion");
    L9:
        throw new GeneralSecurityException("Invalid Google Cloud KMS Key URI. The URI must point to a CryptoKey in the format projects/*/locations/*/keyRings/*/cryptoKeys/*. See https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys#CryptoKey");
    }

    public static void validateExists(File r2) throws IOException {
        if (r2.exists() == false) goto L6;
        return;
    L6:
        throw new IOException(String.format("Error: %s doesn't exist, please choose another file\n", new Object[]{r2}));
    }

    public static String validateKmsKeyUriAndRemovePrefix(String r1, String r2) {
        if (r2.toLowerCase(Locale.US).startsWith(r1) == false) goto L7;
        return r2.substring(r1.length());
    L7:
        throw new IllegalArgumentException(String.format("key URI must start with %s", new Object[]{r1}));
    }

    public static void validateNotExists(File r2) throws IOException {
        if (r2.exists() == true) goto L6;
        return;
    L6:
        throw new IOException(String.format("%s exists, please choose another file\n", new Object[]{r2}));
    }

    public static void validateRsaModulusSize(int r2) throws GeneralSecurityException {
        if (r2 < MIN_RSA_MODULUS_SIZE) goto L14;
        if (TinkFipsUtil.useOnlyFips() == false) goto L12;
        if (r2 != MIN_RSA_MODULUS_SIZE) goto L8;
        return;
    L8:
        if (r2 != 3072) goto L11;
        return;
    L11:
        throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size of 2048- or 3072-bit is supported in FIPS mode.", new Object[]{Integer.valueOf(r2)}));
    L12:
        return;
    L14:
        throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size >= 2048-bit is supported", new Object[]{Integer.valueOf(r2)}));
    }

    public static void validateRsaPublicExponent(BigInteger r2) throws GeneralSecurityException {
        if (r2.testBit(0) == false) goto L10;
        if (r2.compareTo(BigInteger.valueOf(65536)) <= 0) goto L8;
        return;
    L8:
        throw new GeneralSecurityException("Public exponent must be greater than 65536.");
    L10:
        throw new GeneralSecurityException("Public exponent must be odd.");
    }

    public static void validateSignatureHash(Enums.HashType r3) throws GeneralSecurityException {
        int r02 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[r3.ordinal()];
        if (r02 != 1) goto L5;
        return;
    L5:
        if (r02 != 2) goto L7;
        return;
    L7:
        if (r02 != 3) goto L10;
        return;
    L10:
        throw new GeneralSecurityException("Unsupported hash: " + r3.name());
    }

    public static void validateTypeUrl(String r3) throws GeneralSecurityException {
        if (r3.startsWith(TYPE_URL_PREFIX) == false) goto L10;
        if (r3.length() == 20) goto L8;
        return;
    L8:
        throw new GeneralSecurityException(String.format("Error: type URL %s is invalid; it has no message name.\n", new Object[]{r3}));
    L10:
        throw new GeneralSecurityException(String.format("Error: type URL %s is invalid; it must start with %s.\n", new Object[]{r3, TYPE_URL_PREFIX}));
    }

    public static void validateVersion(int r1, int r2) throws GeneralSecurityException {
        if (r1 < 0) goto L6;
        if (r1 > r2) goto L6;
        return;
    L6:
        throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", new Object[]{Integer.valueOf(r1), Integer.valueOf(r2)}));
    }
}
