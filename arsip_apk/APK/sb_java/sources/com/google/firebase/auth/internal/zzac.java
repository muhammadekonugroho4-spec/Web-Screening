package com.google.firebase.auth.internal;

import com.google.firebase.auth.FirebaseAuthSettings;

/* loaded from: classes6.dex */
public final class zzac extends FirebaseAuthSettings {
    private String zza;
    private String zzb;
    private boolean zzc;
    private boolean zzd;

    public zzac() {
        this.zzc = false;
        this.zzd = false;
    }

    @Override // com.google.firebase.auth.FirebaseAuthSettings
    public final void forceRecaptchaFlowForTesting(boolean r1) {
        this.zzd = r1;
    }

    @Override // com.google.firebase.auth.FirebaseAuthSettings
    public final void setAppVerificationDisabledForTesting(boolean r1) {
        this.zzc = r1;
    }

    @Override // com.google.firebase.auth.FirebaseAuthSettings
    public final void setAutoRetrievedSmsCodeForPhoneNumber(String r1, String r2) {
        this.zza = r1;
        this.zzb = r2;
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zzd;
    }

    public final boolean zzd() {
        if (this.zza != null) goto L5;
        return false;
    L5:
        if (this.zzb == null) goto L10;
        return true;
    L10:
        return false;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
