package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzbg implements Parcelable.Creator<LocationResult> {
    public zzbg() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationResult createFromParcel(Parcel r6) {
        int r02 = SafeParcelReader.validateObjectHeader(r6);
        List<Location> r1 = LocationResult.zza;
    L4:
        if (r6.dataPosition() >= r02) goto L9;
        int r2 = SafeParcelReader.readHeader(r6);
        if (SafeParcelReader.getFieldId(r2) != 1) goto L7;
        r1 = SafeParcelReader.createTypedList(r6, r2, Location.CREATOR);
        goto L4
    L7:
        SafeParcelReader.skipUnknownField(r6, r2);
        goto L4
    L9:
        SafeParcelReader.ensureAtEnd(r6, r02);
        return new LocationResult(r1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationResult[] newArray(int r1) {
        return new LocationResult[r1];
    }
}
