package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzy implements Parcelable.Creator {
    public zzy() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel r15) {
        int r02 = SafeParcelReader.validateObjectHeader(r15);
        long r12 = 0;
        boolean r10 = false;
        boolean r11 = false;
        String r6 = null;
        String r7 = null;
        byte[] r8 = null;
        byte[] r9 = null;
    L4:
        if (r15.dataPosition() >= r02) goto L15;
        int r1 = SafeParcelReader.readHeader(r15);
        switch(SafeParcelReader.getFieldId(r1)) {
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
        r12 = SafeParcelReader.readLong(r15, r1);
        goto L4
    L9:
        r11 = SafeParcelReader.readBoolean(r15, r1);
        goto L4
    L10:
        r10 = SafeParcelReader.readBoolean(r15, r1);
        goto L4
    L11:
        r9 = SafeParcelReader.createByteArray(r15, r1);
        goto L4
    L12:
        r8 = SafeParcelReader.createByteArray(r15, r1);
        goto L4
    L13:
        r7 = SafeParcelReader.createString(r15, r1);
        goto L4
    L14:
        r6 = SafeParcelReader.createString(r15, r1);
        goto L4
    L7:
        SafeParcelReader.skipUnknownField(r15, r1);
        goto L4
    L15:
        SafeParcelReader.ensureAtEnd(r15, r02);
        return new FidoCredentialDetails(r6, r7, r8, r9, r10, r11, r12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new FidoCredentialDetails[r1];
    }
}
