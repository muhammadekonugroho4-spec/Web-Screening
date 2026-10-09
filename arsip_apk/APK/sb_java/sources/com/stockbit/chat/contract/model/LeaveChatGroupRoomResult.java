package com.stockbit.chat.contract.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0003J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/stockbit/chat/contract/model/LeaveChatGroupRoomResult;", "Landroid/os/Parcelable;", "roomId", "", "groupName", "", "<init>", "(ILjava/lang/String;)V", "getRoomId", "()I", "getGroupName", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "chat-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LeaveChatGroupRoomResult implements Parcelable {
    public static final Parcelable.Creator<LeaveChatGroupRoomResult> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f53061a;

    /* renamed from: b, reason: collision with root package name */
    public final String f53062b;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final LeaveChatGroupRoomResult a(Parcel r3) {
            p.l(r3, "parcel");
            return new LeaveChatGroupRoomResult(r3.readInt(), r3.readString());
        }

        public final LeaveChatGroupRoomResult[] b(int r1) {
            return new LeaveChatGroupRoomResult[r1];
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

    public LeaveChatGroupRoomResult(int r2, String r3) {
        p.l(r3, "groupName");
        this.f53061a = r2;
        this.f53062b = r3;
    }

    public final String a() {
        return this.f53062b;
    }

    public final int b() {
        return this.f53061a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof LeaveChatGroupRoomResult) == true) goto L8;
        return false;
    L8:
        LeaveChatGroupRoomResult r52 = (LeaveChatGroupRoomResult) r5;
        if (this.f53061a == r52.f53061a) goto L12;
        return false;
    L12:
        if (p.g(this.f53062b, r52.f53062b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f53061a) * 31) + this.f53062b.hashCode();
    }

    public String toString() {
        return "LeaveChatGroupRoomResult(roomId=" + this.f53061a + ", groupName=" + this.f53062b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.f53061a);
        r1.writeString(this.f53062b);
    }
}
