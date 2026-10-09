package io.sentry;

import io.sentry.vendor.gson.stream.JsonToken;
import java.io.Closeable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: io.sentry.f1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC11587f1 extends Closeable {
    static Date P(String r3, Q r4) {
        if (r3 != null) goto L12;
        return null;
    L12:
        return AbstractC11610k.f(r3);
    L7:
        return AbstractC11610k.g(r3);
    L9:
        e = move-exception;
        r4.a(SentryLevel.ERROR, "Error when deserializing millis timestamp format.", e);
        return null;
    }

    Object B1();

    Date F(Q r1);

    Boolean G();

    TimeZone I0(Q r1);

    Object K(Q r1, InterfaceC11631o0 r2);

    Double R0();

    float a0();

    String b0();

    void beginArray();

    void beginObject();

    void endArray();

    void endObject();

    Integer h1();

    boolean hasNext();

    Long j1();

    Float n0();

    Map n1(Q r1, InterfaceC11631o0 r2);

    double nextDouble();

    int nextInt();

    long nextLong();

    String nextName();

    String nextString();

    void o1(Q r1, Map r2, String r3);

    JsonToken peek();

    void setLenient(boolean r1);

    void skipValue();

    List t0(Q r1, InterfaceC11631o0 r2);
}
