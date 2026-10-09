package com.clevertap.android.sdk.pushnotification;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class PushNotificationUtil {
    public static String a(String r1, String r2) {
        return r1 + "_" + r2;
    }

    public static ArrayList b() {
        ArrayList r02 = new ArrayList();
        r02.add(e.f34774a);
        return r02;
    }

    public static String c(Bundle r2) {
        if (r2 != null) goto L5;
        return "";
    L5:
        return r2.getString(Constants.WZRK_PUSH_ID, "");
    }

    public static String getAccountIdFromNotificationBundle(Bundle r2) {
        if (r2 != null) goto L5;
        return "";
    L5:
        return r2.getString(Constants.WZRK_ACCT_ID_KEY, "");
    }
}
