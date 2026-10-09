package com.google.firebase.sessions;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lcom/google/firebase/sessions/SessionInfo;", "", "sessionId", "", "firstSessionId", "sessionIndex", "", "eventTimestampUs", "", "dataCollectionStatus", "Lcom/google/firebase/sessions/DataCollectionStatus;", "firebaseInstallationId", "firebaseAuthenticationToken", "(Ljava/lang/String;Ljava/lang/String;IJLcom/google/firebase/sessions/DataCollectionStatus;Ljava/lang/String;Ljava/lang/String;)V", "getDataCollectionStatus", "()Lcom/google/firebase/sessions/DataCollectionStatus;", "getEventTimestampUs", "()J", "getFirebaseAuthenticationToken", "()Ljava/lang/String;", "getFirebaseInstallationId", "getFirstSessionId", "getSessionId", "getSessionIndex", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SessionInfo {
    private final DataCollectionStatus dataCollectionStatus;
    private final long eventTimestampUs;
    private final String firebaseAuthenticationToken;
    private final String firebaseInstallationId;
    private final String firstSessionId;
    private final String sessionId;
    private final int sessionIndex;

    public SessionInfo(String r2, String r3, int r4, long r5, DataCollectionStatus r7, String r8, String r9) {
        p.l(r2, "sessionId");
        p.l(r3, "firstSessionId");
        p.l(r7, "dataCollectionStatus");
        p.l(r8, "firebaseInstallationId");
        p.l(r9, "firebaseAuthenticationToken");
        this.sessionId = r2;
        this.firstSessionId = r3;
        this.sessionIndex = r4;
        this.eventTimestampUs = r5;
        this.dataCollectionStatus = r7;
        this.firebaseInstallationId = r8;
        this.firebaseAuthenticationToken = r9;
    }

    public static /* synthetic */ SessionInfo copy$default(SessionInfo r02, String r1, String r2, int r3, long r4, DataCollectionStatus r6, String r7, String r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r02.sessionId;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r02.firstSessionId;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r3 = r02.sessionIndex;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r4 = r02.eventTimestampUs;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = r02.dataCollectionStatus;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = r02.firebaseInstallationId;
    L21:
        if ((r9 & 64) == 0) goto L23;
        r8 = r02.firebaseAuthenticationToken;
    L23:
        String r102 = r8;
        DataCollectionStatus r82 = r6;
        long r62 = r4;
        String r42 = r2;
        int r5 = r3;
        String r32 = r1;
        return r02.copy(r32, r42, r5, r62, r82, r7, r102);
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
        return this.eventTimestampUs;
    }

    public final DataCollectionStatus component5() {
        return this.dataCollectionStatus;
    }

    public final String component6() {
        return this.firebaseInstallationId;
    }

    public final String component7() {
        return this.firebaseAuthenticationToken;
    }

    public final SessionInfo copy(String r11, String r12, int r13, long r14, DataCollectionStatus r16, String r17, String r18) {
        p.l(r11, "sessionId");
        p.l(r12, "firstSessionId");
        p.l(r16, "dataCollectionStatus");
        p.l(r17, "firebaseInstallationId");
        p.l(r18, "firebaseAuthenticationToken");
        return new SessionInfo(r11, r12, r13, r14, r16, r17, r18);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof SessionInfo) == true) goto L8;
        return false;
    L8:
        SessionInfo r82 = (SessionInfo) r8;
        if (p.g(this.sessionId, r82.sessionId) == true) goto L12;
        return false;
    L12:
        if (p.g(this.firstSessionId, r82.firstSessionId) == true) goto L15;
        return false;
    L15:
        if (this.sessionIndex == r82.sessionIndex) goto L18;
        return false;
    L18:
        if (this.eventTimestampUs == r82.eventTimestampUs) goto L21;
        return false;
    L21:
        if (p.g(this.dataCollectionStatus, r82.dataCollectionStatus) == true) goto L24;
        return false;
    L24:
        if (p.g(this.firebaseInstallationId, r82.firebaseInstallationId) == true) goto L27;
        return false;
    L27:
        if (p.g(this.firebaseAuthenticationToken, r82.firebaseAuthenticationToken) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final DataCollectionStatus getDataCollectionStatus() {
        return this.dataCollectionStatus;
    }

    public final long getEventTimestampUs() {
        return this.eventTimestampUs;
    }

    public final String getFirebaseAuthenticationToken() {
        return this.firebaseAuthenticationToken;
    }

    public final String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
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

    public int hashCode() {
        return (((((((((((this.sessionId.hashCode() * 31) + this.firstSessionId.hashCode()) * 31) + Integer.hashCode(this.sessionIndex)) * 31) + Long.hashCode(this.eventTimestampUs)) * 31) + this.dataCollectionStatus.hashCode()) * 31) + this.firebaseInstallationId.hashCode()) * 31) + this.firebaseAuthenticationToken.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.sessionId + ", firstSessionId=" + this.firstSessionId + ", sessionIndex=" + this.sessionIndex + ", eventTimestampUs=" + this.eventTimestampUs + ", dataCollectionStatus=" + this.dataCollectionStatus + ", firebaseInstallationId=" + this.firebaseInstallationId + ", firebaseAuthenticationToken=" + this.firebaseAuthenticationToken + ')';
    }
}
