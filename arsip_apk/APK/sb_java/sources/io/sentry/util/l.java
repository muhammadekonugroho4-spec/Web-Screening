package io.sentry.util;

import com.stockbit.protobuf.securities.transactional.datafeed.v1.datafeed.ErrorCode;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final List f176859a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final List f176860b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final io.sentry.J f176861c = null;
    public static final io.sentry.J d = null;

    static {
        f176859a = Arrays.asList(new String[]{"X-FORWARDED-FOR", "AUTHORIZATION", "COOKIE", "SET-COOKIE", "X-API-KEY", "X-REAL-IP", "REMOTE-ADDR", "FORWARDED", "PROXY-AUTHORIZATION", "X-CSRF-TOKEN", "X-CSRFTOKEN", "X-XSRF-TOKEN"});
        f176860b = Arrays.asList(new String[]{"JSESSIONID", "JSESSIONIDSSO", "JSSOSESSIONID", "SESSIONID", "SID", "CSRFTOKEN", "XSRF-TOKEN"});
        f176861c = new io.sentry.J(ErrorCode.ERROR_CODE_BAD_REQUEST_VALUE, 499);
        d = new io.sentry.J(500, 599);
    }

    public static boolean a(String r2) {
        return f176859a.contains(r2.toUpperCase(Locale.ROOT));
    }

    public static boolean b(int r1) {
        return f176861c.a(r1);
    }

    public static boolean c(int r1) {
        return d.a(r1);
    }
}
