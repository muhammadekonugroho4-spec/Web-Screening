package com.google.android.gms.internal.time;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Objects;

@SafeParcelable.Class(creator = "GlobalStateCreator")
/* loaded from: classes5.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = null;

    @SafeParcelable.Field(getter = "getBasicPhysicalTickerErrorRateMicrosPerSecond", id = 1)
    private final Long zza;

    @SafeParcelable.Field(getter = "getTimeSignalIntentAction", id = 2)
    private final String zzb;

    @SafeParcelable.Field(defaultValue = "0", getter = "getClockErrorConfidence", id = 3)
    private final int zzc;

    static {
        CREATOR = new zzl();
    }

    @SafeParcelable.Constructor
    public zzk(@SafeParcelable.Param(id = 1) Long r1, @SafeParcelable.Param(id = 2) String r2, @SafeParcelable.Param(id = 3) int r3) {
        this.zza = r1;
        Objects.requireNonNull(r2);
        this.zzb = r2;
        this.zzc = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof zzk) == true) goto L8;
        return false;
    L8:
        zzk r52 = (zzk) r5;
        if (this.zzc == r52.zzc) goto L11;
    L15:
        return false;
    L11:
        if (Objects.equals(this.zza, r52.zza) == false) goto L15;
        if (Objects.equals(this.zzb, r52.zzb) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb, Integer.valueOf(this.zzc)});
    }

    public final String toString() {
        return "GlobalState{basicPhysicalTickerErrorRateMicrosPerSecond=" + this.zza + ", timeSignalIntentAction='" + this.zzb + ", clockErrorConfidence=" + this.zzc + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        Long r52 = this.zza;
        int r02 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeLongObject(r4, 1, r52, false);
        SafeParcelWriter.writeString(r4, 2, this.zzb, false);
        SafeParcelWriter.writeInt(r4, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(r4, r02);
    }

    public final int zza() {
        return this.zzc;
    }

    public final Long zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
