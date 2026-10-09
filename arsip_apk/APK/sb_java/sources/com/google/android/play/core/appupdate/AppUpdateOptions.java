package com.google.android.play.core.appupdate;

import com.google.android.play.core.install.model.AppUpdateType;

/* loaded from: classes5.dex */
public abstract class AppUpdateOptions {

    public static abstract class Builder {
        public Builder() {
        }

        public abstract AppUpdateOptions build();

        public abstract Builder setAllowAssetPackDeletion(boolean r1);

        public abstract Builder setAppUpdateType(@AppUpdateType int r1);
    }

    public AppUpdateOptions() {
    }

    public static AppUpdateOptions defaultOptions(@AppUpdateType int r02) {
        return newBuilder(r02).build();
    }

    public static Builder newBuilder(@AppUpdateType int r1) {
        zzv r02 = new zzv();
        r02.setAppUpdateType(r1);
        r02.setAllowAssetPackDeletion(false);
        return r02;
    }

    public abstract boolean allowAssetPackDeletion();

    @AppUpdateType
    public abstract int appUpdateType();
}
