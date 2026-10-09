package a;

import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class h {
    public h() {
        p.l("", "currentCountry");
        p.l("", "signedUpCountry");
        p.l("", "email");
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof h) == true) goto L8;
        return false;
    L8:
        ((h) r4).getClass();
        if (p.g("", "") == true) goto L12;
        return false;
    L12:
        if (p.g("", "") == true) goto L15;
        return false;
    L15:
        if (p.g("", "") == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(-1) * 31;
    }

    public final String toString() {
        return "CSUserInfo(currentCountry=, signedUpCountry=, identity=-1, email=)";
    }
}
