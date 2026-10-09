package com.iab.digitalidentity.sdk.core.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/iab/digitalidentity/sdk/core/exception/IncorrectChallengeQuestionException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IncorrectChallengeQuestionException extends Exception {
    public IncorrectChallengeQuestionException(String r2) {
        p.l(r2, "message");
        super(r2);
    }
}
