package M0;

import android.text.TextPaint;
import android.view.View;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.a f961c;

    public b(kotlin.jvm.functions.a r1) {
        this.f961c = r1;
    }

    @Override // M0.e
    public final void a(View r2) {
        p.l(r2, "view");
        this.f961c.invoke();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint r2) {
        p.l(r2, "ds");
        super.updateDrawState(r2);
        r2.setUnderlineText(false);
    }
}
