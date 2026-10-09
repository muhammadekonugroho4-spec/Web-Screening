package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.h;

/* loaded from: classes.dex */
public class M {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3436a;

    /* renamed from: b, reason: collision with root package name */
    public final TypedArray f3437b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f3438c;

    public M(Context r1, TypedArray r2) {
        this.f3436a = r1;
        this.f3437b = r2;
    }

    public static M t(Context r1, int r2, int[] r3) {
        return new M(r1, r1.obtainStyledAttributes(r2, r3));
    }

    public static M u(Context r1, AttributeSet r2, int[] r3) {
        return new M(r1, r1.obtainStyledAttributes(r2, r3));
    }

    public static M v(Context r1, AttributeSet r2, int[] r3, int r4, int r5) {
        return new M(r1, r1.obtainStyledAttributes(r2, r3, r4, r5));
    }

    public boolean a(int r2, boolean r3) {
        return this.f3437b.getBoolean(r2, r3);
    }

    public int b(int r2, int r3) {
        return this.f3437b.getColor(r2, r3);
    }

    public ColorStateList c(int r3) {
        if (this.f3437b.hasValue(r3) == false) goto L10;
        int r02 = this.f3437b.getResourceId(r3, 0);
        if (r02 == 0) goto L10;
        ColorStateList r03 = androidx.appcompat.content.res.a.a(this.f3436a, r02);
        if (r03 == null) goto L10;
        return r03;
    L10:
        return this.f3437b.getColorStateList(r3);
    }

    public float d(int r2, float r3) {
        return this.f3437b.getDimension(r2, r3);
    }

    public int e(int r2, int r3) {
        return this.f3437b.getDimensionPixelOffset(r2, r3);
    }

    public int f(int r2, int r3) {
        return this.f3437b.getDimensionPixelSize(r2, r3);
    }

    public Drawable g(int r3) {
        if (this.f3437b.hasValue(r3) == false) goto L9;
        int r02 = this.f3437b.getResourceId(r3, 0);
        if (r02 == 0) goto L9;
        return androidx.appcompat.content.res.a.b(this.f3436a, r02);
    L9:
        return this.f3437b.getDrawable(r3);
    }

    public Drawable h(int r4) {
        if (this.f3437b.hasValue(r4) == false) goto L8;
        int r42 = this.f3437b.getResourceId(r4, 0);
        if (r42 != 0) goto L7;
        return null;
    L7:
        return C2090g.b().d(this.f3436a, r42, true);
    L8:
        return null;
    }

    public float i(int r2, float r3) {
        return this.f3437b.getFloat(r2, r3);
    }

    public Typeface j(int r3, int r4, h.e r5) {
        int r32 = this.f3437b.getResourceId(r3, 0);
        if (r32 != 0) goto L7;
        return null;
    L7:
        if (this.f3438c != null) goto L10;
        this.f3438c = new TypedValue();
    L10:
        return androidx.core.content.res.h.i(this.f3436a, r32, this.f3438c, r4, r5);
    }

    public int k(int r2, int r3) {
        return this.f3437b.getInt(r2, r3);
    }

    public int l(int r2, int r3) {
        return this.f3437b.getInteger(r2, r3);
    }

    public int m(int r2, int r3) {
        return this.f3437b.getLayoutDimension(r2, r3);
    }

    public int n(int r2, int r3) {
        return this.f3437b.getResourceId(r2, r3);
    }

    public String o(int r2) {
        return this.f3437b.getString(r2);
    }

    public CharSequence p(int r2) {
        return this.f3437b.getText(r2);
    }

    public CharSequence[] q(int r2) {
        return this.f3437b.getTextArray(r2);
    }

    public TypedArray r() {
        return this.f3437b;
    }

    public boolean s(int r2) {
        return this.f3437b.hasValue(r2);
    }

    public TypedValue w(int r2) {
        return this.f3437b.peekValue(r2);
    }

    public void x() {
        this.f3437b.recycle();
    }
}
