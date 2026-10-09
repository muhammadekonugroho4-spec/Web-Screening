package com.midtrans.sdk.uikit.widgets;

import a.a.a.a.e.b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.midtrans.sdk.uikit.l;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class FancyButton extends LinearLayout {

    /* renamed from: I, reason: collision with root package name */
    public static final String f43388I = "FancyButton";

    /* renamed from: A, reason: collision with root package name */
    public String f43389A;

    /* renamed from: B, reason: collision with root package name */
    public String f43390B;

    /* renamed from: C, reason: collision with root package name */
    public ImageView f43391C;

    /* renamed from: D, reason: collision with root package name */
    public TextView f43392D;

    /* renamed from: E, reason: collision with root package name */
    public TextView f43393E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f43394F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f43395G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f43396H;

    /* renamed from: a, reason: collision with root package name */
    public Context f43397a;

    /* renamed from: b, reason: collision with root package name */
    public int f43398b;

    /* renamed from: c, reason: collision with root package name */
    public int f43399c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f43400e;

    /* renamed from: f, reason: collision with root package name */
    public int f43401f;

    /* renamed from: g, reason: collision with root package name */
    public int f43402g;

    /* renamed from: h, reason: collision with root package name */
    public int f43403h;

    /* renamed from: i, reason: collision with root package name */
    public int f43404i;

    /* renamed from: j, reason: collision with root package name */
    public int f43405j;

    /* renamed from: k, reason: collision with root package name */
    public String f43406k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f43407l;

    /* renamed from: m, reason: collision with root package name */
    public int f43408m;

    /* renamed from: n, reason: collision with root package name */
    public String f43409n;

    /* renamed from: o, reason: collision with root package name */
    public int f43410o;

    /* renamed from: p, reason: collision with root package name */
    public int f43411p;

    /* renamed from: q, reason: collision with root package name */
    public int f43412q;

    /* renamed from: r, reason: collision with root package name */
    public int f43413r;

    /* renamed from: s, reason: collision with root package name */
    public int f43414s;

    /* renamed from: t, reason: collision with root package name */
    public int f43415t;

    /* renamed from: u, reason: collision with root package name */
    public int f43416u;

    /* renamed from: v, reason: collision with root package name */
    public int f43417v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f43418w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f43419x;

    /* renamed from: y, reason: collision with root package name */
    public Typeface f43420y;

    /* renamed from: z, reason: collision with root package name */
    public Typeface f43421z;

    static {
    }

    public FancyButton(Context r5) {
        super(r5);
        this.f43398b = -16777216;
        this.f43399c = 0;
        this.d = Color.parseColor("#f6f7f9");
        this.f43400e = Color.parseColor("#bec2c9");
        this.f43401f = Color.parseColor("#dddfe2");
        this.f43402g = -1;
        this.f43403h = -1;
        this.f43404i = b.d(getContext(), 15.0f);
        this.f43405j = 17;
        this.f43406k = null;
        this.f43407l = null;
        this.f43408m = b.d(getContext(), 15.0f);
        this.f43409n = null;
        this.f43410o = 1;
        this.f43411p = 10;
        this.f43412q = 10;
        this.f43413r = 0;
        this.f43414s = 0;
        this.f43415t = 0;
        this.f43416u = 0;
        this.f43417v = 0;
        this.f43418w = true;
        this.f43419x = false;
        this.f43420y = null;
        this.f43421z = null;
        this.f43389A = "fontawesome.ttf";
        this.f43390B = "robotoregular.ttf";
        this.f43394F = false;
        this.f43395G = false;
        this.f43396H = true;
        this.f43397a = r5;
        this.f43420y = b.b(r5, "robotoregular.ttf", null);
        this.f43421z = b.b(this.f43397a, this.f43389A, null);
        d();
    }

    public final Drawable a(Drawable r2, Drawable r3, Drawable r4) {
        if (this.f43418w == true) goto L6;
        return r4;
    L6:
        return new RippleDrawable(ColorStateList.valueOf(this.f43399c), r2, r3);
    }

    public final void b() {
        int r02 = this.f43410o;
        if (r02 != 3) goto L5;
    L8:
        setOrientation(1);
    L10:
        if (getLayoutParams() != null) goto L12;
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    L12:
        setGravity(17);
        setClickable(true);
        setFocusable(true);
        if (this.f43407l == null) goto L15;
        return;
    L15:
        if (this.f43409n == null) goto L17;
        return;
    L17:
        if (getPaddingLeft() == 0) goto L19;
        return;
    L19:
        if (getPaddingRight() == 0) goto L21;
        return;
    L21:
        if (getPaddingTop() == 0) goto L23;
        return;
    L23:
        if (getPaddingBottom() != 0) goto L31;
        setPadding(10, 10, 10, 10);
        return;
    L31:
        return;
    L5:
        if (r02 == 4) goto L8;
        setOrientation(0);
        goto L10
    }

    public final void c(TypedArray r7) {
        this.f43398b = r7.getColor(l.f42701R, this.f43398b);
        this.f43399c = r7.getColor(l.f42705V, this.f43399c);
        this.d = r7.getColor(l.f42703T, this.d);
        this.f43418w = r7.getBoolean(l.f42692L, true);
        this.f43400e = r7.getColor(l.f42704U, this.f43400e);
        this.f43401f = r7.getColor(l.f42702S, this.f43401f);
        int r02 = r7.getColor(l.f42730k0, this.f43402g);
        this.f43402g = r02;
        this.f43403h = r7.getColor(l.f42709Z, r02);
        int r03 = (int) r7.getDimension(l.f42736n0, this.f43404i);
        this.f43404i = r03;
        this.f43404i = (int) r7.getDimension(l.f42694M, r03);
        this.f43405j = r7.getInt(l.f42734m0, this.f43405j);
        this.f43415t = r7.getColor(l.f42699P, this.f43415t);
        this.f43416u = (int) r7.getDimension(l.f42700Q, this.f43416u);
        this.f43417v = (int) r7.getDimension(l.f42724h0, this.f43417v);
        this.f43408m = (int) r7.getDimension(l.f42707X, this.f43408m);
        this.f43411p = (int) r7.getDimension(l.f42715c0, this.f43411p);
        this.f43412q = (int) r7.getDimension(l.f42716d0, this.f43412q);
        this.f43413r = (int) r7.getDimension(l.f42718e0, this.f43413r);
        this.f43414s = (int) r7.getDimension(l.f42713b0, this.f43414s);
        this.f43419x = r7.getBoolean(l.f42728j0, false);
        this.f43419x = r7.getBoolean(l.f42698O, false);
        this.f43394F = r7.getBoolean(l.f42708Y, this.f43394F);
        this.f43395G = r7.getBoolean(l.f42738o0, this.f43395G);
        String r04 = r7.getString(l.f42726i0);
        if (r04 != null) goto L5;
        r04 = r7.getString(l.f42696N);
    L5:
        this.f43410o = r7.getInt(l.f42720f0, this.f43410o);
        String r1 = r7.getString(l.f42706W);
        String r2 = r7.getString(l.f42711a0);
        String r3 = r7.getString(l.f42732l0);
        this.f43407l = r7.getDrawable(l.f42722g0);     // Catch: Exception -> L8
    L9:
        if (r1 == null) goto L11;
        this.f43409n = r1;
    L11:
        if (r04 == null) goto L17;
        if (this.f43419x == false) goto L15;
        r04 = r04.toUpperCase();
    L15:
        this.f43406k = r04;
    L17:
        if (isInEditMode() == true) goto L27;
        if (r2 == null) goto L20;
        this.f43421z = b.b(this.f43397a, r2, this.f43389A);
    L21:
        if (r3 == null) goto L23;
        this.f43420y = b.b(this.f43397a, r3, this.f43390B);
        return;
    L23:
        this.f43420y = b.b(this.f43397a, this.f43390B, null);
        return;
    L20:
        this.f43421z = b.b(this.f43397a, this.f43389A, null);
        goto L21
    L27:
        return;
    L8:
        this.f43407l = null;
        goto L9
    }

    public final void d() {
        b();
        this.f43393E = h();
        this.f43391C = g();
        this.f43392D = f();
        removeAllViews();
        e();
        ArrayList r02 = new ArrayList();
        int r1 = this.f43410o;
        if (r1 != 1) goto L5;
    L16:
        ImageView r12 = this.f43391C;
        if (r12 == null) goto L19;
        r02.add(r12);
    L19:
        TextView r13 = this.f43392D;
        if (r13 == null) goto L22;
        r02.add(r13);
    L22:
        TextView r14 = this.f43393E;
        if (r14 == null) goto L25;
        r02.add(r14);
    L25:
        Iterator r03 = r02.iterator();
    L27:
        if (r03.hasNext() == false) goto L29;
        addView((View) r03.next());
        goto L27
    L29:
        return;
    L5:
        if (r1 == 3) goto L16;
        TextView r15 = this.f43393E;
        if (r15 == null) goto L10;
        r02.add(r15);
    L10:
        ImageView r16 = this.f43391C;
        if (r16 == null) goto L13;
        r02.add(r16);
    L13:
        TextView r17 = this.f43392D;
        if (r17 == null) goto L25;
        r02.add(r17);
        goto L25
    }

    public final void e() {
        GradientDrawable r02 = new GradientDrawable();
        r02.setCornerRadius(this.f43417v);
        if (this.f43394F == false) goto L5;
        r02.setColor(getResources().getColor(R.color.transparent));
    L6:
        GradientDrawable r1 = new GradientDrawable();
        r1.setCornerRadius(this.f43417v);
        r1.setColor(this.f43399c);
        GradientDrawable r3 = new GradientDrawable();
        r3.setCornerRadius(this.f43417v);
        r3.setColor(this.d);
        r3.setStroke(this.f43416u, this.f43401f);
        int r4 = this.f43415t;
        if (r4 == 0) goto L10;
        r02.setStroke(this.f43416u, r4);
    L10:
        if (this.f43418w == true) goto L15;
        r02.setStroke(this.f43416u, this.f43401f);
        if (this.f43394F == false) goto L15;
        r3.setColor(getResources().getColor(R.color.transparent));
    L15:
        if (this.f43396H == false) goto L18;
        setBackground(a(r02, r1, r3));
        return;
    L18:
        StateListDrawable r12 = new StateListDrawable();
        GradientDrawable r42 = new GradientDrawable();
        r42.setCornerRadius(this.f43417v);
        if (this.f43394F == false) goto L21;
        r42.setColor(getResources().getColor(R.color.transparent));
    L22:
        int r2 = this.f43415t;
        if (r2 == 0) goto L29;
        if (this.f43394F == false) goto L27;
        r42.setStroke(this.f43416u, this.f43399c);
        goto L29
    L27:
        r42.setStroke(this.f43416u, r2);
    L29:
        if (this.f43418w == true) goto L35;
        if (this.f43394F == false) goto L33;
        r42.setStroke(this.f43416u, this.f43401f);
        goto L35
    L33:
        r42.setStroke(this.f43416u, this.f43401f);
    L35:
        if (this.f43399c == 0) goto L37;
        r12.addState(new int[]{R.attr.state_pressed}, r42);
        r12.addState(new int[]{R.attr.state_focused}, r42);
        r12.addState(new int[]{-16842910}, r3);
    L37:
        r12.addState(new int[0], r02);
        setBackground(r12);
        return;
    L21:
        r42.setColor(this.f43399c);
        goto L22
    L5:
        r02.setColor(this.f43398b);
        goto L6
    }

    public final TextView f() {
        if (this.f43409n == null) goto L24;
        TextView r02 = new TextView(this.f43397a);
        if (this.f43418w == false) goto L7;
        int r1 = this.f43403h;
    L8:
        r02.setTextColor(r1);
        LinearLayout.LayoutParams r12 = new LinearLayout.LayoutParams(-2, -2);
        r12.rightMargin = this.f43412q;
        r12.leftMargin = this.f43411p;
        r12.topMargin = this.f43413r;
        r12.bottomMargin = this.f43414s;
        if (this.f43393E == null) goto L17;
        int r2 = this.f43410o;
        if (r2 != 3) goto L13;
    L16:
        r12.gravity = 17;
        r02.setGravity(17);
    L18:
        r02.setLayoutParams(r12);
        if (isInEditMode() == true) goto L22;
        r02.setTextSize(b.a(getContext(), this.f43408m));
        r02.setText(this.f43409n);
        r02.setTypeface(this.f43421z);
        return r02;
    L22:
        r02.setTextSize(b.a(getContext(), this.f43408m));
        r02.setText("O");
        return r02;
    L13:
        if (r2 == 4) goto L16;
        r02.setGravity(16);
        r12.gravity = 16;
        goto L18
    L17:
        r12.gravity = 17;
        r02.setGravity(16);
        goto L18
    L7:
        r1 = this.f43400e;
        goto L8
    L24:
        return null;
    }

    public final ImageView g() {
        if (this.f43407l == null) goto L17;
        ImageView r02 = new ImageView(this.f43397a);
        r02.setImageDrawable(this.f43407l);
        r02.setPadding(this.f43411p, this.f43413r, this.f43412q, this.f43414s);
        LinearLayout.LayoutParams r1 = new LinearLayout.LayoutParams(-2, -2);
        if (this.f43393E == null) goto L14;
        int r2 = this.f43410o;
        if (r2 != 3) goto L9;
    L12:
        r1.gravity = 17;
    L13:
        r1.rightMargin = 10;
        r1.leftMargin = 10;
    L15:
        r02.setLayoutParams(r1);
        return r02;
    L9:
        if (r2 == 4) goto L12;
        r1.gravity = 16;
        goto L13
    L14:
        r1.gravity = 16;
        goto L15
    L17:
        return null;
    }

    public TextView getIconFontObject() {
        return this.f43392D;
    }

    public ImageView getIconImageObject() {
        return this.f43391C;
    }

    public CharSequence getText() {
        TextView r02 = this.f43393E;
        if (r02 != null) goto L5;
        return "";
    L5:
        return r02.getText();
    }

    public TextView getTextViewObject() {
        return this.f43393E;
    }

    public int getmDefaultIconColor() {
        return this.f43403h;
    }

    public final TextView h() {
        if (this.f43406k != null) goto L5;
        this.f43406k = "Fancy Button";
    L5:
        TextView r02 = new TextView(this.f43397a);
        r02.setText(this.f43406k);
        r02.setGravity(this.f43405j);
        if (this.f43418w == false) goto L8;
        int r1 = this.f43402g;
    L9:
        r02.setTextColor(r1);
        r02.setTextSize(b.a(getContext(), this.f43404i));
        r02.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        if (isInEditMode() == false) goto L12;
    L14:
        return r02;
    L12:
        if (this.f43395G == true) goto L14;
        r02.setTypeface(this.f43420y);
        goto L14
    L8:
        r1 = this.f43400e;
        goto L9
    }

    @Override // android.view.View
    public void setBackgroundColor(int r1) {
        this.f43398b = r1;
        if (this.f43391C == null) goto L5;
    L10:
        e();
        return;
    L5:
        if (this.f43392D != null) goto L10;
        if (this.f43393E != null) goto L10;
    }

    public void setBorderColor(int r1) {
        this.f43415t = r1;
        if (this.f43391C == null) goto L5;
    L10:
        e();
        return;
    L5:
        if (this.f43392D != null) goto L10;
        if (this.f43393E != null) goto L10;
    }

    public void setBorderWidth(int r1) {
        this.f43416u = r1;
        if (this.f43391C == null) goto L5;
    L10:
        e();
        return;
    L5:
        if (this.f43392D != null) goto L10;
        if (this.f43393E != null) goto L10;
    }

    public void setCustomIconFont(String r3) {
        Typeface r32 = b.b(this.f43397a, r3, this.f43389A);
        this.f43421z = r32;
        TextView r02 = this.f43392D;
        if (r02 != null) goto L6;
        d();
        return;
    L6:
        r02.setTypeface(r32);
    }

    public void setCustomTextFont(String r3) {
        Typeface r32 = b.b(this.f43397a, r3, this.f43390B);
        this.f43420y = r32;
        TextView r02 = this.f43393E;
        if (r02 != null) goto L6;
        d();
        return;
    L6:
        r02.setTypeface(r32);
    }

    public void setDisableBackgroundColor(int r1) {
        this.d = r1;
        if (this.f43391C == null) goto L5;
    L10:
        e();
        return;
    L5:
        if (this.f43392D != null) goto L10;
        if (this.f43393E != null) goto L10;
    }

    public void setDisableBorderColor(int r1) {
        this.f43401f = r1;
        if (this.f43391C == null) goto L5;
    L10:
        e();
        return;
    L5:
        if (this.f43392D != null) goto L10;
        if (this.f43393E != null) goto L10;
    }

    public void setDisableTextColor(int r3) {
        this.f43400e = r3;
        TextView r02 = this.f43393E;
        if (r02 != null) goto L7;
        d();
        return;
    L7:
        if (this.f43418w == true) goto L10;
        r02.setTextColor(r3);
        return;
    }

    @Override // android.view.View
    public void setEnabled(boolean r1) {
        super.setEnabled(r1);
        this.f43418w = r1;
        d();
    }

    public void setFocusBackgroundColor(int r1) {
        this.f43399c = r1;
        if (this.f43391C == null) goto L5;
    L10:
        e();
        return;
    L5:
        if (this.f43392D != null) goto L10;
        if (this.f43393E != null) goto L10;
    }

    public void setFontIconSize(int r2) {
        float r22 = r2;
        this.f43408m = b.d(getContext(), r22);
        TextView r02 = this.f43392D;
        if (r02 == null) goto L6;
        r02.setTextSize(r22);
        return;
    }

    public void setGhost(boolean r1) {
        this.f43394F = r1;
        if (this.f43391C == null) goto L5;
    L10:
        e();
        return;
    L5:
        if (this.f43392D != null) goto L10;
        if (this.f43393E != null) goto L10;
    }

    public void setIconColor(int r2) {
        TextView r02 = this.f43392D;
        if (r02 == null) goto L6;
        r02.setTextColor(r2);
        return;
    }

    public void setIconColorFilter(int r3) {
        this.f43391C.setColorFilter(r3, PorterDuff.Mode.SRC_ATOP);
    }

    public void setIconPadding(int r2, int r3, int r4, int r5) {
        this.f43411p = r2;
        this.f43413r = r3;
        this.f43412q = r4;
        this.f43414s = r5;
        ImageView r02 = this.f43391C;
        if (r02 == null) goto L5;
        r02.setPadding(r2, r3, r4, r5);
    L5:
        TextView r22 = this.f43392D;
        if (r22 == null) goto L9;
        r22.setPadding(this.f43411p, this.f43413r, this.f43412q, this.f43414s);
        return;
    }

    public void setIconPosition(int r2) {
        if (r2 > 0) goto L4;
    L6:
        this.f43410o = 1;
    L7:
        d();
        return;
    L4:
        if (r2 >= 5) goto L6;
        this.f43410o = r2;
        goto L7
    }

    public void setIconResource(int r3) {
        Drawable r32 = this.f43397a.getResources().getDrawable(r3);
        this.f43407l = r32;
        ImageView r02 = this.f43391C;
        if (r02 != null) goto L5;
    L9:
        this.f43392D = null;
        d();
        return;
    L5:
        if (this.f43392D != null) goto L9;
        r02.setImageDrawable(r32);
    }

    public void setRadius(int r1) {
        this.f43417v = r1;
        if (this.f43391C == null) goto L5;
    L10:
        e();
        return;
    L5:
        if (this.f43392D != null) goto L10;
        if (this.f43393E != null) goto L10;
    }

    public void setText(String r2) {
        if (this.f43419x == false) goto L5;
        r2 = r2.toUpperCase();
    L5:
        this.f43406k = r2;
        TextView r02 = this.f43393E;
        if (r02 != null) goto L9;
        d();
        return;
    L9:
        r02.setText(r2);
    }

    public void setTextAllCaps(boolean r1) {
        this.f43419x = r1;
        setText(this.f43406k);
    }

    public void setTextBold() {
        TextView r02 = this.f43393E;
        if (r02 == null) goto L8;
        Typeface r1 = this.f43420y;
        if (r1 == null) goto L9;
        r02.setTypeface(r1, 1);
        return;
    L9:
        return;
    }

    public void setTextColor(int r2) {
        this.f43402g = r2;
        TextView r02 = this.f43393E;
        if (r02 != null) goto L6;
        d();
        return;
    L6:
        r02.setTextColor(r2);
    }

    public void setTextGravity(int r2) {
        this.f43405j = r2;
        TextView r02 = this.f43393E;
        if (r02 == null) goto L6;
        r02.setGravity(r2);
        return;
    }

    public void setTextSize(int r2) {
        float r22 = r2;
        this.f43404i = b.d(getContext(), r22);
        TextView r02 = this.f43393E;
        if (r02 == null) goto L6;
        r02.setTextSize(r22);
        return;
    }

    public void setUsingSystemFont(boolean r1) {
        this.f43395G = r1;
    }

    public void setIconResource(Drawable r3) {
        this.f43407l = r3;
        ImageView r02 = this.f43391C;
        if (r02 != null) goto L5;
    L9:
        this.f43392D = null;
        d();
        return;
    L5:
        if (this.f43392D != null) goto L9;
        r02.setImageDrawable(r3);
    }

    public void setIconResource(String r2) {
        this.f43409n = r2;
        TextView r02 = this.f43392D;
        if (r02 != null) goto L6;
        this.f43391C = null;
        d();
        return;
    L6:
        r02.setText(r2);
    }

    public FancyButton(Context r5, AttributeSet r6) {
        super(r5, r6);
        this.f43398b = -16777216;
        this.f43399c = 0;
        this.d = Color.parseColor("#f6f7f9");
        this.f43400e = Color.parseColor("#bec2c9");
        this.f43401f = Color.parseColor("#dddfe2");
        this.f43402g = -1;
        this.f43403h = -1;
        this.f43404i = b.d(getContext(), 15.0f);
        this.f43405j = 17;
        this.f43406k = null;
        this.f43407l = null;
        this.f43408m = b.d(getContext(), 15.0f);
        this.f43409n = null;
        this.f43410o = 1;
        this.f43411p = 10;
        this.f43412q = 10;
        this.f43413r = 0;
        this.f43414s = 0;
        this.f43415t = 0;
        this.f43416u = 0;
        this.f43417v = 0;
        this.f43418w = true;
        this.f43419x = false;
        this.f43420y = null;
        this.f43421z = null;
        this.f43389A = "fontawesome.ttf";
        this.f43390B = "robotoregular.ttf";
        this.f43394F = false;
        this.f43395G = false;
        this.f43396H = true;
        this.f43397a = r5;
        TypedArray r52 = r5.obtainStyledAttributes(r6, l.f42690K, 0, 0);
        c(r52);
        r52.recycle();
        d();
    }
}
