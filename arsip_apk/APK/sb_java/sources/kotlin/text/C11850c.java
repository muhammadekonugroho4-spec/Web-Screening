package kotlin.text;

import java.nio.charset.Charset;

/* renamed from: kotlin.text.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11850c {

    /* renamed from: a, reason: collision with root package name */
    public static final C11850c f180361a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f180362b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f180363c = null;
    public static final Charset d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f180364e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f180365f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final Charset f180366g = null;

    /* renamed from: h, reason: collision with root package name */
    public static volatile Charset f180367h;

    /* renamed from: i, reason: collision with root package name */
    public static volatile Charset f180368i;

    static {
        f180361a = new C11850c();
        Charset r02 = Charset.forName("UTF-8");
        kotlin.jvm.internal.p.k(r02, "forName(...)");
        f180362b = r02;
        Charset r03 = Charset.forName("UTF-16");
        kotlin.jvm.internal.p.k(r03, "forName(...)");
        f180363c = r03;
        Charset r04 = Charset.forName("UTF-16BE");
        kotlin.jvm.internal.p.k(r04, "forName(...)");
        d = r04;
        Charset r05 = Charset.forName("UTF-16LE");
        kotlin.jvm.internal.p.k(r05, "forName(...)");
        f180364e = r05;
        Charset r06 = Charset.forName("US-ASCII");
        kotlin.jvm.internal.p.k(r06, "forName(...)");
        f180365f = r06;
        Charset r07 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.p.k(r07, "forName(...)");
        f180366g = r07;
    }

    public C11850c() {
    }

    public final Charset a() {
        Charset r02 = f180368i;
        if (r02 != null) goto L6;
        Charset r03 = Charset.forName("UTF-32BE");
        kotlin.jvm.internal.p.k(r03, "forName(...)");
        f180368i = r03;
        return r03;
    L6:
        return r02;
    }

    public final Charset b() {
        Charset r02 = f180367h;
        if (r02 != null) goto L6;
        Charset r03 = Charset.forName("UTF-32LE");
        kotlin.jvm.internal.p.k(r03, "forName(...)");
        f180367h = r03;
        return r03;
    L6:
        return r02;
    }
}
