package space.bumtiger.study.repository;

import space.bumtiger.study.domain.Diary;

public interface DiaryRepository {
	int save(Diary diary);
}
