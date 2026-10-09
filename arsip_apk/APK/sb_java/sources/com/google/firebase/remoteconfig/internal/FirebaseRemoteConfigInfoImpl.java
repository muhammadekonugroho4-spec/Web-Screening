package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

/* loaded from: classes6.dex */
public class FirebaseRemoteConfigInfoImpl implements FirebaseRemoteConfigInfo {
    private final FirebaseRemoteConfigSettings configSettings;
    private final int lastFetchStatus;
    private final long lastSuccessfulFetchTimeInMillis;

    /* renamed from: com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigInfoImpl$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {
        private FirebaseRemoteConfigSettings builderConfigSettings;
        private int builderLastFetchStatus;
        private long builderLastSuccessfulFetchTimeInMillis;

        public /* synthetic */ Builder(AnonymousClass1 r1) {
            this();
        }

        public FirebaseRemoteConfigInfoImpl build() {
            return new FirebaseRemoteConfigInfoImpl(this.builderLastSuccessfulFetchTimeInMillis, this.builderLastFetchStatus, this.builderConfigSettings, null);
        }

        public Builder withConfigSettings(FirebaseRemoteConfigSettings r1) {
            this.builderConfigSettings = r1;
            return this;
        }

        public Builder withLastFetchStatus(int r1) {
            this.builderLastFetchStatus = r1;
            return this;
        }

        public Builder withLastSuccessfulFetchTimeInMillis(long r1) {
            this.builderLastSuccessfulFetchTimeInMillis = r1;
            return this;
        }

        private Builder() {
        }
    }

    public /* synthetic */ FirebaseRemoteConfigInfoImpl(long r1, int r3, FirebaseRemoteConfigSettings r4, AnonymousClass1 r5) {
        this(r1, r3, r4);
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public FirebaseRemoteConfigSettings getConfigSettings() {
        return this.configSettings;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public long getFetchTimeMillis() {
        return this.lastSuccessfulFetchTimeInMillis;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public int getLastFetchStatus() {
        return this.lastFetchStatus;
    }

    private FirebaseRemoteConfigInfoImpl(long r1, int r3, FirebaseRemoteConfigSettings r4) {
        this.lastSuccessfulFetchTimeInMillis = r1;
        this.lastFetchStatus = r3;
        this.configSettings = r4;
    }
}
