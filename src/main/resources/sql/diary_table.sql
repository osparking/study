CREATE TABLE study.diary (
	sno INT UNSIGNED auto_increment NOT NULL COMMENT 'diary serial number',
	title varchar(100) DEFAULT '학습 주제' NULL COMMENT '학습한 주제',
	content TEXT(2000) NULL COMMENT '학습한 내용에 대한 상세한 설명',
	study_date date NULL COMMENT '학습한 날짜',
	duration_min SMALLINT UNSIGNED DEFAULT 120 NULL COMMENT '학습한 시간(분 단위)',
	CONSTRAINT diary_study_pk PRIMARY KEY (sno)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_unicode_ci;