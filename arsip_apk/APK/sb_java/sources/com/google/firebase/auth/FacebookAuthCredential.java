package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaic;

@SafeParcelable.Class(creator = "FacebookAuthCredentialCreator")
/* loaded from: classes6.dex */
public class FacebookAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<FacebookAuthCredential> CREATOR = null;

    @SafeParcelable.Field(getter = "getAccessToken", id = 1)
    private final String zza;

    static {
        CREATOR = new zzg();
    }

    @SafeParcelable.Constructor
    public FacebookAuthCredential(@SafeParcelable.Param(id = 1) String r1) {
        this.zza = Preconditions.checkNotEmpty(r1);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getProvider() {
        return "facebook.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getSignInMethod() {
        return "facebook.com";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeString(r4, 1, this.zza, false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential zza() {
        return new FacebookAuthCredential(this.zza);
    }

    public static zzaic zza(FacebookAuthCredential r10, String r11) {
        Preconditions.checkNotNull(r10);
        return new zzaic(null, r10.zza, r10.getProvider(), null, null, null, r11, null, null);
    }
}
