package com.stockbit.socialsubscription.contract.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0003J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/stockbit/socialsubscription/contract/util/SocialSubscriptionResult;", "Landroid/os/Parcelable;", "result", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/stockbit/socialsubscription/contract/util/SocialSubscriptionData;", "<init>", "(ILcom/stockbit/socialsubscription/contract/util/SocialSubscriptionData;)V", "getResult", "()I", "getData", "()Lcom/stockbit/socialsubscription/contract/util/SocialSubscriptionData;", "component1", "component2", com.clevertap.android.sdk.Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "socialsubscription-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SocialSubscriptionResult implements Parcelable {
    public static final Parcelable.Creator<SocialSubscriptionResult> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f137538a;

    /* renamed from: b, reason: collision with root package name */
    public final SocialSubscriptionData f137539b;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final SocialSubscriptionResult a(Parcel r4) {
            p.l(r4, "parcel");
            int r1 = r4.readInt();
            if (r4.readInt() != 0) goto L5;
            SocialSubscriptionData r42 = null;
        L7:
            return new SocialSubscriptionResult(r1, r42);
        L5:
            r42 = SocialSubscriptionData.CREATOR.createFromParcel(r4);
            goto L7
        }

        public final SocialSubscriptionResult[] b(int r1) {
            return new SocialSubscriptionResult[r1];
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

    public SocialSubscriptionResult(int r1, SocialSubscriptionData r2) {
        this.f137538a = r1;
        this.f137539b = r2;
    }

    public final SocialSubscriptionData a() {
        return this.f137539b;
    }

    public final int b() {
        return this.f137538a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SocialSubscriptionResult) == true) goto L8;
        return false;
    L8:
        SocialSubscriptionResult r52 = (SocialSubscriptionResult) r5;
        if (this.f137538a == r52.f137538a) goto L12;
        return false;
    L12:
        if (p.g(this.f137539b, r52.f137539b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.f137538a) * 31;
        SocialSubscriptionData r1 = this.f137539b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "SocialSubscriptionResult(result=" + this.f137538a + ", data=" + this.f137539b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeInt(this.f137538a);
        SocialSubscriptionData r02 = this.f137539b;
        if (r02 != null) goto L6;
        r3.writeInt(0);
        return;
    L6:
        r3.writeInt(1);
        r02.writeToParcel(r3, r4);
    }
}
