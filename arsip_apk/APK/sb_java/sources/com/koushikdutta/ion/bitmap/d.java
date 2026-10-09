package com.koushikdutta.ion.bitmap;

/* loaded from: classes6.dex */
public class d extends com.koushikdutta.async.util.f {

    /* renamed from: i, reason: collision with root package name */
    public g f41744i;

    public d(int r3) {
        super(r3);
        this.f41744i = new g();
    }

    @Override // com.koushikdutta.async.util.f
    public /* bridge */ /* synthetic */ void b(boolean r1, Object r2, Object r3, Object r4) {
        k(r1, (String) r2, (a) r3, (a) r4);
    }

    @Override // com.koushikdutta.async.util.f
    public /* bridge */ /* synthetic */ long i(Object r1, Object r2) {
        return n((String) r1, (a) r2);
    }

    public void k(boolean r1, String r2, a r3, a r4) {
        super.b(r1, r2, r3, r4);
        if (r1 == false) goto L6;
        this.f41744i.b(r2, r3);
        return;
    }

    public a l(String r2) {
        a r02 = (a) c(r2);
        if (r02 == null) goto L5;
        return r02;
    L5:
        a r03 = (a) this.f41744i.c(r2);
        if (r03 == null) goto L8;
        e(r2, r03);
    L8:
        return r03;
    }

    public void m(String r2, a r3) {
        this.f41744i.b(r2, r3);
    }

    public long n(String r1, a r2) {
        return r2.a();
    }
}
