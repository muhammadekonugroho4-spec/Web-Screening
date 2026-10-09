package androidx.browser.trusted;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class b {
    public static Notification a(Context r2, NotificationManager r3, Notification r4, String r5, String r6) {
        r3.createNotificationChannel(new NotificationChannel(r5, r6, 3));
        if (r3.getNotificationChannel(r5).getImportance() != 0) goto L6;
        return null;
    L6:
        Notification.Builder r22 = Notification.Builder.recoverBuilder(r2, r4);
        r22.setChannelId(r5);
        return r22.build();
    }

    public static boolean b(NotificationManager r02, String r1) {
        NotificationChannel r03 = r02.getNotificationChannel(r1);
        if (r03 != null) goto L5;
        return true;
    L5:
        if (r03.getImportance() != 0) goto L11;
        return false;
    L11:
        return true;
    }
}
