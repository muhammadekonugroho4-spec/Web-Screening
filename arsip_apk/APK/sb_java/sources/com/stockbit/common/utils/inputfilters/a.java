package com.stockbit.common.utils.inputfilters;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class a implements InputFilter {

    /* renamed from: b, reason: collision with root package name */
    public static final C0640a f62321b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f62322c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f62323a;

    /* renamed from: com.stockbit.common.utils.inputfilters.a$a, reason: collision with other inner class name */
    public static final class C0640a {
        public /* synthetic */ C0640a(i r1) {
            this();
        }

        public C0640a() {
        }
    }

    static {
        f62321b = new C0640a(null);
        f62322c = 8;
    }

    public a(int r3, int r4) {
        Pattern r32 = Pattern.compile("-?[0-9]{0," + r3 + "}+((\\.[0-9]{0," + r4 + "})?)||(\\.)?");
        p.k(r32, "compile(...)");
        this.f62323a = r32;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence r2, int r3, int r4, Spanned r5, int r6, int r7) {
        p.l(r2, "source");
        p.l(r5, "dest");
        Matcher r32 = this.f62323a.matcher(r5.subSequence(0, r6) + r2.subSequence(r3, r4).toString() + r5.subSequence(r7, r5.length()));
        p.k(r32, "matcher(...)");
        if (r32.matches() == false) goto L7;
        return null;
    L7:
        if (TextUtils.isEmpty(r2) == true) goto L9;
        return "";
    L9:
        return r5.subSequence(r6, r7);
    }

    public /* synthetic */ a(int r2, int r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 100;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = 100;
    L8:
        this(r2, r3);
    }
}
