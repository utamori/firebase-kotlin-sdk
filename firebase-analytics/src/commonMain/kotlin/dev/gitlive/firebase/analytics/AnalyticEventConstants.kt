package dev.gitlive.firebase.analytics

val FirebaseAnalytics.Event: FirebaseAnalyticsEvents
    get() = FirebaseAnalyticsEvents

object FirebaseAnalyticsEvents {
    const val ADD_PAYMENT_INFO: String = "add_payment_info"
    const val ADD_SHIPPING_INFO: String = "add_shipping_info"
    const val ADD_TO_CART: String = "add_to_cart"
    const val ADD_TO_WISHLIST: String = "add_to_wishlist"
    const val AD_IMPRESSION: String = "ad_impression"
    const val APP_OPEN: String = "app_open"
    const val BEGIN_CHECKOUT: String = "begin_checkout"
    const val CAMPAIGN_DETAILS: String = "campaign_details"
    const val EARN_VIRTUAL_CURRENCY: String = "earn_virtual_currency"
    const val GENERATE_LEAD: String = "generate_lead"
    const val JOIN_GROUP: String = "join_group"
    const val LEVEL_END: String = "level_end"
    const val LEVEL_START: String = "level_start"
    const val LEVEL_UP: String = "level_up"
    const val LOGIN: String = "login"
    const val POST_SCORE: String = "post_score"
    const val PURCHASE: String = "purchase"
    const val REFUND: String = "refund"
    const val REMOVE_FROM_CART: String = "remove_from_cart"
    const val SCREEN_VIEW: String = "screen_view"
    const val SEARCH: String = "search"
    const val SELECT_CONTENT: String = "select_content"
    const val SELECT_ITEM: String = "select_item"
    const val SELECT_PROMOTION: String = "select_promotion"
    const val SHARE: String = "share"
    const val SIGN_UP: String = "sign_up"
    const val SPEND_VIRTUAL_CURRENCY: String = "spend_virtual_currency"
    const val TUTORIAL_BEGIN: String = "tutorial_begin"
    const val TUTORIAL_COMPLETE: String = "tutorial_complete"
    const val UNLOCK_ACHIEVEMENT: String = "unlock_achievement"
    const val VIEW_CART: String = "view_cart"
    const val VIEW_ITEM: String = "view_item"
    const val VIEW_ITEM_LIST: String = "view_item_list"
    const val VIEW_PROMOTION: String = "view_promotion"
    const val VIEW_SEARCH_RESULTS: String = "view_search_results"
}

val FirebaseAnalytics.Param: FirebaseAnalyticsParam
    get() = FirebaseAnalyticsParam

object FirebaseAnalyticsParam {
    const val ACHIEVEMENT_ID: String = "achievement_id"
    const val ACLID: String = "aclid"
    const val AD_FORMAT: String = "ad_format"
    const val AD_PLATFORM: String = "ad_platform"
    const val AD_SOURCE: String = "ad_source"
    const val AD_UNIT_NAME: String = "ad_unit_name"
    const val AFFILIATION: String = "affiliation"
    const val CAMPAIGN: String = "campaign"
    const val CAMPAIGN_ID: String = "campaign_id"
    const val CHARACTER: String = "character"
    const val CONTENT: String = "content"
    const val CONTENT_TYPE: String = "content_type"
    const val COUPON: String = "coupon"
    const val CP1: String = "cp1"
    const val CREATIVE_FORMAT: String = "creative_format"
    const val CREATIVE_NAME: String = "creative_name"
    const val CREATIVE_SLOT: String = "creative_slot"
    const val CURRENCY: String = "currency"
    const val DESTINATION: String = "destination"
    const val DISCOUNT: String = "discount"
    const val END_DATE: String = "end_date"
    const val EXTEND_SESSION: String = "extend_session"
    const val FLIGHT_NUMBER: String = "flight_number"
    const val GROUP_ID: String = "group_id"
    const val INDEX: String = "index"
    const val ITEMS: String = "items"
    const val ITEM_BRAND: String = "item_brand"
    const val ITEM_CATEGORY: String = "item_category"
    const val ITEM_CATEGORY2: String = "item_category2"
    const val ITEM_CATEGORY3: String = "item_category3"
    const val ITEM_CATEGORY4: String = "item_category4"
    const val ITEM_CATEGORY5: String = "item_category5"
    const val ITEM_ID: String = "item_id"
    const val ITEM_LIST_ID: String = "item_list_id"
    const val ITEM_LIST_NAME: String = "item_list_name"
    const val ITEM_NAME: String = "item_name"
    const val ITEM_VARIANT: String = "item_variant"
    const val LEVEL: String = "level"
    const val LEVEL_NAME: String = "level_name"
    const val LOCATION: String = "location"
    const val LOCATION_ID: String = "location_id"
    const val MARKETING_TACTIC: String = "marketing_tactic"
    const val MEDIUM: String = "medium"
    const val METHOD: String = "method"
    const val NUMBER_OF_NIGHTS: String = "number_of_nights"
    const val NUMBER_OF_PASSENGERS: String = "number_of_passengers"
    const val NUMBER_OF_ROOMS: String = "number_of_rooms"
    const val ORIGIN: String = "origin"
    const val PAYMENT_TYPE: String = "payment_type"
    const val PRICE: String = "price"
    const val PROMOTION_ID: String = "promotion_id"
    const val PROMOTION_NAME: String = "promotion_name"
    const val QUANTITY: String = "quantity"
    const val SCORE: String = "score"
    const val SEARCH_TERM: String = "search_term"
    const val SHIPPING: String = "shipping"
    const val SHIPPING_TIER: String = "shipping_tier"
    const val SOURCE: String = "source"
    const val SOURCE_PLATFORM: String = "source_platform"
    const val START_DATE: String = "start_date"
    const val SUCCESS: String = "success"
    const val TAX: String = "tax"
    const val TERM: String = "term"
    const val TRANSACTION_ID: String = "transaction_id"
    const val TRAVEL_CLASS: String = "travel_class"
    const val VALUE: String = "value"
    const val VIRTUAL_CURRENCY_NAME: String = "virtual_currency_name"
}

val FirebaseAnalytics.UserProperty: FirebaseAnalyticsUserProperty
    get() = FirebaseAnalyticsUserProperty

object FirebaseAnalyticsUserProperty {
    const val ALLOW_AD_PERSONALIZATION_SIGNALS: String = "allow_personalized_ads"
    const val SIGN_UP_METHOD: String = "sign_up_method"
}