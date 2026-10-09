package com.google.android.gms.common.util;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Iterator;

@KeepForSdk
/* loaded from: classes5.dex */
public class MapUtils {
    public MapUtils() {
    }

    @KeepForSdk
    public static void writeStringMapToJson(StringBuilder r4, HashMap<String, String> r5) {
        r4.append("{");
        Iterator<String> r02 = r5.keySet().iterator();
        boolean r1 = true;
    L4:
        if (r02.hasNext() == false) goto L13;
        String r2 = r02.next();
        if (r1 == true) goto L8;
        r4.append(Constants.SEPARATOR_COMMA);
    L8:
        String r12 = r5.get(r2);
        r4.append("\"");
        r4.append(r2);
        r4.append("\":");
        if (r12 != null) goto L12;
        r4.append("null");
    L11:
        r1 = false;
        goto L4
    L12:
        r4.append("\"");
        r4.append(r12);
        r4.append("\"");
        goto L11
    L13:
        r4.append("}");
    }
}
