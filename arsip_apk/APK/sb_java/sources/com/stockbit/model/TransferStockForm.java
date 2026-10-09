package com.stockbit.model;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import com.stockbit.model.entity.SecuritiesFormResponseData;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/stockbit/model/TransferStockForm;", "", "<init>", "()V", "form", "Lcom/stockbit/model/TransferStockForm$Data;", "getForm", "()Lcom/stockbit/model/TransferStockForm$Data;", "verificationFeatureMethod", "", "getVerificationFeatureMethod", "()Ljava/lang/String;", "Data", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TransferStockForm {

    @SerializedName("form")
    private final Data form;

    @SerializedName("verification_feature_method")
    private final String verificationFeatureMethod;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/model/TransferStockForm$Data;", "", "<init>", "()V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/stockbit/model/entity/SecuritiesFormResponseData;", "getData", "()Lcom/stockbit/model/entity/SecuritiesFormResponseData;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data {

        @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
        private final SecuritiesFormResponseData data;

        public Data() {
        }

        public final SecuritiesFormResponseData a() {
            return this.data;
        }
    }

    public TransferStockForm() {
    }

    public final Data a() {
        return this.form;
    }

    public final String b() {
        return this.verificationFeatureMethod;
    }
}
