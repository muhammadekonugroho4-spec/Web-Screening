package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "AppMetadataCreator")
@SafeParcelable.Reserved({1, 13, 17, 20, 33})
/* loaded from: classes5.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = null;

    @SafeParcelable.Field(id = 2)
    public final String zza;

    @SafeParcelable.Field(id = 32)
    public final int zzaa;

    @SafeParcelable.Field(id = 34)
    public final long zzab;

    @SafeParcelable.Field(id = 35)
    public final String zzac;

    @SafeParcelable.Field(defaultValue = "", id = 36)
    public final String zzad;

    @SafeParcelable.Field(id = 37)
    public final long zzae;

    @SafeParcelable.Field(id = 38)
    public final int zzaf;

    @SafeParcelable.Field(id = 24)
    private final String zzag;

    @SafeParcelable.Field(id = 3)
    public final String zzb;

    @SafeParcelable.Field(id = 4)
    public final String zzc;

    @SafeParcelable.Field(id = 5)
    public final String zzd;

    @SafeParcelable.Field(id = 6)
    public final long zze;

    @SafeParcelable.Field(id = 7)
    public final long zzf;

    @SafeParcelable.Field(id = 8)
    public final String zzg;

    @SafeParcelable.Field(defaultValue = "true", id = 9)
    public final boolean zzh;

    @SafeParcelable.Field(id = 10)
    public final boolean zzi;

    @SafeParcelable.Field(defaultValueUnchecked = "Integer.MIN_VALUE", id = 11)
    public final long zzj;

    @SafeParcelable.Field(id = 12)
    public final String zzk;

    @SafeParcelable.Field(id = 14)
    public final long zzl;

    @SafeParcelable.Field(id = 15)
    public final int zzm;

    @SafeParcelable.Field(defaultValue = "true", id = 16)
    public final boolean zzn;

    @SafeParcelable.Field(id = 18)
    public final boolean zzo;

    @SafeParcelable.Field(id = 19)
    public final String zzp;

    @SafeParcelable.Field(id = 21)
    public final Boolean zzq;

    @SafeParcelable.Field(id = 22)
    public final long zzr;

    @SafeParcelable.Field(id = 23)
    public final List<String> zzs;

    @SafeParcelable.Field(defaultValue = "", id = 25)
    public final String zzt;

    @SafeParcelable.Field(defaultValue = "", id = 26)
    public final String zzu;

    @SafeParcelable.Field(id = 27)
    public final String zzv;

    @SafeParcelable.Field(defaultValue = "false", id = 28)
    public final boolean zzw;

    @SafeParcelable.Field(id = 29)
    public final long zzx;

    @SafeParcelable.Field(defaultValue = "100", id = 30)
    public final int zzy;

    @SafeParcelable.Field(defaultValue = "", id = 31)
    public final String zzz;

    static {
        CREATOR = new zzr();
    }

    public zzp(String r2, String r3, String r4, long r5, String r7, long r8, long r10, String r12, boolean r13, boolean r14, String r15, long r16, int r18, boolean r19, boolean r20, String r21, Boolean r22, long r23, List<String> r25, String r26, String r27, String r28, String r29, boolean r30, long r31, int r33, String r34, int r35, long r36, String r38, String r39, long r40, int r42) {
        Preconditions.checkNotEmpty(r2);
        this.zza = r2;
        if (TextUtils.isEmpty(r3) == false) goto L5;
        r3 = null;
    L5:
        this.zzb = r3;
        this.zzc = r4;
        this.zzj = r5;
        this.zzd = r7;
        this.zze = r8;
        this.zzf = r10;
        this.zzg = r12;
        this.zzh = r13;
        this.zzi = r14;
        this.zzk = r15;
        this.zzl = r16;
        this.zzm = r18;
        this.zzn = r19;
        this.zzo = r20;
        this.zzp = r21;
        this.zzq = r22;
        this.zzr = r23;
        this.zzs = r25;
        this.zzag = null;
        this.zzt = r27;
        this.zzu = r28;
        this.zzv = r29;
        this.zzw = r30;
        this.zzx = r31;
        this.zzy = r33;
        this.zzz = r34;
        this.zzaa = r35;
        this.zzab = r36;
        this.zzac = r38;
        this.zzad = r39;
        this.zzae = r40;
        this.zzaf = r42;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r6, int r7) {
        int r72 = SafeParcelWriter.beginObjectHeader(r6);
        SafeParcelWriter.writeString(r6, 2, this.zza, false);
        SafeParcelWriter.writeString(r6, 3, this.zzb, false);
        SafeParcelWriter.writeString(r6, 4, this.zzc, false);
        SafeParcelWriter.writeString(r6, 5, this.zzd, false);
        SafeParcelWriter.writeLong(r6, 6, this.zze);
        SafeParcelWriter.writeLong(r6, 7, this.zzf);
        SafeParcelWriter.writeString(r6, 8, this.zzg, false);
        SafeParcelWriter.writeBoolean(r6, 9, this.zzh);
        SafeParcelWriter.writeBoolean(r6, 10, this.zzi);
        SafeParcelWriter.writeLong(r6, 11, this.zzj);
        SafeParcelWriter.writeString(r6, 12, this.zzk, false);
        SafeParcelWriter.writeLong(r6, 14, this.zzl);
        SafeParcelWriter.writeInt(r6, 15, this.zzm);
        SafeParcelWriter.writeBoolean(r6, 16, this.zzn);
        SafeParcelWriter.writeBoolean(r6, 18, this.zzo);
        SafeParcelWriter.writeString(r6, 19, this.zzp, false);
        SafeParcelWriter.writeBooleanObject(r6, 21, this.zzq, false);
        SafeParcelWriter.writeLong(r6, 22, this.zzr);
        SafeParcelWriter.writeStringList(r6, 23, this.zzs, false);
        SafeParcelWriter.writeString(r6, 24, this.zzag, false);
        SafeParcelWriter.writeString(r6, 25, this.zzt, false);
        SafeParcelWriter.writeString(r6, 26, this.zzu, false);
        SafeParcelWriter.writeString(r6, 27, this.zzv, false);
        SafeParcelWriter.writeBoolean(r6, 28, this.zzw);
        SafeParcelWriter.writeLong(r6, 29, this.zzx);
        SafeParcelWriter.writeInt(r6, 30, this.zzy);
        SafeParcelWriter.writeString(r6, 31, this.zzz, false);
        SafeParcelWriter.writeInt(r6, 32, this.zzaa);
        SafeParcelWriter.writeLong(r6, 34, this.zzab);
        SafeParcelWriter.writeString(r6, 35, this.zzac, false);
        SafeParcelWriter.writeString(r6, 36, this.zzad, false);
        SafeParcelWriter.writeLong(r6, 37, this.zzae);
        SafeParcelWriter.writeInt(r6, 38, this.zzaf);
        SafeParcelWriter.finishObjectHeader(r6, r72);
    }

    @SafeParcelable.Constructor
    public zzp(@SafeParcelable.Param(id = 2) String r1, @SafeParcelable.Param(id = 3) String r2, @SafeParcelable.Param(id = 4) String r3, @SafeParcelable.Param(id = 5) String r4, @SafeParcelable.Param(id = 6) long r5, @SafeParcelable.Param(id = 7) long r7, @SafeParcelable.Param(id = 8) String r9, @SafeParcelable.Param(id = 9) boolean r10, @SafeParcelable.Param(id = 10) boolean r11, @SafeParcelable.Param(id = 11) long r12, @SafeParcelable.Param(id = 12) String r14, @SafeParcelable.Param(id = 14) long r15, @SafeParcelable.Param(id = 15) int r17, @SafeParcelable.Param(id = 16) boolean r18, @SafeParcelable.Param(id = 18) boolean r19, @SafeParcelable.Param(id = 19) String r20, @SafeParcelable.Param(id = 21) Boolean r21, @SafeParcelable.Param(id = 22) long r22, @SafeParcelable.Param(id = 23) List<String> r24, @SafeParcelable.Param(id = 24) String r25, @SafeParcelable.Param(id = 25) String r26, @SafeParcelable.Param(id = 26) String r27, @SafeParcelable.Param(id = 27) String r28, @SafeParcelable.Param(id = 28) boolean r29, @SafeParcelable.Param(id = 29) long r30, @SafeParcelable.Param(id = 30) int r32, @SafeParcelable.Param(id = 31) String r33, @SafeParcelable.Param(id = 32) int r34, @SafeParcelable.Param(id = 34) long r35, @SafeParcelable.Param(id = 35) String r37, @SafeParcelable.Param(id = 36) String r38, @SafeParcelable.Param(id = 37) long r39, @SafeParcelable.Param(id = 38) int r41) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
        this.zzj = r12;
        this.zzd = r4;
        this.zze = r5;
        this.zzf = r7;
        this.zzg = r9;
        this.zzh = r10;
        this.zzi = r11;
        this.zzk = r14;
        this.zzl = r15;
        this.zzm = r17;
        this.zzn = r18;
        this.zzo = r19;
        this.zzp = r20;
        this.zzq = r21;
        this.zzr = r22;
        this.zzs = r24;
        this.zzag = r25;
        this.zzt = r26;
        this.zzu = r27;
        this.zzv = r28;
        this.zzw = r29;
        this.zzx = r30;
        this.zzy = r32;
        this.zzz = r33;
        this.zzaa = r34;
        this.zzab = r35;
        this.zzac = r37;
        this.zzad = r38;
        this.zzae = r39;
        this.zzaf = r41;
    }
}
