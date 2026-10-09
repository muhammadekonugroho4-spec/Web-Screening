package com.clevertap.android.sdk.network.http;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;
import java.util.Map;
import kotlin.collections.F;
import kotlin.io.l;
import kotlin.jvm.internal.p;
import kotlin.text.C11850c;

/* loaded from: classes4.dex */
public final class c implements Closeable, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final b f34690a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34691b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f34692c;
    public final kotlin.jvm.functions.a d;

    /* renamed from: e, reason: collision with root package name */
    public final Reader f34693e;

    public c(b r2, int r3, Map r4, InputStream r5, kotlin.jvm.functions.a r6) {
        p.l(r2, "request");
        p.l(r4, "headers");
        p.l(r6, "closeDelegate");
        this.f34690a = r2;
        this.f34691b = r3;
        this.f34692c = r4;
        this.d = r6;
        if (r5 == null) goto L5;
        BufferedReader r32 = new BufferedReader(new InputStreamReader(r5, C11850c.f180362b), UserMetadata.MAX_INTERNAL_KEY_SIZE);
    L6:
        this.f34693e = r32;
        return;
    L5:
        r32 = null;
        goto L6
    }

    public final int c() {
        return this.f34691b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Reader r02 = this.f34693e;
        if (r02 == null) goto L5;
        r02.close();
    L5:
        this.d.invoke();
    }

    public final String f(String r2) {
        p.l(r2, "header");
        List r22 = (List) this.f34692c.get(r2);
        if (r22 != null) goto L5;
        return null;
    L5:
        return (String) F.H0(r22);
    }

    public final boolean i() {
        if (this.f34691b != 200) goto L6;
        return true;
    L6:
        return false;
    }

    public final String k() {
        Reader r02 = this.f34693e;
        if (r02 != null) goto L5;
        return null;
    L5:
        return l.h(r02);
    }
}
