package com.huawei.hms.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.zxing.client.android.Intents;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* loaded from: classes6.dex */
public final class ConnectionResult implements Parcelable {
    public static final int API_UNAVAILABLE = 1000;
    public static final int BINDFAIL_RESOLUTION_BACKGROUND = 7;
    public static final int BINDFAIL_RESOLUTION_REQUIRED = 6;
    public static final int CANCELED = 13;
    public static final Parcelable.Creator<ConnectionResult> CREATOR = null;
    public static final int DEVELOPER_ERROR = 10;
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 9002;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 15;
    public static final int INVALID_ACCOUNT = 5;
    public static final int LICENSE_CHECK_FAILED = 11;
    public static final int NETWORK_ERROR = 9000;
    public static final int RESOLUTION_REQUIRED = 9001;
    public static final int RESTRICTED_PROFILE = 9003;
    public static final int SERVICE_DISABLED = 3;
    public static final int SERVICE_INVALID = 9;
    public static final int SERVICE_MISSING = 1;
    public static final int SERVICE_MISSING_PERMISSION = 19;
    public static final int SERVICE_UNSUPPORTED = 21;
    public static final int SERVICE_UPDATING = 9004;
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_FAILED = 9005;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int TIMEOUT = 14;
    private int apiVersion;
    private int connectionErrorCode;
    private String connectionErrorMessage;
    private PendingIntent pendingIntent;

    public static class a implements Parcelable.Creator<ConnectionResult> {
        public a() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ConnectionResult createFromParcel(Parcel r1) {
            return createFromParcel(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ConnectionResult[] newArray(int r1) {
            return newArray(r1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConnectionResult createFromParcel(Parcel r3) {
            return new ConnectionResult(r3, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConnectionResult[] newArray(int r1) {
            return new ConnectionResult[r1];
        }
    }

    static {
        CREATOR = new a();
    }

    public /* synthetic */ ConnectionResult(Parcel r1, a r2) {
        this(r1);
    }

    public static String getErrorString(int r2) {
        if (r2 == (-1)) goto L50;
        if (r2 != 0) goto L6;
        return "SUCCESS";
    L6:
        if (r2 != 1) goto L8;
        return "SERVICE_MISSING";
    L8:
        if (r2 != 2) goto L10;
        return "SERVICE_VERSION_UPDATE_REQUIRED";
    L10:
        if (r2 != 3) goto L12;
        return "SERVICE_DISABLED";
    L12:
        if (r2 != 13) goto L14;
        return "CANCELED";
    L14:
        if (r2 != 14) goto L16;
        return Intents.Scan.TIMEOUT;
    L16:
        if (r2 != 19) goto L18;
        return "SERVICE_MISSING_PERMISSION";
    L18:
        if (r2 == 21) goto L34;
        switch(r2) {
            case 6: goto L32;
            case 7: goto L30;
            case 8: goto L28;
            case 9: goto L26;
            case 10: goto L24;
            case 11: goto L22;
            default: goto L21;
        };
    L22:
        return "LICENSE_CHECK_FAILED";
    L24:
        return "DEVELOPER_ERROR";
    L26:
        return "SERVICE_INVALID";
    L28:
        return "INTERNAL_ERROR";
    L30:
        return "NETWORK_ERROR";
    L32:
        return "RESOLUTION_REQUIRED";
    L21:
        return "UNKNOWN_ERROR_CODE(" + r2 + ")";
    L34:
        return "API_VERSION_UPDATE_REQUIRED";
    L50:
        return GrsBaseInfo.CountryCodeSource.UNKNOWN;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L19;
        return true;
    L19:
        if ((r5 instanceof ConnectionResult) == false) goto L17;
        if (this.apiVersion != ((ConnectionResult) r5).apiVersion) goto L17;
        if (this.connectionErrorCode != ((ConnectionResult) r5).connectionErrorCode) goto L17;
        if (this.connectionErrorMessage.equals(((ConnectionResult) r5).connectionErrorMessage) == false) goto L17;
        if (this.pendingIntent.equals(((ConnectionResult) r5).pendingIntent) == false) goto L17;
        return true;
    L17:
        return false;
    }

    public int getErrorCode() {
        return this.connectionErrorCode;
    }

    public final String getErrorMessage() {
        return this.connectionErrorMessage;
    }

    public final PendingIntent getResolution() {
        return this.pendingIntent;
    }

    public final boolean hasResolution() {
        return HuaweiApiAvailability.getInstance().isUserResolvableError(this.connectionErrorCode, this.pendingIntent);
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{Long.valueOf(this.apiVersion), Long.valueOf(getErrorCode()), getErrorMessage(), this.pendingIntent});
    }

    public final boolean isSuccess() {
        if (this.connectionErrorCode != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final void startResolutionForResult(Activity r4, int r5) throws IntentSender.SendIntentException {
        if (hasResolution() == false) goto L6;
        HuaweiApiAvailability.getInstance().resolveError(r4, this.connectionErrorCode, r5, this.pendingIntent);
        return;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r2, int r3) {
        r2.writeInt(this.apiVersion);
        r2.writeInt(this.connectionErrorCode);
        r2.writeString(this.connectionErrorMessage);
        this.pendingIntent.writeToParcel(r2, r3);
    }

    public ConnectionResult(int r1, int r2, PendingIntent r3, String r4) {
        this.apiVersion = r1;
        this.connectionErrorCode = r2;
        this.pendingIntent = r3;
        this.connectionErrorMessage = r4;
    }

    public ConnectionResult(int r2) {
        this(r2, null);
    }

    public ConnectionResult(int r2, PendingIntent r3) {
        this(r2, r3, null);
    }

    public ConnectionResult(int r2, PendingIntent r3, String r4) {
        this(1, r2, r3, r4);
    }

    private ConnectionResult(Parcel r2) {
        this.apiVersion = 1;
        this.pendingIntent = null;
        this.connectionErrorMessage = null;
        this.apiVersion = r2.readInt();
        this.connectionErrorCode = r2.readInt();
        this.connectionErrorMessage = r2.readString();
        Parcelable r22 = (Parcelable) PendingIntent.CREATOR.createFromParcel(r2);
        if (r22 == null) goto L6;
        this.pendingIntent = (PendingIntent) r22;
        return;
    }
}
