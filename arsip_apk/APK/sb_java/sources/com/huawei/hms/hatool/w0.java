package com.huawei.hms.hatool;

import android.annotation.TargetApi;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;

/* loaded from: classes6.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f39430a = null;

    static {
        f39430a = new String[]{"e2f856b9f9a4fd4cb2795aeaf83268e4bff189aaec05d691ffde76e075b82648", "173cf86fe9894a0f70dadd09d4fd88c380836099d4939f8c3754361bdc16a32b", "b368b110e3b565fe97c91f786e11bc48754cc8e4e6f21d8a94a68ac6ad67aaaf", "db48223fd9e143f7e133c57f5d08a4e38549ce3ebd921fe3b4003c26e5e35bed", "4bdecdf772491e35c4e8b48f88aee22bae1311984f2e1da4dfad0b78ee7f5163", "3081a0adab3018d57165e6dd24074bdbac640f6dbe21a9e24d3474a87ebf38b8", "db53fcdc9ab71e9bdd4eab257fe1aba7989ad2b24fbe3a85dfef72ea1dd6bae2", "d80f18e8081b624cc64985f87f70118f1702985d2e10dbc985ee7be334fd3c7d", "5fed96c85bd58c58aadbd465c172a4c9a794d8eb2f86cbc7bcee6caf4c7a2c5f", "07ff9b7aeeff969173c45b285fe0fecdbaae244576ff7a2796a36f1c0c11adb4", "92974c6802419e4d18b5ec536cbfa167b8e8eff09ec4c8510a5b95750b1e0c82", "403f14ad2f0e5eb3c4f3a0bcd5c1592cc4492662ad53191c92905255d4990656", "4230baa077b401374d0fc012375047e79ea0790d58d095ef18d97d95470c738d", "f8d927750a0952ffb5bd87dfb83d781ae65f7bed043a7886d1d3cdcfc94bb77a", "e9702f1e92e97fce49cdf81a5fa730a4e913554d09b3fe41e1d8a7fba00a8459", "24fbae40bcd50b759b26e3ba0f46aa25e932fa7da05f226d75ec507bcf53bce5"};
    }

    @TargetApi(9)
    public static String a(String r4) {
        if (TextUtils.isEmpty(r4) == false) goto L20;
        z.c("hmsSdk", "url is null");
        return r4;
    L20:
    L14:
        e = move-exception;
        z.b("hmsSdk", "getHostByURI error : " + e.getMessage());
        return null;
    L8:
        if (URLUtil.isNetworkUrl(r4) == true) goto L10;
    L16:
        z.b("hmsSdk", "url don't starts with https");     // Catch: URISyntaxException -> L14
        return null;
    L10:
        if (r4.toLowerCase(Locale.US).startsWith("http:") == true) goto L16;
        return new URI(r4).getHost();
    }

    public static boolean b(String r7) {
        if (l1.f39379a.booleanValue() == false) goto L5;
        return true;
    L5:
        String[] r02 = f39430a;
        int r2 = r02.length;
        int r4 = 0;
    L6:
        if (r4 >= r2) goto L11;
        if (a(r7, r02[r4], 2) == true) goto L9;
        r4 = r4 + 1;
        goto L6
    L9:
        return true;
    L11:
        return false;
    }

    private static String a(String r3, int r4) {
        if (TextUtils.isEmpty(r3) == true) goto L15;
        if (r4 <= 0) goto L15;
        String[] r32 = r3.split("\\.");
        if (r32.length >= r4) goto L10;
        return "";
    L10:
        StringBuffer r02 = new StringBuffer();
        r02.append(r32[r32.length - r4]);
        int r1 = 1;
    L11:
        if (r1 >= r4) goto L14;
        r02.append(".");
        r02.append(r32[(r32.length - r4) + r1]);
        r1 = r1 + 1;
        goto L11
    L14:
        return r02.toString();
    L15:
        z.c("hmsSdk", "url is null");
        return r3;
    }

    public static boolean a(String r3, String r4, int r5) {
        String r32 = a(r3);
        if (TextUtils.isEmpty(r32) == false) goto L5;
    L31:
        String r33 = "url or whitelistHash is null";
    L10:
        z.b("hmsSdk", r33);
        return false;
    L5:
        if (TextUtils.isEmpty(r4) == true) goto L31;
        String r52 = a(r32, r5);
        if (TextUtils.isEmpty(r52) == false) goto L13;
        r33 = "get urlLastNStr is null";
        goto L10
    L13:
        if (r4.equals(com.huawei.secure.android.common.encrypt.hash.b.b(r32)) == false) goto L17;
        return true;
    L17:
        if (r4.equals(com.huawei.secure.android.common.encrypt.hash.b.b(r52)) == true) goto L32;
        return false;
    L32:
        String r34 = r32.substring(0, r32.length() - r52.length());     // Catch: Exception -> L23 IndexOutOfBoundsException -> L25
        if (r34.endsWith(".") == true) goto L21;
        return false;
    L21:
        return r34.matches("^[A-Za-z0-9.-]+$");
    L25:
        e = e;
        StringBuilder r42 = new StringBuilder();
        String r53 = "IndexOutOfBoundsException";
    L28:
        r42.append(r53);
        r42.append(e.getMessage());
        r33 = r42.toString();
    L23:
        e = e;
        r42 = new StringBuilder();
        r53 = "Exception : ";
        goto L28
    }
}
