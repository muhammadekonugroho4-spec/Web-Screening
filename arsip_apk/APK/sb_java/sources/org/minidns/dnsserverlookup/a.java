package org.minidns.dnsserverlookup;

import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class a implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f182754c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f182755a;

    /* renamed from: b, reason: collision with root package name */
    public final int f182756b;

    static {
        f182754c = Logger.getLogger(a.class.getName());
    }

    public a(String r1, int r2) {
        this.f182755a = r1;
        this.f182756b = r2;
    }

    @Override // org.minidns.dnsserverlookup.d
    public final int E() {
        return this.f182756b;
    }

    public final int a(d r2) {
        return Integer.compare(E(), r2.E());
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return a((d) r1);
    }

    @Override // org.minidns.dnsserverlookup.d
    public final String getName() {
        return this.f182755a;
    }
}
