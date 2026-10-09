package com.huawei.hms.framework.common.grs;

import com.huawei.hms.framework.common.StringUtils;
import java.util.Locale;

/* loaded from: classes6.dex */
public class GrsUtils {
    private static final int GRS_KEY_INDEX = 1;
    private static final int GRS_PATH_INDEX = 2;
    private static final String GRS_SCHEMA = "grs://";
    private static final int GRS_SERVICE_INDEX = 0;
    private static final int MAX_GRS_SPLIT = 3;
    private static final String SEPARATOR = "/";

    public GrsUtils() {
    }

    public static String fixResult(String[] r3, String r4) {
        if (r3.length > 2) goto L5;
        return r4;
    L5:
        if (r4.endsWith("/") == false) goto L9;
        return r4 + r3[2];
    L9:
        return r4 + "/" + r3[2];
    }

    public static boolean isGRSSchema(String r1) {
        if (r1 != null) goto L4;
        return false;
    L4:
        if (r1.startsWith(GRS_SCHEMA) == false) goto L9;
        return true;
    L9:
        return false;
    }

    public static String[] parseGRSSchema(String r2) {
        String[] r22 = StringUtils.substring(r2, r2.toLowerCase(Locale.ENGLISH).indexOf(GRS_SCHEMA) + 6).split("/", 3);
        if (r22.length == 1) goto L5;
        return r22;
    L5:
        return new String[]{r22[0], "ROOT"};
    }

    public static String[] parseParams(String r2) {
        if (r2.endsWith("/") == false) goto L6;
        r2 = StringUtils.substring(r2, r2.indexOf(GRS_SCHEMA), r2.length() - 1);
    L6:
        return parseGRSSchema(r2);
    }
}
