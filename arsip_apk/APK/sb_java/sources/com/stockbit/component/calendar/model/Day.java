package com.stockbit.component.calendar.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0003J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006$"}, d2 = {"Lcom/stockbit/component/calendar/model/Day;", "Landroid/os/Parcelable;", "year", "", "month", "day", "<init>", "(III)V", "getYear", "()I", "setYear", "(I)V", "getMonth", "setMonth", "getDay", "setDay", "toUnixTime", "", "getDiff", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "calendar_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Day implements Parcelable {
    public static final Parcelable.Creator<Day> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public int f69610a;

    /* renamed from: b, reason: collision with root package name */
    public int f69611b;

    /* renamed from: c, reason: collision with root package name */
    public int f69612c;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final Day a(Parcel r4) {
            p.l(r4, "parcel");
            return new Day(r4.readInt(), r4.readInt(), r4.readInt());
        }

        public final Day[] b(int r1) {
            return new Day[r1];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel r1) {
            return a(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int r1) {
            return b(r1);
        }
    }

    static {
        CREATOR = new a();
    }

    public Day(int r1, int r2, int r3) {
        this.f69610a = r1;
        this.f69611b = r2;
        this.f69612c = r3;
    }

    public final int a() {
        return this.f69612c;
    }

    public final int b() {
        return this.f69611b;
    }

    public final int c() {
        return this.f69610a;
    }

    public final long d() {
        return new Date(this.f69610a, this.f69611b, this.f69612c).getTime();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Day) == true) goto L8;
        return false;
    L8:
        Day r52 = (Day) r5;
        if (this.f69610a == r52.f69610a) goto L12;
        return false;
    L12:
        if (this.f69611b == r52.f69611b) goto L15;
        return false;
    L15:
        if (this.f69612c == r52.f69612c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f69610a) * 31) + Integer.hashCode(this.f69611b)) * 31) + Integer.hashCode(this.f69612c);
    }

    public String toString() {
        return "Day(year=" + this.f69610a + ", month=" + this.f69611b + ", day=" + this.f69612c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.f69610a);
        r1.writeInt(this.f69611b);
        r1.writeInt(this.f69612c);
    }
}
