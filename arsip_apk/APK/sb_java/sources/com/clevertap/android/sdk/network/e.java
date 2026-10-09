package com.clevertap.android.sdk.network;

import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f34680a = null;

    static {
        f34680a = new e();
    }

    public e() {
    }

    public static /* synthetic */ DownloadedBitmap c(e r02, Bitmap r1, long r2, byte[] r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L6;
        r4 = null;
    L6:
        return r02.b(r1, r2, r4);
    }

    public final DownloadedBitmap a(DownloadedBitmap.Status r10) {
        p.l(r10, NotificationCompat.CATEGORY_STATUS);
        return new DownloadedBitmap(null, r10, -1, null, 8, null);
    }

    public final DownloadedBitmap b(Bitmap r8, long r9, byte[] r11) {
        p.l(r8, "bitmap");
        return new DownloadedBitmap(r8, DownloadedBitmap.Status.SUCCESS, r9, r11);
    }

    public final DownloadedBitmap d(long r8, byte[] r10) {
        p.l(r10, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return new DownloadedBitmap(null, DownloadedBitmap.Status.SUCCESS, r8, r10);
    }
}
