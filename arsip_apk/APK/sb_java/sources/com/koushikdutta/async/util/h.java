package com.koushikdutta.async.util;

import java.util.Hashtable;

/* loaded from: classes6.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public Hashtable f41672a;

    public h() {
        this.f41672a = new Hashtable();
    }

    public Object a(String r2) {
        return this.f41672a.get(r2);
    }

    public void b(String r2, Object r3) {
        this.f41672a.put(r2, r3);
    }

    public void c(String r2) {
        this.f41672a.remove(r2);
    }
}
