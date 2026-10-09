package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzbu implements Parcelable.Creator<SleepClassifyEvent> {
    public zzbu() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SleepClassifyEvent createFromParcel(Parcel r13) {
        int r02 = SafeParcelReader.validateObjectHeader(r13);
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        boolean r10 = false;
        int r11 = 0;
    L4:
        if (r13.dataPosition() >= r02) goto L17;
        int r1 = SafeParcelReader.readHeader(r13);
        switch(SafeParcelReader.getFieldId(r1)) {
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
        r11 = SafeParcelReader.readInt(r13, r1);
        goto L4
    L9:
        r10 = SafeParcelReader.readBoolean(r13, r1);
        goto L4
    L10:
        r9 = SafeParcelReader.readInt(r13, r1);
        goto L4
    L11:
        r8 = SafeParcelReader.readInt(r13, r1);
        goto L4
    L12:
        r7 = SafeParcelReader.readInt(r13, r1);
        goto L4
    L13:
        r6 = SafeParcelReader.readInt(r13, r1);
        goto L4
    L14:
        r5 = SafeParcelReader.readInt(r13, r1);
        goto L4
    L15:
        r4 = SafeParcelReader.readInt(r13, r1);
        goto L4
    L16:
        r3 = SafeParcelReader.readInt(r13, r1);
        goto L4
    L7:
        SafeParcelReader.skipUnknownField(r13, r1);
        goto L4
    L17:
        SafeParcelReader.ensureAtEnd(r13, r02);
        return new SleepClassifyEvent(r3, r4, r5, r6, r7, r8, r9, r10, r11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SleepClassifyEvent[] newArray(int r1) {
        return new SleepClassifyEvent[r1];
    }
}
