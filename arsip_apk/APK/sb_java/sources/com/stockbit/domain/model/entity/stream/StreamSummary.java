package com.stockbit.domain.model.entity.stream;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JK\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0083\u0004J\n\u0010!\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\"\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006("}, d2 = {"Lcom/stockbit/domain/model/entity/stream/StreamSummary;", "Landroid/os/Parcelable;", Constants.KEY_TITLE, "", "summary", "keyPoints", "", "keyTakeaway", "model", "modelVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSummary", "getKeyPoints", "()Ljava/util/List;", "getKeyTakeaway", "getModel", "getModelVersion", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StreamSummary implements Parcelable {
    public static final Parcelable.Creator<StreamSummary> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f83685a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83686b;

    /* renamed from: c, reason: collision with root package name */
    public final List f83687c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f83688e;

    /* renamed from: f, reason: collision with root package name */
    public final String f83689f;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final StreamSummary a(Parcel r9) {
            p.l(r9, "parcel");
            return new StreamSummary(r9.readString(), r9.readString(), r9.createStringArrayList(), r9.readString(), r9.readString(), r9.readString());
        }

        public final StreamSummary[] b(int r1) {
            return new StreamSummary[r1];
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

    public StreamSummary(String r2, String r3, List r4, String r5, String r6, String r7) {
        p.l(r2, Constants.KEY_TITLE);
        p.l(r3, "summary");
        p.l(r4, "keyPoints");
        p.l(r5, "keyTakeaway");
        p.l(r6, "model");
        p.l(r7, "modelVersion");
        this.f83685a = r2;
        this.f83686b = r3;
        this.f83687c = r4;
        this.d = r5;
        this.f83688e = r6;
        this.f83689f = r7;
    }

    public final List a() {
        return this.f83687c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f83686b;
    }

    public final String d() {
        return this.f83685a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof StreamSummary) == true) goto L8;
        return false;
    L8:
        StreamSummary r52 = (StreamSummary) r5;
        if (p.g(this.f83685a, r52.f83685a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f83686b, r52.f83686b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f83687c, r52.f83687c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f83688e, r52.f83688e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f83689f, r52.f83689f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        return (((((((((this.f83685a.hashCode() * 31) + this.f83686b.hashCode()) * 31) + this.f83687c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f83688e.hashCode()) * 31) + this.f83689f.hashCode();
    }

    public String toString() {
        return "StreamSummary(title=" + this.f83685a + ", summary=" + this.f83686b + ", keyPoints=" + this.f83687c + ", keyTakeaway=" + this.d + ", model=" + this.f83688e + ", modelVersion=" + this.f83689f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f83685a);
        r1.writeString(this.f83686b);
        r1.writeStringList(this.f83687c);
        r1.writeString(this.d);
        r1.writeString(this.f83688e);
        r1.writeString(this.f83689f);
    }
}
