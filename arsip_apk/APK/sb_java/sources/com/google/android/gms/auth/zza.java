package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zza implements Parcelable.Creator {
    public zza() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel r14) {
        int r02 = SafeParcelReader.validateObjectHeader(r14);
        int r6 = 0;
        int r10 = 0;
        int r11 = 0;
        long r7 = 0;
        String r9 = null;
        String r12 = null;
    L4:
        if (r14.dataPosition() >= r02) goto L14;
        int r1 = SafeParcelReader.readHeader(r14);
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
        r12 = SafeParcelReader.createString(r14, r1);
        goto L4
    L9:
        r11 = SafeParcelReader.readInt(r14, r1);
        goto L4
    L10:
        r10 = SafeParcelReader.readInt(r14, r1);
        goto L4
    L11:
        r9 = SafeParcelReader.createString(r14, r1);
        goto L4
    L12:
        r7 = SafeParcelReader.readLong(r14, r1);
        goto L4
    L13:
        r6 = SafeParcelReader.readInt(r14, r1);
        goto L4
    L7:
        SafeParcelReader.skipUnknownField(r14, r1);
        goto L4
    L14:
        SafeParcelReader.ensureAtEnd(r14, r02);
        return new AccountChangeEvent(r6, r7, r9, r10, r11, r12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new AccountChangeEvent[r1];
    }
}
