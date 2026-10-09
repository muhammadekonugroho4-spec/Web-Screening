package com.midtrans.sdk.corekit.core;

import android.content.Context;
import android.text.TextUtils;
import com.midtrans.sdk.corekit.callback.TransactionFinishedCallback;
import com.midtrans.sdk.corekit.core.themes.BaseColorTheme;
import com.midtrans.sdk.corekit.models.PaymentMethodsModel;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class BaseSdkBuilder<T> {
    public static final String CORE_FLOW = "core";
    private static final String TAG = "BaseSdkBuilder";
    public static final String UI_FLOW = "ui";
    public static final String WIDGET = "widget";
    public UIKitCustomSetting UIKitCustomSetting;
    public String boldText;
    public String clientKey;
    public BaseColorTheme colorTheme;
    public Context context;
    public String defaultText;
    public boolean enableBuiltInTokenStorage;
    public boolean enableLog;
    public IScanner externalScanner;
    public String flow;
    public String languageCode;
    public String merchantName;
    public String merchantServerUrl;
    public ISdkFlow sdkFlow;
    public ArrayList<PaymentMethodsModel> selectedPaymentMethods;
    public String semiBoldText;
    public TransactionFinishedCallback transactionFinishedCallback;

    public BaseSdkBuilder() {
        this.clientKey = null;
        this.context = null;
        this.enableLog = false;
        this.enableBuiltInTokenStorage = true;
        this.merchantServerUrl = null;
        this.merchantName = null;
        this.languageCode = "en";
    }

    public MidtransSDK buildSDK() {
        if (isValidData() == true) goto L5;
        Logger.e("already performing an transaction");
        return null;
    L5:
        return MidtransSDK.delegateInstance(this);
    }

    public abstract T enableLog(boolean r1);

    public boolean isValidData() {
        if (this.clientKey != null) goto L5;
    L6:
        Logger.e("Client key  and context cannot be null or empty. Please set the client key and context", new RuntimeException("Client key  and context cannot be null or empty. Please set the client key and context"));
    L8:
        if (this.enableBuiltInTokenStorage == false) goto L10;
        return true;
    L10:
        if (TextUtils.isEmpty(this.merchantServerUrl) == false) goto L15;
        Logger.e("Merchant base url cannot be null or empty (required) if you implement your own token storage. Please set your merchant base url to enable your own token storage", new RuntimeException("Merchant base url cannot be null or empty (required) if you implement your own token storage. Please set your merchant base url to enable your own token storage"));
        return true;
    L15:
        return true;
    L5:
        if (this.context != null) goto L8;
        goto L6
    }
}
