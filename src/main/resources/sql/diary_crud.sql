insert into study.diary(title, content, study_date) values (
	'콤포넌트 임무 분장',
	'3 가지 종류의 콤포넌트들 간에 정해진 임무가 무엇인지 학습하였다.',
	'2023-01-13'
);

use study;
select * from diary order by study_date desc;

select * from diary where sno = 8;