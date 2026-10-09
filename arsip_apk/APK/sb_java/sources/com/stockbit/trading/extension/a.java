package com.stockbit.trading.extension;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.view.View;
import com.iab.digitalidentity.sdk.core.model.GoPayPlusCameraConfigKt;
import com.midtrans.sdk.corekit.core.BaseSdkBuilder;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: com.stockbit.trading.extension.a$a, reason: collision with other inner class name */
    public static final class C1329a extends ClickableSpan {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f146832a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ URLSpan f146833b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f146834c;

        public C1329a(l r1, URLSpan r2, int r3) {
            this.f146832a = r1;
            this.f146833b = r2;
            this.f146834c = r3;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View r3) {
            p.l(r3, BaseSdkBuilder.WIDGET);
            l r32 = this.f146832a;
            String r02 = this.f146833b.getURL();
            p.k(r02, "getURL(...)");
            r32.invoke(r02);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint r2) {
            p.l(r2, "ds");
            super.updateDrawState(r2);
            r2.setUnderlineText(false);
            r2.setColor(this.f146834c);
        }
    }

    public static final String a(boolean r02) {
        if (r02 == false) goto L5;
        return GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A;
    L5:
        return "0";
    }

    public static final void b(SpannableStringBuilder r4, URLSpan r5, int r6, TypefaceSpan r7, l r8) {
        p.l(r4, "<this>");
        p.l(r5, "span");
        p.l(r8, "onUrlClick");
        int r02 = r4.getSpanStart(r5);
        int r1 = r4.getSpanEnd(r5);
        int r2 = r4.getSpanFlags(r5);
        r4.setSpan(new C1329a(r8, r5, r6), r02, r1, r2);
        if (r7 == null) goto L5;
        r4.setSpan(r7, r02, r1, r2);
    L5:
        r4.removeSpan(r5);
    }

    public static final boolean c(String r1) {
        return p.g(r1, GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A);
    }
}
