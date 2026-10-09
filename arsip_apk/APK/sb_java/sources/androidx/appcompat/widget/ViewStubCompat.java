package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f3579a;

    /* renamed from: b, reason: collision with root package name */
    public int f3580b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f3581c;
    public LayoutInflater d;

    public interface a {
    }

    public ViewStubCompat(Context r2, AttributeSet r3) {
        this(r2, r3, 0);
    }

    public View a() {
        ViewParent r02 = getParent();
        if ((r02 instanceof ViewGroup) == false) goto L22;
        if (this.f3579a == 0) goto L20;
        ViewGroup r03 = (ViewGroup) r02;
        LayoutInflater r1 = this.d;
        if (r1 != null) goto L10;
        r1 = LayoutInflater.from(getContext());
    L10:
        View r12 = r1.inflate(this.f3579a, r03, false);
        int r2 = this.f3580b;
        if (r2 == (-1)) goto L13;
        r12.setId(r2);
    L13:
        int r22 = r03.indexOfChild(this);
        r03.removeViewInLayout(this);
        ViewGroup.LayoutParams r3 = getLayoutParams();
        if (r3 == null) goto L16;
        r03.addView(r12, r22, r3);
    L17:
        this.f3581c = new WeakReference(r12);
        return r12;
    L16:
        r03.addView(r12, r22);
        goto L17
    L20:
        throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
    L22:
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas r1) {
    }

    @Override // android.view.View
    public void draw(Canvas r1) {
    }

    public int getInflatedId() {
        return this.f3580b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.d;
    }

    public int getLayoutResource() {
        return this.f3579a;
    }

    @Override // android.view.View
    public void onMeasure(int r1, int r2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int r1) {
        this.f3580b = r1;
    }

    public void setLayoutInflater(LayoutInflater r1) {
        this.d = r1;
    }

    public void setLayoutResource(int r1) {
        this.f3579a = r1;
    }

    public void setOnInflateListener(a r1) {
    }

    @Override // android.view.View
    public void setVisibility(int r2) {
        WeakReference r02 = this.f3581c;
        if (r02 == null) goto L10;
        View r03 = (View) r02.get();
        if (r03 == null) goto L9;
        r03.setVisibility(r2);
        return;
    L9:
        throw new IllegalStateException("setVisibility called on un-referenced view");
    L10:
        super.setVisibility(r2);
        if (r2 != 0) goto L13;
    L16:
        a();
        return;
    L13:
        if (r2 == 4) goto L16;
    }

    public ViewStubCompat(Context r3, AttributeSet r4, int r5) {
        super(r3, r4, r5);
        this.f3579a = 0;
        TypedArray r32 = r3.obtainStyledAttributes(r4, androidx.appcompat.j.e4, r5, 0);
        this.f3580b = r32.getResourceId(androidx.appcompat.j.h4, -1);
        this.f3579a = r32.getResourceId(androidx.appcompat.j.g4, 0);
        setId(r32.getResourceId(androidx.appcompat.j.f4, -1));
        r32.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
