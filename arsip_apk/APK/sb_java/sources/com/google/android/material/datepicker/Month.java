package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes5.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = null;
    final int daysInMonth;
    final int daysInWeek;
    private final Calendar firstOfMonth;
    private String longName;
    final int month;
    final long timeInMillis;
    final int year;

    static {
        CREATOR = new AnonymousClass1();
    }

    private Month(Calendar r4) {
        r4.set(5, 1);
        Calendar r42 = UtcDates.getDayCopy(r4);
        this.firstOfMonth = r42;
        this.month = r42.get(2);
        this.year = r42.get(1);
        this.daysInWeek = r42.getMaximum(7);
        this.daysInMonth = r42.getActualMaximum(5);
        this.timeInMillis = r42.getTimeInMillis();
    }

    public static Month create(long r1) {
        Calendar r02 = UtcDates.getUtcCalendar();
        r02.setTimeInMillis(r1);
        return new Month(r02);
    }

    public static Month current() {
        return new Month(UtcDates.getTodayCalendar());
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Month r1) {
        return compareTo2(r1);
    }

    public int daysFromStartOfWeekToFirstOfMonth(int r3) {
        int r02 = this.firstOfMonth.get(7);
        if (r3 > 0) goto L6;
        r3 = this.firstOfMonth.getFirstDayOfWeek();
    L6:
        int r03 = r02 - r3;
        if (r03 < 0) goto L9;
        return r03;
    L9:
        return r03 + this.daysInWeek;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Month) == true) goto L8;
        return false;
    L8:
        Month r52 = (Month) r5;
        if (this.month == r52.month) goto L11;
    L13:
        return false;
    L11:
        if (this.year != r52.year) goto L13;
        return true;
    }

    public long getDay(int r3) {
        Calendar r02 = UtcDates.getDayCopy(this.firstOfMonth);
        r02.set(5, r3);
        return r02.getTimeInMillis();
    }

    public int getDayOfMonth(long r2) {
        Calendar r02 = UtcDates.getDayCopy(this.firstOfMonth);
        r02.setTimeInMillis(r2);
        return r02.get(5);
    }

    public String getLongName() {
        if (this.longName != null) goto L6;
        this.longName = DateStrings.getYearMonth(this.firstOfMonth.getTimeInMillis());
    L6:
        return this.longName;
    }

    public long getStableId() {
        return this.firstOfMonth.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.month), Integer.valueOf(this.year)});
    }

    public Month monthsLater(int r3) {
        Calendar r02 = UtcDates.getDayCopy(this.firstOfMonth);
        r02.add(2, r3);
        return new Month(r02);
    }

    public int monthsUntil(Month r3) {
        if ((this.firstOfMonth instanceof GregorianCalendar) == false) goto L7;
        return ((r3.year - this.year) * 12) + (r3.month - this.month);
    L7:
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.year);
        r1.writeInt(this.month);
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(Month r2) {
        return this.firstOfMonth.compareTo(r2.firstOfMonth);
    }

    public static Month create(int r2, int r3) {
        Calendar r02 = UtcDates.getUtcCalendar();
        r02.set(1, r2);
        r02.set(2, r3);
        return new Month(r02);
    }
}
