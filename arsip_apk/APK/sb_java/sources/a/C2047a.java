package a;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.jvm.internal.p;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2047a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1346a;

    public C2047a(String r2) {
        p.l(r2, RemoteConfigConstants.RequestFieldKey.APP_VERSION);
        this.f1346a = r2;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof C2047a) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f1346a, ((C2047a) r4).f1346a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return this.f1346a.hashCode();
    }

    public final String toString() {
        return "CSAppInfo(appVersion=" + this.f1346a + ')';
    }
}
