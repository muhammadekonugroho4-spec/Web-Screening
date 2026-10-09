package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzpl implements Parcelable.Creator<zzpm> {
    public zzpl() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzpm createFromParcel(Parcel r17) {
        int r1 = SafeParcelReader.validateObjectHeader(r17);
        int r7 = 0;
        String r8 = null;
        Long r11 = null;
        Float r12 = null;
        String r13 = null;
        String r14 = null;
        Double r15 = null;
        long r9 = 0;
    L4:
        if (r17.dataPosition() >= r1) goto L16;
        int r2 = SafeParcelReader.readHeader(r17);
        switch(SafeParcelReader.getFieldId(r2)) {
            case 1: goto L15;
            case 2: goto L14;
            case 3: goto L13;
            case 4: goto L12;
            case 5: goto L11;
            case 6: goto L10;
            case 7: goto L9;
            case 8: goto L8;
            default: goto L7;
        };
    L8:
        r15 = SafeParcelReader.readDoubleObject(r17, r2);
        goto L4
    L9:
        r14 = SafeParcelReader.createString(r17, r2);
        goto L4
    L10:
        r13 = SafeParcelReader.createString(r17, r2);
        goto L4
    L11:
        r12 = SafeParcelReader.readFloatObject(r17, r2);
        goto L4
    L12:
        r11 = SafeParcelReader.readLongObject(r17, r2);
        goto L4
    L13:
        r9 = SafeParcelReader.readLong(r17, r2);
        goto L4
    L14:
        r8 = SafeParcelReader.createString(r17, r2);
        goto L4
    L15:
        r7 = SafeParcelReader.readInt(r17, r2);
        goto L4
    L7:
        SafeParcelReader.skipUnknownField(r17, r2);
        goto L4
    L16:
        SafeParcelReader.ensureAtEnd(r17, r1);
        return new zzpm(r7, r8, r9, r11, r12, r13, r14, r15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzpm[] newArray(int r1) {
        return new zzpm[r1];
    }
}
