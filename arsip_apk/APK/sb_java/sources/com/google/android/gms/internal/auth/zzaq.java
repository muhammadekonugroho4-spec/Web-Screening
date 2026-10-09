package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "DeviceMetaDataRequestCreator")
/* loaded from: classes5.dex */
public final class zzaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaq> CREATOR = null;

    @SafeParcelable.VersionField(id = 1)
    final int zza;

    @SafeParcelable.Field(id = 2)
    public final String zzb;

    static {
        CREATOR = new zzar();
    }

    @SafeParcelable.Constructor
    public zzaq(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) String r2) {
        this.zza = 1;
        this.zzb = (String) Preconditions.checkNotNull(r2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeInt(r4, 1, this.zza);
        SafeParcelWriter.writeString(r4, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    public zzaq(String r2) {
        this(1, r2);
    }
}
