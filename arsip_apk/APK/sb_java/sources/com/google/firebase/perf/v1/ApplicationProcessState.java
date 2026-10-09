package com.google.firebase.perf.v1;

import com.google.protobuf.Internal;

/* loaded from: classes6.dex */
public enum ApplicationProcessState extends Enum<ApplicationProcessState> implements Internal.EnumLite {
    private static final /* synthetic */ ApplicationProcessState[] $VALUES = null;
    public static final ApplicationProcessState APPLICATION_PROCESS_STATE_UNKNOWN = null;
    public static final int APPLICATION_PROCESS_STATE_UNKNOWN_VALUE = 0;
    public static final ApplicationProcessState BACKGROUND = null;
    public static final int BACKGROUND_VALUE = 2;
    public static final ApplicationProcessState FOREGROUND = null;
    public static final ApplicationProcessState FOREGROUND_BACKGROUND = null;
    public static final int FOREGROUND_BACKGROUND_VALUE = 3;
    public static final int FOREGROUND_VALUE = 1;
    private static final Internal.EnumLiteMap<ApplicationProcessState> internalValueMap = null;
    private final int value;

    public static final class ApplicationProcessStateVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        static {
            INSTANCE = new ApplicationProcessStateVerifier();
        }

        private ApplicationProcessStateVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (ApplicationProcessState.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    private static /* synthetic */ ApplicationProcessState[] $values() {
        return new ApplicationProcessState[]{APPLICATION_PROCESS_STATE_UNKNOWN, FOREGROUND, BACKGROUND, FOREGROUND_BACKGROUND};
    }

    static {
        APPLICATION_PROCESS_STATE_UNKNOWN = new ApplicationProcessState("APPLICATION_PROCESS_STATE_UNKNOWN", 0, 0);
        FOREGROUND = new ApplicationProcessState("FOREGROUND", 1, 1);
        BACKGROUND = new ApplicationProcessState("BACKGROUND", 2, 2);
        FOREGROUND_BACKGROUND = new ApplicationProcessState("FOREGROUND_BACKGROUND", 3, 3);
        $VALUES = $values();
        internalValueMap = new AnonymousClass1();
    }

    ApplicationProcessState(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static ApplicationProcessState forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return FOREGROUND_BACKGROUND;
    L14:
        return BACKGROUND;
    L16:
        return FOREGROUND;
    L18:
        return APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    public static Internal.EnumLiteMap<ApplicationProcessState> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return ApplicationProcessStateVerifier.INSTANCE;
    }

    public static ApplicationProcessState valueOf(String r1) {
        return (ApplicationProcessState) Enum.valueOf(ApplicationProcessState.class, r1);
    }

    public static ApplicationProcessState[] values() {
        return (ApplicationProcessState[]) $VALUES.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static ApplicationProcessState valueOf(int r02) {
        return forNumber(r02);
    }
}
