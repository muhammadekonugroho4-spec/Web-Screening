package com.google.firebase.perf.util;

import android.content.Context;
import android.content.res.Resources;
import com.google.firebase.perf.logging.AndroidLogger;
import java.net.URI;

/* loaded from: classes6.dex */
public class URLAllowlist {
    private static String[] allowlistedDomains;

    public URLAllowlist() {
    }

    public static boolean isURLAllowlisted(URI r5, Context r6) {
        Resources r02 = r6.getResources();
        int r62 = r02.getIdentifier("firebase_performance_whitelisted_domains", "array", r6.getPackageName());
        if (r62 != 0) goto L5;
        return true;
    L5:
        AndroidLogger.getInstance().debug("Detected domain allowlist, only allowlisted domains will be measured.");
        if (allowlistedDomains != null) goto L8;
        allowlistedDomains = r02.getStringArray(r62);
    L8:
        String r52 = r5.getHost();
        if (r52 != null) goto L11;
        return true;
    L11:
        String[] r63 = allowlistedDomains;
        int r03 = r63.length;
        int r3 = 0;
    L12:
        if (r3 >= r03) goto L17;
        if (r52.contains(r63[r3]) == true) goto L15;
        r3 = r3 + 1;
        goto L12
    L15:
        return true;
    L17:
        return false;
    }
}
