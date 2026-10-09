package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzp implements Parcelable.Creator {
    public zzp() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel r11) {
        int r02 = SafeParcelReader.validateObjectHeader(r11);
        boolean r5 = false;
        boolean r6 = false;
        boolean r8 = false;
        boolean r9 = false;
        String r4 = null;
        IBinder r7 = null;
    L4:
        if (r11.dataPosition() >= r02) goto L14;
        int r1 = SafeParcelReader.readHeader(r11);
        switch(SafeParcelReader.getFieldId(r1)) {
            case 1: goto L13;
            case 2: goto L12;
            case 3: goto L11;
            case 4: goto L10;
            case 5: goto L9;
            case 6: goto L8;
            default: goto L7;
        };
    L8:
        r9 = SafeParcelReader.readBoolean(r11, r1);
        goto L4
    L9:
        r8 = SafeParcelReader.readBoolean(r11, r1);
        goto L4
    L10:
        r7 = SafeParcelReader.readIBinder(r11, r1);
        goto L4
    L11:
        r6 = SafeParcelReader.readBoolean(r11, r1);
        goto L4
    L12:
        r5 = SafeParcelReader.readBoolean(r11, r1);
        goto L4
    L13:
        r4 = SafeParcelReader.createString(r11, r1);
        goto L4
    L7:
        SafeParcelReader.skipUnknownField(r11, r1);
        goto L4
    L14:
        SafeParcelReader.ensureAtEnd(r11, r02);
        return new zzo(r4, r5, r6, r7, r8, r9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new zzo[r1];
    }
}
