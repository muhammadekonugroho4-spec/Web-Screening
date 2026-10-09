package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes4.dex */
public abstract class m extends ReplacementSpan {

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f24091a;

    /* renamed from: b, reason: collision with root package name */
    public final s f24092b;

    /* renamed from: c, reason: collision with root package name */
    public short f24093c;
    public short d;

    /* renamed from: e, reason: collision with root package name */
    public float f24094e;

    public m(s r2) {
        this.f24091a = new Paint.FontMetricsInt();
        this.f24093c = -1;
        this.d = -1;
        this.f24094e = 1.0f;
        androidx.core.util.h.h(r2, "rasterizer cannot be null");
        this.f24092b = r2;
    }

    public final s a() {
        return this.f24092b;
    }

    public final int b() {
        return this.f24093c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint r1, CharSequence r2, int r3, int r4, Paint.FontMetricsInt r5) {
        r1.getFontMetricsInt(this.f24091a);
        Paint.FontMetricsInt r12 = this.f24091a;
        this.f24094e = (Math.abs(r12.descent - r12.ascent) * 1.0f) / this.f24092b.e();
        this.d = (short) (this.f24092b.e() * this.f24094e);
        short r13 = (short) (this.f24092b.i() * this.f24094e);
        this.f24093c = r13;
        if (r5 == null) goto L5;
        Paint.FontMetricsInt r22 = this.f24091a;
        r5.ascent = r22.ascent;
        r5.descent = r22.descent;
        r5.top = r22.top;
        r5.bottom = r22.bottom;
    L5:
        return r13;
    }
}
