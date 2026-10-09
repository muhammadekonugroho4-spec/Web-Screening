package com.google.android.gms.internal.time;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Objects;

@SafeParcelable.Class(creator = "ParcelableTicksCreator")
/* loaded from: classes5.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = null;

    @SafeParcelable.Field(getter = "getTickerType", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getValue", id = 2)
    private final long zzb;

    static {
        CREATOR = new zzp();
    }

    @SafeParcelable.Constructor
    public zzo(@SafeParcelable.Param(id = 1) int r2, @SafeParcelable.Param(id = 2) long r3) {
        if (r2 != 1) goto L7;
        this.zza = 1;
        this.zzb = r3;
        return;
    L7:
        throw new IllegalArgumentException("Invalid ticker type. Refer to @TickerType to see all the valid cases.");
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof zzo) == true) goto L8;
        return false;
    L8:
        zzo r82 = (zzo) r8;
        if (this.zza == r82.zza) goto L11;
    L13:
        return false;
    L11:
        if (this.zzb != r82.zzb) goto L13;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.zza), Long.valueOf(this.zzb)});
    }

    public final String toString() {
        return "ParcelableTicks{tickerType=" + this.zza + ", value=" + this.zzb + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeInt(r4, 1, this.zza);
        SafeParcelWriter.writeLong(r4, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    public final int zza() {
        return this.zza;
    }

    public final long zzb() {
        return this.zzb;
    }
}
