package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.TokenResult;

/* loaded from: classes6.dex */
final class AutoValue_TokenResult extends TokenResult {
    private final TokenResult.ResponseCode responseCode;
    private final String token;
    private final long tokenExpirationTimestamp;

    /* renamed from: com.google.firebase.installations.remote.AutoValue_TokenResult$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder extends TokenResult.Builder {
        private TokenResult.ResponseCode responseCode;
        private String token;
        private Long tokenExpirationTimestamp;

        public /* synthetic */ Builder(TokenResult r1, AnonymousClass1 r2) {
            this(r1);
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult build() {
            String r1 = "";
            if (this.tokenExpirationTimestamp != null) goto L6;
            r1 = " tokenExpirationTimestamp";
        L6:
            if (r1.isEmpty() == false) goto L10;
            return new AutoValue_TokenResult(this.token, this.tokenExpirationTimestamp.longValue(), this.responseCode, null);
        L10:
            throw new IllegalStateException("Missing required properties:" + r1);
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult.Builder setResponseCode(TokenResult.ResponseCode r1) {
            this.responseCode = r1;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult.Builder setToken(String r1) {
            this.token = r1;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult.Builder setTokenExpirationTimestamp(long r1) {
            this.tokenExpirationTimestamp = Long.valueOf(r1);
            return this;
        }

        public Builder() {
        }

        private Builder(TokenResult r3) {
            this.token = r3.getToken();
            this.tokenExpirationTimestamp = Long.valueOf(r3.getTokenExpirationTimestamp());
            this.responseCode = r3.getResponseCode();
        }
    }

    public /* synthetic */ AutoValue_TokenResult(String r1, long r2, TokenResult.ResponseCode r4, AnonymousClass1 r5) {
        this(r1, r2, r4);
    }

    public boolean equals(Object r8) {
        if (r8 != this) goto L6;
        return true;
    L6:
        if ((r8 instanceof TokenResult) == false) goto L24;
        TokenResult r82 = (TokenResult) r8;
        String r1 = this.token;
        if (r1 != null) goto L13;
        if (r82.getToken() != null) goto L24;
    L15:
        if (this.tokenExpirationTimestamp != r82.getTokenExpirationTimestamp()) goto L24;
        TokenResult.ResponseCode r12 = this.responseCode;
        if (r12 != null) goto L22;
        if (r82.getResponseCode() != null) goto L24;
    L23:
        return true;
    L22:
        if (r12.equals(r82.getResponseCode()) == false) goto L24;
    L13:
        if (r1.equals(r82.getToken()) == true) goto L15;
    L24:
        return false;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public TokenResult.ResponseCode getResponseCode() {
        return this.responseCode;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public String getToken() {
        return this.token;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public long getTokenExpirationTimestamp() {
        return this.tokenExpirationTimestamp;
    }

    public int hashCode() {
        String r02 = this.token;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        long r3 = this.tokenExpirationTimestamp;
        int r04 = (((r03 ^ 1000003) * 1000003) ^ ((int) (r3 ^ (r3 >>> 32)))) * 1000003;
        TokenResult.ResponseCode r2 = this.responseCode;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 ^ r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public TokenResult.Builder toBuilder() {
        return new Builder(this, null);
    }

    public String toString() {
        return "TokenResult{token=" + this.token + ", tokenExpirationTimestamp=" + this.tokenExpirationTimestamp + ", responseCode=" + this.responseCode + "}";
    }

    private AutoValue_TokenResult(String r1, long r2, TokenResult.ResponseCode r4) {
        this.token = r1;
        this.tokenExpirationTimestamp = r2;
        this.responseCode = r4;
    }
}
