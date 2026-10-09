package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes5.dex */
class DaysOfWeekAdapter extends BaseAdapter {
    private static final int CALENDAR_DAY_STYLE = 0;
    private static final int NARROW_FORMAT = 4;
    private final Calendar calendar;
    private final int daysInWeek;
    private final int firstDayOfWeek;

    static {
        CALENDAR_DAY_STYLE = 4;
    }

    public DaysOfWeekAdapter() {
        Calendar r02 = UtcDates.getUtcCalendar();
        this.calendar = r02;
        this.daysInWeek = r02.getMaximum(7);
        this.firstDayOfWeek = r02.getFirstDayOfWeek();
    }

    private int positionToDayOfWeek(int r2) {
        int r22 = r2 + this.firstDayOfWeek;
        int r02 = this.daysInWeek;
        if (r22 > r02) goto L5;
        return r22;
    L5:
        return r22 - r02;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.daysInWeek;
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ Object getItem(int r1) {
        return getItem(r1);
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
        return 0;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int r4, View r5, ViewGroup r6) {
        TextView r02 = (TextView) r5;
        if (r5 != null) goto L5;
        r02 = (TextView) LayoutInflater.from(r6.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, r6, false);
    L5:
        this.calendar.set(7, positionToDayOfWeek(r4));
        Locale r42 = r02.getResources().getConfiguration().locale;
        r02.setText(this.calendar.getDisplayName(7, CALENDAR_DAY_STYLE, r42));
        r02.setContentDescription(String.format(r6.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), new Object[]{this.calendar.getDisplayName(7, 2, Locale.getDefault())}));
        return r02;
    }

    @Override // android.widget.Adapter
    public Integer getItem(int r2) {
        if (r2 < this.daysInWeek) goto L7;
        return null;
    L7:
        return Integer.valueOf(positionToDayOfWeek(r2));
    }

    public DaysOfWeekAdapter(int r3) {
        Calendar r02 = UtcDates.getUtcCalendar();
        this.calendar = r02;
        this.daysInWeek = r02.getMaximum(7);
        this.firstDayOfWeek = r3;
    }
}
