package com.stockbit.model.entity.stream;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.scheduling.WorkQueueKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B%\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData;", "", "notes", "", "Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNoteResponseData;", "pagination", "Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNotePaginationResponseData;", "<init>", "(Ljava/util/List;Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNotePaginationResponseData;)V", "getNotes", "()Ljava/util/List;", "getPagination", "()Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNotePaginationResponseData;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "CompanyNoteResponseData", "CompanyNotePaginationResponseData", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CompanyNoteListResponseData {

    @SerializedName("notes")
    private final List<CompanyNoteResponseData> notes;

    @SerializedName("pagination")
    private final CompanyNotePaginationResponseData pagination;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNotePaginationResponseData;", "", "nextCursor", "", "<init>", "(Ljava/lang/String;)V", "getNextCursor", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CompanyNotePaginationResponseData {

        @SerializedName("next_cursor")
        private final String nextCursor;

        /* JADX WARN: Multi-variable type inference failed */
        public CompanyNotePaginationResponseData() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final String a() {
            return this.nextCursor;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof CompanyNotePaginationResponseData) == true) goto L9;
            return false;
        L9:
            if (p.g(this.nextCursor, ((CompanyNotePaginationResponseData) r4).nextCursor) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.nextCursor;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "CompanyNotePaginationResponseData(nextCursor=" + this.nextCursor + ')';
        }

        public CompanyNotePaginationResponseData(String r1) {
            this.nextCursor = r1;
        }

        public /* synthetic */ CompanyNotePaginationResponseData(String r1, int r2, i r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = null;
        L5:
            this(r1);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0004-./0B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jb\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010'J\u0014\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010+\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010,\u001a\u00020\tHÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00061"}, d2 = {"Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNoteResponseData;", "", "attachment", "Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNoteResponseData$CompanyNoteAttachmentResponseData;", "company", "Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNoteResponseData$CompanyNoteCompanyResponseData;", "content", "Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNoteResponseData$CompanyNoteContentResponseData;", "createdAt", "", Constants.KEY_ID, "", "updatedAt", "user", "Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNoteResponseData$CompanyNoteUserResponseData;", "<init>", "(Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNoteResponseData$CompanyNoteAttachmentResponseData;Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNoteResponseData$CompanyNoteCompanyResponseData;Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNoteResponseData$CompanyNoteContentResponseData;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNoteResponseData$CompanyNoteUserResponseData;)V", "getAttachment", "()Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNoteResponseData$CompanyNoteAttachmentResponseData;", "getCompany", "()Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNoteResponseData$CompanyNoteCompanyResponseData;", "getContent", "()Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNoteResponseData$CompanyNoteContentResponseData;", "getCreatedAt", "()Ljava/lang/String;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUpdatedAt", "getUser", "()Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNoteResponseData$CompanyNoteUserResponseData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "(Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNoteResponseData$CompanyNoteAttachmentResponseData;Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNoteResponseData$CompanyNoteCompanyResponseData;Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNoteResponseData$CompanyNoteContentResponseData;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNoteResponseData$CompanyNoteUserResponseData;)Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNoteResponseData;", "equals", "", "other", "hashCode", "toString", "CompanyNoteAttachmentResponseData", "CompanyNoteCompanyResponseData", "CompanyNoteContentResponseData", "CompanyNoteUserResponseData", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CompanyNoteResponseData {

        @SerializedName("attachment")
        private final CompanyNoteAttachmentResponseData attachment;

        @SerializedName("company")
        private final CompanyNoteCompanyResponseData company;

        @SerializedName("content")
        private final CompanyNoteContentResponseData content;

        @SerializedName("created_at")
        private final String createdAt;

        /* renamed from: id, reason: collision with root package name */
        @SerializedName(Constants.KEY_ID)
        private final Integer f122096id;

        @SerializedName("updated_at")
        private final String updatedAt;

        @SerializedName("user")
        private final CompanyNoteUserResponseData user;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0004HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNoteResponseData$CompanyNoteAttachmentResponseData;", "", "fileUrls", "", "", "imageUrls", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getFileUrls", "()Ljava/util/List;", "getImageUrls", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class CompanyNoteAttachmentResponseData {

            @SerializedName("file_urls")
            private final List<String> fileUrls;

            @SerializedName("image_urls")
            private final List<String> imageUrls;

            /* JADX WARN: Multi-variable type inference failed */
            public CompanyNoteAttachmentResponseData() {
                Object[] r02 = 0 == true ? 1 : 0;
                this(null, r02, 3, 0 == true ? 1 : 0);
            }

            public final List a() {
                return this.fileUrls;
            }

            public final List b() {
                return this.imageUrls;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof CompanyNoteAttachmentResponseData) == true) goto L8;
                return false;
            L8:
                CompanyNoteAttachmentResponseData r52 = (CompanyNoteAttachmentResponseData) r5;
                if (p.g(this.fileUrls, r52.fileUrls) == true) goto L12;
                return false;
            L12:
                if (p.g(this.imageUrls, r52.imageUrls) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                List<String> r02 = this.fileUrls;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                List<String> r2 = this.imageUrls;
                if (r2 == null) goto L11;
                r1 = r2.hashCode();
            L11:
                return r04 + r1;
            L5:
                r03 = r02.hashCode();
                goto L6
            }

            public String toString() {
                return "CompanyNoteAttachmentResponseData(fileUrls=" + this.fileUrls + ", imageUrls=" + this.imageUrls + ')';
            }

            public CompanyNoteAttachmentResponseData(List<String> r1, List<String> r2) {
                this.fileUrls = r1;
                this.imageUrls = r2;
            }

            public /* synthetic */ CompanyNoteAttachmentResponseData(List r2, List r3, int r4, i r5) {
                if ((r4 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r4 & 2) == 0) goto L8;
                r3 = null;
            L8:
                this(r2, r3);
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNoteResponseData$CompanyNoteCompanyResponseData;", "", "iconUrl", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "symbol", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIconUrl", "()Ljava/lang/String;", "getName", "getSymbol", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class CompanyNoteCompanyResponseData {

            @SerializedName("icon_url")
            private final String iconUrl;

            @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
            private final String name;

            @SerializedName("symbol")
            private final String symbol;

            public CompanyNoteCompanyResponseData() {
                String r1 = null;
                String r2 = null;
                String r3 = null;
                this(r1, r2, r3, 7, null);
            }

            public final String a() {
                return this.iconUrl;
            }

            public final String b() {
                return this.name;
            }

            public final String c() {
                return this.symbol;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof CompanyNoteCompanyResponseData) == true) goto L8;
                return false;
            L8:
                CompanyNoteCompanyResponseData r52 = (CompanyNoteCompanyResponseData) r5;
                if (p.g(this.iconUrl, r52.iconUrl) == true) goto L12;
                return false;
            L12:
                if (p.g(this.name, r52.name) == true) goto L15;
                return false;
            L15:
                if (p.g(this.symbol, r52.symbol) == true) goto L17;
                return false;
            L17:
                return true;
            }

            public int hashCode() {
                String r02 = this.iconUrl;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                String r2 = this.name;
                if (r2 != null) goto L9;
                int r22 = 0;
            L10:
                int r05 = (r04 + r22) * 31;
                String r23 = this.symbol;
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
                return "CompanyNoteCompanyResponseData(iconUrl=" + this.iconUrl + ", name=" + this.name + ", symbol=" + this.symbol + ')';
            }

            public CompanyNoteCompanyResponseData(String r1, String r2, String r3) {
                this.iconUrl = r1;
                this.name = r2;
                this.symbol = r3;
            }

            public /* synthetic */ CompanyNoteCompanyResponseData(String r2, String r3, String r4, int r5, i r6) {
                if ((r5 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r5 & 2) == 0) goto L9;
                r3 = null;
            L9:
                if ((r5 & 4) == 0) goto L11;
                r4 = null;
            L11:
                this(r2, r3, r4);
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR$\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNoteResponseData$CompanyNoteContentResponseData;", "", "maskedText", "", "masks", "", "Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNoteResponseData$CompanyNoteContentResponseData$CompanyNoteMaskResponseData;", Constants.KEY_TEXT, "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getMaskedText", "()Ljava/lang/String;", "getMasks", "()Ljava/util/Map;", "getText", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "CompanyNoteMaskResponseData", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class CompanyNoteContentResponseData {

            @SerializedName("masked_text")
            private final String maskedText;

            @SerializedName("masks")
            private final Map<String, CompanyNoteMaskResponseData> masks;

            @SerializedName(Constants.KEY_TEXT)
            private final String text;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNoteResponseData$CompanyNoteContentResponseData$CompanyNoteMaskResponseData;", "", "ref", "", Constants.KEY_TEXT, "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRef", "()Ljava/lang/String;", "getText", "getType", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class CompanyNoteMaskResponseData {

                @SerializedName("ref")
                private final String ref;

                @SerializedName(Constants.KEY_TEXT)
                private final String text;

                @SerializedName("type")
                private final String type;

                public CompanyNoteMaskResponseData() {
                    String r1 = null;
                    String r2 = null;
                    String r3 = null;
                    this(r1, r2, r3, 7, null);
                }

                public final String a() {
                    return this.ref;
                }

                public final String b() {
                    return this.text;
                }

                public final String c() {
                    return this.type;
                }

                public boolean equals(Object r5) {
                    if (this != r5) goto L6;
                    return true;
                L6:
                    if ((r5 instanceof CompanyNoteMaskResponseData) == true) goto L8;
                    return false;
                L8:
                    CompanyNoteMaskResponseData r52 = (CompanyNoteMaskResponseData) r5;
                    if (p.g(this.ref, r52.ref) == true) goto L12;
                    return false;
                L12:
                    if (p.g(this.text, r52.text) == true) goto L15;
                    return false;
                L15:
                    if (p.g(this.type, r52.type) == true) goto L17;
                    return false;
                L17:
                    return true;
                }

                public int hashCode() {
                    String r02 = this.ref;
                    int r1 = 0;
                    if (r02 != null) goto L5;
                    int r03 = 0;
                L6:
                    int r04 = r03 * 31;
                    String r2 = this.text;
                    if (r2 != null) goto L9;
                    int r22 = 0;
                L10:
                    int r05 = (r04 + r22) * 31;
                    String r23 = this.type;
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
                    return "CompanyNoteMaskResponseData(ref=" + this.ref + ", text=" + this.text + ", type=" + this.type + ')';
                }

                public CompanyNoteMaskResponseData(String r1, String r2, String r3) {
                    this.ref = r1;
                    this.text = r2;
                    this.type = r3;
                }

                public /* synthetic */ CompanyNoteMaskResponseData(String r2, String r3, String r4, int r5, i r6) {
                    if ((r5 & 1) == 0) goto L6;
                    r2 = null;
                L6:
                    if ((r5 & 2) == 0) goto L9;
                    r3 = null;
                L9:
                    if ((r5 & 4) == 0) goto L11;
                    r4 = null;
                L11:
                    this(r2, r3, r4);
                }
            }

            public CompanyNoteContentResponseData() {
                String r1 = null;
                Map r2 = null;
                String r3 = null;
                this(r1, r2, r3, 7, null);
            }

            public final String a() {
                return this.maskedText;
            }

            public final Map b() {
                return this.masks;
            }

            public final String c() {
                return this.text;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof CompanyNoteContentResponseData) == true) goto L8;
                return false;
            L8:
                CompanyNoteContentResponseData r52 = (CompanyNoteContentResponseData) r5;
                if (p.g(this.maskedText, r52.maskedText) == true) goto L12;
                return false;
            L12:
                if (p.g(this.masks, r52.masks) == true) goto L15;
                return false;
            L15:
                if (p.g(this.text, r52.text) == true) goto L17;
                return false;
            L17:
                return true;
            }

            public int hashCode() {
                String r02 = this.maskedText;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                Map<String, CompanyNoteMaskResponseData> r2 = this.masks;
                if (r2 != null) goto L9;
                int r22 = 0;
            L10:
                int r05 = (r04 + r22) * 31;
                String r23 = this.text;
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
                return "CompanyNoteContentResponseData(maskedText=" + this.maskedText + ", masks=" + this.masks + ", text=" + this.text + ')';
            }

            public CompanyNoteContentResponseData(String r1, Map<String, CompanyNoteMaskResponseData> r2, String r3) {
                this.maskedText = r1;
                this.masks = r2;
                this.text = r3;
            }

            public /* synthetic */ CompanyNoteContentResponseData(String r2, Map r3, String r4, int r5, i r6) {
                if ((r5 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r5 & 2) == 0) goto L9;
                r3 = null;
            L9:
                if ((r5 & 4) == 0) goto L11;
                r4 = null;
            L11:
                this(r2, r3, r4);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNoteResponseData$CompanyNoteUserResponseData;", "", Constants.KEY_ID, "", "username", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUsername", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/stockbit/model/entity/stream/CompanyNoteListResponseData$CompanyNoteResponseData$CompanyNoteUserResponseData;", "equals", "", "other", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class CompanyNoteUserResponseData {

            /* renamed from: id, reason: collision with root package name */
            @SerializedName(Constants.KEY_ID)
            private final Integer f122097id;

            @SerializedName("username")
            private final String username;

            /* JADX WARN: Multi-variable type inference failed */
            public CompanyNoteUserResponseData() {
                Object[] r02 = 0 == true ? 1 : 0;
                this(null, r02, 3, 0 == true ? 1 : 0);
            }

            public final Integer a() {
                return this.f122097id;
            }

            public final String b() {
                return this.username;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof CompanyNoteUserResponseData) == true) goto L8;
                return false;
            L8:
                CompanyNoteUserResponseData r52 = (CompanyNoteUserResponseData) r5;
                if (p.g(this.f122097id, r52.f122097id) == true) goto L12;
                return false;
            L12:
                if (p.g(this.username, r52.username) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                Integer r02 = this.f122097id;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                String r2 = this.username;
                if (r2 == null) goto L11;
                r1 = r2.hashCode();
            L11:
                return r04 + r1;
            L5:
                r03 = r02.hashCode();
                goto L6
            }

            public String toString() {
                return "CompanyNoteUserResponseData(id=" + this.f122097id + ", username=" + this.username + ')';
            }

            public CompanyNoteUserResponseData(Integer r1, String r2) {
                this.f122097id = r1;
                this.username = r2;
            }

            public /* synthetic */ CompanyNoteUserResponseData(Integer r2, String r3, int r4, i r5) {
                if ((r4 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r4 & 2) == 0) goto L8;
                r3 = null;
            L8:
                this(r2, r3);
            }
        }

        public CompanyNoteResponseData() {
            CompanyNoteAttachmentResponseData r1 = null;
            CompanyNoteCompanyResponseData r2 = null;
            CompanyNoteContentResponseData r3 = null;
            String r4 = null;
            Integer r5 = null;
            String r6 = null;
            CompanyNoteUserResponseData r7 = null;
            this(r1, r2, r3, r4, r5, r6, r7, WorkQueueKt.MASK, null);
        }

        public final CompanyNoteAttachmentResponseData a() {
            return this.attachment;
        }

        public final CompanyNoteCompanyResponseData b() {
            return this.company;
        }

        public final CompanyNoteContentResponseData c() {
            return this.content;
        }

        public final String d() {
            return this.createdAt;
        }

        public final Integer e() {
            return this.f122096id;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof CompanyNoteResponseData) == true) goto L8;
            return false;
        L8:
            CompanyNoteResponseData r52 = (CompanyNoteResponseData) r5;
            if (p.g(this.attachment, r52.attachment) == true) goto L12;
            return false;
        L12:
            if (p.g(this.company, r52.company) == true) goto L15;
            return false;
        L15:
            if (p.g(this.content, r52.content) == true) goto L18;
            return false;
        L18:
            if (p.g(this.createdAt, r52.createdAt) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f122096id, r52.f122096id) == true) goto L24;
            return false;
        L24:
            if (p.g(this.updatedAt, r52.updatedAt) == true) goto L27;
            return false;
        L27:
            if (p.g(this.user, r52.user) == true) goto L29;
            return false;
        L29:
            return true;
        }

        public final String f() {
            return this.updatedAt;
        }

        public final CompanyNoteUserResponseData g() {
            return this.user;
        }

        public int hashCode() {
            CompanyNoteAttachmentResponseData r02 = this.attachment;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            CompanyNoteCompanyResponseData r2 = this.company;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            CompanyNoteContentResponseData r23 = this.content;
            if (r23 != null) goto L13;
            int r24 = 0;
        L14:
            int r06 = (r05 + r24) * 31;
            String r25 = this.createdAt;
            if (r25 != null) goto L17;
            int r26 = 0;
        L18:
            int r07 = (r06 + r26) * 31;
            Integer r27 = this.f122096id;
            if (r27 != null) goto L21;
            int r28 = 0;
        L22:
            int r08 = (r07 + r28) * 31;
            String r29 = this.updatedAt;
            if (r29 != null) goto L25;
            int r210 = 0;
        L26:
            int r09 = (r08 + r210) * 31;
            CompanyNoteUserResponseData r211 = this.user;
            if (r211 == null) goto L31;
            r1 = r211.hashCode();
        L31:
            return r09 + r1;
        L25:
            r210 = r29.hashCode();
            goto L26
        L21:
            r28 = r27.hashCode();
            goto L22
        L17:
            r26 = r25.hashCode();
            goto L18
        L13:
            r24 = r23.hashCode();
            goto L14
        L9:
            r22 = r2.hashCode();
            goto L10
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "CompanyNoteResponseData(attachment=" + this.attachment + ", company=" + this.company + ", content=" + this.content + ", createdAt=" + this.createdAt + ", id=" + this.f122096id + ", updatedAt=" + this.updatedAt + ", user=" + this.user + ')';
        }

        public CompanyNoteResponseData(CompanyNoteAttachmentResponseData r1, CompanyNoteCompanyResponseData r2, CompanyNoteContentResponseData r3, String r4, Integer r5, String r6, CompanyNoteUserResponseData r7) {
            this.attachment = r1;
            this.company = r2;
            this.content = r3;
            this.createdAt = r4;
            this.f122096id = r5;
            this.updatedAt = r6;
            this.user = r7;
        }

        public /* synthetic */ CompanyNoteResponseData(CompanyNoteAttachmentResponseData r2, CompanyNoteCompanyResponseData r3, CompanyNoteContentResponseData r4, String r5, Integer r6, String r7, CompanyNoteUserResponseData r8, int r9, i r10) {
            if ((r9 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r9 & 2) == 0) goto L9;
            r3 = null;
        L9:
            if ((r9 & 4) == 0) goto L12;
            r4 = null;
        L12:
            if ((r9 & 8) == 0) goto L15;
            r5 = null;
        L15:
            if ((r9 & 16) == 0) goto L18;
            r6 = null;
        L18:
            if ((r9 & 32) == 0) goto L21;
            r7 = null;
        L21:
            if ((r9 & 64) == 0) goto L24;
            CompanyNoteUserResponseData r92 = null;
        L23:
            String r82 = r7;
            Integer r72 = r6;
            String r62 = r5;
            CompanyNoteContentResponseData r52 = r4;
            this(r2, r3, r52, r62, r72, r82, r92);
            return;
        L24:
            r92 = r8;
            goto L23
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CompanyNoteListResponseData() {
        Object[] r02 = 0 == true ? 1 : 0;
        this(null, r02, 3, 0 == true ? 1 : 0);
    }

    public final List a() {
        return this.notes;
    }

    public final CompanyNotePaginationResponseData b() {
        return this.pagination;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CompanyNoteListResponseData) == true) goto L8;
        return false;
    L8:
        CompanyNoteListResponseData r52 = (CompanyNoteListResponseData) r5;
        if (p.g(this.notes, r52.notes) == true) goto L12;
        return false;
    L12:
        if (p.g(this.pagination, r52.pagination) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        List<CompanyNoteResponseData> r02 = this.notes;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        CompanyNotePaginationResponseData r2 = this.pagination;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "CompanyNoteListResponseData(notes=" + this.notes + ", pagination=" + this.pagination + ')';
    }

    public CompanyNoteListResponseData(List<CompanyNoteResponseData> r1, CompanyNotePaginationResponseData r2) {
        this.notes = r1;
        this.pagination = r2;
    }

    public /* synthetic */ CompanyNoteListResponseData(List r2, CompanyNotePaginationResponseData r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        this(r2, r3);
    }
}
