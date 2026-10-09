package com.stockbit.domain.model.valueobject;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stockbit/domain/model/valueobject/MapFieldValue;", "Landroid/os/Parcelable;", "map", "Lcom/stockbit/domain/model/valueobject/FieldValueArray;", "<init>", "(Lcom/stockbit/domain/model/valueobject/FieldValueArray;)V", "getMap", "()Lcom/stockbit/domain/model/valueobject/FieldValueArray;", "component1", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MapFieldValue implements Parcelable {
    public static final Parcelable.Creator<MapFieldValue> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final FieldValueArray f86727a;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final MapFieldValue a(Parcel r3) {
            kotlin.jvm.internal.p.l(r3, "parcel");
            if (r3.readInt() != 0) goto L5;
            FieldValueArray r32 = null;
        L7:
            return new MapFieldValue(r32);
        L5:
            r32 = FieldValueArray.CREATOR.createFromParcel(r3);
            goto L7
        }

        public final MapFieldValue[] b(int r1) {
            return new MapFieldValue[r1];
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

    public MapFieldValue(FieldValueArray r1) {
        this.f86727a = r1;
    }

    public final FieldValueArray a() {
        return this.f86727a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof MapFieldValue) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f86727a, ((MapFieldValue) r4).f86727a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        FieldValueArray r02 = this.f86727a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "MapFieldValue(map=" + this.f86727a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        kotlin.jvm.internal.p.l(r3, "dest");
        FieldValueArray r02 = this.f86727a;
        if (r02 != null) goto L6;
        r3.writeInt(0);
        return;
    L6:
        r3.writeInt(1);
        r02.writeToParcel(r3, r4);
    }

    public /* synthetic */ MapFieldValue(FieldValueArray r1, int r2, kotlin.jvm.internal.i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1);
    }
}
