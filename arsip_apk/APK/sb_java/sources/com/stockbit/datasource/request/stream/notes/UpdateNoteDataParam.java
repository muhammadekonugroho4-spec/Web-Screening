package com.stockbit.datasource.request.stream.notes;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/stockbit/datasource/request/stream/notes/UpdateNoteDataParam;", "", "note", "", "imageUrls", "", "fileUrls", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getNote", "()Ljava/lang/String;", "getImageUrls", "()Ljava/util/List;", "getFileUrls", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UpdateNoteDataParam {

    @SerializedName("file_urls")
    private final List<String> fileUrls;

    @SerializedName("image_urls")
    private final List<String> imageUrls;

    @SerializedName("note")
    private final String note;

    public UpdateNoteDataParam(String r2, List<String> r3, List<String> r4) {
        p.l(r2, "note");
        p.l(r3, "imageUrls");
        p.l(r4, "fileUrls");
        this.note = r2;
        this.imageUrls = r3;
        this.fileUrls = r4;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UpdateNoteDataParam) == true) goto L8;
        return false;
    L8:
        UpdateNoteDataParam r52 = (UpdateNoteDataParam) r5;
        if (p.g(this.note, r52.note) == true) goto L12;
        return false;
    L12:
        if (p.g(this.imageUrls, r52.imageUrls) == true) goto L15;
        return false;
    L15:
        if (p.g(this.fileUrls, r52.fileUrls) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.note.hashCode() * 31) + this.imageUrls.hashCode()) * 31) + this.fileUrls.hashCode();
    }

    public String toString() {
        return "UpdateNoteDataParam(note=" + this.note + ", imageUrls=" + this.imageUrls + ", fileUrls=" + this.fileUrls + ")";
    }
}
