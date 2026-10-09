package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class zzaq implements Parcelable.Creator<PhoneMultiFactorInfo> {
    public zzaq() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PhoneMultiFactorInfo createFromParcel(Parcel r11) {
        int r02 = SafeParcelReader.validateObjectHeader(r11);
        String r5 = null;
        String r6 = null;
        String r9 = null;
        long r7 = 0;
    L4:
        if (r11.dataPosition() >= r02) goto L18;
        int r1 = SafeParcelReader.readHeader(r11);
        int r2 = SafeParcelReader.getFieldId(r1);
        if (r2 != 1) goto L8;
        r5 = SafeParcelReader.createString(r11, r1);
        goto L4
    L8:
        if (r2 != 2) goto L10;
        r6 = SafeParcelReader.createString(r11, r1);
        goto L4
    L10:
        if (r2 != 3) goto L12;
        r7 = SafeParcelReader.readLong(r11, r1);
        goto L4
    L12:
        if (r2 != 4) goto L13;
        r9 = SafeParcelReader.createString(r11, r1);
        goto L4
    L13:
        SafeParcelReader.skipUnknownField(r11, r1);
        goto L4
    L18:
        SafeParcelReader.ensureAtEnd(r11, r02);
        return new PhoneMultiFactorInfo(r5, r6, r7, r9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PhoneMultiFactorInfo[] newArray(int r1) {
        return new PhoneMultiFactorInfo[r1];
    }
}
