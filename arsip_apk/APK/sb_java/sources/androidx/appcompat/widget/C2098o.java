package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* renamed from: androidx.appcompat.widget.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2098o {

    /* renamed from: a, reason: collision with root package name */
    public TextView f3653a;

    /* renamed from: b, reason: collision with root package name */
    public TextClassifier f3654b;

    /* renamed from: androidx.appcompat.widget.o$a */
    public static final class a {
        public static TextClassifier a(TextView r1) {
            TextClassificationManager r12 = (TextClassificationManager) r1.getContext().getSystemService(TextClassificationManager.class);
            if (r12 == null) goto L7;
            return r12.getTextClassifier();
        L7:
            return TextClassifier.NO_OP;
        }
    }

    public C2098o(TextView r1) {
        this.f3653a = (TextView) androidx.core.util.h.g(r1);
    }

    public TextClassifier a() {
        TextClassifier r02 = this.f3654b;
        if (r02 == null) goto L5;
        return r02;
    L5:
        return a.a(this.f3653a);
    }

    public void b(TextClassifier r1) {
        this.f3654b = r1;
    }
}
