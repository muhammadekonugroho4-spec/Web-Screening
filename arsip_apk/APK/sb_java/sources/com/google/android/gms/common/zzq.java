package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GoogleCertificatesLookupResponseCreator")
/* loaded from: classes5.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = null;

    @SafeParcelable.Field(getter = "getResult", id = 1)
    private final boolean zza;

    @SafeParcelable.Field(getter = "getErrorMessage", id = 2)
    private final String zzb;

    @SafeParcelable.Field(getter = "getStatusValue", id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getFirstPartyStatusValue", id = 4)
    private final int zzd;

    static {
        CREATOR = new zzr();
    }

    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param(id = 1) boolean r1, @SafeParcelable.Param(id = 2) String r2, @SafeParcelable.Param(id = 3) int r3, @SafeParcelable.Param(id = 4) int r4) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = zzx.zza(r3) - 1;
        this.zzd = zzd.zza(r4) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeBoolean(r4, 1, this.zza);
        SafeParcelWriter.writeString(r4, 2, this.zzb, false);
        SafeParcelWriter.writeInt(r4, 3, this.zzc);
        SafeParcelWriter.writeInt(r4, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return this.zza;
    }

    public final int zzc() {
        return zzd.zza(this.zzd);
    }

    public final int zzd() {
        return zzx.zza(this.zzc);
    }
}
