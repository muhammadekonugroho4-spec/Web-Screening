package com.stockbit.uikit.input;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b'\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\rJ*\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\b\u0010\u001f\u001a\u00020 H&J\b\u0010!\u001a\u00020\u0019H&J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H&J\b\u0010%\u001a\u00020\u0019H&J\b\u0010&\u001a\u00020\u000fH&J\b\u0010'\u001a\u00020\u000fH&J\b\u0010(\u001a\u00020\u000fH&J\b\u0010)\u001a\u00020\u000fH&J\b\u0010*\u001a\u00020\u000fH&J\b\u0010+\u001a\u00020\u0019H&J\b\u0010,\u001a\u00020\u0019H&J\b\u0010-\u001a\u00020\u0019H&J\b\u0010.\u001a\u00020\u0019H&J\b\u0010/\u001a\u00020\u0019H&J\b\u00100\u001a\u00020\u0019H&J\b\u00101\u001a\u00020\u0019H\u0016R\u0018\u0010\u000e\u001a\u00020\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u00020\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0015\u001a\u00020\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R&\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u00062"}, d2 = {"Lcom/stockbit/uikit/input/BaseInputComponent;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "isHighlighted", "", "()Z", "setHighlighted", "(Z)V", "isFixed", "setFixed", "isError", "setError", "focusChangedListener", "Lkotlin/Function1;", "", "getFocusChangedListener", "()Lkotlin/jvm/functions/Function1;", "setFocusChangedListener", "(Lkotlin/jvm/functions/Function1;)V", "initComponent", "getDeclareStyleable", "", "initView", "applyAttributes", "typedArray", "Landroid/content/res/TypedArray;", "applyListeners", "shouldApplyActiveState", "shouldApplyHighlightedState", "shouldApplyFixedState", "shouldApplyErrorState", "shouldApplyDisabledState", "applyDefaultStateConfig", "applyActiveStateConfig", "applyHighlightedStateConfig", "applyFixedStateConfig", "applyErrorStateConfig", "applyDisabledStateConfig", "invalidateViewByState", "uikit_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BaseInputComponent extends FrameLayout {
    static {
    }

    public BaseInputComponent(Context r3) {
        kotlin.jvm.internal.p.l(r3, "context");
        this(r3, null, 0);
    }

    public abstract void a();

    public abstract void b(TypedArray r1);

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract int[] getDeclareStyleable();

    public abstract kotlin.jvm.functions.l getFocusChangedListener();

    public abstract void h();

    public final void i(Context r2, AttributeSet r3, int r4, int r5) {
        j();
        TypedArray r22 = r2.getTheme().obtainStyledAttributes(r3, getDeclareStyleable(), r4, r5);
        kotlin.jvm.internal.p.k(r22, "obtainStyledAttributes(...)");
        b(r22);
        r22.recycle();
        h();
        k();
    }

    public abstract void j();

    public void k() {
        if (m() == false) goto L7;
        d();
        return;
    L7:
        if (o() == false) goto L11;
        f();
        return;
    L11:
        if (n() == false) goto L15;
        e();
        return;
    L15:
        if (p() == false) goto L19;
        g();
        return;
    L19:
        if (l() == false) goto L22;
        a();
        return;
    L22:
        c();
    }

    public abstract boolean l();

    public abstract boolean m();

    public abstract boolean n();

    public abstract boolean o();

    public abstract boolean p();

    public abstract void setError(boolean r1);

    public abstract void setFixed(boolean r1);

    public abstract void setFocusChangedListener(kotlin.jvm.functions.l r1);

    public abstract void setHighlighted(boolean r1);

    public BaseInputComponent(Context r2, AttributeSet r3) {
        kotlin.jvm.internal.p.l(r2, "context");
        kotlin.jvm.internal.p.l(r3, "attrs");
        this(r2, r3, 0, 0);
    }

    public BaseInputComponent(Context r2, AttributeSet r3, int r4) {
        kotlin.jvm.internal.p.l(r2, "context");
        this(r2, r3, r4, 0);
    }

    public BaseInputComponent(Context r2, AttributeSet r3, int r4, int r5) {
        kotlin.jvm.internal.p.l(r2, "context");
        super(r2, r3, r4, r5);
        i(r2, r3, r4, r5);
    }
}
