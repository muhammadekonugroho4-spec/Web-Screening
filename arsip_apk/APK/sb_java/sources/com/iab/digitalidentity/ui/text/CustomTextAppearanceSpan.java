package com.iab.digitalidentity.ui.text;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import com.iab.digitalidentity.ui.theme.commons.l;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/iab/digitalidentity/ui/text/CustomTextAppearanceSpan;", "Landroid/text/style/TextAppearanceSpan;", "Lcom/iab/digitalidentity/ui/theme/commons/l;", "appearance", "<init>", "(Lcom/iab/digitalidentity/ui/theme/commons/l;)V", "Landroid/text/TextPaint;", "ds", "Lkotlin/w;", "updateDrawState", "(Landroid/text/TextPaint;)V", "updateMeasureState", "a", "Lcom/iab/digitalidentity/ui/theme/commons/l;", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CustomTextAppearanceSpan extends TextAppearanceSpan {

    /* renamed from: a, reason: collision with root package name */
    public final l f40701a;

    public CustomTextAppearanceSpan(l r8) {
        p.l(r8, "appearance");
        super(null, 0, 0, null, null);
        this.f40701a = r8;
    }

    @Override // android.text.style.TextAppearanceSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint r5) {
        p.l(r5, "ds");
        super.updateDrawState(r5);
        l r02 = this.f40701a;
        Typeface r1 = r02.a();
        if (r1 == null) goto L5;
        r5.setTypeface(r1);
    L5:
        Float r12 = r02.c();
        if (r12 == null) goto L8;
        r5.setTextSize(TypedValue.applyDimension(2, r12.floatValue(), Resources.getSystem().getDisplayMetrics()));
    L8:
        Integer r03 = r02.b();
        if (r03 == null) goto L12;
        r5.setColor(r03.intValue());
        return;
    }

    @Override // android.text.style.TextAppearanceSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint r5) {
        p.l(r5, "ds");
        super.updateMeasureState(r5);
        l r02 = this.f40701a;
        Typeface r1 = r02.a();
        if (r1 == null) goto L5;
        r5.setTypeface(r1);
    L5:
        Float r12 = r02.c();
        if (r12 == null) goto L8;
        r5.setTextSize(TypedValue.applyDimension(2, r12.floatValue(), Resources.getSystem().getDisplayMetrics()));
    L8:
        Integer r03 = r02.b();
        if (r03 == null) goto L12;
        r5.setColor(r03.intValue());
        return;
    }
}
