package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzbk implements Parcelable.Creator<zzbj> {
    public zzbk() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbj createFromParcel(Parcel r8) {
        int r02 = SafeParcelReader.validateObjectHeader(r8);
        String r1 = "";
        String r2 = "";
        String r3 = r2;
    L4:
        if (r8.dataPosition() >= r02) goto L15;
        int r4 = SafeParcelReader.readHeader(r8);
        int r5 = SafeParcelReader.getFieldId(r4);
        if (r5 != 1) goto L8;
        r2 = SafeParcelReader.createString(r8, r4);
        goto L4
    L8:
        if (r5 != 2) goto L10;
        r3 = SafeParcelReader.createString(r8, r4);
        goto L4
    L10:
        if (r5 != 5) goto L11;
        r1 = SafeParcelReader.createString(r8, r4);
        goto L4
    L11:
        SafeParcelReader.skipUnknownField(r8, r4);
        goto L4
    L15:
        SafeParcelReader.ensureAtEnd(r8, r02);
        return new zzbj(r1, r2, r3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbj[] newArray(int r1) {
        return new zzbj[r1];
    }
}
