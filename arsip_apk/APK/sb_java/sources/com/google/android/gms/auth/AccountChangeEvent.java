package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;

@SafeParcelable.Class(creator = "AccountChangeEventCreator")
/* loaded from: classes5.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = null;

    @SafeParcelable.VersionField(id = 1)
    final int zza;

    @SafeParcelable.Field(id = 2)
    final long zzb;

    @SafeParcelable.Field(id = 3)
    final String zzc;

    @SafeParcelable.Field(id = 4)
    final int zzd;

    @SafeParcelable.Field(id = 5)
    final int zze;

    @SafeParcelable.Field(id = 6)
    final String zzf;

    static {
        CREATOR = new zza();
    }

    @SafeParcelable.Constructor
    public AccountChangeEvent(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) long r2, @SafeParcelable.Param(id = 3) String r4, @SafeParcelable.Param(id = 4) int r5, @SafeParcelable.Param(id = 5) int r6, @SafeParcelable.Param(id = 6) String r7) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = (String) Preconditions.checkNotNull(r4);
        this.zzd = r5;
        this.zze = r6;
        this.zzf = r7;
    }

    public boolean equals(Object r7) {
        if ((r7 instanceof AccountChangeEvent) == true) goto L6;
        return false;
    L6:
        if (r7 != this) goto L8;
        return true;
    L8:
        AccountChangeEvent r72 = (AccountChangeEvent) r7;
        if (this.zza == r72.zza) goto L11;
    L21:
        return false;
    L11:
        if (this.zzb != r72.zzb) goto L21;
        if (Objects.equal(this.zzc, r72.zzc) == false) goto L21;
        if (this.zzd != r72.zzd) goto L21;
        if (this.zze != r72.zze) goto L21;
        if (Objects.equal(this.zzf, r72.zzf) == false) goto L21;
        return true;
    }

    public String getAccountName() {
        return this.zzc;
    }

    public String getChangeData() {
        return this.zzf;
    }

    public int getChangeType() {
        return this.zzd;
    }

    public int getEventIndex() {
        return this.zze;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{Integer.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc, Integer.valueOf(this.zzd), Integer.valueOf(this.zze), this.zzf});
    }

    public String toString() {
        int r02 = this.zzd;
        if (r02 != 1) goto L5;
        String r03 = "ADDED";
    L16:
        return "AccountChangeEvent {accountName = " + this.zzc + ", changeType = " + r03 + ", changeData = " + this.zzf + ", eventIndex = " + this.zze + "}";
    L5:
        if (r02 != 2) goto L7;
        r03 = "REMOVED";
        goto L16
    L7:
        if (r02 != 3) goto L9;
        r03 = "RENAMED_FROM";
        goto L16
    L9:
        if (r02 == 4) goto L11;
        r03 = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        goto L16
    L11:
        r03 = "RENAMED_TO";
        goto L16
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeInt(r4, 1, this.zza);
        SafeParcelWriter.writeLong(r4, 2, this.zzb);
        SafeParcelWriter.writeString(r4, 3, this.zzc, false);
        SafeParcelWriter.writeInt(r4, 4, this.zzd);
        SafeParcelWriter.writeInt(r4, 5, this.zze);
        SafeParcelWriter.writeString(r4, 6, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    public AccountChangeEvent(long r2, String r4, int r5, int r6, String r7) {
        this.zza = 1;
        this.zzb = r2;
        this.zzc = (String) Preconditions.checkNotNull(r4);
        this.zzd = r5;
        this.zze = r6;
        this.zzf = r7;
    }
}
