package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

@SafeParcelable.Class(creator = "LocationSettingsStatesCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = null;

    @SafeParcelable.Field(getter = "isGpsUsable", id = 1)
    private final boolean zza;

    @SafeParcelable.Field(getter = "isNetworkLocationUsable", id = 2)
    private final boolean zzb;

    @SafeParcelable.Field(getter = "isBleUsable", id = 3)
    private final boolean zzc;

    @SafeParcelable.Field(getter = "isGpsPresent", id = 4)
    private final boolean zzd;

    @SafeParcelable.Field(getter = "isNetworkLocationPresent", id = 5)
    private final boolean zze;

    @SafeParcelable.Field(getter = "isBlePresent", id = 6)
    private final boolean zzf;

    static {
        CREATOR = new zzbn();
    }

    @SafeParcelable.Constructor
    public LocationSettingsStates(@SafeParcelable.Param(id = 1) boolean r1, @SafeParcelable.Param(id = 2) boolean r2, @SafeParcelable.Param(id = 3) boolean r3, @SafeParcelable.Param(id = 4) boolean r4, @SafeParcelable.Param(id = 5) boolean r5, @SafeParcelable.Param(id = 6) boolean r6) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
        this.zzd = r4;
        this.zze = r5;
        this.zzf = r6;
    }

    public static LocationSettingsStates fromIntent(Intent r2) {
        return (LocationSettingsStates) SafeParcelableSerializer.deserializeFromIntentExtra(r2, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
    }

    public boolean isBlePresent() {
        return this.zzf;
    }

    public boolean isBleUsable() {
        return this.zzc;
    }

    public boolean isGpsPresent() {
        return this.zzd;
    }

    public boolean isGpsUsable() {
        return this.zza;
    }

    public boolean isLocationPresent() {
        if (this.zzd == false) goto L5;
        return true;
    L5:
        if (this.zze == true) goto L11;
        return false;
    L11:
        return true;
    }

    public boolean isLocationUsable() {
        if (this.zza == false) goto L5;
        return true;
    L5:
        if (this.zzb == true) goto L11;
        return false;
    L11:
        return true;
    }

    public boolean isNetworkLocationPresent() {
        return this.zze;
    }

    public boolean isNetworkLocationUsable() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r3, int r4) {
        int r42 = SafeParcelWriter.beginObjectHeader(r3);
        SafeParcelWriter.writeBoolean(r3, 1, isGpsUsable());
        SafeParcelWriter.writeBoolean(r3, 2, isNetworkLocationUsable());
        SafeParcelWriter.writeBoolean(r3, 3, isBleUsable());
        SafeParcelWriter.writeBoolean(r3, 4, isGpsPresent());
        SafeParcelWriter.writeBoolean(r3, 5, isNetworkLocationPresent());
        SafeParcelWriter.writeBoolean(r3, 6, isBlePresent());
        SafeParcelWriter.finishObjectHeader(r3, r42);
    }
}
