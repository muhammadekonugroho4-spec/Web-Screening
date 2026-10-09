package androidx.compose.foundation.text.selection;

import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;

/* renamed from: androidx.compose.foundation.text.selection.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2972z0 {
    public static /* bridge */ /* synthetic */ TextClassifier a(TextClassificationManager r02, TextClassificationContext r1) {
        return r02.createTextClassificationSession(r1);
    }
}
