package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

@SafeParcelable.Class(creator = "EventParamsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zzbg extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzbg> CREATOR = null;

    @SafeParcelable.Field(getter = "z", id = 2)
    private final Bundle zza;

    static {
        CREATOR = new zzbi();
    }

    @SafeParcelable.Constructor
    public zzbg(@SafeParcelable.Param(id = 2) Bundle r1) {
        this.zza = r1;
    }

    public static /* bridge */ /* synthetic */ Bundle zza(zzbg r02) {
        return r02.zza;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new zzbj(this);
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeBundle(r4, 2, zzb(), false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    public final Bundle zzb() {
        return new Bundle(this.zza);
    }

    public final Object zzc(String r2) {
        return this.zza.get(r2);
    }

    public final String zzd(String r2) {
        return this.zza.getString(r2);
    }

    public final int zza() {
        return this.zza.size();
    }

    public final Long zzb(String r3) {
        return Long.valueOf(this.zza.getLong(r3));
    }

    public final Double zza(String r3) {
        return Double.valueOf(this.zza.getDouble(r3));
    }
}
