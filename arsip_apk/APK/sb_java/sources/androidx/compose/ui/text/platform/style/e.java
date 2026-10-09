package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import androidx.compose.ui.graphics.u1;
import androidx.compose.ui.graphics.v1;

/* loaded from: classes.dex */
public abstract class e {
    public static final Paint.Cap a(int r2) {
        u1.a r02 = u1.f17623a;
        if (u1.e(r2, r02.a()) == false) goto L7;
        return Paint.Cap.BUTT;
    L7:
        if (u1.e(r2, r02.b()) == false) goto L11;
        return Paint.Cap.ROUND;
    L11:
        if (u1.e(r2, r02.c()) == false) goto L15;
        return Paint.Cap.SQUARE;
    L15:
        return Paint.Cap.BUTT;
    }

    public static final Paint.Join b(int r2) {
        v1.a r02 = v1.f17640a;
        if (v1.e(r2, r02.b()) == false) goto L7;
        return Paint.Join.MITER;
    L7:
        if (v1.e(r2, r02.c()) == false) goto L11;
        return Paint.Join.ROUND;
    L11:
        if (v1.e(r2, r02.a()) == false) goto L15;
        return Paint.Join.BEVEL;
    L15:
        return Paint.Join.MITER;
    }
}
