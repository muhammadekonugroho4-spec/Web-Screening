package com.google.android.gms.internal.time;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Objects;

@SafeParcelable.Class(creator = "ParcelableInstantCreator")
/* loaded from: classes5.dex */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = null;

    @SafeParcelable.Field(getter = "getEpochSecond", id = 1)
    private final long zza;

    @SafeParcelable.Field(getter = "getNanosOfSecond", id = 2)
    private final int zzb;

    static {
        new zzi(0, 0);
        new zzi(31556889864403199L, 999999999);
        new zzi(-31557014167219200L, 0);
        CREATOR = new zzj();
    }

    @SafeParcelable.Constructor
    public zzi(@SafeParcelable.Param(id = 1) long r3, @SafeParcelable.Param(id = 2) int r5) {
        if (r3 < (-31557014167219200L)) goto L15;
        if (r3 > 31556889864403199L) goto L15;
        this.zza = r3;
        if (r5 < 0) goto L13;
        if (r5 > 999999999) goto L13;
        this.zzb = r5;
        return;
    L13:
        throw new com.google.android.gms.time.zza("Nano adjustment should be in the range 0 to 999,999,999");
    L15:
        throw new com.google.android.gms.time.zza("Instant exceeds minimum or maximum instant");
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof zzi) == true) goto L8;
        return false;
    L8:
        zzi r82 = (zzi) r8;
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
        return "ParcelableInstant{epochSecond=" + this.zza + ", nanosOfSecond=" + this.zzb + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        long r02 = this.zza;
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeLong(r4, 1, r02);
        SafeParcelWriter.writeInt(r4, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    public final long zza() {
        long r02 = this.zza;
        int r2 = this.zzb / 1000000;
        if (r02 >= 0) goto L7;
        if (r2 <= 0) goto L7;
        r02 = r02 + 1;
        r2 = r2 + Constants.EMPTY_NOTIFICATION_ID;
    L7:
        return zzbz.zzb(r02, 1000) + r2;
    }
}
