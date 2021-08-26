DROP TABLE IF EXISTS PRICES;
CREATE TABLE PRICES (

	BRAND_ID INTEGER NOT NULL,
	PRODUCT_ID INTEGER NOT NULL,
	START_DATE TIMESTAMP(3) NOT NULL,
	END_DATE TIMESTAMP(3) NOT NULL,
	PRICE_LIST INTEGER NOT NULL,
	PRIORITY INTEGER NOT NULL,
	PRICE FLOAT NOT NULL,
	CURR VARCHAR(255) NOT NULL,
	LAST_UPDATE TIMESTAMP(3) NOT NULL,
	LAST_UPDATE_BY VARCHAR(255) NOT NULL,
	CONSTRAINT PK_PRICES PRIMARY KEY (BRAND_ID, PRODUCT_ID, START_DATE, END_DATE, PRICE_LIST)
);