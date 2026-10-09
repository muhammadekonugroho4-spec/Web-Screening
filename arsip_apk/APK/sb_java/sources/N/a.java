package N;

import android.util.Size;
import java.util.Comparator;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class a implements Comparator {
    public a() {
    }

    @Override // java.util.Comparator
    public final int compare(Object r5, Object r6) {
        p.l((Size) r5, "lhs");
        p.l((Size) r6, "rhs");
        return Long.signum((r5.getWidth() * r5.getHeight()) - (r6.getWidth() * r6.getHeight()));
    }
}
