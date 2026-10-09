package com.huawei.hms.support.api.client;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.core.aidl.annotation.Packed;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class Status extends Result implements Parcelable {
    public static final Parcelable.Creator<Status> CREATOR = null;
    public static final Status CoreException = null;
    public static final Status FAILURE = null;
    public static final Status MessageNotFound = null;

    @Deprecated
    public static final Status RESULT_CANCELED = null;

    @Deprecated
    public static final Status RESULT_DEAD_CLIENT = null;

    @Deprecated
    public static final Status RESULT_INTERNAL_ERROR = null;

    @Deprecated
    public static final Status RESULT_INTERRUPTED = null;

    @Deprecated
    public static final Status RESULT_TIMEOUT = null;
    public static final Status SUCCESS = null;

    @Packed
    private Intent intent;

    @Packed
    private PendingIntent pendingIntent;

    @Packed
    private int statusCode;

    @Packed
    private String statusMessage;

    public static class a implements Parcelable.Creator {
        public a() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel r1) {
            return createFromParcel(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int r1) {
            return newArray(r1);
        }

        @Override // android.os.Parcelable.Creator
        public Status createFromParcel(Parcel r4) {
            return new Status(r4.readInt(), r4.readString(), PendingIntent.readPendingIntentOrNullFromParcel(r4));
        }

        @Override // android.os.Parcelable.Creator
        public Status[] newArray(int r1) {
            return new Status[r1];
        }
    }

    static {
        SUCCESS = new Status(0);
        FAILURE = new Status(1);
        RESULT_CANCELED = new Status(16);
        RESULT_DEAD_CLIENT = new Status(18);
        RESULT_INTERNAL_ERROR = new Status(8);
        RESULT_INTERRUPTED = new Status(14);
        RESULT_TIMEOUT = new Status(15);
        MessageNotFound = new Status(404);
        CoreException = new Status(500);
        CREATOR = new a();
    }

    public Status(int r2) {
        this(r2, null);
    }

    private static boolean equal(Object r02, Object r1) {
        if (r02 == r1) goto L9;
        if (r02 != null) goto L5;
        return false;
    L5:
        if (r02.equals(r1) == true) goto L12;
        return false;
    L12:
        return true;
    L9:
        return true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Status) == false) goto L16;
        Status r52 = (Status) r5;
        if (this.statusCode != r52.statusCode) goto L16;
        if (equal(this.statusMessage, r52.statusMessage) == false) goto L16;
        if (equal(this.pendingIntent, r52.pendingIntent) == false) goto L16;
        if (equal(this.intent, r52.intent) == false) goto L16;
        return true;
    L16:
        return false;
    }

    public String getErrorString() {
        return getStatusMessage();
    }

    public PendingIntent getResolution() {
        return this.pendingIntent;
    }

    public Intent getResolutionIntent() {
        return this.intent;
    }

    @Override // com.huawei.hms.support.api.client.Result
    public Status getStatus() {
        return this;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public boolean hasResolution() {
        if (this.pendingIntent == null) goto L5;
        return true;
    L5:
        if (this.intent != null) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.statusCode), this.statusMessage, this.pendingIntent, this.intent});
    }

    public boolean isCanceled() {
        return false;
    }

    public boolean isInterrupted() {
        return false;
    }

    public boolean isSuccess() {
        if (this.statusCode > 0) goto L6;
        return true;
    L6:
        return false;
    }

    public void setIntent(Intent r1) {
        this.intent = r1;
    }

    public void setPendingIntent(PendingIntent r1) {
        this.pendingIntent = r1;
    }

    public void startResolutionForResult(Activity r9, int r10) throws IntentSender.SendIntentException {
        if (hasResolution() == false) goto L10;
        PendingIntent r02 = this.pendingIntent;
        if (r02 == null) goto L8;
        r9.startIntentSenderForResult(r02.getIntentSender(), r10, null, 0, 0, 0);
        return;
    L8:
        r9.startActivityForResult(this.intent, r10);
        return;
    }

    public String toString() {
        return "{statusCode: " + this.statusCode + ", statusMessage: " + this.statusMessage + ", pendingIntent: " + this.pendingIntent + ", intent: " + this.intent + ",}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r2, int r3) {
        r2.writeInt(this.statusCode);
        r2.writeString(this.statusMessage);
        PendingIntent r02 = this.pendingIntent;
        if (r02 == null) goto L5;
        r02.writeToParcel(r2, r3);
    L5:
        PendingIntent.writePendingIntentOrNullToParcel(this.pendingIntent, r2);
        Intent r03 = this.intent;
        if (r03 == null) goto L9;
        r03.writeToParcel(r2, r3);
        return;
    }

    public Status(int r1, String r2) {
        this.statusCode = r1;
        this.statusMessage = r2;
    }

    public Status(int r1, String r2, PendingIntent r3) {
        this.statusCode = r1;
        this.statusMessage = r2;
        this.pendingIntent = r3;
    }

    public Status(int r1, String r2, Intent r3) {
        this.statusCode = r1;
        this.statusMessage = r2;
        this.intent = r3;
    }
}
