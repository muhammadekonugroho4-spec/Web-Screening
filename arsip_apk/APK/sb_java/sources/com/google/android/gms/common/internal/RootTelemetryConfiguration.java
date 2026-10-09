package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "RootTelemetryConfigurationCreator")
/* loaded from: classes5.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {

    @KeepForSdk
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = null;

    @SafeParcelable.Field(getter = "getVersion", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getMethodInvocationTelemetryEnabled", id = 2)
    private final boolean zzb;

    @SafeParcelable.Field(getter = "getMethodTimingTelemetryEnabled", id = 3)
    private final boolean zzc;

    @SafeParcelable.Field(getter = "getBatchPeriodMillis", id = 4)
    private final int zzd;

    @SafeParcelable.Field(getter = "getMaxMethodInvocationsInBatch", id = 5)
    private final int zze;

    static {
        CREATOR = new zzak();
    }

    @SafeParcelable.Constructor
    public RootTelemetryConfiguration(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) boolean r2, @SafeParcelable.Param(id = 3) boolean r3, @SafeParcelable.Param(id = 4) int r4, @SafeParcelable.Param(id = 5) int r5) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
        this.zzd = r4;
        this.zze = r5;
    }

    @KeepForSdk
    public int getBatchPeriodMillis() {
        return this.zzd;
    }

    @KeepForSdk
    public int getMaxMethodInvocationsInBatch() {
        return this.zze;
    }

    @KeepForSdk
    public boolean getMethodInvocationTelemetryEnabled() {
        return this.zzb;
    }

    @KeepForSdk
    public boolean getMethodTimingTelemetryEnabled() {
        return this.zzc;
    }

    @KeepForSdk
    public int getVersion() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        int r42 = SafeParcelWriter.beginObjectHeader(r3);
        SafeParcelWriter.writeInt(r3, 1, getVersion());
        SafeParcelWriter.writeBoolean(r3, 2, getMethodInvocationTelemetryEnabled());
        SafeParcelWriter.writeBoolean(r3, 3, getMethodTimingTelemetryEnabled());
        SafeParcelWriter.writeInt(r3, 4, getBatchPeriodMillis());
        SafeParcelWriter.writeInt(r3, 5, getMaxMethodInvocationsInBatch());
        SafeParcelWriter.finishObjectHeader(r3, r42);
    }
}
