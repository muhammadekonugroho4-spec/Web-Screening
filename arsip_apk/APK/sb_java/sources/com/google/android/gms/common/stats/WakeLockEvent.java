package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@KeepForSdk
@SafeParcelable.Class(creator = "WakeLockEventCreator")
@Deprecated
/* loaded from: classes5.dex */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = null;

    @SafeParcelable.VersionField(id = 1)
    final int zza;

    @SafeParcelable.Field(getter = "getTimeMillis", id = 2)
    private final long zzb;

    @SafeParcelable.Field(getter = "getEventType", id = 11)
    private final int zzc;

    @SafeParcelable.Field(getter = "getWakeLockName", id = 4)
    private final String zzd;

    @SafeParcelable.Field(getter = "getSecondaryWakeLockName", id = 10)
    private final String zze;

    @SafeParcelable.Field(getter = "getCodePackage", id = 17)
    private final String zzf;

    @SafeParcelable.Field(getter = "getWakeLockType", id = 5)
    private final int zzg;

    @SafeParcelable.Field(getter = "getCallingPackages", id = 6)
    private final List zzh;

    @SafeParcelable.Field(getter = "getEventKey", id = 12)
    private final String zzi;

    @SafeParcelable.Field(getter = "getElapsedRealtime", id = 8)
    private final long zzj;

    @SafeParcelable.Field(getter = "getDeviceState", id = 14)
    private final int zzk;

    @SafeParcelable.Field(getter = "getHostPackage", id = 13)
    private final String zzl;

    @SafeParcelable.Field(getter = "getBeginPowerPercentage", id = 15)
    private final float zzm;

    @SafeParcelable.Field(getter = "getTimeout", id = 16)
    private final long zzn;

    @SafeParcelable.Field(getter = "getAcquiredWithTimeout", id = 18)
    private final boolean zzo;

    static {
        CREATOR = new zza();
    }

    @SafeParcelable.Constructor
    public WakeLockEvent(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) long r2, @SafeParcelable.Param(id = 11) int r4, @SafeParcelable.Param(id = 4) String r5, @SafeParcelable.Param(id = 5) int r6, @SafeParcelable.Param(id = 6) List r7, @SafeParcelable.Param(id = 12) String r8, @SafeParcelable.Param(id = 8) long r9, @SafeParcelable.Param(id = 14) int r11, @SafeParcelable.Param(id = 10) String r12, @SafeParcelable.Param(id = 13) String r13, @SafeParcelable.Param(id = 15) float r14, @SafeParcelable.Param(id = 16) long r15, @SafeParcelable.Param(id = 17) String r17, @SafeParcelable.Param(id = 18) boolean r18) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r4;
        this.zzd = r5;
        this.zze = r12;
        this.zzf = r17;
        this.zzg = r6;
        this.zzh = r7;
        this.zzi = r8;
        this.zzj = r9;
        this.zzk = r11;
        this.zzl = r13;
        this.zzm = r14;
        this.zzn = r15;
        this.zzo = r18;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r6, int r7) {
        int r72 = SafeParcelWriter.beginObjectHeader(r6);
        SafeParcelWriter.writeInt(r6, 1, this.zza);
        SafeParcelWriter.writeLong(r6, 2, this.zzb);
        SafeParcelWriter.writeString(r6, 4, this.zzd, false);
        SafeParcelWriter.writeInt(r6, 5, this.zzg);
        SafeParcelWriter.writeStringList(r6, 6, this.zzh, false);
        SafeParcelWriter.writeLong(r6, 8, this.zzj);
        SafeParcelWriter.writeString(r6, 10, this.zze, false);
        SafeParcelWriter.writeInt(r6, 11, this.zzc);
        SafeParcelWriter.writeString(r6, 12, this.zzi, false);
        SafeParcelWriter.writeString(r6, 13, this.zzl, false);
        SafeParcelWriter.writeInt(r6, 14, this.zzk);
        SafeParcelWriter.writeFloat(r6, 15, this.zzm);
        SafeParcelWriter.writeLong(r6, 16, this.zzn);
        SafeParcelWriter.writeString(r6, 17, this.zzf, false);
        SafeParcelWriter.writeBoolean(r6, 18, this.zzo);
        SafeParcelWriter.finishObjectHeader(r6, r72);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String zzc() {
        List r02 = this.zzh;
        String r1 = "";
        if (r02 != null) goto L5;
        String r03 = "";
    L6:
        int r2 = this.zzk;
        String r3 = this.zze;
        String r4 = this.zzl;
        float r5 = this.zzm;
        String r6 = this.zzf;
        int r7 = this.zzg;
        String r8 = this.zzd;
        boolean r9 = this.zzo;
        StringBuilder r10 = new StringBuilder();
        r10.append("\t");
        r10.append(r8);
        r10.append("\t");
        r10.append(r7);
        r10.append("\t");
        r10.append(r03);
        r10.append("\t");
        r10.append(r2);
        r10.append("\t");
        if (r3 != null) goto L9;
        r3 = "";
    L9:
        r10.append(r3);
        r10.append("\t");
        if (r4 != null) goto L12;
        r4 = "";
    L12:
        r10.append(r4);
        r10.append("\t");
        r10.append(r5);
        r10.append("\t");
        if (r6 == null) goto L16;
        r1 = r6;
    L16:
        r10.append(r1);
        r10.append("\t");
        r10.append(r9);
        return r10.toString();
    L5:
        r03 = TextUtils.join(Constants.SEPARATOR_COMMA, r02);
        goto L6
    }
}
