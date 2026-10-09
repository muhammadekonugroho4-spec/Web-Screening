package com.google.firebase.perf.config;

/* loaded from: classes6.dex */
abstract class ConfigurationFlag<T> {
    public ConfigurationFlag() {
    }

    public abstract T getDefault();

    public T getDefaultOnRcFetchFail() {
        return getDefault();
    }

    public String getDeviceCacheFlag() {
        return null;
    }

    public String getMetadataFlag() {
        return null;
    }

    public String getRemoteConfigFlag() {
        return null;
    }
}
