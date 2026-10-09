package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ValidateAccountRequestCreator")
@Deprecated
/* loaded from: classes5.dex */
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = null;

    @SafeParcelable.VersionField(id = 1)
    final int zza;

    static {
        CREATOR = new zzam();
    }

    @SafeParcelable.Constructor
    public zzal(@SafeParcelable.Param(id = 1) int r1) {
        this.zza = r1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        int r42 = this.zza;
        int r02 = SafeParcelWriter.beginObjectHeader(r3);
        SafeParcelWriter.writeInt(r3, 1, r42);
        SafeParcelWriter.finishObjectHeader(r3, r02);
    }
}
