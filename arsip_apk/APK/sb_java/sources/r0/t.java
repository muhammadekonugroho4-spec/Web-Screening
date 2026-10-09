package r0;

import com.iab.digitalidentity.sdk.consent.ConsentDataUiModel;

/* loaded from: classes3.dex */
public final class t extends G {

    /* renamed from: a, reason: collision with root package name */
    public final ConsentDataUiModel f183412a;

    public t(ConsentDataUiModel r2) {
        kotlin.jvm.internal.p.l(r2, "consentData");
        this.f183412a = r2;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof t) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f183412a, ((t) r4).f183412a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.f183412a.hashCode();
    }

    public final String toString() {
        return "LaunchKycFlow(consentData=" + this.f183412a + ")";
    }
}
