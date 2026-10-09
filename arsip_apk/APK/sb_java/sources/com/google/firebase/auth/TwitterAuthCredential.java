package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaic;

@SafeParcelable.Class(creator = "TwitterAuthCredentialCreator")
/* loaded from: classes6.dex */
public class TwitterAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<TwitterAuthCredential> CREATOR = null;

    @SafeParcelable.Field(getter = "getToken", id = 1)
    private String zza;

    @SafeParcelable.Field(getter = "getSecret", id = 2)
    private String zzb;

    static {
        CREATOR = new zzat();
    }

    @SafeParcelable.Constructor
    public TwitterAuthCredential(@SafeParcelable.Param(id = 1) String r1, @SafeParcelable.Param(id = 2) String r2) {
        this.zza = Preconditions.checkNotEmpty(r1);
        this.zzb = Preconditions.checkNotEmpty(r2);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getProvider() {
        return "twitter.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getSignInMethod() {
        return "twitter.com";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeString(r4, 1, this.zza, false);
        SafeParcelWriter.writeString(r4, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential zza() {
        return new TwitterAuthCredential(this.zza, this.zzb);
    }

    public static zzaic zza(TwitterAuthCredential r10, String r11) {
        Preconditions.checkNotNull(r10);
        return new zzaic(null, r10.zza, r10.getProvider(), null, r10.zzb, null, r11, null, null);
    }
}
