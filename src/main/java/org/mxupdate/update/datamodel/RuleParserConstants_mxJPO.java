/* Generated By:JavaCC: Do not edit this line. RuleParserConstants.java */
package org.mxupdate.update.datamodel;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
interface RuleParserConstants_mxJPO {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int DESCRIPTION = 5;
  /** RegularExpression Id. */
  int HIDDEN_TRUE = 6;
  /** RegularExpression Id. */
  int HIDDEN_FALSE = 7;
  /** RegularExpression Id. */
  int ENFORCERESERVEACCESS_TRUE = 8;
  /** RegularExpression Id. */
  int ENFORCERESERVEACCESS_FALSE = 9;
  /** RegularExpression Id. */
  int STRING = 10;
  /** RegularExpression Id. */
  int SINGLE = 11;
  /** RegularExpression Id. */
  int MULTILINESTRING = 12;
  /** RegularExpression Id. */
  int MULTILINESINGLE = 13;
  /** RegularExpression Id. */
  int REVOKE = 14;
  /** RegularExpression Id. */
  int LOGIN = 15;
  /** RegularExpression Id. */
  int OWNER = 16;
  /** RegularExpression Id. */
  int PUBLIC = 17;
  /** RegularExpression Id. */
  int USER = 18;
  /** RegularExpression Id. */
  int KEY = 19;
  /** RegularExpression Id. */
  int ACCESS = 20;
  /** RegularExpression Id. */
  int ACCESS_STRING = 21;
  /** RegularExpression Id. */
  int ACCESS_SINGLE_STRING = 22;
  /** RegularExpression Id. */
  int FILTER = 23;
  /** RegularExpression Id. */
  int LOCALFILTER = 24;
  /** RegularExpression Id. */
  int ORGANIZATION_ANY = 25;
  /** RegularExpression Id. */
  int ORGANIZATION_SINGLE = 26;
  /** RegularExpression Id. */
  int ORGANIZATION_ANCESTOR = 27;
  /** RegularExpression Id. */
  int ORGANIZATION_DESCENDANT = 28;
  /** RegularExpression Id. */
  int ORGANIZATION_RELATED = 29;
  /** RegularExpression Id. */
  int PROJECT_ANY = 30;
  /** RegularExpression Id. */
  int PROJECT_SINGLE = 31;
  /** RegularExpression Id. */
  int PROJECT_ANCESTOR = 32;
  /** RegularExpression Id. */
  int PROJECT_DESCENDANT = 33;
  /** RegularExpression Id. */
  int PROJECT_RELATED = 34;
  /** RegularExpression Id. */
  int OWNER_ANY = 35;
  /** RegularExpression Id. */
  int OWNER_CONTEXT = 36;
  /** RegularExpression Id. */
  int RESERVE_ANY = 37;
  /** RegularExpression Id. */
  int RESERVE_CONTEXT = 38;
  /** RegularExpression Id. */
  int RESERVE_NO = 39;
  /** RegularExpression Id. */
  int RESERVE_INCLUSIVE = 40;
  /** RegularExpression Id. */
  int MATURITY_ANY = 41;
  /** RegularExpression Id. */
  int MATURITY_NO = 42;
  /** RegularExpression Id. */
  int MATURITY_PUBLIC = 43;
  /** RegularExpression Id. */
  int MATURITY_PROTECTED = 44;
  /** RegularExpression Id. */
  int MATURITY_PRIVATE = 45;
  /** RegularExpression Id. */
  int MATURITY_NOTPRIVATE = 46;
  /** RegularExpression Id. */
  int MATURITY_PPP = 47;
  /** RegularExpression Id. */
  int CATEGORY_ANY = 48;
  /** RegularExpression Id. */
  int CATEGORY_OEM = 49;
  /** RegularExpression Id. */
  int CATEGORY_GOLDPARTNER = 50;
  /** RegularExpression Id. */
  int CATEGORY_PARTNER = 51;
  /** RegularExpression Id. */
  int CATEGORY_SUPPLIER = 52;
  /** RegularExpression Id. */
  int CATEGORY_CUSTOMER = 53;
  /** RegularExpression Id. */
  int CATEGORY_CONTRACTOR = 54;
  /** RegularExpression Id. */
  int PROPERTY = 55;
  /** RegularExpression Id. */
  int PROPERTYTO = 56;
  /** RegularExpression Id. */
  int PROPERTYVAL = 57;
  /** RegularExpression Id. */
  int ADMINTYPE_STRING = 58;
  /** RegularExpression Id. */
  int ADMINTYPE_SINGLE = 59;

  /** Lexical state. */
  int ADMINREF_EXPECTED = 0;
  /** Lexical state. */
  int ACCESS_STRING_EXPECTED = 1;
  /** Lexical state. */
  int ACCESS_EXPECTED = 2;
  /** Lexical state. */
  int MULTILINESTRING_EXPECTED = 3;
  /** Lexical state. */
  int STRING_EXPECTED = 4;
  /** Lexical state. */
  int DEFAULT = 5;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "<token of kind 4>",
    "\"description\"",
    "\"hidden\"",
    "\"!hidden\"",
    "\"enforcereserveaccess\"",
    "\"!enforcereserveaccess\"",
    "<STRING>",
    "<SINGLE>",
    "<MULTILINESTRING>",
    "<MULTILINESINGLE>",
    "\"revoke\"",
    "\"login\"",
    "\"owner\"",
    "\"public\"",
    "\"user\"",
    "\"key\"",
    "<ACCESS>",
    "<ACCESS_STRING>",
    "<ACCESS_SINGLE_STRING>",
    "\"filter\"",
    "\"localfilter\"",
    "<ORGANIZATION_ANY>",
    "<ORGANIZATION_SINGLE>",
    "<ORGANIZATION_ANCESTOR>",
    "<ORGANIZATION_DESCENDANT>",
    "<ORGANIZATION_RELATED>",
    "<PROJECT_ANY>",
    "<PROJECT_SINGLE>",
    "<PROJECT_ANCESTOR>",
    "<PROJECT_DESCENDANT>",
    "<PROJECT_RELATED>",
    "<OWNER_ANY>",
    "<OWNER_CONTEXT>",
    "<RESERVE_ANY>",
    "<RESERVE_CONTEXT>",
    "<RESERVE_NO>",
    "<RESERVE_INCLUSIVE>",
    "<MATURITY_ANY>",
    "<MATURITY_NO>",
    "<MATURITY_PUBLIC>",
    "<MATURITY_PROTECTED>",
    "<MATURITY_PRIVATE>",
    "<MATURITY_NOTPRIVATE>",
    "<MATURITY_PPP>",
    "<CATEGORY_ANY>",
    "<CATEGORY_OEM>",
    "<CATEGORY_GOLDPARTNER>",
    "<CATEGORY_PARTNER>",
    "<CATEGORY_SUPPLIER>",
    "<CATEGORY_CUSTOMER>",
    "<CATEGORY_CONTRACTOR>",
    "\"property\"",
    "\"to\"",
    "\"value\"",
    "<ADMINTYPE_STRING>",
    "<ADMINTYPE_SINGLE>",
  };

}