package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.zxing.client.android.Intents;

@Deprecated
/* loaded from: classes5.dex */
public enum ErrorCode extends Enum<ErrorCode> implements Parcelable {
    public static final ErrorCode BAD_REQUEST = null;
    public static final ErrorCode CONFIGURATION_UNSUPPORTED = null;
    public static final Parcelable.Creator<ErrorCode> CREATOR = null;
    public static final ErrorCode DEVICE_INELIGIBLE = null;
    public static final ErrorCode OK = null;
    public static final ErrorCode OTHER_ERROR = null;
    public static final ErrorCode TIMEOUT = null;
    private static final String zza = null;
    private static final /* synthetic */ ErrorCode[] zzb = null;
    private final int zzc;

    static {
        ErrorCode r02 = new ErrorCode("OK", 0, 0);
        OK = r02;
        ErrorCode r1 = new ErrorCode("OTHER_ERROR", 1, 1);
        OTHER_ERROR = r1;
        ErrorCode r2 = new ErrorCode("BAD_REQUEST", 2, 2);
        BAD_REQUEST = r2;
        ErrorCode r3 = new ErrorCode("CONFIGURATION_UNSUPPORTED", 3, 3);
        CONFIGURATION_UNSUPPORTED = r3;
        ErrorCode r4 = new ErrorCode("DEVICE_INELIGIBLE", 4, 4);
        DEVICE_INELIGIBLE = r4;
        ErrorCode r5 = new ErrorCode(Intents.Scan.TIMEOUT, 5, 5);
        TIMEOUT = r5;
        zzb = new ErrorCode[]{r02, r1, r2, r3, r4, r5};
        zza = ErrorCode.class.getSimpleName();
        CREATOR = new zzc();
    }

    ErrorCode(String r1, int r2, int r3) {
        this.zzc = r3;
    }

    public static ErrorCode toErrorCode(int r5) {
        ErrorCode[] r02 = values();
        int r1 = r02.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L9;
        ErrorCode r3 = r02[r2];
        if (r5 == r3.zzc) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return r3;
    L9:
        return OTHER_ERROR;
    }

    public static ErrorCode valueOf(String r1) {
        return (ErrorCode) Enum.valueOf(ErrorCode.class, r1);
    }

    public static ErrorCode[] values() {
        return (ErrorCode[]) zzb.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCode() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.zzc);
    }
}
