package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "UploadBatchParcelCreator")
/* loaded from: classes5.dex */
public final class zzon extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzon> CREATOR = null;

    @SafeParcelable.Field(id = 1)
    public final long zza;

    @SafeParcelable.Field(id = 2)
    public byte[] zzb;

    @SafeParcelable.Field(id = 3)
    public final String zzc;

    @SafeParcelable.Field(id = 4)
    public final Bundle zzd;

    @SafeParcelable.Field(id = 6)
    public final long zze;

    @SafeParcelable.Field(id = 7)
    public String zzf;

    @SafeParcelable.Field(id = 5)
    private final int zzg;

    static {
        CREATOR = new zzom();
    }

    public zzon(long r11, byte[] r13, String r14, Bundle r15, int r16, long r17) {
        this(r11, r13, r14, r15, r16, r17, "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r6, int r7) {
        int r72 = SafeParcelWriter.beginObjectHeader(r6);
        SafeParcelWriter.writeLong(r6, 1, this.zza);
        SafeParcelWriter.writeByteArray(r6, 2, this.zzb, false);
        SafeParcelWriter.writeString(r6, 3, this.zzc, false);
        SafeParcelWriter.writeBundle(r6, 4, this.zzd, false);
        SafeParcelWriter.writeInt(r6, 5, this.zzg);
        SafeParcelWriter.writeLong(r6, 6, this.zze);
        SafeParcelWriter.writeString(r6, 7, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(r6, r72);
    }

    @SafeParcelable.Constructor
    public zzon(@SafeParcelable.Param(id = 1) long r1, @SafeParcelable.Param(id = 2) byte[] r3, @SafeParcelable.Param(id = 3) String r4, @SafeParcelable.Param(id = 4) Bundle r5, @SafeParcelable.Param(id = 5) int r6, @SafeParcelable.Param(id = 6) long r7, @SafeParcelable.Param(id = 7) String r9) {
        this.zza = r1;
        this.zzb = r3;
        this.zzc = r4;
        this.zzd = r5;
        this.zzg = r6;
        this.zze = r7;
        this.zzf = r9;
    }
}
