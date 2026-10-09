package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzbf implements Parcelable.Creator<zzbe> {
    public zzbf() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbe createFromParcel(Parcel r24) {
        int r1 = SafeParcelReader.validateObjectHeader(r24);
        String r11 = null;
        int r12 = 0;
        short r13 = 0;
        int r21 = 0;
        double r14 = 0.0d;
        double r16 = 0.0d;
        float r18 = 0.0f;
        long r19 = 0;
        int r22 = -1;
    L4:
        if (r24.dataPosition() >= r1) goto L17;
        int r2 = SafeParcelReader.readHeader(r24);
        switch(SafeParcelReader.getFieldId(r2)) {
            case 1: goto L16;
            case 2: goto L15;
            case 3: goto L14;
            case 4: goto L13;
            case 5: goto L12;
            case 6: goto L11;
            case 7: goto L10;
            case 8: goto L9;
            case 9: goto L8;
            default: goto L7;
        };
    L8:
        r22 = SafeParcelReader.readInt(r24, r2);
        goto L4
    L9:
        r21 = SafeParcelReader.readInt(r24, r2);
        goto L4
    L10:
        r12 = SafeParcelReader.readInt(r24, r2);
        goto L4
    L11:
        r18 = SafeParcelReader.readFloat(r24, r2);
        goto L4
    L12:
        r16 = SafeParcelReader.readDouble(r24, r2);
        goto L4
    L13:
        r14 = SafeParcelReader.readDouble(r24, r2);
        goto L4
    L14:
        r13 = SafeParcelReader.readShort(r24, r2);
        goto L4
    L15:
        r19 = SafeParcelReader.readLong(r24, r2);
        goto L4
    L16:
        r11 = SafeParcelReader.createString(r24, r2);
        goto L4
    L7:
        SafeParcelReader.skipUnknownField(r24, r2);
        goto L4
    L17:
        SafeParcelReader.ensureAtEnd(r24, r1);
        return new zzbe(r11, r12, r13, r14, r16, r18, r19, r21, r22);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbe[] newArray(int r1) {
        return new zzbe[r1];
    }
}
