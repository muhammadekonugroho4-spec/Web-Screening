package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(creator = "UserPreferredSleepWindowCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class zzbx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbx> CREATOR = null;

    @SafeParcelable.Field(getter = "getStartHour", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getStartMinute", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getEndHour", id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getEndMinute", id = 4)
    private final int zzd;

    static {
        CREATOR = new zzby();
    }

    @SafeParcelable.Constructor
    public zzbx(@SafeParcelable.Param(id = 1) int r7, @SafeParcelable.Param(id = 2) int r8, @SafeParcelable.Param(id = 3) int r9, @SafeParcelable.Param(id = 4) int r10) {
        boolean r1 = true;
        if (r7 < 0) goto L6;
        if (r7 > 23) goto L6;
        boolean r3 = true;
    L7:
        Preconditions.checkState(r3, "Start hour must be in range [0, 23].");
        if (r8 < 0) goto L11;
        if (r8 > 59) goto L11;
        boolean r4 = true;
    L12:
        Preconditions.checkState(r4, "Start minute must be in range [0, 59].");
        if (r9 < 0) goto L16;
        if (r9 > 23) goto L16;
        boolean r02 = true;
    L17:
        Preconditions.checkState(r02, "End hour must be in range [0, 23].");
        if (r10 < 0) goto L21;
        if (r10 > 59) goto L21;
        boolean r03 = true;
    L22:
        Preconditions.checkState(r03, "End minute must be in range [0, 59].");
        if ((((r7 + r8) + r9) + r10) > 0) goto L26;
        r1 = false;
    L26:
        Preconditions.checkState(r1, "Parameters can't be all 0.");
        this.zza = r7;
        this.zzb = r8;
        this.zzc = r9;
        this.zzd = r10;
        return;
    L21:
        r03 = false;
    L16:
        r02 = false;
    L11:
        r4 = false;
    L6:
        r3 = false;
        goto L7
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof zzbx) == true) goto L8;
        return false;
    L8:
        zzbx r52 = (zzbx) r5;
        if (this.zza == r52.zza) goto L11;
    L17:
        return false;
    L11:
        if (this.zzb != r52.zzb) goto L17;
        if (this.zzc != r52.zzc) goto L17;
        if (this.zzd != r52.zzd) goto L17;
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd)});
    }

    public final String toString() {
        int r02 = this.zza;
        int r1 = this.zzb;
        int r2 = this.zzc;
        int r3 = this.zzd;
        StringBuilder r4 = new StringBuilder(117);
        r4.append("UserPreferredSleepWindow [startHour=");
        r4.append(r02);
        r4.append(", startMinute=");
        r4.append(r1);
        r4.append(", endHour=");
        r4.append(r2);
        r4.append(", endMinute=");
        r4.append(r3);
        r4.append(']');
        return r4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        Preconditions.checkNotNull(r3);
        int r42 = SafeParcelWriter.beginObjectHeader(r3);
        SafeParcelWriter.writeInt(r3, 1, this.zza);
        SafeParcelWriter.writeInt(r3, 2, this.zzb);
        SafeParcelWriter.writeInt(r3, 3, this.zzc);
        SafeParcelWriter.writeInt(r3, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(r3, r42);
    }
}
