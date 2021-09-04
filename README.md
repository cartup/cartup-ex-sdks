# cartup-ex-sdks

CartUp AI SDK Documentation - Events and recommendations
Version 1.0 - date 02/09/2021

Initialize Cartup IOS SDK 

Import Cartup into AppDelegate.swift, and initialize Cartup within application:
Initialize cartup Library

import Cartup
cartup.init(orgname: String, orgid: String, secretkey: String, domain: String)

Parameter:
orgname: “YOUR_ORGNAME” Example: “GreenWallet”
Orgid: “YOUR_ORGID”
secretkey: “YOUR_SECRET_KEY”
Domain: “YOUR_DOMNAIN” Example: “https://Greenwallet.com”
 
Get Event Handler
Function to get event Handler. Event handler is used to send the events to track:

cartup.getEventHandler() -> EventHandler

 
Send Tracking Events 
Function to send tracking events. The function sends user browsing events. There are multiple labels based on page type for example  (product view/cart page etc)

cartup.sendtrackingdata(labelName: String, parameters: pd) -> Void
 
Following are the labelNames:
    
	labelname: productview - send event for product page
	Parameters:
Dictionary<String,Any> = [
"uid_s":"YOUR_USER_ID"
    	"productname_s":"PRODUCT_NAME",
    	"sku_s":"PRODUCT_SKU",
    	"price_d":"PRODUCT_PRICE",
	]
    
    
labelname : addtocart - send event when user adds to cart
Parameters:
Dictionary<String, Any> = [
   	"uid_s":"YOUR_USER_ID"
    	"productname_s":"PRODUCT_NAME",
    	"sku_s":"PRODUCT_SKU",
    	"price_d":"PRODUCT_PRICE"
   	 
	]
    
labelname: viewcart - send event when user views cart
Parameters:
Dictionary<String, Any> = [
 "uid_s":"YOUR_USER_ID"   	 
"productname_ss":["ARRAY_PRODUCT_NAME"],
"sku_ss":["ARRAY_PRODUCT_SKU"],
"price_ds":["ARRAY_PRODUCT_PRICE"],
"quantity_ls":["ARRAY_PRODUCT_QUANTITY"],
"Totalamount_d": "TOTAL_AMOUNT"
	]

labelname: transaction  - send event when user initiates transaction
Parameters:    
	Dictionary<String, Any> = [
 	"uid_s":"YOUR_USER_ID"   	 
"productname_ss":["ARRAY_PRODUCT_NAME"],
"sku_ss":["ARRAY_PRODUCT_SKU"],
"price_ds":["ARRAY_PRODUCT_PRICE"],
"quantity_ls":["ARRAY_PRODUCT_QUANTITY"],
"Totalamount_d": "TOTAL_AMOUNT"
	]


labelname: addtowishlist - send event when user add to the wish list
Parameters:     
	Dictionary<String, Any> = [
    	"uid_s":"YOUR_USER_ID"
    	"productname_s":"PRODUCT_NAME",
    	"sku_s":"PRODUCT_SKU",
    	"price_d":"PRODUCT_PRICE"

	]
    
labelname: widgetLoad - send event when widget is loaded 
Parameters:
	Dictionary<String, Any> = [
"uid_s":"YOUR_USER_ID",
    	"widgetId_s":"WIDGET_ID"
	]


labelname: widgetClick - send event when widget product is clicked
Parameters:    
	Dictionary<String, Any> = [
    	"uid_s":"YOUR_USER_ID",
    	"widgetId_s":"WIDGET_ID",
"productname_s":"PRODUCT_NAME",
    	"sku_s":"PRODUCT_SKU",
    	"price_d":"PRODUCT_PRICE"
	]


labelname: widgetView  - send event when widget is viewed
Parameters:     
	Dictionary<String, Any> = [
    	"uid_s":"YOUR_USER_ID",
    	"widgetId_s":"WIDGET_ID"
	]


labelname: signup  - send event when user signup
Parameters:
	Dictionary<String, Any> = [
    	"uid_s":"YOUR_USER_ID"
	]

labelname: signout - send event when user signout
Parameters:    
	Dictionary<String, Any> = [
    	"uid_s":"YOUR_USER_ID"
	]


labelname: search - send event when user search a keyword
Parameters:   
	Dictionary<String, Any> = [
"uid_s":"YOUR_USER_ID",
    	"Keyword_s": "USER_KEYWORD"
	]



labelname: review - send event when user search writes a review
Parameters: 
Dictionary<String, Any> = [
"uid_s":"YOUR_USER_ID",
"reviewtext_txt":"REVIEW TEXT",
    	"productname_s":"PRODUCT_NAME",
    	"sku_s":"PRODUCT_SKU",
    	"price_d":"PRODUCT_PRICE"
	]


 
Get Recommendation Handler
Function to get Recommendation Handler. Recommendation handler is used to get recommendations.

cartup.getRecommendationHandler() -> RecomendationHandler


Get Recommendation Products
Public func getRecommendations(labelName: String, parameters:Dictionary<String, Any>,_ completion: @escaping (Result<(Data, URLResponse), Error>) -> Void)

Completion handler receives the products in json.

Parameters:

Dictionary<String, Any> = [
    	"divisionId": "RECOMMENDATION_DIVISION_ID"],
    	"uid_s":"YOUR_USER_ID",
    	"Pname"<OPTIONAL>: "PRODUCT_NAME",
]






