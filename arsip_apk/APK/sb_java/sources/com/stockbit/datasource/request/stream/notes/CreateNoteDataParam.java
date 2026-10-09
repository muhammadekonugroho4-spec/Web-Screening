package com.stockbit.datasource.request.stream.notes;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J=\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/stockbit/datasource/request/stream/notes/CreateNoteDataParam;", "", "companySymbol", "", "note", "imageUrls", "", "fileUrls", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getCompanySymbol", "()Ljava/lang/String;", "getNote", "getImageUrls", "()Ljava/util/List;", "getFileUrls", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CreateNoteDataParam {

    @SerializedName("company_symbol")
    private final String companySymbol;

    @SerializedName("file_urls")
    private final List<String> fileUrls;

    @SerializedName("image_urls")
    private final List<String> imageUrls;

    @SerializedName("note")
    private final String note;

    public CreateNoteDataParam(String r2, String r3, List<String> r4, List<String> r5) {
        p.l(r2, "companySymbol");
        p.l(r3, "note");
        p.l(r4, "imageUrls");
        p.l(r5, "fileUrls");
        this.companySymbol = r2;
        this.note = r3;
        this.imageUrls = r4;
        this.fileUrls = r5;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CreateNoteDataParam) == true) goto L8;
        return false;
    L8:
        CreateNoteDataParam r52 = (CreateNoteDataParam) r5;
        if (p.g(this.companySymbol, r52.companySymbol) == true) goto L12;
        return false;
    L12:
        if (p.g(this.note, r52.note) == true) goto L15;
        return false;
    L15:
        if (p.g(this.imageUrls, r52.imageUrls) == true) goto L18;
        return false;
    L18:
        if (p.g(this.fileUrls, r52.fileUrls) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.companySymbol.hashCode() * 31) + this.note.hashCode()) * 31) + this.imageUrls.hashCode()) * 31) + this.fileUrls.hashCode();
    }

    public String toString() {
        return "CreateNoteDataParam(companySymbol=" + this.companySymbol + ", note=" + this.note + ", imageUrls=" + this.imageUrls + ", fileUrls=" + this.fileUrls + ")";
    }
}
