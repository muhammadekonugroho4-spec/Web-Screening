package com.google.firebase.crashlytics.internal.metadata;

/* loaded from: classes6.dex */
final class AutoValue_RolloutAssignment extends RolloutAssignment {
    private final String parameterKey;
    private final String parameterValue;
    private final String rolloutId;
    private final long templateVersion;
    private final String variantId;

    public AutoValue_RolloutAssignment(String r1, String r2, String r3, String r4, long r5) {
        if (r1 == null) goto L19;
        this.rolloutId = r1;
        if (r2 == null) goto L17;
        this.parameterKey = r2;
        if (r3 == null) goto L15;
        this.parameterValue = r3;
        if (r4 == null) goto L13;
        this.variantId = r4;
        this.templateVersion = r5;
        return;
    L13:
        throw new NullPointerException("Null variantId");
    L15:
        throw new NullPointerException("Null parameterValue");
    L17:
        throw new NullPointerException("Null parameterKey");
    L19:
        throw new NullPointerException("Null rolloutId");
    }

    public boolean equals(Object r8) {
        if (r8 != this) goto L6;
        return true;
    L6:
        if ((r8 instanceof RolloutAssignment) == false) goto L18;
        RolloutAssignment r82 = (RolloutAssignment) r8;
        if (this.rolloutId.equals(r82.getRolloutId()) == false) goto L18;
        if (this.parameterKey.equals(r82.getParameterKey()) == false) goto L18;
        if (this.parameterValue.equals(r82.getParameterValue()) == false) goto L18;
        if (this.variantId.equals(r82.getVariantId()) == false) goto L18;
        if (this.templateVersion != r82.getTemplateVersion()) goto L18;
        return true;
    L18:
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String getParameterKey() {
        return this.parameterKey;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String getParameterValue() {
        return this.parameterValue;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String getRolloutId() {
        return this.rolloutId;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public long getTemplateVersion() {
        return this.templateVersion;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public String getVariantId() {
        return this.variantId;
    }

    public int hashCode() {
        int r02 = (((((((this.rolloutId.hashCode() ^ 1000003) * 1000003) ^ this.parameterKey.hashCode()) * 1000003) ^ this.parameterValue.hashCode()) * 1000003) ^ this.variantId.hashCode()) * 1000003;
        long r1 = this.templateVersion;
        return r02 ^ ((int) (r1 ^ (r1 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.rolloutId + ", parameterKey=" + this.parameterKey + ", parameterValue=" + this.parameterValue + ", variantId=" + this.variantId + ", templateVersion=" + this.templateVersion + "}";
    }
}
