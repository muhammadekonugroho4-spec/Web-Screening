package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes6.dex */
public final class zzb implements Parcelable.Creator<ActionCodeSettings> {
    public zzb() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ActionCodeSettings createFromParcel(Parcel r17) {
        int r1 = SafeParcelReader.validateObjectHeader(r17);
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        String r10 = null;
        String r12 = null;
        String r14 = null;
        String r15 = null;
        boolean r9 = false;
        boolean r11 = false;
        int r13 = 0;
    L4:
        if (r17.dataPosition() >= r1) goto L19;
        int r2 = SafeParcelReader.readHeader(r17);
        switch(SafeParcelReader.getFieldId(r2)) {
            case 1: goto L18;
            case 2: goto L17;
            case 3: goto L16;
            case 4: goto L15;
            case 5: goto L14;
            case 6: goto L13;
            case 7: goto L12;
            case 8: goto L11;
            case 9: goto L10;
            case 10: goto L9;
            case 11: goto L8;
            default: goto L7;
        };
    L8:
        r15 = SafeParcelReader.createString(r17, r2);
        goto L4
    L9:
        r14 = SafeParcelReader.createString(r17, r2);
        goto L4
    L10:
        r13 = SafeParcelReader.readInt(r17, r2);
        goto L4
    L11:
        r12 = SafeParcelReader.createString(r17, r2);
        goto L4
    L12:
        r11 = SafeParcelReader.readBoolean(r17, r2);
        goto L4
    L13:
        r10 = SafeParcelReader.createString(r17, r2);
        goto L4
    L14:
        r9 = SafeParcelReader.readBoolean(r17, r2);
        goto L4
    L15:
        r8 = SafeParcelReader.createString(r17, r2);
        goto L4
    L16:
        r7 = SafeParcelReader.createString(r17, r2);
        goto L4
    L17:
        r6 = SafeParcelReader.createString(r17, r2);
        goto L4
    L18:
        r5 = SafeParcelReader.createString(r17, r2);
        goto L4
    L7:
        SafeParcelReader.skipUnknownField(r17, r2);
        goto L4
    L19:
        SafeParcelReader.ensureAtEnd(r17, r1);
        return new ActionCodeSettings(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ActionCodeSettings[] newArray(int r1) {
        return new ActionCodeSettings[r1];
    }
}
