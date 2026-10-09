package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@SafeParcelable.Class(creator = "LocationResultCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationResult> CREATOR = null;
    static final List<Location> zza = null;

    @SafeParcelable.Field(defaultValueUnchecked = "LocationResult.DEFAULT_LOCATIONS", getter = "getLocations", id = 1)
    private final List<Location> zzb;

    static {
        zza = Collections.EMPTY_LIST;
        CREATOR = new zzbg();
    }

    @SafeParcelable.Constructor
    public LocationResult(@SafeParcelable.Param(id = 1) List<Location> r1) {
        this.zzb = r1;
    }

    public static LocationResult create(List<Location> r1) {
        if (r1 != null) goto L5;
        r1 = zza;
    L5:
        return new LocationResult(r1);
    }

    public static LocationResult extractResult(Intent r1) {
        if (hasResult(r1) == true) goto L7;
        return null;
    L7:
        return (LocationResult) r1.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
    }

    public static boolean hasResult(Intent r1) {
        if (r1 != null) goto L6;
        return false;
    L6:
        return r1.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
    }

    public boolean equals(Object r7) {
        if ((r7 instanceof LocationResult) == false) goto L15;
        LocationResult r72 = (LocationResult) r7;
        if (r72.zzb.size() == this.zzb.size()) goto L7;
        return false;
    L7:
        Iterator<Location> r73 = r72.zzb.iterator();
        Iterator<Location> r02 = this.zzb.iterator();
    L9:
        if (r73.hasNext() == false) goto L13;
        Location r2 = r02.next();
        Location r3 = r73.next();
        if (r2.getTime() == r3.getTime()) goto L9;
        return false;
    L13:
        return true;
    L15:
        return false;
    }

    public Location getLastLocation() {
        int r02 = this.zzb.size();
        if (r02 != 0) goto L7;
        return null;
    L7:
        return this.zzb.get(r02 - 1);
    }

    public List<Location> getLocations() {
        return this.zzb;
    }

    public int hashCode() {
        Iterator<Location> r02 = this.zzb.iterator();
        int r1 = 17;
    L4:
        if (r02.hasNext() == false) goto L6;
        long r2 = r02.next().getTime();
        r1 = (r1 * 31) + ((int) (r2 ^ (r2 >>> 32)));
        goto L4
    L6:
        return r1;
    }

    public String toString() {
        String r02 = String.valueOf(this.zzb);
        StringBuilder r2 = new StringBuilder(r02.length() + 27);
        r2.append("LocationResult[locations: ");
        r2.append(r02);
        r2.append(Constants.AES_SUFFIX);
        return r2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeTypedList(r4, 1, getLocations(), false);
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
