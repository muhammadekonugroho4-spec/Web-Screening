package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "InitializationParamsCreator")
/* loaded from: classes5.dex */
public final class zzdz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdz> CREATOR = null;

    @SafeParcelable.Field(id = 1)
    public final long zza;

    @SafeParcelable.Field(id = 2)
    public final long zzb;

    @SafeParcelable.Field(id = 3)
    public final boolean zzc;

    @SafeParcelable.Field(id = 4)
    public final String zzd;

    @SafeParcelable.Field(id = 5)
    public final String zze;

    @SafeParcelable.Field(id = 6)
    public final String zzf;

    @SafeParcelable.Field(id = 7)
    public final Bundle zzg;

    @SafeParcelable.Field(id = 8)
    public final String zzh;

    static {
        CREATOR = new zzec();
    }

    @SafeParcelable.Constructor
    public zzdz(@SafeParcelable.Param(id = 1) long r1, @SafeParcelable.Param(id = 2) long r3, @SafeParcelable.Param(id = 3) boolean r5, @SafeParcelable.Param(id = 4) String r6, @SafeParcelable.Param(id = 5) String r7, @SafeParcelable.Param(id = 6) String r8, @SafeParcelable.Param(id = 7) Bundle r9, @SafeParcelable.Param(id = 8) String r10) {
        this.zza = r1;
        this.zzb = r3;
        this.zzc = r5;
        this.zzd = r6;
        this.zze = r7;
        this.zzf = r8;
        this.zzg = r9;
        this.zzh = r10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeLong(r4, 1, this.zza);
        SafeParcelWriter.writeLong(r4, 2, this.zzb);
        SafeParcelWriter.writeBoolean(r4, 3, this.zzc);
        SafeParcelWriter.writeString(r4, 4, this.zzd, false);
        SafeParcelWriter.writeString(r4, 5, this.zze, false);
        SafeParcelWriter.writeString(r4, 6, this.zzf, false);
        SafeParcelWriter.writeBundle(r4, 7, this.zzg, false);
        SafeParcelWriter.writeString(r4, 8, this.zzh, false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
