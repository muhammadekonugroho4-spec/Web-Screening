package com.stockbit.domain.helper;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class c {
    public static final Boolean a(String r14, String r15) {
        p.l(r14, "dateData");
        p.l(r15, "dateFormat");
        SimpleDateFormat r02 = new SimpleDateFormat(r15, Locale.US);
        Date r142 = r02.parse(r14);     // Catch: ParseException -> L22
        boolean r1 = true;
        Date r03 = r02.parse(i(null, 1, null));     // Catch: ParseException -> L22
        if (r142 == null) goto L21;
        if (r03 == null) goto L21;
        long r2 = r03.getTime() - r142.getTime();     // Catch: ParseException -> L22
        long r4 = 60;
        long r8 = r4 * 1000;     // Catch: ParseException -> L22
        long r42 = r4 * r8;     // Catch: ParseException -> L22
        long r10 = 24 * r42;     // Catch: ParseException -> L22
        long r12 = r2 / r10;     // Catch: ParseException -> L22
        long r22 = r2 % r10;     // Catch: ParseException -> L22
        long r102 = r22 / r42;     // Catch: ParseException -> L22
        long r23 = r22 % r42;     // Catch: ParseException -> L22
        long r43 = r23 / r8;     // Catch: ParseException -> L22
        long r24 = (r23 % r8) / 1000;     // Catch: ParseException -> L22
        if (r12 <= 0) goto L11;
    L17:
        r1 = false;
    L19:
        return Boolean.valueOf(r1);
    L11:
        if (r102 > 0) goto L17;
        if (r43 >= 2) goto L17;
        if (r24 >= 60) goto L17;
    L21:
        return Boolean.FALSE;
    L22:
        return null;
    }

    public static final String b(String r2, String r3, String r4) {
        p.l(r3, "givenFormat");
        p.l(r4, "expectedFormat");
        SimpleDateFormat r02 = new SimpleDateFormat(r3, Locale.getDefault());
        if (r2 == null) goto L15;
        Date r32 = r02.parse(r2);     // Catch: Exception -> L8 ParseException -> L10
        if (r32 == null) goto L16;
        String r33 = new SimpleDateFormat(r4, Locale.getDefault()).format(r32);     // Catch: Exception -> L8 ParseException -> L10
        p.k(r33, "format(...)");     // Catch: Exception -> L8 ParseException -> L10
        return r33;
    L16:
        return "";
    L10:
        System.out.println("Error parsing date and time: " + r2);
        return "";
    L8:
        e = move-exception;
        System.out.println("Unknown error parsing date and time: " + r2 + " with error " + e);
        return "";
    L15:
        return "";
    }

    public static final String c(String r5, String r6) {
        p.l(r6, "givenFormat");
        SimpleDateFormat r02 = new SimpleDateFormat(r6, Locale.US);
        r02.applyPattern(r6);
        if (r5 == null) goto L13;
        org.ocpsoft.prettytime.c r1 = new org.ocpsoft.prettytime.c();
        if (p.g(a(r5, r6), Boolean.TRUE) == false) goto L15;
        String r52 = r1.d(r02.parse(r02.format(Long.valueOf(new Date(Calendar.getInstance().getTimeInMillis() - 60000).getTime()))));
        p.i(r52);
        return r52;
    L15:
        String r53 = r1.d(r02.parse(r5));     // Catch: ParseException -> L11
        p.i(r53);
        return r53;
    L11:
        return null;
    L13:
        return "-";
    }

    public static /* synthetic */ String d(String r02, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    L6:
        return c(r02, r1);
    }

    public static final String e(Date r1, String r2, Locale r3, TimeZone r4) {
        p.l(r1, "<this>");
        p.l(r2, "pattern");
        p.l(r3, "locale");
        p.l(r4, RemoteConfigConstants.RequestFieldKey.TIME_ZONE);
        SimpleDateFormat r02 = new SimpleDateFormat(r2, r3);     // Catch: ParseException -> L5
        r02.setTimeZone(r4);     // Catch: ParseException -> L5
        return r02.format(r1);
    L5:
        return null;
    }

    public static /* synthetic */ String f(Date r1, String r2, Locale r3, TimeZone r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = Locale.getDefault();
        p.k(r3, "getDefault(...)");
    L9:
        if ((r5 & 4) == 0) goto L12;
        r4 = TimeZone.getDefault();
        p.k(r4, "getDefault(...)");
    L12:
        return e(r1, r2, r3, r4);
    }

    public static final String g(String r3) {
        p.l(r3, "pattern");
        Calendar r02 = Calendar.getInstance();
        r02.set(6, 1);
        String r32 = new SimpleDateFormat(r3, Locale.getDefault()).format(r02.getTime());
        p.k(r32, "format(...)");
        return r32;
    }

    public static final String h(String r3) {
        p.l(r3, "pattern");
        Date r02 = Calendar.getInstance().getTime();
        String r32 = new SimpleDateFormat(r3, Locale.US).format(r02);
        p.k(r32, "format(...)");
        return r32;
    }

    public static /* synthetic */ String i(String r02, int r1, Object r2) {
        if ((r1 & 1) == 0) goto L6;
        r02 = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    L6:
        return h(r02);
    }

    public static final Date j(String r2, String r3, Date r4, Locale r5, TimeZone r6) {
        p.l(r3, "givenFormat");
        p.l(r5, "locale");
        p.l(r6, RemoteConfigConstants.RequestFieldKey.TIME_ZONE);
        SimpleDateFormat r02 = new SimpleDateFormat(r3, r5);
        r02.setTimeZone(r6);
        return r02.parse(r2);
    L5:
        Date r52 = new Date(0);
        if (r4 != null) goto L9;
        Locale r42 = Locale.US;
        p.k(r42, "US");
        TimeZone r62 = TimeZone.getTimeZone("UTC");
        p.k(r62, "getTimeZone(...)");
        r4 = j(r2, r3, r52, r42, r62);
    L9:
        if (p.g(r4, r52) == false) goto L14;
        return null;
    L14:
        return r4;
    }

    public static /* synthetic */ Date k(String r1, String r2, Date r3, Locale r4, TimeZone r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = new Locale(Constants.KEY_ID, "ID");
    L12:
        if ((r6 & 8) == 0) goto L15;
        r5 = TimeZone.getTimeZone("Asia/Jakarta");
        p.k(r5, "getTimeZone(...)");
    L15:
        return j(r1, r2, r3, r4, r5);
    }
}
