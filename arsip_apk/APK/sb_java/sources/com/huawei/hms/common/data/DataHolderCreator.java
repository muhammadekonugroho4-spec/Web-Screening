package com.huawei.hms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class DataHolderCreator implements Parcelable.Creator<DataHolder> {
    public DataHolderCreator() {
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ DataHolder createFromParcel(Parcel r1) {
        return createFromParcel(r1);
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ DataHolder[] newArray(int r1) {
        return newArray(r1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final DataHolder createFromParcel(Parcel r11) {
        int r02 = SafeParcelReader.validateObjectHeader(r11);
        int r1 = 0;
        int r3 = 0;
        int r6 = 0;
        String[] r4 = null;
        CursorWindow[] r5 = null;
        Bundle r7 = null;
    L3:
        if (r1 > r02) goto L22;
        if (r11.dataPosition() >= r02) goto L22;
        r1 = r1 + 1;
        int r2 = SafeParcelReader.readHeader(r11);
        int r8 = SafeParcelReader.getFieldId(r2);
        if (r8 != 1000) goto L9;
        r3 = SafeParcelReader.readInt(r11, r2);
        goto L3
    L9:
        if (r8 != 1) goto L11;
        r4 = SafeParcelReader.createStringArray(r11, r2);
        goto L3
    L11:
        if (r8 != 2) goto L13;
        r5 = (CursorWindow[]) SafeParcelReader.createTypedArray(r11, r2, CursorWindow.CREATOR);
        goto L3
    L13:
        if (r8 != 3) goto L15;
        r6 = SafeParcelReader.readInt(r11, r2);
        goto L3
    L15:
        if (r8 != 4) goto L16;
        r7 = SafeParcelReader.createBundle(r11, r2);
        goto L3
    L16:
        SafeParcelReader.skipUnknownField(r11, r2);
    L22:
        SafeParcelReader.ensureAtEnd(r11, r02);
        return new DataHolder(r3, r4, r5, r6, r7);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public final DataHolder[] newArray(int r1) {
        return new DataHolder[r1];
    }
}
