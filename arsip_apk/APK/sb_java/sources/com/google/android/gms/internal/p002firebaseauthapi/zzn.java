package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
final class zzn extends zzl implements Serializable {
    private final Pattern zza;

    public zzn(Pattern r1) {
        this.zza = (Pattern) zzw.zza(r1);
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzl
    public final zzm zza(CharSequence r3) {
        return new zzq(this.zza.matcher(r3));
    }
}
