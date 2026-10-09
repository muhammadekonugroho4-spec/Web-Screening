package com.stockbit.domain.model.valueobject.stream;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003JE\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0006\u0010&\u001a\u00020\u0005J\u0014\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0083\u0004J\n\u0010+\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010,\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010¨\u00062"}, d2 = {"Lcom/stockbit/domain/model/valueobject/stream/StreamImage;", "Landroid/os/Parcelable;", "imagePath", "", "height", "", "width", "ratio", "", "frame", "frameType", "<init>", "(Ljava/lang/String;IIFLjava/lang/String;Ljava/lang/String;)V", "getImagePath", "()Ljava/lang/String;", "setImagePath", "(Ljava/lang/String;)V", "getHeight", "()I", "setHeight", "(I)V", "getWidth", "setWidth", "getRatio", "()F", "setRatio", "(F)V", "getFrame", "setFrame", "getFrameType", "setFrameType", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StreamImage implements Parcelable {
    public static final Parcelable.Creator<StreamImage> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public String f87127a;

    /* renamed from: b, reason: collision with root package name */
    public int f87128b;

    /* renamed from: c, reason: collision with root package name */
    public int f87129c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public String f87130e;

    /* renamed from: f, reason: collision with root package name */
    public String f87131f;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final StreamImage a(Parcel r9) {
            p.l(r9, "parcel");
            return new StreamImage(r9.readString(), r9.readInt(), r9.readInt(), r9.readFloat(), r9.readString(), r9.readString());
        }

        public final StreamImage[] b(int r1) {
            return new StreamImage[r1];
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

    public StreamImage(String r2, int r3, int r4, float r5, String r6, String r7) {
        p.l(r2, "imagePath");
        p.l(r6, "frame");
        p.l(r7, "frameType");
        this.f87127a = r2;
        this.f87128b = r3;
        this.f87129c = r4;
        this.d = r5;
        this.f87130e = r6;
        this.f87131f = r7;
    }

    public final String a() {
        return this.f87130e;
    }

    public final String b() {
        return this.f87131f;
    }

    public final String c() {
        return this.f87127a;
    }

    public final float d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof StreamImage) == true) goto L8;
        return false;
    L8:
        StreamImage r52 = (StreamImage) r5;
        if (p.g(this.f87127a, r52.f87127a) == true) goto L12;
        return false;
    L12:
        if (this.f87128b == r52.f87128b) goto L15;
        return false;
    L15:
        if (this.f87129c == r52.f87129c) goto L18;
        return false;
    L18:
        if (Float.compare(this.d, r52.d) == 0) goto L21;
        return false;
    L21:
        if (p.g(this.f87130e, r52.f87130e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f87131f, r52.f87131f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final int getHeight() {
        return this.f87128b;
    }

    public final int getWidth() {
        return this.f87129c;
    }

    public int hashCode() {
        return (((((((((this.f87127a.hashCode() * 31) + Integer.hashCode(this.f87128b)) * 31) + Integer.hashCode(this.f87129c)) * 31) + Float.hashCode(this.d)) * 31) + this.f87130e.hashCode()) * 31) + this.f87131f.hashCode();
    }

    public String toString() {
        return "StreamImage(imagePath=" + this.f87127a + ", height=" + this.f87128b + ", width=" + this.f87129c + ", ratio=" + this.d + ", frame=" + this.f87130e + ", frameType=" + this.f87131f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f87127a);
        r1.writeInt(this.f87128b);
        r1.writeInt(this.f87129c);
        r1.writeFloat(this.d);
        r1.writeString(this.f87130e);
        r1.writeString(this.f87131f);
    }
}
