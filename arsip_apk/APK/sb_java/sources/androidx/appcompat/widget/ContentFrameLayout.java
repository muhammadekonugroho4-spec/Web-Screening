package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.google.common.primitives.Ints;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f3336a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f3337b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f3338c;
    public TypedValue d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f3339e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f3340f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f3341g;

    /* renamed from: h, reason: collision with root package name */
    public a f3342h;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context r2) {
        this(r2, null);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f3339e != null) goto L6;
        this.f3339e = new TypedValue();
    L6:
        return this.f3339e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f3340f != null) goto L6;
        this.f3340f = new TypedValue();
    L6:
        return this.f3340f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f3338c != null) goto L6;
        this.f3338c = new TypedValue();
    L6:
        return this.f3338c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.d != null) goto L6;
        this.d = new TypedValue();
    L6:
        return this.d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f3336a != null) goto L6;
        this.f3336a = new TypedValue();
    L6:
        return this.f3336a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f3337b != null) goto L6;
        this.f3337b = new TypedValue();
    L6:
        return this.f3337b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a r02 = this.f3342h;
        if (r02 == null) goto L6;
        r02.a();
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a r02 = this.f3342h;
        if (r02 == null) goto L6;
        r02.onDetachedFromWindow();
        return;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int r14, int r15) {
        DisplayMetrics r02 = getContext().getResources().getDisplayMetrics();
        boolean r3 = true;
        if (r02.widthPixels >= r02.heightPixels) goto L5;
        boolean r1 = true;
    L6:
        int r2 = View.MeasureSpec.getMode(r14);
        int r5 = View.MeasureSpec.getMode(r15);
        if (r2 != Integer.MIN_VALUE) goto L22;
        if (r1 == false) goto L10;
        TypedValue r10 = this.d;
    L11:
        if (r10 == null) goto L22;
        int r11 = r10.type;
        if (r11 == 0) goto L22;
        if (r11 != 5) goto L17;
        float r102 = r10.getDimension(r02);
    L16:
        int r103 = (int) r102;
    L20:
        if (r103 <= 0) goto L22;
        Rect r112 = this.f3341g;
        r14 = View.MeasureSpec.makeMeasureSpec(Math.min(r103 - (r112.left + r112.right), View.MeasureSpec.getSize(r14)), Ints.MAX_POWER_OF_TWO);
        boolean r104 = true;
    L23:
        if (r5 != Integer.MIN_VALUE) goto L38;
        if (r1 == false) goto L26;
        TypedValue r52 = this.f3339e;
    L27:
        if (r52 == null) goto L38;
        int r113 = r52.type;
        if (r113 == 0) goto L38;
        if (r113 != 5) goto L33;
        float r53 = r52.getDimension(r02);
    L32:
        int r54 = (int) r53;
    L36:
        if (r54 <= 0) goto L38;
        Rect r114 = this.f3341g;
        r15 = View.MeasureSpec.makeMeasureSpec(Math.min(r54 - (r114.top + r114.bottom), View.MeasureSpec.getSize(r15)), Ints.MAX_POWER_OF_TWO);
        goto L38
    L33:
        if (r113 != 6) goto L35;
        int r115 = r02.heightPixels;
        r53 = r52.getFraction(r115, r115);
        goto L32
    L35:
        r54 = 0;
        goto L36
    L26:
        r52 = this.f3340f;
    L38:
        super.onMeasure(r14, r15);
        int r142 = getMeasuredWidth();
        int r55 = View.MeasureSpec.makeMeasureSpec(r142, Ints.MAX_POWER_OF_TWO);
        if (r104 == true) goto L57;
        if (r2 != Integer.MIN_VALUE) goto L57;
        if (r1 == false) goto L43;
        TypedValue r12 = this.f3337b;
    L44:
        if (r12 == null) goto L57;
        int r22 = r12.type;
        if (r22 == 0) goto L57;
        if (r22 != 5) goto L50;
        float r03 = r12.getDimension(r02);
    L49:
        int r04 = (int) r03;
    L53:
        if (r04 <= 0) goto L55;
        Rect r13 = this.f3341g;
        r04 = r04 - (r13.left + r13.right);
    L55:
        if (r142 >= r04) goto L57;
        r55 = View.MeasureSpec.makeMeasureSpec(r04, Ints.MAX_POWER_OF_TWO);
    L58:
        if (r3 == false) goto L61;
        super.onMeasure(r55, r15);
        return;
    L61:
        return;
    L50:
        if (r22 != 6) goto L52;
        int r05 = r02.widthPixels;
        r03 = r12.getFraction(r05, r05);
        goto L49
    L52:
        r04 = 0;
        goto L53
    L43:
        r12 = this.f3336a;
    L57:
        r3 = false;
        goto L58
    L17:
        if (r11 != 6) goto L19;
        int r116 = r02.widthPixels;
        r102 = r10.getFraction(r116, r116);
        goto L16
    L19:
        r103 = 0;
        goto L20
    L10:
        r10 = this.f3338c;
    L22:
        r104 = false;
        goto L23
    L5:
        r1 = false;
        goto L6
    }

    public void setAttachListener(a r1) {
        this.f3342h = r1;
    }

    public void setDecorPadding(int r2, int r3, int r4, int r5) {
        this.f3341g.set(r2, r3, r4, r5);
        if (isLaidOut() == false) goto L6;
        requestLayout();
        return;
    }

    public ContentFrameLayout(Context r2, AttributeSet r3) {
        this(r2, r3, 0);
    }

    public ContentFrameLayout(Context r1, AttributeSet r2, int r3) {
        super(r1, r2, r3);
        this.f3341g = new Rect();
    }
}
