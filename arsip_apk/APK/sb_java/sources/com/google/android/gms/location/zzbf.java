package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzbf implements Parcelable.Creator<LocationRequest> {
    public zzbf() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest createFromParcel(Parcel r29) {
        int r1 = SafeParcelReader.validateObjectHeader(r29);
        int r15 = 102;
        long r16 = 3600000;
        long r18 = 600000;
        boolean r20 = false;
        boolean r27 = false;
        long r21 = Long.MAX_VALUE;
        int r23 = Integer.MAX_VALUE;
        float r24 = 0.0f;
        long r25 = 0;
    L4:
        if (r29.dataPosition() >= r1) goto L17;
        int r2 = SafeParcelReader.readHeader(r29);
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
        r27 = SafeParcelReader.readBoolean(r29, r2);
        goto L4
    L9:
        r25 = SafeParcelReader.readLong(r29, r2);
        goto L4
    L10:
        r24 = SafeParcelReader.readFloat(r29, r2);
        goto L4
    L11:
        r23 = SafeParcelReader.readInt(r29, r2);
        goto L4
    L12:
        r21 = SafeParcelReader.readLong(r29, r2);
        goto L4
    L13:
        r20 = SafeParcelReader.readBoolean(r29, r2);
        goto L4
    L14:
        r18 = SafeParcelReader.readLong(r29, r2);
        goto L4
    L15:
        r16 = SafeParcelReader.readLong(r29, r2);
        goto L4
    L16:
        r15 = SafeParcelReader.readInt(r29, r2);
        goto L4
    L7:
        SafeParcelReader.skipUnknownField(r29, r2);
        goto L4
    L17:
        SafeParcelReader.ensureAtEnd(r29, r1);
        return new LocationRequest(r15, r16, r18, r20, r21, r23, r24, r25, r27);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest[] newArray(int r1) {
        return new LocationRequest[r1];
    }
}
