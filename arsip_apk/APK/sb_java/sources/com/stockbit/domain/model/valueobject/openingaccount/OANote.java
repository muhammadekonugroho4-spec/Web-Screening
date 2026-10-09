package com.stockbit.domain.model.valueobject.openingaccount;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, d2 = {"Lcom/stockbit/domain/model/valueobject/openingaccount/OANote;", "Landroid/os/Parcelable;", NotificationCompat.CATEGORY_PROGRESS, "", "bankName", "bankAccountName", "bankAccountNumber", "errors", "", "Lcom/stockbit/domain/model/valueobject/openingaccount/OANoteError;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getProgress", "()Ljava/lang/String;", "getBankName", "getBankAccountName", "getBankAccountNumber", "getErrors", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OANote implements Parcelable {
    public static final Parcelable.Creator<OANote> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f86887a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86888b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86889c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final List f86890e;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final OANote a(Parcel r9) {
            p.l(r9, "parcel");
            String r2 = r9.readString();
            String r3 = r9.readString();
            String r4 = r9.readString();
            String r5 = r9.readString();
            int r02 = r9.readInt();
            ArrayList r6 = new ArrayList(r02);
            int r1 = 0;
        L3:
            if (r1 == r02) goto L6;
            r6.add(OANoteError.CREATOR.createFromParcel(r9));
            r1 = r1 + 1;
            goto L3
        L6:
            return new OANote(r2, r3, r4, r5, r6);
        }

        public final OANote[] b(int r1) {
            return new OANote[r1];
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

    public OANote(String r2, String r3, String r4, String r5, List r6) {
        p.l(r2, NotificationCompat.CATEGORY_PROGRESS);
        p.l(r3, "bankName");
        p.l(r4, "bankAccountName");
        p.l(r5, "bankAccountNumber");
        p.l(r6, "errors");
        this.f86887a = r2;
        this.f86888b = r3;
        this.f86889c = r4;
        this.d = r5;
        this.f86890e = r6;
    }

    public final String a() {
        return this.f86889c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f86888b;
    }

    public final List d() {
        return this.f86890e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f86887a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OANote) == true) goto L8;
        return false;
    L8:
        OANote r52 = (OANote) r5;
        if (p.g(this.f86887a, r52.f86887a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86888b, r52.f86888b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86889c, r52.f86889c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f86890e, r52.f86890e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f86887a.hashCode() * 31) + this.f86888b.hashCode()) * 31) + this.f86889c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f86890e.hashCode();
    }

    public String toString() {
        return "OANote(progress=" + this.f86887a + ", bankName=" + this.f86888b + ", bankAccountName=" + this.f86889c + ", bankAccountNumber=" + this.d + ", errors=" + this.f86890e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeString(this.f86887a);
        r3.writeString(this.f86888b);
        r3.writeString(this.f86889c);
        r3.writeString(this.d);
        List r02 = this.f86890e;
        r3.writeInt(r02.size());
        Iterator r03 = r02.iterator();
    L4:
        if (r03.hasNext() == false) goto L6;
        ((OANoteError) r03.next()).writeToParcel(r3, r4);
        goto L4
    }
}
