package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.Class(creator = "UploadBatchesCriteriaCreator")
/* loaded from: classes5.dex */
public final class zzop extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzop> CREATOR = null;

    @SafeParcelable.Field(id = 1)
    public final List<Integer> zza;

    static {
        CREATOR = new zzoo();
    }

    @SafeParcelable.Constructor
    public zzop(@SafeParcelable.Param(id = 1) List<Integer> r1) {
        this.zza = r1;
    }

    public static zzop zza(zzlu... r4) {
        ArrayList r02 = new ArrayList(r4.length);
        int r1 = r4.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L6;
        r02.add(Integer.valueOf(r4[r2].zza()));
        r2 = r2 + 1;
        goto L3
    L6:
        return new zzop(r02);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeIntegerList(r4, 1, this.zza, false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
