package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class l implements Spannable {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextPaint f23060a;

        /* renamed from: b, reason: collision with root package name */
        public final TextDirectionHeuristic f23061b;

        /* renamed from: c, reason: collision with root package name */
        public final int f23062c;
        public final int d;

        /* renamed from: e, reason: collision with root package name */
        public final PrecomputedText.Params f23063e;

        /* renamed from: androidx.core.text.l$a$a, reason: collision with other inner class name */
        public static class C0170a {

            /* renamed from: a, reason: collision with root package name */
            public final TextPaint f23064a;

            /* renamed from: b, reason: collision with root package name */
            public TextDirectionHeuristic f23065b;

            /* renamed from: c, reason: collision with root package name */
            public int f23066c;
            public int d;

            public C0170a(TextPaint r1) {
                this.f23064a = r1;
                this.f23066c = 1;
                this.d = 1;
                this.f23065b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            public a a() {
                return new a(this.f23064a, this.f23065b, this.f23066c, this.d);
            }

            public C0170a b(int r1) {
                this.f23066c = r1;
                return this;
            }

            public C0170a c(int r1) {
                this.d = r1;
                return this;
            }

            public C0170a d(TextDirectionHeuristic r1) {
                this.f23065b = r1;
                return this;
            }
        }

        public a(TextPaint r3, TextDirectionHeuristic r4, int r5, int r6) {
            if (Build.VERSION.SDK_INT < 29) goto L5;
            this.f23063e = j.a(i.a(h.a(g.a(k.a(r3), r5), r6), r4));
        L6:
            this.f23060a = r3;
            this.f23061b = r4;
            this.f23062c = r5;
            this.d = r6;
            return;
        L5:
            this.f23063e = null;
            goto L6
        }

        public boolean a(a r4) {
            if (this.f23062c == r4.b()) goto L6;
            return false;
        L6:
            if (this.d == r4.c()) goto L9;
            return false;
        L9:
            if (this.f23060a.getTextSize() == r4.e().getTextSize()) goto L12;
            return false;
        L12:
            if (this.f23060a.getTextScaleX() == r4.e().getTextScaleX()) goto L15;
            return false;
        L15:
            if (this.f23060a.getTextSkewX() == r4.e().getTextSkewX()) goto L18;
            return false;
        L18:
            if (this.f23060a.getLetterSpacing() == r4.e().getLetterSpacing()) goto L21;
            return false;
        L21:
            if (TextUtils.equals(this.f23060a.getFontFeatureSettings(), r4.e().getFontFeatureSettings()) == true) goto L24;
            return false;
        L24:
            if (this.f23060a.getFlags() == r4.e().getFlags()) goto L27;
            return false;
        L27:
            if (this.f23060a.getTextLocales().equals(r4.e().getTextLocales()) == true) goto L30;
            return false;
        L30:
            if (this.f23060a.getTypeface() != null) goto L35;
            if (r4.e().getTypeface() == null) goto L37;
            return false;
        L37:
            return true;
        L35:
            if (this.f23060a.getTypeface().equals(r4.e().getTypeface()) == true) goto L39;
            return false;
        L39:
            return true;
        }

        public int b() {
            return this.f23062c;
        }

        public int c() {
            return this.d;
        }

        public TextDirectionHeuristic d() {
            return this.f23061b;
        }

        public TextPaint e() {
            return this.f23060a;
        }

        public boolean equals(Object r4) {
            if (r4 != this) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L8;
            return false;
        L8:
            a r42 = (a) r4;
            if (a(r42) == true) goto L12;
            return false;
        L12:
            if (this.f23061b != r42.d()) goto L14;
            return true;
        L14:
            return false;
        }

        public int hashCode() {
            return androidx.core.util.c.b(new Object[]{Float.valueOf(this.f23060a.getTextSize()), Float.valueOf(this.f23060a.getTextScaleX()), Float.valueOf(this.f23060a.getTextSkewX()), Float.valueOf(this.f23060a.getLetterSpacing()), Integer.valueOf(this.f23060a.getFlags()), this.f23060a.getTextLocales(), this.f23060a.getTypeface(), Boolean.valueOf(this.f23060a.isElegantTextHeight()), this.f23061b, Integer.valueOf(this.f23062c), Integer.valueOf(this.d)});
        }

        public String toString() {
            StringBuilder r02 = new StringBuilder("{");
            r02.append("textSize=" + this.f23060a.getTextSize());
            r02.append(", textScaleX=" + this.f23060a.getTextScaleX());
            r02.append(", textSkewX=" + this.f23060a.getTextSkewX());
            r02.append(", letterSpacing=" + this.f23060a.getLetterSpacing());
            r02.append(", elegantTextHeight=" + this.f23060a.isElegantTextHeight());
            r02.append(", textLocale=" + this.f23060a.getTextLocales());
            r02.append(", typeface=" + this.f23060a.getTypeface());
            r02.append(", variationSettings=" + this.f23060a.getFontVariationSettings());
            r02.append(", textDir=" + this.f23061b);
            r02.append(", breakStrategy=" + this.f23062c);
            r02.append(", hyphenationFrequency=" + this.d);
            r02.append("}");
            return r02.toString();
        }

        public a(PrecomputedText.Params r3) {
            this.f23060a = c.a(r3);
            this.f23061b = d.a(r3);
            this.f23062c = e.a(r3);
            this.d = f.a(r3);
            if (Build.VERSION.SDK_INT >= 29) goto L6;
            r3 = null;
        L6:
            this.f23063e = r3;
        }
    }
}
