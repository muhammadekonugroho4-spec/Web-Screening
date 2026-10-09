package v0;

import com.google.firebase.messaging.Constants;
import com.iab.digitalidentity.sdk.model.IdentityVerificationIntentModel;

/* loaded from: classes3.dex */
public final class k extends l {

    /* renamed from: a, reason: collision with root package name */
    public final IdentityVerificationIntentModel f184384a;

    public k(IdentityVerificationIntentModel r2) {
        kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f184384a = r2;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof k) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f184384a, ((k) r4).f184384a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.f184384a.hashCode();
    }

    public final String toString() {
        return "LaunchIdentityVerification(data=" + this.f184384a + ")";
    }
}
