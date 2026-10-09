package com.google.android.recaptcha.internal;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes5.dex */
public final class zzap {
    public static final String zza(ContentResolver r7) {
        Cursor r72 = r7.query(Uri.parse("content://com.google.android.gsf.gservices"), null, null, new String[]{"android_id"}, null);
        if (r72 != null) goto L5;
        return "";
    L5:
        if (r72.moveToFirst() == true) goto L7;
        return "";
    L7:
        if (r72.getColumnCount() < 2) goto L14;
        String r02 = String.valueOf(Long.parseLong(r72.getString(1)));
        r72.close();
        return r02;
    L14:
        return "";
    }
}
