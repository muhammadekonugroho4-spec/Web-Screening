package com.google.firebase.sessions;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/google/firebase/sessions/SessionDetails;", "", "sessionId", "", "firstSessionId", "sessionIndex", "", "sessionStartTimestampUs", "", "(Ljava/lang/String;Ljava/lang/String;IJ)V", "getFirstSessionId", "()Ljava/lang/String;", "getSessionId", "getSessionIndex", "()I", "getSessionStartTimestampUs", "()J", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SessionDetails {
    private final String firstSessionId;
    private final String sessionId;
    private final int sessionIndex;
    private final long sessionStartTimestampUs;

    public SessionDetails(String r2, String r3, int r4, long r5) {
        p.l(r2, "sessionId");
        p.l(r3, "firstSessionId");
        this.sessionId = r2;
        this.firstSessionId = r3;
        this.sessionIndex = r4;
        this.sessionStartTimestampUs = r5;
    }

    public static /* synthetic */ SessionDetails copy$default(SessionDetails r02, String r1, String r2, int r3, long r4, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r02.sessionId;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r02.firstSessionId;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r02.sessionIndex;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r4 = r02.sessionStartTimestampUs;
    L14:
        long r62 = r4;
        int r5 = r3;
        String r32 = r1;
        return r02.copy(r32, r2, r5, r62);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final String component2() {
        return this.firstSessionId;
    }

    public final int component3() {
        return this.sessionIndex;
    }

    public final long component4() {
        return this.sessionStartTimestampUs;
    }

    public final SessionDetails copy(String r8, String r9, int r10, long r11) {
        p.l(r8, "sessionId");
        p.l(r9, "firstSessionId");
        return new SessionDetails(r8, r9, r10, r11);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof SessionDetails) == true) goto L8;
        return false;
    L8:
        SessionDetails r82 = (SessionDetails) r8;
        if (p.g(this.sessionId, r82.sessionId) == true) goto L12;
        return false;
    L12:
        if (p.g(this.firstSessionId, r82.firstSessionId) == true) goto L15;
        return false;
    L15:
        if (this.sessionIndex == r82.sessionIndex) goto L18;
        return false;
    L18:
        if (this.sessionStartTimestampUs == r82.sessionStartTimestampUs) goto L20;
        return false;
    L20:
        return true;
    }

    public final String getFirstSessionId() {
        return this.firstSessionId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getSessionIndex() {
        return this.sessionIndex;
    }

    public final long getSessionStartTimestampUs() {
        return this.sessionStartTimestampUs;
    }

    public int hashCode() {
        return (((((this.sessionId.hashCode() * 31) + this.firstSessionId.hashCode()) * 31) + Integer.hashCode(this.sessionIndex)) * 31) + Long.hashCode(this.sessionStartTimestampUs);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.sessionId + ", firstSessionId=" + this.firstSessionId + ", sessionIndex=" + this.sessionIndex + ", sessionStartTimestampUs=" + this.sessionStartTimestampUs + ')';
    }
}
