package com.google.android.gms.internal.time;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzh implements Parcelable.Creator {
    public zzh() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel r8) {
        int r02 = SafeParcelReader.validateObjectHeader(r8);
        int r1 = 0;
        long r2 = 0;
    L4:
        if (r8.dataPosition() >= r02) goto L12;
        int r4 = SafeParcelReader.readHeader(r8);
        int r5 = SafeParcelReader.getFieldId(r4);
        if (r5 != 1) goto L8;
        r2 = SafeParcelReader.readLong(r8, r4);
        goto L4
    L8:
        if (r5 != 2) goto L9;
        r1 = SafeParcelReader.readInt(r8, r4);
        goto L4
    L9:
        SafeParcelReader.skipUnknownField(r8, r4);
        goto L4
    L12:
        SafeParcelReader.ensureAtEnd(r8, r02);
        return new zzg(r2, r1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new zzg[r1];
    }
}
