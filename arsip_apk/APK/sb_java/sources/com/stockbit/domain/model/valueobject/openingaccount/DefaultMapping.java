package com.stockbit.domain.model.valueobject.openingaccount;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/stockbit/domain/model/valueobject/openingaccount/DefaultMapping;", "Landroid/os/Parcelable;", Constants.KEY_TITLE, "", "description", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getLabel", "component1", "component2", "component3", com.clevertap.android.sdk.Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DefaultMapping implements Parcelable {
    public static final Parcelable.Creator<DefaultMapping> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f86863a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86864b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86865c;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final DefaultMapping a(Parcel r4) {
            p.l(r4, "parcel");
            return new DefaultMapping(r4.readString(), r4.readString(), r4.readString());
        }

        public final DefaultMapping[] b(int r1) {
            return new DefaultMapping[r1];
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

    public DefaultMapping(String r2, String r3, String r4) {
        p.l(r2, com.clevertap.android.sdk.Constants.KEY_TITLE);
        p.l(r3, "description");
        p.l(r4, Constants.ScionAnalytics.PARAM_LABEL);
        this.f86863a = r2;
        this.f86864b = r3;
        this.f86865c = r4;
    }

    public final String a() {
        return this.f86864b;
    }

    public final String b() {
        return this.f86865c;
    }

    public final String c() {
        return this.f86863a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DefaultMapping) == true) goto L8;
        return false;
    L8:
        DefaultMapping r52 = (DefaultMapping) r5;
        if (p.g(this.f86863a, r52.f86863a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86864b, r52.f86864b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86865c, r52.f86865c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f86863a.hashCode() * 31) + this.f86864b.hashCode()) * 31) + this.f86865c.hashCode();
    }

    public String toString() {
        return "DefaultMapping(title=" + this.f86863a + ", description=" + this.f86864b + ", label=" + this.f86865c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f86863a);
        r1.writeString(this.f86864b);
        r1.writeString(this.f86865c);
    }

    public /* synthetic */ DefaultMapping(String r2, String r3, String r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}
