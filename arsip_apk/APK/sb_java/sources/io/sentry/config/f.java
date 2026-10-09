package io.sentry.config;

import com.clevertap.android.sdk.Constants;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface f {
    default Double a(String r1) {
        String r12 = h(r1);
        if (r12 != null) goto L9;
        return null;
    L9:
        return Double.valueOf(r12);
    L11:
        return null;
    }

    default List b(String r2) {
        String r22 = h(r2);
        if (r22 == null) goto L7;
        return Arrays.asList(r22.split(Constants.SEPARATOR_COMMA));
    L7:
        return Collections.EMPTY_LIST;
    }

    default Boolean c(String r1) {
        String r12 = h(r1);
        if (r12 != null) goto L5;
        return null;
    L5:
        return Boolean.valueOf(r12);
    }

    default List d(String r2) {
        String r22 = h(r2);
        if (r22 != null) goto L5;
        return null;
    L5:
        return Arrays.asList(r22.split(Constants.SEPARATOR_COMMA));
    }

    Map e(String r1);

    default Long f(String r1) {
        String r12 = h(r1);
        if (r12 != null) goto L9;
        return null;
    L9:
        return Long.valueOf(r12);
    L11:
        return null;
    }

    default String g(String r1, String r2) {
        String r12 = h(r1);
        if (r12 == null) goto L5;
        return r12;
    L5:
        return r2;
    }

    String h(String r1);
}
