package com.android.volley.toolbox;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.volley.VolleyError;
import com.android.volley.j;

/* loaded from: classes4.dex */
public class NetworkImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public String f32032a;

    /* renamed from: b, reason: collision with root package name */
    public int f32033b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f32034c;
    public Bitmap d;

    /* renamed from: e, reason: collision with root package name */
    public int f32035e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f32036f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f32037g;

    public class a implements j.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f32038a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NetworkImageView f32039b;

        public a(NetworkImageView r1, boolean r2) {
            this.f32039b = r1;
            this.f32038a = r2;
        }

        @Override // com.android.volley.j.a
        public void a(VolleyError r2) {
            if (NetworkImageView.a(this.f32039b) == 0) goto L7;
            NetworkImageView r22 = this.f32039b;
            r22.setImageResource(NetworkImageView.a(r22));
            return;
        L7:
            if (NetworkImageView.b(this.f32039b) == null) goto L11;
            NetworkImageView r23 = this.f32039b;
            r23.setImageDrawable(NetworkImageView.b(r23));
            return;
        L11:
            if (NetworkImageView.c(this.f32039b) == null) goto L14;
            NetworkImageView r24 = this.f32039b;
            r24.setImageBitmap(NetworkImageView.c(r24));
            return;
        }
    }

    public NetworkImageView(Context r2) {
        this(r2, null);
    }

    public static /* synthetic */ int a(NetworkImageView r02) {
        return r02.f32035e;
    }

    public static /* synthetic */ Drawable b(NetworkImageView r02) {
        return r02.f32036f;
    }

    public static /* synthetic */ Bitmap c(NetworkImageView r02) {
        return r02.f32037g;
    }

    public void d(boolean r8) {
        int r02 = getWidth();
        int r1 = getHeight();
        getScaleType();
        boolean r3 = true;
        if (getLayoutParams() != null) goto L5;
        boolean r2 = false;
        boolean r5 = false;
    L13:
        if (r2 == false) goto L16;
        if (r5 == false) goto L16;
    L17:
        if (r02 != 0) goto L22;
        if (r1 != 0) goto L22;
        if (r3 == true) goto L22;
        return;
    L22:
        if (TextUtils.isEmpty(this.f32032a) == false) goto L25;
        e();
        return;
    L25:
        new a(this, r8);
        throw null;
    L16:
        r3 = false;
        goto L17
    L5:
        if (getLayoutParams().width != (-2)) goto L7;
        r2 = true;
    L9:
        if (getLayoutParams().height != (-2)) goto L11;
        r5 = true;
        goto L13
    L11:
        r5 = false;
        goto L13
    L7:
        r2 = false;
        goto L9
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public final void e() {
        int r02 = this.f32033b;
        if (r02 == 0) goto L6;
        setImageResource(r02);
        return;
    L6:
        Drawable r03 = this.f32034c;
        if (r03 == null) goto L10;
        setImageDrawable(r03);
        return;
    L10:
        Bitmap r04 = this.d;
        if (r04 == null) goto L14;
        setImageBitmap(r04);
        return;
    L14:
        setImageBitmap(null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
        d(true);
    }

    public void setDefaultImageBitmap(Bitmap r2) {
        this.f32033b = 0;
        this.f32034c = null;
        this.d = r2;
    }

    public void setDefaultImageDrawable(Drawable r2) {
        this.f32033b = 0;
        this.d = null;
        this.f32034c = r2;
    }

    public void setDefaultImageResId(int r2) {
        this.d = null;
        this.f32034c = null;
        this.f32033b = r2;
    }

    public void setErrorImageBitmap(Bitmap r2) {
        this.f32035e = 0;
        this.f32036f = null;
        this.f32037g = r2;
    }

    public void setErrorImageDrawable(Drawable r2) {
        this.f32035e = 0;
        this.f32037g = null;
        this.f32036f = r2;
    }

    public void setErrorImageResId(int r2) {
        this.f32037g = null;
        this.f32036f = null;
        this.f32035e = r2;
    }

    public void setImageUrl(String r1, i r2) {
        l.a();
        this.f32032a = r1;
        d(false);
    }

    public NetworkImageView(Context r2, AttributeSet r3) {
        this(r2, r3, 0);
    }

    public NetworkImageView(Context r1, AttributeSet r2, int r3) {
        super(r1, r2, r3);
    }
}
