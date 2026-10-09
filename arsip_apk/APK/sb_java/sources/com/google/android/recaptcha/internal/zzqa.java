package com.google.android.recaptcha.internal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes5.dex */
final class zzqa extends ThreadLocal {
    public zzqa() {
    }

    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Object initialValue() {
        SimpleDateFormat r02 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        GregorianCalendar r1 = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        r1.setGregorianChange(new Date(Long.MIN_VALUE));
        r02.setCalendar(r1);
        return r02;
    }
}
