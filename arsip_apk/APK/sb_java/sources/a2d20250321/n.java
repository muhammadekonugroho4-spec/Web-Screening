package a2d20250321;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes.dex */
public class n extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f1593a;

    /* renamed from: b, reason: collision with root package name */
    public RectF f1594b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1595c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final DashPathEffect f1596e;

    /* renamed from: f, reason: collision with root package name */
    public int f1597f;

    public n(Context r3) {
        super(r3);
        this.f1595c = false;
        this.d = false;
        Paint r32 = new Paint();
        this.f1593a = r32;
        r32.setAntiAlias(true);
        r32.setStyle(Paint.Style.STROKE);
        this.f1597f = -1;
        r32.setColor(-1);
        this.f1596e = new DashPathEffect(new float[]{8.0f, 8.0f}, 0.0f);
    }

    public void a(boolean r1) {
        this.d = r1;
        postInvalidate();
    }

    public void b(int r1) {
        this.f1597f = r1;
        postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas r12) {
        super.onDraw(r12);
        this.f1593a.setColor(this.f1597f);
        this.f1593a.setPathEffect(this.f1596e);
        int r02 = getMeasuredWidth();
        int r1 = getMeasuredHeight();
        float r03 = r02;
        this.f1593a.setStrokeWidth(0.01f * r03);
        if (this.f1594b != null) goto L6;
        RectF r2 = new RectF();
        this.f1594b = r2;
        float r3 = r03 / 6.0f;
        r2.top = r3;
        r2.bottom = r03 - r3;
        float r32 = 0.2616f * r03;
        r2.left = r32;
        r2.right = r03 - r32;
    L6:
        if (this.d == false) goto L9;
        r12.drawOval(this.f1594b, this.f1593a);
    L9:
        if (this.f1595c == false) goto L11;
        this.f1593a.setColor(-256);
        float r4 = r03 * 0.25f;
        float r5 = r1 * 0.8333333f;
        r12.drawLine(r4, 0.0f, r4, r5, this.f1593a);
        float r6 = r03 * 0.75f;
        r12.drawLine(r4, r5, r6, getMeasuredHeight() * 0.8333333f, this.f1593a);
        r12.drawLine(r6, 0.0f, r6, r5, this.f1593a);
    L11:
        this.f1593a.setPathEffect(null);
    }
}
