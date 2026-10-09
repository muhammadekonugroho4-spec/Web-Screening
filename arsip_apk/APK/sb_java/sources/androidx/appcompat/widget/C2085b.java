package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2085b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f3592a;

    /* renamed from: androidx.appcompat.widget.b$a */
    public static class a {
        public static void a(Drawable r02, Outline r1) {
            r02.getOutline(r1);
        }
    }

    public C2085b(ActionBarContainer r1) {
        this.f3592a = r1;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas r3) {
        ActionBarContainer r02 = this.f3592a;
        if (r02.f3149h == false) goto L8;
        Drawable r03 = r02.f3148g;
        if (r03 == null) goto L17;
        r03.draw(r3);
        return;
    L17:
        return;
    L8:
        Drawable r04 = r02.f3146e;
        if (r04 == null) goto L11;
        r04.draw(r3);
    L11:
        ActionBarContainer r05 = this.f3592a;
        Drawable r1 = r05.f3147f;
        if (r1 != null) goto L14;
        return;
    L14:
        if (r05.f3150i == false) goto L19;
        r1.draw(r3);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline r3) {
        ActionBarContainer r02 = this.f3592a;
        if (r02.f3149h == true) goto L5;
        Drawable r03 = r02.f3146e;
        if (r03 == null) goto L13;
        a.a(r03, r3);
        return;
    L13:
        return;
    L5:
        if (r02.f3148g == null) goto L12;
        a.a(r02.f3146e, r3);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r1) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter r1) {
    }
}
