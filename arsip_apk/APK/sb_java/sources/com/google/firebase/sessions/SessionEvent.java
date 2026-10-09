package com.google.firebase.sessions;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.encoders.annotations.Encodable;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/google/firebase/sessions/SessionEvent;", "", "eventType", "Lcom/google/firebase/sessions/EventType;", "sessionData", "Lcom/google/firebase/sessions/SessionInfo;", "applicationInfo", "Lcom/google/firebase/sessions/ApplicationInfo;", "(Lcom/google/firebase/sessions/EventType;Lcom/google/firebase/sessions/SessionInfo;Lcom/google/firebase/sessions/ApplicationInfo;)V", "getApplicationInfo", "()Lcom/google/firebase/sessions/ApplicationInfo;", "getEventType", "()Lcom/google/firebase/sessions/EventType;", "getSessionData", "()Lcom/google/firebase/sessions/SessionInfo;", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Encodable
/* loaded from: classes6.dex */
public final class SessionEvent {
    private final ApplicationInfo applicationInfo;
    private final EventType eventType;
    private final SessionInfo sessionData;

    public SessionEvent(EventType r2, SessionInfo r3, ApplicationInfo r4) {
        p.l(r2, "eventType");
        p.l(r3, "sessionData");
        p.l(r4, "applicationInfo");
        this.eventType = r2;
        this.sessionData = r3;
        this.applicationInfo = r4;
    }

    public static /* synthetic */ SessionEvent copy$default(SessionEvent r02, EventType r1, SessionInfo r2, ApplicationInfo r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.eventType;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.sessionData;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.applicationInfo;
    L12:
        return r02.copy(r1, r2, r3);
    }

    public final EventType component1() {
        return this.eventType;
    }

    public final SessionInfo component2() {
        return this.sessionData;
    }

    public final ApplicationInfo component3() {
        return this.applicationInfo;
    }

    public final SessionEvent copy(EventType r2, SessionInfo r3, ApplicationInfo r4) {
        p.l(r2, "eventType");
        p.l(r3, "sessionData");
        p.l(r4, "applicationInfo");
        return new SessionEvent(r2, r3, r4);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SessionEvent) == true) goto L8;
        return false;
    L8:
        SessionEvent r52 = (SessionEvent) r5;
        if (this.eventType == r52.eventType) goto L12;
        return false;
    L12:
        if (p.g(this.sessionData, r52.sessionData) == true) goto L15;
        return false;
    L15:
        if (p.g(this.applicationInfo, r52.applicationInfo) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final ApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    public final EventType getEventType() {
        return this.eventType;
    }

    public final SessionInfo getSessionData() {
        return this.sessionData;
    }

    public int hashCode() {
        return (((this.eventType.hashCode() * 31) + this.sessionData.hashCode()) * 31) + this.applicationInfo.hashCode();
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.eventType + ", sessionData=" + this.sessionData + ", applicationInfo=" + this.applicationInfo + ')';
    }
}
