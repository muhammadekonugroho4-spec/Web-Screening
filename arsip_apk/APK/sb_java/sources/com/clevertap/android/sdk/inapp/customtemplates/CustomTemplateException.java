package com.clevertap.android.sdk.inapp.customtemplates;

import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00060\u0002j\u0002`\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateException;", "Lkotlin/RuntimeException;", "Ljava/lang/RuntimeException;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CustomTemplateException extends RuntimeException {
    public CustomTemplateException(String r2, Throwable r3) {
        p.l(r2, "message");
        super(r2, r3);
    }

    public /* synthetic */ CustomTemplateException(String r1, Throwable r2, int r3, i r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        this(r1, r2);
    }
}
