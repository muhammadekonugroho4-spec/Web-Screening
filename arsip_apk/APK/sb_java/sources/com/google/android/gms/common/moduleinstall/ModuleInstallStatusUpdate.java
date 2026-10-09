package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class(creator = "ModuleInstallStatusUpdateCreator")
/* loaded from: classes5.dex */
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = null;

    @SafeParcelable.Field(getter = "getSessionId", id = 1)
    private final int zaa;

    @InstallState
    @SafeParcelable.Field(getter = "getInstallState", id = 2)
    private final int zab;

    @SafeParcelable.Field(getter = "getBytesDownloaded", id = 3)
    private final Long zac;

    @SafeParcelable.Field(getter = "getTotalBytesToDownload", id = 4)
    private final Long zad;

    @SafeParcelable.Field(getter = "getErrorCode", id = 5)
    private final int zae;
    private final ProgressInfo zaf;

    @Retention(RetentionPolicy.CLASS)
    public @interface InstallState {
        public static final int STATE_CANCELED = 3;
        public static final int STATE_COMPLETED = 4;
        public static final int STATE_DOWNLOADING = 2;
        public static final int STATE_DOWNLOAD_PAUSED = 7;
        public static final int STATE_FAILED = 5;
        public static final int STATE_INSTALLING = 6;
        public static final int STATE_PENDING = 1;
        public static final int STATE_UNKNOWN = 0;
    }

    public static class ProgressInfo {
        private final long zaa;
        private final long zab;

        public ProgressInfo(long r1, long r3) {
            Preconditions.checkNotZero(r3);
            this.zaa = r1;
            this.zab = r3;
        }

        public long getBytesDownloaded() {
            return this.zaa;
        }

        public long getTotalBytesToDownload() {
            return this.zab;
        }
    }

    static {
        CREATOR = new zae();
    }

    @SafeParcelable.Constructor
    @KeepForSdk
    public ModuleInstallStatusUpdate(@SafeParcelable.Param(id = 1) int r3, @SafeParcelable.Param(id = 2) @InstallState int r4, @SafeParcelable.Param(id = 3) Long r5, @SafeParcelable.Param(id = 4) Long r6, @SafeParcelable.Param(id = 5) int r7) {
        this.zaa = r3;
        this.zab = r4;
        this.zac = r5;
        this.zad = r6;
        this.zae = r7;
        if (r5 == null) goto L10;
        if (r6 == null) goto L10;
        if (r6.longValue() == 0) goto L10;
        ProgressInfo r32 = new ProgressInfo(r5.longValue(), r6.longValue());
    L8:
        this.zaf = r32;
        return;
    L10:
        r32 = null;
        goto L8
    }

    public int getErrorCode() {
        return this.zae;
    }

    @InstallState
    public int getInstallState() {
        return this.zab;
    }

    public ProgressInfo getProgressInfo() {
        return this.zaf;
    }

    public int getSessionId() {
        return this.zaa;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r4, int r5) {
        int r52 = SafeParcelWriter.beginObjectHeader(r4);
        SafeParcelWriter.writeInt(r4, 1, getSessionId());
        SafeParcelWriter.writeInt(r4, 2, getInstallState());
        SafeParcelWriter.writeLongObject(r4, 3, this.zac, false);
        SafeParcelWriter.writeLongObject(r4, 4, this.zad, false);
        SafeParcelWriter.writeInt(r4, 5, getErrorCode());
        SafeParcelWriter.finishObjectHeader(r4, r52);
    }
}
