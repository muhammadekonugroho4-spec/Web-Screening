package io.sentry;

import io.sentry.vendor.gson.stream.JsonToken;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: io.sentry.u0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11669u0 implements InterfaceC11587f1 {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.vendor.gson.stream.a f176834a;

    public C11669u0(Reader r2) {
        this.f176834a = new io.sentry.vendor.gson.stream.a(r2);
    }

    @Override // io.sentry.InterfaceC11587f1
    public Object B1() {
        return new C11663t0().e(this);
    }

    @Override // io.sentry.InterfaceC11587f1
    public Date F(Q r3) {
        if (this.f176834a.peek() != JsonToken.NULL) goto L7;
        this.f176834a.x();
        return null;
    L7:
        return InterfaceC11587f1.P(this.f176834a.nextString(), r3);
    }

    @Override // io.sentry.InterfaceC11587f1
    public Boolean G() {
        if (this.f176834a.peek() != JsonToken.NULL) goto L7;
        this.f176834a.x();
        return null;
    L7:
        return Boolean.valueOf(this.f176834a.t());
    }

    @Override // io.sentry.InterfaceC11587f1
    public TimeZone I0(Q r5) {
        if (this.f176834a.peek() != JsonToken.NULL) goto L11;
        this.f176834a.x();
        return null;
    L11:
        return TimeZone.getTimeZone(this.f176834a.nextString());
    L8:
        e = move-exception;
        r5.a(SentryLevel.ERROR, "Error when deserializing TimeZone", e);
        return null;
    }

    @Override // io.sentry.InterfaceC11587f1
    public Object K(Q r3, InterfaceC11631o0 r4) {
        if (this.f176834a.peek() != JsonToken.NULL) goto L7;
        this.f176834a.x();
        return null;
    L7:
        return r4.a(this, r3);
    }

    @Override // io.sentry.InterfaceC11587f1
    public Double R0() {
        if (this.f176834a.peek() != JsonToken.NULL) goto L7;
        this.f176834a.x();
        return null;
    L7:
        return Double.valueOf(this.f176834a.nextDouble());
    }

    @Override // io.sentry.InterfaceC11587f1
    public float a0() {
        return (float) this.f176834a.nextDouble();
    }

    @Override // io.sentry.InterfaceC11587f1
    public String b0() {
        if (this.f176834a.peek() != JsonToken.NULL) goto L7;
        this.f176834a.x();
        return null;
    L7:
        return this.f176834a.nextString();
    }

    @Override // io.sentry.InterfaceC11587f1
    public void beginArray() {
        this.f176834a.beginArray();
    }

    @Override // io.sentry.InterfaceC11587f1
    public void beginObject() {
        this.f176834a.beginObject();
    }

    public boolean c() {
        return this.f176834a.t();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f176834a.close();
    }

    @Override // io.sentry.InterfaceC11587f1
    public void endArray() {
        this.f176834a.endArray();
    }

    @Override // io.sentry.InterfaceC11587f1
    public void endObject() {
        this.f176834a.endObject();
    }

    public void f() {
        this.f176834a.x();
    }

    @Override // io.sentry.InterfaceC11587f1
    public Integer h1() {
        if (this.f176834a.peek() != JsonToken.NULL) goto L7;
        this.f176834a.x();
        return null;
    L7:
        return Integer.valueOf(this.f176834a.nextInt());
    }

    @Override // io.sentry.InterfaceC11587f1
    public boolean hasNext() {
        return this.f176834a.hasNext();
    }

    @Override // io.sentry.InterfaceC11587f1
    public Long j1() {
        if (this.f176834a.peek() != JsonToken.NULL) goto L7;
        this.f176834a.x();
        return null;
    L7:
        return Long.valueOf(this.f176834a.nextLong());
    }

    @Override // io.sentry.InterfaceC11587f1
    public Float n0() {
        if (this.f176834a.peek() != JsonToken.NULL) goto L7;
        this.f176834a.x();
        return null;
    L7:
        return Float.valueOf(a0());
    }

    @Override // io.sentry.InterfaceC11587f1
    public Map n1(Q r5, InterfaceC11631o0 r6) {
        if (this.f176834a.peek() != JsonToken.NULL) goto L6;
        this.f176834a.x();
        return null;
    L6:
        this.f176834a.beginObject();
        HashMap r02 = new HashMap();
        if (this.f176834a.hasNext() == true) goto L18;
    L16:
        this.f176834a.endObject();
        return r02;
    L18:
        r02.put(this.f176834a.nextName(), r6.a(this, r5));     // Catch: Exception -> L10
    L13:
        if (this.f176834a.peek() == JsonToken.BEGIN_OBJECT) goto L18;
        if (this.f176834a.peek() == JsonToken.NAME) goto L18;
    L10:
        e = move-exception;
        r5.a(SentryLevel.WARNING, "Failed to deserialize object in map.", e);
        goto L13
    }

    @Override // io.sentry.InterfaceC11587f1
    public double nextDouble() {
        return this.f176834a.nextDouble();
    }

    @Override // io.sentry.InterfaceC11587f1
    public int nextInt() {
        return this.f176834a.nextInt();
    }

    @Override // io.sentry.InterfaceC11587f1
    public long nextLong() {
        return this.f176834a.nextLong();
    }

    @Override // io.sentry.InterfaceC11587f1
    public String nextName() {
        return this.f176834a.nextName();
    }

    @Override // io.sentry.InterfaceC11587f1
    public String nextString() {
        return this.f176834a.nextString();
    }

    @Override // io.sentry.InterfaceC11587f1
    public void o1(Q r3, Map r4, String r5) {
        r4.put(r5, B1());     // Catch: Exception -> L4
        return;
    L4:
        e = move-exception;
        r3.b(SentryLevel.ERROR, e, "Error deserializing unknown key: %s", new Object[]{r5});
    }

    @Override // io.sentry.InterfaceC11587f1
    public JsonToken peek() {
        return this.f176834a.peek();
    }

    @Override // io.sentry.InterfaceC11587f1
    public void setLenient(boolean r2) {
        this.f176834a.setLenient(r2);
    }

    @Override // io.sentry.InterfaceC11587f1
    public void skipValue() {
        this.f176834a.skipValue();
    }

    @Override // io.sentry.InterfaceC11587f1
    public List t0(Q r5, InterfaceC11631o0 r6) {
        if (this.f176834a.peek() != JsonToken.NULL) goto L6;
        this.f176834a.x();
        return null;
    L6:
        this.f176834a.beginArray();
        ArrayList r02 = new ArrayList();
        if (this.f176834a.hasNext() == true) goto L16;
    L14:
        this.f176834a.endArray();
        return r02;
    L16:
        r02.add(r6.a(this, r5));     // Catch: Exception -> L10
    L13:
        if (this.f176834a.peek() == JsonToken.BEGIN_OBJECT) goto L16;
    L10:
        e = move-exception;
        r5.a(SentryLevel.WARNING, "Failed to deserialize object in list.", e);
        goto L13
    }
}
