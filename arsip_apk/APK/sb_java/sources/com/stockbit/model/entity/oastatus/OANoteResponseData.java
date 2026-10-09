package com.stockbit.model.entity.oastatus;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, d2 = {"Lcom/stockbit/model/entity/oastatus/OANoteResponseData;", "Landroid/os/Parcelable;", NotificationCompat.CATEGORY_PROGRESS, "", "bank_name", "bank_account_name", "bank_account_number", "errors", "", "Lcom/stockbit/model/entity/oastatus/OANoteErrorResponseData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getProgress", "()Ljava/lang/String;", "getBank_name", "getBank_account_name", "getBank_account_number", "getErrors", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OANoteResponseData implements Parcelable {
    public static final Parcelable.Creator<OANoteResponseData> CREATOR = null;

    @SerializedName("bank_account_name")
    private final String bank_account_name;

    @SerializedName("bank_account_number")
    private final String bank_account_number;

    @SerializedName("bank_name")
    private final String bank_name;

    @SerializedName("errors")
    private final List<OANoteErrorResponseData> errors;

    @SerializedName(NotificationCompat.CATEGORY_PROGRESS)
    private final String progress;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final OANoteResponseData a(Parcel r9) {
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
            r6.add(OANoteErrorResponseData.CREATOR.createFromParcel(r9));
            r1 = r1 + 1;
            goto L3
        L6:
            return new OANoteResponseData(r2, r3, r4, r5, r6);
        }

        public final OANoteResponseData[] b(int r1) {
            return new OANoteResponseData[r1];
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

    public OANoteResponseData(String r2, String r3, String r4, String r5, List<OANoteErrorResponseData> r6) {
        p.l(r2, NotificationCompat.CATEGORY_PROGRESS);
        p.l(r3, "bank_name");
        p.l(r4, "bank_account_name");
        p.l(r5, "bank_account_number");
        p.l(r6, "errors");
        this.progress = r2;
        this.bank_name = r3;
        this.bank_account_name = r4;
        this.bank_account_number = r5;
        this.errors = r6;
    }

    public final String a() {
        return this.bank_account_name;
    }

    public final String b() {
        return this.bank_account_number;
    }

    public final String c() {
        return this.bank_name;
    }

    public final List d() {
        return this.errors;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.progress;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OANoteResponseData) == true) goto L8;
        return false;
    L8:
        OANoteResponseData r52 = (OANoteResponseData) r5;
        if (p.g(this.progress, r52.progress) == true) goto L12;
        return false;
    L12:
        if (p.g(this.bank_name, r52.bank_name) == true) goto L15;
        return false;
    L15:
        if (p.g(this.bank_account_name, r52.bank_account_name) == true) goto L18;
        return false;
    L18:
        if (p.g(this.bank_account_number, r52.bank_account_number) == true) goto L21;
        return false;
    L21:
        if (p.g(this.errors, r52.errors) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.progress.hashCode() * 31) + this.bank_name.hashCode()) * 31) + this.bank_account_name.hashCode()) * 31) + this.bank_account_number.hashCode()) * 31) + this.errors.hashCode();
    }

    public String toString() {
        return "OANoteResponseData(progress=" + this.progress + ", bank_name=" + this.bank_name + ", bank_account_name=" + this.bank_account_name + ", bank_account_number=" + this.bank_account_number + ", errors=" + this.errors + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeString(this.progress);
        r3.writeString(this.bank_name);
        r3.writeString(this.bank_account_name);
        r3.writeString(this.bank_account_number);
        List<OANoteErrorResponseData> r02 = this.errors;
        r3.writeInt(r02.size());
        Iterator<OANoteErrorResponseData> r03 = r02.iterator();
    L4:
        if (r03.hasNext() == false) goto L6;
        r03.next().writeToParcel(r3, r4);
        goto L4
    }
}
