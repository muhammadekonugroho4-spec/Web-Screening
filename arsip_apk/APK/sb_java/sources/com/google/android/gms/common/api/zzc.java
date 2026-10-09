package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzc implements Parcelable.Creator {
    public zzc() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel r10) {
        int r02 = SafeParcelReader.validateObjectHeader(r10);
        int r2 = 0;
        boolean r5 = true;
        int r3 = 0;
        int r4 = 0;
    L4:
        if (r10.dataPosition() >= r02) goto L18;
        int r6 = SafeParcelReader.readHeader(r10);
        int r7 = SafeParcelReader.getFieldId(r6);
        if (r7 != 1) goto L8;
        r2 = SafeParcelReader.readInt(r10, r6);
        goto L4
    L8:
        if (r7 != 2) goto L10;
        r3 = SafeParcelReader.readInt(r10, r6);
        goto L4
    L10:
        if (r7 != 3) goto L12;
        r4 = SafeParcelReader.readInt(r10, r6);
        goto L4
    L12:
        if (r7 != 4) goto L13;
        r5 = SafeParcelReader.readBoolean(r10, r6);
        goto L4
    L13:
        SafeParcelReader.skipUnknownField(r10, r6);
        goto L4
    L18:
        SafeParcelReader.ensureAtEnd(r10, r02);
        return new ComplianceOptions(r2, r3, r4, r5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new ComplianceOptions[r1];
    }
}
