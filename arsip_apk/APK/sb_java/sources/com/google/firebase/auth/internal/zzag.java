package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class zzag implements Parcelable.Creator<zzah> {
    public zzag() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzah createFromParcel(Parcel r9) {
        int r02 = SafeParcelReader.validateObjectHeader(r9);
        long r1 = 0;
        long r3 = 0;
    L4:
        if (r9.dataPosition() >= r02) goto L12;
        int r5 = SafeParcelReader.readHeader(r9);
        int r6 = SafeParcelReader.getFieldId(r5);
        if (r6 != 1) goto L8;
        r1 = SafeParcelReader.readLong(r9, r5);
        goto L4
    L8:
        if (r6 != 2) goto L9;
        r3 = SafeParcelReader.readLong(r9, r5);
        goto L4
    L9:
        SafeParcelReader.skipUnknownField(r9, r5);
        goto L4
    L12:
        SafeParcelReader.ensureAtEnd(r9, r02);
        return new zzah(r1, r3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzah[] newArray(int r1) {
        return new zzah[r1];
    }
}
