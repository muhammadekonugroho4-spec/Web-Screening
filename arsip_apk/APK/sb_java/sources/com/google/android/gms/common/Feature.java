package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

@KeepForSdk
@SafeParcelable.Class(creator = "FeatureCreator")
/* loaded from: classes5.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = null;

    @SafeParcelable.Field(getter = "getName", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getOldVersion", id = 2)
    @Deprecated
    private final int zzb;

    @SafeParcelable.Field(defaultValue = "-1", getter = "getVersion", id = 3)
    private final long zzc;

    static {
        CREATOR = new zzc();
    }

    @SafeParcelable.Constructor
    public Feature(@SafeParcelable.Param(id = 1) String r1, @SafeParcelable.Param(id = 2) int r2, @SafeParcelable.Param(id = 3) long r3) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
    }

    public final boolean equals(Object r7) {
        if ((r7 instanceof Feature) == false) goto L16;
        Feature r72 = (Feature) r7;
        if (getName() == null) goto L9;
        if (getName().equals(r72.getName()) == false) goto L9;
    L13:
        if (getVersion() != r72.getVersion()) goto L16;
        return true;
    L9:
        if (getName() != null) goto L16;
        if (r72.getName() == null) goto L13;
    L16:
        return false;
    }

    @KeepForSdk
    public String getName() {
        return this.zza;
    }

    @KeepForSdk
    public long getVersion() {
        long r02 = this.zzc;
        if (r02 == (-1)) goto L5;
        return r02;
    L5:
        return this.zzb;
    }

    public final int hashCode() {
        return Objects.hashCode(new Object[]{getName(), Long.valueOf(getVersion())});
    }

    public final String toString() {
        Objects.ToStringHelper r02 = Objects.toStringHelper(this);
        r02.add(AppMeasurementSdk.ConditionalUserProperty.NAME, getName());
        r02.add("version", Long.valueOf(getVersion()));
        return r02.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeString(r4, 1, getName(), false);
        SafeParcelWriter.writeInt(r4, 2, this.zzb);
        SafeParcelWriter.writeLong(r4, 3, getVersion());
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }

    @KeepForSdk
    public Feature(String r1, long r2) {
        this.zza = r1;
        this.zzc = r2;
        this.zzb = -1;
    }
}
