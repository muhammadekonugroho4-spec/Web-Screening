package io.sentry.config;

import io.sentry.util.C;
import io.sentry.util.v;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes3.dex */
public abstract class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f176186a;

    /* renamed from: b, reason: collision with root package name */
    public final Properties f176187b;

    public a(String r2, Properties r3) {
        this.f176186a = (String) v.c(r2, "prefix is required");
        this.f176187b = (Properties) v.c(r3, "properties are required");
    }

    @Override // io.sentry.config.f
    public Map e(String r6) {
        String r62 = this.f176186a + r6 + ".";
        HashMap r02 = new HashMap();
        Iterator r1 = this.f176187b.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L12;
        Map.Entry r2 = (Map.Entry) r1.next();
        if ((r2.getKey() instanceof String) == false) goto L4;
        if ((r2.getValue() instanceof String) == false) goto L4;
        String r3 = (String) r2.getKey();
        if (r3.startsWith(r62) == false) goto L4;
        r02.put(r3.substring(r62.length()), C.h((String) r2.getValue(), "\""));
        goto L4
    L12:
        return r02;
    }

    @Override // io.sentry.config.f
    public String h(String r4) {
        return C.h(this.f176187b.getProperty(this.f176186a + r4), "\"");
    }

    public a(Properties r2) {
        this("", r2);
    }
}
