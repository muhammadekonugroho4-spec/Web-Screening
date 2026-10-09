package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.zxing.client.android.Intents;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

@SafeParcelable.Class(creator = "ConnectionResultCreator")
/* loaded from: classes5.dex */
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final int API_DISABLED = 23;
    public static final int API_DISABLED_FOR_CONNECTION = 24;
    public static final int API_UNAVAILABLE = 16;
    public static final int CANCELED = 13;
    public static final Parcelable.Creator<ConnectionResult> CREATOR = null;
    public static final int DEVELOPER_ERROR = 10;

    @Deprecated
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 15;
    public static final int INVALID_ACCOUNT = 5;
    public static final int LICENSE_CHECK_FAILED = 11;
    public static final int NETWORK_ERROR = 7;
    public static final int RESOLUTION_ACTIVITY_NOT_FOUND = 22;
    public static final int RESOLUTION_REQUIRED = 6;
    public static final int RESTRICTED_PROFILE = 20;

    @ShowFirstParty
    @KeepForSdk
    public static final ConnectionResult RESULT_SUCCESS = null;
    public static final int SERVICE_DISABLED = 3;
    public static final int SERVICE_INVALID = 9;
    public static final int SERVICE_MISSING = 1;
    public static final int SERVICE_MISSING_PERMISSION = 19;
    public static final int SERVICE_UPDATING = 18;
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_FAILED = 17;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int TIMEOUT = 14;

    @KeepForSdk
    public static final int UNKNOWN = -1;

    @SafeParcelable.VersionField(id = 1)
    final int zza;

    @SafeParcelable.Field(getter = "getErrorCode", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getResolution", id = 3)
    private final PendingIntent zzc;

    @SafeParcelable.Field(getter = "getErrorMessage", id = 4)
    private final String zzd;

    static {
        RESULT_SUCCESS = new ConnectionResult(0);
        CREATOR = new zzb();
    }

    @SafeParcelable.Constructor
    public ConnectionResult(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) int r2, @SafeParcelable.Param(id = 3) PendingIntent r3, @SafeParcelable.Param(id = 4) String r4) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
        this.zzd = r4;
    }

    public static String zza(int r2) {
        if (r2 != 99) goto L5;
        return "UNFINISHED";
    L5:
        if (r2 == 1500) goto L62;
        switch(r2) {
            case -1: goto L60;
            case 0: goto L58;
            case 1: goto L56;
            case 2: goto L54;
            case 3: goto L52;
            case 4: goto L50;
            case 5: goto L48;
            case 6: goto L46;
            case 7: goto L44;
            case 8: goto L42;
            case 9: goto L40;
            case 10: goto L38;
            case 11: goto L36;
            default: goto L7;
        };
    L7:
        switch(r2) {
            case 13: goto L34;
            case 14: goto L32;
            case 15: goto L30;
            case 16: goto L28;
            case 17: goto L26;
            case 18: goto L24;
            case 19: goto L22;
            case 20: goto L20;
            case 21: goto L18;
            case 22: goto L16;
            case 23: goto L14;
            case 24: goto L12;
            case 25: goto L10;
            default: goto L9;
        };
    L10:
        return "API_INSTALL_REQUIRED";
    L12:
        return "API_DISABLED_FOR_CONNECTION";
    L14:
        return "API_DISABLED";
    L16:
        return "RESOLUTION_ACTIVITY_NOT_FOUND";
    L18:
        return "API_VERSION_UPDATE_REQUIRED";
    L20:
        return "RESTRICTED_PROFILE";
    L22:
        return "SERVICE_MISSING_PERMISSION";
    L24:
        return "SERVICE_UPDATING";
    L26:
        return "SIGN_IN_FAILED";
    L28:
        return "API_UNAVAILABLE";
    L30:
        return "INTERRUPTED";
    L32:
        return Intents.Scan.TIMEOUT;
    L34:
        return "CANCELED";
    L9:
        return "UNKNOWN_ERROR_CODE(" + r2 + ")";
    L36:
        return "LICENSE_CHECK_FAILED";
    L38:
        return "DEVELOPER_ERROR";
    L40:
        return "SERVICE_INVALID";
    L42:
        return "INTERNAL_ERROR";
    L44:
        return "NETWORK_ERROR";
    L46:
        return "RESOLUTION_REQUIRED";
    L48:
        return "INVALID_ACCOUNT";
    L50:
        return "SIGN_IN_REQUIRED";
    L52:
        return "SERVICE_DISABLED";
    L54:
        return "SERVICE_VERSION_UPDATE_REQUIRED";
    L56:
        return "SERVICE_MISSING";
    L58:
        return "SUCCESS";
    L60:
        return GrsBaseInfo.CountryCodeSource.UNKNOWN;
    L62:
        return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof ConnectionResult) == true) goto L8;
        return false;
    L8:
        ConnectionResult r52 = (ConnectionResult) r5;
        if (this.zzb == r52.zzb) goto L11;
    L15:
        return false;
    L11:
        if (Objects.equal(this.zzc, r52.zzc) == false) goto L15;
        if (Objects.equal(this.zzd, r52.zzd) == false) goto L15;
        return true;
    }

    public int getErrorCode() {
        return this.zzb;
    }

    public String getErrorMessage() {
        return this.zzd;
    }

    public PendingIntent getResolution() {
        return this.zzc;
    }

    public boolean hasResolution() {
        if (this.zzb != 0) goto L5;
        return false;
    L5:
        if (this.zzc == null) goto L10;
        return true;
    L10:
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public boolean isSuccess() {
        if (this.zzb != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public void startResolutionForResult(Activity r9, int r10) throws IntentSender.SendIntentException {
        if (hasResolution() == true) goto L5;
        return;
    L5:
        PendingIntent r02 = this.zzc;
        Preconditions.checkNotNull(r02);
        r9.startIntentSenderForResult(r02.getIntentSender(), r10, null, 0, 0, 0);
    }

    public String toString() {
        Objects.ToStringHelper r02 = Objects.toStringHelper(this);
        r02.add(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, zza(this.zzb));
        r02.add(CommonCode.MapKey.HAS_RESOLUTION, this.zzc);
        r02.add("message", this.zzd);
        return r02.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r5, int r6) {
        int r02 = this.zza;
        int r1 = SafeParcelWriter.beginObjectHeader(r5);
        SafeParcelWriter.writeInt(r5, 1, r02);
        SafeParcelWriter.writeInt(r5, 2, getErrorCode());
        SafeParcelWriter.writeParcelable(r5, 3, getResolution(), r6, false);
        SafeParcelWriter.writeString(r5, 4, getErrorMessage(), false);
        SafeParcelWriter.finishObjectHeader(r5, r1);
    }

    public ConnectionResult(int r2) {
        this(r2, null, null);
    }

    public ConnectionResult(int r2, PendingIntent r3) {
        this(r2, r3, null);
    }

    public ConnectionResult(int r2, PendingIntent r3, String r4) {
        this(1, r2, r3, r4);
    }
}
