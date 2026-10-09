package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ConsentParcelCreator")
/* loaded from: classes5.dex */
public final class zzap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzap> CREATOR = null;

    @SafeParcelable.Field(id = 1)
    public final Bundle zza;

    static {
        CREATOR = new zzao();
    }

    @SafeParcelable.Constructor
    public zzap(@SafeParcelable.Param(id = 1) Bundle r1) {
        this.zza = r1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeBundle(r4, 1, this.zza, false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
