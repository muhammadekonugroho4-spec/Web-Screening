package androidx.core.text;

import android.text.Html;
import android.text.Spanned;

/* loaded from: classes.dex */
public abstract class b {

    public static class a {
        public static Spanned a(String r02, int r1) {
            return Html.fromHtml(r02, r1);
        }

        public static Spanned b(String r02, int r1, Html.ImageGetter r2, Html.TagHandler r3) {
            return Html.fromHtml(r02, r1, r2, r3);
        }
    }

    public static Spanned a(String r02, int r1) {
        return a.a(r02, r1);
    }

    public static Spanned b(String r02, int r1, Html.ImageGetter r2, Html.TagHandler r3) {
        return a.b(r02, r1, r2, r3);
    }
}
