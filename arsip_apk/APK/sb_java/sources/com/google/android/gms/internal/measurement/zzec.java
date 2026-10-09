package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzec implements Parcelable.Creator<zzdz> {
    public zzec() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdz createFromParcel(Parcel r18) {
        int r1 = SafeParcelReader.validateObjectHeader(r18);
        long r7 = 0;
        long r9 = 0;
        boolean r11 = false;
        String r12 = null;
        String r13 = null;
        String r14 = null;
        Bundle r15 = null;
        String r16 = null;
    L4:
        if (r18.dataPosition() >= r1) goto L16;
        int r2 = SafeParcelReader.readHeader(r18);
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
        r16 = SafeParcelReader.createString(r18, r2);
        goto L4
    L9:
        r15 = SafeParcelReader.createBundle(r18, r2);
        goto L4
    L10:
        r14 = SafeParcelReader.createString(r18, r2);
        goto L4
    L11:
        r13 = SafeParcelReader.createString(r18, r2);
        goto L4
    L12:
        r12 = SafeParcelReader.createString(r18, r2);
        goto L4
    L13:
        r11 = SafeParcelReader.readBoolean(r18, r2);
        goto L4
    L14:
        r9 = SafeParcelReader.readLong(r18, r2);
        goto L4
    L15:
        r7 = SafeParcelReader.readLong(r18, r2);
        goto L4
    L7:
        SafeParcelReader.skipUnknownField(r18, r2);
        goto L4
    L16:
        SafeParcelReader.ensureAtEnd(r18, r1);
        return new zzdz(r7, r9, r11, r12, r13, r14, r15, r16);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdz[] newArray(int r1) {
        return new zzdz[r1];
    }
}
