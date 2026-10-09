package com.iab.digitalidentity.sdk.core.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/model/DocumentVerificationResultStatus;", "", "(Ljava/lang/String;I)V", "COMPLETED", "ERROR", "NOT_COMPLETED", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public enum DocumentVerificationResultStatus extends Enum<DocumentVerificationResultStatus> {
    private static final /* synthetic */ DocumentVerificationResultStatus[] $VALUES = null;
    public static final DocumentVerificationResultStatus COMPLETED = null;
    public static final DocumentVerificationResultStatus ERROR = null;
    public static final DocumentVerificationResultStatus NOT_COMPLETED = null;

    private static final /* synthetic */ DocumentVerificationResultStatus[] $values() {
        return new DocumentVerificationResultStatus[]{COMPLETED, ERROR, NOT_COMPLETED};
    }

    static {
        COMPLETED = new DocumentVerificationResultStatus("COMPLETED", 0);
        ERROR = new DocumentVerificationResultStatus("ERROR", 1);
        NOT_COMPLETED = new DocumentVerificationResultStatus("NOT_COMPLETED", 2);
        $VALUES = $values();
    }

    DocumentVerificationResultStatus(String r1, int r2) {
    }

    public static DocumentVerificationResultStatus valueOf(String r1) {
        return (DocumentVerificationResultStatus) Enum.valueOf(DocumentVerificationResultStatus.class, r1);
    }

    public static DocumentVerificationResultStatus[] values() {
        return (DocumentVerificationResultStatus[]) $VALUES.clone();
    }
}
