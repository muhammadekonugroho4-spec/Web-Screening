package com.google.firebase.sessions.api;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0002\u000e\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/google/firebase/sessions/api/SessionSubscriber;", "", "Lcom/google/firebase/sessions/api/SessionSubscriber$SessionDetails;", "sessionDetails", "Lkotlin/w;", "onSessionChanged", "(Lcom/google/firebase/sessions/api/SessionSubscriber$SessionDetails;)V", "", "isDataCollectionEnabled", "()Z", "Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "getSessionSubscriberName", "()Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "sessionSubscriberName", Constants.KEY_ENCRYPTION_NAME, "SessionDetails", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SessionSubscriber {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "", "(Ljava/lang/String;I)V", "CRASHLYTICS", "PERFORMANCE", "MATT_SAYS_HI", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Name extends Enum<Name> {
        private static final /* synthetic */ Name[] $VALUES = null;
        public static final Name CRASHLYTICS = null;
        public static final Name MATT_SAYS_HI = null;
        public static final Name PERFORMANCE = null;

        private static final /* synthetic */ Name[] $values() {
            return new Name[]{CRASHLYTICS, PERFORMANCE, MATT_SAYS_HI};
        }

        static {
            CRASHLYTICS = new Name("CRASHLYTICS", 0);
            PERFORMANCE = new Name("PERFORMANCE", 1);
            MATT_SAYS_HI = new Name("MATT_SAYS_HI", 2);
            $VALUES = $values();
        }

        Name(String r1, int r2) {
        }

        public static Name valueOf(String r1) {
            return (Name) Enum.valueOf(Name.class, r1);
        }

        public static Name[] values() {
            return (Name[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/google/firebase/sessions/api/SessionSubscriber$SessionDetails;", "", "sessionId", "", "(Ljava/lang/String;)V", "getSessionId", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SessionDetails {
        private final String sessionId;

        public SessionDetails(String r2) {
            p.l(r2, "sessionId");
            this.sessionId = r2;
        }

        public static /* synthetic */ SessionDetails copy$default(SessionDetails r02, String r1, int r2, Object r3) {
            if ((r2 & 1) == 0) goto L6;
            r1 = r02.sessionId;
        L6:
            return r02.copy(r1);
        }

        public final String component1() {
            return this.sessionId;
        }

        public final SessionDetails copy(String r2) {
            p.l(r2, "sessionId");
            return new SessionDetails(r2);
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof SessionDetails) == true) goto L9;
            return false;
        L9:
            if (p.g(this.sessionId, ((SessionDetails) r4).sessionId) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        public int hashCode() {
            return this.sessionId.hashCode();
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.sessionId + ')';
        }
    }

    Name getSessionSubscriberName();

    boolean isDataCollectionEnabled();

    void onSessionChanged(SessionDetails r1);
}
