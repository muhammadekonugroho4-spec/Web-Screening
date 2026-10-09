package org.slf4j.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes3.dex */
public class c implements org.slf4j.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f183035a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f183036b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedBlockingQueue f183037c;

    public c() {
        this.f183035a = false;
        this.f183036b = new HashMap();
        this.f183037c = new LinkedBlockingQueue();
    }

    @Override // org.slf4j.a
    public synchronized org.slf4j.b a(String r4) {
        monitor-enter(this);
        b r02 = (b) this.f183036b.get(r4);     // Catch: Throwable -> L7
        if (r02 != null) goto L9;
        r02 = new b(r4, this.f183037c, this.f183035a);     // Catch: Throwable -> L7
        this.f183036b.put(r4, r02);     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
        return r02;
    L7:
        th = move-exception;
        throw th;
    }

    public void b() {
        this.f183036b.clear();
        this.f183037c.clear();
    }

    public LinkedBlockingQueue c() {
        return this.f183037c;
    }

    public List d() {
        return new ArrayList(this.f183036b.values());
    }

    public void e() {
        this.f183035a = true;
    }
}
