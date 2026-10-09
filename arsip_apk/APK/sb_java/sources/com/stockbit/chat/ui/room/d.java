package com.stockbit.chat.ui.room;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.midtrans.sdk.corekit.core.BaseSdkBuilder;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class d extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final String f58167a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58168b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f58169c;
    public final a d;

    public interface a {
        void a(View r1, String r2, String r3);
    }

    static {
    }

    public d(String r2, String r3, boolean r4, a r5) {
        p.l(r2, "tag");
        p.l(r3, "symbol");
        p.l(r5, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f58167a = r2;
        this.f58168b = r3;
        this.f58169c = r4;
        this.d = r5;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View r4) {
        p.l(r4, BaseSdkBuilder.WIDGET);
        this.d.a(r4, this.f58167a, this.f58168b);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint r2) {
        p.l(r2, "ds");
        if (this.f58169c == false) goto L5;
        r2.setTypeface(Typeface.DEFAULT_BOLD);
    L6:
        r2.setUnderlineText(false);
        return;
    L5:
        super.updateDrawState(r2);
        goto L6
    }
}
