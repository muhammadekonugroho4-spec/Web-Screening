package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzom implements Parcelable.Creator<zzon> {
    public zzom() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzon createFromParcel(Parcel r17) {
        int r1 = SafeParcelReader.validateObjectHeader(r17);
        long r7 = 0;
        long r13 = 0;
        byte[] r9 = null;
        String r10 = null;
        Bundle r11 = null;
        String r15 = null;
        int r12 = 0;
    L4:
        if (r17.dataPosition() >= r1) goto L15;
        int r2 = SafeParcelReader.readHeader(r17);
        switch(SafeParcelReader.getFieldId(r2)) {
            case 1: goto L14;
            case 2: goto L13;
            case 3: goto L12;
            case 4: goto L11;
            case 5: goto L10;
            case 6: goto L9;
            case 7: goto L8;
            default: goto L7;
        };
    L8:
        r15 = SafeParcelReader.createString(r17, r2);
        goto L4
    L9:
        r13 = SafeParcelReader.readLong(r17, r2);
        goto L4
    L10:
        r12 = SafeParcelReader.readInt(r17, r2);
        goto L4
    L11:
        r11 = SafeParcelReader.createBundle(r17, r2);
        goto L4
    L12:
        r10 = SafeParcelReader.createString(r17, r2);
        goto L4
    L13:
        r9 = SafeParcelReader.createByteArray(r17, r2);
        goto L4
    L14:
        r7 = SafeParcelReader.readLong(r17, r2);
        goto L4
    L7:
        SafeParcelReader.skipUnknownField(r17, r2);
        goto L4
    L15:
        SafeParcelReader.ensureAtEnd(r17, r1);
        return new zzon(r7, r9, r10, r11, r12, r13, r15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzon[] newArray(int r1) {
        return new zzon[r1];
    }
}
