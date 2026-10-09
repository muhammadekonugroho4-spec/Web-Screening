package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzbp implements Parcelable.Creator<zzbo> {
    public zzbp() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbo createFromParcel(Parcel r12) {
        int r02 = SafeParcelReader.validateObjectHeader(r12);
        int r5 = 1;
        int r6 = 1;
        long r7 = -1;
        long r9 = -1;
    L4:
        if (r12.dataPosition() >= r02) goto L18;
        int r2 = SafeParcelReader.readHeader(r12);
        int r3 = SafeParcelReader.getFieldId(r2);
        if (r3 != 1) goto L8;
        r5 = SafeParcelReader.readInt(r12, r2);
        goto L4
    L8:
        if (r3 != 2) goto L10;
        r6 = SafeParcelReader.readInt(r12, r2);
        goto L4
    L10:
        if (r3 != 3) goto L12;
        r7 = SafeParcelReader.readLong(r12, r2);
        goto L4
    L12:
        if (r3 != 4) goto L13;
        r9 = SafeParcelReader.readLong(r12, r2);
        goto L4
    L13:
        SafeParcelReader.skipUnknownField(r12, r2);
        goto L4
    L18:
        SafeParcelReader.ensureAtEnd(r12, r02);
        return new zzbo(r5, r6, r7, r9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbo[] newArray(int r1) {
        return new zzbo[r1];
    }
}
