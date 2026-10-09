package com.huawei.hms.framework.network.grs.h;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f39266a = "c";

    public static String a(String r5, Context r6) {
        if (TextUtils.isEmpty(r5) == false) goto L5;
        return "";
    L5:
        ByteArrayOutputStream r02 = new ByteArrayOutputStream();
        InputStream r2 = null;
    L14:
        th = move-exception;
        IoUtils.closeSecure(r02);
        IoUtils.closeSecure(r2);
        throw th;
    L7:
        if (new File(r5).isDirectory() == false) goto L10;
    L8:
        IoUtils.closeSecure(r02);
        IoUtils.closeSecure(r2);
        return "";
    L10:
        r2 = r6.getAssets().open(r5);     // Catch: Throwable -> L14 IOException -> L19
        byte[] r62 = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];     // Catch: Throwable -> L14 IOException -> L19
    L11:
        int r3 = r2.read(r62);     // Catch: Throwable -> L14 IOException -> L19
        if (r3 == (-1)) goto L16;
        r02.write(r62, 0, r3);     // Catch: Throwable -> L14 IOException -> L19
        goto L11
    L16:
        r02.flush();     // Catch: Throwable -> L14 IOException -> L19
        String r63 = new String(r02.toByteArray(), "UTF-8");     // Catch: Throwable -> L14 IOException -> L19
        IoUtils.closeSecure(r02);
        IoUtils.closeSecure(r2);
        return r63;
    L21:
        Logger.w(f39266a, "local config file is not exist.filename is {%s}", new Object[]{r5});     // Catch: Throwable -> L14
        goto L8
    }
}
