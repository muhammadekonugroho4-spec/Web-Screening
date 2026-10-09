package com.stockbit.model.entity.stream;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u0005J\u0014\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0007HÖ\u0081\u0004J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0005R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0002\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000e¨\u0006$"}, d2 = {"Lcom/stockbit/model/entity/stream/StreamPaginationResponseData;", "Landroid/os/Parcelable;", "isLastPage", "", "nextCursor", "", "nextCursorCompanyNotes", "", "total", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNextCursor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNextCursorCompanyNotes", "()Ljava/lang/String;", "getTotal", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/stockbit/model/entity/stream/StreamPaginationResponseData;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StreamPaginationResponseData implements Parcelable {
    public static final Parcelable.Creator<StreamPaginationResponseData> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f122106a;

    @SerializedName("is_last_page")
    private final Boolean isLastPage;

    @SerializedName("next_cursor")
    private final Integer nextCursor;

    @SerializedName("total")
    private final Integer total;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final StreamPaginationResponseData a(Parcel r7) {
            p.l(r7, "parcel");
            Integer r2 = null;
            if (r7.readInt() != 0) goto L6;
            Boolean r1 = null;
        L11:
            if (r7.readInt() != 0) goto L13;
            Integer r3 = null;
        L14:
            String r4 = r7.readString();
            if (r7.readInt() == 0) goto L19;
            r2 = Integer.valueOf(r7.readInt());
        L19:
            return new StreamPaginationResponseData(r1, r3, r4, r2);
        L13:
            r3 = Integer.valueOf(r7.readInt());
            goto L14
        L6:
            if (r7.readInt() == 0) goto L8;
            boolean r12 = true;
        L9:
            r1 = Boolean.valueOf(r12);
            goto L11
        L8:
            r12 = false;
            goto L9
        }

        public final StreamPaginationResponseData[] b(int r1) {
            return new StreamPaginationResponseData[r1];
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

    public StreamPaginationResponseData() {
        Boolean r1 = null;
        Integer r2 = null;
        String r3 = null;
        Integer r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public final Integer a() {
        return this.nextCursor;
    }

    public final String b() {
        return this.f122106a;
    }

    public final Boolean c() {
        return this.isLastPage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof StreamPaginationResponseData) == true) goto L8;
        return false;
    L8:
        StreamPaginationResponseData r52 = (StreamPaginationResponseData) r5;
        if (p.g(this.isLastPage, r52.isLastPage) == true) goto L12;
        return false;
    L12:
        if (p.g(this.nextCursor, r52.nextCursor) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f122106a, r52.f122106a) == true) goto L18;
        return false;
    L18:
        if (p.g(this.total, r52.total) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        Boolean r02 = this.isLastPage;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.nextCursor;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f122106a;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Integer r25 = this.total;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return r06 + r1;
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
        return "StreamPaginationResponseData(isLastPage=" + this.isLastPage + ", nextCursor=" + this.nextCursor + ", nextCursorCompanyNotes=" + this.f122106a + ", total=" + this.total + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        Boolean r42 = this.isLastPage;
        if (r42 != null) goto L5;
        r3.writeInt(0);
    L6:
        Integer r43 = this.nextCursor;
        if (r43 != null) goto L9;
        r3.writeInt(0);
    L10:
        r3.writeString(this.f122106a);
        Integer r44 = this.total;
        if (r44 != null) goto L14;
        r3.writeInt(0);
        return;
    L14:
        r3.writeInt(1);
        r3.writeInt(r44.intValue());
        return;
    L9:
        r3.writeInt(1);
        r3.writeInt(r43.intValue());
        goto L10
    L5:
        r3.writeInt(1);
        r3.writeInt(r42.booleanValue() ? 1 : 0);
        goto L6
    }

    public StreamPaginationResponseData(Boolean r1, Integer r2, String r3, Integer r4) {
        this.isLastPage = r1;
        this.nextCursor = r2;
        this.f122106a = r3;
        this.total = r4;
    }

    public /* synthetic */ StreamPaginationResponseData(Boolean r2, Integer r3, String r4, Integer r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = null;
    L14:
        this(r2, r3, r4, r5);
    }
}
