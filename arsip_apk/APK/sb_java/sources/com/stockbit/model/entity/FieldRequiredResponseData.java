package com.stockbit.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import com.stockbit.calendar.CalendarEntryPoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0014\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0083\u0004J\n\u0010%\u001a\u00020 HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR&\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006,"}, d2 = {"Lcom/stockbit/model/entity/FieldRequiredResponseData;", "Landroid/os/Parcelable;", CalendarEntryPoint.KEY_PAGE_DETAIL, "", "field", "comparison", "operator", "values", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getPage", "()Ljava/lang/String;", "setPage", "(Ljava/lang/String;)V", "getField", "setField", "getComparison", "setComparison", "getOperator", "setOperator", "getValues", "()Ljava/util/List;", "setValues", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FieldRequiredResponseData implements Parcelable {
    public static final Parcelable.Creator<FieldRequiredResponseData> CREATOR = null;

    @SerializedName("comparison")
    private String comparison;

    @SerializedName("field")
    private String field;

    @SerializedName("operator")
    private String operator;

    @SerializedName(CalendarEntryPoint.KEY_PAGE_DETAIL)
    private String page;

    @SerializedName("values")
    private List<String> values;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final FieldRequiredResponseData a(Parcel r8) {
            p.l(r8, "parcel");
            return new FieldRequiredResponseData(r8.readString(), r8.readString(), r8.readString(), r8.readString(), r8.createStringArrayList());
        }

        public final FieldRequiredResponseData[] b(int r1) {
            return new FieldRequiredResponseData[r1];
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

    public FieldRequiredResponseData() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        List r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public final String a() {
        return this.comparison;
    }

    public final String b() {
        return this.field;
    }

    public final String c() {
        return this.operator;
    }

    public final String d() {
        return this.page;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List e() {
        return this.values;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof FieldRequiredResponseData) == true) goto L8;
        return false;
    L8:
        FieldRequiredResponseData r52 = (FieldRequiredResponseData) r5;
        if (p.g(this.page, r52.page) == true) goto L12;
        return false;
    L12:
        if (p.g(this.field, r52.field) == true) goto L15;
        return false;
    L15:
        if (p.g(this.comparison, r52.comparison) == true) goto L18;
        return false;
    L18:
        if (p.g(this.operator, r52.operator) == true) goto L21;
        return false;
    L21:
        if (p.g(this.values, r52.values) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        String r02 = this.page;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.field;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.comparison;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.operator;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        List<String> r27 = this.values;
        if (r27 == null) goto L23;
        r1 = r27.hashCode();
    L23:
        return r07 + r1;
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "FieldRequiredResponseData(page=" + this.page + ", field=" + this.field + ", comparison=" + this.comparison + ", operator=" + this.operator + ", values=" + this.values + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.page);
        r1.writeString(this.field);
        r1.writeString(this.comparison);
        r1.writeString(this.operator);
        r1.writeStringList(this.values);
    }

    public FieldRequiredResponseData(String r1, String r2, String r3, String r4, List<String> r5) {
        this.page = r1;
        this.field = r2;
        this.comparison = r3;
        this.operator = r4;
        this.values = r5;
    }

    public /* synthetic */ FieldRequiredResponseData(String r2, String r3, String r4, String r5, List r6, int r7, i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r7 & 16) == 0) goto L18;
        List r72 = null;
    L17:
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72);
        return;
    L18:
        r72 = r6;
        goto L17
    }
}
