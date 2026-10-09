package android.support.v4.media.session;

import android.media.session.MediaSession;

/* loaded from: classes.dex */
public abstract class d {
    public static Object a(Object r1) {
        if ((r1 instanceof MediaSession.Token) == false) goto L6;
        return r1;
    L6:
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }
}
