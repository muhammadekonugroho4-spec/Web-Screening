package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class zbp implements Parcelable.Creator {
    public zbp() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel r11) {
        int r02 = SafeParcelReader.validateObjectHeader(r11);
        int r9 = 0;
        PendingIntent r4 = null;
        String r5 = null;
        String r6 = null;
        ArrayList<String> r7 = null;
        String r8 = null;
    L4:
        if (r11.dataPosition() >= r02) goto L14;
        int r1 = SafeParcelReader.readHeader(r11);
        switch(SafeParcelReader.getFieldId(r1)) {
            case 1: goto L13;
            case 2: goto L12;
            case 3: goto L11;
            case 4: goto L10;
            case 5: goto L9;
            case 6: goto L8;
            default: goto L7;
        };
    L8:
        r9 = SafeParcelReader.readInt(r11, r1);
        goto L4
    L9:
        r8 = SafeParcelReader.createString(r11, r1);
        goto L4
    L10:
        r7 = SafeParcelReader.createStringList(r11, r1);
        goto L4
    L11:
        r6 = SafeParcelReader.createString(r11, r1);
        goto L4
    L12:
        r5 = SafeParcelReader.createString(r11, r1);
        goto L4
    L13:
        r4 = (PendingIntent) SafeParcelReader.createParcelable(r11, r1, PendingIntent.CREATOR);
        goto L4
    L7:
        SafeParcelReader.skipUnknownField(r11, r1);
        goto L4
    L14:
        SafeParcelReader.ensureAtEnd(r11, r02);
        return new SaveAccountLinkingTokenRequest(r4, r5, r6, r7, r8, r9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r1) {
        return new SaveAccountLinkingTokenRequest[r1];
    }
}
