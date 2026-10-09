package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "NotifyCompletionRequestCreator")
/* loaded from: classes5.dex */
public final class zzav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzav> CREATOR = null;

    @SafeParcelable.VersionField(id = 1)
    final int zza;

    @SafeParcelable.Field(id = 2)
    public final String zzb;

    @SafeParcelable.Field(id = 3)
    public final int zzc;

    static {
        CREATOR = new zzaw();
    }

    @SafeParcelable.Constructor
    public zzav(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) String r2, @SafeParcelable.Param(id = 3) int r3) {
        this.zza = 1;
        this.zzb = (String) Preconditions.checkNotNull(r2);
        this.zzc = r3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeInt(r4, 1, this.zza);
        SafeParcelWriter.writeString(r4, 2, this.zzb, false);
        SafeParcelWriter.writeInt(r4, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    public zzav(String r2, int r3) {
        this(1, r2, r3);
    }
}
