package com.stockbit.domain.model.entity.securities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.stockbit.domain.model.securities.order.DividendActionType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/stockbit/domain/model/entity/securities/CorpactionInfoEntity;", "Landroid/os/Parcelable;", "corpactId", "", "actionType", "Lcom/stockbit/domain/model/securities/order/DividendActionType;", NotificationCompat.CATEGORY_STATUS, "<init>", "(Ljava/lang/String;Lcom/stockbit/domain/model/securities/order/DividendActionType;Ljava/lang/String;)V", "getCorpactId", "()Ljava/lang/String;", "getActionType", "()Lcom/stockbit/domain/model/securities/order/DividendActionType;", "getStatus", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CorpactionInfoEntity implements Parcelable {
    public static final Parcelable.Creator<CorpactionInfoEntity> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f83043a;

    /* renamed from: b, reason: collision with root package name */
    public final DividendActionType f83044b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83045c;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final CorpactionInfoEntity a(Parcel r4) {
            kotlin.jvm.internal.p.l(r4, "parcel");
            return new CorpactionInfoEntity(r4.readString(), DividendActionType.valueOf(r4.readString()), r4.readString());
        }

        public final CorpactionInfoEntity[] b(int r1) {
            return new CorpactionInfoEntity[r1];
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

    public CorpactionInfoEntity(String r2, DividendActionType r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "corpactId");
        kotlin.jvm.internal.p.l(r3, "actionType");
        kotlin.jvm.internal.p.l(r4, NotificationCompat.CATEGORY_STATUS);
        this.f83043a = r2;
        this.f83044b = r3;
        this.f83045c = r4;
    }

    public final DividendActionType a() {
        return this.f83044b;
    }

    public final String b() {
        return this.f83043a;
    }

    public final String c() {
        return this.f83045c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CorpactionInfoEntity) == true) goto L8;
        return false;
    L8:
        CorpactionInfoEntity r52 = (CorpactionInfoEntity) r5;
        if (kotlin.jvm.internal.p.g(this.f83043a, r52.f83043a) == true) goto L12;
        return false;
    L12:
        if (this.f83044b == r52.f83044b) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f83045c, r52.f83045c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f83043a.hashCode() * 31) + this.f83044b.hashCode()) * 31) + this.f83045c.hashCode();
    }

    public String toString() {
        return "CorpactionInfoEntity(corpactId=" + this.f83043a + ", actionType=" + this.f83044b + ", status=" + this.f83045c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        kotlin.jvm.internal.p.l(r1, "dest");
        r1.writeString(this.f83043a);
        r1.writeString(this.f83044b.name());
        r1.writeString(this.f83045c);
    }
}
