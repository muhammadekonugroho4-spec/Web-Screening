package com.huawei.agconnect.config.impl;

import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.android.HwBuildEx;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.SecretKey;

/* loaded from: classes6.dex */
public class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final f f38843a;

    /* renamed from: b, reason: collision with root package name */
    public SecretKey f38844b;

    public g(f r1) {
        this.f38843a = r1;
        b();
    }

    public static boolean c(String r1) {
        if (TextUtils.isEmpty(r1) == false) goto L5;
        return false;
    L5:
        if (Pattern.matches("^\\[!([A-Fa-f0-9]*)]", r1) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static String d(String r2) {
        Matcher r22 = Pattern.compile("^\\[!([A-Fa-f0-9]*)]").matcher(r2);     // Catch: Throwable -> L8
        if (r22.find() == false) goto L7;
        return r22.group(1);
    L7:
        return "";
    L8:
        Log.e("ExclamationMark", "getRawString exception");
        return "";
    }

    @Override // com.huawei.agconnect.config.impl.i
    public String a(String r4, String r5) {
        if (this.f38844b != null) goto L8;
        String r42 = "mKey is null, return default value";
    L5:
        Log.e("ExclamationMark", r42);
        return r5;
    L8:
        if (c(r4) == true) goto L13;
        return r5;
    L13:
        return new String(k.b(this.f38844b, a.b(d(r4))), "UTF-8");
    L11:
        r42 = "UnsupportedEncodingException||GeneralSecurityException||IllegalArgumentException";
        goto L5
    }

    public final SecretKey b() {
        String r1 = this.f38843a.a("/code/code1", null);     // Catch: Throwable -> L10
        String r2 = this.f38843a.a("/code/code2", null);     // Catch: Throwable -> L10
        String r3 = this.f38843a.a("/code/code3", null);     // Catch: Throwable -> L10
        String r4 = this.f38843a.a("/code/code4", null);     // Catch: Throwable -> L10
        if (r1 == null) goto L12;
        if (r2 == null) goto L12;
        if (r3 == null) goto L12;
        if (r4 == null) goto L12;
        this.f38844b = k.a(a.b(r1), a.b(r2), a.b(r3), a.b(r4), HwBuildEx.VersionCodes.CUR_DEVELOPMENT);     // Catch: Throwable -> L10
    L12:
        return this.f38844b;
    L10:
        Log.e("ExclamationMark", "Exception when reading the 'K&I' for 'Config'.");
        this.f38844b = null;
        goto L12
    }
}
