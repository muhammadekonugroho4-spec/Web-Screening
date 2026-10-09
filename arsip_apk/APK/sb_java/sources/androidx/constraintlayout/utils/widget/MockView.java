package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.e;
import com.google.firebase.perf.util.Constants;

/* loaded from: classes.dex */
public class MockView extends View {

    /* renamed from: a, reason: collision with root package name */
    public Paint f22099a;

    /* renamed from: b, reason: collision with root package name */
    public Paint f22100b;

    /* renamed from: c, reason: collision with root package name */
    public Paint f22101c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22102e;

    /* renamed from: f, reason: collision with root package name */
    public String f22103f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f22104g;

    /* renamed from: h, reason: collision with root package name */
    public int f22105h;

    /* renamed from: i, reason: collision with root package name */
    public int f22106i;

    /* renamed from: j, reason: collision with root package name */
    public int f22107j;

    /* renamed from: k, reason: collision with root package name */
    public int f22108k;

    public MockView(Context r4) {
        super(r4);
        this.f22099a = new Paint();
        this.f22100b = new Paint();
        this.f22101c = new Paint();
        this.d = true;
        this.f22102e = true;
        this.f22103f = null;
        this.f22104g = new Rect();
        this.f22105h = Color.argb(Constants.MAX_HOST_LENGTH, 0, 0, 0);
        this.f22106i = Color.argb(Constants.MAX_HOST_LENGTH, 200, 200, 200);
        this.f22107j = Color.argb(Constants.MAX_HOST_LENGTH, 50, 50, 50);
        this.f22108k = 4;
        a(r4, null);
    }

    private void a(Context r5, AttributeSet r6) {
        if (r6 == null) goto L26;
        TypedArray r62 = r5.obtainStyledAttributes(r6, e.Z7);
        int r02 = r62.getIndexCount();
        int r1 = 0;
    L4:
        if (r1 >= r02) goto L24;
        int r2 = r62.getIndex(r1);
        if (r2 != e.b8) goto L9;
        this.f22103f = r62.getString(r2);
    L23:
        r1 = r1 + 1;
        goto L4
    L9:
        if (r2 != e.e8) goto L12;
        this.d = r62.getBoolean(r2, this.d);
        goto L23
    L12:
        if (r2 != e.a8) goto L15;
        this.f22105h = r62.getColor(r2, this.f22105h);
        goto L23
    L15:
        if (r2 != e.c8) goto L18;
        this.f22107j = r62.getColor(r2, this.f22107j);
        goto L23
    L18:
        if (r2 != e.d8) goto L21;
        this.f22106i = r62.getColor(r2, this.f22106i);
        goto L23
    L21:
        if (r2 != e.f8) goto L23;
        this.f22102e = r62.getBoolean(r2, this.f22102e);
        goto L23
    L24:
        r62.recycle();
    L26:
        if (this.f22103f == null) goto L31;
    L28:
        this.f22099a.setColor(this.f22105h);
        this.f22099a.setAntiAlias(true);
        this.f22100b.setColor(this.f22106i);
        this.f22100b.setAntiAlias(true);
        this.f22101c.setColor(this.f22107j);
        this.f22108k = Math.round(this.f22108k * (getResources().getDisplayMetrics().xdpi / 160.0f));
        return;
    L31:
        this.f22103f = r5.getResources().getResourceEntryName(getId());     // Catch: Exception -> L30
        goto L28
    }

    @Override // android.view.View
    public void onDraw(Canvas r13) {
        super.onDraw(r13);
        int r02 = getWidth();
        int r1 = getHeight();
        if (this.d == false) goto L5;
        r02 = r02 - 1;
        r1 = r1 - 1;
        float r5 = r02;
        float r4 = r1;
        Canvas r2 = r13;
        r2.drawLine(0.0f, 0.0f, r5, r4, this.f22099a);
        r2.drawLine(0.0f, r4, r5, 0.0f, this.f22099a);
        r2.drawLine(0.0f, 0.0f, r5, 0.0f, this.f22099a);
        r2.drawLine(r5, 0.0f, r5, r4, this.f22099a);
        r2.drawLine(r5, r4, 0.0f, r4, this.f22099a);
        r2.drawLine(0.0f, r4, 0.0f, 0.0f, this.f22099a);
    L6:
        String r132 = this.f22103f;
        if (r132 != null) goto L9;
        return;
    L9:
        if (this.f22102e == false) goto L13;
        this.f22100b.getTextBounds(r132, 0, r132.length(), this.f22104g);
        float r133 = (r02 - this.f22104g.width()) / 2.0f;
        float r12 = ((r1 - this.f22104g.height()) / 2.0f) + this.f22104g.height();
        this.f22104g.offset((int) r133, (int) r12);
        Rect r03 = this.f22104g;
        int r3 = r03.left;
        int r42 = this.f22108k;
        r03.set(r3 - r42, r03.top - r42, r03.right + r42, r03.bottom + r42);
        r2.drawRect(this.f22104g, this.f22101c);
        r2.drawText(this.f22103f, r133, r12, this.f22100b);
        return;
    L13:
        return;
    L5:
        r2 = r13;
        goto L6
    }

    public MockView(Context r3, AttributeSet r4) {
        super(r3, r4);
        this.f22099a = new Paint();
        this.f22100b = new Paint();
        this.f22101c = new Paint();
        this.d = true;
        this.f22102e = true;
        this.f22103f = null;
        this.f22104g = new Rect();
        this.f22105h = Color.argb(Constants.MAX_HOST_LENGTH, 0, 0, 0);
        this.f22106i = Color.argb(Constants.MAX_HOST_LENGTH, 200, 200, 200);
        this.f22107j = Color.argb(Constants.MAX_HOST_LENGTH, 50, 50, 50);
        this.f22108k = 4;
        a(r3, r4);
    }

    public MockView(Context r2, AttributeSet r3, int r4) {
        super(r2, r3, r4);
        this.f22099a = new Paint();
        this.f22100b = new Paint();
        this.f22101c = new Paint();
        this.d = true;
        this.f22102e = true;
        this.f22103f = null;
        this.f22104g = new Rect();
        this.f22105h = Color.argb(Constants.MAX_HOST_LENGTH, 0, 0, 0);
        this.f22106i = Color.argb(Constants.MAX_HOST_LENGTH, 200, 200, 200);
        this.f22107j = Color.argb(Constants.MAX_HOST_LENGTH, 50, 50, 50);
        this.f22108k = 4;
        a(r2, r3);
    }
}
