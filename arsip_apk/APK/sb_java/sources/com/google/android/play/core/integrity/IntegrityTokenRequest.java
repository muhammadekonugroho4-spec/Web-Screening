package com.google.android.play.core.integrity;

/* loaded from: classes5.dex */
public abstract class IntegrityTokenRequest {

    public static abstract class Builder {
        public Builder() {
        }

        public abstract IntegrityTokenRequest build();

        public abstract Builder setCloudProjectNumber(long r1);

        public abstract Builder setNonce(String r1);
    }

    public IntegrityTokenRequest() {
    }

    public static Builder builder() {
        return new am();
    }

    public abstract Long cloudProjectNumber();

    public abstract String nonce();
}
