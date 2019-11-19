package com.mk.migrationmodel.constants;

import java.util.Locale;

import org.springframework.stereotype.Component;

@Component
public final class CommonConstants {

	public static final String ERROR = "Error";

	public static final String INFO = "Info";

	public static final String TRANSACTION_ID_NULL = "TRANSACTION_ID_NULL";

	public static final String TRANSACTION_ID = "TransactionId";

	public static final String REQUEST_DATE = "RequestDate";

	public static final String REQUEST_DATE_INVALID_FORMAT_MESSAGE = "REQUEST_DATE_INVALID_FORMAT_MESSAGE";

	public static final String REQUEST_DATE_INVALID_FORMAT = "REQUEST_DATE_INVALID_FORMAT";

	public static final String FROM_DATE_INVALID = "FROM_DATE_INVALID";

	public static final String TO_DATE_INVALID = "TO_DATE_INVALID";

	public static final String INVALID_DATES = "INVALID_DATES";

	public static final String ERROR_STATUS_CODE_INVALID = "ERROR_STATUS_CODE_INVALID";

	public static final String REQUEST_DATE_NULL = "REQUEST_DATE_NULL";

	public static final String REQUEST_DATE_FUTURE = "REQUEST_DATE_FUTURE";

	public static final String TRANSACTION_PROCESS_IND_DEFAULT = "TRANSACTION_PROCESS_IND_DEFAULT";

	public static final String CURRENCY_CODE_DEFAULT = "CURRENCY_CODE_DEFAULT";

	public static final String TRANSACTION_TYPE_REASON_CODE_NULL = "TRANSACTION_TYPE_REASON_CODE_NULL";

	public static final String TRANSACTION_TYPE_REASON_CODE_INVALID = "TRANSACTION_TYPE_REASON_CODE_INVALID";

	public static final String PAYMENT_ACCOUNT_TOKEN_OR_NUMBER_MANDATORY = "PAYMENT_ACCOUNT_TOKEN_OR_NUMBER_MANDATORY";

	public static final String AGENT_NUM_INVALID = "AGENT_NUM_INVALID";

	public static final String PAYMENT_ITEM_COUNT_NOT_MATCH = "PAYMENT_ITEM_COUNT_NOT_MATCH";

	public static final String PAYMENT_AMOUNT_INVALID = "PAYMENT_AMOUNT_INVALID";

	public static final String PAYMENT_AMOUNT_SUM_NOT_MATCH = "PAYMENT_AMOUNT_SUM_NOT_MATCH";

	public static final String ACCOUNT_NUM_OR_POLICY_NUM_MANDATORY = "ACCOUNT_NUM_OR_POLICY_NUM_MANDATORY";

	public static final String LOVCURRENCY = "LOVCURRENCY";

	public static final String LOVLOB = "LOVLOB";

	public static final String LOVPAYMENTACCOUNTTYPE = "LOVPAYMENTACCOUNTTYPE";

	public static final String LOVPAYMENTCHANNEL = "LOVPAYMENTCHANNEL";

	public static final String LOVPAYMENTITEMCATEGORY = "LOVPAYMENTITEMCATEGORY";

	public static final String LOVPAYMENTMETHOD = "LOVPAYMENTMETHOD";

	public static final String LOVPAYMENTSTATUS = "LOVPAYMENTSTATUS";

	public static final String LOVPAYMENTTRANSACTIONTYPEREASON = "LOVPAYMENTTRANSACTIONTYPEREASON";

	public static final String LOVPAYMENTTYPE = "LOVPAYMENTTYPE";

	public static final String LOVPOSTEDBYROLE = "LOVPOSTEDBYROLE";

	public static final String LOVTRANSACTIONTYPE = "LOVTRANSACTIONTYPE";

	public static final String LOVERRORLOGTRANSACTION = "LOVERRORLOGTRANSACTION";

	public static final String LOVPAYMENTITEMACTIVITYTYPE = "LOVPAYMENTITEMACTIVITYTYPE";

	// public static final String LOVBILLINGSYSTEM = "LOVBILLINGSYSTEM";

	public static final String ACCOUNT_NUM_OR_POLICY_NUM_OR_PAYMENT_ID_MANDATORY = "ACCOUNT_NUM_OR_POLICY_NUM_OR_PAYMENT_ID_MANDATORY";

	public static final String PAYMENT_FROM_DATE_INVALID_FORMAT = "PAYMENT_FROM_DATE_INVALID_FORMAT";

	public static final String PAYMENT_TO_DATE_INVALID_FORMAT = "PAYMENT_TO_DATE_INVALID_FORMAT";

	public static final String PAYMENT_TO_DATE_INVALID = "PAYMENT_TO_DATE_INVALID";

	public static final String TRANSACTION_TYPE_CODE_INVALID_CODE = "TRANSACTION_TYPE_CODE_INVALID_CODE";

	public static final String PAYMENT_TYPE_INVALID_CODE = "PAYMENT_TYPE_INVALID_CODE";

	public static final String RECORD_NOT_FOUND = "RECORD_NOT_FOUND";

	public static final String RESULT_LIST_CURTAILED = "RESULT_LIST_CURTAILED";

	public static final String PAYMENT_ITEM_AMOUNT_INVALID = "PAYMENT_ITEM_AMOUNT_INVALID";

	public static final String LINE_OF_BUSINESS_INVALID_CODE = "LINE_OF_BUSINESS_INVALID_CODE";

	public static final String PAYMENT_CATEGORY_INVALID_CODE = "PAYMENT_CATEGORY_INVALID_CODE";

	public static final String TAX_YEAR_INVALID = "TAX_YEAR_INVALID";

	public static final String POLICY_NUM_INVALID = "POLICY_NUM_INVALID";

	public static final String ACCOUNT_NUM_INVALID = "ACCOUNT_NUM_INVALID";

	public static final String INVOICE_NUM_INVALID = "INVOICE_NUM_INVALID";

	public static final String IND_1035_INVALID = "IND_1035_INVALID";

	public static final String REFERENCE_ID_1035_INVALID = "REFERENCE_ID_1035_INVALID";

	public static final String yyyy_MM_dd_FORMAT = "yyyy-MM-dd";

	public static final String ACCOUNT_NUM_KEY = "accountNum";

	public static final String PAYMENT_ID_KEY = "paymentId";

	public static final String CHANNEL_PAYMENT_ID_KEY = "paymentChannelPaymentId";

	public static final String CHANNEL_PAYMENT_KEY = "paymentChannelCode";

	public static final String PAYMENT_REFERENCE_ID_KEY = "paymentReferenceId";

	public static final String PAYMENT_TYPE_CODE_KEY = "paymentTypeCode";

	public static final String PAYMENT_DATE_KEY = "paymentDate";

	public static final String TRANSACTION_TYPE_CODE_KEY = "transactionTypeCode";

	public static final String POLICY_NUM_KEY = "policyNum";

	public static final String COLON = ":";

	public static final String LIKE = "LIKE";

	public static final String GREATER_THAN = ">";

	public static final String LESS_THAN = "<";

	public static final String GREATER_THAN_EQUAL = ">=";

	public static final String LESS_THAN_EQUAL = "<=";

	public static final String PAYMENT_NULL = "PAYMENT_NULL";

	public static final Locale DEFAULT_LOCALE = Locale.getDefault();

	public static final String PAYMENT_CHANNEL_PAYMENT_ID_INVALID = "PAYMENT_CHANNEL_PAYMENT_ID_INVALID";

	public static final String TRANSACTION_ID_INVALID = "TRANSACTION_ID_INVALID";

	public static final String PROCESSING = "PROCESSING";

	public static final String POSTED = "POSTED";

	public static final String PAYMENT_REQUEST_RECEIVED = "PAYMENT_REQUEST_RECEIVED";

	public static final String APPLIED_TO_BILLING_SYSTEM = "APPLIED_TO_BILLING_SYSTEM";

	public static final String Y = "Y";

	public static final String N = "N";

	public static final String PAYMENT_CHANNEL = "paymentchannel";

	public static final String PAYMENT_CHANNEL_PAYMENT_ID = "paymentChannelPaymentId";

	public static final String REVERSAL_TRANSACTION_INVALID = "REVERSAL_TRANSACTION_INVALID";

	public static final String MULTIPLE_PAYMENT_ITEMS = "MULTIPLE_PAYMENT_ITEMS";

	public static final String DUPLICATE_PAYMENT_TRANSACTION = "DUPLICATE_PAYMENT_TRANSACTION";

	public static final String GET_PAYMENT_ERROR = "GET_PAYMENT_ERROR";

	public static final String TRANSACTIONTYPE_CODE = "transactionTypeCode";

	public static final String PAYMENT = "PAYMENT";

	public static final String REVERSAL = "REVERSAL";

	public static final String REJECTION = "REJECTION";

	public static final String SYSTEM_ERROR = "SYSTEM_ERROR";

	public static final String LOVERRORSTATUS = "LOVERRORSTATUS";

	public static final String INVALID = "INVALID";

	public static final String OPEN = "OPEN";

	public static final String API_NAME_KEY = "apiName";

	public static final String TRANSACTION_TYPE_KEY = "transactionType";

	public static final String ERROR_STATUS_KEY = "errorStatus";

	public static final String ERROR_MESSAGE_KEY = "errorMessage";

	public static final String ERROR_DATE_KEY = "lastRetryTs";

	public static final String PCMAPPING = "PCMAPPING";

	public static final String LOVBATCHNUMBER = "LOVBATCHNUMBER";

	public static final String TRUE = "true";

	public static final String FALSE = "false";

	public static final String _LOG_DB = "_log_db";

	public static final String _LOG_FILE = "_log_file";

	public static final String INCOMING_REQUEST = "INCOMING_REQUEST";

	public static final String OUTGOING_RESPONSE = "OUTGOING_RESPONSE";

	public static final String INCOMING_RESPONSE = "INCOMING_RESPONSE";

	public static final String OUTGOING_REQUEST = "OUTGOING_REQUEST";

	public static final String DELIVERED_TO_BILLING = "DELIVERED_TO_BILLING";

	public static final String SUCCESS = "SUCCESS";

	public static final String PC = "PC";

	public static final String FSO = "FSO";

	public static final String COMPLETED = "COMPLETED";

	public static final String MANDATORY_TRANSACTION_TYPE_REASON_CODE_INVALID = "MANDATORY_TRANSACTION_TYPE_REASON_CODE_INVALID";

	public static final String MANDATORY_AGENT_NUM_INVALID = "MANDATORY_AGENT_NUM_INVALID";

	public static final String MANDATORY_PAYMENT_CHANNEL_PAYMENT_ID_INVALID = "MANDATORY_PAYMENT_CHANNEL_PAYMENT_ID_INVALID";

	public static final String REQUEST_ID = "requestId";

	public static final String RESPONSE_ID = "responseId";

	public static final String TRANSACTION_TYPE_CODE_INVALID = "TRANSACTION_TYPE_CODE_INVALID";

	public static final String PAYMENT_TYPE_INVALID = "PAYMENT_TYPE_INVALID";

	public static final String PAYMENTITEMACTIVITY = "PAYMENTITEMACTIVITY";

	public static final String PAYMENT_ITEM_ID_NULL = "PAYMENT_ITEM_ID_NULL";

	public static final String PAYMENT_ITEM_ACTIVITY_CODE_NULL = "PAYMENT_ITEM_ACTIVITY_CODE_NULL";

	public static final String PAYMENT_ITEM_ACTIVITY_CODE_INVALID_CODE = "PAYMENT_ITEM_ACTIVITY_CODE_INVALID_CODE";

	public static final String PAYMENT_ITEM_ACTIVITY_DATE_FUTURE = "PAYMENT_ITEM_ACTIVITY_DATE_FUTURE";

	public static final String PAYMENT_ITEM_ACTIVITY_DATE_INVALID_FORMAT = "PAYMENT_ITEM_ACTIVITY_DATE_INVALID_FORMAT";

	public static final String LOVCOMPANYCODE = "LOVCOMPANYCODE";

	public static final String INVOICE_ACCOUNT_NUM_KEY = "accountNum";

	public static final String INVOICE_NUM_KEY = "invoiceNum";

	public static final String INVOICE_POLICY_NUM_KEY = "policyNum";

	public static final String INVOICE_DATE_KEY = "invoiceDate";

	public static final String INVOICE_DUE_DATE_KEY = "dueDate";

	public static final String ACCOUNT_NUM_OR_POLICY_NUM_OR_INVOICE_NUM_MANDATORY = "ACCOUNT_NUM_OR_POLICY_NUM_OR_INVOICE_NUM_MANDATORY";

	public static final String INVOICE_DATE_INVALID = "INVOICE_DATE_INVALID";

	public static final String INVOICE_DUE_DATE_INVALID = "INVOICE_DUE_DATE_INVALID";

	public static final String FORMATER = "yyyy-MM-dd'T'HH:mm:ss";

	public static final String PAYMENT_ITEM_ID_INVALID = "PAYMENT_ITEM_ID_INVALID";

	public static final String PAYMENT_ITEM_ACTIVITY_AMOUNT_NULL = "PAYMENT_ITEM_ACTIVITY_AMOUNT_NULL";

	public static final String PAYMENT_ITEM_ACTIVITY_AMOUNT_INVALID = "PAYMENT_ITEM_ACTIVITY_AMOUNT_INVALID";

	public static final String yyyy_MM_dd_HH_mm_ss_FORMAT = "yyyy-MM-dd HH:mm:ss";

	public static final String TRANSACTION_PROCESS_IND_INVALID_REJECTION = "TRANSACTION_PROCESS_IND_INVALID_REJECTION";

	public static final String TRANSACTION_PROCESS_IND_INVALID = "TRANSACTION_PROCESS_IND_INVALID";

	public static final String REJECTED = "REJECTED";

	public static final String LOVEVENTCODE = "LOVEVENTCODE";

	public static final String PAYMENT_RECEIVED = "PAYMENT_RECEIVED";

	public static final String PAYMENT_ITEM_ACTIVITY_IND_DEFAULT = "PAYMENT_ITEM_ACTIVITY_IND_DEFAULT";

	public static final String INVOICE_ITEM_IND_DEFAULT = "INVOICE_ITEM_IND_DEFAULT";

	public static final String COMPANY_CODE_INVALID = "COMPANY_CODE_INVALID";

	public static final String SESSION_TOKEN_TYPE = "SESSION";

	public static final String SSO_TOKEN_TYPE = "SSO";

	public static final String STG_ACCOUNT_TYPE = "stg.serviceaccount.type";

	public static final String STG_ACCOUNT_BILLING_TOKENTYPE = "stg.serviceaccount.billing.tokentype";

	public static final String STG_ACCOUNT_TOKEN_TYPE = "stg.serviceaccount.token.type";

	public static final String STG_ACCOUNT_ENV = "stg.serviceaccount.env";

	public static final String STG_ACCOUNT_INACTIVE_TIMOUT = "stg.serviceaccount.token.inactive.timeout";

	public static final String STG_ACCOUNT_TIMOUT_CHECK = "stg.serviceaccount.token.timeout.check";

	public static final String MCC_ACCOUNT_TYPE = "mcc.serviceaccount.type";

	public static final String MCC_ACCOUNT_NAME = "mcc.serviceaccount.name";

	public static final String MCC_ACCOUNT_INACTIVE_TIMOUT = "mcc.serviceaccount.token.inactive.timeout";

	public static final String MCC_ACCOUNT_ACTIVE_TIMOUT = "mcc.serviceaccount.token.active.timeout";

	public static final String MCC_ACCOUNT_TOKEN_TYPE = "mcc.serviceaccount.token.type";

	public static final String MCC_ACCOUNT_TIMOUT_CHECK = "mcc.serviceaccount.token.timeout.check";

	public static final String MCC_ACCOUNT_PASSWORD_TIMEOUT = "mcc.serviceaccount.password.timeout";

	public static final String MCC_ACCOUNT_SAFE = "mcc.serviceaccount.safe";

	public static final String MCC_ACCOUNT_APPLICATION_NAME = "mcc.serviceaccount.applicationname";

	public static final String MCC_ACCOUNT_ADDRESS = "mcc.serviceaccount.address";

	public static final String LH_ACCOUNT_TYPE = "lh.serviceaccount.type";

	public static final String LH_ACCOUNT_NAME = "lh.serviceaccount.name";

	public static final String LH_ACCOUNT_INACTIVE_TIMOUT = "lh.serviceaccount.token.inactive.timeout";

	public static final String LH_ACCOUNT_ACTIVE_TIMOUT = "lh.serviceaccount.token.active.timeout";

	public static final String LH_ACCOUNT_TOKEN_TYPE = "lh.serviceaccount.token.type";

	public static final String LH_ACCOUNT_TIMOUT_CHECK = "lh.serviceaccount.token.timeout.check";

	public static final String LH_ACCOUNT_PASSWORD_TIMEOUT = "lh.serviceaccount.password.timeout";

	public static final String LH_ACCOUNT_SAFE = "lh.serviceaccount.safe";

	public static final String LH_ACCOUNT_APPLICATION_NAME = "lh.serviceaccount.applicationname";

	public static final String LH_ACCOUNT_ADDRESS = "lh.serviceaccount.address";

	public static final String CYBERARK_REQUEST_REASON = "Calling Downstream Systems";

	public static final String LOVSOURCESYSTEM = "LOVSOURCESYSTEM";

	public static final String STG = "STG";

	public static final String LH_EXCHG_SVC = "LH_EXCHG_SVC";

	public static final String LOVBILLTOPARTYROLE = "LOVBILLTOPARTYROLE";

	public static final String LOVINVOICECHANNEL = "LOVINVOICECHANNEL";

	public static final String LOVINVOICEDELIVERYMETHOD = "LOVINVOICEDELIVERYMETHOD";

	public static final String LOVINVOICEITEMPARTYTYPE = "LOVINVOICEITEMPARTYTYPE";

	public static final String LOVINVOICEITEMTYPE = "LOVINVOICEITEMTYPE";

	public static final String LOVINVOICETYPE = "LOVINVOICETYPE";

	public static final String MCC_EVENT_SYSTEM_ERROR = "MCC_EVENT_SYSTEM_ERROR";

	public static final String PUSH_PAYMENT_SYSTEM_ERROR = "PUSH_PAYMENT_SYSTEM_ERROR";

	public static final String PROCESSED = "PROCESSED";

	public static final String FROM_DATE_FUTURE = "FROM_DATE_FUTURE";

	public static final String TO_DATE_FUTURE = "TO_DATE_FUTURE";

	public static final String BATCH_CLIENT_ACCOUNT_TYPE = "batch.client.serviceaccount.type";

	public static final String BATCH_CLIENT_ACCOUNT_NAME = "batch.client.serviceaccount.name";

	public static final String BATCH_CLIENT_ACCOUNT_INACTIVE_TIMOUT = "batch.client.serviceaccount.token.inactive.timeout";

	public static final String BATCH_CLIENT_ACCOUNT_ACTIVE_TIMOUT = "batch.client.serviceaccount.token.active.timeout";

	public static final String BATCH_CLIENT_ACCOUNT_TOKEN_TYPE = "batch.client.serviceaccount.token.type";

	public static final String BATCH_CLIENT_ACCOUNT_TIMOUT_CHECK = "batch.client.serviceaccount.token.timeout.check";

	public static final String BATCH_CLIENT_ACCOUNT_PASSWORD_TIMEOUT = "batch.client.serviceaccount.password.timeout";

	public static final String BATCH_CLIENT_ACCOUNT_SAFE = "batch.client.serviceaccount.safe";

	public static final String BATCH_CLIENT_ACCOUNT_APPLICATION_NAME = "batch.client.serviceaccount.applicationname";

	public static final String BATCH_CLIENT_ACCOUNT_ADDRESS = "mcc.serviceaccount.address";

	public static final String UNKNOWN_TRANSACTION_TYPE_CODE = "UNKNOWN_TRANSACTION_TYPE_CODE";

	public static final String TRANSACTION_AMOUNT_SUM_NOT_MATCH = "TRANSACTION_AMOUNT_SUM_NOT_MATCH";

	public static final String TRANSACTION_AMOUNT_GREATER = "TRANSACTION_AMOUNT_GREATER";

	public static final String TRANSACTION_AMOUNT_INVALID = "TRANSACTION_AMOUNT_INVALID";

	public static final String REFUTED_CHARGE = "REFUTED_CHARGE";

	public static final String REFUTED_CHARGE_REVERSAL = "REFUTED_CHARGE_REVERSAL";

	public static final String CHARGEBACK_REVERSAL_AMOUNT_GREATER = "CHARGEBACK_REVERSAL_AMOUNT_GREATER";

	public static final String HUB_CHGBCK = "HUB_CHGBCK";

	public static final String TRANSACTION_AMOUNT_ORIGINAL_AMOUNT_NOT_MATCH = "TRANSACTION_AMOUNT_ORIGINAL_AMOUNT_NOT_MATCH";

	public static final String CURRENCY_CODE_INVALID = "CURRENCY_CODE_INVALID";

	public static final String PAYMENT_CHANNEL_INVALID_CODE = "PAYMENT_CHANNEL_INVALID_CODE";

	public static final String POSTED_BY_TYPE_INVALID_CODE = "POSTED_BY_TYPE_INVALID_CODE";

	public static final String ORIGINAL_PAYMENT_NOT_FOUND = "ORIGINAL_PAYMENT_NOT_FOUND";

	public static final String HUB_GENERATED = "HUB_GENERATED";

	public static final String NULL = "NULL";

	public static final String PARENT_ERROR_ID = "parentErrorId";

	public static final String PAYMENT_METHOD_INVALID_CODE = "PAYMENT_METHOD_INVALID_CODE";

	public static final String PAYMENT_ALREADY_REVERSED = "PAYMENT_ALREADY_REVERSED";

	public static final String REFUTED_CHARGE_RECEIVED = "REFUTED_CHARGE_RECEIVED";

	public static final String REFUTED_CHARGE_REVERSAL_RECEIVED = "REFUTED_CHARGE_REVERSAL_RECEIVED";

	public static final String REVERSAL_RECEIVED = "REVERSAL_RECEIVED";

	public static final String REJECTION_RECEIVED = "REJECTION_RECEIVED";

	public static final String TRANSACTION_TYPE = "transactionType";

	public static final String EVENT_PAYMENT_RECEIVED = "EVENT_PAYMENT_RECEIVED";

	public static final String AUTOPAY_ACCOUNT_NUM = "accountNumber";

	public static final String AUTOPAY_ID = "autoPayId";

	public static final String AUTOPAY_POLICY_NUM = "policyNumber";

	public static final String AUTOPAY_PROCESSOR_CLIENT_ID = "processorClientId";

	public static final String AUTOPAY_ESIGNATURE = "esignatureId";

	public static final String AUTOPAY_STATUS = "statusCode";

	public static final String STATUS_ACTIVE = "ACTIVE";

	public static final String STATUS_PENDING = "PENDING";

	public static final String STATUS_CANCELLED = "CANCELLED";

	public static final String STATUS_EXPIRED = "EXPIRED";

	public static final String AUTOPAY_SETUP_EXISTS = "AUTOPAY_SETUP_EXISTS";

	public static final String ENTRY_DATE_INVALID = "ENTRY_DATE_INVALID";

	public static final String REFERENCE_ID_INVALID = "REFERENCE_ID_INVALID";

	public static final String AUTOPAY_STATUS_PENDING = "AUTOPAY_STATUS_PENDING";

	public static final String INVOICE_NOT_FOUND = "INVOICE_NOT_FOUND";

	public static final String ACCOUNT_NUM_MANDATORY = "ACCOUNT_NUM_MANDATORY";

	public static final String DEFAULT_CURRENCY = "USD";

	public static final String PAYMENT_ACCOUNT_TYPE_INVALID_CODE = "PAYMENT_ACCOUNT_TYPE_INVALID_CODE";

	public static final String REGEX = "^-?\\d*";

	public static final String MANDATORY_PAYMENT_ACCOUNT_TOKEN_INVALID = "MANDATORY_PAYMENT_ACCOUNT_TOKEN_INVALID";

	public static final String MANDATORY_PAYMENT_ACCOUNT_NUMBER_INVALID = "MANDATORY_PAYMENT_ACCOUNT_NUMBER_INVALID";

	public static final String POSTED_BY_INVALID = "POSTED_BY_INVALID";

	public static final String POSTED_BY_AGENT = "AGENT";

	public static final String POSTED_BY_AGENT_STAFF = "AGENT_STAFF";

	public static final String POSTED_BY_CSR = "CSR";

	public static final String PAYMENT_ACCOUNT_TOKEN_INVALID = "PAYMENT_ACCOUNT_TOKEN_INVALID";

	public static final String PAYMENT_ACCOUNT_NUMBER_INVALID = "PAYMENT_ACCOUNT_NUMBER_INVALID";

	public static final String INVOICE_TYPE_PREMIUM_NOTICE = "PREMIUM_NOTICE";

	public static final String INVOICE_DUE_DATE = "dueDate";

	public static final String NOT_NULL = "NOT NULL";

	public static final String INOVICE_PAYMENT_DRAW_PROCESSED_DATE = "invoicePaymentDrawInfo.processedDate";

	public static final String IN = "IN";

	public static final String AUTOMATIC_PAYMENT = "AUTOMATIC_PAYMENT";

	public static final String CHECK = "CHECK";

	public static final String UPDATE_PAYMENT_METHOD = "UPDATE_PAYMENT_METHOD";

	public static final String BILLING_ENDORSEMENT_SYSTEM_ERROR = "BILLING_ENDORSEMENT_SYSTEM_ERROR";

	public static final String ACCOUNT_SUMMARY = "ACCOUNT_SUMMARY";

	public static final String POLICY_LIST = "POLICY_LIST";

	public static final String UPDATE_PAYMENT_PLAN = "UPDATE_PAYMENT_PLAN";

	public static final String BILLING_INQUIRY_SYSTEM_ERROR = "BILLING_INQUIRY_SYSTEM_ERROR";

	public static final String FAILED = "FAILED";

	public static final String NOT_PROCESSED = "NOT_PROCESSED";

	public static final String ACCOUNT = "ACCOUNT";

	public static final String CHANGE_PAYMENT_METHOD = "CHANGE_PAYMENT_METHOD";

	public static final String BILLING_ENDORSEMENT = "BillingEndorsement";

	public static final String LOVCANCELLATIONREASONCODE = "LOVCANCELLATIONREASONCODE";

	public static final String AUTOPAY_ID_OR_POLICYNUM_OR_ACCOUNTNUM_REQUIRED = "AUTOPAY_ID_OR_POLICYNUM_OR_ACCOUNTNUM_REQUIRED";

	public static final String REQUEST_DATE_INVALID = "REQUEST_DATE_INVALID";

	public static final String AGENT_NUM_AUTOPAY = "AGENT_NUM_AUTOPAY";

	public static final String AUTO_PAY_NOT_FOUND = "AUTO_PAY_NOT_FOUND";

	public static final String INACTIVE_AUTO_PAY = "INACTIVE_AUTO_PAY";

	public static final String ISSUED = "ISSUED";

	public static final String UNDERNOTICE = "UNDERNOTICE";

	public static final String ENTRY_DATE_DEFAULT = "ENTRY_DATE_DEFAULT";

	public static final String CANCEL_REASON_MORTGAGEE_BILLED = "MORTGAGEE_BILLED";

	public static final String CANCEL_REASON_INACTIVE_POLICIES = "INACTIVE_POLICIES";

	public static final String AUTO_PAY_CANCELLED = "AUTO_PAY_CANCELLED";

	public static final String CANCELLATION_REASON_CODE_INVALID = "CANCELLATION_REASON_CODE_INVALID";

	public static final String AUTOPAYID = "AutoPayId";

	public static final String UNIQUE_ID_TYPE = "uniqueIdType";

	public static final String BILLING_ACCOUNT_INQUIRY = "BillingAccountInquiry";

	public static final String BILLING_POLICY_INQUIRY = "BillingPolicyInquiry";

	public static final String PROCESSED_DATE = "processedDate";

	public static final String ERROR_RETRY_ID = "ErrorRetryId";

	public static final String EFT = "EFT";

	public static final String POLICY = "POLICY";

	public static final String MANDATORY_FIELDS = "MANDATORY_FIELDS";

	public static final String PAYMENT_ITEM_ID = "PaymentItemId";

	public static final String AUTOMATIC_PAYMENT_PAY_PLAN_CHG = "Automatic Payment Pay Plan Chg";

	public static final String RECEIVABLE_HUB = "RECEIVABLE_HUB";

	public static final String HUB_PAY_PLAN_REQUEST = "HUB_PAY_PLAN_REQUEST";

	public static final String REGION_CODE = "03";

	public static final String CANNOT_UPDATE_AUTO_PAY = "CANNOT_UPDATE_AUTO_PAY";

	public static final String UPDATE_PAY_PLAN = "UpdatePayPlan";

	public static final String POLICY_NUMBER = "PolicyNumber";

	public static final String ERROR_MESSAGE = "errorMessage";

	public static final String SIEBEL_SYSTEM_ERROR = "SIEBEL_SYSTEM_ERROR";

	public static final String LOVSIEBELACTIVITYTYPE = "LOVSIEBELACTIVITYTYPE";

	public static final String LOVSIEBELACTIVITYREASON = "LOVSIEBELACTIVITYREASON";

	public static final String DEFAULT_EXPIRATION_DATE = "9999-12-31";

	public static final int MAX_POLICYNUM = 50;

	public static final int MAX_ACCOUNTNUM = 20;

	public static final int MAX_PAYMENT_ACCOUNT_TOKEN = 30;

	public static final int MAX_PAYMENT_ACCOUNTNUM = 30;

	public static final int MAX_AGENTNUM = 30;

	public static final int MAX_POSTEDBY = 30;

	public static final int MAX_REFERENCEID = 30;

	public static final String TEST_REASON = "TEST_REASON";

	public static final String ACCUMULATED_SOURCE_DATA = "Test accumulatedSourceData";

	public static final String APPLICABLE_POLICY_NOT_FOUND = "APPLICABLE_POLICY_NOT_FOUND";

	public static final String POLICY_DETAILS_NOT_FOUND = "POLICY_DETAILS_NOT_FOUND";

	public static final int PAYMENT_PLAN_MIN_VALUE = 1;

	public static final int PAYMENT_PLAN_MAX_VALUE = 24;

	public static final String MAJESCO_BILLING_INQUIRY = "MAJESCO_BILLING_INQUIRY";

	public static final String AUTOMATIC_PAYMENT_SETUP = "AUTOMATIC_PAYMENT_SETUP";

	public static final String AUTOMATIC_PAYMENT_CANCELLED = "AUTOMATIC_PAYMENT_CANCELLED";

	public static final String ACCOUNT_NUMBER = "Account Number";

	public static final String POLICY_NUM = "Policy Number";

	public static final String EC = "EC";

	public static final String MC = "MC";

	public static final String REPORT_DATE = "Report Date";

	public static final String PAY_PLAN = "Pay Plan";

	public static final String COMMON = "COMMON";

	public static final String PAYMENT_METHOD_EFT = "PAYMENT_METHOD_EFT";

	public static final String MONTHLY_DIRECT_PAYMENT_PLAN = "MONTHLY_DIRECT_PAYMENT_PLAN";

	public static final String EPAY_ACCOUNT_TYPE = "epay.serviceaccount.type";

	public static final String EPAY_ACCOUNT_NAME = "epay.serviceaccount.name";

	public static final String EPAY_ACCOUNT_INACTIVE_TIMOUT = "epay.serviceaccount.token.inactive.timeout";

	public static final String EPAY_ACCOUNT_ACTIVE_TIMOUT = "epay.serviceaccount.token.active.timeout";

	public static final String EPAY_ACCOUNT_TOKEN_TYPE = "epay.serviceaccount.token.type";

	public static final String EPAY_ACCOUNT_TIMOUT_CHECK = "epay.serviceaccount.token.timeout.check";

	public static final String EPAY_ACCOUNT_PASSWORD_TIMEOUT = "epay.serviceaccount.password.timeout";

	public static final String EPAY_ACCOUNT_SAFE = "epay.serviceaccount.safe";

	public static final String EPAY_ACCOUNT_APPLICATION_NAME = "epay.serviceaccount.applicationname";

	public static final String EPAY_ACCOUNT_ADDRESS = "epay.serviceaccount.address";

	public static final String MAKESINGLEPAYMENT_SYSTEM_ERROR = "MAKESINGLEPAYMENT_SYSTEM_ERROR";

	public static final String PAYMENT_ID = "PaymentId";

	public static final String MAKE_SINGLE_PAYMENT = "MAKE_SINGLE_PAYMENT";

	public static final String BILLING_ACCOUNT_INFO = "BillingAccountInfo";

	public static final String INVOICE_TYPE = "invoiceType";

	public static final String MCC_EVENT = "MccEvent";

	public static final String EVENT = "event";

	public static final String MAKESINGLEPAYMENT = "MakeSinglePayment";

	public static final String HUB_PAY = "HUB-PAY";

	public static final String WEB = "WEB";

	public static final String BILLING_INQUIRY = "BillingInquiry";

	public static final String RESULT_LIST_CURTAILED_UI = "RESULT_LIST_CURTAILED_UI";

	public static final String RECEIVABLE_HUB_ERROR = "RECEIVABLE_HUB_ERROR";

	public static final String AUTO_PAY_EXPIRED = "AUTO_PAY_EXPIRED";

	public static final String PW_SOURCE_SYSTEM = "PW";

	public static final String AUTOPAY_STATUS_UPDATE_JOB = "autoPayStatusUpdateJob";

	public static final String SCHEDULED_DRAW_DATE_PAST = "SCHEDULED_DRAW_DATE_PAST";

	public static final Object GETSINGLEPAYMENT = "GetSinglePayment";

	public static final String S024 = "S024";

	public static final String CONFIRMATION_NUM_OR_PAYMENT_REF_ID_MANDATORY = "CONFIRMATION_NUM_OR_PAYMENT_REF_ID_MANDATORY";

	public static final String GETSINGLEPAYMENT_ERROR_MESSAGE = "GETSINGLEPAYMENT_ERROR_MESSAGE";

	public static final String GETSINGLEPAYMENT_NO_RESPONSE = "No Response received from GetSinglePaymentAPI";

	public static final String LOVPOSTEDBY = "LOVPOSTEDBY";

	public static final String HUB_AUTO_PAY = "HUB_AUTO_PAY";

	public static final String PREMIUM = "PREMIUM";

	public static final String D03 = "D03";

	public static final String R358 = "R358";

	public static final String R387 = "R387";

	public static final String AUTOPAY_NOT_FOUND_CANCELLED_EXPIRED = "AUTOPAY_NOT_FOUND_CANCELLED_EXPIRED";

	public static final String CANCEL_REASON_CANCELLED_BY_USER = "CANCELLED_BY_USER";

	public static final String LOVPAYMENTUPDATETYPE = "LOVPAYMENTUPDATETYPE";

	public static final String SCHEDULED_PAY_UPDATE = "SCHEDULED_PAY_UPDATE";

	public static final String UNEXPECTED_RESULT_CODE = "Unexpected resultCode received from getSinglePayment :";

	public static final String SKIPPED_PAY_HOLD = "SKIPPED_PAY_HOLD";

	public static final String BILLING_ACCOUNT_INFO_ERROR_MESSAGE = "BILLING_ACCOUNT_INFO_ERROR_MESSAGE";

	public static final String UPDATE_TYPE_CODE_INVALID = "UPDATE_TYPE_CODE_INVALID";

	public static final String RTPC_REMITTANCE_FILE_UPDATE = "RTPC_REMITTANCE_FILE_UPDATE";

	public static final String PAYMENT_REFERENCE_ID_INVALID = "PAYMENT_REFERENCE_ID_INVALID";

	public static final String PAYMENT_REFERENCE_ID_INVALID_MANDATORY = "PAYMENT_REFERENCE_ID_INVALID_MANDATORY";

	public static final String PAYMENT_ALREADY_UPDATED = "PAYMENT_ALREADY_UPDATED";

	public static final String SCHEDULED = "SCHEDULED";

	public static final String PAYMENT_SENT_TO_PROCESSOR = "PAYMENT_SENT_TO_PROCESSOR";

	public static final String SKIPPED_PAY_ZERO = "SKIPPED_PAY_ZERO";

	public static final String SKIPPED_PAY_OVER_LIMIT = "SKIPPED_PAY_OVER_LIMIT";

	public static final String PAYMENT_KEY = "Payment";

	public static final String PAYMENT_RETRY_SYSTEM_ERROR = "PAYMENT_RETRY_SYSTEM_ERROR";

	public static final String PEND = "PEND";

	public static final String SENT = "SENT";

	public static final String PAYMENT_NOT_FOUND = "PAYMENT_NOT_FOUND";

	public static final String R34 = "R34";

	public static final String H02 = "H02";

	public static final String UNIQUE_ID = "uniqueId";

	public static final String REQUEST_LOG_ID = "requestLogId";

	public static final String RESPONSE_LOG_ID = "responseLogId";

	public static final String DROP = "DROP";

	public static final String R048 = "R048";

	public static final String CREDIT_CARD = "CREDIT_CARD";

	public static final String DEBIT_CARD = "DEBIT_CARD";

	public static final String CC = "CC";

	public static final String ATM = "ATM";

	public static final String BUSINESS_CHECKING = "BUSINESS_CHECKING";

	public static final String BUSINESS_SAVINGS = "BUSINESS_SAVINGS";

	public static final String PERSONAL_CHECKING = "PERSONAL_CHECKING";

	public static final String PERSONAL_SAVINGS = "PERSONAL_SAVINGS";

	public static final String C = "C";

	public static final String S = "S";

	public static final String B = "B";

	public static final String PREVIOUS_EXPIRATION_DATE_QUERY = "SELECT TOP 1 EXPIRATION_DATE FROM AUTO_PAY_DETAIL FOR SYSTEM_TIME ALL WHERE AUTO_PAY_ID = ? AND CANCELLATION_REASON_CD IS NULL ORDER BY VALID_FROM_TS DESC";

	public static final String LOVPAYMENTAMOUNTTYPECODE = "LOVPAYMENTAMOUNTTYPECODE";

	public static final String ONE_TIME_SCHEDULED = "ONE_TIME_SCHEDULED";

	public static final String PAYMENT_AMOUNT_TYPE_INVALID = "PAYMENT_AMOUNT_TYPE_INVALID";

	public static final String PAYMENT_DATE_INVALID = "PAYMENT_DATE_INVALID";

	public static final String PAYMENT_DATE_INVALID_SCHEDULE_PAY = "PAYMENT_DATE_INVALID_SCHEDULE_PAY";

	public static final String PAYMENT_ACCOUNT_TOKEN_INVALID_SCHEDULE_PAY = "PAYMENT_ACCOUNT_TOKEN_INVALID_SCHEDULE_PAY";

	public static final String PROCESSOR_CLIENT_ID_INVALID = "PROCESSOR_CLIENT_ID_INVALID";

	public static final String TRANSACTION_TYPE_CODE_INVALID_SCHEDULE_PAY = "TRANSACTION_TYPE_CODE_INVALID_SCHEDULE_PAY";

	public static final String PAYMENT_CHANNEL_PAYMENT_ID_INVALID_SCHEDULE_PAY = "PAYMENT_CHANNEL_PAYMENT_ID_INVALID_SCHEDULE_PAY";

	public static final String TRANSACTION_PROCESS_IND_INVALID_SCHEDULE_PAY = "TRANSACTION_PROCESS_IND_INVALID_SCHEDULE_PAY";

	public static final String SCHEDULED_PAYMENT_REQUEST_RECEIVED = "SCHEDULED_PAYMENT_REQUEST_RECEIVED";

	public static final String SCHEDULED_PAYMENT_SETUP = "SCHEDULED_PAYMENT_SETUP";

	public static final String MANDATORY_PROCESSOR_CLIENT_ID_INVALID = "MANDATORY_PROCESSOR_CLIENT_ID_INVALID";

	public static final String PAYMENT_AMOUNT_TYPE_INVALID_MANDATORY = "PAYMENT_AMOUNT_TYPE_INVALID_MANDATORY";

	public static final String PAYMENT_ENTRY_DATE_NULL = "PAYMENT_ENTRY_DATE_NULL";

	public static final String PAYMENT_ENTRY_DATE_INVALID_FORMAT = "PAYMENT_ENTRY_DATE_INVALID_FORMAT";

	public static final String PAYMENT_ENTRY_DATE_FUTURE = "PAYMENT_ENTRY_DATE_FUTURE";

	public static final String PAYMENT_DATE_NULL = "PAYMENT_DATE_NULL";

	public static final String PAYMENT_DATE_INVALID_FORMAT = "PAYMENT_DATE_INVALID_FORMAT";

	public static final String PAYMENT_PROCESS_DATE_NULL = "PAYMENT_PROCESS_DATE_NULL";

	public static final String PAYMENT_PROCESS_DATE_INVALID_FORMAT = "PAYMENT_PROCESS_DATE_INVALID_FORMAT";

	public static final String PAYMENT_PROCESS_DATE_FUTURE = "PAYMENT_PROCESS_DATE_FUTURE";

	public static final String PAYMENT_ID_INVALID = "PAYMENT_ID_INVALID";

	public static final String PAYMENT_ID_INVALID_SCHEDULED_PAY = "PAYMENT_ID_INVALID_SCHEDULED_PAY";

	public static final String PAYMENT_INVALID = "PAYMENT_INVALID";

	public static final String SCHEDULED_PAYMENT_CANCELLED = "SCHEDULED_PAYMENT_CANCELLED";

	public static final String SCHEDULED_PAY_BATCH = "SCHEDULED_PAY_BATCH";

	public static final String RUNNING = "RUNNING";

	public static final String CANNOT_PROCESS_CANCELLATION = "CANNOT_PROCESS_CANCELLATION";

	public static final String AUTO_PAY_BATCH = "AUTO_PAY_BATCH";

	public static final String VALID_PAYMENTS_ONLY_DEFAULT = "VALID_PAYMENTS_ONLY_DEFAULT";

	public static final String PROCESSOR_CLIENT_ID_KEY = "processorClientId";

	public static final String PAYMENT_STATUS_CD_KEY = "paymentStatusCode";

	public static final String NOTES_INVALID = "NOTES_INVALID";

	public static final String PAYMENT_ITEM_COUNT_INVALID = "PAYMENT_ITEM_COUNT_INVALID";

	public static final String BATCH_NUMBER_INVALID = "BATCH_NUMBER_INVALID";

	public static final String PAYMENT_CHANNEL_PAYMENT_ID_INVALID_SCHEDULED_PAY = "PAYMENT_CHANNEL_PAYMENT_ID_INVALID_SCHEDULED_PAY";

	public static final String TRANSACTION_TYPE_REASON_CODE_INVALID_SCHEDULED_PAY = "TRANSACTION_TYPE_REASON_CODE_INVALID_SCHEDULED_PAY";

	public static final String EXCHANGE_1035_INDICATOR_INVALID = "EXCHANGE_1035_INDICATOR_INVALID";

	public static final String EXCHANGE_1035_REFERENCEID_INVALID = "EXCHANGE_1035_REFERENCEID_INVALID";

	public static final String SCHEDULED_PAY_UPDATE_INVALID = "SCHEDULED_PAY_UPDATE_INVALID";

	public static final String CANNOT_PROCESS_UPDATE = "CANNOT_PROCESS_UPDATE";

	public static final String H03 = "H03";

	public static final String USD = "USD";

	public static final String SCHEDULED_PAYMENT_UPDATED = "SCHEDULED_PAYMENT_UPDATED";

	public static final String PAYMENT_ALREADY_PROCESSED = "PAYMENT_ALREADY_PROCESSED";

	public static final String H06 = "H06";

	public static final String H04 = "H04";

	public static final int MAX_NOTES = 1000;

	public static final String H05 = "H05";

	public static final int MAX_PAYMENT_ID = 30;

	public static final String FIXED = "FIXED";

	public static final String ACCOUNT_BALANCE = "ACCOUNT_BALANCE";

	public static final String CURRENT_DUE = "CURRENT_DUE";

	public static final String SKIPPED_PAY_INACTIVE_POLICIES = "SKIPPED_PAY_INACTIVE_POLICIES";

	public static final String PAYMENT_AMOUNT_FIXED = "FIXED";

	public static final String ACH = "ACH";

	public static final String VIDB = "VIDB";

	public static final String MCDB = "MCDB";

	public static final int MAX_TRANSACTION_TYPE_CODE = 50;

	public static final int MAX_PAYMENT_CHANNEL_PAYMENT_ID = 30;

	public static final int MAX_PAYMENT_ITEM_COUNT = 4;

	public static final int MAX_PROCESSOR_CLIENT_ID = 50;

	public static final int MAX_EXCHANGE_1035_REFERENCEID = 30;

	public static final int MAX_INVOICENUM = 30;

	public static final String BANK_ACCOUNT = "BANK_ACCOUNT";

	public static final String MAIL = "MAIL";

	public static final String WIP_ACCOUNT_TYPE = "wip.serviceaccount.type";

	public static final String WIP_ACCOUNT_NAME = "wip.serviceaccount.name";

	public static final String WIP_ACCOUNT_INACTIVE_TIMOUT = "wip.serviceaccount.token.inactive.timeout";

	public static final String WIP_ACCOUNT_ACTIVE_TIMOUT = "wip.serviceaccount.token.active.timeout";

	public static final String WIP_ACCOUNT_TOKEN_TYPE = "wip.serviceaccount.token.type";

	public static final String WIP_ACCOUNT_TIMOUT_CHECK = "wip.serviceaccount.token.timeout.check";

	public static final String WIP_ACCOUNT_PASSWORD_TIMEOUT = "wip.serviceaccount.password.timeout";

	public static final String WIP_ACCOUNT_SAFE = "wip.serviceaccount.safe";

	public static final String WIP_ACCOUNT_APPLICATION_NAME = "wip.serviceaccount.applicationname";

	public static final String WIP_ACCOUNT_ADDRESS = "wip.serviceaccount.address";

	public static final String EXPIRE_ESIGNATURE = "EXPIRE_ESIGNATURE";

	public static final String EXPIRE_ESIGNATURE_ERROR = "EXPIRE_ESIGNATURE_ERROR";

	public static final String EXPIRE_ESIGNATURE_API = "ExpireESignature";

	public static final String WIP_REQUEST_SOURCE = "ReceivableHUB";

	public static final String ERROR_RETRY_ID_KEY = "errorRetryId";

	public static final String TRANSACTION_ID_KEY = "transactionId";

	public static final String WIP_ACTIVITY_MODEL = "wipActivityModel";

	public static final String E_SIGNATURE_ID = "ESignatureId";

	public static final String EXPIRE_ESIGNATURE_NO_RESPONSE = "EXPIRE_ESIGNATURE_NO_RESPONSE";

	public static final String SCHEDULED_PAY_UPDATE_STATUS_INVALID = "SCHEDULED_PAY_UPDATE_STATUS_INVALID";

	public static final String SCHEDULED_PAY_UPDATE_TYPE_INVALID = "SCHEDULED_PAY_UPDATE_TYPE_INVALID";

	public static final String AUTO_PAY = "AUTO_PAY";

	public static final String REQUEST_DATE_KEY = "requestDate";

	public static final String MAKE_SINGLE_PAYMENT_MODEL = "makeSinglePaymentModel";

	public static final String GET_SINGLE_PAYMENT_MODEL = "getSinglePaymentModel";

	public static final String MAKE_SINGLEPAYMENT_NO_RESPONSE = "No Response received from MakeSinglePaymentAPI";

	public static final String NOT_IN = "NOT_IN";

	public static final String T = "T";

	public static final String PAYMENT_METHOD_UPDATE_FAILURE = "Payment Method Update Failure";

	public static final String UNEXPECTED_ACTIVITY_TYPE = "Unexpected activity type received";

	public static final String BILLING_ACCOUNT_NUMBER = "Billing Account Number";

	public static final Object PAYMENT_METHOD = "Payment Method";

	public static final Object ENTRY_DATE = "Entry Date";

	public static final String HUB_PAYMENT_METHOD_FAILURE_REQUEST = "HUB_PAYMENT_METHOD_FAILURE_REQUEST";

	public static final String BILLING_UPDATE_PAYMENT_METHOD_FAILED = "BILLING_UPDATE_PAYMENT_METHOD_FAILED";

	public static final String PAYMENT_METHOD_UPDATE_FAILURE_TRANSACTION_TYPE = "PAYMENT_METHOD_UPDATE_FAILURE";

	public static final String K = "K";

	public static final String SIEBEL_PAYMENT_METHOD_FAILURE = "SiebelPaymentMethodFailure";

	public static final String IMAGING_ACCOUNT_TYPE = "imaging.serviceaccount.type";

	public static final String IMAGING_ACCOUNT_NAME = "imaging.serviceaccount.name";

	public static final String IMAGING_ACCOUNT_TOKEN_TYPE = "imaging.serviceaccount.token.type";

	public static final String IMAGING_ACCOUNT_INACTIVE_TIMOUT = "imaging.serviceaccount.token.inactive.timeout";

	public static final String IMAGING_ACCOUNT_TIMOUT_CHECK = "imaging.serviceaccount.token.timeout.check";

	public static final String IMAGING_ACCOUNT_ACTIVE_TIMOUT = "imaging.serviceaccount.token.active.timeout";

	public static final String IMAGING_ACCOUNT_PASSWORD_TIMEOUT = "imaging.serviceaccount.password.timeout";

	public static final String IMAGING_ACCOUNT_SAFE = "imaging.serviceaccount.safe";

	public static final String IMAGING_ACCOUNT_APPLICATION_NAME = "imaging.serviceaccount.applicationname";

	public static final String IMAGING_ACCOUNT_ADDRESS = "imaging.serviceaccount.address";

	public static final String ESIGNED_DOC_COPY_SYSTEM_ERROR = "ESIGNED_DOC_COPY_SYSTEM_ERROR";

	public static final String ESIGNED_DOC_COPY = "ESIGNED_DOC_COPY";

	public static final String UNKNOWN = "unknown";

	public static final String INVALID_ACT_NUM = "Invalid Account No. Please enter correct Account No.";

	public static final String SMB_PREFIX = "smb:";

	public static final String ACCOUNT_NUM = "AccountNum";

	public static final String INVALID_ID = "INVALID_ID";

}