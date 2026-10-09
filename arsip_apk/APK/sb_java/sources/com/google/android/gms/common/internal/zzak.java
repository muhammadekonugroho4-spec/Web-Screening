package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zzak implements Parcelable.Creator {
    public zzak() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel r10) {
        int r02 = SafeParcelReader.validateObjectHeader(r10);
        int r3 = 0;
        boolean r4 = false;
        boolean r5 = false;
        int r6 = 0;
        int r7 = 0;
    L4:
        if (r10.dataPosition() >= r02) goto L21;
        int r1 = SafeParcelReader.readHeader(r10);
        int r2 = SafeParcelReader.getFieldId(r1);
        if (r2 != 1) goto L8;
        r3 = SafeParcelReader.readInt(r10, r1);
        goto L4
    L8:
        if (r2 != 2) goto L10;
        r4 = SafeParcelReader.readBoolean(r10, r1);
        goto L4
    L10:
        if (r2 != 3) goto L12;
        r5 = SafeParcelReader.readBoolean(r10, r1);
        goto L4
    L12:
        if (r2 != 4) goto L14;
        r6 = SafeParcelReader.readInt(r10, r1);
        goto L4
    L14:
        if (r2 != 5) goto L15;
        r7 = SafeParcelReader.readInt(r10, r1);
        goto L4
    L15:
        SafeParcelReader.skipUnknownField(r10, r1);
        goto L4
    L21:
        SafeParcelReader.ensureAtEnd(r10, r02);
        return new RootTelemetryConfiguration(r3, r4, r5, r6, r7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new RootTelemetryConfiguration[r1];
    }
}
