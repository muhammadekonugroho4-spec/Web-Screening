package androidx.media;

import android.media.session.MediaSessionManager;

/* loaded from: classes4.dex */
public final class j implements g {

    /* renamed from: a, reason: collision with root package name */
    public final MediaSessionManager.RemoteUserInfo f25903a;

    public j(String r1, int r2, int r3) {
        this.f25903a = i.a(r1, r2, r3);
    }

    public boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof j) == true) goto L10;
        return false;
    L10:
        return h.a(this.f25903a, ((j) r2).f25903a);
    }

    public int hashCode() {
        return androidx.core.util.c.b(new Object[]{this.f25903a});
    }
}
