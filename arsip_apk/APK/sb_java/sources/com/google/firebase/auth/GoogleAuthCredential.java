package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaic;

@SafeParcelable.Class(creator = "GoogleAuthCredentialCreator")
/* loaded from: classes6.dex */
public class GoogleAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<GoogleAuthCredential> CREATOR = null;

    @SafeParcelable.Field(getter = "getIdToken", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getAccessToken", id = 2)
    private final String zzb;

    static {
        CREATOR = new zzak();
    }

    @SafeParcelable.Constructor
    public GoogleAuthCredential(@SafeParcelable.Param(id = 1) String r2, @SafeParcelable.Param(id = 2) String r3) {
        if (r2 != null) goto L8;
        if (r3 != null) goto L8;
        throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
    L8:
        if (r2 != null) goto L10;
    L14:
        if (r3 != null) goto L16;
    L20:
        this.zza = r2;
        this.zzb = r3;
        return;
    L16:
        if (r3.length() != 0) goto L20;
        throw new IllegalArgumentException("accessToken cannot be empty");
    L10:
        if (r2.length() != 0) goto L14;
        throw new IllegalArgumentException("idToken cannot be empty");
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getProvider() {
        return "google.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String getSignInMethod() {
        return "google.com";
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
        return new GoogleAuthCredential(this.zza, this.zzb);
    }

    public static zzaic zza(GoogleAuthCredential r10, String r11) {
        Preconditions.checkNotNull(r10);
        return new zzaic(r10.zza, r10.zzb, r10.getProvider(), null, null, null, r11, null, null);
    }
}
