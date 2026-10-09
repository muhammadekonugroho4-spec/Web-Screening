package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "TriggerUriParcelCreator")
/* loaded from: classes5.dex */
public final class zzog extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzog> CREATOR = null;

    @SafeParcelable.Field(id = 1)
    public final String zza;

    @SafeParcelable.Field(id = 2)
    public final long zzb;

    @SafeParcelable.Field(id = 3)
    public final int zzc;

    static {
        CREATOR = new zzoj();
    }

    @SafeParcelable.Constructor
    public zzog(@SafeParcelable.Param(id = 1) String r1, @SafeParcelable.Param(id = 2) long r2, @SafeParcelable.Param(id = 3) int r4) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeString(r4, 1, this.zza, false);
        SafeParcelWriter.writeLong(r4, 2, this.zzb);
        SafeParcelWriter.writeInt(r4, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
