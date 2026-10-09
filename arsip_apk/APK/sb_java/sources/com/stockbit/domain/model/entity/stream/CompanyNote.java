package com.stockbit.domain.model.entity.stream;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u00044567B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jb\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010'J\u0006\u0010(\u001a\u00020\u000bJ\u0014\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0083\u0004J\n\u0010-\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010.\u001a\u00020\tHÖ\u0081\u0004J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00068"}, d2 = {"Lcom/stockbit/domain/model/entity/stream/CompanyNote;", "Landroid/os/Parcelable;", "attachment", "Lcom/stockbit/domain/model/entity/stream/CompanyNote$CompanyNoteAttachment;", "company", "Lcom/stockbit/domain/model/entity/stream/CompanyNote$CompanyNoteCompany;", "content", "Lcom/stockbit/domain/model/entity/stream/CompanyNote$CompanyNoteContent;", "createdAt", "", Constants.KEY_ID, "", "updatedAt", "user", "Lcom/stockbit/domain/model/entity/stream/CompanyNote$CompanyNoteUser;", "<init>", "(Lcom/stockbit/domain/model/entity/stream/CompanyNote$CompanyNoteAttachment;Lcom/stockbit/domain/model/entity/stream/CompanyNote$CompanyNoteCompany;Lcom/stockbit/domain/model/entity/stream/CompanyNote$CompanyNoteContent;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/stockbit/domain/model/entity/stream/CompanyNote$CompanyNoteUser;)V", "getAttachment", "()Lcom/stockbit/domain/model/entity/stream/CompanyNote$CompanyNoteAttachment;", "getCompany", "()Lcom/stockbit/domain/model/entity/stream/CompanyNote$CompanyNoteCompany;", "getContent", "()Lcom/stockbit/domain/model/entity/stream/CompanyNote$CompanyNoteContent;", "getCreatedAt", "()Ljava/lang/String;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUpdatedAt", "getUser", "()Lcom/stockbit/domain/model/entity/stream/CompanyNote$CompanyNoteUser;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "(Lcom/stockbit/domain/model/entity/stream/CompanyNote$CompanyNoteAttachment;Lcom/stockbit/domain/model/entity/stream/CompanyNote$CompanyNoteCompany;Lcom/stockbit/domain/model/entity/stream/CompanyNote$CompanyNoteContent;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/stockbit/domain/model/entity/stream/CompanyNote$CompanyNoteUser;)Lcom/stockbit/domain/model/entity/stream/CompanyNote;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "CompanyNoteAttachment", "CompanyNoteCompany", "CompanyNoteContent", "CompanyNoteUser", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CompanyNote implements Parcelable {
    public static final Parcelable.Creator<CompanyNote> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final CompanyNoteAttachment f83591a;

    /* renamed from: b, reason: collision with root package name */
    public final CompanyNoteCompany f83592b;

    /* renamed from: c, reason: collision with root package name */
    public final CompanyNoteContent f83593c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f83594e;

    /* renamed from: f, reason: collision with root package name */
    public final String f83595f;

    /* renamed from: g, reason: collision with root package name */
    public final CompanyNoteUser f83596g;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0004HÖ\u0081\u0004J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/stockbit/domain/model/entity/stream/CompanyNote$CompanyNoteAttachment;", "Landroid/os/Parcelable;", "fileUrls", "", "", "imageUrls", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getFileUrls", "()Ljava/util/List;", "getImageUrls", "component1", "component2", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CompanyNoteAttachment implements Parcelable {
        public static final Parcelable.Creator<CompanyNoteAttachment> CREATOR = null;

        /* renamed from: a, reason: collision with root package name */
        public final List f83597a;

        /* renamed from: b, reason: collision with root package name */
        public final List f83598b;

        public static final class a implements Parcelable.Creator {
            public a() {
            }

            public final CompanyNoteAttachment a(Parcel r3) {
                p.l(r3, "parcel");
                return new CompanyNoteAttachment(r3.createStringArrayList(), r3.createStringArrayList());
            }

            public final CompanyNoteAttachment[] b(int r1) {
                return new CompanyNoteAttachment[r1];
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

        public CompanyNoteAttachment(List r1, List r2) {
            this.f83597a = r1;
            this.f83598b = r2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof CompanyNoteAttachment) == true) goto L8;
            return false;
        L8:
            CompanyNoteAttachment r52 = (CompanyNoteAttachment) r5;
            if (p.g(this.f83597a, r52.f83597a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f83598b, r52.f83598b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            List r02 = this.f83597a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            List r2 = this.f83598b;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "CompanyNoteAttachment(fileUrls=" + this.f83597a + ", imageUrls=" + this.f83598b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r1, int r2) {
            p.l(r1, "dest");
            r1.writeStringList(this.f83597a);
            r1.writeStringList(this.f83598b);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/stockbit/domain/model/entity/stream/CompanyNote$CompanyNoteCompany;", "Landroid/os/Parcelable;", "iconUrl", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "symbol", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIconUrl", "()Ljava/lang/String;", "getName", "getSymbol", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CompanyNoteCompany implements Parcelable {
        public static final Parcelable.Creator<CompanyNoteCompany> CREATOR = null;

        /* renamed from: a, reason: collision with root package name */
        public final String f83599a;

        /* renamed from: b, reason: collision with root package name */
        public final String f83600b;

        /* renamed from: c, reason: collision with root package name */
        public final String f83601c;

        public static final class a implements Parcelable.Creator {
            public a() {
            }

            public final CompanyNoteCompany a(Parcel r4) {
                p.l(r4, "parcel");
                return new CompanyNoteCompany(r4.readString(), r4.readString(), r4.readString());
            }

            public final CompanyNoteCompany[] b(int r1) {
                return new CompanyNoteCompany[r1];
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

        public CompanyNoteCompany(String r1, String r2, String r3) {
            this.f83599a = r1;
            this.f83600b = r2;
            this.f83601c = r3;
        }

        public final String a() {
            return this.f83599a;
        }

        public final String b() {
            return this.f83600b;
        }

        public final String c() {
            return this.f83601c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof CompanyNoteCompany) == true) goto L8;
            return false;
        L8:
            CompanyNoteCompany r52 = (CompanyNoteCompany) r5;
            if (p.g(this.f83599a, r52.f83599a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f83600b, r52.f83600b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f83601c, r52.f83601c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            String r02 = this.f83599a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.f83600b;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            String r23 = this.f83601c;
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
            return "CompanyNoteCompany(iconUrl=" + this.f83599a + ", name=" + this.f83600b + ", symbol=" + this.f83601c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r1, int r2) {
            p.l(r1, "dest");
            r1.writeString(this.f83599a);
            r1.writeString(this.f83600b);
            r1.writeString(this.f83601c);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006!"}, d2 = {"Lcom/stockbit/domain/model/entity/stream/CompanyNote$CompanyNoteContent;", "Landroid/os/Parcelable;", "maskedText", "", "masks", "", "Lcom/stockbit/domain/model/entity/stream/CompanyNote$CompanyNoteContent$CompanyNoteMask;", Constants.KEY_TEXT, "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getMaskedText", "()Ljava/lang/String;", "getMasks", "()Ljava/util/Map;", "getText", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "CompanyNoteMask", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CompanyNoteContent implements Parcelable {
        public static final Parcelable.Creator<CompanyNoteContent> CREATOR = null;

        /* renamed from: a, reason: collision with root package name */
        public final String f83602a;

        /* renamed from: b, reason: collision with root package name */
        public final Map f83603b;

        /* renamed from: c, reason: collision with root package name */
        public final String f83604c;

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/stockbit/domain/model/entity/stream/CompanyNote$CompanyNoteContent$CompanyNoteMask;", "Landroid/os/Parcelable;", "ref", "", Constants.KEY_TEXT, "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRef", "()Ljava/lang/String;", "getText", "getType", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class CompanyNoteMask implements Parcelable {
            public static final Parcelable.Creator<CompanyNoteMask> CREATOR = null;

            /* renamed from: a, reason: collision with root package name */
            public final String f83605a;

            /* renamed from: b, reason: collision with root package name */
            public final String f83606b;

            /* renamed from: c, reason: collision with root package name */
            public final String f83607c;

            public static final class a implements Parcelable.Creator {
                public a() {
                }

                public final CompanyNoteMask a(Parcel r4) {
                    p.l(r4, "parcel");
                    return new CompanyNoteMask(r4.readString(), r4.readString(), r4.readString());
                }

                public final CompanyNoteMask[] b(int r1) {
                    return new CompanyNoteMask[r1];
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

            public CompanyNoteMask(String r1, String r2, String r3) {
                this.f83605a = r1;
                this.f83606b = r2;
                this.f83607c = r3;
            }

            public final String a() {
                return this.f83605a;
            }

            public final String b() {
                return this.f83606b;
            }

            public final String c() {
                return this.f83607c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof CompanyNoteMask) == true) goto L8;
                return false;
            L8:
                CompanyNoteMask r52 = (CompanyNoteMask) r5;
                if (p.g(this.f83605a, r52.f83605a) == true) goto L12;
                return false;
            L12:
                if (p.g(this.f83606b, r52.f83606b) == true) goto L15;
                return false;
            L15:
                if (p.g(this.f83607c, r52.f83607c) == true) goto L17;
                return false;
            L17:
                return true;
            }

            public int hashCode() {
                String r02 = this.f83605a;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                String r2 = this.f83606b;
                if (r2 != null) goto L9;
                int r22 = 0;
            L10:
                int r05 = (r04 + r22) * 31;
                String r23 = this.f83607c;
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
                return "CompanyNoteMask(ref=" + this.f83605a + ", text=" + this.f83606b + ", type=" + this.f83607c + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel r1, int r2) {
                p.l(r1, "dest");
                r1.writeString(this.f83605a);
                r1.writeString(this.f83606b);
                r1.writeString(this.f83607c);
            }
        }

        public static final class a implements Parcelable.Creator {
            public a() {
            }

            public final CompanyNoteContent a(Parcel r7) {
                p.l(r7, "parcel");
                String r02 = r7.readString();
                if (r7.readInt() != 0) goto L5;
                LinkedHashMap r1 = null;
            L10:
                return new CompanyNoteContent(r02, r1, r7.readString());
            L5:
                int r12 = r7.readInt();
                LinkedHashMap r2 = new LinkedHashMap(r12);
                int r3 = 0;
            L6:
                if (r3 == r12) goto L8;
                r2.put(r7.readString(), CompanyNoteMask.CREATOR.createFromParcel(r7));
                r3 = r3 + 1;
                goto L6
            L8:
                r1 = r2;
                goto L10
            }

            public final CompanyNoteContent[] b(int r1) {
                return new CompanyNoteContent[r1];
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

        public CompanyNoteContent(String r1, Map r2, String r3) {
            this.f83602a = r1;
            this.f83603b = r2;
            this.f83604c = r3;
        }

        public final String a() {
            return this.f83602a;
        }

        public final Map b() {
            return this.f83603b;
        }

        public final String c() {
            return this.f83604c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof CompanyNoteContent) == true) goto L8;
            return false;
        L8:
            CompanyNoteContent r52 = (CompanyNoteContent) r5;
            if (p.g(this.f83602a, r52.f83602a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f83603b, r52.f83603b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f83604c, r52.f83604c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            String r02 = this.f83602a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            Map r2 = this.f83603b;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            String r23 = this.f83604c;
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
            return "CompanyNoteContent(maskedText=" + this.f83602a + ", masks=" + this.f83603b + ", text=" + this.f83604c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r4, int r5) {
            p.l(r4, "dest");
            r4.writeString(this.f83602a);
            Map r02 = this.f83603b;
            if (r02 != null) goto L5;
            r4.writeInt(0);
        L9:
            r4.writeString(this.f83604c);
            return;
        L5:
            r4.writeInt(1);
            r4.writeInt(r02.size());
            Iterator r03 = r02.entrySet().iterator();
        L7:
            if (r03.hasNext() == false) goto L9;
            Map.Entry r1 = (Map.Entry) r03.next();
            r4.writeString((String) r1.getKey());
            ((CompanyNoteMask) r1.getValue()).writeToParcel(r4, r5);
            goto L7
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0003J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/stockbit/domain/model/entity/stream/CompanyNote$CompanyNoteUser;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", "username", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUsername", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/stockbit/domain/model/entity/stream/CompanyNote$CompanyNoteUser;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CompanyNoteUser implements Parcelable {
        public static final Parcelable.Creator<CompanyNoteUser> CREATOR = null;

        /* renamed from: a, reason: collision with root package name */
        public final Integer f83608a;

        /* renamed from: b, reason: collision with root package name */
        public final String f83609b;

        public static final class a implements Parcelable.Creator {
            public a() {
            }

            public final CompanyNoteUser a(Parcel r3) {
                p.l(r3, "parcel");
                if (r3.readInt() != 0) goto L5;
                Integer r1 = null;
            L7:
                return new CompanyNoteUser(r1, r3.readString());
            L5:
                r1 = Integer.valueOf(r3.readInt());
                goto L7
            }

            public final CompanyNoteUser[] b(int r1) {
                return new CompanyNoteUser[r1];
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

        public CompanyNoteUser(Integer r1, String r2) {
            this.f83608a = r1;
            this.f83609b = r2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof CompanyNoteUser) == true) goto L8;
            return false;
        L8:
            CompanyNoteUser r52 = (CompanyNoteUser) r5;
            if (p.g(this.f83608a, r52.f83608a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f83609b, r52.f83609b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            Integer r02 = this.f83608a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.f83609b;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "CompanyNoteUser(id=" + this.f83608a + ", username=" + this.f83609b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r2, int r3) {
            p.l(r2, "dest");
            Integer r32 = this.f83608a;
            if (r32 != null) goto L6;
            int r33 = 0;
        L5:
            r2.writeInt(r33);
            r2.writeString(this.f83609b);
            return;
        L6:
            r2.writeInt(1);
            r33 = r32.intValue();
            goto L5
        }
    }

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final CompanyNote a(Parcel r10) {
            p.l(r10, "parcel");
            CompanyNoteUser r2 = null;
            if (r10.readInt() != 0) goto L5;
            CompanyNoteAttachment r02 = null;
        L6:
            CompanyNoteAttachment r03 = r02;
            if (r10.readInt() != 0) goto L9;
            CompanyNoteCompany r3 = null;
        L10:
            CompanyNoteCompany r32 = r3;
            if (r10.readInt() != 0) goto L13;
            CompanyNoteContent r4 = null;
        L14:
            CompanyNoteContent r42 = r4;
            String r5 = r10.readString();
            if (r10.readInt() != 0) goto L17;
            Integer r6 = null;
        L18:
            String r7 = r10.readString();
            if (r10.readInt() == 0) goto L23;
            r2 = CompanyNoteUser.CREATOR.createFromParcel(r10);
        L23:
            return new CompanyNote(r03, r32, r42, r5, r6, r7, r2);
        L17:
            r6 = Integer.valueOf(r10.readInt());
            goto L18
        L13:
            r4 = CompanyNoteContent.CREATOR.createFromParcel(r10);
            goto L14
        L9:
            r3 = CompanyNoteCompany.CREATOR.createFromParcel(r10);
            goto L10
        L5:
            r02 = CompanyNoteAttachment.CREATOR.createFromParcel(r10);
            goto L6
        }

        public final CompanyNote[] b(int r1) {
            return new CompanyNote[r1];
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

    public CompanyNote(CompanyNoteAttachment r1, CompanyNoteCompany r2, CompanyNoteContent r3, String r4, Integer r5, String r6, CompanyNoteUser r7) {
        this.f83591a = r1;
        this.f83592b = r2;
        this.f83593c = r3;
        this.d = r4;
        this.f83594e = r5;
        this.f83595f = r6;
        this.f83596g = r7;
    }

    public final CompanyNoteCompany a() {
        return this.f83592b;
    }

    public final CompanyNoteContent b() {
        return this.f83593c;
    }

    public final Integer c() {
        return this.f83594e;
    }

    public final String d() {
        return this.f83595f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CompanyNote) == true) goto L8;
        return false;
    L8:
        CompanyNote r52 = (CompanyNote) r5;
        if (p.g(this.f83591a, r52.f83591a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f83592b, r52.f83592b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f83593c, r52.f83593c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f83594e, r52.f83594e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f83595f, r52.f83595f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f83596g, r52.f83596g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        CompanyNoteAttachment r02 = this.f83591a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        CompanyNoteCompany r2 = this.f83592b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        CompanyNoteContent r23 = this.f83593c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Integer r27 = this.f83594e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f83595f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        CompanyNoteUser r211 = this.f83596g;
        if (r211 == null) goto L31;
        r1 = r211.hashCode();
    L31:
        return r09 + r1;
    L25:
        r210 = r29.hashCode();
        goto L26
    L21:
        r28 = r27.hashCode();
        goto L22
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
        return "CompanyNote(attachment=" + this.f83591a + ", company=" + this.f83592b + ", content=" + this.f83593c + ", createdAt=" + this.d + ", id=" + this.f83594e + ", updatedAt=" + this.f83595f + ", user=" + this.f83596g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        p.l(r4, "dest");
        CompanyNoteAttachment r02 = this.f83591a;
        if (r02 != null) goto L5;
        r4.writeInt(0);
    L6:
        CompanyNoteCompany r03 = this.f83592b;
        if (r03 != null) goto L9;
        r4.writeInt(0);
    L10:
        CompanyNoteContent r04 = this.f83593c;
        if (r04 != null) goto L13;
        r4.writeInt(0);
    L14:
        r4.writeString(this.d);
        Integer r05 = this.f83594e;
        if (r05 != null) goto L17;
        r4.writeInt(0);
    L18:
        r4.writeString(this.f83595f);
        CompanyNoteUser r06 = this.f83596g;
        if (r06 != null) goto L22;
        r4.writeInt(0);
        return;
    L22:
        r4.writeInt(1);
        r06.writeToParcel(r4, r5);
        return;
    L17:
        r4.writeInt(1);
        r4.writeInt(r05.intValue());
        goto L18
    L13:
        r4.writeInt(1);
        r04.writeToParcel(r4, r5);
        goto L14
    L9:
        r4.writeInt(1);
        r03.writeToParcel(r4, r5);
        goto L10
    L5:
        r4.writeInt(1);
        r02.writeToParcel(r4, r5);
        goto L6
    }
}
