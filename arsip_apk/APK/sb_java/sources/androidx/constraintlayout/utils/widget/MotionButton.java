package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.e;

/* loaded from: classes.dex */
public class MotionButton extends AppCompatButton {

    /* renamed from: a, reason: collision with root package name */
    public float f22109a;

    /* renamed from: b, reason: collision with root package name */
    public float f22110b;

    /* renamed from: c, reason: collision with root package name */
    public Path f22111c;
    public ViewOutlineProvider d;

    /* renamed from: e, reason: collision with root package name */
    public RectF f22112e;

    public class a extends ViewOutlineProvider {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MotionButton f22113a;

        public a(MotionButton r1) {
            this.f22113a = r1;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View r7, Outline r8) {
            r8.setRoundRect(0, 0, this.f22113a.getWidth(), this.f22113a.getHeight(), (Math.min(r3, r4) * MotionButton.a(this.f22113a)) / 2.0f);
        }
    }

    public class b extends ViewOutlineProvider {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MotionButton f22114a;

        public b(MotionButton r1) {
            this.f22114a = r1;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View r7, Outline r8) {
            r8.setRoundRect(0, 0, this.f22114a.getWidth(), this.f22114a.getHeight(), MotionButton.b(this.f22114a));
        }
    }

    public MotionButton(Context r2) {
        super(r2);
        this.f22109a = 0.0f;
        this.f22110b = Float.NaN;
        c(r2, null);
    }

    public static /* synthetic */ float a(MotionButton r02) {
        return r02.f22109a;
    }

    public static /* synthetic */ float b(MotionButton r02) {
        return r02.f22110b;
    }

    private void c(Context r5, AttributeSet r6) {
        int r52 = 0;
        setPadding(0, 0, 0, 0);
        if (r6 == null) goto L19;
        TypedArray r62 = getContext().obtainStyledAttributes(r6, e.J5);
        int r02 = r62.getIndexCount();
    L5:
        if (r52 >= r02) goto L13;
        int r1 = r62.getIndex(r52);
        if (r1 != e.T5) goto L10;
        setRound(r62.getDimension(r1, 0.0f));
    L12:
        r52 = r52 + 1;
        goto L5
    L10:
        if (r1 != e.U5) goto L12;
        setRoundPercent(r62.getFloat(r1, 0.0f));
        goto L12
    L13:
        r62.recycle();
        return;
    }

    @Override // android.view.View
    public void draw(Canvas r1) {
        super.draw(r1);
    }

    public float getRound() {
        return this.f22110b;
    }

    public float getRoundPercent() {
        return this.f22109a;
    }

    public void setRound(float r5) {
        if (Float.isNaN(r5) == false) goto L7;
        this.f22110b = r5;
        float r52 = this.f22109a;
        this.f22109a = -1.0f;
        setRoundPercent(r52);
        return;
    L7:
        if (this.f22110b == r5) goto L9;
        boolean r02 = true;
    L10:
        this.f22110b = r5;
        if (r5 != 0.0f) goto L13;
        setClipToOutline(false);
    L23:
        if (r02 == false) goto L26;
        invalidateOutline();
        return;
    L26:
        return;
    L13:
        if (this.f22111c != null) goto L16;
        this.f22111c = new Path();
    L16:
        if (this.f22112e != null) goto L19;
        this.f22112e = new RectF();
    L19:
        if (this.d != null) goto L21;
        b r53 = new b(this);
        this.d = r53;
        setOutlineProvider(r53);
    L21:
        setClipToOutline(true);
        this.f22112e.set(0.0f, 0.0f, getWidth(), getHeight());
        this.f22111c.reset();
        Path r54 = this.f22111c;
        RectF r1 = this.f22112e;
        float r2 = this.f22110b;
        r54.addRoundRect(r1, r2, r2, Path.Direction.CW);
        goto L23
    L9:
        r02 = false;
        goto L10
    }

    public void setRoundPercent(float r6) {
        if (this.f22109a == r6) goto L5;
        boolean r02 = true;
    L6:
        this.f22109a = r6;
        if (r6 != 0.0f) goto L9;
        setClipToOutline(false);
    L19:
        if (r02 == false) goto L22;
        invalidateOutline();
        return;
    L22:
        return;
    L9:
        if (this.f22111c != null) goto L12;
        this.f22111c = new Path();
    L12:
        if (this.f22112e != null) goto L15;
        this.f22112e = new RectF();
    L15:
        if (this.d != null) goto L17;
        a r62 = new a(this);
        this.d = r62;
        setOutlineProvider(r62);
    L17:
        setClipToOutline(true);
        int r63 = getWidth();
        int r1 = getHeight();
        float r2 = (Math.min(r63, r1) * this.f22109a) / 2.0f;
        this.f22112e.set(0.0f, 0.0f, r63, r1);
        this.f22111c.reset();
        this.f22111c.addRoundRect(this.f22112e, r2, r2, Path.Direction.CW);
        goto L19
    L5:
        r02 = false;
        goto L6
    }

    public MotionButton(Context r2, AttributeSet r3) {
        super(r2, r3);
        this.f22109a = 0.0f;
        this.f22110b = Float.NaN;
        c(r2, r3);
    }

    public MotionButton(Context r1, AttributeSet r2, int r3) {
        super(r1, r2, r3);
        this.f22109a = 0.0f;
        this.f22110b = Float.NaN;
        c(r1, r2);
    }
}
