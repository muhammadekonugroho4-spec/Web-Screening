package com.google.firebase.perf.v1;

import com.google.protobuf.Internal;

/* loaded from: classes6.dex */
public enum SessionVerbosity extends Enum<SessionVerbosity> implements Internal.EnumLite {
    private static final /* synthetic */ SessionVerbosity[] $VALUES = null;
    public static final SessionVerbosity GAUGES_AND_SYSTEM_EVENTS = null;
    public static final int GAUGES_AND_SYSTEM_EVENTS_VALUE = 1;
    public static final SessionVerbosity SESSION_VERBOSITY_NONE = null;
    public static final int SESSION_VERBOSITY_NONE_VALUE = 0;
    private static final Internal.EnumLiteMap<SessionVerbosity> internalValueMap = null;
    private final int value;

    public static final class SessionVerbosityVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        static {
            INSTANCE = new SessionVerbosityVerifier();
        }

        private SessionVerbosityVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (SessionVerbosity.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    private static /* synthetic */ SessionVerbosity[] $values() {
        return new SessionVerbosity[]{SESSION_VERBOSITY_NONE, GAUGES_AND_SYSTEM_EVENTS};
    }

    static {
        SESSION_VERBOSITY_NONE = new SessionVerbosity("SESSION_VERBOSITY_NONE", 0, 0);
        GAUGES_AND_SYSTEM_EVENTS = new SessionVerbosity("GAUGES_AND_SYSTEM_EVENTS", 1, 1);
        $VALUES = $values();
        internalValueMap = new AnonymousClass1();
    }

    SessionVerbosity(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static SessionVerbosity forNumber(int r1) {
        if (r1 == 0) goto L10;
        if (r1 == 1) goto L8;
        return null;
    L8:
        return GAUGES_AND_SYSTEM_EVENTS;
    L10:
        return SESSION_VERBOSITY_NONE;
    }

    public static Internal.EnumLiteMap<SessionVerbosity> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return SessionVerbosityVerifier.INSTANCE;
    }

    public static SessionVerbosity valueOf(String r1) {
        return (SessionVerbosity) Enum.valueOf(SessionVerbosity.class, r1);
    }

    public static SessionVerbosity[] values() {
        return (SessionVerbosity[]) $VALUES.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static SessionVerbosity valueOf(int r02) {
        return forNumber(r02);
    }
}
