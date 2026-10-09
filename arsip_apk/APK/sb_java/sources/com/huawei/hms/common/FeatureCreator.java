package com.huawei.hms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class FeatureCreator implements Parcelable.Creator<Feature> {
    public FeatureCreator() {
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ Feature createFromParcel(Parcel r1) {
        return createFromParcel(r1);
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ Feature[] newArray(int r1) {
        return newArray(r1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final Feature createFromParcel(Parcel r10) {
        int r02 = SafeParcelReader.validateObjectHeader(r10);
        String r1 = null;
        int r2 = 0;
        long r4 = -1;
        int r3 = 0;
    L3:
        if (r2 > r02) goto L16;
        if (r10.dataPosition() >= r02) goto L16;
        r2 = r2 + 1;
        int r6 = SafeParcelReader.readHeader(r10);
        int r7 = SafeParcelReader.getFieldId(r6);
        if (r7 != 1) goto L9;
        r1 = SafeParcelReader.createString(r10, r6);
        goto L3
    L9:
        if (r7 != 2) goto L11;
        r3 = SafeParcelReader.readInt(r10, r6);
        goto L3
    L11:
        if (r7 != 3) goto L12;
        r4 = SafeParcelReader.readLong(r10, r6);
        goto L3
    L12:
        SafeParcelReader.skipUnknownField(r10, r6);
    L16:
        SafeParcelReader.ensureAtEnd(r10, r02);
        return new Feature(r1, r3, r4);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final Feature[] newArray(int r1) {
        return new Feature[r1];
    }
}
