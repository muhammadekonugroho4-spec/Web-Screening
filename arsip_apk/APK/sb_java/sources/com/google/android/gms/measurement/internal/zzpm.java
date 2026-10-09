package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "UserAttributeParcelCreator")
/* loaded from: classes5.dex */
public final class zzpm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpm> CREATOR = null;

    @SafeParcelable.Field(id = 2)
    public final String zza;

    @SafeParcelable.Field(id = 3)
    public final long zzb;

    @SafeParcelable.Field(id = 4)
    public final Long zzc;

    @SafeParcelable.Field(id = 6)
    public final String zzd;

    @SafeParcelable.Field(id = 7)
    public final String zze;

    @SafeParcelable.Field(id = 8)
    public final Double zzf;

    @SafeParcelable.Field(id = 1)
    private final int zzg;

    static {
        CREATOR = new zzpl();
    }

    public zzpm(zzpo r7) {
        this(r7.zzc, r7.zzd, r7.zze, r7.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r6, int r7) {
        int r72 = SafeParcelWriter.beginObjectHeader(r6);
        SafeParcelWriter.writeInt(r6, 1, this.zzg);
        SafeParcelWriter.writeString(r6, 2, this.zza, false);
        SafeParcelWriter.writeLong(r6, 3, this.zzb);
        SafeParcelWriter.writeLongObject(r6, 4, this.zzc, false);
        SafeParcelWriter.writeFloatObject(r6, 5, null, false);
        SafeParcelWriter.writeString(r6, 6, this.zzd, false);
        SafeParcelWriter.writeString(r6, 7, this.zze, false);
        SafeParcelWriter.writeDoubleObject(r6, 8, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(r6, r72);
    }

    public final Object zza() {
        Long r02 = this.zzc;
        if (r02 == null) goto L5;
        return r02;
    L5:
        Double r03 = this.zzf;
        if (r03 == null) goto L8;
        return r03;
    L8:
        String r04 = this.zzd;
        if (r04 == null) goto L11;
        return r04;
    L11:
        return null;
    }

    public zzpm(String r2, long r3, Object r5, String r6) {
        Preconditions.checkNotEmpty(r2);
        this.zzg = 2;
        this.zza = r2;
        this.zzb = r3;
        this.zze = r6;
        if (r5 != null) goto L7;
        this.zzc = null;
        this.zzf = null;
        this.zzd = null;
        return;
    L7:
        if ((r5 instanceof Long) == false) goto L11;
        this.zzc = (Long) r5;
        this.zzf = null;
        this.zzd = null;
        return;
    L11:
        if ((r5 instanceof String) == false) goto L15;
        this.zzc = null;
        this.zzf = null;
        this.zzd = (String) r5;
        return;
    L15:
        if ((r5 instanceof Double) == false) goto L19;
        this.zzc = null;
        this.zzf = (Double) r5;
        this.zzd = null;
        return;
    L19:
        throw new IllegalArgumentException("User attribute given of un-supported type");
    }

    @SafeParcelable.Constructor
    public zzpm(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) String r2, @SafeParcelable.Param(id = 3) long r3, @SafeParcelable.Param(id = 4) Long r5, @SafeParcelable.Param(id = 5) Float r6, @SafeParcelable.Param(id = 6) String r7, @SafeParcelable.Param(id = 7) String r8, @SafeParcelable.Param(id = 8) Double r9) {
        this.zzg = r1;
        this.zza = r2;
        this.zzb = r3;
        this.zzc = r5;
        if (r1 != 1) goto L8;
        if (r6 == null) goto L6;
        Double r12 = Double.valueOf(r6.doubleValue());
    L7:
        this.zzf = r12;
    L9:
        this.zzd = r7;
        this.zze = r8;
        return;
    L6:
        r12 = null;
        goto L7
    L8:
        this.zzf = r9;
        goto L9
    }
}
