package com.midtrans.sdk.corekit.core;

/* loaded from: classes6.dex */
public enum PaymentMethod extends Enum<PaymentMethod> {
    private static final /* synthetic */ PaymentMethod[] $VALUES = null;
    public static final PaymentMethod AKULAKU = null;
    public static final PaymentMethod ALFAMART = null;
    public static final PaymentMethod BANK_TRANSFER = null;
    public static final PaymentMethod BANK_TRANSFER_BCA = null;
    public static final PaymentMethod BANK_TRANSFER_BNI = null;
    public static final PaymentMethod BANK_TRANSFER_BRI = null;
    public static final PaymentMethod BANK_TRANSFER_MANDIRI = null;
    public static final PaymentMethod BANK_TRANSFER_OTHER = null;
    public static final PaymentMethod BANK_TRANSFER_PERMATA = null;
    public static final PaymentMethod BCA_KLIKPAY = null;
    public static final PaymentMethod CIMB_CLICKS = null;
    public static final PaymentMethod CREDIT_CARD = null;
    public static final PaymentMethod DANAMON_ONLINE = null;
    public static final PaymentMethod EPAY_BRI = null;
    public static final PaymentMethod GIFT_CARD_INDONESIA = null;
    public static final PaymentMethod GO_PAY = null;
    public static final PaymentMethod INDOMARET = null;
    public static final PaymentMethod INDOSAT_DOMPETKU = null;
    public static final PaymentMethod KIOSON = null;
    public static final PaymentMethod KLIKBCA = null;
    public static final PaymentMethod MANDIRI_CLICKPAY = null;
    public static final PaymentMethod MANDIRI_ECASH = null;
    public static final PaymentMethod SHOPEEPAY = null;
    public static final PaymentMethod TELKOMSEL_CASH = null;
    public static final PaymentMethod XL_TUNAI = null;

    static {
        PaymentMethod r1 = new PaymentMethod("CREDIT_CARD", 0);
        CREDIT_CARD = r1;
        PaymentMethod r2 = new PaymentMethod("BANK_TRANSFER", 1);
        BANK_TRANSFER = r2;
        PaymentMethod r3 = new PaymentMethod("BANK_TRANSFER_BCA", 2);
        BANK_TRANSFER_BCA = r3;
        PaymentMethod r4 = new PaymentMethod("BANK_TRANSFER_MANDIRI", 3);
        BANK_TRANSFER_MANDIRI = r4;
        PaymentMethod r5 = new PaymentMethod("BANK_TRANSFER_PERMATA", 4);
        BANK_TRANSFER_PERMATA = r5;
        PaymentMethod r6 = new PaymentMethod("BANK_TRANSFER_BNI", 5);
        BANK_TRANSFER_BNI = r6;
        PaymentMethod r7 = new PaymentMethod("BANK_TRANSFER_BRI", 6);
        BANK_TRANSFER_BRI = r7;
        PaymentMethod r8 = new PaymentMethod("BANK_TRANSFER_OTHER", 7);
        BANK_TRANSFER_OTHER = r8;
        PaymentMethod r9 = new PaymentMethod("GO_PAY", 8);
        GO_PAY = r9;
        PaymentMethod r10 = new PaymentMethod("BCA_KLIKPAY", 9);
        BCA_KLIKPAY = r10;
        PaymentMethod r11 = new PaymentMethod("KLIKBCA", 10);
        KLIKBCA = r11;
        PaymentMethod r12 = new PaymentMethod("MANDIRI_CLICKPAY", 11);
        MANDIRI_CLICKPAY = r12;
        PaymentMethod r13 = new PaymentMethod("MANDIRI_ECASH", 12);
        MANDIRI_ECASH = r13;
        PaymentMethod r14 = new PaymentMethod("EPAY_BRI", 13);
        EPAY_BRI = r14;
        PaymentMethod r15 = new PaymentMethod("CIMB_CLICKS", 14);
        CIMB_CLICKS = r15;
        PaymentMethod r02 = new PaymentMethod("INDOMARET", 15);
        INDOMARET = r02;
        PaymentMethod r16 = new PaymentMethod("KIOSON", 16);
        KIOSON = r16;
        PaymentMethod r03 = new PaymentMethod("GIFT_CARD_INDONESIA", 17);
        GIFT_CARD_INDONESIA = r03;
        PaymentMethod r17 = new PaymentMethod("INDOSAT_DOMPETKU", 18);
        INDOSAT_DOMPETKU = r17;
        PaymentMethod r04 = new PaymentMethod("TELKOMSEL_CASH", 19);
        TELKOMSEL_CASH = r04;
        PaymentMethod r18 = new PaymentMethod("XL_TUNAI", 20);
        XL_TUNAI = r18;
        PaymentMethod r05 = new PaymentMethod("DANAMON_ONLINE", 21);
        DANAMON_ONLINE = r05;
        PaymentMethod r19 = new PaymentMethod("AKULAKU", 22);
        AKULAKU = r19;
        PaymentMethod r06 = new PaymentMethod("ALFAMART", 23);
        ALFAMART = r06;
        PaymentMethod r110 = new PaymentMethod("SHOPEEPAY", 24);
        SHOPEEPAY = r110;
        $VALUES = new PaymentMethod[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r02, r16, r03, r17, r04, r18, r05, r19, r06, r110};
    }

    PaymentMethod(String r1, int r2) {
    }

    public static PaymentMethod valueOf(String r1) {
        return (PaymentMethod) Enum.valueOf(PaymentMethod.class, r1);
    }

    public static PaymentMethod[] values() {
        return (PaymentMethod[]) $VALUES.clone();
    }
}
