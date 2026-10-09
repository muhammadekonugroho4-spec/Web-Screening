package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import android.text.Layout;
import androidx.compose.ui.text.android.k0;

/* loaded from: classes.dex */
public abstract class d {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19801a = null;

        static {
            int[] r02 = new int[Layout.Alignment.values().length];
            r02[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;     // Catch: NoSuchFieldError -> L6
        L4:
            f19801a = r02;
        }
    }

    public static final float a(Layout r4, int r5, Paint r6) {
        float r02 = r4.getLineLeft(r5);
        if (k0.m(r4, r5) == true) goto L5;
    L17:
        return 0.0f;
    L5:
        if (r4.getParagraphDirection(r5) != 1) goto L17;
        if (r02 >= 0.0f) goto L17;
        float r1 = (r4.getPrimaryHorizontal(r4.getLineStart(r5) + r4.getEllipsisStart(r5)) - r02) + r6.measureText("…");
        Layout.Alignment r52 = r4.getParagraphAlignment(r5);
        if (r52 != null) goto L11;
        int r53 = -1;
    L12:
        if (r53 != 1) goto L16;
        float r54 = Math.abs(r02);
        float r42 = (r4.getWidth() - r1) / 2.0f;
    L15:
        return r54 + r42;
    L16:
        r54 = Math.abs(r02);
        r42 = r4.getWidth() - r1;
        goto L15
    L11:
        r53 = a.f19801a[r52.ordinal()];
        goto L12
    }

    public static /* synthetic */ float b(Layout r02, int r1, Paint r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = r02.getPaint();
    L6:
        return a(r02, r1, r2);
    }

    public static final float c(Layout r3, int r4, Paint r5) {
        if (k0.m(r3, r4) == false) goto L18;
        int r1 = -1;
        if (r3.getParagraphDirection(r4) == (-1)) goto L7;
        return 0.0f;
    L7:
        if (r3.getWidth() >= r3.getLineRight(r4)) goto L21;
        float r2 = (r3.getLineRight(r4) - r3.getPrimaryHorizontal(r3.getLineStart(r4) + r3.getEllipsisStart(r4))) + r5.measureText("…");
        Layout.Alignment r52 = r3.getParagraphAlignment(r4);
        if (r52 == null) goto L13;
        r1 = a.f19801a[r52.ordinal()];
    L13:
        if (r1 != 1) goto L17;
        float r53 = r3.getWidth() - r3.getLineRight(r4);
        float r32 = (r3.getWidth() - r2) / 2.0f;
    L16:
        return r53 - r32;
    L17:
        r53 = r3.getWidth() - r3.getLineRight(r4);
        r32 = r3.getWidth() - r2;
        goto L16
    L21:
        return 0.0f;
    L18:
        return 0.0f;
    }

    public static /* synthetic */ float d(Layout r02, int r1, Paint r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = r02.getPaint();
    L6:
        return c(r02, r1, r2);
    }
}
