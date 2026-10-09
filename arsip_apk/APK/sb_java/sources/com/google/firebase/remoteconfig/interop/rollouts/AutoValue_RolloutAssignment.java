package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;

/* loaded from: classes6.dex */
final class AutoValue_RolloutAssignment extends RolloutAssignment {
    private final String parameterKey;
    private final String parameterValue;
    private final String rolloutId;
    private final long templateVersion;
    private final String variantId;

    /* renamed from: com.google.firebase.remoteconfig.interop.rollouts.AutoValue_RolloutAssignment$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder extends RolloutAssignment.Builder {
        private String parameterKey;
        private String parameterValue;
        private String rolloutId;
        private byte set$0;
        private long templateVersion;
        private String variantId;

        public Builder() {
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment build() {
            if (this.set$0 == 1) goto L5;
        L15:
            StringBuilder r02 = new StringBuilder();
            if (this.rolloutId != null) goto L19;
            r02.append(" rolloutId");
        L19:
            if (this.variantId != null) goto L22;
            r02.append(" variantId");
        L22:
            if (this.parameterKey != null) goto L25;
            r02.append(" parameterKey");
        L25:
            if (this.parameterValue != null) goto L28;
            r02.append(" parameterValue");
        L28:
            if ((1 & this.set$0) != 0) goto L31;
            r02.append(" templateVersion");
        L31:
            throw new IllegalStateException("Missing required properties:" + r02);
        L5:
            if (this.rolloutId == null) goto L15;
            if (this.variantId == null) goto L15;
            if (this.parameterKey == null) goto L15;
            if (this.parameterValue == null) goto L15;
            return new AutoValue_RolloutAssignment(this.rolloutId, this.variantId, this.parameterKey, this.parameterValue, this.templateVersion, null);
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setParameterKey(String r2) {
            if (r2 == null) goto L6;
            this.parameterKey = r2;
            return this;
        L6:
            throw new NullPointerException("Null parameterKey");
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setParameterValue(String r2) {
            if (r2 == null) goto L6;
            this.parameterValue = r2;
            return this;
        L6:
            throw new NullPointerException("Null parameterValue");
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setRolloutId(String r2) {
            if (r2 == null) goto L6;
            this.rolloutId = r2;
            return this;
        L6:
            throw new NullPointerException("Null rolloutId");
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setTemplateVersion(long r1) {
            this.templateVersion = r1;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setVariantId(String r2) {
            if (r2 == null) goto L6;
            this.variantId = r2;
            return this;
        L6:
            throw new NullPointerException("Null variantId");
        }
    }

    public /* synthetic */ AutoValue_RolloutAssignment(String r1, String r2, String r3, String r4, long r5, AnonymousClass1 r7) {
        this(r1, r2, r3, r4, r5);
    }

    public boolean equals(Object r8) {
        if (r8 != this) goto L6;
        return true;
    L6:
        if ((r8 instanceof RolloutAssignment) == false) goto L18;
        RolloutAssignment r82 = (RolloutAssignment) r8;
        if (this.rolloutId.equals(r82.getRolloutId()) == false) goto L18;
        if (this.variantId.equals(r82.getVariantId()) == false) goto L18;
        if (this.parameterKey.equals(r82.getParameterKey()) == false) goto L18;
        if (this.parameterValue.equals(r82.getParameterValue()) == false) goto L18;
        if (this.templateVersion != r82.getTemplateVersion()) goto L18;
        return true;
    L18:
        return false;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public String getParameterKey() {
        return this.parameterKey;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public String getParameterValue() {
        return this.parameterValue;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public String getRolloutId() {
        return this.rolloutId;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public long getTemplateVersion() {
        return this.templateVersion;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public String getVariantId() {
        return this.variantId;
    }

    public int hashCode() {
        int r02 = (((((((this.rolloutId.hashCode() ^ 1000003) * 1000003) ^ this.variantId.hashCode()) * 1000003) ^ this.parameterKey.hashCode()) * 1000003) ^ this.parameterValue.hashCode()) * 1000003;
        long r1 = this.templateVersion;
        return r02 ^ ((int) (r1 ^ (r1 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.rolloutId + ", variantId=" + this.variantId + ", parameterKey=" + this.parameterKey + ", parameterValue=" + this.parameterValue + ", templateVersion=" + this.templateVersion + "}";
    }

    private AutoValue_RolloutAssignment(String r1, String r2, String r3, String r4, long r5) {
        this.rolloutId = r1;
        this.variantId = r2;
        this.parameterKey = r3;
        this.parameterValue = r4;
        this.templateVersion = r5;
    }
}
