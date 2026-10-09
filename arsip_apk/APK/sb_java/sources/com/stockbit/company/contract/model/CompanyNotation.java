package com.stockbit.company.contract.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, d2 = {"Lcom/stockbit/company/contract/model/CompanyNotation;", "Landroid/os/Parcelable;", "notationCode", "", "notationDesc", "iconUrl", "Lcom/stockbit/company/contract/model/CompanyNotation$IconUrl;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/company/contract/model/CompanyNotation$IconUrl;)V", "getNotationCode", "()Ljava/lang/String;", "setNotationCode", "(Ljava/lang/String;)V", "getNotationDesc", "setNotationDesc", "getIconUrl", "()Lcom/stockbit/company/contract/model/CompanyNotation$IconUrl;", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "IconUrl", "company-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CompanyNotation implements Parcelable {
    public static final Parcelable.Creator<CompanyNotation> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public String f62490a;

    /* renamed from: b, reason: collision with root package name */
    public String f62491b;

    /* renamed from: c, reason: collision with root package name */
    public final IconUrl f62492c;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/stockbit/company/contract/model/CompanyNotation$IconUrl;", "Landroid/os/Parcelable;", "lightMode", "", "darkMode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLightMode", "()Ljava/lang/String;", "getDarkMode", "component1", "component2", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "company-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class IconUrl implements Parcelable {
        public static final Parcelable.Creator<IconUrl> CREATOR = null;

        /* renamed from: a, reason: collision with root package name */
        public final String f62493a;

        /* renamed from: b, reason: collision with root package name */
        public final String f62494b;

        public static final class a implements Parcelable.Creator {
            public a() {
            }

            public final IconUrl a(Parcel r3) {
                p.l(r3, "parcel");
                return new IconUrl(r3.readString(), r3.readString());
            }

            public final IconUrl[] b(int r1) {
                return new IconUrl[r1];
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

        public IconUrl(String r1, String r2) {
            this.f62493a = r1;
            this.f62494b = r2;
        }

        public final String a() {
            return this.f62494b;
        }

        public final String b() {
            return this.f62493a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof IconUrl) == true) goto L8;
            return false;
        L8:
            IconUrl r52 = (IconUrl) r5;
            if (p.g(this.f62493a, r52.f62493a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f62494b, r52.f62494b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            String r02 = this.f62493a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.f62494b;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "IconUrl(lightMode=" + this.f62493a + ", darkMode=" + this.f62494b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r1, int r2) {
            p.l(r1, "dest");
            r1.writeString(this.f62493a);
            r1.writeString(this.f62494b);
        }
    }

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final CompanyNotation a(Parcel r5) {
            p.l(r5, "parcel");
            String r1 = r5.readString();
            String r2 = r5.readString();
            if (r5.readInt() != 0) goto L5;
            IconUrl r52 = null;
        L7:
            return new CompanyNotation(r1, r2, r52);
        L5:
            r52 = IconUrl.CREATOR.createFromParcel(r5);
            goto L7
        }

        public final CompanyNotation[] b(int r1) {
            return new CompanyNotation[r1];
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

    public CompanyNotation(String r1, String r2, IconUrl r3) {
        this.f62490a = r1;
        this.f62491b = r2;
        this.f62492c = r3;
    }

    public final IconUrl a() {
        return this.f62492c;
    }

    public final String b() {
        return this.f62490a;
    }

    public final String c() {
        return this.f62491b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CompanyNotation) == true) goto L8;
        return false;
    L8:
        CompanyNotation r52 = (CompanyNotation) r5;
        if (p.g(this.f62490a, r52.f62490a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f62491b, r52.f62491b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f62492c, r52.f62492c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f62490a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f62491b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        IconUrl r23 = this.f62492c;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "CompanyNotation(notationCode=" + this.f62490a + ", notationDesc=" + this.f62491b + ", iconUrl=" + this.f62492c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeString(this.f62490a);
        r3.writeString(this.f62491b);
        IconUrl r02 = this.f62492c;
        if (r02 != null) goto L6;
        r3.writeInt(0);
        return;
    L6:
        r3.writeInt(1);
        r02.writeToParcel(r3, r4);
    }
}
