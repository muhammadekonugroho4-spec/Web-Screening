package androidx.compose.foundation.text.selection;

import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* loaded from: classes.dex */
public abstract /* synthetic */ class F {
    public static /* bridge */ /* synthetic */ TextSelection a(TextClassifier r02, TextSelection.Request r1) {
        return r02.suggestSelection(r1);
    }
}
