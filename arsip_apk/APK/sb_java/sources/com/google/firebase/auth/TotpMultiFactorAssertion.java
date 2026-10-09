package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes6.dex */
public class TotpMultiFactorAssertion extends MultiFactorAssertion {
    private final String zza;
    private final TotpSecret zzb;
    private final String zzc;

    public TotpMultiFactorAssertion(String r1, TotpSecret r2, String r3) {
        this.zza = Preconditions.checkNotEmpty(r1);
        this.zzb = r2;
        this.zzc = r3;
    }

    @Override // com.google.firebase.auth.MultiFactorAssertion
    public String getFactorId() {
        return TotpMultiFactorGenerator.FACTOR_ID;
    }

    public final TotpSecret zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zza;
    }
}
