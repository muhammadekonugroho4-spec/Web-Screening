package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class zzr implements Parcelable.Creator<zzp> {
    public zzr() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzp createFromParcel(Parcel r54) {
        int r1 = SafeParcelReader.validateObjectHeader(r54);
        String r12 = null;
        String r13 = null;
        String r14 = null;
        String r15 = null;
        String r20 = null;
        String r25 = null;
        String r31 = null;
        Boolean r32 = null;
        ArrayList<String> r35 = null;
        String r36 = null;
        String r39 = null;
        String r48 = null;
        long r16 = 0;
        long r18 = 0;
        long r26 = 0;
        long r33 = 0;
        long r41 = 0;
        long r46 = 0;
        long r50 = 0;
        boolean r21 = true;
        boolean r29 = true;
        boolean r22 = false;
        int r28 = 0;
        boolean r30 = false;
        boolean r40 = false;
        int r45 = 0;
        int r52 = 0;
        long r23 = -2147483648L;
        String r37 = "";
        String r38 = r37;
        String r44 = r38;
        String r49 = r44;
        int r43 = 100;
    L4:
        if (r54.dataPosition() >= r1) goto L41;
        int r2 = SafeParcelReader.readHeader(r54);
        switch(SafeParcelReader.getFieldId(r2)) {
            case 2: goto L40;
            case 3: goto L39;
            case 4: goto L38;
            case 5: goto L37;
            case 6: goto L36;
            case 7: goto L35;
            case 8: goto L34;
            case 9: goto L33;
            case 10: goto L32;
            case 11: goto L31;
            case 12: goto L30;
            case 13: goto L7;
            case 14: goto L29;
            case 15: goto L28;
            case 16: goto L27;
            case 17: goto L7;
            case 18: goto L26;
            case 19: goto L25;
            case 20: goto L7;
            case 21: goto L24;
            case 22: goto L23;
            case 23: goto L22;
            case 24: goto L21;
            case 25: goto L20;
            case 26: goto L19;
            case 27: goto L18;
            case 28: goto L17;
            case 29: goto L16;
            case 30: goto L15;
            case 31: goto L14;
            case 32: goto L13;
            case 33: goto L7;
            case 34: goto L12;
            case 35: goto L11;
            case 36: goto L10;
            case 37: goto L9;
            case 38: goto L8;
            default: goto L7;
        };
    L8:
        r52 = SafeParcelReader.readInt(r54, r2);
        goto L4
    L9:
        r50 = SafeParcelReader.readLong(r54, r2);
        goto L4
    L10:
        r49 = SafeParcelReader.createString(r54, r2);
        goto L4
    L11:
        r48 = SafeParcelReader.createString(r54, r2);
        goto L4
    L12:
        r46 = SafeParcelReader.readLong(r54, r2);
        goto L4
    L13:
        r45 = SafeParcelReader.readInt(r54, r2);
        goto L4
    L14:
        r44 = SafeParcelReader.createString(r54, r2);
        goto L4
    L15:
        r43 = SafeParcelReader.readInt(r54, r2);
        goto L4
    L16:
        r41 = SafeParcelReader.readLong(r54, r2);
        goto L4
    L17:
        r40 = SafeParcelReader.readBoolean(r54, r2);
        goto L4
    L18:
        r39 = SafeParcelReader.createString(r54, r2);
        goto L4
    L19:
        r38 = SafeParcelReader.createString(r54, r2);
        goto L4
    L20:
        r37 = SafeParcelReader.createString(r54, r2);
        goto L4
    L21:
        r36 = SafeParcelReader.createString(r54, r2);
        goto L4
    L22:
        r35 = SafeParcelReader.createStringList(r54, r2);
        goto L4
    L23:
        r33 = SafeParcelReader.readLong(r54, r2);
        goto L4
    L24:
        r32 = SafeParcelReader.readBooleanObject(r54, r2);
        goto L4
    L25:
        r31 = SafeParcelReader.createString(r54, r2);
        goto L4
    L26:
        r30 = SafeParcelReader.readBoolean(r54, r2);
        goto L4
    L27:
        r29 = SafeParcelReader.readBoolean(r54, r2);
        goto L4
    L28:
        r28 = SafeParcelReader.readInt(r54, r2);
        goto L4
    L29:
        r26 = SafeParcelReader.readLong(r54, r2);
        goto L4
    L30:
        r25 = SafeParcelReader.createString(r54, r2);
        goto L4
    L31:
        r23 = SafeParcelReader.readLong(r54, r2);
        goto L4
    L32:
        r22 = SafeParcelReader.readBoolean(r54, r2);
        goto L4
    L33:
        r21 = SafeParcelReader.readBoolean(r54, r2);
        goto L4
    L34:
        r20 = SafeParcelReader.createString(r54, r2);
        goto L4
    L35:
        r18 = SafeParcelReader.readLong(r54, r2);
        goto L4
    L36:
        r16 = SafeParcelReader.readLong(r54, r2);
        goto L4
    L37:
        r15 = SafeParcelReader.createString(r54, r2);
        goto L4
    L38:
        r14 = SafeParcelReader.createString(r54, r2);
        goto L4
    L39:
        r13 = SafeParcelReader.createString(r54, r2);
        goto L4
    L40:
        r12 = SafeParcelReader.createString(r54, r2);
        goto L4
    L7:
        SafeParcelReader.skipUnknownField(r54, r2);
        goto L4
    L41:
        SafeParcelReader.ensureAtEnd(r54, r1);
        return new zzp(r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r25, r26, r28, r29, r30, r31, r32, r33, r35, r36, r37, r38, r39, r40, r41, r43, r44, r45, r46, r48, r49, r50, r52);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzp[] newArray(int r1) {
        return new zzp[r1];
    }
}
