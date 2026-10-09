package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzc implements Parcelable.Creator {
    public zzc() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel r9) {
        int r02 = SafeParcelReader.validateObjectHeader(r9);
        long r1 = -1;
        int r3 = 0;
        String r4 = null;
    L4:
        if (r9.dataPosition() >= r02) goto L15;
        int r5 = SafeParcelReader.readHeader(r9);
        int r6 = SafeParcelReader.getFieldId(r5);
        if (r6 != 1) goto L8;
        r4 = SafeParcelReader.createString(r9, r5);
        goto L4
    L8:
        if (r6 != 2) goto L10;
        r3 = SafeParcelReader.readInt(r9, r5);
        goto L4
    L10:
        if (r6 != 3) goto L11;
        r1 = SafeParcelReader.readLong(r9, r5);
        goto L4
    L11:
        SafeParcelReader.skipUnknownField(r9, r5);
        goto L4
    L15:
        SafeParcelReader.ensureAtEnd(r9, r02);
        return new Feature(r4, r3, r1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new Feature[r1];
    }
}
