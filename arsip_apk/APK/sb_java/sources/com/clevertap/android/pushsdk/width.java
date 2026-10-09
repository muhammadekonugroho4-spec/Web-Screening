package com.clevertap.android.pushsdk;

import android.os.Bundle;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class width {
    public width() {
    }

    public static String openContextMenu(Bundle r4) {
        JSONObject r02 = new JSONObject();     // Catch: Throwable -> L8
        Iterator<String> r1 = r4.keySet().iterator();     // Catch: Throwable -> L8
    L4:
        if (r1.hasNext() == false) goto L6;
        String r2 = r1.next();     // Catch: Throwable -> L8
        r02.put(r2, r4.get(r2));     // Catch: Throwable -> L8
        goto L4
    L6:
        return r02.toString();
    L8:
        th = move-exception;
        th.printStackTrace();
        return "";
    }
}
