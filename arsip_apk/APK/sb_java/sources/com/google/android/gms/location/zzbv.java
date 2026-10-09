package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzbv implements Parcelable.Creator<SleepSegmentEvent> {
    public zzbv() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SleepSegmentEvent createFromParcel(Parcel r13) {
        int r02 = SafeParcelReader.validateObjectHeader(r13);
        long r5 = 0;
        long r7 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
    L4:
        if (r13.dataPosition() >= r02) goto L21;
        int r1 = SafeParcelReader.readHeader(r13);
        int r2 = SafeParcelReader.getFieldId(r1);
        if (r2 != 1) goto L8;
        r5 = SafeParcelReader.readLong(r13, r1);
        goto L4
    L8:
        if (r2 != 2) goto L10;
        r7 = SafeParcelReader.readLong(r13, r1);
        goto L4
    L10:
        if (r2 != 3) goto L12;
        r9 = SafeParcelReader.readInt(r13, r1);
        goto L4
    L12:
        if (r2 != 4) goto L14;
        r10 = SafeParcelReader.readInt(r13, r1);
        goto L4
    L14:
        if (r2 != 5) goto L15;
        r11 = SafeParcelReader.readInt(r13, r1);
        goto L4
    L15:
        SafeParcelReader.skipUnknownField(r13, r1);
        goto L4
    L21:
        SafeParcelReader.ensureAtEnd(r13, r02);
        return new SleepSegmentEvent(r5, r7, r9, r10, r11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SleepSegmentEvent[] newArray(int r1) {
        return new SleepSegmentEvent[r1];
    }
}
