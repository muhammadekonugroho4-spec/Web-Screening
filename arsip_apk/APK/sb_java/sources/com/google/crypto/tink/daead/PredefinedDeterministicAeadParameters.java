package com.google.crypto.tink.daead;

import com.google.crypto.tink.daead.AesSivParameters;
import com.google.crypto.tink.internal.TinkBugException;

/* loaded from: classes6.dex */
public final class PredefinedDeterministicAeadParameters {
    public static final AesSivParameters AES256_SIV = null;

    static {
        AES256_SIV = (AesSivParameters) TinkBugException.exceptionIsBug(new e());
    }

    private PredefinedDeterministicAeadParameters() {
    }

    public static /* synthetic */ AesSivParameters a() {
        return AesSivParameters.builder().setKeySizeBytes(64).setVariant(AesSivParameters.Variant.TINK).build();
    }
}
