package com.stockbit.common.utils;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/stockbit/common/utils/CustomTypefaceSpan;", "Landroid/text/style/TypefaceSpan;", "family", "", "newType", "Landroid/graphics/Typeface;", "<init>", "(Ljava/lang/String;Landroid/graphics/Typeface;)V", "updateDrawState", "", "ds", "Landroid/text/TextPaint;", "updateMeasureState", "paint", "applyCustomTypeFace", "Landroid/graphics/Paint;", "tf", "common_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CustomTypefaceSpan extends TypefaceSpan {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f61882a;

    static {
    }

    public CustomTypefaceSpan(String r2, Typeface r3) {
        kotlin.jvm.internal.p.l(r2, "family");
        kotlin.jvm.internal.p.l(r3, "newType");
        super(r2);
        this.f61882a = r3;
    }

    public final void a(Paint r3, Typeface r4) {
        Typeface r02 = r3.getTypeface();
        if (r02 == null) goto L5;
        int r03 = r02.getStyle();
    L6:
        int r04 = r03 & (~r4.getStyle());
        if ((r04 & 1) == 0) goto L10;
        r3.setFakeBoldText(true);
    L10:
        if ((r04 & 2) == 0) goto L12;
        r3.setTextSkewX(-0.25f);
    L12:
        r3.setTypeface(r4);
        return;
    L5:
        r03 = 0;
        goto L6
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint r2) {
        kotlin.jvm.internal.p.l(r2, "ds");
        a(r2, this.f61882a);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint r2) {
        kotlin.jvm.internal.p.l(r2, "paint");
        a(r2, this.f61882a);
    }
}
