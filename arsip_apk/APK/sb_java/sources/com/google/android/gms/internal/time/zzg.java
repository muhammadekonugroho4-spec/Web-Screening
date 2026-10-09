package com.google.android.gms.internal.time;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Objects;

@SafeParcelable.Class(creator = "ParcelableDurationCreator")
/* loaded from: classes5.dex */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = null;

    @SafeParcelable.Field(getter = "getSeconds", id = 1)
    private final long zza;

    @SafeParcelable.Field(getter = "getNano", id = 2)
    private final int zzb;

    static {
        new zzg(0, 0);
        CREATOR = new zzh();
    }

    @SafeParcelable.Constructor
    public zzg(@SafeParcelable.Param(id = 1) long r2, @SafeParcelable.Param(id = 2) int r4) {
        if (r4 < 0) goto L9;
        if (r4 > 999999999) goto L9;
        this.zza = r2;
        this.zzb = r4;
        return;
    L9:
        throw new com.google.android.gms.time.zza("Nano adjustment should be in the range 0 to 999,999,999");
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof zzg) == true) goto L8;
        return false;
    L8:
        zzg r82 = (zzg) r8;
        if (this.zza == r82.zza) goto L11;
    L13:
        return false;
    L11:
        if (this.zzb != r82.zzb) goto L13;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.zza), Integer.valueOf(this.zzb)});
    }

    public final String toString() {
        return "ParcelableDuration{seconds=" + this.zza + ", nano=" + this.zzb + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeLong(r4, 1, this.zza);
        SafeParcelWriter.writeInt(r4, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    public final int zza() {
        return this.zzb;
    }

    public final long zzb() {
        return this.zza;
    }

    public final long zzc() {
        int r02 = this.zzb;
        return zzbz.zza(zzbz.zzb(this.zza, 1000), r02 / 1000000);
    }

    public final boolean zzd() {
        if (this.zza >= 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean zze() {
        if (this.zza == 0) goto L5;
        return false;
    L5:
        if (this.zzb != 0) goto L10;
        return true;
    L10:
        return false;
    }
}
