package I;

import com.google.firebase.messaging.Constants;
import com.iab.digitalidentity.sdk.consent.ConsentDataUiModel;

/* loaded from: classes.dex */
public final class n extends B {

    /* renamed from: a, reason: collision with root package name */
    public final ConsentDataUiModel f835a;

    public n(ConsentDataUiModel r2) {
        kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f835a = r2;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof n) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f835a, ((n) r4).f835a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.f835a.hashCode();
    }

    public final String toString() {
        return "GetConsentDataSuccess(data=" + this.f835a + ")";
    }
}
