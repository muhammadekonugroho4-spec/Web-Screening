package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzl implements Parcelable.Creator<ActivityTransition> {
    public zzl() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ActivityTransition createFromParcel(Parcel r7) {
        int r02 = SafeParcelReader.validateObjectHeader(r7);
        int r1 = 0;
        int r2 = 0;
    L4:
        if (r7.dataPosition() >= r02) goto L12;
        int r3 = SafeParcelReader.readHeader(r7);
        int r4 = SafeParcelReader.getFieldId(r3);
        if (r4 != 1) goto L8;
        r1 = SafeParcelReader.readInt(r7, r3);
        goto L4
    L8:
        if (r4 != 2) goto L9;
        r2 = SafeParcelReader.readInt(r7, r3);
        goto L4
    L9:
        SafeParcelReader.skipUnknownField(r7, r3);
        goto L4
    L12:
        SafeParcelReader.ensureAtEnd(r7, r02);
        return new ActivityTransition(r1, r2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ActivityTransition[] newArray(int r1) {
        return new ActivityTransition[r1];
    }
}
