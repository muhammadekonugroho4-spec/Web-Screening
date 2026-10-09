package com.stockbit.feature.history.contract;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, d2 = {"Lcom/stockbit/feature/history/contract/DetailHistoryUIParam;", "Landroid/os/Parcelable;", Constants.KEY_DATE, "", "historyId", "symbol", Constants.KEY_TITLE, "transactionType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "getHistoryId", "getSymbol", "getTitle", "getTransactionType", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "history-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DetailHistoryUIParam implements Parcelable {
    public static final Parcelable.Creator<DetailHistoryUIParam> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f96660a;

    /* renamed from: b, reason: collision with root package name */
    public final String f96661b;

    /* renamed from: c, reason: collision with root package name */
    public final String f96662c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f96663e;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final DetailHistoryUIParam a(Parcel r8) {
            p.l(r8, "parcel");
            return new DetailHistoryUIParam(r8.readString(), r8.readString(), r8.readString(), r8.readString(), r8.readString());
        }

        public final DetailHistoryUIParam[] b(int r1) {
            return new DetailHistoryUIParam[r1];
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

    public DetailHistoryUIParam(String r2, String r3, String r4, String r5, String r6) {
        p.l(r2, Constants.KEY_DATE);
        p.l(r3, "historyId");
        p.l(r4, "symbol");
        p.l(r5, Constants.KEY_TITLE);
        p.l(r6, "transactionType");
        this.f96660a = r2;
        this.f96661b = r3;
        this.f96662c = r4;
        this.d = r5;
        this.f96663e = r6;
    }

    public final String a() {
        return this.f96660a;
    }

    public final String b() {
        return this.f96661b;
    }

    public final String c() {
        return this.f96662c;
    }

    public final String d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f96663e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DetailHistoryUIParam) == true) goto L8;
        return false;
    L8:
        DetailHistoryUIParam r52 = (DetailHistoryUIParam) r5;
        if (p.g(this.f96660a, r52.f96660a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f96661b, r52.f96661b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f96662c, r52.f96662c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f96663e, r52.f96663e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f96660a.hashCode() * 31) + this.f96661b.hashCode()) * 31) + this.f96662c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f96663e.hashCode();
    }

    public String toString() {
        return "DetailHistoryUIParam(date=" + this.f96660a + ", historyId=" + this.f96661b + ", symbol=" + this.f96662c + ", title=" + this.d + ", transactionType=" + this.f96663e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f96660a);
        r1.writeString(this.f96661b);
        r1.writeString(this.f96662c);
        r1.writeString(this.d);
        r1.writeString(this.f96663e);
    }

    public /* synthetic */ DetailHistoryUIParam(String r2, String r3, String r4, String r5, String r6, int r7, i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r7 & 16) == 0) goto L18;
        String r72 = "";
    L17:
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72);
        return;
    L18:
        r72 = r6;
        goto L17
    }
}
