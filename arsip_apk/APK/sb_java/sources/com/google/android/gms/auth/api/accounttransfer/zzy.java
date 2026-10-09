package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzy implements Parcelable.Creator {
    public zzy() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel r11) {
        int r02 = SafeParcelReader.validateObjectHeader(r11);
        int r5 = 0;
        boolean r6 = false;
        boolean r9 = false;
        long r7 = 0;
    L4:
        if (r11.dataPosition() >= r02) goto L18;
        int r1 = SafeParcelReader.readHeader(r11);
        int r2 = SafeParcelReader.getFieldId(r1);
        if (r2 != 1) goto L8;
        r5 = SafeParcelReader.readInt(r11, r1);
        goto L4
    L8:
        if (r2 != 2) goto L10;
        r6 = SafeParcelReader.readBoolean(r11, r1);
        goto L4
    L10:
        if (r2 != 3) goto L12;
        r7 = SafeParcelReader.readLong(r11, r1);
        goto L4
    L12:
        if (r2 != 4) goto L13;
        r9 = SafeParcelReader.readBoolean(r11, r1);
        goto L4
    L13:
        SafeParcelReader.skipUnknownField(r11, r1);
        goto L4
    L18:
        SafeParcelReader.ensureAtEnd(r11, r02);
        return new DeviceMetaData(r5, r6, r7, r9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new DeviceMetaData[r1];
    }
}
