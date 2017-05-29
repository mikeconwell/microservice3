create table if not exists advertisers (
	 id identity primary key
	,name varchar(512) not null
	,contact varchar(255) null
	,credit_limit decimal not null default(0)
	);