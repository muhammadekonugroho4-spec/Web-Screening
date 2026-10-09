package com.google.zxing.client.result;

import com.clevertap.android.sdk.Constants;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class CalendarParsedResult extends ParsedResult {
    private static final Pattern DATE_TIME = null;
    private static final Pattern RFC2445_DURATION = null;
    private static final long[] RFC2445_DURATION_FIELD_UNITS = null;
    private final String[] attendees;
    private final String description;
    private final long end;
    private final boolean endAllDay;
    private final double latitude;
    private final String location;
    private final double longitude;
    private final String organizer;
    private final long start;
    private final boolean startAllDay;
    private final String summary;

    static {
        RFC2445_DURATION = Pattern.compile("P(?:(\\d+)W)?(?:(\\d+)D)?(?:T(?:(\\d+)H)?(?:(\\d+)M)?(?:(\\d+)S)?)?");
        RFC2445_DURATION_FIELD_UNITS = new long[]{604800000, Constants.ONE_DAY_IN_MILLIS, 3600000, Constants.ONE_MIN_IN_MILLIS, 1000};
        DATE_TIME = Pattern.compile("[0-9]{8}(T[0-9]{6}Z?)?");
    }

    public CalendarParsedResult(String r7, String r8, String r9, String r10, String r11, String r12, String[] r13, String r14, double r15, double r17) {
        super(ParsedResultType.CALENDAR);
        this.summary = r7;
        long r02 = parseDate(r8);     // Catch: ParseException -> L25
        this.start = r02;     // Catch: ParseException -> L25
        if (r9 != null) goto L28;
        long r2 = parseDurationMS(r10);
        if (r2 >= 0) goto L8;
        long r03 = -1;
    L9:
        this.end = r03;
    L11:
        int r72 = r8.length();
        boolean r82 = false;
        if (r72 != 8) goto L14;
        boolean r73 = true;
    L15:
        this.startAllDay = r73;
        if (r9 != null) goto L18;
    L20:
        this.endAllDay = r82;
        this.location = r11;
        this.organizer = r12;
        this.attendees = r13;
        this.description = r14;
        this.latitude = r15;
        this.longitude = r17;
        return;
    L18:
        if (r9.length() != 8) goto L20;
        r82 = true;
        goto L20
    L14:
        r73 = false;
        goto L15
    L8:
        r03 = r02 + r2;
        goto L9
    L28:
        this.end = parseDate(r9);     // Catch: ParseException -> L22
    L22:
        e = move-exception;
        throw new IllegalArgumentException(e.toString());
    L25:
        e = move-exception;
        throw new IllegalArgumentException(e.toString());
    }

    private static String format(boolean r2, long r3) {
        if (r3 >= 0) goto L7;
        return null;
    L7:
        if (r2 == false) goto L9;
        DateFormat r22 = DateFormat.getDateInstance(2);
    L11:
        return r22.format(Long.valueOf(r3));
    L9:
        r22 = DateFormat.getDateTimeInstance(2, 2);
        goto L11
    }

    private static long parseDate(String r5) throws ParseException {
        if (DATE_TIME.matcher(r5).matches() == false) goto L17;
        if (r5.length() != 8) goto L9;
        SimpleDateFormat r02 = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
        r02.setTimeZone(TimeZone.getTimeZone("GMT"));
        return r02.parse(r5).getTime();
    L9:
        if (r5.length() != 16) goto L15;
        if (r5.charAt(15) != 'Z') goto L15;
        long r3 = parseDateTimeString(r5.substring(0, 15));
        long r32 = r3 + r5.get(15);
        new GregorianCalendar().setTime(new Date(r32));
        return r32 + r5.get(16);
    L15:
        return parseDateTimeString(r5);
    L17:
        throw new ParseException(r5, 0);
    }

    private static long parseDateTimeString(String r3) throws ParseException {
        return new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH).parse(r3).getTime();
    }

    private static long parseDurationMS(CharSequence r7) {
        if (r7 != null) goto L5;
        return -1;
    L5:
        Matcher r72 = RFC2445_DURATION.matcher(r7);
        if (r72.matches() == true) goto L8;
        return -1;
    L8:
        long r02 = 0;
        int r2 = 0;
    L9:
        long[] r3 = RFC2445_DURATION_FIELD_UNITS;
        if (r2 >= r3.length) goto L15;
        int r4 = r2 + 1;
        if (r72.group(r4) == null) goto L14;
        r02 = r02 + (r3[r2] * Integer.parseInt(r5));
    L14:
        r2 = r4;
        goto L9
    L15:
        return r02;
    }

    public String[] getAttendees() {
        return this.attendees;
    }

    public String getDescription() {
        return this.description;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder r02 = new StringBuilder(100);
        ParsedResult.maybeAppend(this.summary, r02);
        ParsedResult.maybeAppend(format(this.startAllDay, this.start), r02);
        ParsedResult.maybeAppend(format(this.endAllDay, this.end), r02);
        ParsedResult.maybeAppend(this.location, r02);
        ParsedResult.maybeAppend(this.organizer, r02);
        ParsedResult.maybeAppend(this.attendees, r02);
        ParsedResult.maybeAppend(this.description, r02);
        return r02.toString();
    }

    @Deprecated
    public Date getEnd() {
        if (this.end >= 0) goto L7;
        return null;
    L7:
        return new Date(this.end);
    }

    public long getEndTimestamp() {
        return this.end;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public String getLocation() {
        return this.location;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public String getOrganizer() {
        return this.organizer;
    }

    @Deprecated
    public Date getStart() {
        return new Date(this.start);
    }

    public long getStartTimestamp() {
        return this.start;
    }

    public String getSummary() {
        return this.summary;
    }

    public boolean isEndAllDay() {
        return this.endAllDay;
    }

    public boolean isStartAllDay() {
        return this.startAllDay;
    }
}
