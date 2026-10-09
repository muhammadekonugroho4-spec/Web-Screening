package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.List;

/* loaded from: classes5.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    private static final Operator ALL_OPERATOR = null;
    private static final Operator ANY_OPERATOR = null;
    private static final int COMPARATOR_ALL_ID = 2;
    private static final int COMPARATOR_ANY_ID = 1;
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = null;
    private final Operator operator;
    private final List<CalendarConstraints.DateValidator> validators;

    public interface Operator {
        int getId();

        boolean isValid(List<CalendarConstraints.DateValidator> r1, long r2);
    }

    static {
        ANY_OPERATOR = new AnonymousClass1();
        ALL_OPERATOR = new AnonymousClass2();
        CREATOR = new AnonymousClass3();
    }

    public /* synthetic */ CompositeDateValidator(List r1, Operator r2, AnonymousClass1 r3) {
        this(r1, r2);
    }

    public static /* synthetic */ Operator access$000() {
        return ALL_OPERATOR;
    }

    public static /* synthetic */ Operator access$100() {
        return ANY_OPERATOR;
    }

    public static CalendarConstraints.DateValidator allOf(List<CalendarConstraints.DateValidator> r2) {
        return new CompositeDateValidator(r2, ALL_OPERATOR);
    }

    public static CalendarConstraints.DateValidator anyOf(List<CalendarConstraints.DateValidator> r2) {
        return new CompositeDateValidator(r2, ANY_OPERATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CompositeDateValidator) == true) goto L8;
        return false;
    L8:
        CompositeDateValidator r52 = (CompositeDateValidator) r5;
        if (this.validators.equals(r52.validators) == true) goto L11;
    L13:
        return false;
    L11:
        if (this.operator.getId() != r52.operator.getId()) goto L13;
        return true;
    }

    public int hashCode() {
        return this.validators.hashCode();
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean isValid(long r3) {
        return this.operator.isValid(this.validators, r3);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeList(this.validators);
        r1.writeInt(this.operator.getId());
    }

    private CompositeDateValidator(List<CalendarConstraints.DateValidator> r1, Operator r2) {
        this.validators = r1;
        this.operator = r2;
    }
}
