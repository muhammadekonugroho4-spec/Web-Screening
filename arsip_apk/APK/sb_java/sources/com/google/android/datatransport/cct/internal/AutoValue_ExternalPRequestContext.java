package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ExternalPRequestContext;

/* loaded from: classes4.dex */
final class AutoValue_ExternalPRequestContext extends ExternalPRequestContext {
    private final Integer originAssociatedProductId;

    /* renamed from: com.google.android.datatransport.cct.internal.AutoValue_ExternalPRequestContext$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder extends ExternalPRequestContext.Builder {
        private Integer originAssociatedProductId;

        public Builder() {
        }

        @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder
        public ExternalPRequestContext build() {
            return new AutoValue_ExternalPRequestContext(this.originAssociatedProductId, null);
        }

        @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder
        public ExternalPRequestContext.Builder setOriginAssociatedProductId(Integer r1) {
            this.originAssociatedProductId = r1;
            return this;
        }
    }

    public /* synthetic */ AutoValue_ExternalPRequestContext(Integer r1, AnonymousClass1 r2) {
        this(r1);
    }

    public boolean equals(Object r4) {
        if (r4 != this) goto L6;
        return true;
    L6:
        if ((r4 instanceof ExternalPRequestContext) == false) goto L14;
        Integer r1 = this.originAssociatedProductId;
        Integer r42 = ((ExternalPRequestContext) r4).getOriginAssociatedProductId();
        if (r1 != null) goto L13;
        if (r42 != null) goto L11;
        return true;
    L11:
        return false;
    L13:
        return r1.equals(r42);
    L14:
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext
    public Integer getOriginAssociatedProductId() {
        return this.originAssociatedProductId;
    }

    public int hashCode() {
        Integer r02 = this.originAssociatedProductId;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return r03 ^ 1000003;
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.originAssociatedProductId + "}";
    }

    private AutoValue_ExternalPRequestContext(Integer r1) {
        this.originAssociatedProductId = r1;
    }
}
