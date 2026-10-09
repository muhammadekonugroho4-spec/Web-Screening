package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
class UtcDates {
    static final String UTC = "UTC";
    static AtomicReference<TimeSource> timeSourceRef;

    static {
        timeSourceRef = new AtomicReference();
    }

    private UtcDates() {
    }

    public static long canonicalYearMonthDay(long r1) {
        Calendar r02 = getUtcCalendar();
        r02.setTimeInMillis(r1);
        return getDayCopy(r02).getTimeInMillis();
    }

    private static int findCharactersInDateFormatPattern(String r2, String r3, int r4, int r5) {
    L2:
        if (r5 < 0) goto L17;
        if (r5 >= r2.length()) goto L17;
        if (r3.indexOf(r2.charAt(r5)) != (-1)) goto L17;
        if (r2.charAt(r5) != '\'') goto L16;
    L9:
        r5 = r5 + r4;
        if (r5 < 0) goto L16;
        if (r5 >= r2.length()) goto L16;
        if (r2.charAt(r5) != '\'') goto L9;
    L16:
        r5 = r5 + r4;
    L17:
        return r5;
    }

    @TargetApi(24)
    public static DateFormat getAbbrMonthDayFormat(Locale r1) {
        return getAndroidFormat("MMMd", r1);
    }

    @TargetApi(24)
    private static DateFormat getAndroidFormat(String r02, Locale r1) {
        DateFormat r03 = DateFormat.getInstanceForSkeleton(r02, r1);
        r03.setTimeZone(getUtcAndroidTimeZone());
        r03.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return r03;
    }

    public static String getDatePatternAsInputFormat(String r3) {
        return r3.replaceAll("[^dMy/\\-.]", "").replaceAll("d{1,2}", "dd").replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", "yyyy").replaceAll("\\.$", "").replaceAll("My", "M/y");
    }

    public static Calendar getDayCopy(Calendar r4) {
        Calendar r42 = getUtcCalendarOf(r4);
        Calendar r02 = getUtcCalendar();
        r02.set(r42.get(1), r42.get(2), r42.get(5));
        return r02;
    }

    public static SimpleDateFormat getDefaultTextInputFormat() {
        SimpleDateFormat r1 = new SimpleDateFormat(getDatePatternAsInputFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern()), Locale.getDefault());
        r1.setTimeZone(getTimeZone());
        r1.setLenient(false);
        return r1;
    }

    public static String getDefaultTextInputHint(Resources r6, SimpleDateFormat r7) {
        String r72 = r7.toPattern();
        String r02 = r6.getString(R.string.mtrl_picker_text_input_year_abbr);
        String r1 = r6.getString(R.string.mtrl_picker_text_input_month_abbr);
        String r62 = r6.getString(R.string.mtrl_picker_text_input_day_abbr);
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) == false) goto L6;
        r72 = r72.replaceAll("d+", Constants.INAPP_DATA_TAG).replaceAll("M+", "M").replaceAll("y+", "y");
    L6:
        return r72.replace(Constants.INAPP_DATA_TAG, r62).replace("M", r1).replace("y", r02);
    }

    private static java.text.DateFormat getFormat(int r02, Locale r1) {
        java.text.DateFormat r03 = java.text.DateFormat.getDateInstance(r02, r1);
        r03.setTimeZone(getTimeZone());
        return r03;
    }

    public static java.text.DateFormat getFullFormat() {
        return getFullFormat(Locale.getDefault());
    }

    public static java.text.DateFormat getMediumFormat() {
        return getMediumFormat(Locale.getDefault());
    }

    public static java.text.DateFormat getMediumNoYear() {
        return getMediumNoYear(Locale.getDefault());
    }

    @TargetApi(24)
    public static DateFormat getMonthWeekdayDayFormat(Locale r1) {
        return getAndroidFormat("MMMMEEEEd", r1);
    }

    public static java.text.DateFormat getNormalizedFormat(java.text.DateFormat r1) {
        java.text.DateFormat r12 = (java.text.DateFormat) r1.clone();
        r12.setTimeZone(getTimeZone());
        return r12;
    }

    public static SimpleDateFormat getSimpleFormat(String r1) {
        return getSimpleFormat(r1, Locale.getDefault());
    }

    public static TimeSource getTimeSource() {
        TimeSource r02 = timeSourceRef.get();
        if (r02 == null) goto L5;
        return r02;
    L5:
        return TimeSource.system();
    }

    private static TimeZone getTimeZone() {
        return TimeZone.getTimeZone(UTC);
    }

    public static Calendar getTodayCalendar() {
        Calendar r02 = getTimeSource().now();
        r02.set(11, 0);
        r02.set(12, 0);
        r02.set(13, 0);
        r02.set(14, 0);
        r02.setTimeZone(getTimeZone());
        return r02;
    }

    @TargetApi(24)
    private static android.icu.util.TimeZone getUtcAndroidTimeZone() {
        return android.icu.util.TimeZone.getTimeZone(UTC);
    }

    public static Calendar getUtcCalendar() {
        return getUtcCalendarOf(null);
    }

    public static Calendar getUtcCalendarOf(Calendar r3) {
        Calendar r02 = Calendar.getInstance(getTimeZone());
        if (r3 != null) goto L6;
        r02.clear();
        return r02;
    L6:
        r02.setTimeInMillis(r3.getTimeInMillis());
        return r02;
    }

    @TargetApi(24)
    public static DateFormat getYearAbbrMonthDayFormat(Locale r1) {
        return getAndroidFormat("yMMMd", r1);
    }

    @TargetApi(24)
    public static DateFormat getYearMonthFormat(Locale r1) {
        return getAndroidFormat("yMMMM", r1);
    }

    @TargetApi(24)
    public static DateFormat getYearMonthWeekdayDayFormat(Locale r1) {
        return getAndroidFormat("yMMMMEEEEd", r1);
    }

    private static String removeYearFromDateFormatPattern(String r5) {
        int r02 = findCharactersInDateFormatPattern(r5, "yY", 1, 0);
        if (r02 < r5.length()) goto L5;
        return r5;
    L5:
        String r1 = "EMd";
        int r3 = findCharactersInDateFormatPattern(r5, "EMd", 1, r02);
        if (r3 >= r5.length()) goto L9;
        r1 = "EMd" + Constants.SEPARATOR_COMMA;
    L9:
        return r5.replace(r5.substring(findCharactersInDateFormatPattern(r5, r1, -1, r02) + 1, r3), " ").trim();
    }

    public static void setTimeSource(TimeSource r1) {
        timeSourceRef.set(r1);
    }

    public static java.text.DateFormat getFullFormat(Locale r1) {
        return getFormat(0, r1);
    }

    public static java.text.DateFormat getMediumFormat(Locale r1) {
        return getFormat(2, r1);
    }

    public static java.text.DateFormat getMediumNoYear(Locale r1) {
        SimpleDateFormat r12 = (SimpleDateFormat) getMediumFormat(r1);
        r12.applyPattern(removeYearFromDateFormatPattern(r12.toPattern()));
        return r12;
    }

    private static SimpleDateFormat getSimpleFormat(String r1, Locale r2) {
        SimpleDateFormat r02 = new SimpleDateFormat(r1, r2);
        r02.setTimeZone(getTimeZone());
        return r02;
    }
}
