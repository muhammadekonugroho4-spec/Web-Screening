package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzm implements Parcelable.Creator<ActivityTransitionEvent> {
    public zzm() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ActivityTransitionEvent createFromParcel(Parcel r9) {
        int r02 = SafeParcelReader.validateObjectHeader(r9);
        int r1 = 0;
        long r3 = 0;
        int r2 = 0;
    L4:
        if (r9.dataPosition() >= r02) goto L15;
        int r5 = SafeParcelReader.readHeader(r9);
        int r6 = SafeParcelReader.getFieldId(r5);
        if (r6 != 1) goto L8;
        r1 = SafeParcelReader.readInt(r9, r5);
        goto L4
    L8:
        if (r6 != 2) goto L10;
        r2 = SafeParcelReader.readInt(r9, r5);
        goto L4
    L10:
        if (r6 != 3) goto L11;
        r3 = SafeParcelReader.readLong(r9, r5);
        goto L4
    L11:
        SafeParcelReader.skipUnknownField(r9, r5);
        goto L4
    L15:
        SafeParcelReader.ensureAtEnd(r9, r02);
        return new ActivityTransitionEvent(r1, r2, r3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ActivityTransitionEvent[] newArray(int r1) {
        return new ActivityTransitionEvent[r1];
    }
}
