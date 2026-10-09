package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzbi implements Parcelable.Creator<zzbg> {
    public zzbi() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbg createFromParcel(Parcel r6) {
        int r02 = SafeParcelReader.validateObjectHeader(r6);
        Bundle r1 = null;
    L4:
        if (r6.dataPosition() >= r02) goto L9;
        int r2 = SafeParcelReader.readHeader(r6);
        if (SafeParcelReader.getFieldId(r2) != 2) goto L7;
        r1 = SafeParcelReader.createBundle(r6, r2);
        goto L4
    L7:
        SafeParcelReader.skipUnknownField(r6, r2);
        goto L4
    L9:
        SafeParcelReader.ensureAtEnd(r6, r02);
        return new zzbg(r1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzbg[] newArray(int r1) {
        return new zzbg[r1];
    }
}
