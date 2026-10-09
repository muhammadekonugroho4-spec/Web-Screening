package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(creator = "DeviceOrientationRequestCreator")
/* loaded from: classes5.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = null;

    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_SHOULD_USE_MAG", id = 1)
    boolean zza;

    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_MINIMUM_SAMPLING_PERIOD_MS", id = 2)
    long zzb;

    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_SMALLEST_ANGLE_CHANGE_RADIANS", id = 3)
    float zzc;

    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_EXPIRE_AT_MS", id = 4)
    long zzd;

    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequest.DEFAULT_NUM_UPDATES", id = 5)
    int zze;

    static {
        CREATOR = new zzt();
    }

    public zzs() {
        this(true, 50, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof zzs) == true) goto L8;
        return false;
    L8:
        zzs r82 = (zzs) r8;
        if (this.zza == r82.zza) goto L11;
    L19:
        return false;
    L11:
        if (this.zzb != r82.zzb) goto L19;
        if (Float.compare(this.zzc, r82.zzc) != 0) goto L19;
        if (this.zzd != r82.zzd) goto L19;
        if (this.zze != r82.zze) goto L19;
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(new Object[]{Boolean.valueOf(this.zza), Long.valueOf(this.zzb), Float.valueOf(this.zzc), Long.valueOf(this.zzd), Integer.valueOf(this.zze)});
    }

    public final String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append("DeviceOrientationRequest[mShouldUseMag=");
        r02.append(this.zza);
        r02.append(" mMinimumSamplingPeriodMs=");
        r02.append(this.zzb);
        r02.append(" mSmallestAngleChangeRadians=");
        r02.append(this.zzc);
        long r1 = this.zzd;
        if (r1 == Long.MAX_VALUE) goto L6;
        long r3 = SystemClock.elapsedRealtime();
        r02.append(" expireIn=");
        r02.append(r1 - r3);
        r02.append("ms");
    L6:
        if (this.zze == Integer.MAX_VALUE) goto L8;
        r02.append(" num=");
        r02.append(this.zze);
    L8:
        r02.append(']');
        return r02.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeBoolean(r4, 1, this.zza);
        SafeParcelWriter.writeLong(r4, 2, this.zzb);
        SafeParcelWriter.writeFloat(r4, 3, this.zzc);
        SafeParcelWriter.writeLong(r4, 4, this.zzd);
        SafeParcelWriter.writeInt(r4, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param(id = 1) boolean r1, @SafeParcelable.Param(id = 2) long r2, @SafeParcelable.Param(id = 3) float r4, @SafeParcelable.Param(id = 4) long r5, @SafeParcelable.Param(id = 5) int r7) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r4;
        this.zzd = r5;
        this.zze = r7;
    }
}
