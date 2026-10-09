package com.google.android.datatransport;

import com.google.android.datatransport.EventContext;
import java.util.Arrays;

/* loaded from: classes4.dex */
final class AutoValue_EventContext extends EventContext {
    private final byte[] experimentIdsClear;
    private final byte[] experimentIdsEncrypted;
    private final String pseudonymousId;

    /* renamed from: com.google.android.datatransport.AutoValue_EventContext$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder extends EventContext.Builder {
        private byte[] experimentIdsClear;
        private byte[] experimentIdsEncrypted;
        private String pseudonymousId;

        public Builder() {
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public EventContext build() {
            return new AutoValue_EventContext(this.pseudonymousId, this.experimentIdsClear, this.experimentIdsEncrypted, null);
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public EventContext.Builder setExperimentIdsClear(byte[] r1) {
            this.experimentIdsClear = r1;
            return this;
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public EventContext.Builder setExperimentIdsEncrypted(byte[] r1) {
            this.experimentIdsEncrypted = r1;
            return this;
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public EventContext.Builder setPseudonymousId(String r1) {
            this.pseudonymousId = r1;
            return this;
        }
    }

    public /* synthetic */ AutoValue_EventContext(String r1, byte[] r2, byte[] r3, AnonymousClass1 r4) {
        this(r1, r2, r3);
    }

    public boolean equals(Object r6) {
        if (r6 != this) goto L6;
        return true;
    L6:
        if ((r6 instanceof EventContext) == false) goto L27;
        EventContext r62 = (EventContext) r6;
        String r1 = this.pseudonymousId;
        if (r1 != null) goto L13;
        if (r62.getPseudonymousId() != null) goto L27;
    L14:
        byte[] r12 = this.experimentIdsClear;
        boolean r3 = r62 instanceof AutoValue_EventContext;
        if (r3 == false) goto L17;
        byte[] r4 = ((AutoValue_EventContext) r62).experimentIdsClear;
    L19:
        if (Arrays.equals(r12, r4) == false) goto L27;
        byte[] r13 = this.experimentIdsEncrypted;
        if (r3 == false) goto L23;
        byte[] r63 = ((AutoValue_EventContext) r62).experimentIdsEncrypted;
    L25:
        if (Arrays.equals(r13, r63) == false) goto L27;
        return true;
    L23:
        r63 = r62.getExperimentIdsEncrypted();
        goto L25
    L17:
        r4 = r62.getExperimentIdsClear();
        goto L19
    L13:
        if (r1.equals(r62.getPseudonymousId()) == true) goto L14;
    L27:
        return false;
    }

    @Override // com.google.android.datatransport.EventContext
    public byte[] getExperimentIdsClear() {
        return this.experimentIdsClear;
    }

    @Override // com.google.android.datatransport.EventContext
    public byte[] getExperimentIdsEncrypted() {
        return this.experimentIdsEncrypted;
    }

    @Override // com.google.android.datatransport.EventContext
    public String getPseudonymousId() {
        return this.pseudonymousId;
    }

    public int hashCode() {
        String r02 = this.pseudonymousId;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return ((((r03 ^ 1000003) * 1000003) ^ Arrays.hashCode(this.experimentIdsClear)) * 1000003) ^ Arrays.hashCode(this.experimentIdsEncrypted);
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "EventContext{pseudonymousId=" + this.pseudonymousId + ", experimentIdsClear=" + Arrays.toString(this.experimentIdsClear) + ", experimentIdsEncrypted=" + Arrays.toString(this.experimentIdsEncrypted) + "}";
    }

    private AutoValue_EventContext(String r1, byte[] r2, byte[] r3) {
        this.pseudonymousId = r1;
        this.experimentIdsClear = r2;
        this.experimentIdsEncrypted = r3;
    }
}
