package com.stockbit.transferstock.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.messaging.Constants;
import com.stockbit.common.j;
import com.stockbit.common.l;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\rJ\u001a\u0010)\u001a\u00020*2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010+\u001a\u00020*H\u0014J\u0019\u0010,\u001a\u00020\f2\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0002\u0010.R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u001aR\"\u0010 \u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010&\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$¨\u0006/"}, d2 = {"Lcom/stockbit/transferstock/utils/StockbitLabelAndText;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", Constants.KEY_KEY, "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "labelTv", "Landroid/widget/TextView;", "getLabelTv", "()Landroid/widget/TextView;", "setLabelTv", "(Landroid/widget/TextView;)V", "textTv", "value", Constants.ScionAnalytics.PARAM_LABEL, "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", com.clevertap.android.sdk.Constants.KEY_TEXT, "getText", "setText", "getKey", "setKey", "paddingTop", "getPaddingTop", "()Ljava/lang/Integer;", "setPaddingTop", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "paddingBottom", "getPaddingBottom", "setPaddingBottom", "setupProperty", "", "onAttachedToWindow", "getPx", "dimen", "(Ljava/lang/Integer;)I", "transferstock_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StockbitLabelAndText extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public TextView f151193a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f151194b;

    /* renamed from: c, reason: collision with root package name */
    public String f151195c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f151196e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f151197f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f151198g;

    static {
    }

    public StockbitLabelAndText(Context r2, String r3) {
        p.l(r2, "context");
        super(r2);
        b(r2, r3);
    }

    public final int a(Integer r2) {
        if (r2 == null) goto L5;
        int r22 = r2.intValue();
        return getContext().getResources().getDimensionPixelSize(r22);
    L5:
        return 0;
    }

    public final void b(Context r3, String r4) {
        LayoutInflater.from(r3).inflate(l.f60810I, this, true);
        this.f151193a = (TextView) findViewById(j.d6);
        this.f151194b = (TextView) findViewById(j.k7);
        this.f151196e = r4;
    }

    public final String getKey() {
        return this.f151196e;
    }

    public final String getLabel() {
        return this.f151195c;
    }

    public final TextView getLabelTv() {
        return this.f151193a;
    }

    @Override // android.view.View
    public final Integer getPaddingBottom() {
        return this.f151198g;
    }

    @Override // android.view.View
    public final Integer getPaddingTop() {
        return this.f151197f;
    }

    public final String getText() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPadding(0, a(this.f151197f), 0, a(this.f151198g));
    }

    public final void setKey(String r1) {
        this.f151196e = r1;
    }

    public final void setLabel(String r2) {
        TextView r02 = this.f151193a;
        if (r02 == null) goto L5;
        r02.setText(r2);
    L5:
        this.f151195c = r2;
    }

    public final void setLabelTv(TextView r1) {
        this.f151193a = r1;
    }

    public final void setPaddingBottom(Integer r1) {
        this.f151198g = r1;
    }

    public final void setPaddingTop(Integer r1) {
        this.f151197f = r1;
    }

    public final void setText(String r2) {
        TextView r02 = this.f151194b;
        if (r02 == null) goto L5;
        r02.setText(r2);
    L5:
        this.d = r2;
    }

    public /* synthetic */ StockbitLabelAndText(Context r1, String r2, int r3, i r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        this(r1, r2);
    }

    public StockbitLabelAndText(Context r2, AttributeSet r3) {
        p.l(r2, "context");
        p.l(r3, "attrs");
        super(r2, r3);
        b(r2, null);
    }

    public StockbitLabelAndText(Context r2, AttributeSet r3, int r4) {
        p.l(r2, "context");
        p.l(r3, "attrs");
        super(r2, r3, r4);
        b(r2, null);
    }
}
