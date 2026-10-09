package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaic;

@SafeParcelable.Class(creator = "PlayGamesAuthCredentialCreator")
/* loaded from: classes6.dex */
public class PlayGamesAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<PlayGamesAuthCredential> CREATOR = null;

    @SafeParcelable.Field(getter = "getServerAuthCode", id = 1)
    private final String zza;

    static {
        CREATOR = new zzar();
    }

    @SafeParcelable.Constructor
    public PlayGamesAuthCredential(@SafeParcelable.Param(id = 1) String r1) {
        this.zza = Preconditions.checkNotEmpty(r1);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getProvider() {
        return "playgames.google.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getSignInMethod() {
        return "playgames.google.com";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeString(r4, 1, this.zza, false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential zza() {
        return new PlayGamesAuthCredential(this.zza);
    }

    public static zzaic zza(PlayGamesAuthCredential r10, String r11) {
        Preconditions.checkNotNull(r10);
        return new zzaic(null, null, r10.getProvider(), null, null, r10.zza, r11, null, null);
    }
}
