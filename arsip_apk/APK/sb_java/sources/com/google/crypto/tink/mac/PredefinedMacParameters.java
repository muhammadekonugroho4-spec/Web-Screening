package com.google.crypto.tink.mac;

import com.google.crypto.tink.internal.TinkBugException;
import com.google.crypto.tink.mac.AesCmacParameters;
import com.google.crypto.tink.mac.HmacParameters;

/* loaded from: classes6.dex */
public final class PredefinedMacParameters {
    public static final AesCmacParameters AES_CMAC = null;
    public static final HmacParameters HMAC_SHA256_128BITTAG = null;
    public static final HmacParameters HMAC_SHA256_256BITTAG = null;
    public static final HmacParameters HMAC_SHA512_256BITTAG = null;
    public static final HmacParameters HMAC_SHA512_512BITTAG = null;

    static {
        HMAC_SHA256_128BITTAG = (HmacParameters) TinkBugException.exceptionIsBug(new k());
        HMAC_SHA256_256BITTAG = (HmacParameters) TinkBugException.exceptionIsBug(new l());
        HMAC_SHA512_256BITTAG = (HmacParameters) TinkBugException.exceptionIsBug(new m());
        HMAC_SHA512_512BITTAG = (HmacParameters) TinkBugException.exceptionIsBug(new n());
        AES_CMAC = (AesCmacParameters) TinkBugException.exceptionIsBug(new o());
    }

    private PredefinedMacParameters() {
    }

    public static /* synthetic */ AesCmacParameters a() {
        return AesCmacParameters.builder().setKeySizeBytes(32).setTagSizeBytes(16).setVariant(AesCmacParameters.Variant.TINK).build();
    }

    public static /* synthetic */ HmacParameters b() {
        return HmacParameters.builder().setKeySizeBytes(64).setTagSizeBytes(32).setVariant(HmacParameters.Variant.TINK).setHashType(HmacParameters.HashType.SHA512).build();
    }

    public static /* synthetic */ HmacParameters c() {
        return HmacParameters.builder().setKeySizeBytes(32).setTagSizeBytes(16).setVariant(HmacParameters.Variant.TINK).setHashType(HmacParameters.HashType.SHA256).build();
    }

    public static /* synthetic */ HmacParameters d() {
        return HmacParameters.builder().setKeySizeBytes(32).setTagSizeBytes(32).setVariant(HmacParameters.Variant.TINK).setHashType(HmacParameters.HashType.SHA256).build();
    }

    public static /* synthetic */ HmacParameters e() {
        return HmacParameters.builder().setKeySizeBytes(64).setTagSizeBytes(64).setVariant(HmacParameters.Variant.TINK).setHashType(HmacParameters.HashType.SHA512).build();
    }
}
