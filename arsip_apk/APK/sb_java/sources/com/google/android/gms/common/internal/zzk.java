package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ConnectionInfoCreator")
/* loaded from: classes5.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = null;

    @SafeParcelable.Field(id = 1)
    Bundle zza;

    @SafeParcelable.Field(id = 2)
    Feature[] zzb;

    @SafeParcelable.Field(defaultValue = "0", id = 3)
    int zzc;

    @SafeParcelable.Field(id = 4)
    ConnectionTelemetryConfiguration zzd;

    static {
        CREATOR = new zzl();
    }

    public zzk() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        int r02 = SafeParcelWriter.beginObjectHeader(r5);
        SafeParcelWriter.writeBundle(r5, 1, this.zza, false);
        SafeParcelWriter.writeTypedArray(r5, 2, this.zzb, r6, false);
        SafeParcelWriter.writeInt(r5, 3, this.zzc);
        SafeParcelWriter.writeParcelable(r5, 4, this.zzd, r6, false);
        SafeParcelWriter.finishObjectHeader(r5, r02);
    }

    @SafeParcelable.Constructor
    public zzk(@SafeParcelable.Param(id = 1) Bundle r1, @SafeParcelable.Param(id = 2) Feature[] r2, @SafeParcelable.Param(id = 3) int r3, @SafeParcelable.Param(id = 4) ConnectionTelemetryConfiguration r4) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
        this.zzd = r4;
    }
}
