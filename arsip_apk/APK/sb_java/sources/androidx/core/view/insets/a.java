package androidx.core.view.insets;

import android.graphics.drawable.ColorDrawable;

/* loaded from: classes4.dex */
public class a extends b {

    /* renamed from: p, reason: collision with root package name */
    public final ColorDrawable f23263p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f23264q;

    /* renamed from: r, reason: collision with root package name */
    public int f23265r;

    public a(int r1) {
        super(r1);
        this.f23263p = new ColorDrawable();
        this.f23265r = 0;
    }

    @Override // androidx.core.view.insets.b
    public void a(int r2) {
        if (this.f23264q == true) goto L6;
        q(r2);
        return;
    }

    @Override // androidx.core.view.insets.b
    public boolean g() {
        return true;
    }

    public void p(int r2) {
        this.f23264q = true;
        q(r2);
    }

    public final void q(int r2) {
        if (this.f23265r == r2) goto L6;
        this.f23265r = r2;
        this.f23263p.setColor(r2);
        i(this.f23263p);
        return;
    }

    public a(int r1, int r2) {
        this(r1);
        p(r2);
    }
}
