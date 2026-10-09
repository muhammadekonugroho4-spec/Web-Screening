package F;

import com.iab.digitalidentity.sdk.core.network.model.UnifiedKycResponse$ChallengeDetails;

/* loaded from: classes.dex */
public final class J0 extends S0 {

    /* renamed from: a, reason: collision with root package name */
    public final UnifiedKycResponse$ChallengeDetails f604a;

    public J0(UnifiedKycResponse$ChallengeDetails r1) {
        this.f604a = r1;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof J0) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f604a, ((J0) r4).f604a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        UnifiedKycResponse$ChallengeDetails r02 = this.f604a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public final String toString() {
        return "FRVerificationPending(details=" + this.f604a + ")";
    }
}
