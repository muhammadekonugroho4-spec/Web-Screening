package androidx.compose.ui.text.platform;

import android.text.style.ClickableSpan;
import android.view.View;
import androidx.compose.ui.text.AbstractC3818p;
import androidx.compose.ui.text.InterfaceC3820q;

/* loaded from: classes.dex */
public final class n extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3818p f20197a;

    public n(AbstractC3818p r1) {
        this.f20197a = r1;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View r2) {
        InterfaceC3820q r22 = this.f20197a.a();
        if (r22 == null) goto L6;
        r22.a(this.f20197a);
        return;
    }
}
