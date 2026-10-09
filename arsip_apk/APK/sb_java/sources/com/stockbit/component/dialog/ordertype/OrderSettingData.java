package com.stockbit.component.dialog.ordertype;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/stockbit/component/dialog/ordertype/OrderSettingData;", "Landroid/os/Parcelable;", "type", "Lcom/stockbit/component/dialog/ordertype/OrderSettingType;", "isActive", "", "isBuy", "<init>", "(Lcom/stockbit/component/dialog/ordertype/OrderSettingType;ZZ)V", "getType", "()Lcom/stockbit/component/dialog/ordertype/OrderSettingType;", "()Z", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "dialog_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OrderSettingData implements Parcelable {
    public static final Parcelable.Creator<OrderSettingData> CREATOR = null;
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final OrderSettingType f70314a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f70315b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f70316c;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final OrderSettingData a(Parcel r6) {
            p.l(r6, "parcel");
            OrderSettingType r1 = OrderSettingType.valueOf(r6.readString());
            boolean r3 = false;
            if (r6.readInt() == 0) goto L5;
            boolean r2 = true;
        L7:
            if (r6.readInt() == 0) goto L10;
            r3 = true;
        L10:
            return new OrderSettingData(r1, r2, r3);
        L5:
            r2 = false;
            goto L7
        }

        public final OrderSettingData[] b(int r1) {
            return new OrderSettingData[r1];
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
        d = 8;
    }

    public OrderSettingData(OrderSettingType r2, boolean r3, boolean r4) {
        p.l(r2, "type");
        this.f70314a = r2;
        this.f70315b = r3;
        this.f70316c = r4;
    }

    public final OrderSettingType a() {
        return this.f70314a;
    }

    public final boolean b() {
        return this.f70315b;
    }

    public final boolean c() {
        return this.f70316c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OrderSettingData) == true) goto L8;
        return false;
    L8:
        OrderSettingData r52 = (OrderSettingData) r5;
        if (this.f70314a == r52.f70314a) goto L12;
        return false;
    L12:
        if (this.f70315b == r52.f70315b) goto L15;
        return false;
    L15:
        if (this.f70316c == r52.f70316c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f70314a.hashCode() * 31) + Boolean.hashCode(this.f70315b)) * 31) + Boolean.hashCode(this.f70316c);
    }

    public String toString() {
        return "OrderSettingData(type=" + this.f70314a + ", isActive=" + this.f70315b + ", isBuy=" + this.f70316c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f70314a.name());
        r1.writeInt(this.f70315b ? 1 : 0);
        r1.writeInt(this.f70316c ? 1 : 0);
    }
}
