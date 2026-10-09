package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = null;
    private final Month end;
    private final int firstDayOfWeek;
    private final int monthSpan;
    private Month openAt;
    private final Month start;
    private final DateValidator validator;
    private final int yearSpan;

    public static final class Builder {
        private static final String DEEP_COPY_VALIDATOR_KEY = "DEEP_COPY_VALIDATOR_KEY";
        static final long DEFAULT_END = 0;
        static final long DEFAULT_START = 0;
        private long end;
        private int firstDayOfWeek;
        private Long openAt;
        private long start;
        private DateValidator validator;

        static {
            DEFAULT_START = UtcDates.canonicalYearMonthDay(Month.create(1900, 0).timeInMillis);
            DEFAULT_END = UtcDates.canonicalYearMonthDay(Month.create(2100, 11).timeInMillis);
        }

        public Builder() {
            this.start = DEFAULT_START;
            this.end = DEFAULT_END;
            this.validator = DateValidatorPointForward.from(Long.MIN_VALUE);
        }

        public CalendarConstraints build() {
            Bundle r02 = new Bundle();
            r02.putParcelable(DEEP_COPY_VALIDATOR_KEY, this.validator);
            Month r4 = Month.create(this.start);
            Month r5 = Month.create(this.end);
            DateValidator r6 = (DateValidator) r02.getParcelable(DEEP_COPY_VALIDATOR_KEY);
            Long r03 = this.openAt;
            if (r03 != null) goto L6;
            Month r04 = null;
        L5:
            Month r7 = r04;
            return new CalendarConstraints(r4, r5, r6, r7, this.firstDayOfWeek, null);
        L6:
            r04 = Month.create(r03.longValue());
            goto L5
        }

        @CanIgnoreReturnValue
        public Builder setEnd(long r1) {
            this.end = r1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setFirstDayOfWeek(int r1) {
            this.firstDayOfWeek = r1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setOpenAt(long r1) {
            this.openAt = Long.valueOf(r1);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setStart(long r1) {
            this.start = r1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setValidator(DateValidator r2) {
            Objects.requireNonNull(r2, "validator cannot be null");
            this.validator = r2;
            return this;
        }

        public Builder(CalendarConstraints r3) {
            this.start = DEFAULT_START;
            this.end = DEFAULT_END;
            this.validator = DateValidatorPointForward.from(Long.MIN_VALUE);
            this.start = CalendarConstraints.access$100(r3).timeInMillis;
            this.end = CalendarConstraints.access$200(r3).timeInMillis;
            this.openAt = Long.valueOf(CalendarConstraints.access$300(r3).timeInMillis);
            this.firstDayOfWeek = CalendarConstraints.access$400(r3);
            this.validator = CalendarConstraints.access$500(r3);
        }
    }

    public interface DateValidator extends Parcelable {
        boolean isValid(long r1);
    }

    static {
        CREATOR = new AnonymousClass1();
    }

    public /* synthetic */ CalendarConstraints(Month r1, Month r2, DateValidator r3, Month r4, int r5, AnonymousClass1 r6) {
        this(r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ Month access$100(CalendarConstraints r02) {
        return r02.start;
    }

    public static /* synthetic */ Month access$200(CalendarConstraints r02) {
        return r02.end;
    }

    public static /* synthetic */ Month access$300(CalendarConstraints r02) {
        return r02.openAt;
    }

    public static /* synthetic */ int access$400(CalendarConstraints r02) {
        return r02.firstDayOfWeek;
    }

    public static /* synthetic */ DateValidator access$500(CalendarConstraints r02) {
        return r02.validator;
    }

    public Month clamp(Month r2) {
        if (r2.compareTo2(this.start) >= 0) goto L7;
        return this.start;
    L7:
        if (r2.compareTo2(this.end) > 0) goto L9;
        return r2;
    L9:
        return this.end;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CalendarConstraints) == true) goto L8;
        return false;
    L8:
        CalendarConstraints r52 = (CalendarConstraints) r5;
        if (this.start.equals(r52.start) == true) goto L11;
    L19:
        return false;
    L11:
        if (this.end.equals(r52.end) == false) goto L19;
        if (androidx.core.util.c.a(this.openAt, r52.openAt) == false) goto L19;
        if (this.firstDayOfWeek != r52.firstDayOfWeek) goto L19;
        if (this.validator.equals(r52.validator) == false) goto L19;
        return true;
    }

    public DateValidator getDateValidator() {
        return this.validator;
    }

    public Month getEnd() {
        return this.end;
    }

    public long getEndMs() {
        return this.end.timeInMillis;
    }

    public int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    public int getMonthSpan() {
        return this.monthSpan;
    }

    public Month getOpenAt() {
        return this.openAt;
    }

    public Long getOpenAtMs() {
        Month r02 = this.openAt;
        if (r02 != null) goto L7;
        return null;
    L7:
        return Long.valueOf(r02.timeInMillis);
    }

    public Month getStart() {
        return this.start;
    }

    public long getStartMs() {
        return this.start.timeInMillis;
    }

    public int getYearSpan() {
        return this.yearSpan;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.start, this.end, this.openAt, Integer.valueOf(this.firstDayOfWeek), this.validator});
    }

    public boolean isWithinBounds(long r5) {
        if (this.start.getDay(1) > r5) goto L7;
        Month r02 = this.end;
        if (r5 > r02.getDay(r02.daysInMonth)) goto L9;
        return true;
    L9:
        return false;
    L7:
        return false;
    }

    public void setOpenAt(Month r1) {
        this.openAt = r1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r2, int r3) {
        r2.writeParcelable(this.start, 0);
        r2.writeParcelable(this.end, 0);
        r2.writeParcelable(this.openAt, 0);
        r2.writeParcelable(this.validator, 0);
        r2.writeInt(this.firstDayOfWeek);
    }

    private CalendarConstraints(Month r2, Month r3, DateValidator r4, Month r5, int r6) {
        Objects.requireNonNull(r2, "start cannot be null");
        Objects.requireNonNull(r3, "end cannot be null");
        Objects.requireNonNull(r4, "validator cannot be null");
        this.start = r2;
        this.end = r3;
        this.openAt = r5;
        this.firstDayOfWeek = r6;
        this.validator = r4;
        if (r5 != null) goto L5;
    L9:
        if (r5 != null) goto L11;
    L15:
        if (r6 < 0) goto L21;
        if (r6 > UtcDates.getUtcCalendar().getMaximum(7)) goto L21;
        this.monthSpan = r2.monthsUntil(r3) + 1;
        this.yearSpan = (r3.year - r2.year) + 1;
        return;
    L21:
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    L11:
        if (r5.compareTo2(r3) <= 0) goto L15;
        throw new IllegalArgumentException("current Month cannot be after end Month");
    L5:
        if (r2.compareTo2(r5) <= 0) goto L9;
        throw new IllegalArgumentException("start Month cannot be after current Month");
    }
}
