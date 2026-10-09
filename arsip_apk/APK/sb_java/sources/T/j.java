package T;

import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final i f1202a;

    public j(i r2) {
        kotlin.jvm.internal.p.l(r2, RemoteConfigConstants.ResponseFieldKey.STATE);
        this.f1202a = r2;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof j) == true) goto L9;
        return false;
    L9:
        if (this.f1202a == ((j) r4).f1202a) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.f1202a.hashCode();
    }

    public final String toString() {
        return "OneKycChallengeStateResult(state=" + this.f1202a + ")";
    }
}
