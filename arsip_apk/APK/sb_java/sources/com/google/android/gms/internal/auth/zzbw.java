package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(creator = "ClearTokenRequestCreator")
/* loaded from: classes5.dex */
public final class zzbw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbw> CREATOR = null;

    @SafeParcelable.VersionField(id = 1)
    final int zza;

    @SafeParcelable.Field(id = 2)
    String zzb;

    static {
        CREATOR = new zzbx();
    }

    public zzbw() {
        this.zza = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeInt(r4, 1, this.zza);
        SafeParcelWriter.writeString(r4, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    public final zzbw zza(String r1) {
        this.zzb = r1;
        return this;
    }

    @SafeParcelable.Constructor
    public zzbw(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) String r2) {
        this.zza = r1;
        this.zzb = r2;
    }
}
