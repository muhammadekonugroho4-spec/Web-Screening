package com.google.firebase.sessions;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsData;", "", "sessionId", "", "(Ljava/lang/String;)V", "getSessionId", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FirebaseSessionsData {
    private final String sessionId;

    public FirebaseSessionsData(String r1) {
        this.sessionId = r1;
    }

    public static /* synthetic */ FirebaseSessionsData copy$default(FirebaseSessionsData r02, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r02.sessionId;
    L6:
        return r02.copy(r1);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final FirebaseSessionsData copy(String r2) {
        return new FirebaseSessionsData(r2);
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof FirebaseSessionsData) == true) goto L9;
        return false;
    L9:
        if (p.g(this.sessionId, ((FirebaseSessionsData) r4).sessionId) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        String r02 = this.sessionId;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "FirebaseSessionsData(sessionId=" + this.sessionId + ')';
    }
}
