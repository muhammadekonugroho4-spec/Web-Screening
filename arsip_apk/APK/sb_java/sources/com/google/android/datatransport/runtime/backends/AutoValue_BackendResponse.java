package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.BackendResponse;

/* loaded from: classes4.dex */
final class AutoValue_BackendResponse extends BackendResponse {
    private final long nextRequestWaitMillis;
    private final BackendResponse.Status status;

    public AutoValue_BackendResponse(BackendResponse.Status r1, long r2) {
        if (r1 == null) goto L7;
        this.status = r1;
        this.nextRequestWaitMillis = r2;
        return;
    L7:
        throw new NullPointerException("Null status");
    }

    public boolean equals(Object r8) {
        if (r8 != this) goto L6;
        return true;
    L6:
        if ((r8 instanceof BackendResponse) == false) goto L12;
        BackendResponse r82 = (BackendResponse) r8;
        if (this.status.equals(r82.getStatus()) == false) goto L12;
        if (this.nextRequestWaitMillis != r82.getNextRequestWaitMillis()) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public long getNextRequestWaitMillis() {
        return this.nextRequestWaitMillis;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public BackendResponse.Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int r02 = (this.status.hashCode() ^ 1000003) * 1000003;
        long r1 = this.nextRequestWaitMillis;
        return r02 ^ ((int) (r1 ^ (r1 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.status + ", nextRequestWaitMillis=" + this.nextRequestWaitMillis + "}";
    }
}
