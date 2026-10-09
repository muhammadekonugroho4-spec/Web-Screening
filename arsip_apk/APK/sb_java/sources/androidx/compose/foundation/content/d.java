package androidx.compose.foundation.content;

import androidx.compose.ui.platform.X;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public abstract class d {
    public static final String a(X r6) {
        int r02 = r6.a().getItemCount();
        int r1 = 0;
        int r2 = 0;
        boolean r3 = false;
    L4:
        if (r2 >= r02) goto L12;
        if (r3 == false) goto L7;
    L10:
        r3 = true;
    L11:
        r2 = r2 + 1;
        goto L4
    L7:
        if (r6.a().getItemAt(r2).getText() != null) goto L10;
        r3 = false;
        goto L11
    L12:
        if (r3 == false) goto L23;
        StringBuilder r03 = new StringBuilder();
        int r22 = r6.a().getItemCount();
        boolean r32 = false;
    L14:
        if (r1 >= r22) goto L21;
        CharSequence r5 = r6.a().getItemAt(r1).getText();
        if (r5 == null) goto L20;
        if (r32 == false) goto L19;
        r03.append("\n");
    L19:
        r03.append(r5);
        r32 = true;
    L20:
        r1 = r1 + 1;
        goto L14
    L21:
        String r62 = r03.toString();
        p.k(r62, "toString(...)");
        return r62;
    L23:
        return null;
    }
}
