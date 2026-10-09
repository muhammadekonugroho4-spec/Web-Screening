package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class zzoo implements Parcelable.Creator<zzop> {
    public zzoo() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzop createFromParcel(Parcel r6) {
        int r02 = SafeParcelReader.validateObjectHeader(r6);
        ArrayList<Integer> r1 = null;
    L4:
        if (r6.dataPosition() >= r02) goto L9;
        int r2 = SafeParcelReader.readHeader(r6);
        if (SafeParcelReader.getFieldId(r2) != 1) goto L7;
        r1 = SafeParcelReader.createIntegerList(r6, r2);
        goto L4
    L7:
        SafeParcelReader.skipUnknownField(r6, r2);
        goto L4
    L9:
        SafeParcelReader.ensureAtEnd(r6, r02);
        return new zzop(r1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzop[] newArray(int r1) {
        return new zzop[r1];
    }
}
