package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes5.dex */
public final class zah implements Parcelable.Creator {
    public zah() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel r9) {
        int r02 = SafeParcelReader.validateObjectHeader(r9);
        int r1 = 0;
        int r3 = 0;
        Uri r4 = null;
        int r2 = 0;
    L4:
        if (r9.dataPosition() >= r02) goto L18;
        int r5 = SafeParcelReader.readHeader(r9);
        int r6 = SafeParcelReader.getFieldId(r5);
        if (r6 != 1) goto L8;
        r1 = SafeParcelReader.readInt(r9, r5);
        goto L4
    L8:
        if (r6 != 2) goto L10;
        r4 = (Uri) SafeParcelReader.createParcelable(r9, r5, Uri.CREATOR);
        goto L4
    L10:
        if (r6 != 3) goto L12;
        r2 = SafeParcelReader.readInt(r9, r5);
        goto L4
    L12:
        if (r6 != 4) goto L13;
        r3 = SafeParcelReader.readInt(r9, r5);
        goto L4
    L13:
        SafeParcelReader.skipUnknownField(r9, r5);
        goto L4
    L18:
        SafeParcelReader.ensureAtEnd(r9, r02);
        return new WebImage(r1, r4, r2, r3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new WebImage[r1];
    }
}
