package androidx.databinding.adapters;

import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.widget.TextView;
import androidx.databinding.g;

/* loaded from: classes4.dex */
public abstract class e {

    public class a implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f23592a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f23593b;

        public a(c r1, d r2, g r3, b r4) {
            this.f23592a = r2;
            this.f23593b = r3;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable r1) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence r2, int r3, int r4, int r5) {
            d r02 = this.f23592a;
            if (r02 == null) goto L5;
            r02.onTextChanged(r2, r3, r4, r5);
        L5:
            g r22 = this.f23593b;
            if (r22 == null) goto L9;
            r22.a();
            return;
        }
    }

    public interface b {
    }

    public interface c {
    }

    public interface d {
        void onTextChanged(CharSequence r1, int r2, int r3, int r4);
    }

    public static String a(TextView r02) {
        return r02.getText().toString();
    }

    public static boolean b(CharSequence r6, CharSequence r7) {
        if (r6 != null) goto L5;
        boolean r2 = true;
    L6:
        if (r7 != null) goto L8;
        boolean r3 = true;
    L9:
        if (r2 == r3) goto L11;
        return true;
    L11:
        if (r6 != null) goto L13;
        return false;
    L13:
        int r22 = r6.length();
        if (r22 == r7.length()) goto L16;
        return true;
    L16:
        int r32 = 0;
    L17:
        if (r32 >= r22) goto L22;
        if (r6.charAt(r32) != r7.charAt(r32)) goto L20;
        r32 = r32 + 1;
        goto L17
    L20:
        return true;
    L22:
        return false;
    L8:
        r3 = false;
        goto L9
    L5:
        r2 = false;
        goto L6
    }

    public static void c(TextView r5, int r6) {
        InputFilter[] r02 = r5.getFilters();
        if (r02 != null) goto L5;
        r02 = new InputFilter[]{new InputFilter.LengthFilter(r6)};
    L15:
        r5.setFilters(r02);
        return;
    L5:
        int r2 = 0;
    L7:
        if (r2 >= r02.length) goto L14;
        InputFilter r3 = r02[r2];
        if ((r3 instanceof InputFilter.LengthFilter) == true) goto L11;
        r2 = r2 + 1;
        goto L7
    L11:
        if (((InputFilter.LengthFilter) r3).getMax() == r6) goto L15;
        r02[r2] = new InputFilter.LengthFilter(r6);
        goto L15
    L14:
        int r22 = r02.length;
        InputFilter[] r32 = new InputFilter[r22 + 1];
        System.arraycopy(r02, 0, r32, 0, r02.length);
        r32[r22] = new InputFilter.LengthFilter(r6);
        r02 = r32;
        goto L15
    }

    public static void d(TextView r2, CharSequence r3) {
        CharSequence r02 = r2.getText();
        if (r3 == r02) goto L18;
        if (r3 != null) goto L9;
        if (r02.length() != 0) goto L9;
        return;
    L9:
        if ((r3 instanceof Spanned) == false) goto L14;
        if (r3.equals(r02) == true) goto L20;
    L16:
        r2.setText(r3);
        return;
    L20:
        return;
    L14:
        if (b(r3, r02) == true) goto L16;
        return;
    }

    public static void e(TextView r1, c r2, d r3, b r4, g r5) {
        if (r2 != null) goto L7;
        if (r4 != null) goto L7;
        if (r3 != null) goto L7;
        if (r5 != null) goto L7;
        a r22 = null;
    L8:
        TextWatcher r32 = (TextWatcher) androidx.databinding.adapters.c.a(r1, r22, androidx.databinding.library.baseAdapters.a.f23602a);
        if (r32 == null) goto L11;
        r1.removeTextChangedListener(r32);
    L11:
        if (r22 == null) goto L14;
        r1.addTextChangedListener(r22);
        return;
    L14:
        return;
    L7:
        r22 = new a(r2, r3, r5, r4);
        goto L8
    }
}
