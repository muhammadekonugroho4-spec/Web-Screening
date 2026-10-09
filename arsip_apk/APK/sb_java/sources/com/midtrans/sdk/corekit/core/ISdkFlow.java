package com.midtrans.sdk.corekit.core;

import android.content.Context;
import com.midtrans.sdk.corekit.callback.CardRegistrationCallback;

/* loaded from: classes6.dex */
public interface ISdkFlow {
    void runAkulaku(Context r1, String r2);

    void runAlfamart(Context r1, String r2);

    void runBCABankTransfer(Context r1, String r2);

    void runBCAKlikPay(Context r1, String r2);

    void runBRIEpay(Context r1, String r2);

    void runBankTransfer(Context r1, String r2);

    void runBniBankTransfer(Context r1, String r2);

    void runBriBankTransfer(Context r1, String r2);

    void runCIMBClicks(Context r1, String r2);

    void runCardRegistration(Context r1, CardRegistrationCallback r2);

    void runCreditCard(Context r1, String r2);

    void runDanamonOnline(Context r1, String r2);

    void runGci(Context r1, String r2);

    void runGoPay(Context r1, String r2);

    void runIndomaret(Context r1, String r2);

    void runIndosatDompetku(Context r1, String r2);

    void runKioson(Context r1, String r2);

    void runKlikBCA(Context r1, String r2);

    void runMandiriBankTransfer(Context r1, String r2);

    void runMandiriClickpay(Context r1, String r2);

    void runMandiriECash(Context r1, String r2);

    void runOtherBankTransfer(Context r1, String r2);

    void runPermataBankTransfer(Context r1, String r2);

    void runShopeePay(Context r1, String r2);

    void runTelkomselCash(Context r1, String r2);

    void runUIFlow(Context r1, String r2);

    void runXlTunai(Context r1, String r2);
}
