package G;

import com.google.firebase.messaging.Constants;
import com.iab.digitalidentity.sdk.challenge.confirmation.MaskedIdentityDataUiModel;

/* loaded from: classes.dex */
public final class j extends n {

    /* renamed from: a, reason: collision with root package name */
    public final MaskedIdentityDataUiModel f745a;

    public j(MaskedIdentityDataUiModel r2) {
        kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f745a = r2;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof j) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f745a, ((j) r4).f745a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.f745a.hashCode();
    }

    public final String toString() {
        return "MaskedIdentityDataObtained(data=" + this.f745a + ")";
    }
}
