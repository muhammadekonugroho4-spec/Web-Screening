package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "UserChallengeRequestCreator")
/* loaded from: classes5.dex */
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = null;

    @SafeParcelable.VersionField(id = 1)
    final int zza;

    @SafeParcelable.Field(id = 2)
    public final String zzb;

    @SafeParcelable.Field(id = 3)
    public final PendingIntent zzc;

    static {
        CREATOR = new zzbc();
    }

    @SafeParcelable.Constructor
    public zzbb(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) String r2, @SafeParcelable.Param(id = 3) PendingIntent r3) {
        this.zza = 1;
        this.zzb = (String) Preconditions.checkNotNull(r2);
        this.zzc = (PendingIntent) Preconditions.checkNotNull(r3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        int r02 = SafeParcelWriter.beginObjectHeader(r5);
        SafeParcelWriter.writeInt(r5, 1, this.zza);
        SafeParcelWriter.writeString(r5, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(r5, 3, this.zzc, r6, false);
        SafeParcelWriter.finishObjectHeader(r5, r02);
    }

    public zzbb(String r2, PendingIntent r3) {
        this(1, r2, r3);
    }
}
