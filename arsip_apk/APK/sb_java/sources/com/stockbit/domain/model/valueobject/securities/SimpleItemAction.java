package com.stockbit.domain.model.valueobject.securities;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/stockbit/domain/model/valueobject/securities/SimpleItemAction;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "attributes", "Lcom/stockbit/domain/model/valueobject/securities/Attributes;", "<init>", "(Ljava/lang/String;Lcom/stockbit/domain/model/valueobject/securities/Attributes;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getAttributes", "()Lcom/stockbit/domain/model/valueobject/securities/Attributes;", "setAttributes", "(Lcom/stockbit/domain/model/valueobject/securities/Attributes;)V", "component1", "component2", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SimpleItemAction implements Parcelable {
    public static final Parcelable.Creator<SimpleItemAction> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public String f86984a;

    /* renamed from: b, reason: collision with root package name */
    public Attributes f86985b;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final SimpleItemAction a(Parcel r4) {
            p.l(r4, "parcel");
            String r1 = r4.readString();
            if (r4.readInt() != 0) goto L5;
            Attributes r42 = null;
        L7:
            return new SimpleItemAction(r1, r42);
        L5:
            r42 = Attributes.CREATOR.createFromParcel(r4);
            goto L7
        }

        public final SimpleItemAction[] b(int r1) {
            return new SimpleItemAction[r1];
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

    public SimpleItemAction(String r1, Attributes r2) {
        this.f86984a = r1;
        this.f86985b = r2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SimpleItemAction) == true) goto L8;
        return false;
    L8:
        SimpleItemAction r52 = (SimpleItemAction) r5;
        if (p.g(this.f86984a, r52.f86984a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86985b, r52.f86985b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f86984a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Attributes r2 = this.f86985b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "SimpleItemAction(name=" + this.f86984a + ", attributes=" + this.f86985b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeString(this.f86984a);
        Attributes r02 = this.f86985b;
        if (r02 != null) goto L6;
        r3.writeInt(0);
        return;
    L6:
        r3.writeInt(1);
        r02.writeToParcel(r3, r4);
    }
}
