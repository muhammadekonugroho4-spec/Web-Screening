package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "FusedLocationProviderResultCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class zzaa extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zzaa> CREATOR = null;
    public static final zzaa zza = null;

    @SafeParcelable.Field(getter = "getStatus", id = 1)
    private final Status zzb;

    static {
        zza = new zzaa(Status.RESULT_SUCCESS);
        CREATOR = new zzab();
    }

    @SafeParcelable.Constructor
    public zzaa(@SafeParcelable.Param(id = 1) Status r1) {
        this.zzb = r1;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        int r02 = SafeParcelWriter.beginObjectHeader(r5);
        SafeParcelWriter.writeParcelable(r5, 1, this.zzb, r6, false);
        SafeParcelWriter.finishObjectHeader(r5, r02);
    }
}
