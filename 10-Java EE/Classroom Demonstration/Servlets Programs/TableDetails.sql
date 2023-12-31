ALTER TABLE [dbo].[Account_Holder_Transaction] DROP CONSTRAINT FK_Account_Holder_Transaction_Account_Holder
GO

ALTER TABLE [dbo].[titleauthor] DROP CONSTRAINT FK__titleauth__au_id__164452B1
GO

ALTER TABLE [dbo].[employee] DROP CONSTRAINT FK__employee__job_id__2D27B809
GO

ALTER TABLE [dbo].[employee] DROP CONSTRAINT FK__employee__pub_id__300424B4
GO

ALTER TABLE [dbo].[pub_info] DROP CONSTRAINT FK__pub_info__pub_id__286302EC
GO

ALTER TABLE [dbo].[titles] DROP CONSTRAINT FK__titles__pub_id__1273C1CD
GO

ALTER TABLE [dbo].[discounts] DROP CONSTRAINT FK__discounts__stor___20C1E124
GO

ALTER TABLE [dbo].[sales] DROP CONSTRAINT FK__sales__stor_id__1BFD2C07
GO

ALTER TABLE [dbo].[roysched] DROP CONSTRAINT FK__roysched__title___1ED998B2
GO

ALTER TABLE [dbo].[sales] DROP CONSTRAINT FK__sales__title_id__1CF15040
GO

ALTER TABLE [dbo].[titleauthor] DROP CONSTRAINT FK__titleauth__title__173876EA
GO

if exists (select * from sysobjects where id = object_id(N'[dbo].[login]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
drop table [dbo].[login]
GO

if exists (select * from sysobjects where id = object_id(N'[dbo].[Account_Holder]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
drop table [dbo].[Account_Holder]
GO

if exists (select * from sysobjects where id = object_id(N'[dbo].[Account_Holder_Transaction]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
drop table [dbo].[Account_Holder_Transaction]
GO

if exists (select * from sysobjects where id = object_id(N'[dbo].[authors]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
drop table [dbo].[authors]
GO

if exists (select * from sysobjects where id = object_id(N'[dbo].[discounts]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
drop table [dbo].[discounts]
GO

if exists (select * from sysobjects where id = object_id(N'[dbo].[employee]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
drop table [dbo].[employee]
GO

if exists (select * from sysobjects where id = object_id(N'[dbo].[jobs]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
drop table [dbo].[jobs]
GO

if exists (select * from sysobjects where id = object_id(N'[dbo].[OracleLex]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
drop table [dbo].[OracleLex]
GO

if exists (select * from sysobjects where id = object_id(N'[dbo].[OracleLexingtonTeam]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
drop table [dbo].[OracleLexingtonTeam]
GO

if exists (select * from sysobjects where id = object_id(N'[dbo].[OracleLexTowers]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
drop table [dbo].[OracleLexTowers]
GO

if exists (select * from sysobjects where id = object_id(N'[dbo].[OurTable]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
drop table [dbo].[OurTable]
GO

if exists (select * from sysobjects where id = object_id(N'[dbo].[pub_info]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
drop table [dbo].[pub_info]
GO

if exists (select * from sysobjects where id = object_id(N'[dbo].[publishers]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
drop table [dbo].[publishers]
GO

if exists (select * from sysobjects where id = object_id(N'[dbo].[registration]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
drop table [dbo].[registration]
GO

if exists (select * from sysobjects where id = object_id(N'[dbo].[roysched]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
drop table [dbo].[roysched]
GO

if exists (select * from sysobjects where id = object_id(N'[dbo].[sales]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
drop table [dbo].[sales]
GO

if exists (select * from sysobjects where id = object_id(N'[dbo].[stores]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
drop table [dbo].[stores]
GO

if exists (select * from sysobjects where id = object_id(N'[dbo].[Student]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
drop table [dbo].[Student]
GO

if exists (select * from sysobjects where id = object_id(N'[dbo].[teamTable]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
drop table [dbo].[teamTable]
GO

if exists (select * from sysobjects where id = object_id(N'[dbo].[titleauthor]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
drop table [dbo].[titleauthor]
GO

if exists (select * from sysobjects where id = object_id(N'[dbo].[titles]') and OBJECTPROPERTY(id, N'IsUserTable') = 1)
drop table [dbo].[titles]
GO

CREATE TABLE [dbo].[login] (
	[cAccount_ID] [char] (10) NOT NULL ,
	[cPin_no] [char] (10) NOT NULL 
) ON [PRIMARY]
GO

CREATE TABLE [dbo].[Account_Holder] (
	[cAccount_id] [char] (10) NOT NULL 
	[mBalance] [money]
) ON [PRIMARY]
GO

CREATE TABLE [dbo].[Account_Holder_Transaction] (
	[cAccount_id] [char] (10) NOT NULL ,
	[dDate_of_transaction] [datetime] NOT NULL ,
	[vcParticulars] [char] (10) NOT NULL ,
	[cCheck_no] [varchar] (50) NOT NULL ,
	[mAmount] [money] NOT NULL 
) ON [PRIMARY]
GO

CREATE TABLE [dbo].[authors] (
	[au_id] [id] NOT NULL ,
	[au_lname] [varchar] (40) NOT NULL ,
	[au_fname] [varchar] (20) NOT NULL ,
	[phone] [char] (12) NOT NULL ,
	[address] [varchar] (40) NULL ,
	[city] [varchar] (20) NULL ,
	[state] [char] (2) NULL ,
	[zip] [char] (5) NULL ,
	[contract] [bit] NOT NULL 
)
GO

CREATE TABLE [dbo].[discounts] (
	[discounttype] [varchar] (40) NOT NULL ,
	[stor_id] [char] (4) NULL ,
	[lowqty] [smallint] NULL ,
	[highqty] [smallint] NULL ,
	[discount] [decimal](4, 2) NOT NULL 
) ON [PRIMARY]
GO

CREATE TABLE [dbo].[employee] (
	[emp_id] [empid] NOT NULL ,
	[fname] [varchar] (20) NOT NULL ,
	[minit] [char] (1) NULL ,
	[lname] [varchar] (30) NOT NULL ,
	[job_id] [smallint] NOT NULL ,
	[job_lvl] [tinyint] NOT NULL ,
	[pub_id] [char] (4) NOT NULL ,
	[hire_date] [datetime] NOT NULL 
)
GO

CREATE TABLE [dbo].[jobs] (
	[job_id] [smallint] IDENTITY (1, 1) NOT NULL ,
	[job_desc] [varchar] (50) NOT NULL ,
	[min_lvl] [tinyint] NOT NULL ,
	[max_lvl] [tinyint] NOT NULL 
)
GO

CREATE TABLE [dbo].[OracleLex] (
	[lastname] [varchar] (150) NULL ,
	[accounttype] [varchar] (150) NULL ,
	[regnId] [int] NOT NULL ,
	[annualincome] [float] NULL ,
	[firstname] [varchar] (150) NULL ,
	[address] [varchar] (150) NULL ,
	[phoneno] [varchar] (150) NULL ,
	[WLS_TEMP] [int] NULL 
)
GO

CREATE TABLE [dbo].[OracleLexingtonTeam] (
	[lastname] [varchar] (150) NULL ,
	[accounttype] [varchar] (150) NULL ,
	[regnId] [int] NOT NULL ,
	[annualincome] [float] NULL ,
	[phoneno] [varchar] (150) NULL ,
	[address] [varchar] (150) NULL ,
	[firstname] [varchar] (150) NULL ,
	[WLS_TEMP] [int] NULL 
)
GO

CREATE TABLE [dbo].[OracleLexTowers] (
	[lastname] [varchar] (150) NULL ,
	[accounttype] [varchar] (150) NULL ,
	[regnId] [int] NOT NULL ,
	[annualincome] [float] NULL ,
	[phoneno] [varchar] (150) NULL ,
	[address] [varchar] (150) NULL ,
	[firstname] [varchar] (150) NULL ,
	[WLS_TEMP] [int] NULL 
)
GO

CREATE TABLE [dbo].[OurTable] (
	[lastname] [varchar] (150) NULL ,
	[accounttype] [varchar] (150) NULL ,
	[regnId] [int] NOT NULL ,
	[annualincome] [float] NULL ,
	[firstname] [varchar] (150) NULL ,
	[address] [varchar] (150) NULL ,
	[phoneno] [varchar] (150) NULL ,
	[WLS_TEMP] [int] NULL 
)
GO

CREATE TABLE [dbo].[pub_info] (
	[pub_id] [char] (4) NOT NULL ,
	[logo] [image] NULL ,
	[pr_info] [text] NULL 
)
GO

CREATE TABLE [dbo].[publishers] (
	[pub_id] [char] (4) NOT NULL ,
	[pub_name] [varchar] (40) NULL ,
	[city] [varchar] (20) NULL ,
	[state] [char] (2) NULL ,
	[country] [varchar] (30) NULL 
)
GO

CREATE TABLE [dbo].[registration] (
	[cFirst_name] [nchar] (20) NULL ,
	[cLast_name] [nchar] (20) NULL ,
	[cAddress] [nchar] (20) NULL ,
	[cAccount_type] [nchar] (20) NULL ,
	[mAnnual_income] [int] NULL ,
	[cPhone_no] [nchar] (20) NULL 
) ON [PRIMARY]
GO

CREATE TABLE [dbo].[roysched] (
	[title_id] [tid] NOT NULL ,
	[lorange] [int] NULL ,
	[hirange] [int] NULL ,
	[royalty] [int] NULL 
) ON [PRIMARY]
GO

CREATE TABLE [dbo].[sales] (
	[stor_id] [char] (4) NOT NULL ,
	[ord_num] [varchar] (20) NOT NULL ,
	[ord_date] [datetime] NOT NULL ,
	[qty] [smallint] NOT NULL ,
	[payterms] [varchar] (12) NOT NULL ,
	[title_id] [tid] NOT NULL 
)
GO

CREATE TABLE [dbo].[stores] (
	[stor_id] [char] (4) NOT NULL ,
	[stor_name] [varchar] (40) NULL ,
	[stor_address] [varchar] (40) NULL ,
	[city] [varchar] (20) NULL ,
	[state] [char] (2) NULL ,
	[zip] [char] (5) NULL 
)
GO

CREATE TABLE [dbo].[Student] (
	[Sid] [numeric](18, 0) NOT NULL ,
	[Sname] [varchar] (50) NOT NULL ,
	[Saddress] [varchar] (50) NOT NULL 
) ON [PRIMARY]
GO

CREATE TABLE [dbo].[teamTable] (
	[lastname] [varchar] (150) NULL ,
	[accounttype] [varchar] (150) NULL ,
	[regnId] [int] NOT NULL ,
	[annualincome] [float] NULL ,
	[firstname] [varchar] (150) NULL ,
	[address] [varchar] (150) NULL ,
	[phoneno] [varchar] (150) NULL ,
	[WLS_TEMP] [int] NULL 
)
GO

CREATE TABLE [dbo].[titleauthor] (
	[au_id] [id] NOT NULL ,
	[title_id] [tid] NOT NULL ,
	[au_ord] [tinyint] NULL ,
	[royaltyper] [int] NULL 
)
GO

CREATE TABLE [dbo].[titles] (
	[title_id] [tid] NOT NULL ,
	[title] [varchar] (80) NOT NULL ,
	[type] [char] (12) NOT NULL ,
	[pub_id] [char] (4) NULL ,
	[price] [money] NULL ,
	[advance] [money] NULL ,
	[royalty] [int] NULL ,
	[ytd_sales] [int] NULL ,
	[notes] [varchar] (200) NULL ,
	[pubdate] [datetime] NOT NULL 
)
GO

