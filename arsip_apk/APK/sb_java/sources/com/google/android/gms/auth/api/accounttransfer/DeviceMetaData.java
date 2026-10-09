package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "DeviceMetaDataCreator")
/* loaded from: classes5.dex */
public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = null;

    @SafeParcelable.VersionField(id = 1)
    final int zza;

    @SafeParcelable.Field(getter = "isLockScreenSolved", id = 2)
    private boolean zzb;

    @SafeParcelable.Field(getter = "getMinAgeOfLockScreen", id = 3)
    private long zzc;

    @SafeParcelable.Field(getter = "isChallengeAllowed", id = 4)
    private final boolean zzd;

    static {
        CREATOR = new zzy();
    }

    @SafeParcelable.Constructor
    public DeviceMetaData(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) boolean r2, @SafeParcelable.Param(id = 3) long r3, @SafeParcelable.Param(id = 4) boolean r5) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
        this.zzd = r5;
    }

    public long getMinAgeOfLockScreen() {
        return this.zzc;
    }

    public boolean isChallengeAllowed() {
        return this.zzd;
    }

    public boolean isLockScreenSolved() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeInt(r4, 1, this.zza);
        SafeParcelWriter.writeBoolean(r4, 2, isLockScreenSolved());
        SafeParcelWriter.writeLong(r4, 3, getMinAgeOfLockScreen());
        SafeParcelWriter.writeBoolean(r4, 4, isChallengeAllowed());
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
