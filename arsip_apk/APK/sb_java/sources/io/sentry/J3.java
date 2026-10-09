package io.sentry;

/* loaded from: classes3.dex */
public class J3 {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC11588f2 f174822a;

    /* renamed from: b, reason: collision with root package name */
    public ScopeBindingMode f174823b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f174824c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f174825e;

    /* renamed from: f, reason: collision with root package name */
    public String f174826f;

    public J3() {
        this.f174822a = null;
        this.f174823b = ScopeBindingMode.AUTO;
        this.f174824c = false;
        this.d = false;
        this.f174825e = false;
        this.f174826f = "manual";
    }

    public String a() {
        return this.f174826f;
    }

    public ScopeBindingMode b() {
        return this.f174823b;
    }

    public AbstractC11588f2 c() {
        return this.f174822a;
    }

    public boolean d() {
        return this.f174825e;
    }

    public boolean e() {
        return this.d;
    }

    public boolean f() {
        return this.f174824c;
    }

    public void g(String r1) {
        this.f174826f = r1;
    }

    public void h(ScopeBindingMode r1) {
        this.f174823b = r1;
    }

    public void i(AbstractC11588f2 r1) {
        this.f174822a = r1;
    }

    public void j(boolean r1) {
        this.d = r1;
    }
}
