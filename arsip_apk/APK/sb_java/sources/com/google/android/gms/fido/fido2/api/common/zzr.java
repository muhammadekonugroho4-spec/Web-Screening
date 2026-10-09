package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzr implements Parcelable.Creator {
    public zzr() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel r11) {
        int r02 = SafeParcelReader.validateObjectHeader(r11);
        byte[] r7 = null;
        byte[] r8 = null;
        byte[] r9 = null;
        long r5 = 0;
    L4:
        if (r11.dataPosition() >= r02) goto L18;
        int r1 = SafeParcelReader.readHeader(r11);
        int r2 = SafeParcelReader.getFieldId(r1);
        if (r2 != 1) goto L8;
        r5 = SafeParcelReader.readLong(r11, r1);
        goto L4
    L8:
        if (r2 != 2) goto L10;
        r7 = SafeParcelReader.createByteArray(r11, r1);
        goto L4
    L10:
        if (r2 != 3) goto L12;
        r8 = SafeParcelReader.createByteArray(r11, r1);
        goto L4
    L12:
        if (r2 != 4) goto L13;
        r9 = SafeParcelReader.createByteArray(r11, r1);
        goto L4
    L13:
        SafeParcelReader.skipUnknownField(r11, r1);
        goto L4
    L18:
        SafeParcelReader.ensureAtEnd(r11, r02);
        return new zzq(r5, r7, r8, r9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new zzq[r1];
    }
}
