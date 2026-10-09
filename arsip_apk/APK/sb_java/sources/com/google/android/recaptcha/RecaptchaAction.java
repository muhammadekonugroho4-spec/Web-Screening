package com.google.android.recaptcha;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/google/android/recaptcha/RecaptchaAction;", "", Constants.KEY_ACTION, "", "<init>", "(Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Companion", "java.com.google.android.libraries.abuse.recaptcha.enterprise.public_public"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RecaptchaAction {
    public static final Companion Companion = null;
    public static final RecaptchaAction LOGIN = null;
    public static final RecaptchaAction SIGNUP = null;
    private final String action;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0007R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/google/android/recaptcha/RecaptchaAction$Companion;", "", "<init>", "()V", "LOGIN", "Lcom/google/android/recaptcha/RecaptchaAction;", "SIGNUP", "custom", "customAction", "", "java.com.google.android.libraries.abuse.recaptcha.enterprise.public_public"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final RecaptchaAction custom(String r3) {
            return new RecaptchaAction(r3, null);
        }

        public /* synthetic */ Companion(i r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
        LOGIN = new RecaptchaAction(FirebaseAnalytics.Event.LOGIN);
        SIGNUP = new RecaptchaAction("signup");
    }

    private RecaptchaAction(String r1) {
        this.action = r1;
    }

    public static /* synthetic */ RecaptchaAction copy$default(RecaptchaAction r02, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r02.action;
    L6:
        return r02.copy(r1);
    }

    public static final RecaptchaAction custom(String r1) {
        return Companion.custom(r1);
    }

    public final String component1() {
        return this.action;
    }

    public final RecaptchaAction copy(String r2) {
        return new RecaptchaAction(r2);
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof RecaptchaAction) == true) goto L9;
        return false;
    L9:
        if (p.g(this.action, ((RecaptchaAction) r4).action) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final String getAction() {
        return this.action;
    }

    public int hashCode() {
        return this.action.hashCode();
    }

    public String toString() {
        return "RecaptchaAction(action=" + this.action + ")";
    }

    public /* synthetic */ RecaptchaAction(String r1, i r2) {
        this(r1);
    }
}
