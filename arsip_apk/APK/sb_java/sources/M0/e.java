package M0;

import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public abstract class e extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final long f965a;

    /* renamed from: b, reason: collision with root package name */
    public long f966b;

    public e() {
        this.f965a = 750;
    }

    public abstract void a(View r1);

    @Override // android.text.style.ClickableSpan
    public void onClick(View r5) {
        p.l(r5, "p0");
        if ((System.currentTimeMillis() - this.f966b) <= this.f965a) goto L5;
        a(r5);
    L5:
        this.f966b = System.currentTimeMillis();
    }
}
