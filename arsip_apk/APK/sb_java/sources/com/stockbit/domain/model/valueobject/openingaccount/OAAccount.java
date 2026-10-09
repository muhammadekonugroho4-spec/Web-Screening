package com.stockbit.domain.model.valueobject.openingaccount;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/stockbit/domain/model/valueobject/openingaccount/OAAccount;", "Landroid/os/Parcelable;", "oaAccountCitizenship", "Lcom/stockbit/domain/model/valueobject/openingaccount/OAAccountCitizenship;", "<init>", "(Lcom/stockbit/domain/model/valueobject/openingaccount/OAAccountCitizenship;)V", "getOaAccountCitizenship", "()Lcom/stockbit/domain/model/valueobject/openingaccount/OAAccountCitizenship;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OAAccount implements Parcelable {
    public static final Parcelable.Creator<OAAccount> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final OAAccountCitizenship f86885a;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final OAAccount a(Parcel r3) {
            p.l(r3, "parcel");
            if (r3.readInt() != 0) goto L5;
            OAAccountCitizenship r32 = null;
        L7:
            return new OAAccount(r32);
        L5:
            r32 = OAAccountCitizenship.CREATOR.createFromParcel(r3);
            goto L7
        }

        public final OAAccount[] b(int r1) {
            return new OAAccount[r1];
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

    public OAAccount(OAAccountCitizenship r1) {
        this.f86885a = r1;
    }

    public final OAAccountCitizenship a() {
        return this.f86885a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        OAAccountCitizenship r02 = this.f86885a;
        if (r02 != null) goto L6;
        r3.writeInt(0);
        return;
    L6:
        r3.writeInt(1);
        r02.writeToParcel(r3, r4);
    }
}
