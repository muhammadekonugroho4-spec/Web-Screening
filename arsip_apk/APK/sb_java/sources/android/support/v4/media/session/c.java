package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.KeyEvent;

/* loaded from: classes.dex */
public abstract class c {
    public static boolean a(Object r02, KeyEvent r1) {
        return ((MediaController) r02).dispatchMediaButtonEvent(r1);
    }

    public static Object b(Context r1, Object r2) {
        return new MediaController(r1, (MediaSession.Token) r2);
    }

    public static void c(Object r02, String r1, Bundle r2, ResultReceiver r3) {
        ((MediaController) r02).sendCommand(r1, r2, r3);
    }
}
