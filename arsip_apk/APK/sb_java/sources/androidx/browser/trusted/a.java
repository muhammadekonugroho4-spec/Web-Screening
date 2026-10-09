package androidx.browser.trusted;

import android.app.NotificationManager;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class a {
    public static Parcelable[] a(NotificationManager r02) {
        return r02.getActiveNotifications();
    }
}
