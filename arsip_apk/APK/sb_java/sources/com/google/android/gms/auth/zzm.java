package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class zzm implements Parcelable.Creator {
    public zzm() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel r12) {
        int r02 = SafeParcelReader.validateObjectHeader(r12);
        int r4 = 0;
        boolean r7 = false;
        boolean r8 = false;
        String r5 = null;
        Long r6 = null;
        ArrayList<String> r9 = null;
        String r10 = null;
    L4:
        if (r12.dataPosition() >= r02) goto L15;
        int r1 = SafeParcelReader.readHeader(r12);
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
        r10 = SafeParcelReader.createString(r12, r1);
        goto L4
    L9:
        r9 = SafeParcelReader.createStringList(r12, r1);
        goto L4
    L10:
        r8 = SafeParcelReader.readBoolean(r12, r1);
        goto L4
    L11:
        r7 = SafeParcelReader.readBoolean(r12, r1);
        goto L4
    L12:
        r6 = SafeParcelReader.readLongObject(r12, r1);
        goto L4
    L13:
        r5 = SafeParcelReader.createString(r12, r1);
        goto L4
    L14:
        r4 = SafeParcelReader.readInt(r12, r1);
        goto L4
    L7:
        SafeParcelReader.skipUnknownField(r12, r1);
        goto L4
    L15:
        SafeParcelReader.ensureAtEnd(r12, r02);
        return new TokenData(r4, r5, r6, r7, r8, r9, r10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new TokenData[r1];
    }
}
