package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.huawei.hms.android.HwBuildEx;

/* renamed from: androidx.appcompat.widget.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2095l {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f3645c = null;

    /* renamed from: a, reason: collision with root package name */
    public final ProgressBar f3646a;

    /* renamed from: b, reason: collision with root package name */
    public Bitmap f3647b;

    /* renamed from: androidx.appcompat.widget.l$a */
    public static class a {
        public static void a(LayerDrawable r1, LayerDrawable r2, int r3) {
            r2.setLayerGravity(r3, r1.getLayerGravity(r3));
            r2.setLayerWidth(r3, r1.getLayerWidth(r3));
            r2.setLayerHeight(r3, r1.getLayerHeight(r3));
            r2.setLayerInsetLeft(r3, r1.getLayerInsetLeft(r3));
            r2.setLayerInsetRight(r3, r1.getLayerInsetRight(r3));
            r2.setLayerInsetTop(r3, r1.getLayerInsetTop(r3));
            r2.setLayerInsetBottom(r3, r1.getLayerInsetBottom(r3));
            r2.setLayerInsetStart(r3, r1.getLayerInsetStart(r3));
            r2.setLayerInsetEnd(r3, r1.getLayerInsetEnd(r3));
        }
    }

    static {
        f3645c = new int[]{R.attr.indeterminateDrawable, R.attr.progressDrawable};
    }

    public C2095l(ProgressBar r1) {
        this.f3646a = r1;
    }

    public final Shape a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    public Bitmap b() {
        return this.f3647b;
    }

    public void c(AttributeSet r4, int r5) {
        M r42 = M.v(this.f3646a.getContext(), r4, f3645c, r5, 0);
        Drawable r52 = r42.h(0);
        if (r52 == null) goto L5;
        this.f3646a.setIndeterminateDrawable(e(r52));
    L5:
        Drawable r53 = r42.h(1);
        if (r53 == null) goto L8;
        this.f3646a.setProgressDrawable(d(r53, false));
    L8:
        r42.x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable d(Drawable r8, boolean r9) {
        if ((r8 instanceof androidx.core.graphics.drawable.c) == false) goto L9;
        androidx.core.graphics.drawable.c r02 = (androidx.core.graphics.drawable.c) r8;
        Drawable r1 = r02.b();
        if (r1 == null) goto L34;
        r02.a(d(r1, r9));
        return r8;
    L34:
        return r8;
    L9:
        if ((r8 instanceof LayerDrawable) == false) goto L25;
        LayerDrawable r82 = (LayerDrawable) r8;
        int r92 = r82.getNumberOfLayers();
        Drawable[] r03 = new Drawable[r92];
        int r2 = 0;
        int r3 = 0;
    L11:
        if (r3 >= r92) goto L20;
        int r4 = r82.getId(r3);
        Drawable r5 = r82.getDrawable(r3);
        if (r4 != 16908301) goto L15;
    L18:
        boolean r42 = true;
    L19:
        r03[r3] = d(r5, r42);
        r3 = r3 + 1;
        goto L11
    L15:
        if (r4 == 16908303) goto L18;
        r42 = false;
        goto L19
    L20:
        LayerDrawable r12 = new LayerDrawable(r03);
    L21:
        if (r2 >= r92) goto L23;
        r12.setId(r2, r82.getId(r2));
        a.a(r82, r12, r2);
        r2 = r2 + 1;
        goto L21
    L23:
        return r12;
    L25:
        if ((r8 instanceof BitmapDrawable) == false) goto L34;
        BitmapDrawable r83 = (BitmapDrawable) r8;
        Bitmap r04 = r83.getBitmap();
        if (this.f3647b != null) goto L29;
        this.f3647b = r04;
    L29:
        ShapeDrawable r22 = new ShapeDrawable(a());
        r22.getPaint().setShader(new BitmapShader(r04, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
        r22.getPaint().setColorFilter(r83.getPaint().getColorFilter());
        if (r9 == true) goto L32;
        return r22;
    L32:
        return new ClipDrawable(r22, 3, 1);
    }

    public final Drawable e(Drawable r7) {
        if ((r7 instanceof AnimationDrawable) == false) goto L10;
        AnimationDrawable r72 = (AnimationDrawable) r7;
        int r02 = r72.getNumberOfFrames();
        AnimationDrawable r1 = new AnimationDrawable();
        r1.setOneShot(r72.isOneShot());
        int r2 = 0;
    L6:
        if (r2 >= r02) goto L8;
        Drawable r4 = d(r72.getFrame(r2), true);
        r4.setLevel(HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
        r1.addFrame(r4, r72.getDuration(r2));
        r2 = r2 + 1;
        goto L6
    L8:
        r1.setLevel(HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
        return r1;
    L10:
        return r7;
    }
}
