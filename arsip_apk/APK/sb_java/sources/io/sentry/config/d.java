package io.sentry.config;

import io.sentry.util.C;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class d implements f {
    public d() {
    }

    @Override // io.sentry.config.f
    public Map e(String r6) {
        String r62 = i(r6) + "_";
        ConcurrentHashMap r02 = new ConcurrentHashMap();
        Iterator<Map.Entry<String, String>> r1 = System.getenv().entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L10;
        Map.Entry<String, String> r2 = r1.next();
        String r3 = r2.getKey();
        if (r3.startsWith(r62) == false) goto L4;
        String r22 = C.h(r2.getValue(), "\"");
        if (r22 == null) goto L4;
        r02.put(r3.substring(r62.length()).toLowerCase(Locale.ROOT), r22);
        goto L4
    L10:
        return r02;
    }

    @Override // io.sentry.config.f
    public String h(String r2) {
        return C.h(System.getenv(i(r2)), "\"");
    }

    public final String i(String r4) {
        return "SENTRY_" + r4.replace(".", "_").replace("-", "_").toUpperCase(Locale.ROOT);
    }
}
