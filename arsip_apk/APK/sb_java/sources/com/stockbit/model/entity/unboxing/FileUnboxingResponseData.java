package com.stockbit.model.entity.unboxing;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0003J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/stockbit/model/entity/unboxing/FileUnboxingResponseData;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", "attachmentUrl", "", "<init>", "(ILjava/lang/String;)V", "getId", "()I", "getAttachmentUrl", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FileUnboxingResponseData implements Parcelable {
    public static final Parcelable.Creator<FileUnboxingResponseData> CREATOR = null;

    @SerializedName("attachment_url")
    private final String attachmentUrl;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private final int f122117id;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final FileUnboxingResponseData a(Parcel r3) {
            p.l(r3, "parcel");
            return new FileUnboxingResponseData(r3.readInt(), r3.readString());
        }

        public final FileUnboxingResponseData[] b(int r1) {
            return new FileUnboxingResponseData[r1];
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

    /* JADX WARN: Multi-variable type inference failed */
    public FileUnboxingResponseData() {
        int r2 = 0;
        this(r2, null, 3, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.attachmentUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof FileUnboxingResponseData) == true) goto L8;
        return false;
    L8:
        FileUnboxingResponseData r52 = (FileUnboxingResponseData) r5;
        if (this.f122117id == r52.f122117id) goto L12;
        return false;
    L12:
        if (p.g(this.attachmentUrl, r52.attachmentUrl) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f122117id) * 31) + this.attachmentUrl.hashCode();
    }

    public String toString() {
        return "FileUnboxingResponseData(id=" + this.f122117id + ", attachmentUrl=" + this.attachmentUrl + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.f122117id);
        r1.writeString(this.attachmentUrl);
    }

    public FileUnboxingResponseData(int r2, String r3) {
        p.l(r3, "attachmentUrl");
        this.f122117id = r2;
        this.attachmentUrl = r3;
    }

    public /* synthetic */ FileUnboxingResponseData(int r1, String r2, int r3, i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = "";
    L8:
        this(r1, r2);
    }
}
