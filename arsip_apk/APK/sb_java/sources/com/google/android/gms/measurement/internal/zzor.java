package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "UploadBatchesParcelCreator")
/* loaded from: classes5.dex */
public final class zzor extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzor> CREATOR = null;

    @SafeParcelable.Field(id = 1)
    public final List<zzon> zza;

    static {
        CREATOR = new zzoq();
    }

    @SafeParcelable.Constructor
    public zzor(@SafeParcelable.Param(id = 1) List<zzon> r1) {
        this.zza = r1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeTypedList(r4, 1, this.zza, false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
