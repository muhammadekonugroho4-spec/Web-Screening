package com.google.android.gms.common.util;

import android.database.CharArrayBuffer;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.ByteArrayOutputStream;

@KeepForSdk
/* loaded from: classes5.dex */
public final class DataUtils {
    public DataUtils() {
    }

    @KeepForSdk
    public static void copyStringToBuffer(String r3, CharArrayBuffer r4) {
        if (TextUtils.isEmpty(r3) == false) goto L6;
        r4.sizeCopied = 0;
        return;
    L6:
        char[] r02 = r4.data;
        if (r02 != null) goto L9;
    L12:
        r4.data = r3.toCharArray();
    L13:
        r4.sizeCopied = r3.length();
        return;
    L9:
        if (r02.length < r3.length()) goto L12;
        r3.getChars(0, r3.length(), r4.data, 0);
        goto L13
    }

    @KeepForSdk
    public static byte[] loadImageBytes(Bitmap r3) {
        ByteArrayOutputStream r02 = new ByteArrayOutputStream();
        r3.compress(Bitmap.CompressFormat.JPEG, 100, r02);
        return r02.toByteArray();
    }
}
