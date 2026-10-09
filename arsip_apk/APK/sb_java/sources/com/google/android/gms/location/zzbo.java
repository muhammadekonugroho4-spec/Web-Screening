package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(creator = "NetworkLocationStatusCreator")
/* loaded from: classes5.dex */
public final class zzbo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbo> CREATOR = null;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", id = 1)
    public final int zza;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", id = 2)
    public final int zzb;

    @SafeParcelable.Field(defaultValueUnchecked = "NetworkLocationStatus.STATUS_INVALID_TIMESTAMP", id = 3)
    public final long zzc;

    @SafeParcelable.Field(defaultValueUnchecked = "NetworkLocationStatus.STATUS_INVALID_TIMESTAMP", id = 4)
    public final long zzd;

    static {
        CREATOR = new zzbp();
    }

    @SafeParcelable.Constructor
    public zzbo(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) int r2, @SafeParcelable.Param(id = 3) long r3, @SafeParcelable.Param(id = 4) long r5) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
        this.zzd = r5;
    }

    public final boolean equals(Object r7) {
        if ((r7 instanceof zzbo) == false) goto L14;
        zzbo r72 = (zzbo) r7;
        if (this.zza != r72.zza) goto L14;
        if (this.zzb != r72.zzb) goto L14;
        if (this.zzc != r72.zzc) goto L14;
        if (this.zzd != r72.zzd) goto L14;
        return true;
    L14:
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(new Object[]{Integer.valueOf(this.zzb), Integer.valueOf(this.zza), Long.valueOf(this.zzd), Long.valueOf(this.zzc)});
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.zza + " Cell status: " + this.zzb + " elapsed time NS: " + this.zzd + " system time ms: " + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeInt(r4, 1, this.zza);
        SafeParcelWriter.writeInt(r4, 2, this.zzb);
        SafeParcelWriter.writeLong(r4, 3, this.zzc);
        SafeParcelWriter.writeLong(r4, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
