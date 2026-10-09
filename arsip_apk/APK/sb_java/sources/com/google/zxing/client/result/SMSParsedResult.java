package com.google.zxing.client.result;

/* loaded from: classes6.dex */
public final class SMSParsedResult extends ParsedResult {
    private final String body;
    private final String[] numbers;
    private final String subject;
    private final String[] vias;

    public SMSParsedResult(String r2, String r3, String r4, String r5) {
        super(ParsedResultType.SMS);
        this.numbers = new String[]{r2};
        this.vias = new String[]{r3};
        this.subject = r4;
        this.body = r5;
    }

    public String getBody() {
        return this.body;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder r02 = new StringBuilder(100);
        ParsedResult.maybeAppend(this.numbers, r02);
        ParsedResult.maybeAppend(this.subject, r02);
        ParsedResult.maybeAppend(this.body, r02);
        return r02.toString();
    }

    public String[] getNumbers() {
        return this.numbers;
    }

    public String getSMSURI() {
        StringBuilder r02 = new StringBuilder();
        r02.append("sms:");
        boolean r1 = true;
        boolean r4 = true;
        int r3 = 0;
    L4:
        if (r3 >= this.numbers.length) goto L15;
        if (r4 == false) goto L7;
        r4 = false;
    L8:
        r02.append(this.numbers[r3]);
        String[] r5 = this.vias;
        if (r5 == null) goto L13;
        if (r5[r3] == null) goto L13;
        r02.append(";via=");
        r02.append(this.vias[r3]);
    L13:
        r3 = r3 + 1;
        goto L4
    L7:
        r02.append(',');
        goto L8
    L15:
        if (this.body == null) goto L17;
        boolean r32 = true;
    L19:
        if (this.subject != null) goto L22;
        r1 = false;
    L22:
        if (r32 == true) goto L24;
        if (r1 == true) goto L24;
    L32:
        return r02.toString();
    L24:
        r02.append('?');
        if (r32 == false) goto L27;
        r02.append("body=");
        r02.append(this.body);
    L27:
        if (r1 == false) goto L32;
        if (r32 == false) goto L30;
        r02.append('&');
    L30:
        r02.append("subject=");
        r02.append(this.subject);
        goto L32
    L17:
        r32 = false;
        goto L19
    }

    public String getSubject() {
        return this.subject;
    }

    public String[] getVias() {
        return this.vias;
    }

    public SMSParsedResult(String[] r2, String[] r3, String r4, String r5) {
        super(ParsedResultType.SMS);
        this.numbers = r2;
        this.vias = r3;
        this.subject = r4;
        this.body = r5;
    }
}
