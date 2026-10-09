package io.sentry;

/* loaded from: classes3.dex */
public final class X1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f175037a;

    /* renamed from: b, reason: collision with root package name */
    public final SentryAttributeType f175038b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f175039c;

    public X1(String r1, SentryAttributeType r2, Object r3) {
        this.f175037a = r1;
        this.f175038b = r2;
        this.f175039c = r3;
    }

    public static X1 d(String r2, String r3) {
        return new X1(r2, SentryAttributeType.STRING, r3);
    }

    public String a() {
        return this.f175037a;
    }

    public SentryAttributeType b() {
        return this.f175038b;
    }

    public Object c() {
        return this.f175039c;
    }
}
