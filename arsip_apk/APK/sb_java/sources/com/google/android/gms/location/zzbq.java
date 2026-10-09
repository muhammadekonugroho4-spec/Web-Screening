package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "RemoveGeofencingRequestCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class zzbq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbq> CREATOR = null;

    @SafeParcelable.Field(getter = "getGeofenceIds", id = 1)
    private final List<String> zza;

    @SafeParcelable.Field(getter = "getPendingIntent", id = 2)
    private final PendingIntent zzb;

    @SafeParcelable.Field(defaultValue = "", getter = "getTag", id = 3)
    private final String zzc;

    static {
        CREATOR = new zzbr();
    }

    @SafeParcelable.Constructor
    public zzbq(@SafeParcelable.Param(id = 1) List<String> r1, @SafeParcelable.Param(id = 2) PendingIntent r2, @SafeParcelable.Param(id = 3) String r3) {
        if (r1 != null) goto L5;
        com.google.android.gms.internal.location.zzbs r12 = com.google.android.gms.internal.location.zzbs.zzi();
    L6:
        this.zza = r12;
        this.zzb = r2;
        this.zzc = r3;
        return;
    L5:
        r12 = com.google.android.gms.internal.location.zzbs.zzj(r1);
        goto L6
    }

    public static zzbq zza(List<String> r3) {
        Preconditions.checkNotNull(r3, "geofence can't be null.");
        Preconditions.checkArgument(!r3.isEmpty(), "Geofences must contains at least one id.");
        return new zzbq(r3, null, "");
    }

    public static zzbq zzb(PendingIntent r3) {
        Preconditions.checkNotNull(r3, "PendingIntent can not be null.");
        return new zzbq(null, r3, "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        int r02 = SafeParcelWriter.beginObjectHeader(r5);
        SafeParcelWriter.writeStringList(r5, 1, this.zza, false);
        SafeParcelWriter.writeParcelable(r5, 2, this.zzb, r6, false);
        SafeParcelWriter.writeString(r5, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(r5, r02);
    }
}
