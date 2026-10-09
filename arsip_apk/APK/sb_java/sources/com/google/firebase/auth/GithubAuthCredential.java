package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaic;

@SafeParcelable.Class(creator = "GithubAuthCredentialCreator")
/* loaded from: classes6.dex */
public class GithubAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<GithubAuthCredential> CREATOR = null;

    @SafeParcelable.Field(getter = "getToken", id = 1)
    private String zza;

    static {
        CREATOR = new zzaj();
    }

    @SafeParcelable.Constructor
    public GithubAuthCredential(@SafeParcelable.Param(id = 1) String r1) {
        this.zza = Preconditions.checkNotEmpty(r1);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getProvider() {
        return "github.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getSignInMethod() {
        return "github.com";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeString(r4, 1, this.zza, false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential zza() {
        return new GithubAuthCredential(this.zza);
    }

    public static zzaic zza(GithubAuthCredential r10, String r11) {
        Preconditions.checkNotNull(r10);
        return new zzaic(null, r10.zza, r10.getProvider(), null, null, null, r11, null, null);
    }
}
