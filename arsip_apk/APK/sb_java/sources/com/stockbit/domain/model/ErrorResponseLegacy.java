package com.stockbit.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u0003J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011¨\u0006%"}, d2 = {"Lcom/stockbit/domain/model/ErrorResponseLegacy;", "Landroid/os/Parcelable;", "code", "", "message", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/Integer;", "setCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getError", "setError", "component1", "component2", "component3", com.clevertap.android.sdk.Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/stockbit/domain/model/ErrorResponseLegacy;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.e
/* loaded from: classes8.dex */
public final class ErrorResponseLegacy implements Parcelable {
    public static final Parcelable.Creator<ErrorResponseLegacy> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public Integer f80491a;

    @SerializedName(Constants.IPC_BUNDLE_KEY_SEND_ERROR)
    private String error;

    @SerializedName("message")
    private String message;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final ErrorResponseLegacy a(Parcel r4) {
            p.l(r4, "parcel");
            if (r4.readInt() != 0) goto L5;
            Integer r1 = null;
        L7:
            return new ErrorResponseLegacy(r1, r4.readString(), r4.readString());
        L5:
            r1 = Integer.valueOf(r4.readInt());
            goto L7
        }

        public final ErrorResponseLegacy[] b(int r1) {
            return new ErrorResponseLegacy[r1];
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

    public ErrorResponseLegacy() {
        Integer r1 = null;
        String r2 = null;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public final Integer a() {
        return this.f80491a;
    }

    public final String b() {
        return this.message;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ErrorResponseLegacy) == true) goto L8;
        return false;
    L8:
        ErrorResponseLegacy r52 = (ErrorResponseLegacy) r5;
        if (p.g(this.f80491a, r52.f80491a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.message, r52.message) == true) goto L15;
        return false;
    L15:
        if (p.g(this.error, r52.error) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final String getError() {
        return this.error;
    }

    public int hashCode() {
        Integer r02 = this.f80491a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.message;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.error;
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
        return "ErrorResponseLegacy(code=" + this.f80491a + ", message=" + this.message + ", error=" + this.error + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        p.l(r2, "dest");
        Integer r32 = this.f80491a;
        if (r32 != null) goto L6;
        int r33 = 0;
    L5:
        r2.writeInt(r33);
        r2.writeString(this.message);
        r2.writeString(this.error);
        return;
    L6:
        r2.writeInt(1);
        r33 = r32.intValue();
        goto L5
    }

    public ErrorResponseLegacy(Integer r1, String r2, String r3) {
        this.f80491a = r1;
        this.message = r2;
        this.error = r3;
    }

    public /* synthetic */ ErrorResponseLegacy(Integer r2, String r3, String r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = null;
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
