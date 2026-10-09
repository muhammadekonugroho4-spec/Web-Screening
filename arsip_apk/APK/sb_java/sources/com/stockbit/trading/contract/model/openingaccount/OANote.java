package com.stockbit.trading.contract.model.openingaccount;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\fHÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/stockbit/trading/contract/model/openingaccount/OANote;", "Landroid/os/Parcelable;", "errors", "", "Lcom/stockbit/trading/contract/model/openingaccount/OANoteError;", "<init>", "(Ljava/util/List;)V", "getErrors", "()Ljava/util/List;", "component1", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "trading-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OANote implements Parcelable {
    public static final Parcelable.Creator<OANote> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final List f146253a;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final OANote a(Parcel r5) {
            p.l(r5, "parcel");
            int r02 = r5.readInt();
            ArrayList r1 = new ArrayList(r02);
            int r2 = 0;
        L3:
            if (r2 == r02) goto L6;
            r1.add(OANoteError.CREATOR.createFromParcel(r5));
            r2 = r2 + 1;
            goto L3
        L6:
            return new OANote(r1);
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

    public OANote(List r2) {
        p.l(r2, "errors");
        this.f146253a = r2;
    }

    public final List a() {
        return this.f146253a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof OANote) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f146253a, ((OANote) r4).f146253a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f146253a.hashCode();
    }

    public String toString() {
        return "OANote(errors=" + this.f146253a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        List r02 = this.f146253a;
        r3.writeInt(r02.size());
        Iterator r03 = r02.iterator();
    L4:
        if (r03.hasNext() == false) goto L6;
        ((OANoteError) r03.next()).writeToParcel(r3, r4);
        goto L4
    }
}
