package com.stockbit.lib.pocket.android.flipt.data;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/stockbit/lib/pocket/android/flipt/data/FliptBatchEvaluateDTO;", "", "requestId", "", "responses", "", "Lcom/stockbit/lib/pocket/android/flipt/data/FliptBatchEvaluateDTO$FliptResponseDTO;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getRequestId", "()Ljava/lang/String;", "getResponses", "()Ljava/util/List;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "FliptResponseDTO", "pocket_android_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FliptBatchEvaluateDTO {

    @SerializedName("requestId")
    private final String requestId;

    @SerializedName("responses")
    private final List<FliptResponseDTO> responses;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u001f !B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lcom/stockbit/lib/pocket/android/flipt/data/FliptBatchEvaluateDTO$FliptResponseDTO;", "", "type", "", "booleanResponse", "Lcom/stockbit/lib/pocket/android/flipt/data/FliptBatchEvaluateDTO$FliptResponseDTO$BooleanResponse;", "variantResponse", "Lcom/stockbit/lib/pocket/android/flipt/data/FliptBatchEvaluateDTO$FliptResponseDTO$VariantResponse;", "errorResponse", "Lcom/stockbit/lib/pocket/android/flipt/data/FliptBatchEvaluateDTO$FliptResponseDTO$ErrorResponse;", "<init>", "(Ljava/lang/String;Lcom/stockbit/lib/pocket/android/flipt/data/FliptBatchEvaluateDTO$FliptResponseDTO$BooleanResponse;Lcom/stockbit/lib/pocket/android/flipt/data/FliptBatchEvaluateDTO$FliptResponseDTO$VariantResponse;Lcom/stockbit/lib/pocket/android/flipt/data/FliptBatchEvaluateDTO$FliptResponseDTO$ErrorResponse;)V", "getType", "()Ljava/lang/String;", "getBooleanResponse", "()Lcom/stockbit/lib/pocket/android/flipt/data/FliptBatchEvaluateDTO$FliptResponseDTO$BooleanResponse;", "getVariantResponse", "()Lcom/stockbit/lib/pocket/android/flipt/data/FliptBatchEvaluateDTO$FliptResponseDTO$VariantResponse;", "getErrorResponse", "()Lcom/stockbit/lib/pocket/android/flipt/data/FliptBatchEvaluateDTO$FliptResponseDTO$ErrorResponse;", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "BooleanResponse", "VariantResponse", "ErrorResponse", "pocket_android_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FliptResponseDTO {

        @SerializedName("booleanResponse")
        private final BooleanResponse booleanResponse;

        @SerializedName("errorResponse")
        private final ErrorResponse errorResponse;

        @SerializedName("type")
        private final String type;

        @SerializedName("variantResponse")
        private final VariantResponse variantResponse;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/stockbit/lib/pocket/android/flipt/data/FliptBatchEvaluateDTO$FliptResponseDTO$BooleanResponse;", "", "enabled", "", "reason", "", "requestId", "timestamp", "flagKey", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getReason", "()Ljava/lang/String;", "getRequestId", "getTimestamp", "getFlagKey", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stockbit/lib/pocket/android/flipt/data/FliptBatchEvaluateDTO$FliptResponseDTO$BooleanResponse;", "equals", "other", "hashCode", "", "toString", "pocket_android_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class BooleanResponse {

            @SerializedName("enabled")
            private final Boolean enabled;

            @SerializedName("flagKey")
            private final String flagKey;

            @SerializedName("reason")
            private final String reason;

            @SerializedName("requestId")
            private final String requestId;

            @SerializedName("timestamp")
            private final String timestamp;

            public BooleanResponse() {
                Boolean r1 = null;
                String r2 = null;
                String r3 = null;
                String r4 = null;
                String r5 = null;
                this(r1, r2, r3, r4, r5, 31, null);
            }

            public final Boolean a() {
                return this.enabled;
            }

            public final String b() {
                return this.flagKey;
            }

            public final String c() {
                return this.reason;
            }

            public final String d() {
                return this.requestId;
            }

            public final String e() {
                return this.timestamp;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof BooleanResponse) == true) goto L8;
                return false;
            L8:
                BooleanResponse r52 = (BooleanResponse) r5;
                if (p.g(this.enabled, r52.enabled) == true) goto L12;
                return false;
            L12:
                if (p.g(this.reason, r52.reason) == true) goto L15;
                return false;
            L15:
                if (p.g(this.requestId, r52.requestId) == true) goto L18;
                return false;
            L18:
                if (p.g(this.timestamp, r52.timestamp) == true) goto L21;
                return false;
            L21:
                if (p.g(this.flagKey, r52.flagKey) == true) goto L23;
                return false;
            L23:
                return true;
            }

            public int hashCode() {
                Boolean r02 = this.enabled;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                String r2 = this.reason;
                if (r2 != null) goto L9;
                int r22 = 0;
            L10:
                int r05 = (r04 + r22) * 31;
                String r23 = this.requestId;
                if (r23 != null) goto L13;
                int r24 = 0;
            L14:
                int r06 = (r05 + r24) * 31;
                String r25 = this.timestamp;
                if (r25 != null) goto L17;
                int r26 = 0;
            L18:
                int r07 = (r06 + r26) * 31;
                String r27 = this.flagKey;
                if (r27 == null) goto L23;
                r1 = r27.hashCode();
            L23:
                return r07 + r1;
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
                return "BooleanResponse(enabled=" + this.enabled + ", reason=" + this.reason + ", requestId=" + this.requestId + ", timestamp=" + this.timestamp + ", flagKey=" + this.flagKey + ')';
            }

            public BooleanResponse(Boolean r1, String r2, String r3, String r4, String r5) {
                this.enabled = r1;
                this.reason = r2;
                this.requestId = r3;
                this.timestamp = r4;
                this.flagKey = r5;
            }

            public /* synthetic */ BooleanResponse(Boolean r2, String r3, String r4, String r5, String r6, int r7, i r8) {
                if ((r7 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r7 & 2) == 0) goto L9;
                r3 = null;
            L9:
                if ((r7 & 4) == 0) goto L12;
                r4 = null;
            L12:
                if ((r7 & 8) == 0) goto L15;
                r5 = null;
            L15:
                if ((r7 & 16) == 0) goto L18;
                String r72 = null;
            L17:
                String r62 = r5;
                String r52 = r4;
                this(r2, r3, r52, r62, r72);
                return;
            L18:
                r72 = r6;
                goto L17
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/stockbit/lib/pocket/android/flipt/data/FliptBatchEvaluateDTO$FliptResponseDTO$ErrorResponse;", "", "flagKey", "", "namespaceKey", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFlagKey", "()Ljava/lang/String;", "getNamespaceKey", "getReason", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "pocket_android_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ErrorResponse {

            @SerializedName("flagKey")
            private final String flagKey;

            @SerializedName("namespaceKey")
            private final String namespaceKey;

            @SerializedName("reason")
            private final String reason;

            public ErrorResponse() {
                String r1 = null;
                String r2 = null;
                String r3 = null;
                this(r1, r2, r3, 7, null);
            }

            public final String a() {
                return this.flagKey;
            }

            public final String b() {
                return this.namespaceKey;
            }

            public final String c() {
                return this.reason;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof ErrorResponse) == true) goto L8;
                return false;
            L8:
                ErrorResponse r52 = (ErrorResponse) r5;
                if (p.g(this.flagKey, r52.flagKey) == true) goto L12;
                return false;
            L12:
                if (p.g(this.namespaceKey, r52.namespaceKey) == true) goto L15;
                return false;
            L15:
                if (p.g(this.reason, r52.reason) == true) goto L17;
                return false;
            L17:
                return true;
            }

            public int hashCode() {
                String r02 = this.flagKey;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                String r2 = this.namespaceKey;
                if (r2 != null) goto L9;
                int r22 = 0;
            L10:
                int r05 = (r04 + r22) * 31;
                String r23 = this.reason;
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
                return "ErrorResponse(flagKey=" + this.flagKey + ", namespaceKey=" + this.namespaceKey + ", reason=" + this.reason + ')';
            }

            public ErrorResponse(String r1, String r2, String r3) {
                this.flagKey = r1;
                this.namespaceKey = r2;
                this.reason = r3;
            }

            public /* synthetic */ ErrorResponse(String r2, String r3, String r4, int r5, i r6) {
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

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jt\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010$J\u0014\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010'\u001a\u00020(HÖ\u0081\u0004J\n\u0010)\u001a\u00020\u0006HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015¨\u0006*"}, d2 = {"Lcom/stockbit/lib/pocket/android/flipt/data/FliptBatchEvaluateDTO$FliptResponseDTO$VariantResponse;", "", "match", "", "segmentKeys", "", "", "reason", "variantKey", "variantAttachment", "requestId", "timestamp", "flagKey", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMatch", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSegmentKeys", "()Ljava/util/List;", "getReason", "()Ljava/lang/String;", "getVariantKey", "getVariantAttachment", "getRequestId", "getTimestamp", "getFlagKey", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stockbit/lib/pocket/android/flipt/data/FliptBatchEvaluateDTO$FliptResponseDTO$VariantResponse;", "equals", "other", "hashCode", "", "toString", "pocket_android_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class VariantResponse {

            @SerializedName("flagKey")
            private final String flagKey;

            @SerializedName("match")
            private final Boolean match;

            @SerializedName("reason")
            private final String reason;

            @SerializedName("requestId")
            private final String requestId;

            @SerializedName("segmentKeys")
            private final List<String> segmentKeys;

            @SerializedName("timestamp")
            private final String timestamp;

            @SerializedName("variantAttachment")
            private final String variantAttachment;

            @SerializedName("variantKey")
            private final String variantKey;

            public VariantResponse() {
                Boolean r1 = null;
                List r2 = null;
                String r3 = null;
                String r4 = null;
                String r5 = null;
                String r6 = null;
                String r7 = null;
                String r8 = null;
                this(r1, r2, r3, r4, r5, r6, r7, r8, com.google.firebase.perf.util.Constants.MAX_HOST_LENGTH, null);
            }

            public final String a() {
                return this.flagKey;
            }

            public final Boolean b() {
                return this.match;
            }

            public final String c() {
                return this.reason;
            }

            public final String d() {
                return this.requestId;
            }

            public final List e() {
                return this.segmentKeys;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof VariantResponse) == true) goto L8;
                return false;
            L8:
                VariantResponse r52 = (VariantResponse) r5;
                if (p.g(this.match, r52.match) == true) goto L12;
                return false;
            L12:
                if (p.g(this.segmentKeys, r52.segmentKeys) == true) goto L15;
                return false;
            L15:
                if (p.g(this.reason, r52.reason) == true) goto L18;
                return false;
            L18:
                if (p.g(this.variantKey, r52.variantKey) == true) goto L21;
                return false;
            L21:
                if (p.g(this.variantAttachment, r52.variantAttachment) == true) goto L24;
                return false;
            L24:
                if (p.g(this.requestId, r52.requestId) == true) goto L27;
                return false;
            L27:
                if (p.g(this.timestamp, r52.timestamp) == true) goto L30;
                return false;
            L30:
                if (p.g(this.flagKey, r52.flagKey) == true) goto L32;
                return false;
            L32:
                return true;
            }

            public final String f() {
                return this.timestamp;
            }

            public final String g() {
                return this.variantAttachment;
            }

            public final String h() {
                return this.variantKey;
            }

            public int hashCode() {
                Boolean r02 = this.match;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                List<String> r2 = this.segmentKeys;
                if (r2 != null) goto L9;
                int r22 = 0;
            L10:
                int r05 = (r04 + r22) * 31;
                String r23 = this.reason;
                if (r23 != null) goto L13;
                int r24 = 0;
            L14:
                int r06 = (r05 + r24) * 31;
                String r25 = this.variantKey;
                if (r25 != null) goto L17;
                int r26 = 0;
            L18:
                int r07 = (r06 + r26) * 31;
                String r27 = this.variantAttachment;
                if (r27 != null) goto L21;
                int r28 = 0;
            L22:
                int r08 = (r07 + r28) * 31;
                String r29 = this.requestId;
                if (r29 != null) goto L25;
                int r210 = 0;
            L26:
                int r09 = (r08 + r210) * 31;
                String r211 = this.timestamp;
                if (r211 != null) goto L29;
                int r212 = 0;
            L30:
                int r010 = (r09 + r212) * 31;
                String r213 = this.flagKey;
                if (r213 == null) goto L35;
                r1 = r213.hashCode();
            L35:
                return r010 + r1;
            L29:
                r212 = r211.hashCode();
                goto L30
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
                return "VariantResponse(match=" + this.match + ", segmentKeys=" + this.segmentKeys + ", reason=" + this.reason + ", variantKey=" + this.variantKey + ", variantAttachment=" + this.variantAttachment + ", requestId=" + this.requestId + ", timestamp=" + this.timestamp + ", flagKey=" + this.flagKey + ')';
            }

            public VariantResponse(Boolean r1, List<String> r2, String r3, String r4, String r5, String r6, String r7, String r8) {
                this.match = r1;
                this.segmentKeys = r2;
                this.reason = r3;
                this.variantKey = r4;
                this.variantAttachment = r5;
                this.requestId = r6;
                this.timestamp = r7;
                this.flagKey = r8;
            }

            public /* synthetic */ VariantResponse(Boolean r2, List r3, String r4, String r5, String r6, String r7, String r8, String r9, int r10, i r11) {
                if ((r10 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r10 & 2) == 0) goto L9;
                r3 = null;
            L9:
                if ((r10 & 4) == 0) goto L12;
                r4 = null;
            L12:
                if ((r10 & 8) == 0) goto L15;
                r5 = null;
            L15:
                if ((r10 & 16) == 0) goto L18;
                r6 = null;
            L18:
                if ((r10 & 32) == 0) goto L21;
                r7 = null;
            L21:
                if ((r10 & 64) == 0) goto L24;
                r8 = null;
            L24:
                if ((r10 & 128) == 0) goto L27;
                String r102 = null;
            L26:
                String r92 = r8;
                String r82 = r7;
                String r72 = r6;
                String r62 = r5;
                String r52 = r4;
                this(r2, r3, r52, r62, r72, r82, r92, r102);
                return;
            L27:
                r102 = r9;
                goto L26
            }
        }

        public FliptResponseDTO() {
            String r1 = null;
            BooleanResponse r2 = null;
            VariantResponse r3 = null;
            ErrorResponse r4 = null;
            this(r1, r2, r3, r4, 15, null);
        }

        public final BooleanResponse a() {
            return this.booleanResponse;
        }

        public final ErrorResponse b() {
            return this.errorResponse;
        }

        public final String c() {
            return this.type;
        }

        public final VariantResponse d() {
            return this.variantResponse;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof FliptResponseDTO) == true) goto L8;
            return false;
        L8:
            FliptResponseDTO r52 = (FliptResponseDTO) r5;
            if (p.g(this.type, r52.type) == true) goto L12;
            return false;
        L12:
            if (p.g(this.booleanResponse, r52.booleanResponse) == true) goto L15;
            return false;
        L15:
            if (p.g(this.variantResponse, r52.variantResponse) == true) goto L18;
            return false;
        L18:
            if (p.g(this.errorResponse, r52.errorResponse) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            String r02 = this.type;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            BooleanResponse r2 = this.booleanResponse;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            VariantResponse r23 = this.variantResponse;
            if (r23 != null) goto L13;
            int r24 = 0;
        L14:
            int r06 = (r05 + r24) * 31;
            ErrorResponse r25 = this.errorResponse;
            if (r25 == null) goto L19;
            r1 = r25.hashCode();
        L19:
            return r06 + r1;
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
            return "FliptResponseDTO(type=" + this.type + ", booleanResponse=" + this.booleanResponse + ", variantResponse=" + this.variantResponse + ", errorResponse=" + this.errorResponse + ')';
        }

        public FliptResponseDTO(String r1, BooleanResponse r2, VariantResponse r3, ErrorResponse r4) {
            this.type = r1;
            this.booleanResponse = r2;
            this.variantResponse = r3;
            this.errorResponse = r4;
        }

        public /* synthetic */ FliptResponseDTO(String r2, BooleanResponse r3, VariantResponse r4, ErrorResponse r5, int r6, i r7) {
            if ((r6 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r6 & 2) == 0) goto L9;
            r3 = null;
        L9:
            if ((r6 & 4) == 0) goto L12;
            r4 = null;
        L12:
            if ((r6 & 8) == 0) goto L14;
            r5 = null;
        L14:
            this(r2, r3, r4, r5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FliptBatchEvaluateDTO() {
        Object[] r02 = 0 == true ? 1 : 0;
        this(null, r02, 3, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.requestId;
    }

    public final List b() {
        return this.responses;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof FliptBatchEvaluateDTO) == true) goto L8;
        return false;
    L8:
        FliptBatchEvaluateDTO r52 = (FliptBatchEvaluateDTO) r5;
        if (p.g(this.requestId, r52.requestId) == true) goto L12;
        return false;
    L12:
        if (p.g(this.responses, r52.responses) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.requestId;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        List<FliptResponseDTO> r2 = this.responses;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "FliptBatchEvaluateDTO(requestId=" + this.requestId + ", responses=" + this.responses + ')';
    }

    public FliptBatchEvaluateDTO(String r1, List<FliptResponseDTO> r2) {
        this.requestId = r1;
        this.responses = r2;
    }

    public /* synthetic */ FliptBatchEvaluateDTO(String r2, List r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        this(r2, r3);
    }
}
