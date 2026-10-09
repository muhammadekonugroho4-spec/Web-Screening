package F;

import com.iab.digitalidentity.sdk.core.network.model.UnifiedKycResponse$ChallengeDetails;

/* loaded from: classes.dex */
public final class I0 extends S0 {

    /* renamed from: a, reason: collision with root package name */
    public final UnifiedKycResponse$ChallengeDetails f598a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f599b;

    public I0(UnifiedKycResponse$ChallengeDetails r1, boolean r2) {
        this.f598a = r1;
        this.f599b = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof I0) == true) goto L8;
        return false;
    L8:
        I0 r52 = (I0) r5;
        if (kotlin.jvm.internal.p.g(this.f598a, r52.f598a) == true) goto L12;
        return false;
    L12:
        if (this.f599b == r52.f599b) goto L14;
        return false;
    L14:
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        UnifiedKycResponse$ChallengeDetails r02 = this.f598a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        boolean r1 = this.f599b;
        int r12 = r1;
        if (r1 == 0) goto L10;
        r12 = 1;
    L10:
        return r04 + r12;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public final String toString() {
        return "FRVerificationFailed(details=" + this.f598a + ", isFromPoll=" + this.f599b + ")";
    }
}
