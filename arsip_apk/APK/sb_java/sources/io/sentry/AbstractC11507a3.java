package io.sentry;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: io.sentry.a3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11507a3 {

    /* renamed from: a, reason: collision with root package name */
    public Set f175065a;

    /* renamed from: b, reason: collision with root package name */
    public Set f175066b;

    /* renamed from: c, reason: collision with root package name */
    public String f175067c;
    public String d;

    public AbstractC11507a3() {
        this.f175065a = new CopyOnWriteArraySet();
        this.f175066b = new CopyOnWriteArraySet();
        this.f175067c = null;
        this.d = null;
    }

    public void a(String r2) {
        this.f175065a.add(r2);
        this.f175066b.remove(r2);
    }

    public Set b() {
        return this.f175065a;
    }

    public String c() {
        return this.f175067c;
    }

    public Set d() {
        return this.f175066b;
    }

    public String e() {
        return this.d;
    }

    public void f(boolean r2) {
        if (r2 == false) goto L6;
        this.f175065a.add("android.widget.ImageView");
        this.f175066b.remove("android.widget.ImageView");
        return;
    L6:
        this.f175066b.add("android.widget.ImageView");
        this.f175065a.remove("android.widget.ImageView");
    }

    public void g(boolean r2) {
        if (r2 == false) goto L6;
        this.f175065a.add("android.widget.TextView");
        this.f175066b.remove("android.widget.TextView");
        return;
    L6:
        this.f175066b.add("android.widget.TextView");
        this.f175065a.remove("android.widget.TextView");
    }

    public abstract void h();
}
