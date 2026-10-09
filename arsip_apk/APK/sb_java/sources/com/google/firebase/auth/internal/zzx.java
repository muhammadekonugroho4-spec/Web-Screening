package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.AdditionalUserInfo;
import java.util.Map;

@SafeParcelable.Class(creator = "DefaultAdditionalUserInfoCreator")
/* loaded from: classes6.dex */
public final class zzx implements AdditionalUserInfo {
    public static final Parcelable.Creator<zzx> CREATOR = null;

    @SafeParcelable.Field(getter = "getProviderId", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getRawUserInfo", id = 2)
    private final String zzb;
    private Map<String, Object> zzc;

    @SafeParcelable.Field(getter = "isNewUser", id = 3)
    private boolean zzd;

    static {
        CREATOR = new zzw();
    }

    public zzx(boolean r1) {
        this.zzd = r1;
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final Map<String, Object> getProfile() {
        return this.zzc;
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final String getProviderId() {
        return this.zza;
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final String getUsername() {
        if ("github.com".equals(this.zza) == false) goto L7;
        return (String) this.zzc.get(FirebaseAnalytics.Event.LOGIN);
    L7:
        if ("twitter.com".equals(this.zza) == true) goto L9;
        return null;
    L9:
        return (String) this.zzc.get(FirebaseAnalytics.Param.SCREEN_NAME);
    }

    @Override // com.google.firebase.auth.AdditionalUserInfo
    public final boolean isNewUser() {
        return this.zzd;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeString(r4, 1, getProviderId(), false);
        SafeParcelWriter.writeString(r4, 2, this.zzb, false);
        SafeParcelWriter.writeBoolean(r4, 3, isNewUser());
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    @SafeParcelable.Constructor
    public zzx(@SafeParcelable.Param(id = 1) String r1, @SafeParcelable.Param(id = 2) String r2, @SafeParcelable.Param(id = 3) boolean r3) {
        Preconditions.checkNotEmpty(r1);
        Preconditions.checkNotEmpty(r2);
        this.zza = r1;
        this.zzb = r2;
        this.zzc = zzbh.zzb(r2);
        this.zzd = r3;
    }
}
