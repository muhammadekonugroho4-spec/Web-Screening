package androidx.compose.foundation.text.contextmenu.data;

import android.view.textclassifier.TextClassification;

/* loaded from: classes.dex */
public final class h extends b {

    /* renamed from: b, reason: collision with root package name */
    public final TextClassification f9735b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9736c;

    static {
    }

    public h(Object r1, TextClassification r2, int r3) {
        super(r1);
        this.f9735b = r2;
        this.f9736c = r3;
    }

    public final int b() {
        return this.f9736c;
    }

    public final TextClassification c() {
        return this.f9735b;
    }

    public String toString() {
        return "TextContextMenuRemoteActionItem(key=" + a() + ", textClassification=" + this.f9735b + ", index=" + this.f9736c + ')';
    }
}
