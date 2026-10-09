package com.google.firebase.installations;

import com.google.firebase.installations.InstallationTokenResult;

/* loaded from: classes6.dex */
final class AutoValue_InstallationTokenResult extends InstallationTokenResult {
    private final String token;
    private final long tokenCreationTimestamp;
    private final long tokenExpirationTimestamp;

    /* renamed from: com.google.firebase.installations.AutoValue_InstallationTokenResult$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder extends InstallationTokenResult.Builder {
        private String token;
        private Long tokenCreationTimestamp;
        private Long tokenExpirationTimestamp;

        public /* synthetic */ Builder(InstallationTokenResult r1, AnonymousClass1 r2) {
            this(r1);
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult build() {
            String r1 = "";
            if (this.token != null) goto L6;
            r1 = " token";
        L6:
            if (this.tokenExpirationTimestamp != null) goto L9;
            r1 = r1 + " tokenExpirationTimestamp";
        L9:
            if (this.tokenCreationTimestamp != null) goto L12;
            r1 = r1 + " tokenCreationTimestamp";
        L12:
            if (r1.isEmpty() == false) goto L16;
            return new AutoValue_InstallationTokenResult(this.token, this.tokenExpirationTimestamp.longValue(), this.tokenCreationTimestamp.longValue(), null);
        L16:
            throw new IllegalStateException("Missing required properties:" + r1);
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setToken(String r2) {
            if (r2 == null) goto L6;
            this.token = r2;
            return this;
        L6:
            throw new NullPointerException("Null token");
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setTokenCreationTimestamp(long r1) {
            this.tokenCreationTimestamp = Long.valueOf(r1);
            return this;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setTokenExpirationTimestamp(long r1) {
            this.tokenExpirationTimestamp = Long.valueOf(r1);
            return this;
        }

        public Builder() {
        }

        private Builder(InstallationTokenResult r3) {
            this.token = r3.getToken();
            this.tokenExpirationTimestamp = Long.valueOf(r3.getTokenExpirationTimestamp());
            this.tokenCreationTimestamp = Long.valueOf(r3.getTokenCreationTimestamp());
        }
    }

    public /* synthetic */ AutoValue_InstallationTokenResult(String r1, long r2, long r4, AnonymousClass1 r6) {
        this(r1, r2, r4);
    }

    public boolean equals(Object r8) {
        if (r8 != this) goto L6;
        return true;
    L6:
        if ((r8 instanceof InstallationTokenResult) == false) goto L14;
        InstallationTokenResult r82 = (InstallationTokenResult) r8;
        if (this.token.equals(r82.getToken()) == false) goto L14;
        if (this.tokenExpirationTimestamp != r82.getTokenExpirationTimestamp()) goto L14;
        if (this.tokenCreationTimestamp != r82.getTokenCreationTimestamp()) goto L14;
        return true;
    L14:
        return false;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public String getToken() {
        return this.token;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public long getTokenCreationTimestamp() {
        return this.tokenCreationTimestamp;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public long getTokenExpirationTimestamp() {
        return this.tokenExpirationTimestamp;
    }

    public int hashCode() {
        int r02 = (this.token.hashCode() ^ 1000003) * 1000003;
        long r2 = this.tokenExpirationTimestamp;
        long r1 = this.tokenCreationTimestamp;
        return ((r02 ^ ((int) (r2 ^ (r2 >>> 32)))) * 1000003) ^ ((int) (r1 ^ (r1 >>> 32)));
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public InstallationTokenResult.Builder toBuilder() {
        return new Builder(this, null);
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.token + ", tokenExpirationTimestamp=" + this.tokenExpirationTimestamp + ", tokenCreationTimestamp=" + this.tokenCreationTimestamp + "}";
    }

    private AutoValue_InstallationTokenResult(String r1, long r2, long r4) {
        this.token = r1;
        this.tokenExpirationTimestamp = r2;
        this.tokenCreationTimestamp = r4;
    }
}
