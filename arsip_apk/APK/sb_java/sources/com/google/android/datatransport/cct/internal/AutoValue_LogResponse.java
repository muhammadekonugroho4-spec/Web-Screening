package com.google.android.datatransport.cct.internal;

/* loaded from: classes4.dex */
final class AutoValue_LogResponse extends LogResponse {
    private final long nextRequestWaitMillis;

    public AutoValue_LogResponse(long r1) {
        this.nextRequestWaitMillis = r1;
    }

    public boolean equals(Object r8) {
        if (r8 != this) goto L6;
        return true;
    L6:
        if ((r8 instanceof LogResponse) == true) goto L8;
    L10:
        return false;
    L8:
        if (this.nextRequestWaitMillis != ((LogResponse) r8).getNextRequestWaitMillis()) goto L10;
        return true;
    }

    @Override // com.google.android.datatransport.cct.internal.LogResponse
    public long getNextRequestWaitMillis() {
        return this.nextRequestWaitMillis;
    }

    public int hashCode() {
        long r02 = this.nextRequestWaitMillis;
        return ((int) (r02 ^ (r02 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.nextRequestWaitMillis + "}";
    }
}
