package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.huawei.hms.android.SystemUtils;

@SafeParcelable.Class(creator = "PlaceReportCreator")
/* loaded from: classes5.dex */
public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<PlaceReport> CREATOR = null;

    @SafeParcelable.Field(getter = "getTag", id = 3)
    private final String tag;

    @SafeParcelable.VersionField(id = 1)
    private final int versionCode;

    @SafeParcelable.Field(getter = "getPlaceId", id = 2)
    private final String zza;

    @SafeParcelable.Field(getter = "getSource", id = 4)
    private final String zzb;

    static {
        CREATOR = new zza();
    }

    @SafeParcelable.Constructor
    public PlaceReport(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) String r2, @SafeParcelable.Param(id = 3) String r3, @SafeParcelable.Param(id = 4) String r4) {
        this.versionCode = r1;
        this.zza = r2;
        this.tag = r3;
        this.zzb = r4;
    }

    @VisibleForTesting
    public static PlaceReport create(String r3, String r4) {
        Preconditions.checkNotNull(r3);
        Preconditions.checkNotEmpty(r4);
        Preconditions.checkNotEmpty(SystemUtils.UNKNOWN);
        Preconditions.checkArgument(true, "Invalid source");
        return new PlaceReport(1, r3, r4, SystemUtils.UNKNOWN);
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof PlaceReport) == true) goto L5;
        return false;
    L5:
        PlaceReport r42 = (PlaceReport) r4;
        if (Objects.equal(this.zza, r42.zza) == true) goto L8;
    L13:
        return false;
    L8:
        if (Objects.equal(this.tag, r42.tag) == false) goto L13;
        if (Objects.equal(this.zzb, r42.zzb) == false) goto L13;
        return true;
    }

    public String getPlaceId() {
        return this.zza;
    }

    public String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{this.zza, this.tag, this.zzb});
    }

    public String toString() {
        Objects.ToStringHelper r02 = Objects.toStringHelper(this);
        r02.add("placeId", this.zza);
        r02.add("tag", this.tag);
        if (SystemUtils.UNKNOWN.equals(this.zzb) == true) goto L6;
        r02.add("source", this.zzb);
    L6:
        return r02.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeInt(r4, 1, this.versionCode);
        SafeParcelWriter.writeString(r4, 2, getPlaceId(), false);
        SafeParcelWriter.writeString(r4, 3, getTag(), false);
        SafeParcelWriter.writeString(r4, 4, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
