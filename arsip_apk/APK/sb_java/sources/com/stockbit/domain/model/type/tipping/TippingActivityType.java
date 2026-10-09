package com.stockbit.domain.model.type.tipping;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u0011"}, d2 = {"Lcom/stockbit/domain/model/type/tipping/TippingActivityType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TIP_TYPE_SEND", "TIP_TYPE_RECEIVE", "TIP_TYPE_CLAIM", "TIP_TYPE_UNKNOWN", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum TippingActivityType extends Enum<TippingActivityType> implements Parcelable {
    public static final Parcelable.Creator<TippingActivityType> CREATOR = null;
    public static final a Companion = null;
    public static final TippingActivityType TIP_TYPE_CLAIM = null;
    public static final TippingActivityType TIP_TYPE_RECEIVE = null;
    public static final TippingActivityType TIP_TYPE_SEND = null;
    public static final TippingActivityType TIP_TYPE_UNKNOWN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TippingActivityType[] f86498a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86499b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final TippingActivityType a(String r6) {
            TippingActivityType[] r02 = TippingActivityType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            TippingActivityType r3 = r02[r2];
            if (p.g(r3.name(), r6) == true) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return TippingActivityType.TIP_TYPE_UNKNOWN;
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        TIP_TYPE_SEND = new TippingActivityType("TIP_TYPE_SEND", 0);
        TIP_TYPE_RECEIVE = new TippingActivityType("TIP_TYPE_RECEIVE", 1);
        TIP_TYPE_CLAIM = new TippingActivityType("TIP_TYPE_CLAIM", 2);
        TIP_TYPE_UNKNOWN = new TippingActivityType("TIP_TYPE_UNKNOWN", 3);
        TippingActivityType[] r02 = a();
        f86498a = r02;
        f86499b = kotlin.enums.b.a(r02);
        Companion = new a(null);
        CREATOR = new b();
    }

    TippingActivityType(String r1, int r2) {
    }

    public static final /* synthetic */ TippingActivityType[] a() {
        return new TippingActivityType[]{TIP_TYPE_SEND, TIP_TYPE_RECEIVE, TIP_TYPE_CLAIM, TIP_TYPE_UNKNOWN};
    }

    public static kotlin.enums.a getEntries() {
        return f86499b;
    }

    public static TippingActivityType valueOf(String r1) {
        return (TippingActivityType) Enum.valueOf(TippingActivityType.class, r1);
    }

    public static TippingActivityType[] values() {
        return (TippingActivityType[]) f86498a.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(name());
    }
}
