package io.sentry.util;

import io.sentry.SentryOpenTelemetryMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f176839a = null;

    static {
        f176839a = new ConcurrentHashMap();
    }

    public static List a(SentryOpenTelemetryMode r3) {
        ArrayList r02 = new ArrayList();
        SentryOpenTelemetryMode r1 = SentryOpenTelemetryMode.AGENT;
        if (r1 != r3) goto L5;
    L6:
        r02.add("auto.http.spring_jakarta.webmvc");
        r02.add("auto.http.spring.webmvc");
        r02.add("auto.http.spring7.webmvc");
        r02.add("auto.spring_jakarta.webflux");
        r02.add("auto.spring.webflux");
        r02.add("auto.spring7.webflux");
        r02.add("auto.db.jdbc");
        r02.add("auto.http.spring_jakarta.webclient");
        r02.add("auto.http.spring.webclient");
        r02.add("auto.http.spring7.webclient");
        r02.add("auto.http.spring_jakarta.restclient");
        r02.add("auto.http.spring.restclient");
        r02.add("auto.http.spring7.restclient");
        r02.add("auto.http.spring_jakarta.resttemplate");
        r02.add("auto.http.spring.resttemplate");
        r02.add("auto.http.spring7.resttemplate");
        r02.add("auto.http.openfeign");
        r02.add("auto.http.ktor-client");
    L7:
        if (r1 != r3) goto L9;
        r02.add("auto.graphql.graphql");
        r02.add("auto.graphql.graphql22");
    L9:
        return r02;
    L5:
        if (SentryOpenTelemetryMode.AGENTLESS_SPRING != r3) goto L7;
        goto L6
    }

    public static boolean b(List r4, String r5) {
        if (r5 == null) goto L28;
        if (r4 == null) goto L28;
        if (r4.isEmpty() == true) goto L28;
        Map r1 = f176839a;
        if (r1.containsKey(r5) == true) goto L11;
        Iterator r12 = r4.iterator();
    L14:
        if (r12.hasNext() == false) goto L19;
        if (((io.sentry.D) r12.next()).a().equalsIgnoreCase(r5) == false) goto L14;
        f176839a.put(r5, Boolean.TRUE);
        return true;
    L19:
        Iterator r42 = r4.iterator();
    L21:
        if (r42.hasNext() == false) goto L27;
        if (((io.sentry.D) r42.next()).b(r5) == false) goto L21;
        f176839a.put(r5, Boolean.TRUE);     // Catch: Throwable -> L29
        return true;
    L27:
        f176839a.put(r5, Boolean.FALSE);
        goto L28
    L11:
        return ((Boolean) r1.get(r5)).booleanValue();
    L28:
        return false;
    }
}
