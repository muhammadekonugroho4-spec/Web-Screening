package com.google.android.recaptcha;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00060\u0002j\u0002`\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/google/android/recaptcha/RecaptchaException;", "Lkotlin/Exception;", "Ljava/lang/Exception;", "errorCode", "Lcom/google/android/recaptcha/RecaptchaErrorCode;", "errorMessage", "", "<init>", "(Lcom/google/android/recaptcha/RecaptchaErrorCode;Ljava/lang/String;)V", "getErrorCode", "()Lcom/google/android/recaptcha/RecaptchaErrorCode;", "getErrorMessage", "()Ljava/lang/String;", "java.com.google.android.libraries.abuse.recaptcha.enterprise.public_public"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RecaptchaException extends Exception {
    private final RecaptchaErrorCode errorCode;
    private final String errorMessage;

    public RecaptchaException(RecaptchaErrorCode r1, String r2) {
        super(r2);
        this.errorCode = r1;
        this.errorMessage = r2;
    }

    public final RecaptchaErrorCode getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public /* synthetic */ RecaptchaException(RecaptchaErrorCode r1, String r2, int r3, i r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = r1.getErrorMessage();
    L5:
        this(r1, r2);
    }
}
