package v0;

import com.google.firebase.messaging.Constants;
import com.iab.digitalidentity.sdk.model.IdentityScanIntentModel;

/* loaded from: classes3.dex */
public final class j extends l {

    /* renamed from: a, reason: collision with root package name */
    public final IdentityScanIntentModel f184383a;

    public j(IdentityScanIntentModel r2) {
        kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f184383a = r2;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof j) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f184383a, ((j) r4).f184383a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.f184383a.hashCode();
    }

    public final String toString() {
        return "LaunchIdentityScan(data=" + this.f184383a + ")";
    }
}
