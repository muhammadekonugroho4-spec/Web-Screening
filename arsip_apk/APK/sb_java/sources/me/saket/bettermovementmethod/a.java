package me.saket.bettermovementmethod;

import android.graphics.RectF;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.view.MotionEvent;
import android.widget.TextView;

/* loaded from: classes3.dex */
public class a extends LinkMovementMethod {

    /* renamed from: h, reason: collision with root package name */
    public static a f181048h;

    /* renamed from: a, reason: collision with root package name */
    public c f181049a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f181050b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f181051c;
    public ClickableSpan d;

    /* renamed from: e, reason: collision with root package name */
    public int f181052e;

    /* renamed from: f, reason: collision with root package name */
    public b f181053f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f181054g;

    /* renamed from: me.saket.bettermovementmethod.a$a, reason: collision with other inner class name */
    public static class C1929a {

        /* renamed from: a, reason: collision with root package name */
        public ClickableSpan f181055a;

        /* renamed from: b, reason: collision with root package name */
        public String f181056b;

        public C1929a(ClickableSpan r1, String r2) {
            this.f181055a = r1;
            this.f181056b = r2;
        }

        public static C1929a a(TextView r2, ClickableSpan r3) {
            Spanned r22 = (Spanned) r2.getText();
            if ((r3 instanceof URLSpan) == false) goto L5;
            String r23 = ((URLSpan) r3).getURL();
        L7:
            return new C1929a(r3, r23);
        L5:
            r23 = r22.subSequence(r22.getSpanStart(r3), r22.getSpanEnd(r3)).toString();
            goto L7
        }

        public ClickableSpan b() {
            return this.f181055a;
        }

        public String c() {
            return this.f181056b;
        }
    }

    public static final class b implements Runnable {
    }

    public interface c {
        boolean a(TextView r1, String r2);
    }

    public a() {
        this.f181050b = new RectF();
    }

    public static void a(int r02, a r1, TextView r2) {
        r2.setMovementMethod(r1);
        if (r02 == (-2)) goto L6;
        Linkify.addLinks(r2, r02);
        return;
    }

    public static a f(int r4, TextView... r5) {
        a r02 = g();
        int r1 = r5.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        a(r4, r02, r5[r2]);
        r2 = r2 + 1;
        goto L3
    L5:
        return r02;
    }

    public static a g() {
        return new a();
    }

    public final void b(TextView r2) {
        this.f181054g = false;
        this.d = null;
        i(r2);
        h(r2);
    }

    public void c(TextView r3, ClickableSpan r4) {
        C1929a r42 = C1929a.a(r3, r4);
        c r02 = this.f181049a;
        if (r02 != null) goto L5;
    L7:
        r42.b().onClick(r3);
        return;
    L5:
        if (r02.a(r3, r42.c()) == false) goto L7;
    }

    public ClickableSpan d(TextView r8, Spannable r9, MotionEvent r10) {
        int r02 = (int) r10.getX();
        int r102 = (int) r10.getY();
        int r03 = r02 - r8.getTotalPaddingLeft();
        int r103 = r102 - r8.getTotalPaddingTop();
        int r04 = r03 + r8.getScrollX();
        int r104 = r103 + r8.getScrollY();
        Layout r82 = r8.getLayout();
        int r1 = r82.getLineForVertical(r104);
        float r05 = r04;
        int r2 = r82.getOffsetForHorizontal(r1, r05);
        this.f181050b.left = r82.getLineLeft(r1);
        this.f181050b.top = r82.getLineTop(r1);
        RectF r3 = this.f181050b;
        float r4 = r82.getLineWidth(r1);
        RectF r5 = this.f181050b;
        r3.right = r4 + r5.left;
        r5.bottom = r82.getLineBottom(r1);
        if (this.f181050b.contains(r05, r104) == false) goto L11;
        Object[] r83 = r9.getSpans(r2, r2, ClickableSpan.class);
        int r92 = r83.length;
        int r06 = 0;
    L5:
        if (r06 >= r92) goto L11;
        Object r12 = r83[r06];
        if ((r12 instanceof ClickableSpan) == true) goto L9;
        r06 = r06 + 1;
        goto L5
    L9:
        return (ClickableSpan) r12;
    L11:
        return null;
    }

    public void e(TextView r4, ClickableSpan r5, Spannable r6) {
        if (this.f181051c == false) goto L5;
        return;
    L5:
        this.f181051c = true;
        int r02 = r6.getSpanStart(r5);
        int r52 = r6.getSpanEnd(r5);
        BackgroundColorSpan r1 = new BackgroundColorSpan(r4.getHighlightColor());
        r6.setSpan(r1, r02, r52, 18);
        r4.setTag(me.saket.bettermovementmethod.b.f181057a, r1);
        Selection.setSelection(r6, r02, r52);
    }

    public void h(TextView r1) {
    }

    public void i(TextView r3) {
        if (this.f181051c == true) goto L5;
        return;
    L5:
        this.f181051c = false;
        Spannable r02 = (Spannable) r3.getText();
        r02.removeSpan((BackgroundColorSpan) r3.getTag(me.saket.bettermovementmethod.b.f181057a));
        Selection.removeSelection(r02);
    }

    public a j(c r2) {
        if (this == f181048h) goto L7;
        this.f181049a = r2;
        return this;
    L7:
        throw new UnsupportedOperationException("Setting a click listener on the instance returned by getInstance() is not supported to avoid memory leaks. Please use newInstance() or any of the linkify() methods instead.");
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView r5, Spannable r6, MotionEvent r7) {
        if (this.f181052e == r5.hashCode()) goto L5;
        this.f181052e = r5.hashCode();
        r5.setAutoLinkMask(0);
    L5:
        ClickableSpan r02 = d(r5, r6, r7);
        if (r7.getAction() != 0) goto L9;
        this.d = r02;
    L9:
        if (this.d == null) goto L11;
        boolean r1 = true;
    L12:
        int r72 = r7.getAction();
        if (r72 == 0) goto L40;
        if (r72 == 1) goto L33;
        if (r72 == 2) goto L23;
        if (r72 == 3) goto L20;
        return false;
    L20:
        b(r5);
        return false;
    L23:
        if (r02 == this.d) goto L26;
        h(r5);
    L26:
        if (this.f181054g == true) goto L31;
        if (r02 == null) goto L30;
        e(r5, r02, r6);
        return r1;
    L30:
        i(r5);
    L31:
        return r1;
    L33:
        if (this.f181054g == true) goto L38;
        if (r1 == false) goto L38;
        if (r02 != this.d) goto L38;
        c(r5, r02);
    L38:
        b(r5);
        return r1;
    L40:
        if (r02 == null) goto L42;
        e(r5, r02, r6);
    L42:
        return r1;
    L11:
        r1 = false;
        goto L12
    }
}
