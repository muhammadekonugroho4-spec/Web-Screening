package com.stockbit.repository.utils;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.midtrans.sdk.corekit.core.BaseSdkBuilder;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final String f130490a;

    /* renamed from: b, reason: collision with root package name */
    public final String f130491b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f130492c;
    public final InterfaceC1179a d;

    /* renamed from: com.stockbit.repository.utils.a$a, reason: collision with other inner class name */
    public interface InterfaceC1179a {
        void a(View r1, String r2, String r3);
    }

    public a(String r2, String r3, boolean r4, InterfaceC1179a r5) {
        p.l(r2, "tag");
        p.l(r3, "symbol");
        p.l(r5, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f130490a = r2;
        this.f130491b = r3;
        this.f130492c = r4;
        this.d = r5;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View r4) {
        p.l(r4, BaseSdkBuilder.WIDGET);
        this.d.a(r4, this.f130490a, this.f130491b);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint r2) {
        p.l(r2, "ds");
        if (this.f130492c == false) goto L5;
        r2.setTypeface(Typeface.DEFAULT_BOLD);
    L6:
        r2.setUnderlineText(false);
        return;
    L5:
        super.updateDrawState(r2);
        goto L6
    }
}
