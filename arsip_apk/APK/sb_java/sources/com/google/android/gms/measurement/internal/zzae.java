package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "BatchUploadStatusParcelCreator")
/* loaded from: classes5.dex */
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = null;

    @SafeParcelable.Field(id = 1)
    public final long zza;

    @SafeParcelable.Field(id = 2)
    public final int zzb;

    @SafeParcelable.Field(id = 3)
    public final long zzc;

    static {
        CREATOR = new zzah();
    }

    @SafeParcelable.Constructor
    public zzae(@SafeParcelable.Param(id = 1) long r1, @SafeParcelable.Param(id = 2) int r3, @SafeParcelable.Param(id = 3) long r4) {
        this.zza = r1;
        this.zzb = r3;
        this.zzc = r4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeLong(r4, 1, this.zza);
        SafeParcelWriter.writeInt(r4, 2, this.zzb);
        SafeParcelWriter.writeLong(r4, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
