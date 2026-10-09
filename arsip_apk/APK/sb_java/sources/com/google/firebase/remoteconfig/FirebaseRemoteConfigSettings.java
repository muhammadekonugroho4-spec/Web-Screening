package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;

/* loaded from: classes6.dex */
public class FirebaseRemoteConfigSettings {
    private final long fetchTimeoutInSeconds;
    private final long minimumFetchInterval;

    /* renamed from: com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {
        private long fetchTimeoutInSeconds;
        private long minimumFetchInterval;

        public Builder() {
            this.fetchTimeoutInSeconds = 60;
            this.minimumFetchInterval = ConfigFetchHandler.DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS;
        }

        public static /* synthetic */ long access$000(Builder r2) {
            return r2.fetchTimeoutInSeconds;
        }

        public static /* synthetic */ long access$100(Builder r2) {
            return r2.minimumFetchInterval;
        }

        public FirebaseRemoteConfigSettings build() {
            return new FirebaseRemoteConfigSettings(this, null);
        }

        public long getFetchTimeoutInSeconds() {
            return this.fetchTimeoutInSeconds;
        }

        public long getMinimumFetchIntervalInSeconds() {
            return this.minimumFetchInterval;
        }

        public Builder setFetchTimeoutInSeconds(long r3) throws IllegalArgumentException {
            if (r3 < 0) goto L7;
            this.fetchTimeoutInSeconds = r3;
            return this;
        L7:
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", new Object[]{Long.valueOf(r3)}));
        }

        public Builder setMinimumFetchIntervalInSeconds(long r4) {
            if (r4 < 0) goto L7;
            this.minimumFetchInterval = r4;
            return this;
        L7:
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + r4 + " is an invalid argument");
        }
    }

    public /* synthetic */ FirebaseRemoteConfigSettings(Builder r1, AnonymousClass1 r2) {
        this(r1);
    }

    public long getFetchTimeoutInSeconds() {
        return this.fetchTimeoutInSeconds;
    }

    public long getMinimumFetchIntervalInSeconds() {
        return this.minimumFetchInterval;
    }

    public Builder toBuilder() {
        Builder r02 = new Builder();
        r02.setFetchTimeoutInSeconds(getFetchTimeoutInSeconds());
        r02.setMinimumFetchIntervalInSeconds(getMinimumFetchIntervalInSeconds());
        return r02;
    }

    private FirebaseRemoteConfigSettings(Builder r3) {
        this.fetchTimeoutInSeconds = Builder.access$000(r3);
        this.minimumFetchInterval = Builder.access$100(r3);
    }
}
