package com.stockbit.common.utils;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;

/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f62376a = null;

    static {
        f62376a = new r();
    }

    public r() {
    }

    public final void a(Context r4, String r5, String r6) {
        Object r1 = null;
        if (r5 == null) goto L5;
        Uri r52 = Uri.parse(r5);
    L6:
        DownloadManager.Request r02 = new DownloadManager.Request(r52);
        r02.setTitle(r6);
        r02.setNotificationVisibility(1);
        r02.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, r6 + ".pdf");
        if (r4 == null) goto L9;
        r1 = r4.getSystemService("download");
    L9:
        kotlin.jvm.internal.p.j(r1, "null cannot be cast to non-null type android.app.DownloadManager");
        DownloadManager r12 = (DownloadManager) r1;
        r02.setMimeType("application/pdf");
        if (Build.VERSION.SDK_INT >= 29) goto L12;
        r02.allowScanningByMediaScanner();
    L12:
        r02.setAllowedNetworkTypes(3);
        r12.enqueue(r02);
        return;
    L5:
        r52 = null;
        goto L6
    }
}
