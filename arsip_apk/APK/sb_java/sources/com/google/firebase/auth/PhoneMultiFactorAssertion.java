package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes6.dex */
public class PhoneMultiFactorAssertion extends MultiFactorAssertion {
    private final PhoneAuthCredential zza;

    public PhoneMultiFactorAssertion(PhoneAuthCredential r1) {
        Preconditions.checkNotNull(r1);
        this.zza = r1;
    }

    @Override // com.google.firebase.auth.MultiFactorAssertion
    public String getFactorId() {
        return "phone";
    }

    public final PhoneAuthCredential zza() {
        return this.zza;
    }
}
