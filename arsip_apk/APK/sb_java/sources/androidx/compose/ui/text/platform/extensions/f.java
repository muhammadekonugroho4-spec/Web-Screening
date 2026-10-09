package androidx.compose.ui.text.platform.extensions;

import android.text.style.TtsSpan;
import androidx.compose.ui.text.I1;
import androidx.compose.ui.text.K1;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class f {
    public static final TtsSpan a(I1 r1) {
        if ((r1 instanceof K1) == false) goto L7;
        return b((K1) r1);
    L7:
        throw new NoWhenBranchMatchedException();
    }

    public static final TtsSpan b(K1 r1) {
        return new TtsSpan.VerbatimBuilder(r1.a()).build();
    }
}
