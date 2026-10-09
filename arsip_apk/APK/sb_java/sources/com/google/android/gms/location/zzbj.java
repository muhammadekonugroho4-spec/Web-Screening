package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LocationSettingsConfigurationCreator")
@SafeParcelable.Reserved({3, 4, 1000})
@Deprecated
@ShowFirstParty
/* loaded from: classes5.dex */
public final class zzbj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbj> CREATOR = null;

    @SafeParcelable.Field(defaultValue = "", getter = "getJustificationText", id = 1)
    private final String zza;

    @SafeParcelable.Field(defaultValue = "", getter = "getExperimentId", id = 2)
    private final String zzb;

    @SafeParcelable.Field(defaultValue = "", getter = "getTitleText", id = 5)
    private final String zzc;

    static {
        CREATOR = new zzbk();
    }

    @SafeParcelable.Constructor
    public zzbj(@SafeParcelable.Param(id = 5) String r1, @SafeParcelable.Param(id = 1) String r2, @SafeParcelable.Param(id = 2) String r3) {
        this.zzc = r1;
        this.zza = r2;
        this.zzb = r3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeString(r4, 1, this.zza, false);
        SafeParcelWriter.writeString(r4, 2, this.zzb, false);
        SafeParcelWriter.writeString(r4, 5, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
