package com.google.zxing.client.result;

/* loaded from: classes6.dex */
public final class AddressBookParsedResult extends ParsedResult {
    private final String[] addressTypes;
    private final String[] addresses;
    private final String birthday;
    private final String[] emailTypes;
    private final String[] emails;
    private final String[] geo;
    private final String instantMessenger;
    private final String[] names;
    private final String[] nicknames;
    private final String note;

    /* renamed from: org, reason: collision with root package name */
    private final String f38807org;
    private final String[] phoneNumbers;
    private final String[] phoneTypes;
    private final String pronunciation;
    private final String title;
    private final String[] urls;

    public AddressBookParsedResult(String[] r18, String[] r19, String[] r20, String[] r21, String[] r22, String[] r23, String[] r24) {
        this(r18, null, null, r19, r20, r21, r22, null, null, r23, r24, null, null, null, null, null);
    }

    public String[] getAddressTypes() {
        return this.addressTypes;
    }

    public String[] getAddresses() {
        return this.addresses;
    }

    public String getBirthday() {
        return this.birthday;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder r02 = new StringBuilder(100);
        ParsedResult.maybeAppend(this.names, r02);
        ParsedResult.maybeAppend(this.nicknames, r02);
        ParsedResult.maybeAppend(this.pronunciation, r02);
        ParsedResult.maybeAppend(this.title, r02);
        ParsedResult.maybeAppend(this.f38807org, r02);
        ParsedResult.maybeAppend(this.addresses, r02);
        ParsedResult.maybeAppend(this.phoneNumbers, r02);
        ParsedResult.maybeAppend(this.emails, r02);
        ParsedResult.maybeAppend(this.instantMessenger, r02);
        ParsedResult.maybeAppend(this.urls, r02);
        ParsedResult.maybeAppend(this.birthday, r02);
        ParsedResult.maybeAppend(this.geo, r02);
        ParsedResult.maybeAppend(this.note, r02);
        return r02.toString();
    }

    public String[] getEmailTypes() {
        return this.emailTypes;
    }

    public String[] getEmails() {
        return this.emails;
    }

    public String[] getGeo() {
        return this.geo;
    }

    public String getInstantMessenger() {
        return this.instantMessenger;
    }

    public String[] getNames() {
        return this.names;
    }

    public String[] getNicknames() {
        return this.nicknames;
    }

    public String getNote() {
        return this.note;
    }

    public String getOrg() {
        return this.f38807org;
    }

    public String[] getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public String[] getPhoneTypes() {
        return this.phoneTypes;
    }

    public String getPronunciation() {
        return this.pronunciation;
    }

    public String getTitle() {
        return this.title;
    }

    public String[] getURLs() {
        return this.urls;
    }

    public AddressBookParsedResult(String[] r3, String[] r4, String r5, String[] r6, String[] r7, String[] r8, String[] r9, String r10, String r11, String[] r12, String[] r13, String r14, String r15, String r16, String[] r17, String[] r18) {
        super(ParsedResultType.ADDRESSBOOK);
        if (r6 == null) goto L10;
        if (r7 == null) goto L10;
        if (r6.length == r7.length) goto L10;
        throw new IllegalArgumentException("Phone numbers and types lengths differ");
    L10:
        if (r8 == null) goto L17;
        if (r9 == null) goto L17;
        if (r8.length == r9.length) goto L17;
        throw new IllegalArgumentException("Emails and types lengths differ");
    L17:
        if (r12 == null) goto L24;
        if (r13 == null) goto L24;
        if (r12.length == r13.length) goto L24;
        throw new IllegalArgumentException("Addresses and types lengths differ");
    L24:
        this.names = r3;
        this.nicknames = r4;
        this.pronunciation = r5;
        this.phoneNumbers = r6;
        this.phoneTypes = r7;
        this.emails = r8;
        this.emailTypes = r9;
        this.instantMessenger = r10;
        this.note = r11;
        this.addresses = r12;
        this.addressTypes = r13;
        this.f38807org = r14;
        this.birthday = r15;
        this.title = r16;
        this.urls = r17;
        this.geo = r18;
    }
}
