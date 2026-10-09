package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.midtrans.sdk.corekit.core.Constants;

/* loaded from: classes6.dex */
final class FieldParser {
    private static final Object[][] FOUR_DIGIT_DATA_LENGTH = null;
    private static final Object[][] THREE_DIGIT_DATA_LENGTH = null;
    private static final Object[][] THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH = null;
    private static final Object[][] TWO_DIGIT_DATA_LENGTH = null;
    private static final Object VARIABLE_LENGTH = null;

    static {
        Object r02 = new Object();
        VARIABLE_LENGTH = r02;
        TWO_DIGIT_DATA_LENGTH = new Object[][]{new Object[]{"00", 18}, new Object[]{HiAnalyticsConstant.KeyAndValue.NUMBER_01, 14}, new Object[]{"02", 14}, new Object[]{"10", r02, 20}, new Object[]{"11", 6}, new Object[]{"12", 6}, new Object[]{"13", 6}, new Object[]{"15", 6}, new Object[]{"17", 6}, new Object[]{"20", 2}, new Object[]{"21", r02, 20}, new Object[]{"22", r02, 29}, new Object[]{"30", r02, 8}, new Object[]{"37", r02, 8}, new Object[]{"90", r02, 30}, new Object[]{"91", r02, 30}, new Object[]{"92", r02, 30}, new Object[]{"93", r02, 30}, new Object[]{"94", r02, 30}, new Object[]{"95", r02, 30}, new Object[]{"96", r02, 30}, new Object[]{"97", r02, 30}, new Object[]{"98", r02, 30}, new Object[]{"99", r02, 30}};
        THREE_DIGIT_DATA_LENGTH = new Object[][]{new Object[]{"240", r02, 30}, new Object[]{"241", r02, 30}, new Object[]{"242", r02, 6}, new Object[]{"250", r02, 30}, new Object[]{"251", r02, 30}, new Object[]{"253", r02, 17}, new Object[]{"254", r02, 20}, new Object[]{Constants.STATUS_CODE_400, r02, 30}, new Object[]{"401", r02, 30}, new Object[]{"402", 17}, new Object[]{"403", r02, 30}, new Object[]{"410", 13}, new Object[]{"411", 13}, new Object[]{"412", 13}, new Object[]{"413", 13}, new Object[]{"414", 13}, new Object[]{"420", r02, 20}, new Object[]{"421", r02, 15}, new Object[]{"422", 3}, new Object[]{"423", r02, 15}, new Object[]{"424", 3}, new Object[]{"425", 3}, new Object[]{"426", 3}};
        THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH = new Object[][]{new Object[]{"310", 6}, new Object[]{"311", 6}, new Object[]{"312", 6}, new Object[]{"313", 6}, new Object[]{"314", 6}, new Object[]{"315", 6}, new Object[]{"316", 6}, new Object[]{"320", 6}, new Object[]{"321", 6}, new Object[]{"322", 6}, new Object[]{"323", 6}, new Object[]{"324", 6}, new Object[]{"325", 6}, new Object[]{"326", 6}, new Object[]{"327", 6}, new Object[]{"328", 6}, new Object[]{"329", 6}, new Object[]{"330", 6}, new Object[]{"331", 6}, new Object[]{"332", 6}, new Object[]{"333", 6}, new Object[]{"334", 6}, new Object[]{"335", 6}, new Object[]{"336", 6}, new Object[]{"340", 6}, new Object[]{"341", 6}, new Object[]{"342", 6}, new Object[]{"343", 6}, new Object[]{"344", 6}, new Object[]{"345", 6}, new Object[]{"346", 6}, new Object[]{"347", 6}, new Object[]{"348", 6}, new Object[]{"349", 6}, new Object[]{"350", 6}, new Object[]{"351", 6}, new Object[]{"352", 6}, new Object[]{"353", 6}, new Object[]{"354", 6}, new Object[]{"355", 6}, new Object[]{"356", 6}, new Object[]{"357", 6}, new Object[]{"360", 6}, new Object[]{"361", 6}, new Object[]{"362", 6}, new Object[]{"363", 6}, new Object[]{"364", 6}, new Object[]{"365", 6}, new Object[]{"366", 6}, new Object[]{"367", 6}, new Object[]{"368", 6}, new Object[]{"369", 6}, new Object[]{"390", r02, 15}, new Object[]{"391", r02, 18}, new Object[]{"392", r02, 15}, new Object[]{"393", r02, 18}, new Object[]{"703", r02, 30}};
        FOUR_DIGIT_DATA_LENGTH = new Object[][]{new Object[]{"7001", 13}, new Object[]{"7002", r02, 30}, new Object[]{"7003", 10}, new Object[]{"8001", 14}, new Object[]{"8002", r02, 20}, new Object[]{"8003", r02, 30}, new Object[]{"8004", r02, 30}, new Object[]{"8005", 6}, new Object[]{"8006", 18}, new Object[]{"8007", r02, 30}, new Object[]{"8008", r02, 12}, new Object[]{"8018", 18}, new Object[]{"8020", r02, 25}, new Object[]{"8100", 6}, new Object[]{"8101", 10}, new Object[]{"8102", 2}, new Object[]{"8110", r02, 70}, new Object[]{"8200", r02, 70}};
    }

    private FieldParser() {
    }

    public static String parseFieldsInGeneralPurpose(String r10) throws NotFoundException {
        if (r10.isEmpty() == false) goto L7;
        return null;
    L7:
        if (r10.length() < 2) goto L65;
        String r2 = r10.substring(0, 2);
        Object[][] r3 = TWO_DIGIT_DATA_LENGTH;
        int r4 = r3.length;
        int r5 = 0;
    L10:
        if (r5 >= r4) goto L21;
        Object[] r7 = r3[r5];
        if (r7[0].equals(r2) == true) goto L13;
        r5 = r5 + 1;
        goto L10
    L13:
        Object r02 = r7[1];
        if (r02 != VARIABLE_LENGTH) goto L18;
        return processVariableAI(2, ((Integer) r7[2]).intValue(), r10);
    L18:
        return processFixedAI(2, ((Integer) r02).intValue(), r10);
    L21:
        if (r10.length() < 3) goto L63;
        String r22 = r10.substring(0, 3);
        Object[][] r42 = THREE_DIGIT_DATA_LENGTH;
        int r52 = r42.length;
        int r72 = 0;
    L23:
        if (r72 >= r52) goto L33;
        Object[] r8 = r42[r72];
        if (r8[0].equals(r22) == true) goto L26;
        r72 = r72 + 1;
        goto L23
    L26:
        Object r03 = r8[1];
        if (r03 != VARIABLE_LENGTH) goto L31;
        return processVariableAI(3, ((Integer) r8[2]).intValue(), r10);
    L31:
        return processFixedAI(3, ((Integer) r03).intValue(), r10);
    L33:
        Object[][] r32 = THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH;
        int r43 = r32.length;
        int r53 = 0;
    L35:
        if (r53 >= r43) goto L46;
        Object[] r82 = r32[r53];
        if (r82[0].equals(r22) == true) goto L38;
        r53 = r53 + 1;
        goto L35
    L38:
        Object r04 = r82[1];
        if (r04 != VARIABLE_LENGTH) goto L43;
        return processVariableAI(4, ((Integer) r82[2]).intValue(), r10);
    L43:
        return processFixedAI(4, ((Integer) r04).intValue(), r10);
    L46:
        if (r10.length() < 4) goto L61;
        String r23 = r10.substring(0, 4);
        Object[][] r33 = FOUR_DIGIT_DATA_LENGTH;
        int r44 = r33.length;
        int r54 = 0;
    L48:
        if (r54 >= r44) goto L59;
        Object[] r83 = r33[r54];
        if (r83[0].equals(r23) == true) goto L51;
        r54 = r54 + 1;
        goto L48
    L51:
        Object r05 = r83[1];
        if (r05 != VARIABLE_LENGTH) goto L56;
        return processVariableAI(4, ((Integer) r83[2]).intValue(), r10);
    L56:
        return processFixedAI(4, ((Integer) r05).intValue(), r10);
    L59:
        throw NotFoundException.getNotFoundInstance();
    L61:
        throw NotFoundException.getNotFoundInstance();
    L63:
        throw NotFoundException.getNotFoundInstance();
    L65:
        throw NotFoundException.getNotFoundInstance();
    }

    private static String processFixedAI(int r2, int r3, String r4) throws NotFoundException {
        if (r4.length() < r2) goto L14;
        String r02 = r4.substring(0, r2);
        int r32 = r3 + r2;
        if (r4.length() < r32) goto L12;
        String r22 = r4.substring(r2, r32);
        String r23 = "(" + r02 + ')' + r22;
        String r33 = parseFieldsInGeneralPurpose(r4.substring(r32));
        if (r33 != null) goto L10;
        return r23;
    L10:
        return r23 + r33;
    L12:
        throw NotFoundException.getNotFoundInstance();
    L14:
        throw NotFoundException.getNotFoundInstance();
    }

    private static String processVariableAI(int r2, int r3, String r4) throws NotFoundException {
        String r02 = r4.substring(0, r2);
        int r32 = r3 + r2;
        if (r4.length() >= r32) goto L5;
        r32 = r4.length();
    L5:
        String r22 = r4.substring(r2, r32);
        String r23 = "(" + r02 + ')' + r22;
        String r33 = parseFieldsInGeneralPurpose(r4.substring(r32));
        if (r33 != null) goto L9;
        return r23;
    L9:
        return r23 + r33;
    }
}
