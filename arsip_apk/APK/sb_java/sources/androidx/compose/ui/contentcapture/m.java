package androidx.compose.ui.contentcapture;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;

/* loaded from: classes.dex */
public interface m {
    AutofillId a(long r1);

    void b(AutofillId r1, CharSequence r2);

    androidx.compose.ui.platform.coreshims.e c(AutofillId r1, long r2);

    void d(AutofillId r1);

    void e(ViewStructure r1);

    void flush();
}
